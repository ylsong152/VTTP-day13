package sg.edu.nus.iss.multivaluemap.controller;

import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    
    @PostMapping("/user")
    public String createUser(@RequestBody MultiValueMap<String, String> form, Model model) {
        String name = form.getFirst("name");
        String email = form.getFirst("email");
        String tel = form.getFirst("tel");

        System.out.println("name: " + name);
        System.out.println("email: " + email);
        System.out.println("tel: " + tel);

        return "";
    }
}
