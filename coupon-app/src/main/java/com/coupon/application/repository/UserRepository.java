package com.coupon.application.repository;

import com.coupon.application.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

//    public void  save(User user){
//        System.out.println("Insert the Database");
//    }
//
//    public void  saveMultiple(List<User> user){
//        System.out.println("Insert Multiple the Database");
//    }


}
