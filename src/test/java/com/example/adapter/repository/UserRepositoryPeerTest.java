package com.example.adapter.repository;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class UserRepositoryPeerTest {
    @Autowired
    UserRepositoryPeer repository;

    @Test
    public void save_test(){
        UserData user = new UserData();
        user.setName("Rex Wang");
        user.setEmail("wangre@vmware.com");
        user.setNationalId("A123456789");
        repository.save(user);

        Assert.assertNotNull(repository.findAll());
    }
}
