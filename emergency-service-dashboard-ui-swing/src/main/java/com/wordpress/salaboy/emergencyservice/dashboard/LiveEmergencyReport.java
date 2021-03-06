/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * LiveEmergencyReport.java
 *
 * Created on Apr 29, 2011, 11:40:00 PM
 */
package com.wordpress.salaboy.emergencyservice.dashboard;

import com.wordpress.salaboy.emergencyservice.monitor.EmergencyMonitorPanel;
import com.wordpress.salaboy.model.Emergency;
import com.wordpress.salaboy.model.serviceclient.DistributedPeristenceServerService;

/**
 *
 * @author salaboy
 */
public class LiveEmergencyReport extends javax.swing.JFrame {
    private Long emergencyId;
    private Emergency emergency;
    private EmergencyMonitorPanel monitor;
    /** Creates new form LiveEmergencyReport */
    public LiveEmergencyReport(Long emergencyId) {
        this.emergencyId = emergencyId;
        
        this.emergency = DistributedPeristenceServerService.getInstance().loadEmergency(emergencyId);
        
        initComponents();
        configure();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedMonitorPane = new javax.swing.JTabbedPane();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Contextual Area", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jTabbedMonitorPane.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jTabbedMonitorPane, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jTabbedMonitorPane, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                .addContainerGap())
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTabbedPane jTabbedMonitorPane;
    // End of variables declaration//GEN-END:variables

    private void configure() {
        monitor = new EmergencyMonitorPanel(emergency.getCall().getId());
        
        jTabbedMonitorPane.add(monitor);

        this.pack();
    }
}
