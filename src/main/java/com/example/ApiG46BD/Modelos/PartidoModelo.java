package com.example.ApiG46BD.Modelos;

import org.springframework.data.annotation.Id;

public class PartidoModelo {

    @Id
    private Long idPartido;
    private String categoria;
    private String evento;
    private String equipolocal;
    private String equipovisitante;
    private String marcador;

    public Long getidPartido(){
        return idPartido;
    }
    public void setIdPartido(Long idPartido) {
        this.idPartido = idPartido;
    }

    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public String getEvento() {
        return evento;
    }
    public void setEvento(String evento) {
        this.evento = evento;
    }
    public String getEquipolocal() {
        return equipolocal;
    }
    public void setEquipolocal(String equipolocal) {
        this.equipolocal = equipolocal;
    }
    public String getEquipovisitante() {
        return equipovisitante;
    }
    public void setEquipovisitante(String equipovisitante) {
        this.equipovisitante = equipovisitante;
    }
    public String getMarcador() {
        return marcador;
    }
    public void setMarcador(String marcador) {
        this.marcador = marcador;
    }
}