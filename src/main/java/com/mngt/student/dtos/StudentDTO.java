package com.mngt.student.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class StudentDTO {
    @NotBlank(message = "Name is mandatory")
    private String name;

    @Email(message = "Email is invalid")
    @Pattern(
            regexp = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$",
            message = "Email must contain a valid domain"
    )
    private String email;

    @Min(value = 16, message = "Age must be atleast 16 years")
    private int age;
}
