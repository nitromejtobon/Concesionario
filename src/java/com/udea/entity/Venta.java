/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author hector.guerra
 */
@Entity
@Table(name = "Venta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Venta.findAll", query = "SELECT v FROM Venta v")
    , @NamedQuery(name = "Venta.findByTipodoc", query = "SELECT v FROM Venta v WHERE v.tipodoc = :tipodoc")
    , @NamedQuery(name = "Venta.findByNumCliente", query = "SELECT v FROM Venta v WHERE v.numCliente = :numCliente")
    , @NamedQuery(name = "Venta.findByIdVenta", query = "SELECT v FROM Venta v WHERE v.idVenta = :idVenta")
    , @NamedQuery(name = "Venta.findByFechaVenta", query = "SELECT v FROM Venta v WHERE v.fechaVenta = :fechaVenta")
    , @NamedQuery(name = "Venta.findByPrecio", query = "SELECT v FROM Venta v WHERE v.precio = :precio")
    , @NamedQuery(name = "Venta.findByMatricula", query = "SELECT v FROM Venta v WHERE v.matricula = :matricula")})
public class Venta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "Tipo_doc")
    private String tipodoc;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "num_Cliente")
    private String numCliente;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "id_Venta")
    private String idVenta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fechaVenta")
    @Temporal(TemporalType.DATE)
    private Date fechaVenta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Precio")
    private int precio;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 6)
    @Column(name = "Matricula")
    private String matricula;

    public Venta() {
    }

    public Venta(String idVenta) {
        this.idVenta = idVenta;
    }

    public Venta(String idVenta, String tipodoc, String numCliente, Date fechaVenta, int precio, String matricula) {
        this.idVenta = idVenta;
        this.tipodoc = tipodoc;
        this.numCliente = numCliente;
        this.fechaVenta = fechaVenta;
        this.precio = precio;
        this.matricula = matricula;
    }

    public String getTipodoc() {
        return tipodoc;
    }

    public void setTipodoc(String tipodoc) {
        this.tipodoc = tipodoc;
    }

    public String getNumCliente() {
        return numCliente;
    }

    public void setNumCliente(String numCliente) {
        this.numCliente = numCliente;
    }

    public String getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(String idVenta) {
        this.idVenta = idVenta;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idVenta != null ? idVenta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Venta)) {
            return false;
        }
        Venta other = (Venta) object;
        if ((this.idVenta == null && other.idVenta != null) || (this.idVenta != null && !this.idVenta.equals(other.idVenta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.udea.entity.Venta[ idVenta=" + idVenta + " ]";
    }
    
}
