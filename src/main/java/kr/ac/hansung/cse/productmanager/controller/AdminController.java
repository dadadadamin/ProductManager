package kr.ac.hansung.cse.productmanager.controller;

import kr.ac.hansung.cse.productmanager.entity.MyUser;
import kr.ac.hansung.cse.productmanager.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class AdminController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/admin/home")
    public String viewAdminHome(Model model) {
        List<MyUser> userList = userRepository.findAll();
        model.addAttribute("users", userList);
        return "adminhome";
    }
}
