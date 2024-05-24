package com.example.BankingApplication.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class UserRequest {

    @NotNull(message = "User shouldn't be null")
    private String name;

    @Email(message = "invalid Email")
    private String email;

    @Pattern(regexp = "^\\d{10}$", message = "Invalid mobile number")
    private String mobileNo;
    private String gender;

    @Min(18)
    @Max(60)
    private int age;

    @NotBlank
    private String nationality;

}
