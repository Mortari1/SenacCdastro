/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.pr.senaccadastros.model;
import java.util.List;
import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
/**
 *
 * @author henrique.4105
 */
@Entity(name = "snc_estado")
public class Estado {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "codigo_estado")
    private Integer codigoEstado;
    
    @Column(name = "nome_estado", length = 50, nullable = false)
    private String nomeEstado;
    
    @Column(name = "sigla_estado", length=2, nullable = false)
    private String siglaEstado;
    
    @OneToMany(mappedBy = "estado")
    private List<Cidade> listaCidades;

    /**
     * @return the nomeEstado
     */
    public String getNomeEstado() {
        return nomeEstado;
    }

    /**
     * @param nomeEstado the nomeEstado to set
     */
    public void setNomeEstado(String nomeEstado) {
        this.nomeEstado = nomeEstado;
    }

    /**
     * @return the siglaEstado
     */
    public String getSiglaEstado() {
        return siglaEstado;
    }

    /**
     * @param siglaEstado the siglaEstado to set
     */
    public void setSiglaEstado(String siglaEstado) {
        this.siglaEstado = siglaEstado;
    }

    /**
     * @return the codigoEstado
     */
    public Integer getCodigoEstado() {
        return codigoEstado;
    }

    /**
     * @param codigoEstado the codigoEstado to set
     */
    public void setCodigoEstado(Integer codigoEstado) {
        this.codigoEstado = codigoEstado;
    }

    /**
     * @return the listaCidades
     */
    public List<Cidade> getListaCidades() {
        return listaCidades;
    }

    /**
     * @param listaCidades the listaCidades to set
     */
    public void setListaCidades(List<Cidade> listaCidades) {
        this.listaCidades = listaCidades;
    }
    
    
}
