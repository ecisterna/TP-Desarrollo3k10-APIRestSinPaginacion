package com.example.ApiRestSinPaginacion.repositories;

import com.example.ApiRestSinPaginacion.entities.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepository extends BaseRepository<Autor,Long> {
}
