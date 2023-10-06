package com.example.ApiRestSinPaginacion.services;

import com.example.ApiRestSinPaginacion.entities.Autor;
import com.example.ApiRestSinPaginacion.repositories.AutorRepository;
import com.example.ApiRestSinPaginacion.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor, Long> implements AutorService{
    @Autowired
    private AutorRepository autorRepository;

    public AutorServiceImpl(BaseRepository<Autor, Long> baseRepository) {
        super(baseRepository);
    }
}
