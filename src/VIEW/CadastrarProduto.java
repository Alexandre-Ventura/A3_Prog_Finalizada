package VIEW;

import Model.Produto;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class CadastrarProduto extends javax.swing.JFrame {
    
    private Produto objproduto;
        
    public CadastrarProduto() {
        initComponents();
        this.objproduto = new Produto(); // carrega objeto vazio de produto
        this.getContentPane().setBackground(new Color(188,219,255));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Nome_CP = new javax.swing.JTextField();
        Descricao_CP = new javax.swing.JTextField();
        Preco_CP = new javax.swing.JTextField();
        B_Cadastrar = new javax.swing.JButton();
        B_Cancelar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        B_Ajuda = new javax.swing.JButton();
        Quantidade_CP = new javax.swing.JTextField();

        setTitle("Cadastrar Produto");
        setBackground(new java.awt.Color(188, 219, 255));

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Bold", 2, 12)); // NOI18N
        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Copperplate Gothic Bold", 2, 12)); // NOI18N
        jLabel3.setText("Descrição:");

        jLabel4.setFont(new java.awt.Font("Copperplate Gothic Bold", 2, 12)); // NOI18N
        jLabel4.setText("Preço:");

        Nome_CP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nome_CPActionPerformed(evt);
            }
        });

        Descricao_CP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Descricao_CPActionPerformed(evt);
            }
        });

        B_Cadastrar.setText("Cadastrar");
        B_Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_CadastrarActionPerformed(evt);
            }
        });

        B_Cancelar.setText("Cancelar");
        B_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_CancelarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Copperplate Gothic Bold", 2, 12)); // NOI18N
        jLabel5.setText("Quantidade:");

        B_Ajuda.setText("Ajuda");
        B_Ajuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_AjudaActionPerformed(evt);
            }
        });

        Quantidade_CP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Quantidade_CPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(B_Ajuda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addComponent(B_Cadastrar)
                        .addGap(62, 62, 62)
                        .addComponent(B_Cancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Preco_CP)
                            .addComponent(Descricao_CP)
                            .addComponent(Nome_CP)
                            .addComponent(Quantidade_CP))))
                .addGap(59, 59, 59))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Nome_CP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Descricao_CP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(Preco_CP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Quantidade_CP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B_Cadastrar)
                    .addComponent(B_Cancelar)
                    .addComponent(B_Ajuda))
                .addGap(25, 25, 25))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Nome_CPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nome_CPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Nome_CPActionPerformed

    private void B_CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_CadastrarActionPerformed
        try {
            // recebendo e validando dados da interface gráfica.
            String nome_produto = "";
            String descricao_produto = "";
            double preco_produto = 0;
            int qntd_estoque = 0;
            
            if (this.Nome_CP.getText().length() < 2) {
                throw new Mensagem("Nome deve conter ao menos 2 caracteres.");
            } else {
                nome_produto = this.Nome_CP.getText();
            }
            if (this.Descricao_CP.getText().length() < 2) {
                throw new Mensagem("Descrição deve conter ao menos 2 caracteres.");
            } else {
                descricao_produto = this.Descricao_CP.getText();
            }
            
            double valor_preco = Double.parseDouble(this.Preco_CP.getText());
            if (valor_preco <= 0) {
                throw new Mensagem("Preço deve maior que 0, mais dúvidas clique no botão de ajuda");
            } else {
                preco_produto = Double.parseDouble(this.Preco_CP.getText());
            }
            
            int valor_qntd = Integer.parseInt(this.Quantidade_CP.getText());
            if (valor_qntd <= 0) {
                throw new Mensagem("Quantidade deve ser maior que 0, mais dúvidas clique no botão de ajuda");
            } else {
                qntd_estoque = Integer.parseInt(this.Quantidade_CP.getText());
            }
            // envia os dados para cadastrar
            if (this.objproduto.InsertProdutoBD(nome_produto, preco_produto, descricao_produto, qntd_estoque)) {
                JOptionPane.showMessageDialog(rootPane, "Produto Cadastrado com Sucesso!");
                
                // limpa campos da interface
                this.Nome_CP.setText("");
                this.Descricao_CP.setText("");
                this.Preco_CP.setText("");
                this.Quantidade_CP.setText("");
            }
            
            System.out.println(this.objproduto.getMinhaLista().toString());
            
        } catch (Mensagem erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (NumberFormatException erro2) {
            JOptionPane.showMessageDialog(null, "Dados inválidos, tente novamente.");
        } catch (SQLException ex) {
            Logger.getLogger(CadastrarProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_B_CadastrarActionPerformed

    private void B_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_CancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_B_CancelarActionPerformed

    private void B_AjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_AjudaActionPerformed
        Ajuda objeto = new Ajuda();
        objeto.setVisible(true);
    }//GEN-LAST:event_B_AjudaActionPerformed

    private void Quantidade_CPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Quantidade_CPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Quantidade_CPActionPerformed

    private void Descricao_CPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Descricao_CPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Descricao_CPActionPerformed

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
            java.util.logging.Logger.getLogger(CadastrarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_Ajuda;
    private javax.swing.JButton B_Cadastrar;
    private javax.swing.JButton B_Cancelar;
    private javax.swing.JTextField Descricao_CP;
    private javax.swing.JTextField Nome_CP;
    private javax.swing.JTextField Preco_CP;
    private javax.swing.JTextField Quantidade_CP;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
