package week07;

import java.util.ArrayList;

/**
 * Created by shuxford on 25/12/2015.
 */
public class DoingIt {
    Window myWindow;

    //class level variables here

    public void doIt(Window win){
        myWindow = win;

        //whileForPaste01();
        //whileForPaste02();
        //whileForPaste03();
        //whileForPaste04();

//        forForPaste01();
        //enhancedForForPaste01();
        //videoWhileLoopInfiniteLoop01();

        //I'm leaving you to code and organise your Lab Exercise methods from now on
        // Tutorial


        // Lab Exercises
//        lab1and2();
//        lab1and2();
//        lab3();
//        lab4();
//        lab5();
//        lab6();
//        test01();
        test01();
    }



    //LAB EXERCISES for you to code ===========================================

    public int sumSubValues(){
        int a = 2;
        int b = 3;
        int c = 7;
        int max = Math.max(Math.max(a, b), c);
        System.out.println(max);
        return max;

    }


    private void lab1and2() {
        int die1, die2, counter;
        int grandCounter = 0;
        int maxRolls = 100;
        int numOfRolls = 0;
        double average;

        while(numOfRolls < maxRolls) {
            die1 = (int)(Math.random()*6) + 1;
            die2 = (int)(Math.random()*6) + 1;
            counter = 1;

            while(die1 != die2) {
//                System.out.println("1: " + die1 + ", 2:" + die2);
                die1 = (int)(Math.random()*6) + 1;
                die2 = (int)(Math.random()*6) + 1;
                counter++;
            }
//            System.out.println(counter); // for checking
            grandCounter += counter;
            numOfRolls++;
        }

        average = (grandCounter * 1.0) / maxRolls;
        System.out.println("It will take a total of " + grandCounter + " rolls to get two dice with the same number twice.");
        System.out.println("The long term average number of rolls required is " + average);

        // The probability of getting a specific number twice in a row is (1/6 x 1/6 = 1/36)
        // The probability of getting ANY NUMBER twice in a row is (6 x 1/36 = 6/36)
        // Hence, it will take around (100/(6/36)=600) rolls to get the any number twice in a row for a 100 times
        // Therefore, it agrees with the probability analysis
    }

    private void lab3() {
        String[] ar = {"Today", "is", "Monday"};
//        String[] ar = {};
//        String[] ar = {"Yesterday", "was", "Monday"};
        String search = "is";
        boolean isFound = false;

        int index = 0;

        while(index < ar.length) {
            if(search.equals(ar[index])) {
                isFound = true;
                break;
            }
            index++;
        }

        String result = (!isFound) ? "String does not exist in array" : "String is found in array at index " + index;
        System.out.println(result);
    }


    private void lab4() {

        int num;
        int counter = 0;
        int total = 0;
        int maxRanNum = 100;
        double average;
        boolean found = false;

        do {
            num = getRandom(0, 1000);

            if(num > 0 && num % 2 == 0) {
                total += num;
                counter += 1;
//                System.out.println(num); // for checking purpose
            }

            if (counter == maxRanNum) {
                found =  true;
            }
        } while(!found);

        average = (total * 1.0) / maxRanNum;

        System.out.println("The average of the first 100 even positive random numbers is: " + average);
    }


    private void test01(){
        double[] ar = {};
        AveragePosOdd(ar);

        int[] arL1= {1,2,3,4};
        int[] arL2= {3,4,6,7};

        System.out.println(diffArList(arL1, arL2));
        for (int element: arL2) {
            System.out.println(element);
        }

    }

    private void AveragePosOdd(double[] numbers){

        double total = 0;
        int counter = 0;

        for(double number: numbers) {
            int intNumber = (int) number;
            if((intNumber % 2 != 0) && (intNumber >= 0)) {
                total += number;
                counter++;
            }
        }

        if(counter > 0) {
            double average = total / counter;
            System.out.println(average);
        } else {
            System.out.println("ERROR");
        }
    }

    private static ArrayList <java.lang.Integer> diffArList(int[] arL1, int[] arL2) {

        ArrayList<Integer> commonIntegers = new ArrayList<Integer>();

        for(int arL1Num: arL1) {
            for(int arL2Num: arL2) {

                if (arL1Num == arL2Num) {
                    commonIntegers.add(arL1Num);
                    break;
                }
            }
        }

        return commonIntegers;
    }

    private void lab6() {
        Integer[] input = {2, 6, 3, 9, 0};

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        if(input.length > 2) {

            for(int i = 0; i < input.length; i++) {
                if(input[i] > max) {
                    max = input[i];
                }
            }

            for(int i = 0; i < input.length; i++) {
                if(input[i] > secondMax && input[i] != max) {
                    secondMax = input[i];
                }
            }

            System.out.println("The second highest value is: " + secondMax);

        } else {
            System.out.println("Error: Array length must be more than 2");
        }

    }

    //I'm leaving you to code and organise your Lab Exercise methods from now on


    private void tut1() {
        // first one no curly bracket, only first line will be executed
        // second one same as first one
        // third one korek
        // fourth one have semicolon after paranthesis
    }

