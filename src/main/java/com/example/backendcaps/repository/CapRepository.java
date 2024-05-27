package com.example.backendcaps.repository;

import com.example.backendcaps.entity.Cap;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CapRepository extends JpaRepository<Cap, Long> {
}
