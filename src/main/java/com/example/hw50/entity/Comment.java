package com.example.hw50.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Comment {
    String commentText;
    LocalDateTime commentDateTime;

}
