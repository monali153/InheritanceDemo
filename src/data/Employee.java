package data;

public class Employee {

    private String empName;
    private int age;
    private String dob;
    private Address address;

    public Employee(String empName, int age, String dob, Address address){

        this.empName = empName;
        this.age = age;
        this.dob = dob;
        this.address = address;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void display(){
        System.out.println("Employee Details");
        System.out.println("empName = " + empName);
        System.out.println("age = " + age);
        System.out.println("dob = " + dob);
        address.display();

    }
}
