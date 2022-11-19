package br.com.godh.apitests.services;

import br.com.godh.apitests.entities.User;
import br.com.godh.apitests.entities.dto.UserDTO;

import java.util.List;

public interface UserService {

    User findById(Integer id);
    List<User> findAll();
    User create(UserDTO obj);
}
