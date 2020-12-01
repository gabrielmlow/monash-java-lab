package week04;

/**
 * Created by shuxford
 */
public class DoingIt {
    Window myWindow;

    public void doIt(Window win){
        myWindow = win;
        myWindow.clearOut();

        lab1();
        lab2();
        lab3();
        lab4();
        lab5();
        lab6();
        lab7();
        lab8();

//        assignmentIsAnOperator();
//        arithmeticOperations();
//        equalityRelationalOperators();
//        equalityRelationalOperators2();
//        logicalOperators();
//        redundantSyntax();
//        blockScopeTest();
    }

    //LAB EXERCISES for you to code
    private void lab1(){
        int n = 20;
        boolean flag = (n % 2 == 0);
        myWindow.writeOutLine(n + " expects true: " + flag);

        n = 21;
        flag = (n % 2 == 0);
        myWindow.writeOutLine(n + " expects false: " + flag);

        n = -10;
        flag = (n % 2 == 0);
        myWindow.writeOutLine(n + " expects true: " + flag);

        n = -11;
        flag = (n % 2 == 0);
        myWindow.writeOutLine(n + " expects false: " + flag);
    }


    private void lab2(){
        int n = 20;
        boolean flag = (n>0 && n%2==0);
        myWindow.writeOutLine(n + " expects true: " + flag);

        n = 21;
        flag = (n>0 && n%2==0);
        myWindow.writeOutLine(n + " expects false: " + flag);

        n = -10;
        flag = (n>0 && n%2==0);
        myWindow.writeOutLine(n + " expects false: " + flag);

        n = -11;
        flag = (n>0 && n%2==0);
        myWindow.writeOutLine(n + " expects false: " + flag);
    }


    private void lab3(){
        int n = 70;
        boolean b1 = (n>=-10 && n<=200);
        boolean b2 = ((n>=60 && n<=80) && (n%2==0));
        boolean flag = b1 && b2;
        myWindow.writeOutLine(n + " expects true: " + flag);

        n = -10;
        b1 = (n>=-10 && n<=200);
        b2 = ((n>=60 && n<=80) && (n%2==0));
        flag = b1 && b2;
        myWindow.writeOutLine(n + " expects false: " + flag);

        n = 200;
        b1 = (n>=-10 && n<=200);
        b2 = ((n>=60 && n<=80) && (n%2==0));
        flag = b1 && b2;
        myWindow.writeOutLine(n + " expects false: " + flag);

        n = -9;
        b1 = (n>=-10 && n<=200);
        b2 = ((n>=60 && n<=80) && (n%2==0));
        flag = b1 && b2;
        myWindow.writeOutLine(n + " expects false: " + flag);

        n = -11;
        b1 = (n>=-10 && n<=200);
        b2 = ((n>=60 && n<=80) && (n%2==0));
        flag = b1 && b2;
        myWindow.writeOutLine(n + " expects false: " + flag);

        n = 201;
        b1 = (n>=-10 && n<=200);
        b2 = ((n>=60 && n<=80) && (n%2==0));
        flag = b1 && b2;
        myWindow.writeOutLine(n + " expects false: " + flag);

        n = 199;
        b1 = (n>=-10 && n<=200);
        b2 = ((n>=60 && n<=80) && (n%2==0));
        flag = b1 && b2;
        myWindow.writeOutLine(n + " expects false: " + flag);

        n = 59;
        b1 = (n>=-10 && n<=200);
        b2 = ((n>=60 && n<=80) && (n%2==0));
        flag = b1 && b2;
        myWindow.writeOutLine(n + " expects false: " + flag);

        n = 60;
        b1 = (n>=-10 && n<=200);
        b2 = ((n>=60 && n<=80) && (n%2==0));
        flag = b1 && b2;
        myWindow.writeOutLine(n + " expects true: " + flag);

        n = 61;
        b1 = (n>=-10 && n<=200);
        b2 = ((n>=60 && n<=80) && (n%2==0));
        flag = b1 && b2;
        myWindow.writeOutLine(n + " expects false: " + flag);

        n = 79;
        b1 = (n>=-10 && n<=200);
        b2 = ((n>=60 && n<=80) && (n%2==0));
        flag = b1 && b2;
        myWindow.writeOutLine(n + " expects false: " + flag);

        n = 80;
        b1 = (n>=-10 && n<=200);
        b2 = ((n>=60 && n<=80) && (n%2==0));
        flag = b1 && b2;
        myWindow.writeOutLine(n + " expects true: " + flag);

        n = 81;
        b1 = (n>=-10 && n<=200);
        b2 = ((n>=60 && n<=80) && (n%2==0));
        flag = b1 && b2;
        myWindow.writeOutLine(n + " expects false: " + flag);
    }


