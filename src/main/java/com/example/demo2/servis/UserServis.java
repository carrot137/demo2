package com.example.demo2.servis;

import org.springframework.stereotype.Service;

import com.example.demo2.domain.User;

@Service
public class UserServis {
    public User save(User user){
    //引数で受け取ったuser情報を
    //usersテーブルにインサート
    //hobbyテーブルにインサート
    //送信
    System.out.println("UserSarviceのsaveが呼ばれました");
    return user;
    }

}
