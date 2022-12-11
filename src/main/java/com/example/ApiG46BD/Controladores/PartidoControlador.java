package com.example.ApiG46BD.Controladores;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;


import com.example.ApiG46BD.Modelos.PartidoModelo;
import com.example.ApiG46BD.Servicios.PartidoServicio;


@RestController
@RequestMapping("/partido")
@CrossOrigin("*")
//http://localhost:8080/partido
public class PartidoControlador {
    @Autowired
    PartidoServicio servicio;

    @PostMapping("/guardar")    
    //http://localhost:8080/partido/guardar
    // metodo que reciba los datos para guardarlos
    public PartidoModelo guardaPartido(@RequestBody PartidoModelo partido){
        return servicio.guardaPartido(partido);
    }

    @GetMapping("/consultar")
    //http://localhost:8080/partido/consultar
    //metodo para buscar todos los partidos
    public ArrayList<PartidoModelo> consultarPartidos(){
        return servicio.consultarPartidos();
    }

    @GetMapping("/consultarpartido/{idPartido}")
    //http://localhost:8080/partido/consultarpartido/1
    //metodo para consultar partido por ID de partido
    public Optional<PartidoModelo> consultarPartido(@PathVariable("idPartido") Long idPartido){
        return servicio.consultarPartido(idPartido);
    }

    @GetMapping("/buscarpartidoxcategoria/{categoria}")
    //http://localhost:8080/partido/buscarpartidoxcategoria
    public ArrayList<PartidoModelo> buscarPartidoxCategoria(@PathVariable("categoria") String categoria){
        return servicio.buscarPartidoxCategoria(categoria);
    }
    
    @GetMapping("/buscarpartidoxevento/{evento}")
    //http://localhost:8080/partido/buscarpartidoxevento
    public ArrayList<PartidoModelo> buscarPartidoxEvento(@PathVariable("evento") String evento){
        return servicio.buscarPartidoxEvento(evento);
    }

    @GetMapping("/buscarpartidoxequipo/{equipo}")
    //http://localhost:8080/partido/buscarpartidoxequipo
    public ArrayList<PartidoModelo> buscarPartidoxEquipolocal(@PathVariable("equipo") String equipo){
        return servicio.buscarPartidoxEquipo(equipo);
    }


    @DeleteMapping("/eliminar/{idPartido}")
    //http://localhost:8080/partido/eliminar
    public boolean eliminarPartido(@PathVariable Long idPartido){
        return servicio.eliminarPartido(idPartido);
    }

}
    

