public class MainClass {

    public static void main(String[] args) {

       String myString = "Hello ";
       String myString2 = "World ";

        System.out.println(myString + " " + myString2); // String concatenation

        // Week 1 - try running this program and understand the output
        // Try to code to display your name (first name + last name)
        String firstName = "Gabriel";
        String lastName = "Low";
        System.out.println(firstName + " " + lastName);

        arithmeticOps();

        // Get comfortable with coding and make sure you have configured your SDK and



    }

    private static void arithmeticOps() {

        int a = 10;
        int b = 20;
        int c = 0;

//        System.out.println(Integer.toString(a) + Integer.toString(b));
        System.out.println("a = " + a + "; b = " + b);

        c = a + b;

        System.out.println(c);

        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " x " + b + " = " + (a * b));
        System.out.println(a + " / " + b + " = " + (a / b));
        System.out.println(a + " % " + b + " = " + (a % b));
    }

}
