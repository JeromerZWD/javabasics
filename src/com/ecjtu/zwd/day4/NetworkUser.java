package com.ecjtu.zwd.day4;

public class NetworkUser {
    private int id;
    private String password;
    private String email;

    public NetworkUser(int id, String password) {
        this.id = id;
        this.password = password;
        this.email = id+"@gameschool.com";
    }

}
