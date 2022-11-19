package br.com.godh.apitests.services;

import br.com.godh.apitests.entities.User;

import java.util.List;

public interface UserService {

    User findById(Integer id);
    List<User> findAll();
}
