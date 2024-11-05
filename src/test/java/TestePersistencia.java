/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */


import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pf.cc0033.salaodebeleza.dao.PersistenciaJPA;
import pf.cc0033.salaodebeleza.entidade.Agenda;
import pf.cc0033.salaodebeleza.entidade.Agendamento;
import pf.cc0033.salaodebeleza.entidade.Cliente;
import pf.cc0033.salaodebeleza.entidade.Funcionario;
import pf.cc0033.salaodebeleza.entidade.Pessoa;
import pf.cc0033.salaodebeleza.entidade.Servico;


/**
 *
 * @author ggbra
 */

public class TestePersistencia {
    PersistenciaJPA jpa = new PersistenciaJPA();
    public TestePersistencia() {
    }
    
    @Before
    public void setUp() {
        jpa.conexaoAberta();
    }
    
    @After
    public void tearDown() {
        jpa.fecharConexao();
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void testePersistencia() {
         Pessoa p = new Pessoa();
         p.setCpf("10259874561");
         p.setNome("Gabrieli");
         p.setTelefone("87556310254");
         
         Cliente c = new Cliente();
         c.setCpf(p.getCpf());
         c.setNome(p.getNome());
         c.setTelefone(p.getTelefone());
   
         
         Funcionario f = new Funcionario();
        f.setCpf("20315487965");
        f.setNome("Carlos");
        f.setTelefone("99874563120");

         Agendamento agendamento = new Agendamento();
        agendamento.setCliente(c);
        agendamento.setFuncionario(f);
        agendamento.setData(new java.util.Date());
         
        
         Servico s = new Servico();
        s.setDescricao("Corte de Cabelo");
        s.setValorUnitario(50.0);
        s.setMaximoDesconto(10.0);
         
         List<Agendamento> agendamentosCliente = new ArrayList<>();
        agendamentosCliente.add(agendamento);
        c.setAgendamentos(agendamentosCliente);
        
        Agenda agenda = new Agenda();
        agenda.setAgendamento(agendamento);
        agenda.setHorarioMarcado(new java.util.Date());  

        List<Agenda> agendasFuncionario = new ArrayList<>();
        agendasFuncionario.add(agenda);
        f.setAgendaHorariosMarcados(agendasFuncionario);

        try {
            jpa.getEntityManager().getTransaction().begin();
            jpa.persist(p);
            jpa.persist(c);
            jpa.persist(f);
            jpa.persist(s);
            jpa.persist(agenda);
            jpa.persist(agendamento);
            jpa.getEntityManager().getTransaction().commit();
           
        } catch (Exception ex) {
            System.err.println("Erro ao persistir dados.");
        }
     }
}
