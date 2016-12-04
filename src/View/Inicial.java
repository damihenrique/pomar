package View;

public class Inicial extends javax.swing.JFrame {

    public Inicial() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btCadastro = new javax.swing.JButton();
        btLista = new javax.swing.JButton();
        btVenda = new javax.swing.JButton();
        btRelatorios = new javax.swing.JButton();
        labTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pomar Polpa de Fruta");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btCadastro.setText("Cadastrar");
        btCadastro.setActionCommand("btCadastro");
        btCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastroActionPerformed(evt);
            }
        });
        getContentPane().add(btCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 207, 129, 73));

        btLista.setLabel("Listar Cadastros");
        btLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListaActionPerformed(evt);
            }
        });
        getContentPane().add(btLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 298, 129, 73));

        btVenda.setLabel("Nova Venda");
        btVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVendaActionPerformed(evt);
            }
        });
        getContentPane().add(btVenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(357, 207, 129, 73));

        btRelatorios.setText("Relatórios");
        btRelatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRelatoriosActionPerformed(evt);
            }
        });
        getContentPane().add(btRelatorios, new org.netbeans.lib.awtextra.AbsoluteConstraints(357, 298, 129, 73));

        labTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pomare.jpg"))); // NOI18N
        getContentPane().add(labTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastroActionPerformed
        Cadastro cad = new Cadastro();
        cad.setVisible(true);
        cad.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_btCadastroActionPerformed

    private void btVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVendaActionPerformed
        
    }//GEN-LAST:event_btVendaActionPerformed

    private void btListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListaActionPerformed
       
    }//GEN-LAST:event_btListaActionPerformed

    private void btRelatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRelatoriosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btRelatoriosActionPerformed

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
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastro;
    private javax.swing.JButton btLista;
    private javax.swing.JButton btRelatorios;
    private javax.swing.JButton btVenda;
    private javax.swing.JLabel labTitulo;
    // End of variables declaration//GEN-END:variables
}
