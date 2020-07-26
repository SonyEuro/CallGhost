/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package call.ghost;

import java.awt.Color;
import java.awt.Toolkit;
import java.io.File;

/**
 *
 * @author Sony
 */
public class GhostForm extends javax.swing.JFrame {
    
    CallGhost Casper;
    /**
     * Creates new form GhostForm
     */
    public GhostForm() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage("src/call/ghost/Demon2.png")); // 16x16 значок
        setLocationRelativeTo(null);    // окно по центру
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DirSelect = new javax.swing.JFileChooser();
        LogSelect = new javax.swing.JFileChooser();
        DirSelectBtn = new javax.swing.JButton();
        LogSelectBtn = new javax.swing.JButton();
        DirSelectText = new javax.swing.JTextField();
        LogSelectText = new javax.swing.JTextField();
        StartBtn = new javax.swing.JButton();
        KillProcBtn = new javax.swing.JButton();
        ChInnerDir = new javax.swing.JCheckBox();
        ChSize = new javax.swing.JCheckBox();
        ChCreateTime = new javax.swing.JCheckBox();
        ChLastModifTime = new javax.swing.JCheckBox();
        ChReadOnly = new javax.swing.JCheckBox();
        ChArchive = new javax.swing.JCheckBox();
        ChHidden = new javax.swing.JCheckBox();
        ChSystem = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();

        DirSelect.setCurrentDirectory(new java.io.File("D:\\Desktop"));
        DirSelect.setDialogTitle("");
        DirSelect.setFileSelectionMode(javax.swing.JFileChooser.DIRECTORIES_ONLY);

        LogSelect.setCurrentDirectory(new java.io.File("D:\\Desktop"));
        LogSelect.setFileSelectionMode(javax.swing.JFileChooser.DIRECTORIES_ONLY);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Вызов демона");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        DirSelectBtn.setText("Выбрать папку");
        DirSelectBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DirSelectBtnActionPerformed(evt);
            }
        });

        LogSelectBtn.setLabel("Выбрать папку");
        LogSelectBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogSelectBtnActionPerformed(evt);
            }
        });

        DirSelectText.setForeground(new java.awt.Color(153, 153, 153));
        DirSelectText.setText("Выберите исходную директорию");

        LogSelectText.setForeground(new java.awt.Color(153, 153, 153));
        LogSelectText.setText("Выберите директорию назначения");

        StartBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/call/ghost/Demon.png"))); // NOI18N
        StartBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        StartBtn.setPreferredSize(new java.awt.Dimension(40, 40));
        StartBtn.setPressedIcon(StartBtn.getIcon());
        StartBtn.setVerifyInputWhenFocusTarget(false);
        StartBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartBtnActionPerformed(evt);
            }
        });

        KillProcBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/call/ghost/Kill.png"))); // NOI18N
        KillProcBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KillProcBtnActionPerformed(evt);
            }
        });

        ChInnerDir.setText("Сканировать вложенные папки");
        ChInnerDir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChInnerDirActionPerformed(evt);
            }
        });

        ChSize.setText("Размер файла");
        ChSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChSizeActionPerformed(evt);
            }
        });

        ChCreateTime.setText("Время создания");
        ChCreateTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChCreateTimeActionPerformed(evt);
            }
        });

        ChLastModifTime.setText("Время изменения");
        ChLastModifTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChLastModifTimeActionPerformed(evt);
            }
        });

        ChReadOnly.setText("Только чтение");
        ChReadOnly.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChReadOnlyActionPerformed(evt);
            }
        });

        ChArchive.setText("Архивный");
        ChArchive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChArchiveActionPerformed(evt);
            }
        });

        ChHidden.setText("Скрытый");
        ChHidden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChHiddenActionPerformed(evt);
            }
        });

        ChSystem.setText("Системный");
        ChSystem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChSystemActionPerformed(evt);
            }
        });

        jLabel1.setText("Атрибуты:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LogSelectText)
                            .addComponent(DirSelectText))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(DirSelectBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LogSelectBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ChInnerDir)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ChSize)
                            .addComponent(ChHidden)
                            .addComponent(ChArchive)
                            .addComponent(ChReadOnly)
                            .addComponent(ChLastModifTime)
                            .addComponent(ChCreateTime)
                            .addComponent(ChSystem))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(StartBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(KillProcBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DirSelectBtn)
                    .addComponent(DirSelectText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LogSelectBtn)
                    .addComponent(LogSelectText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(ChInnerDir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ChSize)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ChCreateTime)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ChLastModifTime)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ChReadOnly)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ChArchive)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ChHidden)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ChSystem))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(StartBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(KillProcBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 9, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DirSelectBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DirSelectBtnActionPerformed
        DirSelect.showOpenDialog(this); //открываем выбор папки и выбираем папку
            File Dir = DirSelect.getSelectedFile(); //получаем папку
        try {//пытаемся с ним работать
            DirSelectText.setForeground(Color.BLACK);
            DirSelectText.setText(Dir.getAbsolutePath());//отображаем полный адрес папки в окне
            Casper.SetAddressDir(Dir.getAbsolutePath());
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_DirSelectBtnActionPerformed

    private void StartBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartBtnActionPerformed
        Casper=new CallGhost(); //создаем пентаграмму (экземпляр демона)
        Casper.start();//вызов демона
    }//GEN-LAST:event_StartBtnActionPerformed

    private void LogSelectBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogSelectBtnActionPerformed
        LogSelect.showOpenDialog(this); //открываем выбор файла и выбираем файл
            File txt = LogSelect.getSelectedFile(); //получаем файл    
        try {//пытаемся с ним работать
            LogSelectText.setForeground(Color.BLACK);
            LogSelectText.setText(txt.getAbsolutePath());//отображаем полный адрес файла в окне
            Casper.SetAddressLog(txt.getAbsolutePath());
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_LogSelectBtnActionPerformed

    private void KillProcBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KillProcBtnActionPerformed
        Casper.stop();
//        Casper.interrupt();//убивает демона
    }//GEN-LAST:event_KillProcBtnActionPerformed

    private void ChSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChSizeActionPerformed
        Casper.SetSize();
    }//GEN-LAST:event_ChSizeActionPerformed

    private void ChCreateTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChCreateTimeActionPerformed
        // TODO add your handling code here:
        Casper.SetCreateTime();
    }//GEN-LAST:event_ChCreateTimeActionPerformed

    private void ChLastModifTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChLastModifTimeActionPerformed
        // TODO add your handling code here:
        Casper.SetLastModifTime();
    }//GEN-LAST:event_ChLastModifTimeActionPerformed

    private void ChReadOnlyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChReadOnlyActionPerformed
        // TODO add your handling code here:
        Casper.SetReadOnly();
    }//GEN-LAST:event_ChReadOnlyActionPerformed

    private void ChArchiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChArchiveActionPerformed
        // TODO add your handling code here:
        Casper.SetArchive();
    }//GEN-LAST:event_ChArchiveActionPerformed

    private void ChHiddenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChHiddenActionPerformed
        // TODO add your handling code here:
        Casper.SetHidden();
    }//GEN-LAST:event_ChHiddenActionPerformed

    private void ChSystemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChSystemActionPerformed
        // TODO add your handling code here:
        Casper.SetSystem();
    }//GEN-LAST:event_ChSystemActionPerformed

    private void ChInnerDirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChInnerDirActionPerformed
        // TODO add your handling code here:
        Casper.SetInnerDir();
    }//GEN-LAST:event_ChInnerDirActionPerformed

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
            java.util.logging.Logger.getLogger(GhostForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GhostForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GhostForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GhostForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GhostForm().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox ChArchive;
    private javax.swing.JCheckBox ChCreateTime;
    private javax.swing.JCheckBox ChHidden;
    private javax.swing.JCheckBox ChInnerDir;
    private javax.swing.JCheckBox ChLastModifTime;
    private javax.swing.JCheckBox ChReadOnly;
    private javax.swing.JCheckBox ChSize;
    private javax.swing.JCheckBox ChSystem;
    private javax.swing.JFileChooser DirSelect;
    private javax.swing.JButton DirSelectBtn;
    private javax.swing.JTextField DirSelectText;
    private javax.swing.JButton KillProcBtn;
    private javax.swing.JFileChooser LogSelect;
    private javax.swing.JButton LogSelectBtn;
    private javax.swing.JTextField LogSelectText;
    private javax.swing.JButton StartBtn;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
