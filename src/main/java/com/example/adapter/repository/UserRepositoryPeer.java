package com.example.adapter.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositoryPeer extends CrudRepository<UserData, Long> {

}
