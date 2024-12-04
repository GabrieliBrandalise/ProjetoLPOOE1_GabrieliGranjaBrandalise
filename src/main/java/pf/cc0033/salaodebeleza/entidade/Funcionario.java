/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pf.cc0033.salaodebeleza.entidade;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author ggbra
 */
@Entity
@Table(name="tb_funcionario")
public class Funcionario extends Pessoa implements Serializable{
    
    @Enumerated(EnumType.STRING)
    private TipoFuncionario tipoFuncionario;
    
    @OneToOne(mappedBy = "funcionario", cascade = CascadeType.ALL)
    private Agenda agenda;
    
    
    
    public Funcionario(){
      
    } 
    
    
    public TipoFuncionario getTipoFuncionario() {
        return tipoFuncionario;
    }

    public void setTipoFuncionario(TipoFuncionario tipoFuncionario) {
        this.tipoFuncionario = tipoFuncionario;
    }

    public Agenda getAgenda() {
        return agenda;
    }

    public void setAgenda(Agenda agenda) {
        this.agenda = agenda;
    }
    
    @Override
    public String toString() {
        return  "id: " + super.getId() + ", nome: " + super.getNome() + ", cargo: " + tipoFuncionario;
    }
}
