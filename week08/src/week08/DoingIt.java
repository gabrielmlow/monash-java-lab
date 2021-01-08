package week08;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by shuxford on 25/12/2015.
 */
public class DoingIt {
    Window myWindow;

    //IMPORTANT - Window class refactored to instantiate 1 DoingIt object for all Do It button clicks
    //IMPORTANT - not instantiating 1 DoingIt object per Do It button click
    //IMPORTANT - This allows the class level variable "step" to persist between Do It button clicks

    int step = 1; //for method hierarchy example
    int goodCounter = 0; //for countExecutions example


    public void doIt(Window win){
        myWindow = win;

        // Lab 1 Test
        System.out.println(daySuffix("21")); // 21st
        System.out.println(daySuffix("11")); // 11th
        System.out.println(daySuffix("2")); // 2nd
        System.out.println(daySuffix("12")); // 12th
        System.out.println(daySuffix("3")); // 3rd
        System.out.println(daySuffix("13")); // 13th
        System.out.println(daySuffix("abc12")); // null
        System.out.println(daySuffix("34")); // null

        // Lab 2 Test
        System.out.println(calcSeries(8, 4)); // 2.25
        System.out.println(calcSeries(8, -4)); // 1.0
        System.out.println(calcSeries(-8, 4)); // -0.25
        System.out.println(calcSeries(-8, -4)); // 1.0

        // Lab 3 Test
        int[] ars = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(sumPrevious(ars))); // [1, 3, 6, 10, 15]
//        int[] ars = {-1, 2, 3, -4, 5};
//        System.out.println(Arrays.toString(sumPrevious(ars))); // [-1, 1, 4, 0, 5]
//        int[] ars = {};
//        System.out.println(Arrays.toString(sumPrevious(ars))); // []

        // Lab 4 Test
        System.out.println(backwardNumber(1234567)); // 642
        System.out.println(backwardNumber(13579)); // 0
        System.out.println(backwardNumber(2468)); // 8642
        System.out.println(backwardNumber(00000)); // 0
    }


    // Lab 1
    private String daySuffix(String day) {
        double dayDouble;
        int dayInt;
        String suffix;
        String dayName = null;

        // Check if day only has numbers
        if(isNumeric(day)) {
            dayDouble = Double.parseDouble(day);
            dayDouble = Math.round(dayDouble);
            dayInt = (int) dayDouble;

            if(dayInt > 0 && dayInt < 32) {
                switch(dayInt) {
                    case 1:
                    case 21:
                    case 31:
                        suffix = "st";
                        break;
                    case 2:
                    case 22:
                        suffix = "nd";
                        break;
                    case 3:
                    case 23:
                        suffix = "rd";
                        break;
                    default:
                        suffix = "th";
                }

                dayName = Integer.toString(dayInt) + suffix;

            }
        }

        return dayName;
    }


    // Lab 2
    private double calcSeries(int x, int n) {
        double y = 1;

        if(n > 0) {
            for(int i=1; i<=n; i++) {
                y += Math.pow(i, 2) / (i*x);
            }
        }


        return y;
    }


    // Lab 3
    private int[] sumPrevious(int[] numbers) {
        int[] previousSums = new int[numbers.length];
        int sum = 0;

        for(int i=0; i<numbers.length; i++) {
            sum += numbers[i];
            previousSums[i] = sum;
        }

        return previousSums;
    }


    // Lab 4
    private int backwardNumber(int number) {

        int numberBackwards = 0;
        int lastDigit;

        // Find and count even numbers
        while(number != 0) {
            lastDigit = number % 10;
            if(lastDigit % 2 == 0) {
                numberBackwards = (numberBackwards * 10) + lastDigit;
            }
            number = number / 10;
        }

        return numberBackwards;
    }


    //WORKSHOP CODE for you to play with =======================================
    private void caller(){
        double number1 = 7.0;

        myWindow.clearOut();
        myWindow.writeOutLine("Before call to calledNoReturn()");
        calledNoReturn(number1 + 10.0, Math.pow(number1, 2));
        myWindow.writeOutLine("After call to calledNoReturn()");
    }

    private void calledNoReturn(double n1, double n2){
        double sum = 0;
        sum = n1 + n2;
        myWindow.writeOutLine("calledNoReturn begins executing");
        myWindow.writeOutLine("sum of formal parameters is: " + sum);
        myWindow.writeOutLine("calledNoReturn finishes executing");
    }

    private void AnotherCaller(){
        double number1 = 7.0;

        myWindow.clearOut();
        myWindow.writeOutLine("Before call to calledReturn()");
        myWindow.writeOutLine(100.0 + calledReturn(number1 + 10.0, Math.pow(number1, 2)));
        myWindow.writeOutLine("After call to calledReturn()");
    }

    private double calledReturn(double n1, double n2){
        double sum = 0;
        sum = n1 + n2;
        myWindow.writeOutLine("calledReturn begins executing");
        myWindow.writeOutLine("about to execute return statement");
        return sum;
        //myWindow.writeOutLine("calledReturn finishes executing"); unreachable statement
    }


    //===================================================`=======================
    //METHOD HIERARCHY - EXAMPLE
    private void orchestratingMethod(){ //no display dependency
        String instructions = "";
        instructions += "Enter a comma separated list like: \n";
        instructions += "start table, end table, start range, end range, multiplication symbol.\n";
        instructions += "Then click the Do It! button again.";


        if (step == 1) { //step is class level
            prompt(instructions);
            step = 2;
        }
        else if (step == 2) {
            displayOutput(process(getInput())); //call sequence 1. getInput 2. process 3. displayOutput
            step = -1; //end step sequence
        }
        else{
            //do nothing, step sequence has finished
        }
    }

    private void prompt(String promptToDisplay){
        myWindow.clearOut();
        myWindow.clearIn();

        myWindow.writeOutLine(promptToDisplay);
    }

    private String[] getInput(){
        return myWindow.readIn().split("\\s*,\\s*"); //splits into tokens
    }

    private String process(String[] splitInput){ //no display dependency
        int startTable, stopTable, from, to;
        String symbol;
        String result = "";

        //exception handling should start here
        startTable = Integer.parseInt(splitInput[0]);
        stopTable = Integer.parseInt(splitInput[1]);
        from = Integer.parseInt(splitInput[2]);
        to = Integer.parseInt(splitInput[3]);
        //exception handling should stop here

        symbol = splitInput[4];


        for (int i = startTable; i <= stopTable; i++){
            result += ">>>" + i + " times table\n";
            result += timesTable(i, from, to, symbol) + "\n";
        }

        return result;
    }

    private void displayOutput(String toDisplay){
        myWindow.clearOut();
        myWindow.writeOutLine(toDisplay);
    }

    private String timesTable(int tableNumber, int from, int to, String timesSymbol){
        String table = "";

        for (int i = from; i <= to; i++){
            table += String.format("%3d %s %3d = %3d\n", i, timesSymbol, tableNumber, i * tableNumber);
        }

        return table;
    }
    //==========================================================================


    // =========================================================================
    // UTILITIES ===============================================================
    // =========================================================================
    private boolean isNumeric(String str){
        return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
    }

}
