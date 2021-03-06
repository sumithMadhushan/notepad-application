/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demonotepad;

import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.event.TextEvent;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author sumi
 */
public class myNotePad extends javax.swing.JFrame {

    String pragrameName = "Notepad";
    String filename = "";
    String holdText;
    String fn;
    String dir;
    boolean textChanged = false;
    String fileName;
    Clipboard clip = getToolkit().getSystemClipboard();

    /**
     * Creates new form myNotePad
     */
    public myNotePad() {
        initComponents();
        setIcon();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        colorDialog = new javax.swing.JDialog();
        colorPicker = new javax.swing.JColorChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        newMenu = new javax.swing.JMenuItem();
        openMenu = new javax.swing.JMenuItem();
        saveMenu = new javax.swing.JMenuItem();
        saveAsMenu = new javax.swing.JMenuItem();
        exitMenu = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        javax.swing.GroupLayout colorDialogLayout = new javax.swing.GroupLayout(colorDialog.getContentPane());
        colorDialog.getContentPane().setLayout(colorDialogLayout);
        colorDialogLayout.setHorizontalGroup(
            colorDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(colorDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(colorPicker, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        colorDialogLayout.setVerticalGroup(
            colorDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(colorDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(colorPicker, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("My Notepad");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane1.setViewportView(textArea);

        jMenu1.setText("File");

        newMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        newMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new.png"))); // NOI18N
        newMenu.setText("New");
        newMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newMenuActionPerformed(evt);
            }
        });
        jMenu1.add(newMenu);

        openMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        openMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/open.png"))); // NOI18N
        openMenu.setText("Open");
        openMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuActionPerformed(evt);
            }
        });
        jMenu1.add(openMenu);

        saveMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        saveMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        saveMenu.setText("Save");
        saveMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMenuActionPerformed(evt);
            }
        });
        jMenu1.add(saveMenu);

        saveAsMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        saveAsMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/saveas.png"))); // NOI18N
        saveAsMenu.setText("Save As");
        saveAsMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAsMenuActionPerformed(evt);
            }
        });
        jMenu1.add(saveAsMenu);

        exitMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        exitMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        exitMenu.setText("Exit");
        exitMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuActionPerformed(evt);
            }
        });
        jMenu1.add(exitMenu);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        jMenuItem3.setText("Text color");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newMenuActionPerformed
        // TODO add your handling code here:
        newFile();
    }//GEN-LAST:event_newMenuActionPerformed

    private void openMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuActionPerformed
        // TODO add your handling code here:
        if(textArea.getText().length() >0){
            int confirm = JOptionPane.showConfirmDialog(null, "Do you want to save before open new file");
            if (confirm == JOptionPane.YES_OPTION) {
                if ("".equals(filename)) {
                    saveAs();
                } else {
                    save(filename);

                    FileDialog fd = new FileDialog(this, "Choose File", FileDialog.SAVE);
                    fd.show();
                    if (fd.getFile() != null) {
                        filename = fd.getDirectory() + fd.getFile();
                        setTitle(filename);
                        checkFile();
                        textArea.requestFocus();
                    } else if (confirm == JOptionPane.NO_OPTION) {
                        FileDialog fd2 = new FileDialog(this, "Choose File", FileDialog.SAVE);
                        fd2.show();
                        if (fd2.getFile() != null) {
                            filename = fd2.getDirectory() + fd2.getFile();
                            setTitle(filename);
                            checkFile();
                            textArea.requestFocus();
                        }

                    }
                }
            }
        }else if (textArea.getText().length() < 1) {
            FileDialog fd = new FileDialog(this, "Choose File", FileDialog.LOAD);
            fd.show();

            if (fd.getTitle() != null) {
                filename = fd.getDirectory() + fd.getFile();
                setTitle(filename);
                checkFile();
                textArea.requestFocus();
            }
        }
        if (!textChanged) {
            FileDialog fd = new FileDialog(this, "Choose File", FileDialog.LOAD);
            fd.show();
            if (fd.getTitle() != null) {
                filename = fd.getDirectory() + fd.getFile();
                setTitle(filename);
                checkFile();
       
                textArea.requestFocus();
            }
        }
        
    }//GEN-LAST:event_openMenuActionPerformed

    private void saveAsMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAsMenuActionPerformed
        // TODO add your handling code here:
        saveAs();
    }//GEN-LAST:event_saveAsMenuActionPerformed

    private void exitMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuActionPerformed
        // TODO add your handling code here:
        if ("".equals(textArea.getText())) {
            System.exit(0);
        } else if (!textChanged) {
            System.exit(0);
        } else {
            int confirm = JOptionPane.showConfirmDialog(this, "Dou you want to save before exit.?");
            if (confirm == JOptionPane.YES_OPTION) {
                if (filename.equals("")) {
                    saveAs();
                } else {
                    save(filename);
                }
            }
            if (confirm == JOptionPane.NO_OPTION) {
                System.exit(0);
            }
        }

    }//GEN-LAST:event_exitMenuActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        if(textArea.getText().length() >0){
            int confirm = JOptionPane.showConfirmDialog(this, "Do you want to save before closing");
            if (confirm == JOptionPane.YES_OPTION) {
                if (filename.equals("")) {
                    saveAs();
                } else {
                    save(filename);
                }
                System.exit(0);
            }
            if (confirm == JOptionPane.NO_OPTION) {
                System.exit(0);
            }
        }
        if ("".equals(textArea.getText())) {
            System.exit(0);
        }
        if (!textChanged) {
            System.exit(0);
        } 
    }//GEN-LAST:event_formWindowClosing

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        Color c = colorPicker.showDialog(null, "color picker", java.awt.Color.BLACK);
        textArea.setForeground(c);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void saveMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveMenuActionPerformed
        // TODO add your handling code here:
        if (filename.equals("")) {
            saveAs();
        } else {
            save(filename);
        }
    }//GEN-LAST:event_saveMenuActionPerformed

    private void textAreaTextValueChanged(java.awt.event.TextEvent evt) {
        if (TextEvent.TEXT_VALUE_CHANGED != 0) {
            if (!textChanged) {
                setTitle("* " + getTitle());
            }
            textChanged = true;
            saveMenu.setEnabled(true);
        }
    }

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
            java.util.logging.Logger.getLogger(myNotePad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(myNotePad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(myNotePad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(myNotePad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new myNotePad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog colorDialog;
    private javax.swing.JColorChooser colorPicker;
    private javax.swing.JMenuItem exitMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem newMenu;
    private javax.swing.JMenuItem openMenu;
    private javax.swing.JMenuItem saveAsMenu;
    private javax.swing.JMenuItem saveMenu;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
    }

    private void newFile() {

        if (textArea.getText().length() < 1) {
            setTitle("Untitled-" + pragrameName);
            textArea.setText("");
            textChanged = false;

        } else if (!textChanged) {
            setTitle("Untitled-" + pragrameName);
            textArea.setText("");
            textChanged = false;
        } else {
            int confirm = JOptionPane.showConfirmDialog(null, "Do you want to save before exiting this progaram?");

            if (confirm == JOptionPane.YES_OPTION) {

                if ("".equals(filename)) {
                    saveAs();
                } else {
                    save(filename);
                }
                setTitle(pragrameName);
                filename = "";
                textArea.setText("");
                textChanged = false;

            } else if (confirm == JOptionPane.NO_OPTION) {
                setTitle(pragrameName);
                textArea.setText("");
                textChanged = false;
            }
        }
    }

    private void save(String filename) {

        setTitle(pragrameName + " " + filename);
        try {
            FileWriter out;
            out = new FileWriter(fn);
            out.write(textArea.getText());
            out.close();
        } catch (Exception e) {
            System.out.println("Error :" + e);
        }
        textChanged = false;
        saveMenu.setEnabled(false);
    }

    private void saveAs() {
        FileDialog fd = new FileDialog(myNotePad.this, "save", FileDialog.SAVE);
        fd.show();

        if (fd.getFile() != null) {
            fn = fd.getFile();
            dir = fd.getDirectory();
            filename = dir + fn + ".txt";
            setTitle(filename);
            try {
                DataOutputStream d = new DataOutputStream(new FileOutputStream(filename));
                holdText = textArea.getText();
                BufferedReader br = new BufferedReader(new StringReader(holdText));
                while ((holdText = br.readLine()) != null) {
                    d.writeBytes(holdText + "\r\n");
                    d.close();
                }
            } catch (Exception e) {

                System.out.println("File note Found");
            }
            textArea.requestFocus();
            save(filename);
        }
    }

    public void checkFile() {
        StringBuffer sb = new StringBuffer();
        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader(filename));
            String s = "";
            while ((s = br.readLine()) != null) {
                sb.append(s + "\n");
            }
            textArea.setText(sb.toString());
            br.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(myNotePad.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(myNotePad.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
