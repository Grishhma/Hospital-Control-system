/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Ui;

/**
 *
 * @author riddhivora
 */
public class createhospital extends javax.swing.JPanel {

    /**
     * Creates new form createhospital
     */
    public createhospital() {
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

        addHosAddressLabel = new javax.swing.JLabel();
        addHosAddressText = new javax.swing.JTextField();
        addHosCityLabel = new javax.swing.JLabel();
        AddHosCityText = new javax.swing.JTextField();
        addHosPinCodeLabel = new javax.swing.JLabel();
        addHosPinCodeText = new javax.swing.JTextField();
        addHosTypeLabel = new javax.swing.JLabel();
        addHosTypeText = new javax.swing.JTextField();
        createHospitalTitle = new javax.swing.JLabel();
        addHosButton = new javax.swing.JButton();
        addHosNameLabel = new javax.swing.JLabel();
        addHosNameText = new javax.swing.JTextField();

        addHosAddressLabel.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        addHosAddressLabel.setText("Address:");

        addHosAddressText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addHosAddressTextActionPerformed(evt);
            }
        });

        addHosCityLabel.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        addHosCityLabel.setText("City:");

        addHosPinCodeLabel.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        addHosPinCodeLabel.setText("Pin Code:");

        addHosTypeLabel.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        addHosTypeLabel.setText("Type:");

        addHosTypeText.setText("jTextField1");

        createHospitalTitle.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        createHospitalTitle.setText("ADD A HOSPITAL");

        addHosButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        addHosButton.setText("ADD");
        addHosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addHosButtonActionPerformed(evt);
            }
        });

        addHosNameLabel.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        addHosNameLabel.setText("Hospital Name:");

        addHosNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addHosNameTextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(172, 172, 172)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addHosAddressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addHosNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addHosCityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addHosTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addHosPinCodeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addHosAddressText, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addHosNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddHosCityText, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addHosPinCodeText, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addHosTypeText, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(createHospitalTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(328, 328, 328)
                        .addComponent(addHosButton)))
                .addContainerGap(175, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(createHospitalTitle)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addHosNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addHosNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addHosAddressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addHosAddressText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addHosCityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddHosCityText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addHosPinCodeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addHosPinCodeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addHosTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addHosTypeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(addHosButton)
                .addContainerGap(170, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addHosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addHosButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addHosButtonActionPerformed

    private void addHosNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addHosNameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addHosNameTextActionPerformed

    private void addHosAddressTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addHosAddressTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addHosAddressTextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AddHosCityText;
    private javax.swing.JLabel addHosAddressLabel;
    private javax.swing.JTextField addHosAddressText;
    private javax.swing.JButton addHosButton;
    private javax.swing.JLabel addHosCityLabel;
    private javax.swing.JLabel addHosNameLabel;
    private javax.swing.JTextField addHosNameText;
    private javax.swing.JLabel addHosPinCodeLabel;
    private javax.swing.JTextField addHosPinCodeText;
    private javax.swing.JLabel addHosTypeLabel;
    private javax.swing.JTextField addHosTypeText;
    private javax.swing.JLabel createHospitalTitle;
    // End of variables declaration//GEN-END:variables
}
