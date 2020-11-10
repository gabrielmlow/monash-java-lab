
public class Person {
    private int age;
    private String personAddress;

    public void setAge(int newAge){
        if (newAge > 0 && newAge <= 120)
            age = newAge;
    }

    public int getAge() {
        return age;
    }

    public String getPersonAddress() {
        return personAddress;
    }

    public void setPersonAddress(String newAddress) {
        int length = newAddress.length();

        if (length >= 5 && length <= 25) {
            personAddress = newAddress;
        } else {
            System.out.println("Invalid Address");
            System.exit(-1);
        }
    }

}


