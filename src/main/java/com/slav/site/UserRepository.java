package com.slav.site;

import com.slav.site.entity.User;

public interface UserRepository {

    Iterable<User> getAllUsers();

   /*User get(long id);*/

    User get(User user);

    void add(User user);

    void update(User user);

    void delete(User user);

    void delete(long id);
}
