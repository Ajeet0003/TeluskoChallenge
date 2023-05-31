package com.exam.service;

import com.exam.model.UserRole;
import com.exam.model.UserTbl;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public interface UserService {
    UserTbl createUser(UserTbl userTbl, Set<UserRole> userRoleSet) throws Exception;
}
