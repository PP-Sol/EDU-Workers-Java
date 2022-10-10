package Workers;

import java.awt.*;



public class HelocopEngineFactoryII extends javax.swing.JFrame {
    
    int i=0,j=0;
    boolean prekresluje=false;
    boolean poprve = true;
    boolean delnici = false;
    Worker d1;
    Worker d2;
    Worker d3;
    
    public HelocopEngineFactoryII() {
        initComponents();
        
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
         prekresluje = true;
         prekresli();
    }
    
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        parametrs = new javax.swing.JLabel();
        w3 = new javax.swing.JLabel();
        w2 = new javax.swing.JLabel();
        w1 = new javax.swing.JLabel();
        high = new javax.swing.JLabel();
        medium = new javax.swing.JLabel();
        basic = new javax.swing.JLabel();
        w1Basic = new javax.swing.JRadioButton();
        w1High = new javax.swing.JRadioButton();
        w1Medium = new javax.swing.JRadioButton();
        w3High = new javax.swing.JRadioButton();
        w3Medium = new javax.swing.JRadioButton();
        w3Basic = new javax.swing.JRadioButton();
        w2High = new javax.swing.JRadioButton();
        w2Medium = new javax.swing.JRadioButton();
        w2Basic = new javax.swing.JRadioButton();
        w1Param = new javax.swing.JTextArea();
        w2Param = new javax.swing.JTextArea();
        jTextArea3 = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        mrizka = new javax.swing.JPanel();
        stop = new javax.swing.JButton();
        start = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 255, 0));
        parametrs.setText("Parametrs");

        w3.setBackground(new java.awt.Color(0, 255, 0));
        w3.setText("Worker3");
        w3.setOpaque(true);

        w2.setBackground(new java.awt.Color(255, 0, 0));
        w2.setText("Worker2");
        w2.setOpaque(true);

        w1.setBackground(new java.awt.Color(0, 0, 255));
        w1.setText("Worker1");
        w1.setOpaque(true);

        high.setText("High");

        medium.setText("Medium");

        basic.setText("Basic");

        buttonGroup1.add(w1Basic);
        w1Basic.setSelected(true);
        w1Basic.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        w1Basic.setMargin(new java.awt.Insets(0, 0, 0, 0));
        w1Basic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                w1BasicActionPerformed(evt);
            }
        });

        buttonGroup1.add(w1High);
        w1High.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        w1High.setMargin(new java.awt.Insets(0, 0, 0, 0));

        buttonGroup1.add(w1Medium);
        w1Medium.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        w1Medium.setMargin(new java.awt.Insets(0, 0, 0, 0));

        buttonGroup3.add(w3High);
        w3High.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        w3High.setMargin(new java.awt.Insets(0, 0, 0, 0));

        buttonGroup3.add(w3Medium);
        w3Medium.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        w3Medium.setMargin(new java.awt.Insets(0, 0, 0, 0));

        buttonGroup3.add(w3Basic);
        w3Basic.setSelected(true);
        w3Basic.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        w3Basic.setMargin(new java.awt.Insets(0, 0, 0, 0));

        buttonGroup2.add(w2High);
        w2High.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        w2High.setMargin(new java.awt.Insets(0, 0, 0, 0));

        buttonGroup2.add(w2Medium);
        w2Medium.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        w2Medium.setMargin(new java.awt.Insets(0, 0, 0, 0));

        buttonGroup2.add(w2Basic);
        w2Basic.setSelected(true);
        w2Basic.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        w2Basic.setMargin(new java.awt.Insets(0, 0, 0, 0));

        w1Param.setColumns(20);
        w1Param.setRows(5);

        w2Param.setColumns(20);
        w2Param.setRows(5);

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);

        mrizka.setBackground(new java.awt.Color(204, 204, 204));
        mrizka.setPreferredSize(new java.awt.Dimension(940, 490));
        javax.swing.GroupLayout mrizkaLayout = new javax.swing.GroupLayout(mrizka);
        mrizka.setLayout(mrizkaLayout);
        mrizkaLayout.setHorizontalGroup(
            mrizkaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 948, Short.MAX_VALUE)
        );
        mrizkaLayout.setVerticalGroup(
            mrizkaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 498, Short.MAX_VALUE)
        );
        jScrollPane1.setViewportView(mrizka);

        stop.setBackground(new java.awt.Color(255, 0, 0));
        stop.setText("STOP");
        stop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopActionPerformed(evt);
            }
        });

        start.setBackground(new java.awt.Color(0, 255, 0));
        start.setText("START");
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(parametrs)
                            .addComponent(high)
                            .addComponent(basic)
                            .addComponent(medium))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(w1High)
                            .addComponent(w1Medium)
                            .addComponent(w1Basic)
                            .addComponent(w1)
                            .addComponent(w1Param, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(w2)
                            .addComponent(w2Basic)
                            .addComponent(w2Medium)
                            .addComponent(w2High)
                            .addComponent(w2Param, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(w3)
                            .addComponent(w3Basic)
                            .addComponent(w3Medium)
                            .addComponent(w3High)
                            .addComponent(jTextArea3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(stop)
                            .addComponent(start)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 950, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(w1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(basic)
                            .addComponent(w1Basic))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(w1Medium)
                            .addComponent(medium))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(high)
                            .addComponent(w1High))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(parametrs)
                            .addComponent(w1Param, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(w2)
                                    .addComponent(w3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(w2Basic)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(w2Medium)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(w2High))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(w3Basic)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(w3Medium)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(w3High))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(start)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(stop)
                            .addComponent(w2Param, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextArea3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void w1BasicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_w1BasicActionPerformed
// TODO add your handling code here:
    }//GEN-LAST:event_w1BasicActionPerformed

    private void stopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopActionPerformed
        prekresluje = false;
        start.setEnabled(true);
        try
        {
            d1.wait();
            d2.wait();
            d3.wait();
        }
        catch(Exception e)
        {
            System.out.println("Nepodarilo se uspat vlakna");
        }
    }//GEN-LAST:event_stopActionPerformed

    //-------inicializace mrizky s nakladem a spusteni vlakna s prekreslovanim GUI
    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed

        if(poprve)
        {
            start.setEnabled(false);
            prekresluje = true;
            poprve = false;
            delnici = true;
        
            if(w1Basic.isSelected()) d1 = new WorkerBasic(0,0,globalVar.MODRA);
            if(w1Medium.isSelected()) d1 = new WorkerMedium(0,0,globalVar.MODRA);
            if(w1High.isSelected()) d1 = new WorkerHigh(0,0,globalVar.MODRA);
        
            if(w2Basic.isSelected()) d2 = new WorkerBasic(0,globalVar.MAXY-1,globalVar.CERVENA);
            if(w2Medium.isSelected()) d2 = new WorkerMedium(0,globalVar.MAXY-1,globalVar.CERVENA);
            if(w2High.isSelected()) d2 = new WorkerHigh(0,globalVar.MAXY-1,globalVar.CERVENA);
        
            if(w3Basic.isSelected()) d3 = new WorkerBasic(globalVar.MAXX-1,0,globalVar.ZELENA);
            if(w3Medium.isSelected()) d3 = new WorkerMedium(globalVar.MAXX-1,0,globalVar.ZELENA);
            if(w3High.isSelected()) d3 = new WorkerHigh(globalVar.MAXX-1,0,globalVar.ZELENA);
        }
        else
        {
            prekresluje = true;
             try
            {
                d1.notify();
                d2.notify();
                d3.notify();
            }
            catch(Exception e)
            {
                System.out.println("Nepodarilo se probudit vlakna");
            }
        }
        
        prekresli();
    }//GEN-LAST:event_startActionPerformed
    
   //--------- vlakno prekreslujici polohu nakladu a pracovniku je treba dodelat vykreslovani delniku a uspani, nebo casovani
    synchronized public void prekresli()
    {
        Color col;
        if(prekresluje)
        {
            for (i=0;i<globalVar.MAXY;i++)
            {
                for (j=0;j<globalVar.MAXX;j++)
                {
                    labelMrizky[i][j].setBackground(Color.white);
                }
            }
            for (i=0;i<globalVar.SIZE; i++) //prekresleni nakladu v mrizce
            {
                switch (globalVar.databCargo[i].color)
                {
                    case globalVar.CERNA:
                        col = Color.BLACK;
                        break;
                    case globalVar.CERVENA:
                        col = Color.RED;
                        break;
                    case globalVar.MODRA:
                        col = Color.BLUE;
                        break;
                    case globalVar.ZELENA:
                        col = Color.GREEN;
                        break;
                    case globalVar.BILA:
                        col = Color.WHITE;
                        break;
                    default:
                        col = Color.WHITE;
                }
                labelMrizky[globalVar.databCargo[i].posY][globalVar.databCargo[i].posX].setBackground(col);  //globalVar.databCargo[i].color);
                
            }
            if(delnici)
            {
                w1Param.setText("countCargo:\n"+d1.countCargo+ "\nmovedDistance:\n" +d1.movedDistance+ "\ncountWeight:\n"+d1.countWeight);//vypsani parametru delnika, musi se jeste doplnit
                w2Param.setText("countCargo:\n"+d2.countCargo+ "\nmovedDistance:\n" +d2.movedDistance+ "\ncountWeight:\n"+d2.countWeight);//vypsani parametru delnika, musi se jeste doplnit
                jTextArea3.setText("countCargo:\n"+d3.countCargo+ "\nmovedDistance:\n" +d3.movedDistance+ "\ncountWeight:\n"+d3.countWeight);//vypsani parametru delnika, musi se jeste doplnit
                labelMrizky[d1.PosY][d1.PosX].setBackground(Color.BLUE);
                labelMrizky[d2.PosY][d2.PosX].setBackground(Color.RED);
                labelMrizky[d3.PosY][d3.PosX].setBackground(Color.GREEN);
                
            }
       }
    }

    private javax.swing.JLabel labelMrizky[][] = new javax.swing.JLabel[globalVar.MAXY][globalVar.MAXX];
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel basic;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JLabel high;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JLabel medium;
    private javax.swing.JPanel mrizka;
    private javax.swing.JLabel parametrs;
    private javax.swing.JButton start;
    private javax.swing.JButton stop;
    private javax.swing.JLabel w1;
    private javax.swing.JRadioButton w1Basic;
    private javax.swing.JRadioButton w1High;
    private javax.swing.JRadioButton w1Medium;
    private javax.swing.JTextArea w1Param;
    private javax.swing.JLabel w2;
    private javax.swing.JRadioButton w2Basic;
    private javax.swing.JRadioButton w2High;
    private javax.swing.JRadioButton w2Medium;
    private javax.swing.JTextArea w2Param;
    private javax.swing.JLabel w3;
    private javax.swing.JRadioButton w3Basic;
    private javax.swing.JRadioButton w3High;
    private javax.swing.JRadioButton w3Medium;
    // End of variables declaration//GEN-END:variables
    
}
