/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fttg.buses.entities;

import com.fttg.buses.dtos.TransaccionConsolidadaDto;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author storres
 */
@Entity
@Table(name = "FC_TRANSACCIONCONSOLIDADA")

@NamedNativeQuery(name = "FcTransaccionconsolidada.findTransaccionCosolidadaByFecha",
        query = "select distinct FC_TRANSACCIONCONSOLIDADA.TN_IDUNIDAD idUnidad, FC_TRANSACCIONCONSOLIDADA.TN_IDCOOPE idCooperativa, FC_COOPERATIVA.CP_NOMBRE cooperativa, FC_UNIDAD.ND_DISCO disco from FC_TRANSACCIONCONSOLIDADA inner join FC_COOPERATIVA on FC_TRANSACCIONCONSOLIDADA.TN_IDCOOPE = FC_COOPERATIVA.CP_ID inner join FC_UNIDAD on FC_TRANSACCIONCONSOLIDADA.TN_IDUNIDAD = FC_UNIDAD.ND_ID where FC_TRANSACCIONCONSOLIDADA.TN_FECHA between ?1 and ?2 order by FC_TRANSACCIONCONSOLIDADA.TN_IDUNIDAD;",
        resultSetMapping = "Mapping.TransaccionConsolidadaDto")
@SqlResultSetMapping(name = "Mapping.TransaccionConsolidadaDto",
        classes = @ConstructorResult(targetClass = TransaccionConsolidadaDto.class,
                columns = {
                    @ColumnResult(name = "idUnidad"),
                    @ColumnResult(name = "idCooperativa"),
                    @ColumnResult(name = "cooperativa"),
                    @ColumnResult(name = "disco")}))

