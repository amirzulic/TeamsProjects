package com.example.demo.store;

import com.example.demo.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer> {
    @Modifying
    @Transactional
    @Query(value = "UPDATE Project SET active = 0 WHERE projectId = :projectId", nativeQuery = true)
    int completeProject(@Param("projectId") int id);
}
