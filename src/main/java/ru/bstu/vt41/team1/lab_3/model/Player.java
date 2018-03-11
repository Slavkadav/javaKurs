package ru.bstu.vt41.team1.lab_3.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Entity
@Getter
@Setter
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String fio;
    @Column(nullable = false)
    @NotBlank
    @Temporal(TemporalType.DATE)
    private Date birthDate;

    private Integer height;
    private Integer weight;

    @ManyToOne
    private Team team;
}
