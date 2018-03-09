package ru.bstu.vt41.team1.lab_3.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.bstu.vt41.team1.lab_3.model.Player;

@Repository
public interface PlayerRepository extends CrudRepository<Player, Long> {
}