    private void lab4(){
        String userInput = "FIT2095 week 1";
        boolean b1 = userInput.contains("FIT");
        boolean b2 = userInput.contains("2095");
        boolean b3 = userInput.contains("week");
        boolean flag = b1 || b2 || b3;
        myWindow.writeOutLine(userInput + " contains expects true: " + flag);

        userInput = "FIT2095 day 1";
        b1 = userInput.contains("FIT");
        b2 = userInput.contains("2095");
        b3 = userInput.contains("week");
        flag = b1 || b2 || b3;
        myWindow.writeOutLine(userInput + " contains expects true: " + flag);

        userInput = "FIT2097 day 1";
        b1 = userInput.contains("FIT");
        b2 = userInput.contains("2095");
        b3 = userInput.contains("week");
        flag = b1 || b2 || b3;
        myWindow.writeOutLine(userInput + " contains expects true: " + flag);

        userInput = "MAT2097 day 1";
        b1 = userInput.contains("FIT");
        b2 = userInput.contains("2095");
        b3 = userInput.contains("week");
        flag = b1 || b2 || b3;
        myWindow.writeOutLine(userInput + " contains expects false: " + flag);
    }


    private void lab5(){
        String userInput = "FIT2095 week 1";
        boolean flag = userInput.contains("FIT2095");
        myWindow.writeOutLine(userInput + " contains expects true: " + flag);

        userInput = "FIT2096 week 1";
        flag = userInput.contains("FIT2095");
        myWindow.writeOutLine(userInput + " contains expects false: " + flag);
    }


    private void lab6(){
        int year = 2004;
        boolean b1 = year % 4 == 0;
        boolean b2 = year % 100 == 0;
        boolean b3 = year % 400 == 0;
        boolean condition1 = b1 && !b2;
        boolean condition2 = b1 && b2 && b3;
        boolean flag = condition1 || condition2;
        myWindow.writeOutLine("The year " + year + " is a leap year: " + flag);

        year = 2005;
        b1 = year % 4 == 0;
        b2 = year % 100 == 0;
        b3 = year % 400 == 0;
        condition1 = b1 && !b2;
        condition2 = b1 && b2 && b3;
        flag = condition1 || condition2;
        myWindow.writeOutLine("The year " + year + " is a leap year: " + flag);

        year = 2006;
        b1 = year % 4 == 0;
        b2 = year % 100 == 0;
        b3 = year % 400 == 0;
        condition1 = b1 && !b2;
        condition2 = b1 && b2 && b3;
        flag = condition1 || condition2;
        myWindow.writeOutLine("The year " + year + " is a leap year: " + flag);

        year = 2007;
        b1 = year % 4 == 0;
        b2 = year % 100 == 0;
        b3 = year % 400 == 0;
        condition1 = b1 && !b2;
        condition2 = b1 && b2 && b3;
        flag = condition1 || condition2;
        myWindow.writeOutLine("The year " + year + " is a leap year: " + flag);

        year = 2008;
        b1 = year % 4 == 0;
        b2 = year % 100 == 0;
        b3 = year % 400 == 0;
        condition1 = b1 && !b2;
        condition2 = b1 && b2 && b3;
        flag = condition1 || condition2;
        myWindow.writeOutLine("The year " + year + " is a leap year: " + flag);
    }

