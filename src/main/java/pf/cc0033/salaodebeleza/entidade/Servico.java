/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pf.cc0033.salaodebeleza.entidade;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author ggbra
 */
@Entity
@Table(name="tb_servico")
public class Servico implements Serializable{
    
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Id
    private Integer id;

    @Column(name="descricao", length = 150)
    private String descricao;
    
    @Column(name="valorunitario")
    private Double valorUnitario;
    
    @Column(name="maximodesconto")
    private Double maximoDesconto;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public Double getMaximoDesconto() {
        return maximoDesconto;
    }

    public void setMaximoDesconto(Double maximoDesconto) {
        this.maximoDesconto = maximoDesconto;
    }
    
    public Integer getId() {
        return id;
    }
}
