package Proekt.menu.service;

import ua.lits.ny_project.repository.UserRepository;

public class UserService {
    private UserRepository userRepository = new UserRepository();

    public void getAllUsers() {
        System.out.println(userRepository);
    }

}
