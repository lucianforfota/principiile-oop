package exercitii.ex8company;

public class Employee {

    private String firstName;
    private String lastName;
    private double salary;
    private Address address;

    public Employee(String firstName, String lastName, double salary, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void printEmployeeAdressInfo(){
        System.out.println(address.getStreet());
        System.out.println(address.getNumber());
        System.out.println(address.getCity());
    }
}
