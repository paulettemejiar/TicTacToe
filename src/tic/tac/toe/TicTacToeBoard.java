/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tic.tac.toe;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author paulette
 */
public class TicTacToeBoard extends javax.swing.JFrame {

    /**
     * Creates new form TicTacToeBoard
     */
    public TicTacToeBoard() {
        
        initComponents();
        frame.setBounds(100,100,600,400);
        
         jPanel8.setBackground(new Color(0,255,0));
        
    }
    JFrame frame =new JFrame();
        boolean playerX = true;
        int xScore =0;
        int oScore =0;
        int b1 =1;
        int b2 =1;
        int b3 =1;
        int b4 =1; 
        int b5 =1;
        int b6 =1;
        int b7 =1;
        int b8 =1;
        int b9 =1;
      
        
       
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Butt1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        Butt2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        Butt3 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        Xcount = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Butt4 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        Butt5 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        Butt6 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        Ocount = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        Butt7 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        Butt8 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        Butt9 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        resetButt = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        exitButt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setLayout(new java.awt.GridLayout(3, 5, 2, 2));

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Butt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Butt1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(Butt1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Butt1, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2);

        jPanel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Butt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Butt2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(Butt2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Butt2, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5);

        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Butt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Butt3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(Butt3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Butt3, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3);

