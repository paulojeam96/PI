/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.pi.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author paulo.lima
 */
@Entity
@Table(name = "PEDIDO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pedido.findAll", query = "SELECT p FROM Pedido p")
    , @NamedQuery(name = "Pedido.findById", query = "SELECT p FROM Pedido p WHERE p.id = :id")
    , @NamedQuery(name = "Pedido.findByDestinatario", query = "SELECT p FROM Pedido p WHERE p.destinatario = :destinatario")
    , @NamedQuery(name = "Pedido.findByRemetente", query = "SELECT p FROM Pedido p WHERE p.remetente = :remetente")
    , @NamedQuery(name = "Pedido.findByTipoDocumento", query = "SELECT p FROM Pedido p WHERE p.tipoDocumento = :tipoDocumento")
    , @NamedQuery(name = "Pedido.findByEntregaRealizada", query = "SELECT p FROM Pedido p WHERE p.entregaRealizada = :entregaRealizada")
    , @NamedQuery(name = "Pedido.findByEndereco", query = "SELECT p FROM Pedido p WHERE p.endereco = :endereco")
    , @NamedQuery(name = "Pedido.findByPreco", query = "SELECT p FROM Pedido p WHERE p.preco = :preco")})
public class Pedido implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Size(max = 40)
    @Column(name = "DESTINATARIO")
    private String destinatario;
    @Size(max = 40)
    @Column(name = "REMETENTE")
    private String remetente;
    @Size(max = 40)
    @Column(name = "TIPO_DOCUMENTO")
    private String tipoDocumento;
    @Size(max = 3)
    @Column(name = "ENTREGA_REALIZADA")
    private String entregaRealizada;
    @Size(max = 40)
    @Column(name = "ENDERECO")
    private String endereco;
    @Column(name = "PRECO")
    private Integer preco;

    public Pedido() {
    }
    
    public Pedido(String tipoDocumento, String destinatario, String remetente, String endereco, int preco, String entregaEfetuada) {
        this.tipoDocumento = tipoDocumento;
        this.destinatario = destinatario;
        this.remetente = remetente;
        this.endereco = endereco;
        this.preco = preco;
        this.entregaRealizada = entregaEfetuada;
    }
    
    public Pedido(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getRemetente() {
        return remetente;
    }

    public void setRemetente(String remetente) {
        this.remetente = remetente;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getEntregaRealizada() {
        return entregaRealizada;
    }

    public void setEntregaRealizada(String entregaRealizada) {
        this.entregaRealizada = entregaRealizada;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Integer getPreco() {
        return preco;
    }

    public void setPreco(Integer preco) {
        this.preco = preco;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pedido)) {
            return false;
        }
        Pedido other = (Pedido) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.br.pi.entities.Pedido[ id=" + id + " ]";
    }
    
}
