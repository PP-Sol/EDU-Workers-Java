package Workers;

import javax.swing.*;
import java.awt.*;

public class HelocopEngineFactor extends JFrame {
    
    int i=0, j=0;
    boolean run = false;
    
    /**
     * Creates a new instance of HelocopEngineFactor
     */
    public HelocopEngineFactor() {
        initComponents();
    }
    
    private void start(java.awt.event.ActionEvent evt) {
        
        if (!run){
            spust();
            run=true;
        }
        labelMrizky[30][60].setBackground(Color.WHITE);
        start.setEnabled(false);
        this.repaint();
    }

    private void spust(){
        for (i=0;i<globalVar.SIZE;i++){
                labelMrizky[globalVar.databCargo[i].posY][globalVar.databCargo[i].posX].setBackground(Color.BLACK);
        }
//        labelMrizky[30][50].setText("O"); 
//        labelMrizky[30][50].setForeground(Color.red); // nastavi barvu pisma
         
    }
    
    
    private javax.swing.JLabel labelMrizky[][];
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton start;
    private JButton stop;
    private JPanel mrizka;
    
    private void initComponents(){
        labelMrizky = new javax.swing.JLabel[globalVar.MAXY][globalVar.MAXX];
        buttonGroup1 = new ButtonGroup();
        buttonGroup2 = new ButtonGroup();
        buttonGroup3 = new ButtonGroup();
        W1 = new JLabel();
        W2 = new JLabel();
        W3 = new JLabel();
        Basic = new JLabel();
        Medium = new JLabel();
        High = new JLabel();
        Param = new JLabel();
        W1Basic = new JRadioButton();
        W1Medium = new JRadioButton();
        W1High = new JRadioButton();
        W2Basic = new JRadioButton();
        W2Medium = new JRadioButton();
        W2High = new JRadioButton();
        W3Medium = new JRadioButton();
        W3Basic = new JRadioButton();
        W3High = new JRadioButton();
        W2Param = new JTextArea();
        W3Param = new JTextArea();
        W1Param = new JTextArea();
        jScrollPane1 = new JScrollPane();
        start = new JButton();
        stop = new JButton();
        mrizka = new JPanel();
        
        
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(new Rectangle(0, 0, 0, 0));
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

        W1.setBackground(Color.RED);
        W1.setText("Worker 1");
        W1.setOpaque(true);

        W2.setBackground(Color.green);
        W2.setText("Worker 2");
        W2.setOpaque(true);
        
        W3.setBackground(Color.yellow);
        W3.setText("Worker 3");
        W3.setOpaque(true);  
        
        start.setText("START SIMULACE");
        start.setBackground(Color.green);
        
        stop.setText("STOP");
        stop.setBackground(Color.red);

        Basic.setText("Basic");

        Medium.setText("Medium");

        High.setText("High");

        Param.setText("Parametrs");

        buttonGroup1.add(W1Basic);
        W1Basic.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        W1Basic.setMargin(new java.awt.Insets(0, 0, 0, 0));
        W1Basic.setSelected(true);

        buttonGroup1.add(W1Medium);
        W1Medium.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        W1Medium.setMargin(new java.awt.Insets(0, 0, 0, 0));

        buttonGroup1.add(W1High);
        W1High.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        W1High.setMargin(new java.awt.Insets(0, 0, 0, 0));

        buttonGroup2.add(W2Basic);
        W2Basic.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        W2Basic.setMargin(new java.awt.Insets(0, 0, 0, 0));
        W2Basic.setSelected(true);

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
        W3Basic.setSelected(true);


        buttonGroup3.add(W3High);
        W3High.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        W3High.setMargin(new java.awt.Insets(0, 0, 0, 0));

        W2Param.setColumns(20);
        W2Param.setRows(3);

        W3Param.setColumns(20);
        W3Param.setRows(3);

        W1Param.setColumns(20);
        W1Param.setRows(3);
        

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

//--------------rozmisteni komponent v okne-----------
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(Basic)
                            .addComponent(High)
                            .addComponent(Medium)
                            .addComponent(Param))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(W1Param, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
                            .addComponent(W1)
                            .addComponent(W1Medium)
                            .addComponent(W1High)
                            .addComponent(W1Basic))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(W2)
                            .addComponent(W2Basic)
                            .addComponent(W2Medium)
                            .addComponent(W2High)
                            .addComponent(W2Param, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(W3High)
                            .addComponent(W3Basic)
                            .addComponent(W3)
                            .addComponent(W3Param, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
                            .addComponent(W3Medium))
                        .addGap(30,30,30)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(stop))
                        .addGap(32,32,32)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(start)))
//----------------------------------------------------------------nastaveni sirky mrizky--------------
                    .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 950, GroupLayout.PREFERRED_SIZE))
//----------------------------------------------------------------sirka tabulky jen nastavena--------------
                .addContainerGap(5, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup (layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addComponent(W1)
                            .addComponent(W2)
                            .addComponent(W3))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addComponent(Basic)
                            .addComponent(W1Basic)
                            .addComponent(W2Basic)
                            .addComponent(W3Basic))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addComponent(Medium)
                            .addComponent(W1Medium)
                            .addComponent(W2Medium)
                            .addComponent(W3Medium))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addComponent(High)
                            .addComponent(W1High)
                            .addComponent(W2High)
                            .addComponent(W3High))))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(Param)
                    .addComponent(W1Param, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(W3Param, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(W2Param, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(stop)
                    .addComponent(start))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
//----------------------------------------------------------------nastaveni vysky tabulky--------------
                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 500, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(195, Short.MAX_VALUE))
        );
        pack();
    }
}