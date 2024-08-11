package web.app.Spring_boot.service;

import web.app.Spring_boot.model.User;

import java.util.List;

public interface UserService {
    void save(User user);
    List<User> index();
    User show(int id);
    void delete(int id);
    void update(int id, User user);
}
