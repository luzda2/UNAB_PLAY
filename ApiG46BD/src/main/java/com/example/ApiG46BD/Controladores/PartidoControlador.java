package com.example.ApiG46BD.Controladores;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.ApiG46BD.Modelos.PartidoModelo;

@RequestMapping("/partido")
//http://localhost:8080/partido
public class PartidoControlador {
    @Autowired
    PartidoServicio.servicio;

    @PostMapping("/guardar")
    //http://localhost:8080/partido/guardar
    // metodo que reciba los datos para guardarlos
    public PartidoModelo guardaPartido(@RequestBody PartidoModelo partido){
        return servicio.guardaPartido(partido);
    }

    @GetMapping("/buscar")
    //http://localhost:8080/partido/buscar
    // metodo que nos da la lista de partidos guardados 
    public ArrayList<PartidoModelo> buscarPartido(){
        return servicio.buscarPartido();
    }

    @GetMapping("/buscarpartidoxcategoria/{categoria}")
    //http://localhost:8080/partido/buscarpartidoxcategiria
    public Optional<PartidoModelo> buscarPartidoxCategoria(@PathVariable("categoria") Long categoria){
        return servicio.buscarPartidoxCategoria(categoria);
    }

    @GetMapping("/buscarpartidoxevento/{evento}")
    //http://localhost:8080/partido/buscarpartidoxevento
    public Optional<PartidoModelo> buscarPartidoxEvento(@PathVariable("evento") Long evento){
        return servicio.buscarPartidoxEvento(evento);
    }

    @GetMapping("/buscarpartidoxequipo/{equipo}")
    //http://localhost:8080/partido/buscarpartidoxequipo
    public Optional<PartidoModelo> buscarPartidoxEquipo(@PathVariable("equipo") Long equipo){
        return servicio.buscarPartidoxEquipo(equipo);
    }

    @DeleteMapping("/eliminar/{partido}")
    //http://localhost:8080/partido/eliminar
    public boolean eliminarPartido(@PathVariable Long partido){
        return servicio.eliminarPartido(partido);
    }

}
    

