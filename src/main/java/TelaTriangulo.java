/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Dell
 */
public class TelaTriangulo extends javax.swing.JFrame {

    /**
     * Creates new form TelaTriangulo
     */
    public TelaTriangulo() {
        initComponents();
        panResposta.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        sliA = new javax.swing.JSlider();
        sliB = new javax.swing.JSlider();
        sliC = new javax.swing.JSlider();
        lblA = new javax.swing.JLabel();
        lblB = new javax.swing.JLabel();
        lblC = new javax.swing.JLabel();
        btnVerificar = new javax.swing.JButton();
        panResposta = new javax.swing.JPanel();
        lblStatus = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("Segmento a");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("Segmento b");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setText("Segmento c");

        sliA.setMaximum(20);
        sliA.setValue(0);
        sliA.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliAStateChanged(evt);
            }
        });

        sliB.setMaximum(20);
        sliB.setValue(0);
        sliB.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliBStateChanged(evt);
            }
        });

        sliC.setMaximum(20);
        sliC.setValue(0);
        sliC.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliCStateChanged(evt);
            }
        });

        lblA.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblA.setForeground(new java.awt.Color(0, 0, 255));
        lblA.setText("0");

        lblB.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblB.setForeground(new java.awt.Color(0, 0, 255));
        lblB.setText("0");

        lblC.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblC.setForeground(new java.awt.Color(0, 0, 255));
        lblC.setText("0");

        btnVerificar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnVerificar.setText("Verificar");
        btnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarActionPerformed(evt);
            }
        });

        lblStatus.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblStatus.setForeground(new java.awt.Color(204, 0, 0));
        lblStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStatus.setText("Forma ou Não");

        lblTipo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblTipo.setForeground(new java.awt.Color(204, 0, 51));
        lblTipo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTipo.setText("Tipo de triangulo");

        javax.swing.GroupLayout panRespostaLayout = new javax.swing.GroupLayout(panResposta);
        panResposta.setLayout(panRespostaLayout);
        panRespostaLayout.setHorizontalGroup(
            panRespostaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panRespostaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panRespostaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        panRespostaLayout.setVerticalGroup(
            panRespostaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panRespostaLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblStatus)
                .addGap(18, 18, 18)
                .addComponent(lblTipo)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panResposta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(btnVerificar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sliC, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sliB, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sliA, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sliA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sliB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sliC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btnVerificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panResposta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarActionPerformed
        // TODO add your handling code here:
        int a = sliA.getValue();
        int b = sliB.getValue();
        int c = sliC.getValue();
        if(a<b+c && b<a+c && c<a+b){
            lblStatus.setText("Formam um triangulo");
            if(a==b && b==c){
                lblTipo.setText("Equilatero");
            }else if(a!=b && b!=c && c!=a){
                lblTipo.setText("Escaleno");
            }else{
                lblTipo.setText("Isósceles");
            }
        }else{
            lblStatus.setText("Não fomam um trinagulo");
            lblTipo.setText("-----");
        }
        
        panResposta.setVisible(true);
        
        
    }//GEN-LAST:event_btnVerificarActionPerformed

    private void sliAStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliAStateChanged
        // TODO add your handling code here:
        lblA.setText(Integer.toString(sliA.getValue()));
        
    }//GEN-LAST:event_sliAStateChanged

    private void sliBStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliBStateChanged
        // TODO add your handling code here:
        lblB.setText(Integer.toString(sliB.getValue()));
    }//GEN-LAST:event_sliBStateChanged

    private void sliCStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliCStateChanged
        // TODO add your handling code here:
        lblC.setText(Integer.toString(sliC.getValue()));
    }//GEN-LAST:event_sliCStateChanged

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
            java.util.logging.Logger.getLogger(TelaTriangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaTriangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaTriangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaTriangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaTriangulo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVerificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblA;
    private javax.swing.JLabel lblB;
    private javax.swing.JLabel lblC;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JPanel panResposta;
    private javax.swing.JSlider sliA;
    private javax.swing.JSlider sliB;
    private javax.swing.JSlider sliC;
    // End of variables declaration//GEN-END:variables
}
