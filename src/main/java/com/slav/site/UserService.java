package com.slav.site;

import com.slav.site.entity.User;

public interface UserService {

    void add(User user);

    void deleteUser(User user);

    User getUser(User user);

    boolean authenticateUser(User user);

}
