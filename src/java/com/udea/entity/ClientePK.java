/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author hector.guerra
 */
@Embeddable
public class ClientePK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "TIpo_doc")
    private String tIpodoc;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "Numero")
    private String numero;

    public ClientePK() {
    }

    public ClientePK(String tIpodoc, String numero) {
        this.tIpodoc = tIpodoc;
        this.numero = numero;
    }

    public String getTIpodoc() {
        return tIpodoc;
    }

    public void setTIpodoc(String tIpodoc) {
        this.tIpodoc = tIpodoc;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tIpodoc != null ? tIpodoc.hashCode() : 0);
        hash += (numero != null ? numero.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ClientePK)) {
            return false;
        }
        ClientePK other = (ClientePK) object;
        if ((this.tIpodoc == null && other.tIpodoc != null) || (this.tIpodoc != null && !this.tIpodoc.equals(other.tIpodoc))) {
            return false;
        }
        if ((this.numero == null && other.numero != null) || (this.numero != null && !this.numero.equals(other.numero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.udea.entity.ClientePK[ tIpodoc=" + tIpodoc + ", numero=" + numero + " ]";
    }
    
}
