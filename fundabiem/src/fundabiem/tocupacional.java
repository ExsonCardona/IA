/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundabiem;

import Cronometro.IncrementarO;
import static fundabiem.Menu.jDesktopPane1;
import static fundabiem.niveles.txf_cont1;
import static fundabiem.niveles.txf_cont2;
import static fundabiem.niveles.txf_cont3;
import static fundabiem.niveles.txt1;
import static fundabiem.niveles.txt3;
import static fundabiem.niveles.txt4;
import static fundabiem.niveles.txt6;
import static fundabiem.niveles.txt7;
import java.awt.Color;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author exson
 */
public class tocupacional extends javax.swing.JInternalFrame implements Runnable {
  private int seg = 0;
    private int min = 0;
    private int hora = 0;
    private boolean continuar = true;
    private IncrementarO i;
    /**
     * Creates new form Menu2
     */
    public tocupacional() {
        initComponents();
       
        this.setTitle("Cronómetro");
        txf_cont1.setText(String.valueOf(hora));
        txf_cont2.setText(String.valueOf(min));
        txf_cont3.setText(String.valueOf(seg));
        //btn_comenzar.setEnabled(true);
        btn_parar.setEnabled(false);
        //btn_reanudar.setEnabled(false);
    }
 public static void ejecutar(){
     Runtime app = Runtime.getRuntime();
     try{
         app.exec("C:/Juegos/terapia.exe");
     }catch (Exception e){
         
     }
         
 }
  public static void ejecutar1(){
     Runtime app = Runtime.getRuntime();
     try{
         app.exec("C:/Juegos/terapia.exe");
     }catch (Exception e){
         
     }
         
 }
   public static void ejecutar2(){
     Runtime app = Runtime.getRuntime();
     try{
         app.exec("C:/Juegos/terapia.exe");
     }catch (Exception e){
         
     }
         
 }
    public static void ejecutar3(){
     Runtime app = Runtime.getRuntime();
     try{
         app.exec("C:/Juegos/terapia.exe");
     }catch (Exception e){
         
     }
         
 }
     public static void ejecutar4(){
     Runtime app = Runtime.getRuntime();
     try{
         app.exec("C:/Juegos/terapia.exe");
     }catch (Exception e){
         
     }
         
 } public static void ejecutar5(){
     Runtime app = Runtime.getRuntime();
     try{
         app.exec("C:/Juegos/terapia.exe");
     }catch (Exception e){
         
     }
         
 }
  public static void ejecutar6(){
     Runtime app = Runtime.getRuntime();
     try{
         app.exec("C:/Juegos/terapia.exe");
     }catch (Exception e){
         
     }
         
 }
   public static void ejecutar7(){
     Runtime app = Runtime.getRuntime();
     try{
         app.exec("C:/Juegos/terapia.exe");
     }catch (Exception e){
         
     }
         
 }
      public static void ejecutar8(){
     Runtime app = Runtime.getRuntime();
     try{
         app.exec("C:/Juegos/terapia.exe");
     }catch (Exception e){
         
     }
         
 }
         public static void ejecutar9(){
     Runtime app = Runtime.getRuntime();
     try{
         app.exec("C:/Juegos/terapia.exe");
     }catch (Exception e){
         
     }
         
 }
     
 
 void jalar(){
     avances fac= new avances();
        jDesktopPane1.add(fac);
        fac.show();
 }
 
