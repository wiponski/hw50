package com.example.hw50.entity;

import lombok.Data;

@Data
public class User {
    private String userName;
    private String email;
    private String password;
    private Integer publicNum = 0;
    private Integer subscriptionsNum = 0;
    private Integer subscribersNum= 0;

    public void publication() {
        setPublicNum(getPublicNum() + 1);
    }
    public void subscribe() {
        setSubscribersNum(getSubscribersNum() + 1);
    }
    public void acceptSubscribe() {
        setSubscribersNum(getSubscribersNum() + 1);
    }

}
