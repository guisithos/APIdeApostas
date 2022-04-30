package com.g.aposta.repository;

import com.g.aposta.model.aposta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface apostaRepository extends JpaRepository<aposta, String> {

    @Query(value = "SELECT * FROM aposta WHERE id_Apostador = ?", nativeQuery = true)
    List<aposta> findByIDApostador(@Param("idApostador") Long idApostador);
}
