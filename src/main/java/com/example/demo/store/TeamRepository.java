package com.example.demo.store;

import com.example.demo.model.Project;
import com.example.demo.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface TeamRepository extends JpaRepository<Team, Integer> {
    @Query(value = "SELECT t.teamid, t.developers FROM Project " +
            "INNER JOIN team t on t.teamid = project.teamid " +
            "WHERE project.projectid = :projectId", nativeQuery = true)
    public Team getTeamByProject(@Param("projectId") int id);

    @Modifying
    @Transactional
    @Query(value = "UPDATE Team SET developers = developers - :developers WHERE teamId = :teamId", nativeQuery = true)
    int assignDevelopers(@Param("developers") int devs,
                        @Param("teamId") int id);
}
