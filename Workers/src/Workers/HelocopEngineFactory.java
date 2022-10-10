package Workers;

import java.awt.*;


public class HelocopEngineFactory extends javax.swing.JFrame {
    
    /** Creates new form HelocopEngineFactory */
    public HelocopEngineFactory() {
        initComponents();
    }
    
    int i=0,j=0;
    
    
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        W1 = new javax.swing.JLabel();
        W2 = new javax.swing.JLabel();
        W3 = new javax.swing.JLabel();
        Basic = new javax.swing.JLabel();
        Medium = new javax.swing.JLabel();
        High = new javax.swing.JLabel();
        Param = new javax.swing.JLabel();
        W1Basic = new javax.swing.JRadioButton();
        W1Medium = new javax.swing.JRadioButton();
        W1High = new javax.swing.JRadioButton();
        W2Basic = new javax.swing.JRadioButton();
        W2Medium = new javax.swing.JRadioButton();
        W2High = new javax.swing.JRadioButton();
        W3Medium = new javax.swing.JRadioButton();
        W3Basic = new javax.swing.JRadioButton();
        W3High = new javax.swing.JRadioButton();
        W2Param = new javax.swing.JTextArea();
        W3Param = new javax.swing.JTextArea();
        W1Param = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        mrizka = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        W1.setBackground(java.awt.Color.red);
        W1.setText("Worker 1");
        W1.setOpaque(true);

        W2.setBackground(new java.awt.Color(0, 255, 0));
        W2.setText("Worker 2");
        W2.setOpaque(true);

        W3.setBackground(java.awt.Color.yellow);
        W3.setFont(new java.awt.Font("Arial", 1, 10));
        W3.setForeground(new java.awt.Color(0, 0, 255));
        W3.setText("Worker 3");
        W3.setOpaque(true);

        Basic.setText("Basic");

        Medium.setText("Medium");

        High.setText("High");

        Param.setText("Parametrs");

        buttonGroup1.add(W1Basic);
        W1Basic.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        W1Basic.setMargin(new java.awt.Insets(0, 0, 0, 0));
        W1Basic.setMultiClickThreshhold(3L);

        buttonGroup1.add(W1Medium);
        W1Medium.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        W1Medium.setMargin(new java.awt.Insets(0, 0, 0, 0));

        buttonGroup1.add(W1High);
        W1High.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        W1High.setMargin(new java.awt.Insets(0, 0, 0, 0));

        buttonGroup2.add(W2Basic);
        W2Basic.setSelected(true);
        W2Basic.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        W2Basic.setMargin(new java.awt.Insets(0, 0, 0, 0));

        buttonGroup2.add(W2Medium);
        W2Medium.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        W2Medium.setMargin(new java.awt.Insets(0, 0, 0, 0));

        buttonGroup2.add(W2High);
        W2High.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        W2High.setMargin(new java.awt.Insets(0, 0, 0, 0));

        buttonGroup3.add(W3Medium);
        W3Medium.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        W3Medium.setMargin(new java.awt.Insets(0, 0, 0, 0));

        buttonGroup3.add(W3Basic);
        W3Basic.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        W3Basic.setMargin(new java.awt.Insets(0, 0, 0, 0));
        W3Basic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                W3BasicActionPerformed(evt);
            }
        });

        buttonGroup3.add(W3High);
        W3High.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        W3High.setMargin(new java.awt.Insets(0, 0, 0, 0));

        W2Param.setColumns(20);
        W2Param.setRows(5);

        W3Param.setColumns(20);
        W3Param.setRows(5);

        W1Param.setColumns(20);
        W1Param.setRows(5);

        mrizka.setBackground(new java.awt.Color(204, 204, 204));
        javax.swing.GroupLayout mrizkaLayout = new javax.swing.GroupLayout(mrizka);
        mrizka.setLayout(mrizkaLayout);
        mrizkaLayout.setHorizontalGroup(
            mrizkaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 998, Short.MAX_VALUE)
        );
        mrizkaLayout.setVerticalGroup(
            mrizkaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 498, Short.MAX_VALUE)
        );
        jScrollPane1.setViewportView(mrizka);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Basic)
                            .addComponent(High)
                            .addComponent(Param)
                            .addComponent(Medium))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(W1Param, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(W1)
                            .addComponent(W1Medium)
                            .addComponent(W1High)
                            .addComponent(W1Basic))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(W2)
                            .addComponent(W2Basic)
                            .addComponent(W2Medium)
                            .addComponent(W2High)
                            .addComponent(W2Param, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(W3)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(W3High)
                                    .addComponent(W3Param, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(74, 74, 74)
                                .addComponent(jButton1))
                            .addComponent(W3Basic)
                            .addComponent(W3Medium))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(W1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Basic)
                            .addComponent(W1Basic))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(W1Medium)
                            .addComponent(Medium))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(High)
                            .addComponent(W1High)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(W2)
                            .addComponent(W3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(W3Basic)
                            .addComponent(W2Basic))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(W2Medium)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(W2High))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(W3Medium)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1)
                                    .addComponent(W3High))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Param)
                    .addComponent(W1Param, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(W3Param, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(W2Param, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(104, Short.MAX_VALUE))
        );
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//-----------inicializace mrizky
        mrizka.setLayout(new GridLayout(globalVar.MAXY,globalVar.MAXX,1,1));     
        for (i=0;i<globalVar.MAXY;i++){
            for (j=0;j<globalVar.MAXX;j++){
                labelMrizky[i][j] = new javax.swing.JLabel();
                labelMrizky[i][j].setText(" ");
                labelMrizky[i][j].setBackground(Color.white);
                labelMrizky[i][j].setFont(new Font("Arial", 1, 6));
                labelMrizky[i][j].setOpaque(true);
                mrizka.add(labelMrizky[i][j]);
            }
        }
        jScrollPane1.setViewportView(mrizka);
        mrizka.setOpaque(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void W3BasicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_W3BasicActionPerformed
// TODO add your handling code here:
    }//GEN-LAST:event_W3BasicActionPerformed
        
    
    private javax.swing.JLabel labelMrizky[][] = new javax.swing.JLabel[globalVar.MAXY][globalVar.MAXX];
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Basic;
    private javax.swing.JLabel High;
    private javax.swing.JLabel Medium;
    private javax.swing.JLabel Param;
    private javax.swing.JLabel W1;
    private javax.swing.JRadioButton W1Basic;
    private javax.swing.JRadioButton W1High;
    private javax.swing.JRadioButton W1Medium;
    private javax.swing.JTextArea W1Param;
    private javax.swing.JLabel W2;
    private javax.swing.JRadioButton W2Basic;
    private javax.swing.JRadioButton W2High;
    private javax.swing.JRadioButton W2Medium;
    private javax.swing.JTextArea W2Param;
    private javax.swing.JLabel W3;
    private javax.swing.JRadioButton W3Basic;
    private javax.swing.JRadioButton W3High;
    private javax.swing.JRadioButton W3Medium;
    private javax.swing.JTextArea W3Param;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mrizka;
    // End of variables declaration//GEN-END:variables
    
}
