package com.zallhy.hyapp.response;


import com.zallhy.hyapp.tables.Member;

public class LoginView extends ResponseView {
    private String token;
    private Member user;
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Member getUser() {
        return user;
    }

    public void setUser(Member user) {
        this.user = user;
    }

    public String getToken() {
        return token;
    }


    public void setToken(String token) {
        this.token = token;
    }
}