 void reloj (){
       uno.setEnabled(false);
        btn_parar.setEnabled(true);
       // btn_reanudar.setEnabled(false);
        resetSeg();
        resetMin();
        resetHora();
        seguir();
        i=null;
        i = new IncrementarO(this);
        i.start();
 }
 void datos (){
       String nom="",ape="",tip="",fecha="",nivel="",di="",cod="",niv="",horas="",minutos="",segundos="";
        //int fila = tbclientes.getSelectedRow();

     
               nom =  (String)txt1.getText();
                ape =  (String)txt3.getText();
                tip=  (String)txt4.getText();
                cod = (String)txt6.getText();
                niv = (String)txt7.getText();
                horas = (String)txf_cont1.getText();
                minutos =   (String)txf_cont2.getText();
                segundos =   (String)txf_cont3.getText();
                
                
                avances.cod.setDisabledTextColor(Color.blue);
                avances.cod.setText(cod);
                avances.tipo.setDisabledTextColor(Color.blue);
                avances.tipo.setText(tip);
                avances.nom.setDisabledTextColor(Color.blue);
                avances.nom.setText(nom);
                avances.ape.setDisabledTextColor(Color.blue);
                avances.ape.setText(ape);
                avances.h.setDisabledTextColor(Color.blue);
                avances.h.setText(horas);
                avances.min.setDisabledTextColor(Color.blue);
                avances.min.setText(minutos);
                avances.s.setDisabledTextColor(Color.blue);
                avances.s.setText(segundos);
                avances.nivel.setDisabledTextColor(Color.blue);
                avances.nivel.setText(niv);
 }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        uno = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        panel = new javax.swing.JPanel();
        txf_cont1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txf_cont2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txf_cont3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btn_parar = new javax.swing.JButton();
        btnclientes = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        txt7 = new javax.swing.JTextField();
        txt6 = new javax.swing.JTextField();
        txt5 = new javax.swing.JTextField();
        txt3 = new javax.swing.JTextField();
        txt4 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnclientes1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Terapia Ocupacional");

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Number-7-icon_34776.png"))); // NOI18N

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Number-8-icon_34775.png"))); // NOI18N

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Number-2-icon_34781.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        uno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Number-1-icon_34782.png"))); // NOI18N
        uno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unoActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Number-3-icon_34780.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Number-5-icon_34778.png"))); // NOI18N

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Number-6-icon_34777.png"))); // NOI18N

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Number-4-icon_34779.png"))); // NOI18N

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Number-9-icon_34774.png"))); // NOI18N

        panel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Menu"));
        panel.setForeground(new java.awt.Color(0, 0, 255));
        panel.setToolTipText("Menu");
        panel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txf_cont1.setEditable(false);
        txf_cont1.setBackground(new java.awt.Color(204, 255, 255));
        txf_cont1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txf_cont1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txf_cont1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txf_cont1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setText(":");

        txf_cont2.setEditable(false);
        txf_cont2.setBackground(new java.awt.Color(204, 255, 255));
        txf_cont2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txf_cont2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txf_cont2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txf_cont2ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel5.setText(":");

