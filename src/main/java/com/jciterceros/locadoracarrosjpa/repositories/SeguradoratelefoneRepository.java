package com.jciterceros.locadoracarrosjpa.repositories;

import com.jciterceros.locadoracarrosjpa.entities.Seguradoratelefone;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SeguradoratelefoneRepository extends JpaRepository<Seguradoratelefone, Long> {
    boolean existsBySeguradoraId(Long id);
}
