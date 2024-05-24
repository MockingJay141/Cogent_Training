package beans;

import javax.persistence.*;

@Entity
@Table(name = "laptop3")
public class Laptop {

    @Id
    private int lid;
    private String lname;

    @OneToOne(targetEntity = Student.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "rollNo")
    private Student student;

    public Laptop() {
    }

    public Laptop(int lid, String lname, Student student) {
        this.lid = lid;
        this.lname = lname;
        this.student = student;
    }

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "lid=" + lid +
                ", lname='" + lname + '\'' +
                ", student=" + student +
                '}';
    }
}
