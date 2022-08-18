package main;

import data.Manager;
import data.NewAddress;

public class Implementation {
    public static void main(String[] args) {
        NewAddress address = new NewAddress();

        Manager object = new Manager("Monali", "15/05/1997", 25, 500000, address, 10, 5);


        address.setHouseNo(122);
        address.setStreetName("ubale nagar");
        address.setCity("Pune");
        address.setCountry("India");
        address.setZipCode(444123);

        object.setAddress(address);

        object.show();
        // object.calculateIncrement()


    }
}
