package ru.bstu.vt41.team1.lab_3.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.bstu.vt41.team1.lab_3.model.Player;
import ru.bstu.vt41.team1.lab_3.model.Team;
import ru.bstu.vt41.team1.lab_3.repository.PlayerRepository;
import ru.bstu.vt41.team1.lab_3.repository.TeamRepository;

@Controller
@RequestMapping(path = "/")
public class MainController {
    final private PlayerRepository playerRepository;
    final private TeamRepository teamRepository;

    @Autowired
    public MainController(PlayerRepository playerRepository, TeamRepository teamRepository) {
        this.playerRepository = playerRepository;
        this.teamRepository = teamRepository;
    }

    @GetMapping(path = "/addPlayer")
    public @ResponseBody
    String addPlayer(@RequestParam String firstName, @RequestParam String lastName) {
        Player player = new Player();
        player.setFirstName(firstName);
        player.setLastName(lastName);
        playerRepository.save(player);
        return "User " + firstName + " " + lastName + " created";
    }

    @GetMapping(path = "/all")
    public @ResponseBody
    Iterable<Player> getAllPlayers() {
        return playerRepository.findAll();
    }

    @PostMapping(path = "/team")
    public ResponseEntity<Team> addTeam(@RequestBody Team team1) {
        Team team = new Team();
        team.setName(team1.getName());
        teamRepository.save(team);
        return new ResponseEntity<>(team, HttpStatus.ACCEPTED);
    }

}
