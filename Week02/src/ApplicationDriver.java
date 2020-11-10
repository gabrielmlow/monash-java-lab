
public class ApplicationDriver {
    public static void main(String[] args) {
        Person tania = new Person();

        tania.setAge(21);
//        tania.setPersonAddress("Str");
//        tania.setPersonAddress("488  University Drive, Chicago, Illinois, 60606");
        tania.setPersonAddress("488  University Drive");


        System.out.println("Tania is " + tania.getAge() + " years old.");
        System.out.println("Tania lives at " + tania.getPersonAddress() + ".");
    }
}


