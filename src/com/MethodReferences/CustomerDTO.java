package com.MethodReferences;

import java.util.List;

/**
 * This is class that is used to Transfer to Database. This class may have some different attributes as compared to the
 * model Customer class.
 */
public class CustomerDTO {

    private Integer id;
    private String name;
    private String email;
    private List<String> mobileNo;

    public CustomerDTO() {
    }

    public CustomerDTO(Integer id, String name, String email, List<String> mobileNo) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.mobileNo = mobileNo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(List<String> mobileNo) {
        this.mobileNo = mobileNo;
    }

    @Override
    public String toString() {
        return "CustomerDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", mobileNo=" + mobileNo +
                '}';
    }
}
