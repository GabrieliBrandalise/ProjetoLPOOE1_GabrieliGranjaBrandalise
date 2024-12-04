/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pf.cc0033.salaodebeleza.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import pf.cc0033.salaodebeleza.entidade.Agenda;
import pf.cc0033.salaodebeleza.entidade.Agendamento;



/**
 *
 * @author ggbra
 */
public class AgendaRepositorioJPA implements InterfaceBD {

    EntityManager entity;
    EntityManagerFactory factory;

    public AgendaRepositorioJPA() {
        factory = Persistence.createEntityManagerFactory("pu_lpoo_E1_GabrieliGranjaBrandalise");
        entity = factory.createEntityManager();
    }

    @Override
    public Boolean conexaoAberta() {
        return entity.isOpen();
    }

    @Override
    public void fecharConexao() {
        entity.close();
    }

    @Override
    public Object find(Class c, Object id) throws Exception {
        return entity.find(c, id);
    }

    @Override
    public void persist(Object o) throws Exception {
        entity = getEntityManager();
        try {
            entity.getTransaction().begin();
            entity.persist(o);
            entity.getTransaction().commit();
        } catch (Exception e) {
            if (entity.getTransaction().isActive()) {
                entity.getTransaction().rollback();
            }
        }
    }

    @Override
    public void remover(Object o) throws Exception {
        entity = getEntityManager();
        try {
            entity.getTransaction().begin();
            
            if(!entity.contains(o)){
                o = entity.merge(o);
            }
            entity.remove(o);
            entity.getTransaction().commit();
        } catch (Exception e) {
            if (entity.getTransaction().isActive()) {
                entity.getTransaction().rollback();
            }
        }
    }

    public EntityManager getEntityManager() {
        if (entity == null || !entity.isOpen()) {
            entity = factory.createEntityManager();

        }
        return entity;
    }
   
    public List<Agendamento> getAllAgendamentosByAgenda(Agenda agenda){
        entity = getEntityManager();
        try {
            Query query = entity.createQuery(
                "SELECT ag FROM Agendamento ag WHERE ag.agenda = :agenda ORDER BY ag.id ASC", Agendamento.class);
            query.setParameter("agenda", agenda);
            return query.getResultList();
           
        }catch (Exception e) {
            System.err.println("Erro ao buscar Agendamentos: " + e);
            return null;
        }
        
    }
   
}