    private void tut2() {
//        int i = 0;
//
//        while(i < someArray.length) {
//            System.out.println(someArray[i]);
//            i++;
//        }
    }

    private void tut3() {
        // modify before looping the inner loop
        // only modify during the inner loop execution
        // only modify after inner loop is executed
    }

    private void tut4() {
        // you don't need to loop through all elements
        // you don't know how many times it needs to be looped
//        n = 0;
//
//        while(ar[n] != something) {
//            n++;
//        }

        // Lecturer's code below (incomplete)
//        int[] array = {2, 4, 5, 7, 5, 8, 10};
//        int target = 10;
//        int i = 0;
//        int elem = array[i];
//
//        if(array.length > 0) {
//            while(elem!=target && i < array.length) {
//                i++;
//                elem = array[i];
//            }
//            if(i < array.length) {
//                System.out.println("Target value " + target + " found at index " + i);
//            } else {
//                System.out.println("Target value " + target + " found at index " + i);
//            }
//
//        } else {
//            System.out.println("Array is empty!");
//        }
    }

    private void tut5() {
        int j = 0;

//        for(int i = 0; i < years.length; i++) {
//
//            if(years[i] == isLeapYear()) {
//                i++;
//
//                if(j==10) {
//                    leapYears.add(years[i]);
//                    j=0;
//                }
//            }
//        }
    }

    private void tut6() {
        // while loop, you don't you don't know how many times to loop
//        Random rand = new Random();
//        int counter = 0;
//        int number = rand.nextInt();
//        if (number > 0) {
//            counter++;
//            System.out.println(number);
//        }
//        while (number>=0 && counter < 10) {
//            number = rand.nextInt();
//            if (number > 0) {
//                counter++;
//                System.out.println(number);
//            }
//        }

        // do while executes the block first before checking the condition
//        do {
//            number = rand.nextInt();
//            if (number > 0) {
//                counter++;
//                System.out.println(number);
//            }
//        }
//        while(number>=0 && counter < 10);
    }

    //WORKSHOP CODE for you to play with ======================================
    private void whileForPaste01(){
//        int count = 0, total = 0;
//
//        while (total < 1000){
//            total += getRandom(1, 6); //see utility methods below
//            count++;
//        }
//
//        myWindow.clearOut();
//        myWindow.writeOutLine("Count: " + count);
    }

    private void whileForPaste02(){
        int counter;
        int limit = 100;
        final int SENTINEL = -1 + (int) (Math.random() * 12); //[-1 .. 10]
        int  value = 0;
        boolean condition = false;

        //use a for loop for best style
        counter = 0; // or 1 depending on statements in loop block
        while (counter <= limit){ //or < or >= or > (== and != are risky, they could be skipped over)

            //process

            counter++; //or some other incrementing/decrementing
        }

        //get initial value from source
        while(value != SENTINEL){ //!value.equals(SENTINEL) for Strings

            //process input

            //get next value from source
        }

        //perform potential condition changing calculations with initial values
        while (condition){

            //process

            //perform potential condition changing calculations with updated values
        }
    }

    private void whileForPaste03(){
        final int SENTINEL = -1;
        int input = -1 + (int) (Math.random() * 12);
        myWindow.clearOut();

        while (input != SENTINEL)
            myWindow.writeOutLine(input);
            input = -1 + (int) (Math.random() * 12);

        while (input != SENTINEL)
            myWindow.writeOutLine(input);
        input = -1 + (int) (Math.random() * 12);

        while (input != SENTINEL) {
            myWindow.writeOutLine(input);
            input = -1 + (int) (Math.random() * 12);
        };

        while (input != SENTINEL); {
            myWindow.writeOutLine(input);
            input = -1 + (int) (Math.random() * 12);
        }
    }

    private void whileForPaste04(){
        int[] someArray = {1, 2, 3, 4, 5};
        int i;

        i = 0;
        while (i < someArray.length){   // takes care of an empty array
                                        //but not a null array
            // process the ith element using someArray[i] to access its value

            i++;
        }
    }


    private void forForPaste01(){
        final int MULTIPLIER = 7;
        int result;

        myWindow.clearOut();
        for (int i = 10; i >= 1; i--){
            result = i * MULTIPLIER;
            myWindow.writeOutLine("7 X " + i + " = " + result);
        }
    }

    private void enhancedForForPaste01(){
        int [] bigScreenTVMonthlyUnitsSold = {435, 151, 120, 134, 199, 201, 312, 147, 107, 127, 115, 258};
        int monthCount = 0;

        for (int elem : bigScreenTVMonthlyUnitsSold){
            if (elem >= 200)
                monthCount++;

        }

        myWindow.clearOut();
        myWindow.writeOutLine("Number of months: " + monthCount);
    }

    private void videoWhileLoopInfiniteLoop01(){

        int i = 1;

        while (i != 10){
            //process

            i = i + 2;
        }

    }


    //==========================================================================
    // UTILITIES ===============================================================
    //==========================================================================
    private static boolean isNumeric(String str){
        return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
    }

    private static int getRandom(int n1, int n2){
        int retVal = 0;

        retVal = n1 + (int) Math.floor(Math.random() * (n2 - n1 + 1));

        return retVal;
    }

}
