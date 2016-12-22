/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osprocessesalgo;

import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import static osprocessesalgo.OSProcessesAlgo.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
/**
 *
 * @author root
 */
public class GUIFrame extends javax.swing.JFrame {

    /**
     * Creates new form GUIFrame
     */
    public GUIFrame() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        sjfPremRadio = new javax.swing.JRadioButton();
        sjfNonRadio = new javax.swing.JRadioButton();
        rrRadio = new javax.swing.JRadioButton();
        priorityPremRadio = new javax.swing.JRadioButton();
        fcfsRadio = new javax.swing.JRadioButton();
        arrivalText = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        burstText = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        proccesMainLabel = new javax.swing.JLabel();
        priorityNonRadio = new javax.swing.JRadioButton();
        addButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        AddTable = new javax.swing.JTable();
        showResultsButton = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        priorityText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        quantumText = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        ResultTable = new javax.swing.JTable();
        clearButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Processes' Algorithms Simulator");
        setLocation(new java.awt.Point(250, 100));
        setResizable(false);

        buttonGroup1.add(sjfPremRadio);
        sjfPremRadio.setText("SJF ( Prem. )");

        buttonGroup1.add(sjfNonRadio);
        sjfNonRadio.setText("SJF ( Non-Prem. )");

        buttonGroup1.add(rrRadio);
        rrRadio.setText("RR");

        buttonGroup1.add(priorityPremRadio);
        priorityPremRadio.setLabel("Priority ( Prem. )");

        buttonGroup1.add(fcfsRadio);
        fcfsRadio.setLabel("FCFS");

        jLabel12.setText(" Burst Time: ");

        jLabel11.setText("Arrival Time: ");

        proccesMainLabel.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        proccesMainLabel.setForeground(new java.awt.Color(245, 26, 26));
        proccesMainLabel.setText("Enter the process's details:");

        buttonGroup1.add(priorityNonRadio);
        priorityNonRadio.setLabel("Priority ( Non-Prem. )");

