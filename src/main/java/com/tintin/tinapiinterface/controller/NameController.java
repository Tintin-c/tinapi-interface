package com.tintin.tinapiinterface.controller;

import com.tintin.tinapiclientsdk.model.User;
import com.tintin.tinapiclientsdk.utils.SignUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/name")
public class NameController {

    @GetMapping("/")
    public String getName(String name){
        return "Get name:" + name;
    }

    @PostMapping("/")
    public String postName(@RequestParam String name){
        return "Post name:" + name;
    }

    @PostMapping("/user")
    public String postUsername(@RequestBody User user, HttpServletRequest request){
//        String accessKey = request.getHeader("accessKey");
//        String secreatKey = request.getHeader("secreatKey");
//        String sign = request.getHeader("sign");
//        String body = request.getHeader("body");

//        if (!accessKey.equals("accessKey")){
//            throw new RuntimeException("无权限");
//        }
//
//        String serverSign = SignUtils.getSign(body, "abc");
//
//        if (!serverSign.equals(sign)){
//            throw new RuntimeException("无权限");
//        }

        return "Post user:" + user.name;
    }

}
