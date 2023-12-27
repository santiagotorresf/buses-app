/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fttg.buses.services;

import com.fttg.buses.dtos.TransaccionConsolidadaDto;
import com.fttg.buses.repositories.FcTransaccionconsolidadaRepository;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author storres
 */
@Service
public class FcTransaccionconsolidadaService {
    
    @Autowired
    private FcTransaccionconsolidadaRepository repo;
    
    public List<TransaccionConsolidadaDto> getTransaccionesByFecha(Date fechaIni, Date fechaFin) {
        return repo.findTransaccionCosolidadaByFecha(fechaIni, fechaFin);
    }
}
