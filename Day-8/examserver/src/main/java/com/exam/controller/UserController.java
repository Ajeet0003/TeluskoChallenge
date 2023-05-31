package com.exam.controller;

import com.exam.model.Role;
import com.exam.model.UserRole;
import com.exam.model.UserTbl;
import com.exam.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    @PostMapping("/")
    public UserTbl createUser(@RequestBody UserTbl userTbl) throws Exception {
        Set<UserRole> userRoleSet=new HashSet<>();

        Role role=new Role();
        role.setId(1L);
        role.setRoleName("Admin");

        UserRole userRole=new UserRole();
        userRole.setUser(userTbl);
        userRole.setRole(role);

        userRoleSet.add(userRole);

        UserTbl userTbl1=this.userService.createUser(userTbl,userRoleSet);

        return  userTbl1;

    }
}
