package com.example.ApiG46BD.Servicios;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ApiG46BD.Modelos.PartidoModelo;
import com.example.ApiG46BD.Repositorios.PartidoRepositorio;


@Service
public class PartidoServicio {
    // instanciamos modelos de repository para usar.
    @Autowired
    PartidoRepositorio repositorio;

    public PartidoModelo guardaPartido(PartidoModelo partido){
        // metodo guardar dato patido, despues de public se escribe que retorna el metodo, en el parentesis lo que recibe
        //retorna un partido modelo y recibe un partido modelo para almacenar en mongo
        return repositorio.save(partido);
        //metodo pre hecho del repositorio que guarda los datos que manda el cliente del usuario
    }
    
    // metodo buscar todos los partidos 
     public ArrayList<PartidoModelo> consultarPartidos(){
        return (ArrayList<PartidoModelo>) repositorio.findAll();
     }

    //metodos para buscar un partido por tipo de dato (categoría, evento o equipo)
    public Optional<PartidoModelo>  consultarPartido(Long idPartido){
        return repositorio.findById(idPartido);
    }
    //metodos para buscar un partido por tipo de dato (categoría, evento o equipo)
    
    public ArrayList<PartidoModelo>  buscarPartidoxCategoria(String categoria){
        return repositorio.findByCategoria(categoria);
    }

    public ArrayList<PartidoModelo> buscarPartidoxEvento(String evento){
        return (ArrayList<PartidoModelo>) repositorio.findByEvento(evento);
    }
    
    public ArrayList<PartidoModelo> buscarPartidoxEquipo(String equipo){
        return (ArrayList<PartidoModelo>) repositorio.findByEquipolocalOrEquipovisitante(equipo, equipo);
    

    }
    

    //metodo para eliminar un partido, returna un boolena. Si elimino true, si no elimino false.
    public boolean eliminarPartido(Long idPartido){
        if (repositorio.existsById(idPartido)){
                repositorio.deleteById(idPartido);
                return true;
        }
        else{
            return false;
        }
    }
}

/*
{
    "idPartido":1,
    "categoria":"femenino",
    "evento":"liga aguila",
    "equipolocal":"junior",
    "equipovisitante":"medellin",
    "marcador":"2-0"
}
*/
