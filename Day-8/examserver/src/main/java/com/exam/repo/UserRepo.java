package com.exam.repo;

import com.exam.model.UserTbl;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<UserTbl,Long> {
    UserTbl findByName(String name);
}
