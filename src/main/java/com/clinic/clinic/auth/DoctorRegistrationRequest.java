//package com.clinic.clinic.auth;
//
//import jakarta.validation.constraints.Email;
//import jakarta.validation.constraints.NotBlank;
//import jakarta.validation.constraints.NotEmpty;
//import jakarta.validation.constraints.Size;
//import lombok.Builder;
//import lombok.Getter;
//import lombok.Setter;
//
//@Getter
//@Setter
//@Builder
//public class DoctorRegistrationRequest {
//    @NotEmpty(message = "Firstname is mandatory")
//    @NotBlank(message = "Firstname is mandatory")
//    private String firstname;
//    @NotEmpty (message = "Lastname is mandatory")
//    @NotBlank(message = "Lastname is mandatory")
//    private String lastname;
//    @NotEmpty(message = "Specialization is mandatory")
//    @NotBlank(message = "Specialization is mandatory")
//    private String specialization;
//    @Email(message = "Email is not well-formatted")
//    @NotEmpty (message = "Email is mandatory")
//    @NotBlank(message = "Email is mandatory")
//    private String email;
//    @Size(min = 10, message = "Password should be at least 10 characters minimum")
//    @NotEmpty (message = "Password is mandatory")
//    @NotBlank(message = "Password is mandatory")
//    private String password;
//}