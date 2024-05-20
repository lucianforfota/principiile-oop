package exercitii.ex8company;

import java.util.Arrays;

public class Company {

    private String name;
    private int yearFounded;
    private Department[] departments;
    private int numberOfDepartments;

    public Company(String name, int yearFounded, Department[] departments, int numberOfDepartments) {
        this.name = name;
        this.yearFounded = yearFounded;
        this.departments = departments;
        this.numberOfDepartments = numberOfDepartments;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearFounded() {
        return yearFounded;
    }

    public void setYearFounded(int yearFounded) {
        this.yearFounded = yearFounded;
    }

    public Department[] getDepartments() {
        return departments;
    }

    public void setDepartments(Department[] departments) {
        this.departments = departments;
    }

    public int getNumberOfDepartments() {
        return numberOfDepartments;
    }

    public void setNumberOfDepartments(int numberOfDepartments) {
        this.numberOfDepartments = numberOfDepartments;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", yearFounded=" + yearFounded +
                ", departments=" + Arrays.toString(departments) +
                ", numberOfDepartments=" + numberOfDepartments +
                '}';
    }
}
