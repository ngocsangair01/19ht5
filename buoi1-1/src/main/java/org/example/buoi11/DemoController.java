package org.example.buoi11;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//api
// crud => create, read, update, delete
/**
 * Cac status hay gap
 * 200 : success
 * 201 : created
 * 400 : bad request
 * 401 : un authorize
 * 403 : forbidden
 * 500 : internal
 * **/
@RestController
@RequestMapping("/api")
public class DemoController {

    @GetMapping("/demo")
    public ResponseEntity<?> demoData(){
        User user = new User("ABC","0123456789","Viet Nam");
        return ResponseEntity.status(200).body(user);
    }
}
