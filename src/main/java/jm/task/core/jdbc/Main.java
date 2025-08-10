package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        // реализуйте алгоритм здесь
        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Vitya", "SVO", (byte) 19);
        userService.saveUser("Kirill", "Nosov", (byte) 22);
        userService.saveUser("Mark", "Uglov", (byte) 19);
        userService.saveUser("Artem", "Sobaka", (byte) 19);
        userService.getAllUsers();
//        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
