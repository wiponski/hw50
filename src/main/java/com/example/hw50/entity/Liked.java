package com.example.hw50.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Liked {
    User markedUser;
    User markedObject;
    LocalDateTime markedDateTime;

}
