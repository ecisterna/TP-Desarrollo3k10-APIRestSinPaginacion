package com.example.ApiRestSinPaginacion.repositories;

import com.example.ApiRestSinPaginacion.entities.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepository extends BaseRepository<Libro,Long> {
}
