/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pf.cc0033.salaodebeleza.entidade;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author ggbra
 */
@Entity
@Table(name="tb_agenda")
public class Agenda implements Serializable {
    
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Id
    private Integer id;
    
    @OneToOne
    @JoinColumn(name = "agendamento_id")
    private Agendamento agendamento;
    
    @ManyToOne
    @JoinColumn(name = "funcionario_id")
    private Funcionario funcionario;
     
    @Column(name="horariomarcado")
    private Date horarioMarcado;

    
    public Agendamento getAgendamento() {
        return agendamento;
    }

    public void setAgendamento(Agendamento agendamento) {
        this.agendamento = agendamento;
    }

    public Date getHorarioMarcado() {
        return horarioMarcado;
    }

    public void setHorarioMarcado(Date horarioMarcado) {
        this.horarioMarcado = horarioMarcado;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
