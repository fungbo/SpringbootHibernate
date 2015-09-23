package com.tw.dao;

import com.tw.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface UserDao extends CrudRepository<User, String> {
    User findByName(String name);
}
