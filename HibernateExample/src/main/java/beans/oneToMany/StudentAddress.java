package beans.oneToMany;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "addressData2")
public class StudentAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int address_id;
    @Column
    private String address_details;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "student_address", fetch = FetchType.LAZY)
    private Set<Student> students = new HashSet<>(0);

    public StudentAddress() {
    }

    public StudentAddress(int address_id, String address_details, Set<Student> students) {
        this.address_id = address_id;
        this.address_details = address_details;
        this.students = students;
    }

    public int getAddress_id() {
        return address_id;
    }

    public void setAddress_id(int address_id) {
        this.address_id = address_id;
    }

    public String getAddress_details() {
        return address_details;
    }

    public void setAddress_details(String address_details) {
        this.address_details = address_details;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "StudentAddress{" +
                "address_id=" + address_id +
                ", address_details='" + address_details + '\'' +
                ", students=" + students +
                '}';
    }
}
