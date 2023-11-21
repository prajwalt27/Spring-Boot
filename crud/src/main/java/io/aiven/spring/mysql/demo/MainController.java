package io.aiven.spring.mysql.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping(path="/demo")
public class MainController{

    @Autowired
    private UserRepository userRepository;

    @PostMapping(path="/add")
    public @ResponseBody User addNewUser(@RequestParam String name,@RequestParam String email){
         
        User u = new User();
        u.setName(name);
        u.setEmail(email);
        userRepository.save(u);
        return u;
    }

    @GetMapping(path="/all")
        public @ResponseBody Iterable<User> getAllUsers(){
            return userRepository.findAll();
        }
    
}

