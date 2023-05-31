package com.exam.service;

import com.exam.model.UserRole;
import com.exam.model.UserTbl;
import com.exam.repo.RoleRepo;
import com.exam.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class
UserServiceImpl implements  UserService{

    @Autowired
    private UserRepo userRepo;
    @Autowired
    private RoleRepo roleRepo;

    @Override
    public UserTbl createUser(UserTbl userTbl, Set<UserRole> userRoleSet) throws Exception {
        UserTbl userTbl1=this.userRepo.findByName(userTbl.getName());
        if(userTbl1!=null){
            System.out.println("User already exist");
            throw new Exception("User Already exist !");
        }
        else{
            for(UserRole userRole:userRoleSet){

                this.roleRepo.save(userRole.getRole());
            }
            userTbl.getUserRoleset().addAll(userRoleSet);
            userTbl1=   this.userRepo.save(userTbl);
        }
        return userTbl1;
    }
}
