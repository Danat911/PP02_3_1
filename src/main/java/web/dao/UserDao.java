package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();

    void add(User user);

    User getUserById(int id);

    void update(User newUser, int id);

    void delete(int id);

}
