package com.ent.test;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResAddress extends JpaRepository<EntAddress , Long> {
}