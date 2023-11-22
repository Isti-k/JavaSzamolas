
package szamolas;

import java.awt.HeadlessException;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;


public class szamolas extends javax.swing.JFrame {

    int osszeg;
    
    public szamolas() {
        initComponents();
    
        osszeg = 0;
        
        //lblOsszesen.setText(osszeg + " Ft");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        pnlÖsszetevok = new javax.swing.JPanel();
        chbHagyma = new javax.swing.JCheckBox();
        chbAnanasz = new javax.swing.JCheckBox();
        chbSajt = new javax.swing.JCheckBox();
        pnlÖsszesen = new javax.swing.JPanel();
        lblOsszesen = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuProgram = new javax.swing.JMenu();
        mnuProgramMentes = new javax.swing.JMenuItem();
        mnuProgramKilepes = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnuProgramMegnyitas = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pnlÖsszetevok.setBorder(javax.swing.BorderFactory.createTitledBorder("Összetevők"));

        chbHagyma.setText("Hagyma");
        chbHagyma.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ÖsszetevokItemStateChanged(evt);
            }
        });

        chbAnanasz.setText("Ananász");
        chbAnanasz.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ÖsszetevokItemStateChanged(evt);
            }
        });

        chbSajt.setText("Sajt");
        chbSajt.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ÖsszetevokItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout pnlÖsszetevokLayout = new javax.swing.GroupLayout(pnlÖsszetevok);
        pnlÖsszetevok.setLayout(pnlÖsszetevokLayout);
        pnlÖsszetevokLayout.setHorizontalGroup(
            pnlÖsszetevokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlÖsszetevokLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlÖsszetevokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chbSajt)
                    .addComponent(chbHagyma)
                    .addComponent(chbAnanasz))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        pnlÖsszetevokLayout.setVerticalGroup(
            pnlÖsszetevokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlÖsszetevokLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chbSajt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chbHagyma)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chbAnanasz)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Beállítás", pnlÖsszetevok);

        pnlÖsszesen.setBorder(javax.swing.BorderFactory.createTitledBorder("Összesen"));

        lblOsszesen.setText("0 Ft");

        jLabel1.setText("Kiválasztva:");

        jTextArea1.setColumns(12);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout pnlÖsszesenLayout = new javax.swing.GroupLayout(pnlÖsszesen);
        pnlÖsszesen.setLayout(pnlÖsszesenLayout);
        pnlÖsszesenLayout.setHorizontalGroup(
            pnlÖsszesenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlÖsszesenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlÖsszesenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblOsszesen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlÖsszesenLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlÖsszesenLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        pnlÖsszesenLayout.setVerticalGroup(
            pnlÖsszesenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlÖsszesenLayout.createSequentialGroup()
                .addComponent(lblOsszesen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Statisztika", pnlÖsszesen);

        mnuProgram.setText("Program");

        mnuProgramMentes.setText("Mentés..");
        mnuProgram.add(mnuProgramMentes);

        mnuProgramKilepes.setText("Kilépés...");
        mnuProgramKilepes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuProgramKilepesActionPerformed(evt);
            }
        });
        mnuProgram.add(mnuProgramKilepes);
        mnuProgram.add(jSeparator1);

        mnuProgramMegnyitas.setText("Megnyitás..");
        mnuProgram.add(mnuProgramMegnyitas);

        jMenuBar1.add(mnuProgram);

        jMenu2.setText("Lehetőségek");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        osszegetKiir();
        
    }//GEN-LAST:event_formWindowOpened

    private void osszegetKiir() {
        lblOsszesen.setText("A fizetendő összeg: " + osszeg + " Ft");
    }

    private void ÖsszetevokItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ÖsszetevokItemStateChanged
      int ar = 200;
      
      JCheckBox chb = (JCheckBox) evt.getSource();
        
      if (chb.isSelected()) {
            osszeg += ar;
        } else {
             osszeg -= ar;
        }
      
        osszegetKiir();
    }//GEN-LAST:event_ÖsszetevokItemStateChanged

    private void mnuProgramKilepesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuProgramKilepesActionPerformed
        Kilepes();
    }//GEN-LAST:event_mnuProgramKilepesActionPerformed

    private void Kilepes() {
        String kerdes = "Biztos kilép?";
        String cim = "KILÉPÉS";
        int gombokTipusa = JOptionPane.OK_CANCEL_OPTION;
        
        int gomb = JOptionPane.showConfirmDialog(rootPane,kerdes, cim, gombokTipusa);
        //System.out.println("gomb = " + gomb);
        
        if (gomb == JOptionPane.OK_OPTION){
            System.exit(0);
        }
    }

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Kilepes();
    }//GEN-LAST:event_formWindowClosing

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new szamolas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chbAnanasz;
    private javax.swing.JCheckBox chbHagyma;
    private javax.swing.JCheckBox chbSajt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblOsszesen;
    private javax.swing.JMenu mnuProgram;
    private javax.swing.JMenuItem mnuProgramKilepes;
    private javax.swing.JMenuItem mnuProgramMegnyitas;
    private javax.swing.JMenuItem mnuProgramMentes;
    private javax.swing.JPanel pnlÖsszesen;
    private javax.swing.JPanel pnlÖsszetevok;
    // End of variables declaration//GEN-END:variables
}
