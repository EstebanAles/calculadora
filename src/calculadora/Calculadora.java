package calculadora;

import java.awt.Color;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.swing.ImageIcon;


public class Calculadora extends javax.swing.JFrame {
    
    ScriptEngineManager sem = new ScriptEngineManager();
    ScriptEngine se = sem.getEngineByName("JavaScript");
            
    public Calculadora() {
        initComponents();
        setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton25 = new javax.swing.JButton();
        jScrollBar1 = new javax.swing.JScrollBar();
        jPanel1 = new javax.swing.JPanel();
        txtOperacion = new javax.swing.JLabel();
        txtResultado = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btn_exp = new javax.swing.JButton();
        btn_C = new javax.swing.JButton();
        btn_porcentaje = new javax.swing.JButton();
        btn_division = new javax.swing.JButton();
        bnt_7 = new javax.swing.JButton();
        btn_8 = new javax.swing.JButton();
        btn_9 = new javax.swing.JButton();
        btn_multiplicacion = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        btn_5 = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        btn_suma = new javax.swing.JButton();
        btn_resta = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();
        btn_1 = new javax.swing.JButton();
        btn_0 = new javax.swing.JButton();
        btn_punto = new javax.swing.JButton();
        btn_igual = new javax.swing.JButton();

        jButton25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        jButton25.setText("jButton1");
        jButton25.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        jButton25.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_presionar.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(220, 220, 222));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtOperacion.setBackground(new java.awt.Color(46, 237, 96));
        txtOperacion.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 18)); // NOI18N
        txtOperacion.setForeground(new java.awt.Color(46, 237, 96));
        txtOperacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(txtOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 340, 40));

        txtResultado.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 1, 36)); // NOI18N
        txtResultado.setForeground(new java.awt.Color(72, 77, 99));
        txtResultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(txtResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 340, 60));

        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 60, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 130));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_exp.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 1, 18)); // NOI18N
        btn_exp.setForeground(new java.awt.Color(38, 162, 134));
        btn_exp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_exp.setText("<-");
        btn_exp.setFocusPainted(false);
        btn_exp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_exp.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_exp.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_presionar.png"))); // NOI18N
        btn_exp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_expActionPerformed(evt);
            }
        });
        jPanel2.add(btn_exp, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 50, 50));

        btn_C.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 1, 18)); // NOI18N
        btn_C.setForeground(new java.awt.Color(252, 171, 105));
        btn_C.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_C.setText("C");
        btn_C.setFocusPainted(false);
        btn_C.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_C.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_C.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_presionar.png"))); // NOI18N
        btn_C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CActionPerformed(evt);
            }
        });
        jPanel2.add(btn_C, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 50, 50));

        btn_porcentaje.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 1, 18)); // NOI18N
        btn_porcentaje.setForeground(new java.awt.Color(38, 162, 134));
        btn_porcentaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_porcentaje.setText("%");
        btn_porcentaje.setFocusPainted(false);
        btn_porcentaje.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_porcentaje.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_porcentaje.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_presionar.png"))); // NOI18N
        btn_porcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_porcentajeActionPerformed(evt);
            }
        });
        jPanel2.add(btn_porcentaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 50, 50));

        btn_division.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 1, 18)); // NOI18N
        btn_division.setForeground(new java.awt.Color(38, 162, 134));
        btn_division.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_division.setText("/");
        btn_division.setFocusPainted(false);
        btn_division.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_division.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_division.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_presionar.png"))); // NOI18N
        btn_division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_divisionActionPerformed(evt);
            }
        });
        jPanel2.add(btn_division, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 50, 50));

        bnt_7.setBackground(new java.awt.Color(0, 0, 0));
        bnt_7.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 1, 24)); // NOI18N
        bnt_7.setForeground(new java.awt.Color(7, 6, 40));
        bnt_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        bnt_7.setText("7");
        bnt_7.setFocusPainted(false);
        bnt_7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bnt_7.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        bnt_7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_presionar.png"))); // NOI18N
        bnt_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt_7ActionPerformed(evt);
            }
        });
        jPanel2.add(bnt_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 50, 50));

        btn_8.setBackground(new java.awt.Color(0, 0, 0));
        btn_8.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 1, 24)); // NOI18N
        btn_8.setForeground(new java.awt.Color(7, 6, 40));
        btn_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_8.setText("8");
        btn_8.setFocusPainted(false);
        btn_8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_8.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_presionar.png"))); // NOI18N
        btn_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_8ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 50, 50));

        btn_9.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 1, 24)); // NOI18N
        btn_9.setForeground(new java.awt.Color(7, 6, 40));
        btn_9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_9.setText("9");
        btn_9.setFocusPainted(false);
        btn_9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_9.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_presionar.png"))); // NOI18N
        btn_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_9ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 50, 50));

        btn_multiplicacion.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 1, 18)); // NOI18N
        btn_multiplicacion.setForeground(new java.awt.Color(38, 162, 134));
        btn_multiplicacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_multiplicacion.setText("x");
        btn_multiplicacion.setFocusPainted(false);
        btn_multiplicacion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_multiplicacion.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_multiplicacion.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_presionar.png"))); // NOI18N
        btn_multiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_multiplicacionActionPerformed(evt);
            }
        });
        jPanel2.add(btn_multiplicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 50, 50));

        btn_4.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 1, 24)); // NOI18N
        btn_4.setForeground(new java.awt.Color(7, 6, 40));
        btn_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_4.setText("4");
        btn_4.setFocusPainted(false);
        btn_4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_presionar.png"))); // NOI18N
        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 50, 50));

        btn_5.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 1, 24)); // NOI18N
        btn_5.setForeground(new java.awt.Color(7, 6, 40));
        btn_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_5.setText("5");
        btn_5.setFocusPainted(false);
        btn_5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_presionar.png"))); // NOI18N
        btn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_5ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 50, 50));

        btn_6.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 1, 24)); // NOI18N
        btn_6.setForeground(new java.awt.Color(7, 6, 40));
        btn_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_6.setText("6");
        btn_6.setFocusPainted(false);
        btn_6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_presionar.png"))); // NOI18N
        btn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_6ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 50, 50));

        btn_suma.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 1, 18)); // NOI18N
        btn_suma.setForeground(new java.awt.Color(38, 162, 134));
        btn_suma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_suma.setText("+");
        btn_suma.setFocusPainted(false);
        btn_suma.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_suma.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_suma.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_presionar.png"))); // NOI18N
        btn_suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sumaActionPerformed(evt);
            }
        });
        jPanel2.add(btn_suma, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 50, 50));

        btn_resta.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 1, 18)); // NOI18N
        btn_resta.setForeground(new java.awt.Color(38, 162, 134));
        btn_resta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_resta.setText("-");
        btn_resta.setFocusPainted(false);
        btn_resta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_resta.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_resta.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_presionar.png"))); // NOI18N
        btn_resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_restaActionPerformed(evt);
            }
        });
        jPanel2.add(btn_resta, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 50, 50));

        btn_3.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 1, 24)); // NOI18N
        btn_3.setForeground(new java.awt.Color(7, 6, 40));
        btn_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_3.setText("3");
        btn_3.setFocusPainted(false);
        btn_3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_presionar.png"))); // NOI18N
        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 50, 50));

        btn_2.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 1, 24)); // NOI18N
        btn_2.setForeground(new java.awt.Color(7, 6, 40));
        btn_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_2.setText("2");
        btn_2.setFocusPainted(false);
        btn_2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_presionar.png"))); // NOI18N
        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 50, 50));

        btn_1.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 1, 24)); // NOI18N
        btn_1.setForeground(new java.awt.Color(7, 6, 40));
        btn_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_1.setText("1");
        btn_1.setFocusPainted(false);
        btn_1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_presionar.png"))); // NOI18N
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 50, 50));

        btn_0.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 1, 24)); // NOI18N
        btn_0.setForeground(new java.awt.Color(7, 6, 40));
        btn_0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_0.setText("0");
        btn_0.setFocusPainted(false);
        btn_0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_0.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_0.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_presionar.png"))); // NOI18N
        btn_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_0ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 50, 50));

        btn_punto.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 1, 18)); // NOI18N
        btn_punto.setForeground(new java.awt.Color(7, 6, 40));
        btn_punto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_punto.setText(".");
        btn_punto.setFocusPainted(false);
        btn_punto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_punto.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_punto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_presionar.png"))); // NOI18N
        btn_punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_puntoActionPerformed(evt);
            }
        });
        jPanel2.add(btn_punto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 50, 50));

        btn_igual.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 1, 18)); // NOI18N
        btn_igual.setForeground(new java.awt.Color(38, 162, 134));
        btn_igual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_igual.setText("=");
        btn_igual.setFocusPainted(false);
        btn_igual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_igual.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_igual.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_presionar.png"))); // NOI18N
        btn_igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_igualActionPerformed(evt);
            }
        });
        jPanel2.add(btn_igual, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 50, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 340, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CActionPerformed
        txtOperacion.setText("");
        txtResultado.setText("");
    }//GEN-LAST:event_btn_CActionPerformed

    private void bnt_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt_7ActionPerformed
        addNumber("7");
        btn_igual.doClick();
    }//GEN-LAST:event_bnt_7ActionPerformed

    private void btn_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_8ActionPerformed
        addNumber("8");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_8ActionPerformed

    private void btn_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_9ActionPerformed
        addNumber("9");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_9ActionPerformed

    private void btn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4ActionPerformed
        addNumber("4");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_4ActionPerformed

    private void btn_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_5ActionPerformed
        addNumber("5");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_5ActionPerformed

    private void btn_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_6ActionPerformed
        addNumber("6");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_6ActionPerformed

    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed
       addNumber("1");
       btn_igual.doClick();
    }//GEN-LAST:event_btn_1ActionPerformed

    private void btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2ActionPerformed
       addNumber("2");
       btn_igual.doClick();
    }//GEN-LAST:event_btn_2ActionPerformed

    private void btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3ActionPerformed
       addNumber("3");
       btn_igual.doClick();
    }//GEN-LAST:event_btn_3ActionPerformed

    private void btn_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_0ActionPerformed
        addNumber("0");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_0ActionPerformed

    private void btn_expActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_expActionPerformed
        String texto = txtOperacion.getText().substring(0,txtOperacion.getText().length()-1);
        txtOperacion.setText(texto);
        btn_igual.doClick();
    }//GEN-LAST:event_btn_expActionPerformed

    private void btn_porcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_porcentajeActionPerformed
        addNumber("%");
        
    }//GEN-LAST:event_btn_porcentajeActionPerformed

    private void btn_divisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_divisionActionPerformed
       addNumber("/");
      
    }//GEN-LAST:event_btn_divisionActionPerformed

    private void btn_multiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_multiplicacionActionPerformed
        addNumber("*");
        
    }//GEN-LAST:event_btn_multiplicacionActionPerformed

    private void btn_sumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sumaActionPerformed
        addNumber("+");
        
    }//GEN-LAST:event_btn_sumaActionPerformed

    private void btn_restaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_restaActionPerformed
        addNumber("-");
        
    }//GEN-LAST:event_btn_restaActionPerformed

    private void btn_igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_igualActionPerformed
         try {
           String resultado = se.eval(txtOperacion.getText()).toString();
           txtResultado.setText(resultado);
       } catch (Exception e){
            System.out.println("error" + e.getMessage());
        }     
    }//GEN-LAST:event_btn_igualActionPerformed

    private void btn_puntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_puntoActionPerformed
       addNumber(".");
    }//GEN-LAST:event_btn_puntoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jPanel1.setBackground(Color.decode("#000431"));
        jPanel2.setBackground(Color.decode("#000431"));
        
        btn_1.setIcon(new ImageIcon(getClass().getResource("/imagenes/btn_3.png")));
        btn_1.setPressedIcon(new ImageIcon(getClass().getResource("/imagenes/btn_3.png")));
        btn_1.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes/btn_3 darck.png")));
        btn_1.setForeground(Color.decode("#b4bed9"));
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }
    public void addNumber(String digito){
       txtOperacion.setText(txtOperacion.getText()+digito);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnt_7;
    private javax.swing.JButton btn_0;
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_5;
    private javax.swing.JButton btn_6;
    private javax.swing.JButton btn_8;
    private javax.swing.JButton btn_9;
    private javax.swing.JButton btn_C;
    private javax.swing.JButton btn_division;
    private javax.swing.JButton btn_exp;
    private javax.swing.JButton btn_igual;
    private javax.swing.JButton btn_multiplicacion;
    private javax.swing.JButton btn_porcentaje;
    private javax.swing.JButton btn_punto;
    private javax.swing.JButton btn_resta;
    private javax.swing.JButton btn_suma;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton25;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JLabel txtOperacion;
    private javax.swing.JLabel txtResultado;
    // End of variables declaration//GEN-END:variables
}
