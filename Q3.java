// Person class
class Person {
    private String name;
    private int age;
    private String address;

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Getter and Setter for address
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

// Main class
public class Q3 {
    public static void main(String[] args) {
        // Creating an instance of the Person class
        Person person = new Person();

        // Setting values for properties using setter methods
        person.setName("John Doe");
        person.setAge(30);
        person.setAddress("123 Main Street");

        // Displaying values using getter methods
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Address: " + person.getAddress());
    }
}
