package edu.team27.perfectcube;

import java.util.ArrayList;

/**
 * Created by Brooklyn on 2/13/2018.
 */

class LoginData {
    private static final LoginData ourInstance = new LoginData();

    private static ArrayList<String> users = new ArrayList<>();
    private static ArrayList<String> passwords = new ArrayList<>();

    public static ArrayList<String> getUsers() {
        return users;
    }

    public static void setUsers(ArrayList<String> users) {
        LoginData.users = users;
    }

    public static ArrayList<String> getPasswords() {
        return passwords;
    }

    public static void setPasswords(ArrayList<String> passwords) {
        LoginData.passwords = passwords;
    }

    static LoginData getInstance() {
        return ourInstance;
    }

    private LoginData() {
    }
}
