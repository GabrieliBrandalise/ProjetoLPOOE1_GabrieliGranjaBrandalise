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
import pf.cc0033.salaodebeleza.entidade.Cliente;
import pf.cc0033.salaodebeleza.entidade.PerfilCliente;


/**
 *
 * @author ggbra
 */
public class PessoaRepositorioJPA implements InterfaceBD {

    EntityManager entity;
    EntityManagerFactory factory;

    public PessoaRepositorioJPA() {
        factory = Persistence.createEntityManagerFactory("pu_lpoo_estacionamento");
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

    public List<Cliente> getAll() {
        entity = getEntityManager();
        try {
            Query query = entity.createQuery("Select c from Cliente c ORDER BY c.id ASC", Cliente.class);
            return query.getResultList();
        } catch (Exception e) {
            System.err.println("Erro ao buscar Pessoas: " + e);
            return null;
        }
    }
    
    public List<Cliente> getPessoaFiltro(String nome, PerfilCliente perfil){
        entity = getEntityManager();
        try {
            Query query;
            if (perfil == null && (nome != null && !nome.isEmpty())){
                
                query = entity.createQuery("Select c from Cliente c WHERE c.nome LIKE :nome ORDER BY c.id ASC", Cliente.class); 
                
                query.setParameter("nome", "%" + nome + "%");
                
            } else if (perfil != null && (nome == null || nome.isEmpty())){
                
                query = entity.createQuery("Select c from Cliente c WHERE c.perfilCliente LIKE :perfil ORDER BY c.id ASC", Cliente.class);
               
                query.setParameter("perfil", perfil);
                
            } else {
               
                query = entity.createQuery("Select c from Cliente c WHERE c.perfilCliente LIKE :perfil AND c.nome LIKE :nome ORDER BY c.id ASC", Cliente.class);
               
                query.setParameter("nome", "%" + nome + "%");
               
                query.setParameter("perfil", perfil);
            }
            
            return query.getResultList();
            
        } catch (Exception e) {
            System.err.println("Erro ao buscar Pessoas: " + e);
            return null;
        }
    }
  
}
