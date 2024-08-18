package Darwin9101.springstudents.Service;

import Darwin9101.springstudents.model.User;

import java.util.List;

public interface UserService {

    public void insertUser(User user);

    public void deleteUser(Long id);

    public List<User> getAllUsers();

    public User getUserById(Long id);
}