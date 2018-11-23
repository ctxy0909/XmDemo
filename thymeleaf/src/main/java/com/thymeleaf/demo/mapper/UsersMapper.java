package com.thymeleaf.demo.mapper;

import com.thymeleaf.demo.domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
//继承Jpa
public interface UsersMapper extends JpaRepository<Users, Long> {


}
