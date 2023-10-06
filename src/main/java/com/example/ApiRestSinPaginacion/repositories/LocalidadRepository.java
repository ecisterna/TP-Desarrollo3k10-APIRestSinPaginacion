package com.example.ApiRestSinPaginacion.repositories;

import com.example.ApiRestSinPaginacion.entities.Localidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalidadRepository extends BaseRepository<Localidad,Long> {
}
