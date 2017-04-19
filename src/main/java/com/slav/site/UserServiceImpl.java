package com.slav.site;

import com.slav.site.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void add(User user) {
        userRepository.add(user);
    }

    @Override
    public void deleteUser(User user) {
        userRepository.delete(user);
    }

    @Override
    public User getUser(User user) {
        return userRepository.get(user);
    }

    @Override
    public boolean authenticateUser(User user) {

        User logAttemptUser = user;
        User databaseUser = this.getUser(user);

        if(logAttemptUser.getUsername().equals(databaseUser.getUsername())
                && logAttemptUser.getPassword().equals(databaseUser.getPassword())) {

            return true;
        } else {
            return false;
        }
    }
}