public class FcTransaccionconsolidada implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "TN_ID")
    private Integer tnId;
    @Basic(optional = false)
    @Column(name = "TN_IDUNIDAD")
    private int tnIdunidad;
    @Basic(optional = false)
    @Column(name = "TN_IDCOOPE")
    private int tnIdcoope;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "TN_TOTAL")
    private BigDecimal tnTotal;
    @Basic(optional = false)
    @Column(name = "TN_PARQUEO")
    private BigDecimal tnParqueo;
    @Column(name = "TN_UNION")
    private BigDecimal tnUnion;
    @Column(name = "TN_FENACOTIP")
    private BigDecimal tnFenacotip;
    @Basic(optional = false)
    @Column(name = "TN_ANDENENT")
    private BigDecimal tnAndenent;
    @Basic(optional = false)
    @Column(name = "TN_ANDENSAL")
    private BigDecimal tnAndensal;
    @Basic(optional = false)
    @Column(name = "TN_FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tnFecha;
    @Basic(optional = false)
    @Column(name = "TN_SALDOINI")
    private BigDecimal tnSaldoini;
    @Basic(optional = false)
    @Column(name = "TN_SALDOFIN")
    private BigDecimal tnSaldofin;
    @Basic(optional = false)
    @Column(name = "TN_USERC")
    private String tnUserc;
    @Basic(optional = false)
    @Column(name = "TN_PROCESADO")
    private boolean tnProcesado;
    @Column(name = "TN_ULTIMOPARQUEO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tnUltimoparqueo;
    @Column(name = "TN_PARQUEOENT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tnParqueoent;
    @Column(name = "TN_PARQUEOSAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tnParqueosal;
    @Column(name = "TN_ORIGEN")
    private Integer tnOrigen;
    @Column(name = "TN_COT")
    private Long tnCot;
    @Column(name = "TN_TERMINAL")
    private Integer tnTerminal;

    public FcTransaccionconsolidada() {
    }

    public FcTransaccionconsolidada(Integer tnId) {
        this.tnId = tnId;
    }

    public FcTransaccionconsolidada(Integer tnId, int tnIdunidad, int tnIdcoope, BigDecimal tnTotal, BigDecimal tnParqueo, BigDecimal tnAndenent, BigDecimal tnAndensal, Date tnFecha, BigDecimal tnSaldoini, BigDecimal tnSaldofin, String tnUserc, boolean tnProcesado) {
        this.tnId = tnId;
        this.tnIdunidad = tnIdunidad;
        this.tnIdcoope = tnIdcoope;
        this.tnTotal = tnTotal;
        this.tnParqueo = tnParqueo;
        this.tnAndenent = tnAndenent;
        this.tnAndensal = tnAndensal;
        this.tnFecha = tnFecha;
        this.tnSaldoini = tnSaldoini;
        this.tnSaldofin = tnSaldofin;
        this.tnUserc = tnUserc;
        this.tnProcesado = tnProcesado;
    }

    public Integer getTnId() {
        return tnId;
    }

    public void setTnId(Integer tnId) {
        this.tnId = tnId;
    }

    public int getTnIdunidad() {
        return tnIdunidad;
    }

    public void setTnIdunidad(int tnIdunidad) {
        this.tnIdunidad = tnIdunidad;
    }

    public int getTnIdcoope() {
        return tnIdcoope;
    }

    public void setTnIdcoope(int tnIdcoope) {
        this.tnIdcoope = tnIdcoope;
    }

    public BigDecimal getTnTotal() {
        return tnTotal;
    }

    public void setTnTotal(BigDecimal tnTotal) {
        this.tnTotal = tnTotal;
    }

    public BigDecimal getTnParqueo() {
        return tnParqueo;
    }

    public void setTnParqueo(BigDecimal tnParqueo) {
        this.tnParqueo = tnParqueo;
    }

    public BigDecimal getTnUnion() {
        return tnUnion;
    }

    public void setTnUnion(BigDecimal tnUnion) {
        this.tnUnion = tnUnion;
    }

    public BigDecimal getTnFenacotip() {
        return tnFenacotip;
    }

    public void setTnFenacotip(BigDecimal tnFenacotip) {
        this.tnFenacotip = tnFenacotip;
    }

    public BigDecimal getTnAndenent() {
        return tnAndenent;
    }

    public void setTnAndenent(BigDecimal tnAndenent) {
        this.tnAndenent = tnAndenent;
    }

    public BigDecimal getTnAndensal() {
        return tnAndensal;
    }

    public void setTnAndensal(BigDecimal tnAndensal) {
        this.tnAndensal = tnAndensal;
    }

    public Date getTnFecha() {
        return tnFecha;
    }

    public void setTnFecha(Date tnFecha) {
        this.tnFecha = tnFecha;
    }

    public BigDecimal getTnSaldoini() {
        return tnSaldoini;
    }

    public void setTnSaldoini(BigDecimal tnSaldoini) {
        this.tnSaldoini = tnSaldoini;
    }

    public BigDecimal getTnSaldofin() {
        return tnSaldofin;
    }

    public void setTnSaldofin(BigDecimal tnSaldofin) {
        this.tnSaldofin = tnSaldofin;
    }

    public String getTnUserc() {
        return tnUserc;
    }

    public void setTnUserc(String tnUserc) {
        this.tnUserc = tnUserc;
    }

    public boolean getTnProcesado() {
        return tnProcesado;
    }

    public void setTnProcesado(boolean tnProcesado) {
        this.tnProcesado = tnProcesado;
    }

    public Date getTnUltimoparqueo() {
        return tnUltimoparqueo;
    }

    public void setTnUltimoparqueo(Date tnUltimoparqueo) {
        this.tnUltimoparqueo = tnUltimoparqueo;
    }

    public Date getTnParqueoent() {
        return tnParqueoent;
    }

    public void setTnParqueoent(Date tnParqueoent) {
        this.tnParqueoent = tnParqueoent;
    }

    public Date getTnParqueosal() {
        return tnParqueosal;
    }

    public void setTnParqueosal(Date tnParqueosal) {
        this.tnParqueosal = tnParqueosal;
    }

    public Integer getTnOrigen() {
        return tnOrigen;
    }

    public void setTnOrigen(Integer tnOrigen) {
        this.tnOrigen = tnOrigen;
    }

    public Long getTnCot() {
        return tnCot;
    }

    public void setTnCot(Long tnCot) {
        this.tnCot = tnCot;
    }

    public Integer getTnTerminal() {
        return tnTerminal;
    }

    public void setTnTerminal(Integer tnTerminal) {
        this.tnTerminal = tnTerminal;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tnId != null ? tnId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FcTransaccionconsolidada)) {
            return false;
        }
        FcTransaccionconsolidada other = (FcTransaccionconsolidada) object;
        if ((this.tnId == null && other.tnId != null) || (this.tnId != null && !this.tnId.equals(other.tnId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.fttg.buses.entities.FcTransaccionconsolidada[ tnId=" + tnId + " ]";
    }

}
