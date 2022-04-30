package com.g.aposta.repository;

import com.g.aposta.model.aposta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface apostaRepository extends JpaRepository<aposta, String>
{
}
