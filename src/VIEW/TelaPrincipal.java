package VIEW;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.SwingConstants;

public class TelaPrincipal extends javax.swing.JFrame {

    public TelaPrincipal() {
        initComponents();
        this.getContentPane().setBackground(new Color(188,219,255));
    }
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Menu = new javax.swing.JMenu();
        CadastrarProduto = new javax.swing.JMenuItem();
        GerenciarProduto = new javax.swing.JMenuItem();
        Estoque_Produto = new javax.swing.JMenuItem();
        B_Sair = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Inicial ");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/SorveteNaNuvem.jpg"))); // NOI18N

        Menu.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(204, 255, 255), new java.awt.Color(102, 255, 255)));
        Menu.setText("Menu");

        CadastrarProduto.setFont(new java.awt.Font("Copperplate Gothic Bold", 2, 12)); // NOI18N
        CadastrarProduto.setText("Cadastrar Produto");
        CadastrarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarProdutoActionPerformed(evt);
            }
        });
        Menu.add(CadastrarProduto);

        GerenciarProduto.setFont(new java.awt.Font("Copperplate Gothic Bold", 2, 12)); // NOI18N
        GerenciarProduto.setText("Gerenciar Produto");
        GerenciarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GerenciarProdutoActionPerformed(evt);
            }
        });
        Menu.add(GerenciarProduto);

        Estoque_Produto.setFont(new java.awt.Font("Copperplate Gothic Bold", 2, 12)); // NOI18N
        Estoque_Produto.setText("Estoque de produtos");
        Estoque_Produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Estoque_ProdutoActionPerformed(evt);
            }
        });
        Menu.add(Estoque_Produto);

        B_Sair.setFont(new java.awt.Font("Copperplate Gothic Bold", 2, 12)); // NOI18N
        B_Sair.setText("Sair");
        B_Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_SairActionPerformed(evt);
            }
        });
        Menu.add(B_Sair);

        jMenuBar1.add(Menu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jLabel1)
                .addContainerGap(123, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CadastrarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarProdutoActionPerformed
        CadastrarProduto objeto = new CadastrarProduto();
        objeto.setVisible(true);
    }//GEN-LAST:event_CadastrarProdutoActionPerformed

    private void GerenciarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GerenciarProdutoActionPerformed
        GerenciarProduto objeto = new GerenciarProduto();
        objeto.setVisible(true);
    }//GEN-LAST:event_GerenciarProdutoActionPerformed

    private void B_SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_SairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_B_SairActionPerformed

    private void Estoque_ProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Estoque_ProdutoActionPerformed
        EstoqueProduto objeto = new EstoqueProduto();
        objeto.setVisible(true);
    }//GEN-LAST:event_Estoque_ProdutoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem B_Sair;
    private javax.swing.JMenuItem CadastrarProduto;
    private javax.swing.JMenuItem Estoque_Produto;
    private javax.swing.JMenuItem GerenciarProduto;
    private javax.swing.JMenu Menu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}