        txf_cont3.setEditable(false);
        txf_cont3.setBackground(new java.awt.Color(204, 255, 255));
        txf_cont3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txf_cont3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txf_cont3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txf_cont3ActionPerformed(evt);
            }
        });

        jLabel1.setText("Cronometro");

        btn_parar.setText("STOP");
        btn_parar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pararActionPerformed(evt);
            }
        });

        btnclientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Buscar.png"))); // NOI18N
        btnclientes.setText("Buscar Paciente");
        btnclientes.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar2.png"))); // NOI18N
        btnclientes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnclientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclientesActionPerformed(evt);
            }
        });

        jLabel2.setText("Buscar Paciente");

        txt1.setForeground(new java.awt.Color(0, 0, 255));
        txt1.setEnabled(false);

        txt7.setForeground(new java.awt.Color(0, 0, 255));
        txt7.setEnabled(false);

        txt6.setForeground(new java.awt.Color(0, 0, 255));
        txt6.setEnabled(false);

        txt5.setForeground(new java.awt.Color(0, 0, 255));
        txt5.setEnabled(false);

        txt3.setForeground(new java.awt.Color(0, 0, 255));
        txt3.setEnabled(false);

        txt4.setForeground(new java.awt.Color(0, 0, 255));
        txt4.setEnabled(false);

        jLabel3.setText("Datos");

        jLabel6.setText("Nombre:");

        jLabel7.setText("Apellido:");

        jLabel8.setText("Fecha Sesión:");

        jLabel9.setText("Tipo Terapia");

        jLabel10.setText("Nivel:");

        jLabel11.setText("Codigo:");

        btnclientes1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Guardar (1).png"))); // NOI18N
        btnclientes1.setText("Guardar Avances");
        btnclientes1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Guardar (2).png"))); // NOI18N
        btnclientes1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnclientes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclientes1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(txf_cont1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)
                                .addComponent(jLabel4)
                                .addGap(4, 4, 4)
                                .addComponent(txf_cont2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)
                                .addComponent(jLabel5)
                                .addGap(4, 4, 4)
                                .addComponent(txf_cont3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(btnclientes, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(jLabel10))
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnclientes1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txt5)
                                        .addComponent(txt7, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txt6, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txt3)
                                        .addComponent(txt1, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txt4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_parar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(0, 267, Short.MAX_VALUE))))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txf_cont1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txf_cont2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txf_cont3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))))
                .addGap(11, 11, 11)
                .addComponent(btn_parar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnclientes, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(13, 13, 13)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(33, 33, 33)
                .addComponent(btnclientes1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(288, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(uno, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(uno, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton10)
                            .addComponent(jButton8)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(335, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnclientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclientesActionPerformed
        // TODO add your handling code here:
        buscar_ocupacional fac= new buscar_ocupacional();
        jDesktopPane1.add(fac);
        fac.show();
    }//GEN-LAST:event_btnclientesActionPerformed

    private void txf_cont1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_cont1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txf_cont1ActionPerformed

    private void txf_cont2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_cont2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txf_cont2ActionPerformed

    private void txf_cont3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_cont3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txf_cont3ActionPerformed

    private void btn_pararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pararActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_pararActionPerformed

    private void btnclientes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclientes1ActionPerformed
        // TODO add your handling code here:
         jalar(); 
        datos();  
    }//GEN-LAST:event_btnclientes1ActionPerformed

    private void unoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unoActionPerformed
        // TODO add your handling code here:
        reloj();
        ejecutar();
        
    }//GEN-LAST:event_unoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         reloj();
        ejecutar1();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
         reloj();
        ejecutar2();
    }//GEN-LAST:event_jButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_parar;
    private javax.swing.JButton btnclientes;
    private javax.swing.JButton btnclientes1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel panel;
    public static javax.swing.JTextField txf_cont1;
    public static javax.swing.JTextField txf_cont2;
    public static javax.swing.JTextField txf_cont3;
    public static javax.swing.JTextField txt1;
    public static javax.swing.JTextField txt3;
    public static javax.swing.JTextField txt4;
    public static javax.swing.JTextField txt5;
    public static javax.swing.JTextField txt6;
    public static javax.swing.JTextField txt7;
    private javax.swing.JButton uno;
    // End of variables declaration//GEN-END:variables
     @Override
    public void run() {
        
    }
    public synchronized int aumentSeg(){
        seg++;
       txf_cont3.setText(String.valueOf(seg));
        return seg;
    }
    public synchronized int aumentMin(){
        min++;
        txf_cont2.setText(String.valueOf(min));
        return min;
    }
    public synchronized int aumentHora(){
        hora++;
        txf_cont1.setText(String.valueOf(hora));
        return hora;
    }
    public void resetSeg(){
        txf_cont3.setText(String.valueOf("0"));
        seg=0;
    }
    public void resetMin(){
        txf_cont2.setText(String.valueOf("0")); 
        min=0;
    }
    public void resetHora(){
        txf_cont1.setText(String.valueOf("0"));       
        hora=0;
    }
    public synchronized int getMin(){
        return min;
    }
    public synchronized int getSeg(){
        return seg;
    }    
    public synchronized int getHora(){
        return hora;
    }   
    public synchronized void seguir(){
        continuar =true;
    }
    public synchronized void parar(){
        continuar =false;
    }
    public synchronized boolean isContinuar() {
        return continuar;
    }   

 }