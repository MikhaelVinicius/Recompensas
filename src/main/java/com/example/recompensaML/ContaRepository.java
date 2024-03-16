package com.example.recompensaML;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ContaRepository extends JpaRepository<Conta,Long> {
    
}
