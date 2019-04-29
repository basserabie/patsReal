/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patstake1;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author YishaiBasserabie
 */
public class mothers extends javax.swing.JFrame {
    /**
     * Creates new form mothers
     */
    public static String MOTHER_SELECTED;
    public static String MOTHER_EMAIL;
    public static String MOTHER_CELL;
    
    public mothers() {
        initComponents();
        populateComboBoxes pop = new populateComboBoxes();
        this.parentsTable.setModel(pop.parents());
        DefaultComboBoxModel filterType = new DefaultComboBoxModel(pop.populateParentFilterTypeComboBox());
        this.filterTypeComboBox.setModel(filterType);
    }
    

    public void resetTable(DefaultTableModel model) {
        this.parentsTable.setModel(model);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backToDashboard = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        parentsTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        filterTypeComboBox = new javax.swing.JComboBox<>();
        searchTextField = new javax.swing.JTextField();
        filterButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        infoButton = new javax.swing.JButton();
        displayAllButton = new javax.swing.JButton();
        contactButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        selectedParentLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backToDashboard.setText("back");
        backToDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToDashboardActionPerformed(evt);
            }
        });

        jLabel1.setText("Here You Can Select, Delete, and Edit Parents!");

        parentsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(parentsTable);

        jLabel2.setText("search parent by:");

        filterTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        filterTypeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterTypeComboBoxActionPerformed(evt);
            }
        });

        filterButton.setText("filter");
        filterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterButtonActionPerformed(evt);
            }
        });

        editButton.setText("edit selected parent");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        infoButton.setText("more info on selected parent");
        infoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoButtonActionPerformed(evt);
            }
        });

        displayAllButton.setText("display all!");
        displayAllButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayAllButtonActionPerformed(evt);
            }
        });

        contactButton.setText("contact Selected parent");

        jLabel3.setText("selected parent:");

        selectedParentLabel.setText("unselected");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(filterTypeComboBox, 0, 184, Short.MAX_VALUE)
                            .addComponent(searchTextField))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(infoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(contactButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(displayAllButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(selectedParentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 183, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backToDashboard)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(filterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backToDashboard)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(filterTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editButton)
                            .addComponent(displayAllButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(contactButton)
                        .addComponent(infoButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(filterButton)
                    .addComponent(jLabel3)
                    .addComponent(selectedParentLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backToDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToDashboardActionPerformed
        dashboard d = new dashboard();
        this.setVisible(false);
        d.setVisible(true);
    }//GEN-LAST:event_backToDashboardActionPerformed

    private void filterTypeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filterTypeComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_filterTypeComboBoxActionPerformed

    private void filterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filterButtonActionPerformed
        populateComboBoxes pop = new populateComboBoxes();
        switch (this.filterTypeComboBox.getSelectedItem().toString()) {
            case "Parent Name":
                this.parentsTable.setModel(pop.parentsByParentName(this.searchTextField.getText()));
                break;
            case "Child Name":
                this.parentsTable.setModel(pop.parentsByChildName(this.searchTextField.getText()));
                break;
        }
    }//GEN-LAST:event_filterButtonActionPerformed

    private void displayAllButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayAllButtonActionPerformed
        populateComboBoxes pop = new populateComboBoxes();
        this.parentsTable.setModel(pop.parents());
    }//GEN-LAST:event_displayAllButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        mothersArray ma = new mothersArray();
        editMotherForm emf = new editMotherForm();
        if (!this.parentsTable.getSelectionModel().isSelectionEmpty()) {
            this.selectedParentLabel.setText(this.parentsTable.getModel().getValueAt(this.parentsTable.getSelectedRow(), 0).toString());
            MOTHER_EMAIL = this.parentsTable.getModel().getValueAt(this.parentsTable.getSelectedRow(), 1).toString();
            MOTHER_CELL = this.parentsTable.getModel().getValueAt(this.parentsTable.getSelectedRow(), 2).toString();
            MOTHER_SELECTED = this.selectedParentLabel.getText();
            ma.passSelectedMotherNameToEdit(this.selectedParentLabel.getText());
        } else {
            JOptionPane.showMessageDialog(null, "Please select a parent (row) first :)");
        }
    }//GEN-LAST:event_editButtonActionPerformed

    private void infoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoButtonActionPerformed
        moreInfoParentForm mi = new moreInfoParentForm();
        mothersArray ma = new mothersArray();
        if (!this.parentsTable.getSelectionModel().isSelectionEmpty()) {
            this.selectedParentLabel.setText(this.parentsTable.getModel().getValueAt(this.parentsTable.getSelectedRow(), 0).toString());
            MOTHER_SELECTED = this.selectedParentLabel.getText();
            ma.passSelectedMotherToInfo(this.selectedParentLabel.getText());
        } else {
            JOptionPane.showMessageDialog(null, "Please select a parent (row) first :)");
        }
    }//GEN-LAST:event_infoButtonActionPerformed

    /**
     * 
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
            java.util.logging.Logger.getLogger(mothers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mothers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mothers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mothers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mothers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backToDashboard;
    private javax.swing.JButton contactButton;
    private javax.swing.JButton displayAllButton;
    private javax.swing.JButton editButton;
    private javax.swing.JButton filterButton;
    private javax.swing.JComboBox<String> filterTypeComboBox;
    private javax.swing.JButton infoButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable parentsTable;
    private javax.swing.JTextField searchTextField;
    private javax.swing.JLabel selectedParentLabel;
    // End of variables declaration//GEN-END:variables
}
