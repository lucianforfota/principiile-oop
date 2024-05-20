package exercitii.ex8company;

public class Main {
    //O companie are un nume, data infiintarii, o lista de departamente
    //
    //Un departament un nume si o lista de angajati.
    //
    //Un angajat are nume, prenume, salariu si o adresa.
    //
    //O adresa are oras, strada, numar.


    public static void main(String[] args) {
        Address address1 = new Address("Cluj","Primaverii",12);
        Address address2 = new Address("Bucuresti","Fericirii",12);
        Employee employee1 = new Employee("Ionut", "Popescu", 2000, address1);
        Employee employee2 = new Employee("Jonathan", "Popescu", 2000, address2);
        Employee[] employeesIT = {employee1, employee2};
        Department department = new Department("IT", employeesIT, 2);

        department.printAllEmployeesStreets();
    }
}
