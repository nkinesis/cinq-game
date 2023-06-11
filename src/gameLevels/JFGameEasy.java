package gameLevels;

import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.prefs.Preferences;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author Ullmann
 */
public class JFGameEasy extends JDialog {

    Preferences prefs = Preferences.userNodeForPackage(gameMenus.statistics.class);
    public final String PREF_NAME_A = "GAMES_PLAYED";
    public final String PREF_NAME_B = "GAMES_WON";

    private final List<Integer> lista; //lista principal, onde ficarão os números gerados
    private final List<Integer> answer; //lista secundária, onde ficarão os números fornecidos
    private final List<String> empty; //lista vazia, para limpar o display
    boolean stopCount = false;

    //Configurando a dificuldade do jogo:
    int answerTime = 15; //tempo de resposta do jogador (em segundos)
    int sequenceLength = 5; //tamanho da sequência gerada
    int sequenceLimit = 10; //range de números na sequência (contando a partir de zero)
    int sequenceTime = 1000; //tempo por item da sequência (em milissegundos)

    public JFGameEasy() {
        initComponents();
        setLocationRelativeTo(null);
        lista = new ArrayList<>(); //lista principal
        answer = new ArrayList<>(); //lista secundária
        empty = new ArrayList<>(); //lista vazia
        jbCheckE.setEnabled(false); //desativar botão de resposta
        jbStartE.setEnabled(true); //ativar botão de iniciar
        jtAnswerE.setEnabled(false); //desativar campo de resposta
        welcomeMessage(); //mostrar mensagem "clique em iniciar"
        this.addWindowListener(new JFGameEasy.stopThreadClose());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtTimerE = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtAnswerE = new javax.swing.JTextPane();
        jbCheckE = new javax.swing.JButton();
        jbStartE = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList1E = new javax.swing.JList();
        jLabel1E = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cinq - Nível Simples");
        setModal(true);
        setPreferredSize(new java.awt.Dimension(405, 390));
        setResizable(false);

        jtTimerE.setEditable(false);
        jtTimerE.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jtTimerE.setCaretColor(new java.awt.Color(204, 204, 204));
        jtTimerE.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane1.setViewportView(jtTimerE);

        jtAnswerE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtAnswerEKeyPressed(evt);
            }
        });
        jScrollPane3.setViewportView(jtAnswerE);

        jbCheckE.setText("Responder");
        jbCheckE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCheckEActionPerformed(evt);
            }
        });

        jbStartE.setText("Iniciar");
        jbStartE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbStartEActionPerformed(evt);
            }
        });

        jList1E.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jList1E.setToolTipText("");
        jList1E.setFocusable(false);
        jList1E.setLayoutOrientation(javax.swing.JList.HORIZONTAL_WRAP);
        jList1E.setVisibleRowCount(0);
        jList1E.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1EMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jList1E);

        jLabel1E.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1E.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1E.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gameResources/cinq_logo.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Nível Simples");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(103, 103, 103))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(108, 108, 108)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(37, 37, 37)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(39, 39, 39))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jbStartE, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(31, 31, 31)
                            .addComponent(jbCheckE, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(37, 37, 37))
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel1E)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1E)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCheckE)
                    .addComponent(jbStartE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private class stopThreadClose extends WindowAdapter {

        public void windowClosing(WindowEvent e) {
            clear();
        }
    }

    private void jbStartEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbStartEActionPerformed
        empty.clear();
        jbStartE.setEnabled(false);
        stopCount = false; //permitir que o contador volte a funcionar
        generateSequence();//gerar sequencia numérica e mostrar no display
    }//GEN-LAST:event_jbStartEActionPerformed

    private void jbCheckEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCheckEActionPerformed
        try {
            boolean win = false;//variável que irá definir a exibição da mensagem de vitória/derrota
            String[] ans = jtAnswerE.getText().split(" ");//joga a resposta em um array de String...
            answer.add(Integer.parseInt(ans[0])); //.. e então joga o array em uma lista
            answer.add(Integer.parseInt(ans[1]));
            answer.add(Integer.parseInt(ans[2]));
            answer.add(Integer.parseInt(ans[3]));
            answer.add(Integer.parseInt(ans[4]));

            if (lista.get(0).equals(answer.get(0)) && lista.get(1).equals(answer.get(1))
                    && lista.get(2).equals(answer.get(2)) && lista.get(3).equals(answer.get(3))
                    && lista.get(4).equals(answer.get(4))) {
                win = true;
            } else {
                win = false;
            }

            if (win == true) { //abre uma caixa de diálogo informando se o jogador acertou ou não.
                clear();
                JOptionPane.showMessageDialog(null, "Parabéns! Você acertou a sequência!");
                statsWin();
            } else {
                clear();
                JOptionPane.showMessageDialog(null, "Você errou a sequência! Preste mais atenção da próxima vez...");
                statsLose();
            }
        } catch (ArrayIndexOutOfBoundsException ex) { //caso o jogador aperte o botão sem ter escrito nada no campo, é erro.
            clear();
            JOptionPane.showMessageDialog(null, "Você não escreveu uma resposta! Preste mais atenção da próxima vez...");
            statsLose();
        } catch (Exception e) {
            clear();
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Você errou a sequência! Preste mais atenção da próxima vez...");
            statsLose();
        }
    }//GEN-LAST:event_jbCheckEActionPerformed

    private void statsWin() {
        String defaultValue = "0";
        String propertyValueA = prefs.get(PREF_NAME_A, defaultValue);
        String propertyValueB = prefs.get(PREF_NAME_B, defaultValue);
        Integer pl = Integer.parseInt(propertyValueA); //games played
        Integer wn = Integer.parseInt(propertyValueB); //games won
        Integer aux_a = pl + 1;
        Integer aux_b = wn + 1;

        String newValueA = aux_a.toString();
        String newValueB = aux_b.toString();
        prefs.put(PREF_NAME_A, newValueA);
        prefs.put(PREF_NAME_B, newValueB);
        System.out.println("prefs updated");
    }

    private void statsLose() {
        String defaultValue = "0";
        String propertyValueA = prefs.get(PREF_NAME_A, defaultValue);
        Integer pl = Integer.parseInt(propertyValueA); //games played
        Integer aux_a = pl + 1;
        String newValueA = aux_a.toString();
        prefs.put(PREF_NAME_A, newValueA);
        System.out.println("prefs updated");
    }

    private void jtAnswerEKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtAnswerEKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jbCheckEActionPerformed(null);
        }
    }//GEN-LAST:event_jtAnswerEKeyPressed

    private void jList1EMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1EMouseClicked
    }//GEN-LAST:event_jList1EMouseClicked

    private void generateSequence() { //gerador de números
        new Thread(new Runnable() {
            @Override
            public void run() {
                int num = 0;
                Random r = new Random();
                for (int j = 0; j < sequenceLength; j++) {
                    num = r.nextInt(sequenceLimit);
                    lista.add(num);
                    jList1E.setListData(lista.toArray());
                    try {
                        Thread.sleep(sequenceTime);
                    } catch (InterruptedException ex) {

                    }
                }
                empty.add("Escreva a sequência!");//mensagem que irá aparecer durante o tempo de resposta
                jList1E.setListData(empty.toArray()); //tirar números da JList e printar mensagem
                timer(); //iniciar contador de tempo
                jbCheckE.setEnabled(true); //desbloquear botão de resposta
                jbStartE.setEnabled(false); //bloquear botão de início
                jtAnswerE.setEnabled(true); //desbloquear campo de texto de resposta
            }
        }).start();
    }

    private void timer() { //contador de tempo
        new Thread(new Runnable() {
            Integer count = answerTime;

            @Override
            public void run() {
                try {
                    while (count >= 0) {
                        jtTimerE.setText(count.toString());
                        Thread.sleep(1000);
                        count--;
                        if (count == 0) {
                            clear();
                            jbCheckE.setEnabled(false);
                            JOptionPane.showMessageDialog(null, "Tempo esgotado! Seja mais rápido da próxima vez...");
                        }
                        if (stopCount == true) {
                            break;
                        }
                    }
                } catch (InterruptedException ex) {
                }

            }
        }).start();
    }

    public void clear() { //limpar arrays e colocar tudo de volta aos padrões iniciais 
        stopCount = true;
        lista.clear();
        answer.clear();
        empty.clear();
        welcomeMessage();
        jList1E.setListData(empty.toArray());
        jtTimerE.setText("");
        jtAnswerE.setText("");
        jbStartE.setEnabled(true);
        jtAnswerE.setEnabled(false);
        jbCheckE.setEnabled(false);
    }

    public void stopCounter() { //parar contador
        stopCount = true;
    }

    public void welcomeMessage() {
        empty.add("        Clique em \"Iniciar\"");
        jList1E.setListData(empty.toArray());
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel1E;
    private javax.swing.JList jList1E;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton jbCheckE;
    private javax.swing.JButton jbStartE;
    private javax.swing.JTextPane jtAnswerE;
    private javax.swing.JTextPane jtTimerE;
    // End of variables declaration//GEN-END:variables
}
