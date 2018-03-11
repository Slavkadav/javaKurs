package ru.bstu.vt41.team1.lab_3.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Journal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private Team team;

    @ManyToOne
    private Competition competition;

}
