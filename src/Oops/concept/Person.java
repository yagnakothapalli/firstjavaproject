package Oops.concept;

public String Person{
    private String firstname;
    private String lastname;
    private String address;
    private int age;

    public Person(String firstname, String lastname, String address, int age){
        this.firstname = "Yagna";
        this.lastname = "Kothapalli";
        this.address = "Canada";
        this.age = 20;
    }

    public Person() {

    }

    public String getFullName() {
        return firstname+" "+lastname;
    }

    public String getAddress() {
        return address;
    }

    public void changeAddress(String address) {
        this.address = "Vancouver";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
public void greet(){


        }
        public static void printName(){

        }
