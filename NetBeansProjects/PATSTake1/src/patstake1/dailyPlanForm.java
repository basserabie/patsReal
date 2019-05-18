/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patstake1;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import static javax.swing.JTable.AUTO_RESIZE_OFF;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author YishaiBasserabie
 */
public class dailyPlanForm extends javax.swing.JFrame {
    
    /**
     * Creates new form dailyPlanForm
     */
    public dailyPlanForm() {
        initComponents();
        CalendarHandler ch = new CalendarHandler();

        this.dayTable.setAutoResizeMode(AUTO_RESIZE_OFF);
        this.dayTable.getColumnModel().getColumn(0).setPreferredWidth(5);
        this.dayTable.setRowHeight(120);
        this.dayTable.setModel(ch.DefModel());
        
    }
    
    public void setDateLabel(String date) {
        this.dateLabel.setText(date);
    }
    
    public void setDayTableVisible(boolean set) {
        this.dayTable.setVisible(set);
    }
    
    public void setLoadingLabelVisible(boolean set) {
        this.loadingLabel.setVisible(set);
    }
    
    public void setLoadingLabelText(String text) {
        this.loadingLabel.setText(text);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dayTable = new javax.swing.JTable();
        showDay = new javax.swing.JButton();
        loadingLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backButton.setText("back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Your plan for:");

        dateLabel.setText("jLabel2");

        dayTable.setModel(new javax.swing.table.DefaultTableModel(
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
        dayTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        dayTable.setRowHeight(200);
        dayTable.setRowSelectionAllowed(false);
        dayTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dayTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(dayTable);

        showDay.setText("show day");
        showDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showDayActionPerformed(evt);
            }
        });

        loadingLabel.setText("<<----CLICK SHOW DAY!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(backButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(showDay)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loadingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 995, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton)
                    .addComponent(jLabel1)
                    .addComponent(dateLabel)
                    .addComponent(showDay)
                    .addComponent(loadingLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showDayActionPerformed
        CalendarHandler ch = new CalendarHandler();
        this.loadingLabel.setText("NOW LOADING DAY......");
        ch.LessonsOnDay(this.dateLabel.getText());
        if (CalendarHandler.DAY_HAS_LESSON) {
            this.dayTable.setModel(ch.selectedDateModel(this.dateLabel.getText()));
            this.loadingLabel.setText("NOW SHOWING LESSONS:");
        } else {
            this.dayTable.setModel(ch.noLessonModel());
            this.dayTable.setVisible(false);
            this.loadingLabel.setText("NO LESSONS ON THIS DAY :), WATCH A MOVIE!");
        }
        
    }//GEN-LAST:event_showDayActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_backButtonActionPerformed

    private void dayTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dayTableMouseClicked
        CalendarHandler ch = new CalendarHandler();
        String timeClicked = this.dayTable.getColumnName(this.dayTable.getSelectedColumn());
        JOptionPane.showMessageDialog(null, ch.getLessonDataOnThatDateAndTime(this.dateLabel.getText(), timeClicked));
    }//GEN-LAST:event_dayTableMouseClicked

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
            java.util.logging.Logger.getLogger(dailyPlanForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dailyPlanForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dailyPlanForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dailyPlanForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dailyPlanForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JTable dayTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel loadingLabel;
    private javax.swing.JButton showDay;
    // End of variables declaration//GEN-END:variables
}
