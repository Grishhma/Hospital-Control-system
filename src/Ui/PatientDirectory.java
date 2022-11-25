/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Ui;

import Model.Encounter;
import Model.Patient;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author riddhivora
 */
public class PatientDirectory extends javax.swing.JPanel {

    /**
     * Creates new form PatientDirectory
     */
    public PatientDirectory() {
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

        lblTemp = new javax.swing.JLabel();
        btnView = new javax.swing.JButton();
        lblPulse = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        lblBP = new javax.swing.JLabel();
        lblComm = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtComm = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPatEncounter = new javax.swing.JTable();
        txtAge = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblRespRate = new javax.swing.JLabel();
        txtBP = new javax.swing.JTextField();
        txtPulse = new javax.swing.JTextField();
        txtTemp = new javax.swing.JTextField();
        txtRespRate = new javax.swing.JTextField();

        setAutoscrolls(true);

        lblTemp.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        lblTemp.setText("Body Temperature:");

        btnView.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        lblPulse.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        lblPulse.setText("Pulse:");

        btnUpdate.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        lblBP.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        lblBP.setText("Blood Pressure:");

        lblComm.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        lblComm.setText("Community:");

        lblCity.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        lblCity.setText("City:");

        lblAge.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        lblAge.setText("Age:");

        lblName.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        lblName.setText("Name:");

        txtCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityActionPerformed(evt);
            }
        });

        tblPatEncounter.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        tblPatEncounter.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Age", "City", "Community", "BP", "Pulse", "Body Temperature", "Respiration Rate"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPatEncounter);

        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PATIENT  DIRECTORY");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        lblRespRate.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        lblRespRate.setText("Respiration Rate:");

        txtBP.setText("jTextField1");

        txtPulse.setText("jTextField2");

        txtTemp.setText("jTextField3");

        txtRespRate.setText("jTextField4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(742, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtBP, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                    .addComponent(txtPulse)
                    .addComponent(txtTemp)
                    .addComponent(txtRespRate))
                .addGap(39, 39, 39))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(14, 14, 14)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 954, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(117, 117, 117)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblName)
                                .addComponent(lblAge, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(4, 4, 4)
                                    .addComponent(lblCity, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(lblComm))
                            .addGap(23, 23, 23)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtComm)
                                .addComponent(txtName)
                                .addComponent(txtAge)
                                .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(286, 286, 286)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTemp, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblPulse)
                                    .addComponent(lblBP))
                                .addComponent(lblRespRate)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(385, 385, 385)
                            .addComponent(btnUpdate)
                            .addGap(102, 102, 102)
                            .addComponent(btnView)))
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(316, Short.MAX_VALUE)
                .addComponent(txtBP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtPulse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtTemp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtRespRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblName)
                        .addComponent(lblBP)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblAge)
                        .addComponent(lblPulse)
                        .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCity)
                        .addComponent(lblTemp)
                        .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(21, 21, 21)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblComm)
                        .addComponent(lblRespRate)
                        .addComponent(txtComm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(32, 32, 32)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnUpdate)
                        .addComponent(btnView))
                    .addContainerGap()))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:

        int selectedRowIndex = tblPatEncounter.getSelectedRow();

        if(selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a row to view.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tblPatEncounter.getModel();
        Patient selectedPatient = (Patient) model.getValueAt(selectedRowIndex, 0);

        txtName.setText(selectedPatient.getName());
        txtAge.setText(String.valueOf(selectedPatient.getAge()));
        txtCity.setText(selectedPatient.getCity());
        txtComm.setText(selectedPatient.getCommunity());
        //vitals
        txtBP.setText(String.valueOf(selectedPatient.getBp()));
        txtPulse.setText(String.valueOf(selectedPatient.getPulse()));
        txtRespRate.setText(String.valueOf(selectedPatient.getResp_rate()));
        txtTemp.setText(String.valueOf(selectedPatient.getTemp()));

    }//GEN-LAST:event_btnViewActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:

        String name = txtName.getText();
        int age = Integer.parseInt(txtAge.getText());
        String city = txtCity.getText();
        String community = txtComm.getText();

        int BP = Integer.parseInt(txtBP.getText());
        int pulse = Integer.parseInt(txtPulse.getText());
        int temp = Integer.parseInt(txtTemp.getText());
        int resp_rate = Integer.parseInt(txtRespRate.getText());

        Date date = new Date();

        int selectedRowIndex = tblPatEncounter.getSelectedRow();

        if(selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a row to update");
        }

        DefaultTableModel model = (DefaultTableModel) tblPatEncounter.getModel();

        String sno = model.getValueAt(selectedRowIndex, 0).toString();

        for(Patient patient : patient.getPatient() {
            if(patient.getName().equals(sno)){
                patient.setAge(Integer.parseInt(txtAge.getText()));
                patient.setCity(txtCity.getText());
                patient.setCommunity(txtComm.getText());
                patient.setBp(Integer.parseInt(txtBP.getText()));
                patient.setPulse(Integer.parseInt(txtPulse.getText()));
                patient.setTemp(Integer.parseInt(txtTemp.getText()));
                patient.setResp_rate(Integer.parseInt(txtRespRate.getText()));

            }

        }
        populateTable();
        Encounter encounter = encounterhis.addNewEncounter();
        encounter.setName(name);
        encounter.setAge(age);
        encounter.setCity(city);
        encounter.setCommunity(community);
        encounter.setBp(BP);
        encounter.setPulse(pulse);
        encounter.setTemp(temp);
        encounter.setResp_rate(resp_rate);
        encounter.setDate(date);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCityActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblBP;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblComm;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPulse;
    private javax.swing.JLabel lblRespRate;
    private javax.swing.JLabel lblTemp;
    private javax.swing.JTable tblPatEncounter;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtBP;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtComm;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPulse;
    private javax.swing.JTextField txtRespRate;
    private javax.swing.JTextField txtTemp;
    // End of variables declaration//GEN-END:variables

    Iterable<Patient> getPatient() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void deletePatient(Patient selectedPatient) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Patient addNewPatient() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
