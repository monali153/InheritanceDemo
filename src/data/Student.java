package data;

/*Create a Student class, which is derived form Person class.
        Think about attributes of person and student, separate the common feature of person and student place them in Person class.
        Place student attributes, which are unique for student in Student class.

        Create one Implementation class, create object of student and initialize it by using setter method, and
        display the details using getter method.*/

public class Student extends Person {

    private int rollNo;
    private String schoolName;
    private int std;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public int getStd() {
        return std;
    }

    public void setStd(int std) {
        this.std = std;
    }
}
