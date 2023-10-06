package com.example.ApiRestSinPaginacion.repositories;

import com.example.ApiRestSinPaginacion.entities.Domicilio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DomicilioRepository extends BaseRepository<Domicilio,Long> {
}
