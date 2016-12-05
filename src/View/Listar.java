
package View;

import Model.Cliente;
import Model.Pomar;
import java.util.List;

public class Listar extends javax.swing.JFrame {
    
    private Pomar p;
    private List<Cliente> cliente;
    
    public Listar(Pomar p) {
        this.p = p;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btListaCli = new javax.swing.JButton();
        btVoltar2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btListaCli.setText("Lista Clientes");
        btListaCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListaCliActionPerformed(evt);
            }
        });

        btVoltar2.setText("Voltar");
        btVoltar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(btListaCli)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 268, Short.MAX_VALUE)
                .addComponent(btVoltar2)
                .addGap(111, 111, 111))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(336, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btListaCli)
                    .addComponent(btVoltar2))
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btListaCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListaCliActionPerformed
        cliente = p.getCliente();
        for(int i=0; i<cliente.size(); i++){
            System.out.println(cliente.get(i).getNome());
        }
    }//GEN-LAST:event_btListaCliActionPerformed

    private void btVoltar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltar2ActionPerformed
        Inicial ini = new Inicial(p);
        ini.setVisible(true);
        ini.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_btVoltar2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btListaCli;
    private javax.swing.JButton btVoltar2;
    // End of variables declaration//GEN-END:variables
}
