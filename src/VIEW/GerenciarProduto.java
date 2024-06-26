package VIEW;

import Model.Produto;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GerenciarProduto extends javax.swing.JFrame {

    private Produto objproduto; // cria o vinculo com o objproduto;
    
    public GerenciarProduto() {
        initComponents();
        this.objproduto = new Produto(); // carrega objproduto de produto;
        this.carregaTabela();
        this.getContentPane().setBackground(new Color(188,219,255));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_produto = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Descricao_GP = new javax.swing.JTextField();
        Nome_GP = new javax.swing.JTextField();
        Preco_GP = new javax.swing.JTextField();
        B_cancelar = new javax.swing.JButton();
        B_deletar = new javax.swing.JButton();
        B_alterar = new javax.swing.JButton();
        quantidade_GP = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setTitle("Gerenciamento de Produtos");

        tabela_produto.setFont(new java.awt.Font("Copperplate Gothic Bold", 2, 12)); // NOI18N
        tabela_produto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Descrição", "Preço (R$)", "Estoque", "Data de registro"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela_produto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabela_produtoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela_produto);
        if (tabela_produto.getColumnModel().getColumnCount() > 0) {
            tabela_produto.getColumnModel().getColumn(0).setMinWidth(50);
            tabela_produto.getColumnModel().getColumn(0).setMaxWidth(90);
            tabela_produto.getColumnModel().getColumn(1).setMinWidth(200);
            tabela_produto.getColumnModel().getColumn(1).setMaxWidth(300);
            tabela_produto.getColumnModel().getColumn(2).setMinWidth(200);
            tabela_produto.getColumnModel().getColumn(2).setMaxWidth(300);
            tabela_produto.getColumnModel().getColumn(5).setMinWidth(150);
            tabela_produto.getColumnModel().getColumn(5).setMaxWidth(200);
        }

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Bold", 2, 12)); // NOI18N
        jLabel1.setText("Nome:");

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Bold", 2, 12)); // NOI18N
        jLabel2.setText("Descrição:");

        jLabel3.setFont(new java.awt.Font("Copperplate Gothic Bold", 2, 12)); // NOI18N
        jLabel3.setText("Preço:");

        jLabel4.setFont(new java.awt.Font("Copperplate Gothic Bold", 2, 12)); // NOI18N
        jLabel4.setText("Quantidade:");

        B_cancelar.setText("Cancelar");
        B_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_cancelarActionPerformed(evt);
            }
        });

        B_deletar.setText("Deletar");
        B_deletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_deletarActionPerformed(evt);
            }
        });

        B_alterar.setText("Alterar");
        B_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_alterarActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/SorveteNaNuvem.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 878, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Nome_GP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
                                    .addComponent(Descricao_GP, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(quantidade_GP, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
                                    .addComponent(Preco_GP)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(B_cancelar)
                                        .addGap(54, 54, 54)
                                        .addComponent(B_alterar)
                                        .addGap(58, 58, 58)
                                        .addComponent(B_deletar)
                                        .addGap(19, 19, 19)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)))
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Nome_GP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(Descricao_GP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(Preco_GP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(quantidade_GP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(B_cancelar)
                            .addComponent(B_deletar)
                            .addComponent(B_alterar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel5)))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void B_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_cancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_B_cancelarActionPerformed

    private void B_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_alterarActionPerformed
        try {
            // recebendo e validando dados da interface gráfica.
            int ID_produto = 0;
            String nome_produto = "";
            String descricao_produto = "";
            double preco_produto = 0;
            int qntd_estoque = 0;
            String data = "";
            if (this.Nome_GP.getText().length() < 2) {
                throw new Mensagem("Nome deve conter ao menos 2 caracteres.");
            } else {
                nome_produto = this.Nome_GP.getText();
            }

            if (this.Descricao_GP.getText().length() <= 0) {
                throw new Mensagem("A descrição do produto está vazia!.");
            } else {
                descricao_produto = this.Descricao_GP.getText();
            }

            if (this.Preco_GP.getText().length() <= 0) {
                throw new Mensagem("Preço deve ser maior que zero!");
            } else {
                preco_produto = Double.parseDouble(this.Preco_GP.getText());
            }

            if (this.quantidade_GP.getText().length() < 0) {
                throw new Mensagem("A quantidade não pode ser um número menor que 0!");
            } else {
                qntd_estoque = Integer.parseInt(this.quantidade_GP.getText());
            }

            if (this.tabela_produto.getSelectedRow() == -1) {
                throw new Mensagem("Primeiro Selecione um Produto para Alterar");
            } else {
                ID_produto = Integer.parseInt(this.tabela_produto.getValueAt(this.tabela_produto.getSelectedRow(), 0).toString());
            }

            // envia os dados para o Produto processar
            if (this.objproduto.UpdateProdutoBD(nome_produto, descricao_produto, ID_produto, preco_produto, qntd_estoque,data)) {

                // limpa os campos
                this.Nome_GP.setText("");
                this.Descricao_GP.setText("");
                this.Preco_GP.setText("");
                this.quantidade_GP.setText("");
                JOptionPane.showMessageDialog(rootPane, "Produto Alterado com Sucesso!");

            }
            System.out.println(this.objproduto.getMinhaLista().toString());
        } catch (Mensagem erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (NumberFormatException erro2) {
            JOptionPane.showMessageDialog(null, "Informe um número.");
        } finally {
            carregaTabela(); // atualiza a tabela.
        }
    }//GEN-LAST:event_B_alterarActionPerformed

    private void B_deletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_deletarActionPerformed
        try {
        // Validando dados da interface gráfica.
        int ID_produto = 0;
        if (this.tabela_produto.getSelectedRow() == -1) {
            throw new Mensagem("Primeiro Selecione um Produto para APAGAR");
        } else {
            ID_produto = Integer.parseInt(this.tabela_produto.getValueAt(this.tabela_produto.getSelectedRow(), 0).toString());
        }

        // Opções dos botões em português
        Object[] options = { "Sim", "Não" };
        int resposta_usuario = JOptionPane.showOptionDialog(null, 
                "Tem certeza que deseja APAGAR este Produto?", 
                "Confirmação", 
                JOptionPane.YES_NO_OPTION, 
                JOptionPane.QUESTION_MESSAGE, 
                null, 
                options, 
                options[0]);

        if (resposta_usuario == JOptionPane.YES_OPTION) { // Clicou em SIM
            // Envia os dados para o Produto processar
            if (this.objproduto.DeleteProdutoBD(ID_produto)) {
                // Limpa os campos
                this.Nome_GP.setText("");
                this.Descricao_GP.setText("");
                this.Preco_GP.setText("");
                this.quantidade_GP.setText("");
                JOptionPane.showMessageDialog(rootPane, "Produto Apagado com Sucesso!");
            } else {
                JOptionPane.showMessageDialog(rootPane, "Erro ao apagar o produto. Tente novamente.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }

        // Atualiza a tabela.
        carregaTabela();

        // Imprime a lista de produtos no console (para fins de debug).
        System.out.println(this.objproduto.getMinhaLista().toString());

    } catch (Mensagem erro) {
        JOptionPane.showMessageDialog(rootPane, erro.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
    } catch (NumberFormatException nfe) {
        JOptionPane.showMessageDialog(rootPane, "ID do produto inválido", "Erro", JOptionPane.ERROR_MESSAGE);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(rootPane, "Ocorreu um erro, tente novamente", "Erro", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_B_deletarActionPerformed

    private void tabela_produtoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabela_produtoMouseClicked
        
        if (this.tabela_produto.getSelectedRow() != -1) {

            String nome_produto = this.tabela_produto.getValueAt(this.tabela_produto.getSelectedRow(), 1).toString();
            String descricao_produto = this.tabela_produto.getValueAt(this.tabela_produto.getSelectedRow(), 2).toString();
            String preco_produto = this.tabela_produto.getValueAt(this.tabela_produto.getSelectedRow(), 3).toString();
            String qntd_estoque = this.tabela_produto.getValueAt(this.tabela_produto.getSelectedRow(), 4).toString();

            this.Nome_GP.setText(nome_produto);
            this.Descricao_GP.setText(descricao_produto);
            this.Preco_GP.setText(preco_produto);
            this.quantidade_GP.setText(qntd_estoque);

        }
    }//GEN-LAST:event_tabela_produtoMouseClicked
    
    
    @SuppressWarnings("unchecked")
    public void carregaTabela() {

        DefaultTableModel modelo = (DefaultTableModel) this.tabela_produto.getModel();
        modelo.setNumRows(0);

        ArrayList<Produto> minhalista = new ArrayList<>();
        minhalista = objproduto.getMinhaLista();

        for (Produto p : minhalista) {
            modelo.addRow(new Object[]{
                p.getID_produto(),
                p.getnome_produto(),
                p.getdescricao_produto(),
                p.getpreco_produto(),
                p.getqntd_estoque(),
                p.getdata()
            });
        }
    }
    
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
            java.util.logging.Logger.getLogger(GerenciarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerenciarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerenciarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenciarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GerenciarProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_alterar;
    private javax.swing.JButton B_cancelar;
    private javax.swing.JButton B_deletar;
    private javax.swing.JTextField Descricao_GP;
    private javax.swing.JTextField Nome_GP;
    private javax.swing.JTextField Preco_GP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField quantidade_GP;
    public javax.swing.JTable tabela_produto;
    // End of variables declaration//GEN-END:variables
}
