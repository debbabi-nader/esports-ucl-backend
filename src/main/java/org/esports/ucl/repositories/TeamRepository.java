package org.esports.ucl.repositories;

import org.esports.ucl.entities.TeamEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TeamRepository extends JpaRepository<TeamEntity, String> {

}
