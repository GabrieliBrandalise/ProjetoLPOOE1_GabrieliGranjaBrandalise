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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author ggbra
 */

@Entity
@Table(name="tb_agendamento")
public class Agendamento implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Integer id;
    
    @ManyToMany
    @JoinTable(
        name = "tb_agendamentoservico",
        joinColumns = @JoinColumn(name = "agendamento_id"),
        inverseJoinColumns = @JoinColumn(name = "servico_id")
    )
    private List<Servico> servicos;
    
    @ManyToOne
    @JoinColumn(name="cliente_id")
    private Cliente cliente;
    
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    @Column(name="data")
    private Date data;
    
    @ManyToOne
    @JoinColumn(name="funcionario_id")
    private Funcionario funcionario;
    
    @ManyToOne
    @JoinColumn(name="agenda_id")
    private Agenda agenda;
    
    
    
    public Agendamento(){
        this.servicos = new ArrayList<>();
    }
    
    
    
    
    public Integer getId() {
        return id;
    }


    public List<Servico> getServicos() {
        return servicos;
    }

    public void setServicos(List<Servico> servicos) {
        this.servicos = servicos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Agenda getAgenda() {
        return agenda;
    }

    public void setAgenda(Agenda agenda) {
        this.agenda = agenda;
    }
    
    public void addServicos(Servico s){
        this.servicos.add(s);
    }
}
