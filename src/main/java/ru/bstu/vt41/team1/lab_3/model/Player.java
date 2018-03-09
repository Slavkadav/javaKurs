package ru.bstu.vt41.team1.lab_3.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String firstName;
    private String secondName;
    private String lastName;
    private Integer age;
    private Integer height;
    private Integer weight;

    @ManyToOne
    private Team team;
}
