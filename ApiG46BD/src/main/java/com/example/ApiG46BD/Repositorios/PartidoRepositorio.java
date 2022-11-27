package com.example.ApiG46BD.Repositorios;

import java.util.ArrayList;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.ApiG46BD.Modelos.PartidoModelo;

public interface PartidoRepositorio extends MongoRepository<PartidoModelo, Long> {
    ArrayList<PartidoModelo> findByCategoria (String categoria);
    ArrayList<PartidoModelo> findByEvento (String evento);
    ArrayList<PartidoModelo> findByEquipolocal (String equipolocal);
    ArrayList<PartidoModelo> findByEquipovisitante (String equipovisitante);
    ArrayList<PartidoModelo> findByEquipolocalOrEquipovisitante (String equipolocal, String equipovisitante);

}