        addButton.setForeground(new java.awt.Color(5, 0, 255));
        addButton.setLabel("Add Process");
        addButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addButtonMouseClicked(evt);
            }
        });

        AddTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Process", "Arrival Time", "Burst Time", "Priority", "Quantum"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(AddTable);

        showResultsButton.setForeground(new java.awt.Color(35, 131, 22));
        showResultsButton.setText("Show Results");
        showResultsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showResultsButtonMouseClicked(evt);
            }
        });

        jLabel13.setText("Priority ");

        jLabel14.setFont(new java.awt.Font("Cantarell", 3, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(44, 120, 149));
        jLabel14.setText("* If Needed *");

        priorityText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priorityTextActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("LM Sans Demi Cond 10", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(159, 17, 109));
        jLabel1.setText("Developed By: Omar Mohamed Ashour ");

        jLabel15.setText("Quantum");

        jLabel16.setFont(new java.awt.Font("Cantarell", 3, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(44, 120, 149));
        jLabel16.setText("* If Needed *");

        ResultTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Process", "From", "To", "Burst Time", "Priority", "Waiting Time ", "Turnaround Time", "Exit Time"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(ResultTable);
        if (ResultTable.getColumnModel().getColumnCount() > 0) {
            ResultTable.getColumnModel().getColumn(2).setResizable(false);
        }

        clearButton.setForeground(new java.awt.Color(233, 146, 41));
        clearButton.setText("Clear");
        clearButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearButtonMouseClicked(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(100, 28, 112));
        jLabel2.setText("Processes Entered Table");

        jLabel3.setForeground(new java.awt.Color(171, 62, 75));
        jLabel3.setText("Results Table");

        jLabel4.setText("Avg.Waiting Time:");

        jLabel5.setText("Avg.TA Time:");

        jLabel6.setFont(new java.awt.Font("Cantarell", 2, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(213, 126, 28));
        jLabel6.setText(" ");

        jLabel7.setFont(new java.awt.Font("Cantarell", 2, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(213, 126, 28));
        jLabel7.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel16))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel14)))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(priorityText, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(quantumText, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(addButton))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(arrivalText, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(burstText, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fcfsRadio)
                            .addComponent(rrRadio))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(priorityPremRadio)
                            .addComponent(sjfPremRadio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(priorityNonRadio)
                            .addComponent(sjfNonRadio))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(305, 305, 305)
                        .addComponent(showResultsButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(proccesMainLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel7)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(proccesMainLabel)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(arrivalText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(burstText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(priorityText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(quantumText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fcfsRadio)
                            .addComponent(sjfPremRadio)
                            .addComponent(sjfNonRadio))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rrRadio)
                            .addComponent(priorityPremRadio)
                            .addComponent(priorityNonRadio))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(showResultsButton)
                    .addComponent(clearButton))
                .addGap(26, 26, 26))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButtonMouseClicked
        // TODO add your handling code here:
    DefaultTableModel model = (DefaultTableModel) AddTable.getModel();
    if(!priorityText.getText().equals("") && !quantumText.getText().equals("")){
    
        
        model.addRow(new Object[]{ "P #"+(++i), Double.parseDouble(arrivalText.getText()) ,Double.parseDouble(burstText.getText()),Double.parseDouble(priorityText.getText()), Double.parseDouble(quantumText.getText())  });
    
    }else if(priorityText.getText().equals("") && quantumText.getText().equals("")){
            model.addRow(new Object[]{ "P #"+(++i), Double.parseDouble(arrivalText.getText()) ,Double.parseDouble(burstText.getText()),0.0,0.0  });

    }else if(!priorityText.getText().equals("") && quantumText.getText().equals("")){
    
        
        model.addRow(new Object[]{ "P #"+(++i), Double.parseDouble(arrivalText.getText()) ,Double.parseDouble(burstText.getText()),Double.parseDouble(priorityText.getText()), 0.0  });
    
    }else if(priorityText.getText().equals("") && !quantumText.getText().equals("")){
                model.addRow(new Object[]{ "P #"+(++i), Double.parseDouble(arrivalText.getText()) ,Double.parseDouble(burstText.getText()),0.0, Double.parseDouble(quantumText.getText())  });

    }
   
    arrivalText.setText(null);
    burstText.setText(null);
    priorityText.setText(null);
    quantumText.setText(null);
    }//GEN-LAST:event_addButtonMouseClicked

    private void showResultsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showResultsButtonMouseClicked
        // TODO add your handling code here:
        
        
        System.out.println(AddTable.getRowCount());
        processes = new Process[(int)AddTable.getRowCount()];
        int outSize= (int)AddTable.getRowCount()*(int)AddTable.getRowCount()*(int)AddTable.getRowCount();
        outP = new Process[outSize];
        DefaultTableModel model = (DefaultTableModel) AddTable.getModel();
        DefaultTableModel modelR = (DefaultTableModel) ResultTable.getModel();
        modelR.setRowCount(0);
        
        for (int count = 0; count < model.getRowCount(); count++){
            processes[count]= new Process((String)model.getValueAt(count, 0),(double)model.getValueAt(count, 1),(double)model.getValueAt(count, 2),(double)model.getValueAt(count, 3), (double)model.getValueAt(count, 4) );
        
       
        }
         for(int j =0;j<model.getRowCount();j++){
            System.out.println(processes[j].getName()+"\t"+processes[j].getArrivalTime()+"\t"+processes[j].getBurstTime()+"\t"+processes[j].getPriority());
            

            }
         
//         Graphics g = new 
//         
//         g.drawRect(i, i, WIDTH, HEIGHT);
//         
//         System.out.println("FCFS:");
//         
//         
//         FCFS F = new FCFS();
//         F.Start();
         
         System.out.println();
         System.out.println();
         
         
                  System.out.println("SJF Non-preempitive:");
// for (int count = 0; count < model.getRowCount(); count++){
//            processes[count]= new Process((String)model.getValueAt(count, 0),(double)model.getValueAt(count, 1),(double)model.getValueAt(count, 2),(double)model.getValueAt(count, 3), (double)model.getValueAt(count, 4) );
//        
//       
//        }
//PriorityNonPrem pn = new PriorityNonPrem();
//                  pn.Start();
    
    if(fcfsRadio.isSelected()){
        FCFS fcfs = new FCFS();
        fcfs.Start();
        jLabel6.setText(Double.toString(fcfs.getAvgWaitingTime()));
        jLabel7.setText(Double.toString(fcfs.getAvgTurnaroundTime()));
    }else if(sjfNonRadio.isSelected()){
        SJFNonPrem sjfnon = new SJFNonPrem();
        sjfnon.Start();
        jLabel6.setText(Double.toString(sjfnon.getAvgWaitingTime()));
        jLabel7.setText(Double.toString(sjfnon.getAvgTurnaroundTime()));
    }else if(sjfPremRadio.isSelected()){
        SJFPrem sjf = new SJFPrem();
        sjf.Start();
        jLabel6.setText(Double.toString(sjf.getAvgWaitingTime()));
        jLabel7.setText(Double.toString(sjf.getAvgTurnaroundTime()));
    }else if(priorityPremRadio.isSelected()){
        PriorityPrem pp = new PriorityPrem();
        pp.Start();
        jLabel6.setText(Double.toString(pp.getAvgWaitingTime()));
        jLabel7.setText(Double.toString(pp.getAvgTurnaroundTime()));
    }else if(priorityNonRadio.isSelected()){
        PriorityNonPrem pn = new PriorityNonPrem();
        pn.Start();
        jLabel6.setText(Double.toString(pn.getAvgWaitingTime()));
        jLabel7.setText(Double.toString(pn.getAvgTurnaroundTime()));
    }else if(rrRadio.isSelected()){
        RR rr = new RR();
        rr.Start();
        jLabel6.setText(Double.toString(rr.getAvgWaitingTime()));
        jLabel7.setText(Double.toString(rr.getAvgTurnaroundTime()));
    }
    
