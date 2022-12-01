package com.finalsem.cms.repositories;

import com.finalsem.cms.entities.Assignment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssignmentRepo extends JpaRepository<Assignment,Integer> {
}
