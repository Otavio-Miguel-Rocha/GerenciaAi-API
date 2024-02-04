package com.gerencia.gerenciaai.controller;

import com.gerencia.gerenciaai.model.entity.User;
import com.gerencia.gerenciaai.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/{userID}")
    public ResponseEntity<?> getOne(@PathVariable Long userID){
        try{
            return new ResponseEntity<>(userService.getOne(userID), HttpStatus.NOT_FOUND);
        } catch (Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody User user){
        try{
            return new ResponseEntity<>(userService.save(user), HttpStatus.NOT_FOUND);
        } catch (Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }


}
