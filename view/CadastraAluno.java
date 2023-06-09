package br.uninove.poo.sa.view;

import br.uninove.poo.sa.negocio.Aluno;
import br.uninove.poo.sa.negocio.Endereco;
import javax.swing.JOptionPane;

public class CadastraAluno extends javax.swing.JFrame {

    /**
     * Creates new form CadastraAluno
     */
    public CadastraAluno() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLbNome = new javax.swing.JLabel();
        jTxtNome = new javax.swing.JTextField();
        jLbRA = new javax.swing.JLabel();
        jTxtRA = new javax.swing.JTextField();
        jLbCPF = new javax.swing.JLabel();
        jTxtCPF = new javax.swing.JTextField();
        jLbRG = new javax.swing.JLabel();
        jTxtRG = new javax.swing.JTextField();
        jLbDtNasc = new javax.swing.JLabel();
        jTxtDataNasc = new javax.swing.JTextField();
        jPnEndereco = new javax.swing.JPanel();
        jLbTituloPnEndereco = new javax.swing.JLabel();
        jLbLogradouro = new javax.swing.JLabel();
        jLbBairro = new javax.swing.JLabel();
        jTxtLogradouro = new javax.swing.JTextField();
        jLbNumero = new javax.swing.JLabel();
        jTxtNumero = new javax.swing.JTextField();
        jTxtBairro = new javax.swing.JTextField();
        jLbCidade = new javax.swing.JLabel();
        jTxtCidade = new javax.swing.JTextField();
        jLbEstado = new javax.swing.JLabel();
        jTxtEstado = new javax.swing.JTextField();
        jLbComplemento = new javax.swing.JLabel();
        jTxtComplemento = new javax.swing.JTextField();
        jLbCEP = new javax.swing.JLabel();
        jTxtCEP = new javax.swing.JTextField();
        jBtCadastrar = new javax.swing.JButton();
        jBtLimparCampos = new javax.swing.JButton();
        jLbCurso = new javax.swing.JLabel();
        jTxtCurso = new javax.swing.JTextField();
        jLbNotaVestib = new javax.swing.JLabel();
        jTxtNotaVestib = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Aluno");

        jLbNome.setText("Nome:");

        jLbRA.setText("RA:");

        jLbCPF.setText("CPF:");

        jLbRG.setText("RG:");

        jLbDtNasc.setText("Dt. Nasc:");

        jPnEndereco.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLbTituloPnEndereco.setText("Endereço do Aluno:");

        jLbLogradouro.setText("Logradouro: ");

        jLbBairro.setText("Bairro: ");

        jLbNumero.setText("Nº: ");

        jTxtNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtNumeroActionPerformed(evt);
            }
        });

        jLbCidade.setText("Cidade:");

        jLbEstado.setText("Estado:");

        jLbComplemento.setText("Complemento:");

        jLbCEP.setText("CEP:");

        javax.swing.GroupLayout jPnEnderecoLayout = new javax.swing.GroupLayout(jPnEndereco);
        jPnEndereco.setLayout(jPnEnderecoLayout);
        jPnEnderecoLayout.setHorizontalGroup(
            jPnEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnEnderecoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPnEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLbTituloPnEndereco)
                    .addGroup(jPnEnderecoLayout.createSequentialGroup()
                        .addGroup(jPnEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLbBairro)
                            .addComponent(jLbLogradouro)
                            .addComponent(jLbCidade)
                            .addComponent(jLbCEP))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPnEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPnEnderecoLayout.createSequentialGroup()
                                .addComponent(jTxtLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLbNumero)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTxtNumero))
                            .addGroup(jPnEnderecoLayout.createSequentialGroup()
                                .addGroup(jPnEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTxtCidade, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                    .addComponent(jTxtBairro))
                                .addGap(18, 18, 18)
                                .addGroup(jPnEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPnEnderecoLayout.createSequentialGroup()
                                        .addComponent(jLbEstado)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTxtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPnEnderecoLayout.createSequentialGroup()
                                        .addComponent(jLbComplemento)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTxtComplemento, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))))
                            .addComponent(jTxtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(138, Short.MAX_VALUE))
        );
        jPnEnderecoLayout.setVerticalGroup(
            jPnEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnEnderecoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLbTituloPnEndereco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPnEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLbLogradouro)
                    .addComponent(jTxtLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLbNumero)
                    .addComponent(jTxtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPnEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLbBairro)
                    .addComponent(jTxtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLbComplemento)
                    .addComponent(jTxtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPnEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLbCidade)
                    .addComponent(jTxtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLbEstado)
                    .addComponent(jTxtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPnEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLbCEP)
                    .addComponent(jTxtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jBtCadastrar.setText("Cadastrar");
        jBtCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtCadastrarActionPerformed(evt);
            }
        });

        jBtLimparCampos.setText("Limpar todos os campos");
        jBtLimparCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtLimparCamposActionPerformed(evt);
            }
        });

        jLbCurso.setText("Curso:");

        jLbNotaVestib.setText("Nota do Vestibular:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBtLimparCampos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtCadastrar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLbCPF)
                                .addComponent(jLbRA)
                                .addComponent(jLbNome))
                            .addGap(23, 23, 23)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTxtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jTxtRA, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLbCurso)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTxtCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jTxtNome)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLbDtNasc)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addComponent(jLbRG)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTxtRG, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jTxtDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLbNotaVestib)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTxtNotaVestib, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addComponent(jPnEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLbRA)
                            .addComponent(jTxtRA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLbCurso)
                            .addComponent(jTxtCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLbNome)
                    .addComponent(jTxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLbCPF)
                    .addComponent(jTxtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLbRG)
                    .addComponent(jTxtRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLbDtNasc)
                    .addComponent(jTxtDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLbNotaVestib)
                    .addComponent(jTxtNotaVestib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPnEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtCadastrar)
                    .addComponent(jBtLimparCampos))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtNumeroActionPerformed
                             
    }//GEN-LAST:event_jTxtNumeroActionPerformed

    private void jBtLimparCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtLimparCamposActionPerformed
        int opc = JOptionPane.showConfirmDialog(this, "Você quer mesmo limpar todas as informações?", "Limpar",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (opc == 0) {
            jTxtBairro.setText("");
            jTxtCEP.setText("");
            jTxtCPF.setText("");
            jTxtCidade.setText("");
            jTxtComplemento.setText("");
            jTxtDataNasc.setText("");
            jTxtEstado.setText("");
            jTxtLogradouro.setText("");
            jTxtNome.setText("");
            jTxtNumero.setText("");
            jTxtRA.setText("");
            jTxtRG.setText("");
            jTxtCurso.setText("");
            jTxtNotaVestib.setText("");

        }

    }//GEN-LAST:event_jBtLimparCamposActionPerformed

    private void jBtCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtCadastrarActionPerformed
         Aluno a = new Aluno();
        try {
            a.setCpf(jTxtCPF.getText());
            a.setCurso(jTxtCurso.getText());
            a.setDataNasc(jTxtDataNasc.getText());


            Endereco e = new Endereco();
            e.setBairro(jTxtBairro.getText());
            long cep = Long.parseLong(jTxtCEP.getText());
            e.setCep(cep);
            e.setCidade(jTxtCidade.getText());
            e.setComplemento(jTxtComplemento.getText());
            e.setEstado(jTxtEstado.getText());
            e.setLogradouro(jTxtLogradouro.getText());
            e.setNumero(Integer.parseInt(jTxtNumero.getText()));
            e.setPais("Brasil");
            
            a.setEndereco(e);
            a.setNome(jTxtNome.getText());
            a.setNotaVestibular(Float.parseFloat(jTxtNotaVestib.getText()));
            a.setRegistroAcademico(Long.parseLong(jTxtRA.getText()));
            a.setRg(jTxtRG.getText());

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } 
        
        finally {
            JOptionPane.showMessageDialog(this, "Aluno criado com sucesso!",
                    "Aluno criado!", JOptionPane.INFORMATION_MESSAGE);
        }


    }//GEN-LAST:event_jBtCadastrarActionPerformed

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
            java.util.logging.Logger.getLogger(CadastraAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastraAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastraAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastraAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastraAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtCadastrar;
    private javax.swing.JButton jBtLimparCampos;
    private javax.swing.JLabel jLbBairro;
    private javax.swing.JLabel jLbCEP;
    private javax.swing.JLabel jLbCPF;
    private javax.swing.JLabel jLbCidade;
    private javax.swing.JLabel jLbComplemento;
    private javax.swing.JLabel jLbCurso;
    private javax.swing.JLabel jLbDtNasc;
    private javax.swing.JLabel jLbEstado;
    private javax.swing.JLabel jLbLogradouro;
    private javax.swing.JLabel jLbNome;
    private javax.swing.JLabel jLbNotaVestib;
    private javax.swing.JLabel jLbNumero;
    private javax.swing.JLabel jLbRA;
    private javax.swing.JLabel jLbRG;
    private javax.swing.JLabel jLbTituloPnEndereco;
    private javax.swing.JPanel jPnEndereco;
    private javax.swing.JTextField jTxtBairro;
    private javax.swing.JTextField jTxtCEP;
    private javax.swing.JTextField jTxtCPF;
    private javax.swing.JTextField jTxtCidade;
    private javax.swing.JTextField jTxtComplemento;
    private javax.swing.JTextField jTxtCurso;
    private javax.swing.JTextField jTxtDataNasc;
    private javax.swing.JTextField jTxtEstado;
    private javax.swing.JTextField jTxtLogradouro;
    private javax.swing.JTextField jTxtNome;
    private javax.swing.JTextField jTxtNotaVestib;
    private javax.swing.JTextField jTxtNumero;
    private javax.swing.JTextField jTxtRA;
    private javax.swing.JTextField jTxtRG;
    // End of variables declaration//GEN-END:variables
}
