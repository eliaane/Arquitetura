/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.ControlePais;
import model.Pais;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class InserirPais extends javax.swing.JFrame {
    private ControlePais paisControle;

    InserirPais(ControlePais paisControle) {
        this();
        
        this.paisControle = paisControle;
    }
    public InserirPais() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBInserirPais = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLNomePais = new javax.swing.JLabel();
        jLSiglaPais = new javax.swing.JLabel();
        jLDigitos = new javax.swing.JLabel();
        jTFNomePais = new javax.swing.JTextField();
        jTFSiglaPais = new javax.swing.JTextField();
        jTFDigitos = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTAList = new javax.swing.JTextArea();
        jBListar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jBInserirPais.setText("Inserir");
        jBInserirPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBInserirPaisActionPerformed(evt);
            }
        });

        jLNomePais.setText("Nome do País: ");

        jLSiglaPais.setText("Sigla:");

        jLDigitos.setText("Digitos de Telefone:");

        jTFNomePais.setText(" ");

        jTFSiglaPais.setText(" ");
        jTFSiglaPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFSiglaPaisActionPerformed(evt);
            }
        });

        jTFDigitos.setText(" ");

        jTAList.setColumns(20);
        jTAList.setRows(5);
        jScrollPane1.setViewportView(jTAList);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLDigitos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFDigitos, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLNomePais)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFNomePais, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLSiglaPais)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTFSiglaPais, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNomePais)
                    .addComponent(jTFNomePais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFSiglaPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLSiglaPais))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLDigitos)
                    .addComponent(jTFDigitos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jBListar.setText("Listar");
        jBListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBListarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jBInserirPais)
                .addGap(18, 18, 18)
                .addComponent(jBListar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBInserirPais)
                    .addComponent(jBListar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFSiglaPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFSiglaPaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFSiglaPaisActionPerformed

    private void jBInserirPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInserirPaisActionPerformed
        Pais p = new Pais();
        
        p.setNome(jTFNomePais.getText());
        p.setSigla(jTFSiglaPais.getText());
        p.setDigito(new Integer(jTFDigitos.getText().trim()));;
        
        try {
            paisControle.inserirPais(p);
            
        } catch (Exception ex) {
            JOptionPane.showConfirmDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_jBInserirPaisActionPerformed

    private void jBListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBListarActionPerformed
        jTAList.setText(paisControle.list().toString());
    }//GEN-LAST:event_jBListarActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBInserirPais;
    private javax.swing.JButton jBListar;
    private javax.swing.JLabel jLDigitos;
    private javax.swing.JLabel jLNomePais;
    private javax.swing.JLabel jLSiglaPais;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTAList;
    private javax.swing.JTextField jTFDigitos;
    private javax.swing.JTextField jTFNomePais;
    private javax.swing.JTextField jTFSiglaPais;
    // End of variables declaration//GEN-END:variables
}
