package br.com.godh.apitests.services.impl;

import br.com.godh.apitests.entities.User;
import br.com.godh.apitests.repositories.UserRepository;
import br.com.godh.apitests.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public User findById(Integer id) {
        Optional<User> obj = repository.findById(id);
        return obj.orElse(null);
    }
}
