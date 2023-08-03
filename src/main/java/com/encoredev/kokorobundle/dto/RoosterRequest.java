package com.encoredev.kokorobundle.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class RoosterRequest {
    private String name;
    private int tag;
    private String color;
    private String feather_color;
    private int age;
    private Double weight;
    private String line;
    private String markup;
    private Boolean isAlive;
    private String type;
    private Double price;
    private Date createdAt;
    private String status;
}
