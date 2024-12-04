/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pf.cc0033.salaodebeleza.Frame;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import pf.cc0033.salaodebeleza.dao.PessoaRepositorioJPA;
import pf.cc0033.salaodebeleza.entidade.Cliente;
import pf.cc0033.salaodebeleza.entidade.PerfilCliente;

/**
 *
 * @author ggbra
 */
public class TelaCliente extends javax.swing.JFrame {

    PessoaRepositorioJPA jpa;
    /**
     * Creates new form TelaPessoa
     */
    public TelaCliente() {
        initComponents();
        jpa = new PessoaRepositorioJPA();
        this.carregarClientesCadastrados();
        this.popularComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFuncionario = new javax.swing.JPanel();
        lblBuscaNome = new javax.swing.JLabel();
        cmbPerfilCliente = new javax.swing.JComboBox<>();
        lblBuscaVinculo = new javax.swing.JLabel();
        txtBuscaNome = new javax.swing.JTextField();
        lblTitulo1 = new javax.swing.JLabel();
        areaListagem = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstClientes = new javax.swing.JList<>();
        areaBotoes = new javax.swing.JPanel();
        btnNovoCliente = new javax.swing.JButton();
        btnEditarCliente = new javax.swing.JButton();
        btnRemoverCliente = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblBuscaNome.setText("Nome:");

        cmbPerfilCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPerfilClienteActionPerformed(evt);
            }
        });

        lblBuscaVinculo.setText("Perfil:");

        txtBuscaNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscaNomeActionPerformed(evt);
            }
        });
        txtBuscaNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscaNomeKeyTyped(evt);
            }
        });

        lblTitulo1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTitulo1.setText("Clientes");

        javax.swing.GroupLayout pnlFuncionarioLayout = new javax.swing.GroupLayout(pnlFuncionario);
        pnlFuncionario.setLayout(pnlFuncionarioLayout);
        pnlFuncionarioLayout.setHorizontalGroup(
            pnlFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFuncionarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFuncionarioLayout.createSequentialGroup()
                        .addComponent(lblBuscaNome)
                        .addGap(18, 18, 18)
                        .addComponent(txtBuscaNome, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(lblBuscaVinculo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbPerfilCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlFuncionarioLayout.createSequentialGroup()
                        .addComponent(lblTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlFuncionarioLayout.setVerticalGroup(
            pnlFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFuncionarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(pnlFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBuscaNome)
                    .addComponent(cmbPerfilCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuscaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBuscaVinculo))
                .addContainerGap())
        );

        jScrollPane1.setViewportView(lstClientes);

        javax.swing.GroupLayout areaListagemLayout = new javax.swing.GroupLayout(areaListagem);
        areaListagem.setLayout(areaListagemLayout);
        areaListagemLayout.setHorizontalGroup(
            areaListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaListagemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        areaListagemLayout.setVerticalGroup(
            areaListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaListagemLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnNovoCliente.setText("Novo");
        btnNovoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoClienteActionPerformed(evt);
            }
        });

        btnEditarCliente.setText("Editar");
        btnEditarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarClienteActionPerformed(evt);
            }
        });

        btnRemoverCliente.setText("Remover");
        btnRemoverCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout areaBotoesLayout = new javax.swing.GroupLayout(areaBotoes);
        areaBotoes.setLayout(areaBotoesLayout);
        areaBotoesLayout.setHorizontalGroup(
            areaBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaBotoesLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btnNovoCliente)
                .addGap(79, 79, 79)
                .addComponent(btnEditarCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRemoverCliente)
                .addContainerGap())
        );
        areaBotoesLayout.setVerticalGroup(
            areaBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaBotoesLayout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(areaBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovoCliente)
                    .addComponent(btnEditarCliente)
                    .addComponent(btnRemoverCliente))
                .addGap(32, 32, 32))
        );

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTitulo.setText("Cadastros");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(areaListagem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(areaBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(pnlFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 4, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(areaListagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(areaBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbPerfilClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPerfilClienteActionPerformed
        
    }//GEN-LAST:event_cmbPerfilClienteActionPerformed

    private void txtBuscaNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscaNomeActionPerformed
        
    }//GEN-LAST:event_txtBuscaNomeActionPerformed

    private void txtBuscaNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaNomeKeyTyped
      
    }//GEN-LAST:event_txtBuscaNomeKeyTyped

    private void btnNovoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoClienteActionPerformed
       TelaCadastroCliente telaCadastro = new TelaCadastroCliente(this, rootPaneCheckingEnabled);
       telaCadastro.setVisible(true);
        
       
        this.carregarClientesCadastrados();
    }//GEN-LAST:event_btnNovoClienteActionPerformed

    private void btnEditarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarClienteActionPerformed
       Cliente clienteSelecionado = lstClientes.getSelectedValue();
       
       if (clienteSelecionado != null){
           TelaCadastroCliente telaEdicaoCliente = new TelaCadastroCliente(this, rootPaneCheckingEnabled);
           
           telaEdicaoCliente.setC(clienteSelecionado);
           telaEdicaoCliente.setVisible(true);
           
       } else {          
            JOptionPane.showMessageDialog(this, "Selecione um cliente para editar");
        }
    }//GEN-LAST:event_btnEditarClienteActionPerformed

    private void btnRemoverClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverClienteActionPerformed
      Cliente clienteSelecionado = lstClientes.getSelectedValue();
        
        if (clienteSelecionado != null){
            System.out.println("Cliente: " + clienteSelecionado.getId());   
            
            try {
                jpa.conexaoAberta();
                
                int delOp = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja excluir o cadastro " + clienteSelecionado.getNome() + " ?");
                if (delOp == JOptionPane.YES_OPTION){
                    jpa.remover(clienteSelecionado);
                }
                
                jpa.fecharConexao();
                this.carregarClientesCadastrados();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Erro ao remover cliente " + clienteSelecionado + "\n" + e);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um cliente para remover");
        }
    }//GEN-LAST:event_btnRemoverClienteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCliente().setVisible(true);
            }
        });
    }

     private void carregarClientesCadastrados(){
        jpa.conexaoAberta();
        
        DefaultListModel modeloLista = new DefaultListModel();
        modeloLista.addAll(jpa.getAllClientes());
        lstClientes.setModel(modeloLista);
        jpa.fecharConexao();
    }
    
     private void popularComboBox() {
        DefaultComboBoxModel<PerfilCliente> model = new DefaultComboBoxModel<>();
        model.addElement(null); 

        for (PerfilCliente vinculo : PerfilCliente.values()) {
            model.addElement(vinculo);
        }
        cmbPerfilCliente.setModel(model);

        cmbPerfilCliente.setSelectedItem(null);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel areaBotoes;
    private javax.swing.JPanel areaListagem;
    private javax.swing.JButton btnEditarCliente;
    private javax.swing.JButton btnNovoCliente;
    private javax.swing.JButton btnRemoverCliente;
    private javax.swing.JComboBox<PerfilCliente> cmbPerfilCliente;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblBuscaNome;
    private javax.swing.JLabel lblBuscaVinculo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTitulo1;
    private javax.swing.JList<Cliente> lstClientes;
    private javax.swing.JPanel pnlFuncionario;
    private javax.swing.JTextField txtBuscaNome;
    // End of variables declaration//GEN-END:variables
}

