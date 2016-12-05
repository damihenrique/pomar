
package View;

import Model.Cliente;
import Model.Pomar;
import Model.Produto;
import javax.swing.JOptionPane;


public class Cadastro extends javax.swing.JFrame {
    
    private Cliente cli;
    private Produto pro;
    private Pomar p;
    
    public Cadastro(Pomar p) {
        this.p = p;
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
        btVoltar = new javax.swing.JButton();
        pPolpa = new javax.swing.JPanel();
        rbPolpa = new javax.swing.JRadioButton();
        rbDetox = new javax.swing.JRadioButton();
        cbSabor = new javax.swing.JComboBox<>();
        labSabor = new javax.swing.JLabel();
        labPreco = new javax.swing.JLabel();
        tfPreco = new javax.swing.JTextField();
        labFornecedor = new javax.swing.JLabel();
        cbFornecedor = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tfDescricao = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        btLimpar1 = new javax.swing.JButton();
        btCadastrar1 = new javax.swing.JButton();
        btVoltar1 = new javax.swing.JButton();

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

        tfNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNumActionPerformed(evt);
            }
        });

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

        btVoltar.setText("Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
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
                .addGap(111, 111, 111)
                .addComponent(btVoltar)
                .addContainerGap())
            .addGroup(pClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(pClienteLayout.createSequentialGroup()
                            .addGroup(pClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(labRua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(pClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(pClienteLayout.createSequentialGroup()
                                    .addGap(20, 20, 20)
                                    .addComponent(tfRua, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(labNum)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tfNum))
                                .addGroup(pClienteLayout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addContainerGap(15, Short.MAX_VALUE))
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
                            .addGroup(pClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pClienteLayout.createSequentialGroup()
                                    .addGap(19, 19, 19)
                                    .addComponent(labWha)
                                    .addGap(14, 14, 14)
                                    .addComponent(rbSim)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(rbNao))
                                .addGroup(pClienteLayout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(pClienteLayout.createSequentialGroup()
                            .addComponent(labFac)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(tfPerfil)
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(pClienteLayout.createSequentialGroup()
                        .addGroup(pClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pClienteLayout.createSequentialGroup()
                                .addComponent(rbComercio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labCom))
                            .addGroup(pClienteLayout.createSequentialGroup()
                                .addComponent(rbFisica)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labFis)))
                        .addContainerGap(474, Short.MAX_VALUE))))
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
                .addGroup(pClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pClienteLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbComercio, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labCom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addGroup(pClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pClienteLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btVoltar)
                        .addContainerGap())))
        );

        tpCadastro.addTab("Cadastro de Clientes", pCliente);

        pPolpa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bgTipo1.add(rbPolpa);
        rbPolpa.setText("Polpa");
        rbPolpa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPolpaActionPerformed(evt);
            }
        });
        pPolpa.add(rbPolpa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        bgTipo1.add(rbDetox);
        rbDetox.setText("Detox");
        pPolpa.add(rbDetox, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        cbSabor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Morango", "Abacaxi", "Macarujá", "Laranja" }));
        pPolpa.add(cbSabor, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

        labSabor.setText("Sabor:");
        pPolpa.add(labSabor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, 20));

        labPreco.setText("Preço:");
        pPolpa.add(labPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, -1, -1));
        pPolpa.add(tfPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 120, -1));

        labFornecedor.setText("Fornecedor:");
        pPolpa.add(labFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, -1, -1));

        cbFornecedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MinasFrutas" }));
        pPolpa.add(cbFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, -1, 20));

        tfDescricao.setColumns(20);
        tfDescricao.setRows(5);
        jScrollPane1.setViewportView(tfDescricao);

        pPolpa.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 340, 70));

        jLabel4.setText("Descrição:");
        pPolpa.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, -1, -1));

        btLimpar1.setText("Limpar");
        btLimpar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimpar1ActionPerformed(evt);
            }
        });
        pPolpa.add(btLimpar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, 100, 40));

        btCadastrar1.setText("Cadastrar");
        btCadastrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrar1ActionPerformed(evt);
            }
        });
        pPolpa.add(btCadastrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 100, 40));

        btVoltar1.setText("Voltar");
        btVoltar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltar1ActionPerformed(evt);
            }
        });
        pPolpa.add(btVoltar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 320, -1, -1));

        tpCadastro.addTab("Cadastro de Polpas", pPolpa);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tpCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
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
        
        String error = validaCampoCli();
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
            p.getCliente().add(cli);
        }
        else{
            JOptionPane.showMessageDialog(rootPane, error, "Erro", JOptionPane.ERROR_MESSAGE);
        }
         
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
       limpaCampos();
    }//GEN-LAST:event_btLimparActionPerformed

    private void rbPolpaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPolpaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbPolpaActionPerformed

    private void btLimpar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimpar1ActionPerformed
        tfPreco.setText("");
        tfDescricao.setText("");
        bgTipo1.clearSelection();
    }//GEN-LAST:event_btLimpar1ActionPerformed

    private void btCadastrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrar1ActionPerformed
        String error = validaCampoPro();
        if(error == "NENHUM"){
            pro = new Produto();
            pro.setDescricao(tfDescricao.getText());
            pro.setFornecedor(cbFornecedor.getSelectedItem().toString());
            pro.setPreco(Float.parseFloat(tfPreco.getText()));
            pro.setSabor(cbSabor.getSelectedItem().toString());
            if(rbPolpa.isSelected()) 
                pro.setTipo("Polpa");
            else
                pro.setTipo("Detox");
            p.getProduto().add(pro);
        }
        else{
            JOptionPane.showMessageDialog(rootPane, error, "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btCadastrar1ActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        Inicial ini = new Inicial(p);
        ini.setVisible(true);
        ini.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_btVoltarActionPerformed

    private void btVoltar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltar1ActionPerformed
        Inicial ini = new Inicial(p);
        ini.setVisible(true);
        ini.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_btVoltar1ActionPerformed

    private void tfNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNumActionPerformed
    
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
    public String validaCampoCli(){
        if(tfNome.getText().isEmpty()) return "Preencha o campo Nome!";
        if(!rbSim.isSelected() && !rbNao.isSelected())
            return "Selecione se possui WhatsApp ou não!";
        if(!rbFisica.isSelected() && !rbComercio.isSelected())
            return "Selecione se é Pessoa Física ou não!";
        return "NENHUM";
    }

    public String validaCampoPro(){
         if(!rbPolpa.isSelected() && !rbDetox.isSelected())
            return "Selecione se é Polpa ou Detox!";
         if(tfPreco.getText().isEmpty())
            return "Preencha o campo Preço!";
        return "NENHUM";
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgTipo1;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btCadastrar1;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btLimpar1;
    private javax.swing.JButton btVoltar;
    private javax.swing.JButton btVoltar1;
    private javax.swing.ButtonGroup btgTipo;
    private javax.swing.ButtonGroup btgWhats;
    private javax.swing.JComboBox<String> cbFornecedor;
    private javax.swing.JComboBox<String> cbSabor;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labBairro;
    private javax.swing.JLabel labCel;
    private javax.swing.JLabel labCid;
    private javax.swing.JLabel labCom;
    private javax.swing.JLabel labFac;
    private javax.swing.JLabel labFis;
    private javax.swing.JLabel labFornecedor;
    private javax.swing.JLabel labNome;
    private javax.swing.JLabel labNum;
    private javax.swing.JLabel labPreco;
    private javax.swing.JLabel labRua;
    private javax.swing.JLabel labSabor;
    private javax.swing.JLabel labWha;
    private javax.swing.JPanel pCliente;
    private javax.swing.JPanel pPolpa;
    private javax.swing.JRadioButton rbComercio;
    private javax.swing.JRadioButton rbDetox;
    private javax.swing.JRadioButton rbFisica;
    private javax.swing.JRadioButton rbNao;
    private javax.swing.JRadioButton rbPolpa;
    private javax.swing.JRadioButton rbSim;
    private javax.swing.JTextField tfBairro;
    private javax.swing.JTextField tfCelular;
    private javax.swing.JTextField tfCidade;
    private javax.swing.JTextArea tfDescricao;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfNum;
    private javax.swing.JTextField tfPerfil;
    private javax.swing.JTextField tfPreco;
    private javax.swing.JTextField tfRua;
    private javax.swing.JTabbedPane tpCadastro;
    // End of variables declaration//GEN-END:variables
}
