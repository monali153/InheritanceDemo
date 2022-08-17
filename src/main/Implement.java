package main;

import data.Student;

public class Implement {

    public static void main(String[] args) {

        Student object = new Student();

        object.setName("Sonali");
        object.setAge(25);
        object.setDob("22/05/1997");
        object.setEmail("sona123@gmail.com");
        object.setMobileNo(9452612320L);
        object.setRollNo(12);
        object.setSchoolName("Holy Cross");
        object.setStd(10);

        System.out.println("Name = " + object.getName());
        System.out.println("RollNo = " + object.getRollNo());
        System.out.println("Std = " + object.getStd() + "th");
        System.out.println("Age = " + object.getAge());
        System.out.println("DOB = " + object.getDob());
        System.out.println("School Name = " + object.getSchoolName());
        System.out.println("Mobile No = " + object.getMobileNo());
        System.out.println("Email = " + object.getEmail());

    }
}
