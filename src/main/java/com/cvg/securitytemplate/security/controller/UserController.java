package com.cvg.securitytemplate.security.controller;

import com.cvg.securitytemplate.security.dto.JwtToken;
import com.cvg.securitytemplate.security.dto.LoginDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/auth")
public class UserController {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping
    public ResponseEntity<JwtToken> login(@RequestBody LoginDto user) {
        String password = passwordEncoder.encode( user.getPassword() );
        JwtToken token = new JwtToken( password );

        if (token == null) {
            return ResponseEntity.noContent().build();
        }

        return new ResponseEntity( token, HttpStatus.CREATED );
    }

    @GetMapping
    public ResponseEntity<JwtToken> showSomething() {
        JwtToken token = new JwtToken("csdcsadc");
        if (token == null) {
            return ResponseEntity.noContent().build();
        }
        return new ResponseEntity( token, HttpStatus.CREATED );
    }

}