    private void lab7(){
        boolean b1 = true;
        boolean b2 = false;

        boolean temp = b1; // Stores b1 value

        b1 = b2; // b1 gets b2 value
        b2 = temp; // b2 gets b1 value

        myWindow.writeOutLine("the value of b1: " + b1);
        myWindow.writeOutLine("the value of b2: " + b2);
    }


    private void lab8(){
        double a = 2, b = 5, c = -3;
        double discriminant = Math.abs(b*b - 4*a*c);

        double numerator1 = -b + Math.sqrt(discriminant);
        double numerator2 = -b - Math.sqrt(discriminant);

        double denominator = 2 * a;

        double root1 = numerator1 / denominator;
        double root2 = numerator2 / denominator;

        myWindow.writeOutLine("The roots are: " + root1 + " and " + root2);
    }



    //WORKSHOP CODE for you to play with
    private void assignmentIsAnOperator(){
        int testInt;
        myWindow.clearOut();
        myWindow.writeOutLine(testInt = 123);
    }

    private void arithmeticOperations(){
        //using literals to keep things clear but could have used variables
        int i1, i2, i3; //these are reused multiple times for multiple uses in this method which is poor style in real code

        myWindow.clearOut();

        myWindow.writeOutLine(1.0 / 2.0);
        myWindow.writeOutLine(1 / 2);
        myWindow.writeOutLine((double) 1 / 2);

        myWindow.writeOutLine(7 % 3);
        myWindow.writeOutLine(7 % 8);

//        int counter = 0;
//        counter = counter + 1;
//        ++counter; //pre increment
//        counter++; //post increment
//
//        counter = counter - 1;
//        --counter; //pre decrement
//        counter--; //post decrement

        myWindow.writeOutLine("");
        i1 = 1; i2 = 2;
        myWindow.writeOutLine(i1 + ++i2);
        i1 = 1; i2 = 2;
        myWindow.writeOutLine(i1 + i2++);
        i1 = 1; i2 = 2;
        myWindow.writeOutLine(i1 + --i2);
        i1 = 1; i2 = 2;
        myWindow.writeOutLine(i1 + i2--);

        double totalSales = 0, thisSale;
        thisSale = 5.50;
        totalSales += thisSale;
        myWindow.writeOutLine(totalSales);
        thisSale = 7.50;
        totalSales += thisSale;
        myWindow.writeOutLine(totalSales);

//        totalSales = totalSales + thisSale;
//        totalSales += thisSale;

        myWindow.writeOutLine("");
        double pi = Math.PI;                        //no parenthesis after PI ???
        myWindow.writeOutLine(Math.floor(pi));
        myWindow.writeOutLine(Math.pow(2.0, 20));   //1MByte
        //double calculations are inaccurate
        myWindow.writeOutLine(Math.sin(2.0 * pi));
        myWindow.writeOutLine(Math.abs(-pi));

        myWindow.writeOutLine("");

        i1 = 1; i2 = 2; i3 = 3;

        myWindow.writeOutLine(i1 + i2 * i3);
        myWindow.writeOutLine((i1 + i2) * i3);
    }

    private void equalityRelationalOperators(){
        double d1 = 1.23, d2 = 3.45;
        double delta = 0.00000001;
        String s1 = "dog", s2;

        s2 = myWindow.readIn(); //assume the string dog is input

        myWindow.clearOut();
        //remember floating points are stored inaccurately
        myWindow.writeOutLine("d1 == d2: " + (d1 == d2));   //false, maybe
        myWindow.writeOutLine("d1 != d2: " + (d1 != d2));   //true, maybe
        //inner parentheses essential in the next statement. Why?
        myWindow.writeOutLine("d1 < d2: " + (d1 < d2));     //true, maybe
        myWindow.writeOutLine("d1 <= d1: " + (d1 <= d1));   //true, maybe

        //allowing for floating point inaccuracy
        myWindow.writeOutLine((d2 - d1) < delta);

        myWindow.writeOutLine("s1 == s2: " + (s1 == s2));   //false, huh!!!


    }

