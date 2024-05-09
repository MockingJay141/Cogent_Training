package com.MethodReferences;

public class CustomerMapper {

    public static CustomerDTO convert(Customer customer){
        CustomerDTO dto = new CustomerDTO();
        dto.setId(customer.getId());
        dto.setName(customer.getName());
        dto.setEmail(customer.getEmail());
        dto.setMobileNo(customer.getMobileNo());
        return dto;
    }

    public CustomerDTO convert1(Customer customer){
        CustomerDTO dto = new CustomerDTO();
        dto.setId(customer.getId());
        dto.setName(customer.getName());
        dto.setEmail(customer.getEmail());
        dto.setMobileNo(customer.getMobileNo());
        return dto;
    }
}
