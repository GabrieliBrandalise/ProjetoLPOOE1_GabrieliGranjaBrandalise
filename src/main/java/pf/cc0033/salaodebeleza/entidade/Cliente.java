/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pf.cc0033.salaodebeleza.entidade;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
     
    
    public Cliente(){
        
    }

    
    
    
    public PerfilCliente getPerfilCliente() {
        return perfilCliente;
    }

    public void setPerfilCliente(PerfilCliente perfilCliente) {
        this.perfilCliente = perfilCliente;
    }
    
    @Override
    public String toString() {
        return  "id: " + super.getId() + ", nome: " + super.getNome() + ", perfil: " + perfilCliente;
    }
}
