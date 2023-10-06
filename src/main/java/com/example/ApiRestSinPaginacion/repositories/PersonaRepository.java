package com.example.ApiRestSinPaginacion.repositories;

import com.example.ApiRestSinPaginacion.entities.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends BaseRepository<Persona,Long> {

}
