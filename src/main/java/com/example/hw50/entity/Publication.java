package com.example.hw50.entity;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

@Data
public class Publication {
    String image;
    String description;
    LocalDateTime publicDateTime;

}