        jPanel8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel1.setText("X's Score:");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel8);

        jPanel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Xcount.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        Xcount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Xcount.setText("0");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Xcount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Xcount, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel7);

        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Butt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Butt4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Butt4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Butt4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4);

        jPanel9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Butt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Butt5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Butt5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Butt5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel9);

        jPanel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Butt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Butt6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Butt6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Butt6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel6);

        jPanel10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel2.setText("O's Score:");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel10);

        jPanel12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Ocount.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        Ocount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Ocount.setText("0");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Ocount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Ocount, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel12);

        jPanel13.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Butt7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Butt7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Butt7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Butt7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel13);

        jPanel14.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Butt8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Butt8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Butt8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Butt8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel14);

        jPanel11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Butt9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Butt9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Butt9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Butt9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel11);

        jPanel15.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        resetButt.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        resetButt.setText("Reset");
        resetButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(resetButt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(resetButt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel15);

        jPanel17.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        exitButt.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        exitButt.setText("Exit");
        exitButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitButt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitButt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel17);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void playerTurn(){
    boolean playerX=true;
    
}
    private void resetButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtActionPerformed
      
        if(evt.getSource()==resetButt){
      Butt1.setText("");
      Butt2.setText("");
      Butt3.setText("");
      Butt4.setText("");
      Butt5.setText("");
      Butt6.setText("");
      Butt7.setText("");
      Butt8.setText("");
      Butt9.setText("");
      
        b1 =1;
        b2 =1;
        b3 =1;
        b4 =1; 
        b5 =1;
        b6 =1;
        b7 =1;
        b8 =1;
        b9 =1;
        
        
        }     
               
    }//GEN-LAST:event_resetButtActionPerformed
 
    private void Butt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Butt4ActionPerformed
        if(playerX && Butt4.getText().equals("")){
       Butt4.setText("X");
       playerX = false;
       b4=2;
        
   }
    if(Butt4.getText().equals("X")){
       Butt4.setText("X");
   }
    if (Butt4.getText().equals("O")){
         Butt4.setText("O");
    }
  if(!playerX && Butt4.getText().equals("")){
       Butt4.setText("O");
       playerX= true;
       b4=0;
        
   }
   
          winner();
         
    }//GEN-LAST:event_Butt4ActionPerformed

    private void Butt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Butt5ActionPerformed
       if(playerX && Butt5.getText().equals("")){
       Butt5.setText("X");
       playerX = false;
       b5=2;
        
   }
    if(Butt5.getText().equals("X")){
       Butt5.setText("X");
   }
    if (Butt5.getText().equals("O")){
         Butt5.setText("O");
    }
  if(!playerX && Butt5.getText().equals("")){
       Butt5.setText("O");
       playerX= true;
       b5=0;
        
   }
   
          winner();
         
    }//GEN-LAST:event_Butt5ActionPerformed

    private void Butt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Butt6ActionPerformed
       if(playerX && Butt6.getText().equals("")){
       Butt6.setText("X");
       playerX = false;
       b6=2;
        
   }
    if(Butt6.getText().equals("X")){
       Butt6.setText("X");
   }
    if (Butt6.getText().equals("O")){
         Butt6.setText("O");
    }
  if(!playerX && Butt6.getText().equals("")){
       Butt6.setText("O");
       playerX= true;
       b6=0;
        
   }
   
          winner();
         
    }//GEN-LAST:event_Butt6ActionPerformed

    private void Butt7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Butt7ActionPerformed
      if(playerX && Butt7.getText().equals("")){
       Butt7.setText("X");
       playerX = false;
       b7=2;
        
   }
    if(Butt7.getText().equals("X")){
       Butt7.setText("X");
   }
    if (Butt7.getText().equals("O")){
         Butt7.setText("O");
    }
  if(!playerX && Butt7.getText().equals("")){
       Butt7.setText("O");
       playerX= true;
       b7=0;
        
   }
   
          winner();
         
    }//GEN-LAST:event_Butt7ActionPerformed

    private void Butt8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Butt8ActionPerformed
       if(playerX && Butt8.getText().equals("")){
       Butt8.setText("X");
       playerX = false;
       b8=2;
        
   }
    if(Butt8.getText().equals("X")){
       Butt8.setText("X");
   }
    if (Butt8.getText().equals("O")){
         Butt8.setText("O");
    }
  if(!playerX && Butt8.getText().equals("")){
       Butt8.setText("O");
       playerX= true;
       b8=0;
        
   }
   
          winner();
         
    }//GEN-LAST:event_Butt8ActionPerformed

    private void Butt9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Butt9ActionPerformed
       if(playerX && Butt9.getText().equals("")){
       Butt9.setText("X");
       playerX = false;
       b9=2;
        
   }
    if(Butt9.getText().equals("X")){
       Butt9.setText("X");
   }
    if (Butt9.getText().equals("O")){
         Butt9.setText("O");
    }
  if(!playerX && Butt9.getText().equals("")){
       Butt9.setText("O");
       playerX= true;
       b9=0;
        
   }
   
          winner();
         
         
           
    }//GEN-LAST:event_Butt9ActionPerformed

    private void exitButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitButtActionPerformed

    private void Butt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Butt1ActionPerformed
       
   if(playerX && Butt1.getText().equals("")){
       Butt1.setText("X");
       playerX = false;
       b1=2;
        
   }
    if(Butt1.getText().equals("X")){
       Butt1.setText("X");
   }
    if (Butt1.getText().equals("O")){
         Butt1.setText("O");
    }
  if(!playerX && Butt1.getText().equals("")){
       Butt1.setText("O");
       playerX= true;
       b1=0;
        
   }
   
          winner();
         
    }//GEN-LAST:event_Butt1ActionPerformed

    private void Butt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Butt2ActionPerformed
       if(playerX && Butt2.getText().equals("")){
       Butt2.setText("X");
       playerX = false;
       b2=2;
        
   }
    if(Butt2.getText().equals("X")){
       Butt2.setText("X");
   }
    if (Butt2.getText().equals("O")){
         Butt2.setText("O");
    }
  if(!playerX && Butt2.getText().equals("")){
       Butt2.setText("O");
       playerX= true;
       b2=0;
        
   }
   
          winner();
         
    }//GEN-LAST:event_Butt2ActionPerformed

    private void Butt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Butt3ActionPerformed
      
        
      if(playerX && Butt3.getText().equals("")){
       Butt3.setText("X");
       playerX = false;
       b3=2;
        
   }
    if(Butt3.getText().equals("X")){
       Butt3.setText("X");
   }
    if (Butt3.getText().equals("O")){
         Butt3.setText("O");
    }
  if(!playerX && Butt3.getText().equals("")){
       Butt3.setText("O");
       playerX= true;
       b3=0;
        
   }
   
          winner();
         
    }//GEN-LAST:event_Butt3ActionPerformed

    public void winner(){
        if(playerX){
            jPanel8.setBackground(new Color(0,255,0));
            jPanel10.setBackground(Color.WHITE);
        }
        if(!playerX){
            jPanel10.setBackground(new Color(0,255,0));
            jPanel8.setBackground( Color.WHITE);
            
        }
        //X possible wins
        //horizontal posibilities (X)
       if(b1==2 && b2==2 && b3 ==2){
           xScore++;
           Xcount.setText(String.valueOf(xScore));
         b1 =1;
         b2 =1;
         b3 =1;
         b4 =1; 
         b5 =1;
         b6 =1;
         b7 =1;
         b8 =1;
         b9 =1;
         
       
        }
       else if(b4 ==2 && b5==2 && b6==2){
           xScore++;
           Xcount.setText(String.valueOf(xScore));
         b1 =1;
         b2 =1;
         b3 =1;
         b4 =1; 
         b5 =1;
         b6 =1;
         b7 =1;
         b8 =1;
         b9 =1;
         
       }
       else if(b7==2 && b8==2 && b9==2){
           xScore++;
           Xcount.setText(String.valueOf(xScore));
         b1 =1;
         b2 =1;
         b3 =1;
         b4 =1; 
         b5 =1;
         b6 =1;
         b7 =1;
         b8 =1;
         b9 =1;
       
       }
       //verticle possible wins (X)
       else if(b1==2 && b4 ==2 && b7==2){
           xScore++;
           Xcount.setText(String.valueOf(xScore));
         b1 =1;
         b2 =1;
         b3 =1;
         b4 =1; 
         b5 =1;
         b6 =1;
         b7 =1;
         b8 =1;
         b9 =1;
         
       }
       else if(b2==2 && b5==2 && b8==2){
           xScore++;
           Xcount.setText(String.valueOf(xScore));
            b1 =1;
         b2 =1;
         b3 =1;
         b4 =1; 
         b5 =1;
         b6 =1;
         b7 =1;
         b8 =1;
         b9 =1;
        
       }
       else if(b3==2 && b6==2 && b9==2){
           xScore++;
           Xcount.setText(String.valueOf(xScore));
            b1 =1;
         b2 =1;
         b3 =1;
         b4 =1; 
         b5 =1;
         b6 =1;
         b7 =1;
         b8 =1;
         b9 =1;
        
       }
       //diagnol possibilities (X)
       else if(b1==2 && b5 ==2 && b9==2){
           xScore++;
           Xcount.setText(String.valueOf(xScore));
            b1 =1;
         b2 =1;
         b3 =1;
         b4 =1; 
         b5 =1;
         b6 =1;
         b7 =1;
         b8 =1;
         b9 =1;
       
       }
       else if(b3==2 && b5==2 && b7==2){
           xScore++;
           Xcount.setText(String.valueOf(xScore));
            b1 =1;
         b2 =1;
         b3 =1;
         b4 =1; 
         b5 =1;
         b6 =1;
         b7 =1;
         b8 =1;
         b9 =1;
         
       }
       //O possible wins
       
       else if(b1==0 && b2==0 && b3 ==0){
           oScore++;
           Ocount.setText(String.valueOf(oScore));
        b1 =1;
         b2 =1;
         b3 =1;
         b4 =1; 
         b5 =1;
         b6 =1;
         b7 =1;
         b8 =1;
         b9 =1;
         
        }
       else if(b4 ==0 && b5==0 && b6==0){
           oScore++;
           Ocount.setText(String.valueOf(oScore));
            b1 =1;
         b2 =1;
         b3 =1;
         b4 =1; 
         b5 =1;
         b6 =1;
         b7 =1;
         b8 =1;
         b9 =1;

       }
       else if(b7==0 && b8==0 && b9==0){
           oScore++;
           Ocount.setText(String.valueOf(oScore));
            b1 =1;
         b2 =1;
         b3 =1;
         b4 =1; 
         b5 =1;
         b6 =1;
         b7 =1;
         b8 =1;
         b9 =1;
      
       }
       //verticle possible wins (O)
       else if(b1==0 && b4 ==0 && b7==0){
           oScore++;
           Ocount.setText(String.valueOf(oScore));
            b1 =1;
         b2 =1;
         b3 =1;
         b4 =1; 
         b5 =1;
         b6 =1;
         b7 =1;
         b8 =1;
         b9 =1;
        
       }
       else if(b2==0 && b5==0 && b8==0){
            oScore++;
           Ocount.setText(String.valueOf(oScore));
            b1 =1;
         b2 =1;
         b3 =1;
         b4 =1; 
         b5 =1;
         b6 =1;
         b7 =1;
         b8 =1;
         b9 =1;
      
       }
       else if(b3==0 && b6==0 && b9==0){
            oScore++;
           Ocount.setText(String.valueOf(oScore));
            b1 =1;
         b2 =1;
         b3 =1;
         b4 =1; 
         b5 =1;
         b6 =1;
         b7 =1;
         b8 =1;
         b9 =1;
     
       }
       //diagnol possibilities (O)
       else if(b1==0 && b5 ==0 && b9==0){
            oScore++;
           Ocount.setText(String.valueOf(oScore));
            b1 =1;
         b2 =1;
         b3 =1;
         b4 =1; 
         b5 =1;
         b6 =1;
         b7 =1;
         b8 =1;
         b9 =1;
      
       }
       else if(b3==0 && b5==0 && b7==0){
            oScore++;
           Ocount.setText(String.valueOf(oScore));
            b1 =1;
         b2 =1;
         b3 =1;
         b4 =1; 
         b5 =1;
         b6 =1;
         b7 =1;
         b8 =1;
         b9 =1;
      
       }
       else if(b1 !=1 && b2 !=1 && b3 !=1 && b4 !=1 && b5 !=1 && b6 !=1 && b7 !=1 && b8 !=1 && b9 !=1){
           JOptionPane.showMessageDialog(frame,"It's a tie","TicTacToe",JOptionPane.INFORMATION_MESSAGE);
         b1 =1;
         b2 =1;
         b3 =1;
         b4 =1; 
         b5 =1;
         b6 =1;
         b7 =1;
         b8 =1;
         b9 =1;
        
     
       }
       
       
      
    }
     
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
            java.util.logging.Logger.getLogger(TicTacToeBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToeBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToeBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToeBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToeBoard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Butt1;
    private javax.swing.JButton Butt2;
    private javax.swing.JButton Butt3;
    private javax.swing.JButton Butt4;
    private javax.swing.JButton Butt5;
    private javax.swing.JButton Butt6;
    private javax.swing.JButton Butt7;
    private javax.swing.JButton Butt8;
    private javax.swing.JButton Butt9;
    private javax.swing.JLabel Ocount;
    private javax.swing.JLabel Xcount;
    private javax.swing.JButton exitButt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JButton resetButt;
    // End of variables declaration//GEN-END:variables
}
