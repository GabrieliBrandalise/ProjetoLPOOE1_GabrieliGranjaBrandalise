/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pf.cc0033.salaodebeleza.entidade;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

/**
 *
 * @author ggbra
 */
@Entity(name="tb_funcionario")
public class Funcionario extends Pessoa{
    
    @OneToMany(mappedBy = "funcionario", cascade = CascadeType.ALL)
    private List<Agenda> agendaHorariosMarcados;
    
    public List<Agenda> getAgendaHorariosMarcados() {
        return agendaHorariosMarcados;
    }

    public void setAgendaHorariosMarcados(List<Agenda> agendaHorariosMarcados) {
        this.agendaHorariosMarcados = agendaHorariosMarcados;
    }
    
}
