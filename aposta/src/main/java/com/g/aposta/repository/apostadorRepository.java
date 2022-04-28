package com.g.aposta.repository;

import com.g.aposta.model.apostador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface apostadorRepository extends JpaRepository<apostador, Long> {

}
