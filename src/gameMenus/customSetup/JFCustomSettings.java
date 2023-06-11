package gameMenus.customSetup;

import gameMenus.menuItems.JFMenuStatistics;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.prefs.Preferences;
import javax.swing.JDialog;

/**
 *
 * @author Ullmann
 */
public class JFCustomSettings extends JDialog {

    Preferences prefs = Preferences.userNodeForPackage(gameMenus.statistics.class);
    public final String PREF_NAME_C = "CUSTOM_RANGE";
    public final String PREF_NAME_D = "CUSTOM_ANS_TIME";
    public final String PREF_NAME_E = "CUSTOM_LENGHT";
    public final String PREF_NAME_F = "CUSTOM_GEN_TIME";

    public String att1 = " ";
    public String att2 = " ";

    public JFCustomSettings() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jcbNum = new javax.swing.JComboBox();
        jcbRange = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jcbTime = new javax.swing.JComboBox();
        jbPlayCustom = new javax.swing.JButton();
        jcbGenTime = new javax.swing.JComboBox();

        jLabel1.setText("Selecione um nível de dificuldade");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cinq - Criar jogo personalizado");
        setFocusableWindowState(false);
        setResizable(false);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gameResources/cinq_logo.png"))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Jogo Personalizado");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Quantidade de valores na sequência");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Gerar valores de zero até (mas não incluindo)");

        jcbNum.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "5", "6", "7" }));
        jcbNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbNumActionPerformed(evt);
            }
        });

        jcbRange.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "10", "100", "1000" }));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("Tempo total de resposta (segundos)");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("Tempo entre os valores gerados (milissegundos)");

        jcbTime.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "5", "10", "15" }));

        jbPlayCustom.setText("Jogar!");
        jbPlayCustom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPlayCustomActionPerformed(evt);
            }
        });

        jcbGenTime.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "500", "1000", "1500", "2000" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(28, 28, 28)
                        .addComponent(jcbRange, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jcbTime, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jcbNum, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel15)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jcbGenTime, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(0, 43, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(jbPlayCustom)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(124, 124, 124))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(148, 148, 148))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jcbNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jcbRange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jcbTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jcbGenTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jbPlayCustom)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbNumActionPerformed

    private void jbPlayCustomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPlayCustomActionPerformed

        //LENGHT
        if (jcbNum.getSelectedIndex() == 0) {
            att1 = "5";
            String newValue = "5";
            prefs.put(PREF_NAME_E, newValue);
        } else if (jcbNum.getSelectedIndex() == 1) {
            att1 = "6";
            String newValue = "6";
            prefs.put(PREF_NAME_E, newValue);
        } else {
            att1 = "7";
            String newValue = "7";
            prefs.put(PREF_NAME_E, newValue);
        }
        
        //RANGE
        if (jcbRange.getSelectedIndex() == 0) {
            att2 = "10";
            String newValue = "10";
            prefs.put(PREF_NAME_C, newValue);

        } else if (jcbRange.getSelectedIndex() == 1) {
            att2 = "100";
            String newValue = "100";
            prefs.put(PREF_NAME_C, newValue);

        } else {
            att2 = "1000";
            String newValue = "1000";
            prefs.put(PREF_NAME_C, newValue);
        }

        ///ANS TIME
        if (jcbTime.getSelectedIndex() == 0) {
            String newValue = "5";
            prefs.put(PREF_NAME_D, newValue);

        } else if (jcbTime.getSelectedIndex() == 1) {
            String newValue = "10";
            prefs.put(PREF_NAME_D, newValue);

        } else {
            String newValue = "15";
            prefs.put(PREF_NAME_D, newValue);
        }

        //GEN TIME
        if (jcbGenTime.getSelectedIndex() == 0) {
            String newValue = "500";
            prefs.put(PREF_NAME_F, newValue);

        } else if (jcbGenTime.getSelectedIndex() == 1) {
            String newValue = "1000";
            prefs.put(PREF_NAME_F, newValue);

        } else if (jcbGenTime.getSelectedIndex() == 2) {
            String newValue = "1500";
            prefs.put(PREF_NAME_F, newValue);
        } else {
            String newValue = "2000";
            prefs.put(PREF_NAME_F, newValue);
    }//GEN-LAST:event_jbPlayCustomActionPerformed
        this.dispose();

        if (att1 == "5") {
            new JFGameCustom5().setVisible(true);
        } else if (att1 == "6" && att2 != "1000") {
            new JFGameCustom6().setVisible(true);
        } else if (att1 == "7" && att2 != "1000") {
            new JFGameCustom7().setVisible(true);
        } else if (att1 == "6" && att2 == "1000") {
            new JFGameCustom6K().setVisible(true);
        } else if (att1 == "7" && att2 == "1000") {
            new JFGameCustom7K().setVisible(true);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JButton jbPlayCustom;
    private javax.swing.JComboBox jcbGenTime;
    private javax.swing.JComboBox jcbNum;
    private javax.swing.JComboBox jcbRange;
    private javax.swing.JComboBox jcbTime;
    // End of variables declaration//GEN-END:variables
}
