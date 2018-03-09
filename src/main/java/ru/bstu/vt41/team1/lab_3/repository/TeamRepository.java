package ru.bstu.vt41.team1.lab_3.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.bstu.vt41.team1.lab_3.model.Team;

@Repository
public interface TeamRepository extends CrudRepository<Team, Long> {
}
