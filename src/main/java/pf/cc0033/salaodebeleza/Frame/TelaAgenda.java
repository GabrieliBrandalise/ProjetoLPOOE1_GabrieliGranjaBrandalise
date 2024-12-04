/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pf.cc0033.salaodebeleza.Frame;

import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;
import pf.cc0033.salaodebeleza.dao.PessoaRepositorioJPA;
import pf.cc0033.salaodebeleza.entidade.Funcionario;

/**
 *
 * @author ggbra
 */
public class TelaAgenda extends javax.swing.JFrame {

    List<Funcionario> funcionarios;
    PessoaRepositorioJPA jpa;

    /**
     * Creates new form TelaPessoa
     */
    public TelaAgenda() {
        initComponents();
        jpa = new PessoaRepositorioJPA();
        funcionarios = new ArrayList<>();
        this.popularFuncionariosCadastrados();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        pnlFuncionario = new javax.swing.JPanel();
        lblBuscaNome2 = new javax.swing.JLabel();
        cmbFuncionario = new javax.swing.JComboBox<>();
        areaListagem = new javax.swing.JPanel();
        areaBotoes = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        lblTitulo1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblBuscaNome2.setText("Funcionario:");

        javax.swing.GroupLayout pnlFuncionarioLayout = new javax.swing.GroupLayout(pnlFuncionario);
        pnlFuncionario.setLayout(pnlFuncionarioLayout);
        pnlFuncionarioLayout.setHorizontalGroup(
            pnlFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFuncionarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBuscaNome2)
                .addGap(18, 18, 18)
                .addComponent(cmbFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );
        pnlFuncionarioLayout.setVerticalGroup(
            pnlFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFuncionarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBuscaNome2)
                    .addComponent(cmbFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout areaListagemLayout = new javax.swing.GroupLayout(areaListagem);
        areaListagem.setLayout(areaListagemLayout);
        areaListagemLayout.setHorizontalGroup(
            areaListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        areaListagemLayout.setVerticalGroup(
            areaListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout areaBotoesLayout = new javax.swing.GroupLayout(areaBotoes);
        areaBotoes.setLayout(areaBotoesLayout);
        areaBotoesLayout.setHorizontalGroup(
            areaBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaBotoesLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(btnVoltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(btnBuscar)
                .addGap(150, 150, 150))
        );
        areaBotoesLayout.setVerticalGroup(
            areaBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(btnVoltar))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        lblTitulo1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTitulo1.setText("Agenda");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pnlFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 2, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(areaListagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(lblTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(areaBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(lblTitulo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(areaListagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(areaBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        Funcionario f = (Funcionario) cmbFuncionario.getModel().getSelectedItem();
        TelaAgendaFuncionario telaAgendaFuncionario = new TelaAgendaFuncionario(this, rootPaneCheckingEnabled, f);
        telaAgendaFuncionario.setVisible(true);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAgenda().setVisible(true);
            }
        });
    }

   private void popularFuncionariosCadastrados() {
    try {
        funcionarios = jpa.getAllFuncionarios();
            if (funcionarios == null || funcionarios.isEmpty()) {
                System.err.println("Nenhum funcionario encontrado para popular o JComboBox.");
                return;
            }

            DefaultComboBoxModel<Funcionario> model = new DefaultComboBoxModel<>();
            model.addElement(null);

            for (Funcionario funcionario : funcionarios) {
                model.addElement(funcionario);
            }

            cmbFuncionario.setModel(model);
            cmbFuncionario.setSelectedItem(null);
            
            cmbFuncionario.setRenderer(new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                
                if (value instanceof Funcionario) {
                    Funcionario funcionario = (Funcionario) value;
                    setText(funcionario.getNome()); 
                } else if (value == null) {
                    setText("Selecione um funcionario"); 
                }
                
                return this;
            }
        });
        } catch (Exception e) {
            Logger.getLogger(TelaAgendamento.class.getName()).log(Level.SEVERE, null, e);
        }
    } 
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel areaBotoes;
    private javax.swing.JPanel areaListagem;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<Funcionario> cmbFuncionario;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblBuscaNome2;
    private javax.swing.JLabel lblTitulo1;
    private javax.swing.JPanel pnlFuncionario;
    // End of variables declaration//GEN-END:variables
}
