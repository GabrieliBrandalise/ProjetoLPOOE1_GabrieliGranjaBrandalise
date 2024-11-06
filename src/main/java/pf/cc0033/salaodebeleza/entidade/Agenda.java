/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pf.cc0033.salaodebeleza.entidade;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author ggbra
 */
@Entity
@Table(name="tb_agenda")
public class Agenda implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Integer id;
    
    @OneToMany(mappedBy = "agenda")
    private List<Agendamento> agendamentos;    
    
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    @Column(name="horariomarcado")
    private Date horarioMarcado;
    
    @OneToOne
    @JoinColumn(name = "funcionario_id", unique = true)
    private Funcionario funcionario;
    
    
    
    public Agenda(){
        this.agendamentos = new ArrayList<>();
    }

    
    
    
    public Integer getId() {
        return id;
    }


    public Date getHorarioMarcado() {
        return horarioMarcado;
    }

    public void setHorarioMarcado(Date horarioMarcado) {
        this.horarioMarcado = horarioMarcado;
    }

    public List<Agendamento> getAgendamentos() {
        return agendamentos;
    }

    public void setAgendamentos(List<Agendamento> agendamentos) {
        this.agendamentos = agendamentos;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    
    public void addAgendamentos(Agendamento agendamento){
        this.agendamentos.add(agendamento);
    }
}
