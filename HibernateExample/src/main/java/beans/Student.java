package beans;

import javax.persistence.*;

@Entity
@Table(name = "student3")
public class Student {

    @Id
    private int rollNo;
    private String StudentName;
    private int marks;

    @OneToOne(targetEntity = Laptop.class, cascade = CascadeType.ALL)
    private Laptop laptop;

    public Student() {
    }

    public Student(int rollNo, String studentName, int marks, Laptop laptop) {
        this.rollNo = rollNo;
        StudentName = studentName;
        this.marks = marks;
        this.laptop = laptop;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", StudentName='" + StudentName + '\'' +
                ", marks=" + marks +
                ", laptop=" + laptop +
                '}';
    }
}