package com.example.ApiG46BD.Repositorios;

import java.util.ArrayList;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.ApiG46BD.Modelos.PartidoModelo;

public interface PartidoRepositorio extends MongoRepository<PartidoModelo, Long> {
    ArrayList<PartidoModelo> findBycategoria (String categoria);
    ArrayList<PartidoModelo> findByevento (String evento);
    ArrayList<PartidoModelo> findByequipo (String equipo);   
}
