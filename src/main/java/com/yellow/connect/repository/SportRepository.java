package com.yellow.connect.repository;

import com.yellow.connect.model.Sport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SportRepository extends JpaRepository<Sport,Long> {
}
