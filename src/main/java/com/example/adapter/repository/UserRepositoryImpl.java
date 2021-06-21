package com.example.adapter.repository;

import com.example.entity.User;
import com.example.entity.UserRepoitory;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserRepositoryImpl implements UserRepoitory {

    private UserRepositoryPeer peer;

    @Override
    public List<User> findAll() {

        List<User> users = new ArrayList<User>();

        for (UserData userData: peer.findAll()
             ) {
            User user = new User();
            user.setId(userData.getId());
            user.setName(userData.getName());
            user.setEmail(userData.getEmail());
            user.setNationalId(userData.getNationalId());
            users.add(user);
        }
        return users;
    }

    @Override
    public Optional<User> findById(String id) {
        return Optional.empty();
    }

    @Override
    public void save(User user) {
        UserData userData = new UserData();
        userData.setNationalId(user.getNationalId());
        userData.setEmail(user.getEmail());
        userData.setName(user.getName());
        peer.save(userData);
    }

    @Override
    public void deleteById(String id) {

    }
}
