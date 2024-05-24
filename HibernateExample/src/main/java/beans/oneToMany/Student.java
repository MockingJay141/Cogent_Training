package beans.oneToMany;

import javax.persistence.*;

@Entity
@Table(name = "StudentData1")
public class Student {

    @Id
    @GeneratedValue
    private int student_id;
    @Column
    private String student_name;

    @ManyToOne(cascade = CascadeType.ALL)
    private StudentAddress student_address;

    public Student() {
    }

    public Student(int student_id, String student_name, StudentAddress student_address) {
        this.student_id = student_id;
        this.student_name = student_name;
        this.student_address = student_address;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public StudentAddress getStudent_address() {
        return student_address;
    }

    public void setStudent_address(StudentAddress student_address) {
        this.student_address = student_address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "student_id=" + student_id +
                ", student_name='" + student_name + '\'' +
                ", student_address=" + student_address +
                '}';
    }
}
