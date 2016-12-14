package br.com.caio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by caioaraujo on 14/12/16.
 */
@Controller
public class UserController {

    @Autowired
    private UserRepository repo;

    @GetMapping("/")
    @ResponseBody
    @Transactional
    public String teste(){
        User u = new User();
        u.setUser("teste");
        u.setPassword("teste");
        u = repo.save(u);
        return u.toString();
    }

    @GetMapping("/getAll")
    @ResponseBody
    @Transactional
    public List<User> getAll(){
        List<User> users = new ArrayList<>();
        repo.findAll().forEach(users::add);
        return users;
    }

}