    private void equalityRelationalOperators2(){

        String s1 = "dog", s2, s3 = "dOg", s4 = "dogs)";

        s2 = myWindow.readIn(); //the string dog is input

        myWindow.clearOut();
        myWindow.writeOutLine("s1.equals(s2): " + s1.equals(s2));   //hooray!
        myWindow.writeOutLine("!s1.equals(s2): " + !s1.equals(s2)); //
        myWindow.writeOutLine("s1.equals(s3): " + s1.equals(s3));   //case sensitive
        //next statement: true, case insensitive
        myWindow.writeOutLine("s1.equalsIgnoreCase(s3): " + s1.equalsIgnoreCase(s3));

        myWindow.writeOutLine("s1.compareTo(s4): " + s1.compareTo(s4));  // -ve
        myWindow.writeOutLine("s4.compareTo(s1): " + s4.compareTo(s1));  // +ve
        myWindow.writeOutLine("s1.compareTo(s2): " + s1.compareTo(s2));  // 0

        myWindow.writeOutLine("s1.compareTo(s3): " + s1.compareTo(s3));  // +ve
        //next statement: 0 i.e. s1 = s2
        myWindow.writeOutLine("s1.compareToIgnoreCase(s3): " + s1.compareToIgnoreCase(s3));

    }

    private void logicalOperators(){

        int low = 50, high = 100; //inclusive
        int testValue1 = 99, testValue2 = 101;
        boolean firstTest, secondTest;

        myWindow.clearOut();

        firstTest = testValue1 >= low && testValue1 <= high; //in test
        secondTest = testValue1 < low || testValue1 > high; //out test
        myWindow.writeOutLine("testValue1 in range: " + firstTest);
        myWindow.writeOutLine("testValue1 out of range: " + secondTest);

        myWindow.writeOutLine("");
        firstTest = testValue2 >= low && testValue2 <= high; //in test
        secondTest = testValue2 < low || testValue2 > high; //out test
        myWindow.writeOutLine("testValue2 in range: " + firstTest);
        myWindow.writeOutLine("testValue2 out of range: " + secondTest);

        //short circuiting
        int i = 0;
        myWindow.writeOutLine("");
        myWindow.writeOutLine(5 < 3 && (++i > 100));
        myWindow.writeOutLine(i);
    }

    private void redundantSyntax(){
        boolean myBoolean = true;
        boolean result;

        result = myBoolean = true;
        result = myBoolean != true;
    }

    private void blockScopeTest(){
        int outer = 1;

        myWindow.clearOut();

        myWindow.writeOutLine("outer: " + outer);
        //myWindow.writeOutLine("inner1: " + inner1); //inner1 not in scope
        //myWindow.writeOutLine("inner2: " + inner2); //inner2 not in scope
        {
            int inner1 = 2;
            myWindow.writeOutLine("outer: " + outer);
            myWindow.writeOutLine("inner1: " + inner1);
            //myWindow.writeOutLine("inner2: " + inner2); //inner2 not in scope

        }

        {
            int inner2 =3;
            myWindow.writeOutLine("outer: " + outer);
            //myWindow.writeOutLine("inner1: " + inner1); //inner1 not in scope
            myWindow.writeOutLine("inner2: " + inner2);
        }
    }



    // =========================================================================
    // UTILITIES ===============================================================
    // =========================================================================
    private static boolean isNumeric(String str){
        return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
    }

    private static int getRandom(int n1, int n2){
        int retVal = 0;

        retVal = n1 + (int) Math.floor(Math.random() * (n2 - n1 + 1));

        return retVal;
    }

}
