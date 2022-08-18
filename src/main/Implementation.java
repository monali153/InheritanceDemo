package main;

import data.Manager;
import data.NewAddress;
import data.RegionalHead;

public class Implementation {
    public static void main(String[] args) {
        NewAddress address = new NewAddress();

        Manager manager = new Manager("Monali", "15/05/1997", 25, 500000, address, 10, 5);
        Manager manager1 = new Manager("Suresh", "22/12/1998", 22, 20000, address, 8, 9);

        RegionalHead regionalHead = new RegionalHead("Ravi", "31/05/1996", 29, 30000, address, "MPC6", 5, 6);
        RegionalHead regionalHead1 = new RegionalHead("Vaibhavi", "12/02/1995", 24, 100000, address, "Goa", 10, 11);

        address.setHouseNo(122);
        address.setStreetName("ubale nagar");
        address.setCity("Pune");
        address.setCountry("India");
        address.setZipCode(444123);

        manager.setAddress(address);

        manager.show();

        System.out.println("manager.calculateIncrement(5) = " + manager.calculateIncrement(5));
        System.out.println("manager1.calculateIncrement(5) = " + manager1.calculateIncrement(5));
        System.out.println("regionalHead.calculateIncrement(5) = " + regionalHead.calculateIncrement(5));
        System.out.println("regionalHead1.calculateIncrement(5) = " + regionalHead1.calculateIncrement(5));


    }
}
