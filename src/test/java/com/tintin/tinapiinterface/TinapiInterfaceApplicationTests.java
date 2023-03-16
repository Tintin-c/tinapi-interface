package com.tintin.tinapiinterface;

import com.tintin.tinapiclientsdk.client.TinapiClient;
import com.tintin.tinapiclientsdk.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class TinapiInterfaceApplicationTests {

    @Resource
    TinapiClient tinapiClient;

    @Test
    void contextLoads() {
        User user = new User();
        user.setName("test-sdk");
        String result = tinapiClient.postUsername(user);
        System.out.println(result);
    }

}
