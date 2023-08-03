package com.encoredev.kokorobundle.Entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "rooster_tbl")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Rooster {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
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
