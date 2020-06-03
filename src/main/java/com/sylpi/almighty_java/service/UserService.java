package com.sylpi.almighty_java.service;

import com.sylpi.almighty_java.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface UserService {

    public List<User> allUsers();

    public User findById(Long id);

    public User create (User user);

    public void deleteUser(Long id);

}
