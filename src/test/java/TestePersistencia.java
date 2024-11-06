/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import pf.cc0033.salaodebeleza.dao.PersistenciaJPA;
import pf.cc0033.salaodebeleza.entidade.Agenda;
import pf.cc0033.salaodebeleza.entidade.Agendamento;
import pf.cc0033.salaodebeleza.entidade.Cliente;
import pf.cc0033.salaodebeleza.entidade.Funcionario;
import pf.cc0033.salaodebeleza.entidade.PerfilCliente;
import pf.cc0033.salaodebeleza.entidade.Servico;
import pf.cc0033.salaodebeleza.entidade.TipoFuncionario;

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
     
         Cliente c = new Cliente();
         c.setCpf("01026549051");
         c.setNome("Gabrieli");
         c.setTelefone("123456789");
         c.setPerfilCliente(PerfilCliente.PREMIUM);
         
         
         Funcionario f = new Funcionario();
         f.setCpf("65478932564");
         f.setTelefone("123564789");
         f.setTipoFuncionario(TipoFuncionario.MAQUIADORA);
         f.setNome("Celia");
         
         Servico s = new Servico();
         s.setDescricao("esmaltação em gel");
         s.setValorUnitario(25.00);
         s.setMaximoDesconto(10.00);
         
         
         Agenda agenda = new Agenda();
         agenda.setFuncionario(f);
         agenda.setHorarioMarcado(new Date());
         
         
         
         Agendamento agendamento = new Agendamento();
         agendamento.setCliente(c);
         agendamento.setFuncionario(f);
         
         String dataString = "2024-12-22 14:30:00";
            
         SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
           
        try {
          Date data = formato.parse(dataString);
            agendamento.setData(data);
        } catch (ParseException ex) {
            Logger.getLogger(TestePersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        agendamento.addServicos(s);
        agendamento.setAgenda(agenda);
        agenda.addAgendamentos(agendamento);
        f.setAgenda(agenda);
         
         try {
             jpa.persist(c);
             jpa.persist(f);
             jpa.persist(s);
             jpa.persist(agenda);
             jpa.persist(agendamento);
         } catch (Exception ex) {
             
             System.err.println("Erro ao persistir dadossssssss.");
         }
     
     
     }
}
