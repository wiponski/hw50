package com.example.hw50.entity;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Subscription {
    private User subscriberName;
    private User subscriptionName;
    LocalDate subscribeDate;
}
