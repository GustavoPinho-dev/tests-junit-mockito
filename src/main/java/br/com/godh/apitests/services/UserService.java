package br.com.godh.apitests.services;

import br.com.godh.apitests.entities.User;

public interface UserService {

    User findById(Integer id);
}
