package com.example.phonebookapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@RestController
public class PhonebookAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(PhonebookAppApplication.class, args);
    }
    public String getPhone(String name) {
        Map<String, String> book = new HashMap<>();
        book.put("Ivanov", "+79030001122");
        book.put("Petrov", "+79041112233");
        book.put("Sidorov", "+79052223344");
        if (name != null && book.containsKey(name)) {
            return book.get(name);
        } else {

            return "abonent ne naiden";



        }
    }
    @PostMapping("/phonebook")
    public ResponseEntity<?> getPhone(@RequestBody Name request){
        String name = request.getName();
        Map<String, String> response = new HashMap<>();
        response.put ("phone", getPhone(name));
        response.put("name", name );
        return ResponseEntity.ok(response);
    }
}

