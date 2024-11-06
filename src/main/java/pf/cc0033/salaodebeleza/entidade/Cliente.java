/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pf.cc0033.salaodebeleza.entidade;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author ggbra
 */
@Entity
@Table(name="tb_cliente")
public class Cliente extends Pessoa implements Serializable{
    
    @Enumerated(EnumType.STRING)
    private PerfilCliente perfilCliente;
    
    @OneToMany(mappedBy = "cliente")
    private List<Agendamento> agendamentos;
    
    
    
    public Cliente(){
        this.agendamentos = new ArrayList<>();
    }

    
    
    
    public PerfilCliente getPerfilCliente() {
        return perfilCliente;
    }

    public void setPerfilCliente(PerfilCliente perfilCliente) {
        this.perfilCliente = perfilCliente;
    }

    public List<Agendamento> getAgendamentos() {
        return agendamentos;
    }

    public void setAgendamentos(List<Agendamento> agendamentos) {
        this.agendamentos = agendamentos;
    }
    
    public void addAgendamento(Agendamento agendamento){
        this.agendamentos.add(agendamento);
    }
    
}
