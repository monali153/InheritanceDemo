package main;

import data.Manager;
import data.NewAddress;

public class Implementation {
    public static void main(String[] args) {

        Manager object = new Manager();

        object.setName("Monali");
        object.setAge(25);
        object.setDob("15/05/1994");
        object.setSalary(50000);
        object.setTeamSize(10);
        object.setTeamRatings(5);

        NewAddress address = new NewAddress();

        address.setHouseNo(122);
        address.setStreetName("ubale nagar");
        address.setCity("Pune");
        address.setCountry("India");
        address.setZipCode(444123);

        object.setAddress(address);

        object.show();


    }
}