//    PriorityPrem s = new PriorityPrem();
//    s.Start();
       //     System.out.println("No of arrivals:"+s.getNumberOfArrivals(processes));

//         SJFNonPrem sn = new SJFNonPrem();
//         sn.Start();
         for(int j =0;j<model.getRowCount();j++){
            System.out.println(processes[j].getName()+"\t"+processes[j].getArrivalTime()+"\t"+processes[j].getBurstTime()+"\t"+processes[j].getPriority()+"\t"+processes[j].getExitTime());
         }
         
         for(int i=0;i<processes.length;i++){
             System.out.println(processes[i].getWaitingTime());
         }
         
        // System.out.println(s.getAvgWaitingTime());
//                  System.out.println("Priority Non-prem:");
//                   for (int count = 0; count < model.getRowCount(); count++){
//            processes[count]= new Process((String)model.getValueAt(count, 0),(double)model.getValueAt(count, 1),(double)model.getValueAt(count, 2),(double)model.getValueAt(count, 3), (double)model.getValueAt(count, 4) );
//        
//       
//        }
//                  PriorityNonPrem pn = new PriorityNonPrem();
//                  pn.Start();
//    DefaultTableModel ResultModel = (DefaultTableModel) ResultTable.getModel();
//    for(int i=0;i<processes.length;i++){
//        
//        ResultModel.addRow(new Object[]{ processes[i].getName(), processes[i].getArrivalTime() ,processes[i].getBurstTime(),processes[i].getPriority(),processes[i].getWaitingTime(), processes[i].getTurnaroundTime(), processes[i].getExitTime() });
//
//    }

    }//GEN-LAST:event_showResultsButtonMouseClicked

    private void priorityTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priorityTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priorityTextActionPerformed

    private void clearButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearButtonMouseClicked
        // TODO add your handling code here:
        i=0;
        DefaultTableModel model = (DefaultTableModel) AddTable.getModel();
//        for(int i=0;i<model.getRowCount();i++){
//            model.removeRow(i); 
//        }model.removeRow(0);
        model.setRowCount(0);
        
        DefaultTableModel modelR = (DefaultTableModel) ResultTable.getModel();
        modelR.setRowCount(0);

        
    }//GEN-LAST:event_clearButtonMouseClicked
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
            java.util.logging.Logger.getLogger(GUIFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIFrame().setVisible(true);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
       // g.drawRect(i, i, WIDTH, HEIGHT);
    }
    
    public void addResultRow(Process p, double from, double to){
        DefaultTableModel model = (DefaultTableModel) ResultTable.getModel();
        model.addRow(new Object[]{ p.getName(), (double)from, (double)to ,p.getBurstTime(),p.getPriority(),p.getWaitingTime(), p.getTurnaroundTime(), p.getExitTime() });

    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable AddTable;
    private javax.swing.JTable ResultTable;
    private javax.swing.JButton addButton;
    private javax.swing.JTextField arrivalText;
    private javax.swing.JTextField burstText;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton clearButton;
    private javax.swing.JRadioButton fcfsRadio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton priorityNonRadio;
    private javax.swing.JRadioButton priorityPremRadio;
    private javax.swing.JTextField priorityText;
    private javax.swing.JLabel proccesMainLabel;
    private javax.swing.JTextField quantumText;
    private javax.swing.JRadioButton rrRadio;
    private javax.swing.JButton showResultsButton;
    private javax.swing.JRadioButton sjfNonRadio;
    private javax.swing.JRadioButton sjfPremRadio;
    // End of variables declaration//GEN-END:variables
    private static int i = 0;
}