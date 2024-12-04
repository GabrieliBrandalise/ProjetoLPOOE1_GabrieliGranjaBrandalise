/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pf.cc0033.salaodebeleza.Frame;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import pf.cc0033.salaodebeleza.dao.PessoaRepositorioJPA;
import pf.cc0033.salaodebeleza.entidade.Funcionario;
import pf.cc0033.salaodebeleza.entidade.TipoFuncionario;

/**
 *
 * @author ggbra
 */
public class TelaFuncionario extends javax.swing.JFrame {
    PessoaRepositorioJPA jpa;
    /**
     * Creates new form TelaPessoa
     */
    public TelaFuncionario() {
        initComponents();
        jpa = new PessoaRepositorioJPA();
        this.carregarFuncionariosCadastrados();
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
        cmbTipoFuncionario = new javax.swing.JComboBox<>();
        lblBuscaVinculo = new javax.swing.JLabel();
        txtBuscaNome = new javax.swing.JTextField();
        lblTitulo1 = new javax.swing.JLabel();
        areaListagem = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstFuncionarios = new javax.swing.JList<>();
        areaBotoes = new javax.swing.JPanel();
        btnNovoFuncionario = new javax.swing.JButton();
        btnEditarFuncionario = new javax.swing.JButton();
        btnRemoverFuncionario = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblBuscaNome.setText("Nome:");

        cmbTipoFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoFuncionarioActionPerformed(evt);
            }
        });

        lblBuscaVinculo.setText("Tipo:");

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
        lblTitulo1.setText("Funcionarios");

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
                        .addComponent(cmbTipoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(cmbTipoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuscaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBuscaVinculo))
                .addContainerGap())
        );

        jScrollPane1.setViewportView(lstFuncionarios);

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

        btnNovoFuncionario.setText("Novo");
        btnNovoFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoFuncionarioActionPerformed(evt);
            }
        });

        btnEditarFuncionario.setText("Editar");
        btnEditarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarFuncionarioActionPerformed(evt);
            }
        });

        btnRemoverFuncionario.setText("Remover");
        btnRemoverFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverFuncionarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout areaBotoesLayout = new javax.swing.GroupLayout(areaBotoes);
        areaBotoes.setLayout(areaBotoesLayout);
        areaBotoesLayout.setHorizontalGroup(
            areaBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaBotoesLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btnNovoFuncionario)
                .addGap(79, 79, 79)
                .addComponent(btnEditarFuncionario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRemoverFuncionario)
                .addContainerGap())
        );
        areaBotoesLayout.setVerticalGroup(
            areaBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaBotoesLayout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(areaBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovoFuncionario)
                    .addComponent(btnEditarFuncionario)
                    .addComponent(btnRemoverFuncionario))
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

    private void cmbTipoFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoFuncionarioActionPerformed
        
    }//GEN-LAST:event_cmbTipoFuncionarioActionPerformed

    private void txtBuscaNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscaNomeActionPerformed
        
    }//GEN-LAST:event_txtBuscaNomeActionPerformed

    private void txtBuscaNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaNomeKeyTyped
      
    }//GEN-LAST:event_txtBuscaNomeKeyTyped

    private void btnNovoFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoFuncionarioActionPerformed
       TelaCadastroFuncionario telaCadastro = new TelaCadastroFuncionario(this, rootPaneCheckingEnabled);
       telaCadastro.setVisible(true);
        
       
        this.carregarFuncionariosCadastrados();
    }//GEN-LAST:event_btnNovoFuncionarioActionPerformed

    private void btnEditarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarFuncionarioActionPerformed
        Funcionario funcionarioSelecionado = lstFuncionarios.getSelectedValue();
       
       if (funcionarioSelecionado != null){
           TelaCadastroFuncionario telaEdicaoFuncionario = new TelaCadastroFuncionario(this, rootPaneCheckingEnabled);
           
           telaEdicaoFuncionario.setF(funcionarioSelecionado);
           telaEdicaoFuncionario.setVisible(true);
           
       } else {          
            JOptionPane.showMessageDialog(this, "Selecione um funcionario para editar");
        }
    }//GEN-LAST:event_btnEditarFuncionarioActionPerformed

    private void btnRemoverFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverFuncionarioActionPerformed
      Funcionario funcionarioSelecionado = lstFuncionarios.getSelectedValue();
        
        if (funcionarioSelecionado != null){
            System.out.println("Funcionario: " + funcionarioSelecionado.getId());   
            
            try {
                jpa.conexaoAberta();
                
                int delOp = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja excluir o cadastro " + funcionarioSelecionado.getNome() + " ?");
                if (delOp == JOptionPane.YES_OPTION){
                    jpa.remover(funcionarioSelecionado);
                }
                
                jpa.fecharConexao();
                this.carregarFuncionariosCadastrados();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Erro ao remover funcionario " + funcionarioSelecionado + "\n" + e);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um funcionario para remover");
        }
    }//GEN-LAST:event_btnRemoverFuncionarioActionPerformed

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
            java.util.logging.Logger.getLogger(TelaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaFuncionario().setVisible(true);
            }
        });
    }
    
     private void carregarFuncionariosCadastrados(){
        jpa.conexaoAberta();
        
        DefaultListModel modeloLista = new DefaultListModel();
        modeloLista.addAll(jpa.getAllFuncionarios());
        lstFuncionarios.setModel(modeloLista);
        jpa.fecharConexao();
    }
    
     private void popularComboBox() {
        DefaultComboBoxModel<TipoFuncionario> model = new DefaultComboBoxModel<>();
        model.addElement(null); 

        for (TipoFuncionario vinculo : TipoFuncionario.values()) {
            model.addElement(vinculo);
        }
        cmbTipoFuncionario.setModel(model);

        cmbTipoFuncionario.setSelectedItem(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel areaBotoes;
    private javax.swing.JPanel areaListagem;
    private javax.swing.JButton btnEditarFuncionario;
    private javax.swing.JButton btnNovoFuncionario;
    private javax.swing.JButton btnRemoverFuncionario;
    private javax.swing.JComboBox<TipoFuncionario> cmbTipoFuncionario;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblBuscaNome;
    private javax.swing.JLabel lblBuscaVinculo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTitulo1;
    private javax.swing.JList<Funcionario> lstFuncionarios;
    private javax.swing.JPanel pnlFuncionario;
    private javax.swing.JTextField txtBuscaNome;
    // End of variables declaration//GEN-END:variables
}
