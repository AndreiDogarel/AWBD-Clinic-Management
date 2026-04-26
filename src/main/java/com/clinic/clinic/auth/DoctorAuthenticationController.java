//package com.clinic.clinic.auth;
//
//import io.swagger.v3.oas.annotations.tags.Tag;
//import jakarta.mail.MessagingException;
//import jakarta.validation.Valid;
//import lombok.RequiredArgsConstructor;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//
//@RestController
//@RequestMapping("doctor_auth")
//@RequiredArgsConstructor
//@Tag(name = "authentication")
//public class DoctorAuthenticationController {
//    private final AuthenticationService authenticationService;
//
//    @PostMapping("/register")
//    @ResponseStatus(HttpStatus.ACCEPTED)
//    public ResponseEntity<?> registerDoctor(@Valid @RequestBody DoctorRegistrationRequest request) throws MessagingException {
//        authenticationService.registerDoctor(request);
//        return ResponseEntity.accepted().build();
//    }
//
//    @PostMapping("/authenticate")
//    public ResponseEntity<AuthenticationResponse> authenticateDoctor(@Valid @RequestBody AuthenticationRequestDto request) throws MessagingException {
//        return ResponseEntity.ok(authenticationService.authenticateDoctor(request));
//    }
//
//    @GetMapping("/activate")
//    public void confirmDoctor(@RequestParam String token) throws MessagingException {
//        authenticationService.activateDoctorAccount(token);
//    }
//
//}
