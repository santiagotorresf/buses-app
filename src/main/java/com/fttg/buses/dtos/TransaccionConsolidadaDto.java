/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fttg.buses.dtos;

/**
 *
 * @author storres
 */
public class TransaccionConsolidadaDto {
    
    private Integer idUnidad;
    private Integer idCooperativa;
    private String cooperativa;
    private String disco;

    public TransaccionConsolidadaDto(Integer idUnidad, Integer idCooperativa, String cooperativa, String disco) {
        this.idUnidad = idUnidad;
        this.idCooperativa = idCooperativa;
        this.cooperativa = cooperativa;
        this.disco = disco;
    }
    
    public Integer getIdUnidad() {
        return idUnidad;
    }

    public void setIdUnidad(Integer idUnidad) {
        this.idUnidad = idUnidad;
    }

    public Integer getIdCooperativa() {
        return idCooperativa;
    }

    public void setIdCooperativa(Integer idCooperativa) {
        this.idCooperativa = idCooperativa;
    }

    public String getCooperativa() {
        return cooperativa;
    }

    public void setCooperativa(String cooperativa) {
        this.cooperativa = cooperativa;
    }

    public String getDisco() {
        return disco;
    }

    public void setDisco(String disco) {
        this.disco = disco;
    }

    @Override
    public String toString() {
        return "TransaccionConsolidadaDto{" + "idUnidad=" + idUnidad + ", idCooperativa=" + idCooperativa + ", cooperativa=" + cooperativa + ", disco=" + disco + '}';
    }
    
}
