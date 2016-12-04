
package View;

import Model.Cliente;
import javax.swing.JOptionPane;


public class Cadastro extends javax.swing.JFrame {
    
    private Cliente cli;
    
    public Cadastro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgWhats = new javax.swing.ButtonGroup();
        btgTipo = new javax.swing.ButtonGroup();
        bgTipo1 = new javax.swing.ButtonGroup();
        tpCadastro = new javax.swing.JTabbedPane();
        pCliente = new javax.swing.JPanel();
        labNome = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        labRua = new javax.swing.JLabel();
        tfRua = new javax.swing.JTextField();
        labNum = new javax.swing.JLabel();
        tfNum = new javax.swing.JTextField();
        labBairro = new javax.swing.JLabel();
        tfBairro = new javax.swing.JTextField();
        labCid = new javax.swing.JLabel();
        tfCidade = new javax.swing.JTextField();
        labCel = new javax.swing.JLabel();
        tfCelular = new javax.swing.JTextField();
        labWha = new javax.swing.JLabel();
        rbSim = new javax.swing.JRadioButton();
        rbNao = new javax.swing.JRadioButton();
        labFac = new javax.swing.JLabel();
        tfPerfil = new javax.swing.JTextField();
        btLimpar = new javax.swing.JButton();
        btCadastrar = new javax.swing.JButton();
        labFis = new javax.swing.JLabel();
        labCom = new javax.swing.JLabel();
        rbFisica = new javax.swing.JRadioButton();
        rbComercio = new javax.swing.JRadioButton();
        pPolpa = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        btLimpar1 = new javax.swing.JButton();
        btCadastrar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Clientes e Polpas");

        labNome.setText("Nome:");

        tfNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNomeActionPerformed(evt);
            }
        });

        labRua.setText("Rua:");

        labNum.setText("Número:");

        labBairro.setText("Bairro:");

        labCid.setText("Cidade:");

        labCel.setText("Celular:");

        labWha.setText("WhatsApp:");

        btgWhats.add(rbSim);
        rbSim.setText("Sim");
        rbSim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSimActionPerformed(evt);
            }
        });

        btgWhats.add(rbNao);
        rbNao.setText("Não");

        labFac.setText("Perfil Facebook: ");

        btLimpar.setLabel("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        labFis.setText("Pessoa Física ");

        labCom.setText("Comércio");

        btgTipo.add(rbFisica);
        rbFisica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFisicaActionPerformed(evt);
            }
        });

        btgTipo.add(rbComercio);
        rbComercio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbComercioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pClienteLayout = new javax.swing.GroupLayout(pCliente);
        pCliente.setLayout(pClienteLayout);
        pClienteLayout.setHorizontalGroup(
            pClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pClienteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btCadastrar)
                .addGap(50, 50, 50)
                .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(182, 182, 182))
            .addGroup(pClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pClienteLayout.createSequentialGroup()
                        .addComponent(rbComercio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labCom))
                    .addGroup(pClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(pClienteLayout.createSequentialGroup()
                            .addGroup(pClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(labRua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(pClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pClienteLayout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tfNome))
                                .addGroup(pClienteLayout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(tfRua, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(labNum)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tfNum))))
                        .addGroup(pClienteLayout.createSequentialGroup()
                            .addGroup(pClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pClienteLayout.createSequentialGroup()
                                    .addComponent(labBairro)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(labCid))
                                .addGroup(pClienteLayout.createSequentialGroup()
                                    .addComponent(labCel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tfCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(pClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pClienteLayout.createSequentialGroup()
                                    .addGap(9, 9, 9)
                                    .addComponent(labWha)
                                    .addGap(14, 14, 14)
                                    .addComponent(rbSim)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(rbNao))
                                .addComponent(tfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(pClienteLayout.createSequentialGroup()
                            .addComponent(labFac)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(tfPerfil)))
                    .addGroup(pClienteLayout.createSequentialGroup()
                        .addComponent(rbFisica)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labFis)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pClienteLayout.setVerticalGroup(
            pClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pClienteLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pClienteLayout.createSequentialGroup()
                        .addGroup(pClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labNome)
                            .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labRua)
                            .addGroup(pClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tfRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labNum)
                                .addComponent(tfNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(25, 25, 25)
                        .addGroup(pClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labBairro)
                            .addComponent(tfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labCid)
                            .addComponent(tfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(pClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labCel)
                            .addComponent(tfCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labWha)
                            .addComponent(rbSim)
                            .addComponent(rbNao))
                        .addGap(23, 23, 23)
                        .addGroup(pClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labFac)
                            .addComponent(tfPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(rbFisica))
                    .addComponent(labFis, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbComercio, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labCom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(pClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        tpCadastro.addTab("Cadastro de Clientes", pCliente);

        pPolpa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bgTipo1.add(jRadioButton1);
        jRadioButton1.setText("Polpa");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        pPolpa.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        bgTipo1.add(jRadioButton2);
        jRadioButton2.setText("Detox");
        pPolpa.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Morango", "Abacaxi", "Macarujá", "Laranja" }));
        pPolpa.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

        jLabel1.setText("Sabor:");
        pPolpa.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, 20));

        jLabel2.setText("Preço:");
        pPolpa.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, -1, -1));
        pPolpa.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 120, -1));

        jLabel3.setText("Fornecedor:");
        pPolpa.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, -1, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MinasFrutas" }));
        pPolpa.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, -1, 20));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        pPolpa.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 340, 70));

        jLabel4.setText("Descrição:");
        pPolpa.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, -1, -1));

        btLimpar1.setText("Limpar");
        btLimpar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimpar1ActionPerformed(evt);
            }
        });
        pPolpa.add(btLimpar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 100, 40));

        btCadastrar1.setText("Cadastrar");
        btCadastrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrar1ActionPerformed(evt);
            }
        });
        pPolpa.add(btCadastrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 100, 40));

        tpCadastro.addTab("Cadastro de Polpas", pPolpa);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tpCadastro)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tpCadastro)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNomeActionPerformed

    private void rbSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbSimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbSimActionPerformed

    private void rbFisicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFisicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbFisicaActionPerformed

    private void rbComercioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbComercioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbComercioActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        
        String error = validaCampos();
        if(error == "NENHUM"){
            cli = new Cliente();
            cli.setNome(tfNome.getText());
            cli.setBairro(tfBairro.getText());
            cli.setCelular(tfCelular.getText());
            cli.setCidade(tfCidade.getText());
            cli.setNumero(tfNum.getText());
            cli.setRua(tfRua.getText());
            cli.setFacebook(tfPerfil.getText());
            cli.setWhats(rbSim.isSelected());
            cli.setPessoafisica(rbFisica.isSelected());
        }
        else{
            JOptionPane.showMessageDialog(rootPane, error, "Erro", JOptionPane.ERROR_MESSAGE);
        }
         
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
       limpaCampos();
    }//GEN-LAST:event_btLimparActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void btLimpar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimpar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btLimpar1ActionPerformed

    private void btCadastrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btCadastrar1ActionPerformed
    
    public void limpaCampos(){
        tfNome.setText("");
        tfBairro.setText("");
        tfCelular.setText("");
        tfCidade.setText("");
        tfNum.setText("");
        tfRua.setText("");
        tfPerfil.setText("");
        btgTipo.clearSelection();
        btgWhats.clearSelection();
    }
    public String validaCampos(){
        if(tfNome.getText().isEmpty()) return "Preencha o campo Nome!";
        if(!rbSim.isSelected() && !rbNao.isSelected())
            return "Selecione se possui WhatsApp ou não!";
        if(!rbFisica.isSelected() && !rbComercio.isSelected())
            return "Selecione se é Pessoa Física ou não!";
        return "NENHUM";
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
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgTipo1;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btCadastrar1;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btLimpar1;
    private javax.swing.ButtonGroup btgTipo;
    private javax.swing.ButtonGroup btgWhats;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel labBairro;
    private javax.swing.JLabel labCel;
    private javax.swing.JLabel labCid;
    private javax.swing.JLabel labCom;
    private javax.swing.JLabel labFac;
    private javax.swing.JLabel labFis;
    private javax.swing.JLabel labNome;
    private javax.swing.JLabel labNum;
    private javax.swing.JLabel labRua;
    private javax.swing.JLabel labWha;
    private javax.swing.JPanel pCliente;
    private javax.swing.JPanel pPolpa;
    private javax.swing.JRadioButton rbComercio;
    private javax.swing.JRadioButton rbFisica;
    private javax.swing.JRadioButton rbNao;
    private javax.swing.JRadioButton rbSim;
    private javax.swing.JTextField tfBairro;
    private javax.swing.JTextField tfCelular;
    private javax.swing.JTextField tfCidade;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfNum;
    private javax.swing.JTextField tfPerfil;
    private javax.swing.JTextField tfRua;
    private javax.swing.JTabbedPane tpCadastro;
    // End of variables declaration//GEN-END:variables
}
