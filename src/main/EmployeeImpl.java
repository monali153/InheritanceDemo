package main;

import data.Address;
import data.Employee;

public class EmployeeImpl {

    public static void main(String[] args) {

        Address address = new Address(101,"Kolar road", "Bhopal","India",4602021);

        Employee object = new Employee("Monali", 25, "01/09/2000",address);

        //object.setAddress(// i have to call constructor of Address class);
        // updating address
        Address newAddress = new Address(501, "Ubale Nagar", "Pune","India", 412308);

        object.display();
        System.out.println("\nAfter changing address");
        object.setAddress(newAddress);
        object.display();

        //to only update the house no, what should we do?
        // get the address reference
        // using that reference update house number

        Address currentAddress = object.getAddress();
        //update house no
        currentAddress.setHouseNo(225);
        System.out.println("\nAfter changing house no in address");
        object.display();

        // updating house number
        object.getAddress().setHouseNo(610);//method chaining
        System.out.println("\nAgain changing house no in address by different approach");
        object.display();

        //updating employee
        object.setEmpName("Ramesh");
        object.display();

        // processing employee name -> check whether name starts with capital letter
        System.out.println("Character.isUpperCase(object.getEmpName().charAt(0)) = " + Character.isUpperCase(object.getEmpName().charAt(0)));


    }
}
