package gameMenus.menuItems;

import gameMenus.JFMainMenu;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.prefs.Preferences;
import javax.swing.JDialog;
import gameLevels.JFGameEasy;
import javax.swing.JOptionPane;

public class JFMenuStatistics extends JDialog {

    Preferences prefs = Preferences.userNodeForPackage(gameMenus.statistics.class); //armazenamento de preferências (estatísticas)
    public final String PREF_NAME_A = "GAMES_PLAYED";
    public final String PREF_NAME_B = "GAMES_WON";
    static String gplayed = " ";
    static String gwon = " ";

    public JFMenuStatistics() {
        initComponents();
        setLocationRelativeTo(null);

        new Thread(new Runnable() {
            @Override
            public void run() {
                String defaultValue = "0";
                gplayed = prefs.get(PREF_NAME_A, defaultValue);
                gwon = prefs.get(PREF_NAME_B, defaultValue);
                showStats();
            }
        }).start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jbClear = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jtGamesWon = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jtWinsPerGame = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtGamesPlayed = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cinq - Estatísticas");
        setModal(true);
        setResizable(false);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gameResources/cinq_logo.png"))); // NOI18N
        jLabel10.setAlignmentY(0.0F);
        jLabel10.setFocusable(false);

        jbClear.setText("Zerar ");
        jbClear.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbClearActionPerformed(evt);
            }
        });

        jLabel8.setText("Sequência memorizadas");
        jLabel8.setAlignmentY(0.0F);
        jLabel8.setFocusable(false);

        jtGamesWon.setEditable(false);
        jtGamesWon.setBackground(new java.awt.Color(255, 255, 255));
        jtGamesWon.setAlignmentX(0.0F);
        jtGamesWon.setAlignmentY(0.0F);
        jtGamesWon.setFocusable(false);
        jtGamesWon.setInheritsPopupMenu(true);

        jLabel9.setText("Acertos por partida (%)");
        jLabel9.setAlignmentY(0.0F);
        jLabel9.setFocusable(false);

        jtWinsPerGame.setEditable(false);
        jtWinsPerGame.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.0"))));
        jtWinsPerGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtWinsPerGameActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Estatísticas");

        jLabel7.setText("Total de partidas jogadas");
        jLabel7.setAlignmentY(0.0F);
        jLabel7.setFocusable(false);

        jtGamesPlayed.setEditable(false);
        jtGamesPlayed.setBackground(new java.awt.Color(255, 255, 255));
        jtGamesPlayed.setAlignmentX(0.0F);
        jtGamesPlayed.setAlignmentY(0.0F);
        jtGamesPlayed.setFocusable(false);
        jtGamesPlayed.setInheritsPopupMenu(true);
        jtGamesPlayed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtGamesPlayedMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jtGamesWon, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtGamesPlayed)
                            .addComponent(jtWinsPerGame, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel2)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtGamesPlayed)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtGamesWon)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtWinsPerGame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jbClear, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jbClear)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtGamesPlayedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtGamesPlayedMouseClicked

    }//GEN-LAST:event_jtGamesPlayedMouseClicked

    private void jtWinsPerGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtWinsPerGameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtWinsPerGameActionPerformed

    private void jbClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbClearActionPerformed
        int option;
        option = JOptionPane.showConfirmDialog(null, "Você perderá todas as suas estatísticas atuais. Tem certeza?",
                "Atenção!", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            String newValue = "0";
            prefs.put(PREF_NAME_A, newValue);
            prefs.put(PREF_NAME_B, newValue);
            jtGamesPlayed.setText("0");
            jtGamesWon.setText("0");
            jtWinsPerGame.setText("0,0");
        }

    }//GEN-LAST:event_jbClearActionPerformed

    public void showStats() {

        Double v1 = Double.parseDouble(gplayed);
        Double v2 = Double.parseDouble(gwon);
        if (v2 <= 0) {
            jtGamesPlayed.setText(gplayed);
            jtGamesWon.setText(gwon);
            jtWinsPerGame.setText("0,0");
        } else {

            double winsPerGame = (v2 / v1) * 100;
            jtGamesPlayed.setText(gplayed);
            jtGamesWon.setText(gwon);
            jtWinsPerGame.setText(numformat(winsPerGame));
            System.out.printf(numformat(winsPerGame));
        }
    }

    public static String numformat(double x) {
        return String.format("%.1f", x);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbClear;
    private javax.swing.JTextField jtGamesPlayed;
    private javax.swing.JTextField jtGamesWon;
    private javax.swing.JFormattedTextField jtWinsPerGame;
    // End of variables declaration//GEN-END:variables
}
