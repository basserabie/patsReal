/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patstake1;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author YishaiBasserabie
 */
public class lesson extends javax.swing.JFrame {

    public static int SELECTED_LESSON_ID;
    public static String SELECTED_LESSON_DATE;
    public static String SELECTED_LESSON_TIME;
    
    /**
     * Creates new form lesson
     */
    public lesson() {
        initComponents();
        this.selectedLessonLabel.setText("----------------");
        this.seeStudentsButton.setText("---------");
        populateComboBoxes pop = new populateComboBoxes();
        this.searchComboBox.removeAllItems();
        this.filterTypeStudent.removeAllItems();;
        this.filterTypeStudent.addItem("Use Date Picker");
        this.searchComboBox.addItem("Use Date Picker");
        this.searchTextField.setText("Use Date Picker");
        this.lessonsTable.setModel(pop.Lessons());
        this.lessonsTable.setAutoCreateRowSorter(true);
        DefaultComboBoxModel primarySearch = new DefaultComboBoxModel(pop.populatePrimaryFilterTpeLessonsComboBox());
        this.filterTypeComboBox.setModel(primarySearch);
        
    }
    
    public void setTableModel(DefaultTableModel model) {
        this.lessonsTable.setModel(model);
    } 

    public JButton getSeeStudentsButton() {
        return seeStudentsButton;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backToDashboardButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lessonsTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        filterTypeComboBox = new javax.swing.JComboBox<>();
        dateChooser = new com.toedter.calendar.JDateChooser();
        secondarySearchPanel = new javax.swing.JLayeredPane();
        searchTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        filterTypeStudent = new javax.swing.JComboBox<>();
        editLesson = new javax.swing.JButton();
        deleteLesson = new javax.swing.JButton();
        moreInfoLesson = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        selectedLessonLabel = new javax.swing.JLabel();
        searchComboBox = new javax.swing.JComboBox<>();
        searchByDate = new javax.swing.JButton();
        seeStudentsButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backToDashboardButton.setText("back");
        backToDashboardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToDashboardButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("lessons");

        lessonsTable.setModel(new javax.swing.table.DefaultTableModel(
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
        lessonsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lessonsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lessonsTable);

        jLabel2.setText("Search By:");

        filterTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        filterTypeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterTypeComboBoxActionPerformed(evt);
            }
        });

        secondarySearchPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        searchTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTextFieldActionPerformed(evt);
            }
        });
        searchTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                searchTextFieldKeyTyped(evt);
            }
        });

        jLabel3.setText("Secondary search:");

        filterTypeStudent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        secondarySearchPanel.setLayer(searchTextField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        secondarySearchPanel.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        secondarySearchPanel.setLayer(filterTypeStudent, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout secondarySearchPanelLayout = new javax.swing.GroupLayout(secondarySearchPanel);
        secondarySearchPanel.setLayout(secondarySearchPanelLayout);
        secondarySearchPanelLayout.setHorizontalGroup(
            secondarySearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(secondarySearchPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(secondarySearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(filterTypeStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(secondarySearchPanelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        secondarySearchPanelLayout.setVerticalGroup(
            secondarySearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(secondarySearchPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filterTypeStudent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        editLesson.setText("Edit Lesson");
        editLesson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editLessonActionPerformed(evt);
            }
        });

        deleteLesson.setText("Delete Lesson");

        moreInfoLesson.setText("More Info");

        reset.setText("Display All");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        jLabel4.setText("Selected Lesson:");

        selectedLessonLabel.setText("jLabel5");

        searchComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        searchComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchComboBoxActionPerformed(evt);
            }
        });

        searchByDate.setText("Go Date");
        searchByDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchByDateActionPerformed(evt);
            }
        });

        seeStudentsButton.setText("See Students!");
        seeStudentsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seeStudentsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(backToDashboardButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(filterTypeComboBox, 0, 199, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(searchComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(searchByDate)))))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(secondarySearchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(deleteLesson, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(moreInfoLesson, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(seeStudentsButton))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(editLesson, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(selectedLessonLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 194, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 28, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(secondarySearchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(editLesson)
                                    .addComponent(reset))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(deleteLesson)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(moreInfoLesson))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(seeStudentsButton)))))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(backToDashboardButton)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(filterTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(selectedLessonLabel)
                                    .addComponent(searchComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(searchByDate))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backToDashboardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToDashboardButtonActionPerformed
        lessonDataArray la = new lessonDataArray();
        la.sortArray();
        this.setVisible(false);
    }//GEN-LAST:event_backToDashboardButtonActionPerformed

    private void searchTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTextFieldKeyTyped
        populateComboBoxes pop = new populateComboBoxes();
        switch (this.filterTypeStudent.getSelectedItem().toString()) {
            case "Student Name":
                this.lessonsTable.setModel(pop.LessonsByStudentName(this.searchTextField.getText()));
                break;
            case "Mother Name":
                this.lessonsTable.setModel(pop.LessonsByParentSName(this.searchTextField.getText()));
                break;
            case "School":
                this.lessonsTable.setModel(pop.LessonsBySchool(this.searchTextField.getText()));
        }
    }//GEN-LAST:event_searchTextFieldKeyTyped

    private void filterTypeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filterTypeComboBoxActionPerformed
        populateComboBoxes pop = new populateComboBoxes();
        switch (this.filterTypeComboBox.getSelectedItem().toString()) {
            case "Date":
                String dateChosenCorrection [] = {"Use Date Picker"};
                DefaultComboBoxModel dateChosenModel = new DefaultComboBoxModel(dateChosenCorrection);
                this.searchComboBox.setModel(dateChosenModel);
                this.filterTypeStudent.setModel(dateChosenModel);
                this.searchTextField.setText(dateChosenCorrection[0]);
                this.lessonsTable.setModel(pop.Lessons());
                break;
            case "Venue":
                String venueChosenCorrection [] = {"Use Venue Box"};
                DefaultComboBoxModel venueChosenModel = new DefaultComboBoxModel(venueChosenCorrection);
                this.filterTypeStudent.setModel(venueChosenModel);
                this.searchTextField.setText(venueChosenCorrection[0]);
                DefaultComboBoxModel venuesModel = new DefaultComboBoxModel(pop.populateVenues());
                this.searchComboBox.setModel(venuesModel);
                this.lessonsTable.setModel(pop.Lessons());
                break;
            case "Student":
                String studentNameChosenCorrection [] = {"Use Student Block"};
                DefaultComboBoxModel studentNameChosenModel = new DefaultComboBoxModel(studentNameChosenCorrection);
                this.searchComboBox.setModel(studentNameChosenModel);
                DefaultComboBoxModel studentPickerModel = new DefaultComboBoxModel(pop.populateStudentFilterTypeComboBox());
                this.filterTypeStudent.setModel(studentPickerModel);
                this.searchTextField.setText("");
                this.lessonsTable.setModel(pop.Lessons());
                break;
        }
    }//GEN-LAST:event_filterTypeComboBoxActionPerformed

    private void searchTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTextFieldActionPerformed
        
    }//GEN-LAST:event_searchTextFieldActionPerformed

    private void searchComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchComboBoxActionPerformed
       populateComboBoxes pop = new populateComboBoxes();
       if (this.filterTypeComboBox.getSelectedItem().toString().equals("Venue")) {
           this.lessonsTable.setModel(pop.LessonsByVenue(this.searchComboBox.getSelectedItem().toString()));
       }
    }//GEN-LAST:event_searchComboBoxActionPerformed

    private void searchByDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchByDateActionPerformed
        populateComboBoxes poop = new populateComboBoxes();
        lessonDataArray la = new lessonDataArray();
        String date = la.formatDate(this.dateChooser.getDate().toString());
        if (!(this.dateChooser.getDate().toString()).equals("")) {
            this.lessonsTable.setModel(poop.LessonsByDate(date));
        } else {
            JOptionPane.showMessageDialog(null, "please select a date first\nor ensure that the filter type is set to date.");
        }
    }//GEN-LAST:event_searchByDateActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        populateComboBoxes pop = new populateComboBoxes();
        this.lessonsTable.setModel(pop.Lessons());
    }//GEN-LAST:event_resetActionPerformed

    private void lessonsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lessonsTableMouseClicked
        populateComboBoxes pop = new populateComboBoxes();
        lessonDataArray la = new lessonDataArray();
        studentsArray sa = new studentsArray();
        this.seeStudentsButton.setText("See Students!");
        String date = this.lessonsTable.getModel().getValueAt(this.lessonsTable.getSelectedRow(), 2).toString();
        int studentID = sa.studentIDFromName(this.lessonsTable.getModel().getValueAt(this.lessonsTable.getSelectedRow(), 0).toString());
        String time = this.lessonsTable.getModel().getValueAt(this.lessonsTable.getSelectedRow(), 3).toString().substring(0, 5);
        SELECTED_LESSON_ID = la.getLessoIDFromDateTimeAndStudentID(date, time, studentID);
        SELECTED_LESSON_DATE = date;
        SELECTED_LESSON_TIME = time;
        this.selectedLessonLabel.setText(pop.populateSelectedLessonLabel(SELECTED_LESSON_ID));
    }//GEN-LAST:event_lessonsTableMouseClicked

    private void seeStudentsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seeStudentsButtonActionPerformed
     seeStudentsForm ssf = new seeStudentsForm();
     if (!this.lessonsTable.getSelectionModel().isSelectionEmpty()) {
         ssf.setLocation((this.seeStudentsButton.getLocationOnScreen().x - 358), (this.seeStudentsButton.getLocationOnScreen().y));
         ssf.setVisible(true);
     } else {
         JOptionPane.showMessageDialog(null, "Please Select A Lesson (row) First");
     }
    }//GEN-LAST:event_seeStudentsButtonActionPerformed

    private void editLessonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editLessonActionPerformed
        editLessonForm elf = new editLessonForm();
        elf.setVisible(true);
    }//GEN-LAST:event_editLessonActionPerformed

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
            java.util.logging.Logger.getLogger(lesson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(lesson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(lesson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(lesson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new lesson().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backToDashboardButton;
    private com.toedter.calendar.JDateChooser dateChooser;
    private javax.swing.JButton deleteLesson;
    private javax.swing.JButton editLesson;
    private javax.swing.JComboBox<String> filterTypeComboBox;
    private javax.swing.JComboBox<String> filterTypeStudent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable lessonsTable;
    private javax.swing.JButton moreInfoLesson;
    private javax.swing.JButton reset;
    private javax.swing.JButton searchByDate;
    private javax.swing.JComboBox<String> searchComboBox;
    private javax.swing.JTextField searchTextField;
    private javax.swing.JLayeredPane secondarySearchPanel;
    private javax.swing.JButton seeStudentsButton;
    private javax.swing.JLabel selectedLessonLabel;
    // End of variables declaration//GEN-END:variables
}
