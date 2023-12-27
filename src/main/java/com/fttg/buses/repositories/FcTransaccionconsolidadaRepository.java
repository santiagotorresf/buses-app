/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.fttg.buses.repositories;

import com.fttg.buses.dtos.TransaccionConsolidadaDto;
import com.fttg.buses.entities.FcTransaccionconsolidada;
import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author storres
 */
@Repository
public interface FcTransaccionconsolidadaRepository extends JpaRepository<FcTransaccionconsolidada, Integer> {

    @Query(nativeQuery = true)
    public List<TransaccionConsolidadaDto> findTransaccionCosolidadaByFecha(Date fechaIni, Date fechaFin);

}
