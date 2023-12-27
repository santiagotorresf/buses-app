/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fttg.buses.controllers;

import com.fttg.buses.dtos.TransaccionConsolidadaDto;
import com.fttg.buses.services.FcTransaccionconsolidadaService;
import java.util.Date;
import java.util.List;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author storres
 */
@RestController
@Log4j2
@RequestMapping("/api/v1/bus")
public class FcTransaccionconsolidadaController {

    @Autowired
    private FcTransaccionconsolidadaService fcTransaccionconsolidadaService;
    
    /**
     *
     * @param fechaIni
     * @param fechaFin
     * @return
     */
    @GetMapping("/transacciones")
    public ResponseEntity<List<TransaccionConsolidadaDto>> getTransaccionesByFecha(
            @RequestParam(name = "fechaIni", defaultValue = "#{new java.util.Date()}")
            //@DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date fechaIni,
            @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm") Date fechaIni,
            @RequestParam(name = "fechaFin", defaultValue = "#{new java.util.Date()}")
            //@DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date fechaFin)
            @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") Date fechaFin) {
        log.info("Fecha Ini: "+fechaIni);
        log.info("Fecha Fin: "+fechaFin);
        return new ResponseEntity<>(fcTransaccionconsolidadaService.getTransaccionesByFecha(fechaIni, fechaFin), HttpStatus.OK);
    }
    
    

}
