package exercitii.ex8company;

public class Department {
    private String name;

    private Employee[] employees;
    private int numberOfEmployees;

    public Department(String name, Employee[] employees, int numberOfEmployees) {
        this.name = name;
        this.employees = employees;
        this.numberOfEmployees = numberOfEmployees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public void printAllEmployeesStreets(){
        for (int i = 0; i < numberOfEmployees; i++) {
            System.out.println(employees[i].getAddress().getStreet());
        }
    }

    public Employee findEmployeeByName(String lastName){
        for (int i = 0; i < numberOfEmployees; i++) {
            if (lastName.equals(employees[i].getLastName())){
                return employees[i];
            }
        }
        return null;
    }

    public Address findEmployeeAdressByName(String lastName){
        Employee foundEmployee = findEmployeeByName(lastName);
        if (foundEmployee == null){
            return null;
        }
        return foundEmployee.getAddress();
    }

    public Address findEmployeeAdressByStreet (String street){
        for (int i = 0; i < numberOfEmployees; i++) {
            if (street.equals(employees[i].getAddress().getStreet())){
                return employees[i].getAddress();
            }
        }
        return null;
    }
}
