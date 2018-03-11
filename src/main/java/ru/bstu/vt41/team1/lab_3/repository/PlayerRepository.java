package ru.bstu.vt41.team1.lab_3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.bstu.vt41.team1.lab_3.model.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {
}
