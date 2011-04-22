/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * SuggestedProceduresPanel.java
 *
 * Created on Apr 21, 2011, 7:47:07 PM
 */
package com.wordpress.salaboy.emergencyservice.taskslist.swing;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author salaboy
 */
public class SuggestedProceduresPanel extends javax.swing.JPanel {
    private AmbulanceControlPanel parent;
    private List<String> suggestedProcedures;
    /** Creates new form SuggestedProceduresPanel */
    public SuggestedProceduresPanel(AmbulanceControlPanel parent) {
        this.parent = parent;
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        emergencyLocationjTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        emergencyTypejTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        peopleInvolvedjTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        suggestedProceduresjList = new javax.swing.JList();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jLabel1.setText("Suggested Procedures for Emergency:");

        emergencyLocationjTextField.setText("jTextField1");

        jLabel2.setText("Location:");

        jLabel3.setText("Type:");

        emergencyTypejTextField.setText("jTextField1");

        peopleInvolvedjTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(peopleInvolvedjTable);

        jLabel4.setText("People:");

        suggestedProceduresjList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(suggestedProceduresjList);

        jLabel5.setText("Suggested Procedures:");

        jButton1.setText("Select Procedure");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .addContainerGap()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel1)
                            .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                            .add(jLabel4)
                            .add(layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jLabel2)
                                    .add(jLabel3))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(emergencyTypejTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 145, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(emergencyLocationjTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 145, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                            .add(jScrollPane2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                            .add(jLabel5)))
                    .add(layout.createSequentialGroup()
                        .add(133, 133, 133)
                        .add(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel2)
                    .add(emergencyLocationjTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel3)
                    .add(emergencyTypejTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(16, 16, 16)
                .add(jLabel4)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 117, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(9, 9, 9)
                .add(jLabel5)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 98, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jButton1)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField emergencyLocationjTextField;
    private javax.swing.JTextField emergencyTypejTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable peopleInvolvedjTable;
    private javax.swing.JList suggestedProceduresjList;
    // End of variables declaration//GEN-END:variables
    public void configurePanel(String taskinfo) {
        String[] values= taskinfo.split(",");
        System.out.println("TaskInfo = "+taskinfo);
        String emergencyType = values[0].trim(); 
        String emergencyLocationX = values[1].trim(); 
        String emergencyLocationY = values[2].trim(); 
        String emergencyNroOfPeople = values[3].trim(); 
        String patientAge = "";
        String patientGender = "";
        if(emergencyNroOfPeople.equals("1")){
            patientAge = values[4].trim(); 
            patientGender = values[5].trim(); 
        }
        String suggestedProceduresString = values[6].trim();
        if(suggestedProceduresString != null && !suggestedProceduresString.equals("")){
            suggestedProcedures = getSuggestedProceduresNames(suggestedProceduresString);
        }
        
        
        
        
    }
    
    public List<String> getSuggestedProceduresNames(String suggestedProceduresString){
        List<String> results = new ArrayList<String>();
        
        return results;
        
    }
}