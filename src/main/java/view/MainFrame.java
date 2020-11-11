package view;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import static javax.swing.SwingConstants.VERTICAL;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.opencv.core.Core;

public class MainFrame extends javax.swing.JFrame {

    private final JFileChooser jFileChooser;
    private FileNameExtensionFilter fileNameExtensionFilter;

    public MainFrame() {
        setLookAndFeel();
        nu.pattern.OpenCV.loadShared();
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        jFileChooser = new JFileChooser();
        initComponents();
        canvas.setBackground(new Color(240,240,240));
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        convertToBlackAndWhiteJButton.setVisible(false);
        setThresholdJButton.setVisible(false);
        thresholdJLabel.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        canvas = new model.Canvas();
        convertToBlackAndWhiteJButton = new javax.swing.JButton();
        namesJLabel = new javax.swing.JLabel();
        tittleJLabel = new javax.swing.JLabel();
        initialMessageJLabel = new javax.swing.JLabel();
        setThresholdJButton = new javax.swing.JButton();
        thresholdJLabel = new javax.swing.JLabel();
        mainFrameJMenuBar = new javax.swing.JMenuBar();
        fileJMenu = new javax.swing.JMenu();
        openImageJMenuItem = new javax.swing.JMenuItem();
        saveImageJMenuItem = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        exitJMenuItem = new javax.swing.JMenuItem();
        helpJMenu = new javax.swing.JMenu();
        aboutJMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout canvasLayout = new javax.swing.GroupLayout(canvas);
        canvas.setLayout(canvasLayout);
        canvasLayout.setHorizontalGroup(
            canvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        canvasLayout.setVerticalGroup(
            canvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        convertToBlackAndWhiteJButton.setText("Convert black and white");
        convertToBlackAndWhiteJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertToBlackAndWhiteJButtonActionPerformed(evt);
            }
        });

        namesJLabel.setText("By Jesús Lárez & Ignacion Marín");

        tittleJLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        tittleJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tittleJLabel.setText("Threshold Image");

        initialMessageJLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        initialMessageJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        initialMessageJLabel.setText("Please load an image");

        setThresholdJButton.setText("Set threshold");
        setThresholdJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setThresholdJButtonActionPerformed(evt);
            }
        });

        thresholdJLabel.setText("Threshold: 128");

        fileJMenu.setMnemonic('F');
        fileJMenu.setText("File");

        openImageJMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        openImageJMenuItem.setText("Open Image");
        openImageJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openImageJMenuItemActionPerformed(evt);
            }
        });
        fileJMenu.add(openImageJMenuItem);

        saveImageJMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        saveImageJMenuItem.setText("Save Image");
        fileJMenu.add(saveImageJMenuItem);
        fileJMenu.add(jSeparator1);

        exitJMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        exitJMenuItem.setText("Exit");
        fileJMenu.add(exitJMenuItem);

        mainFrameJMenuBar.add(fileJMenu);

        helpJMenu.setMnemonic('H');
        helpJMenu.setText("Help");

        aboutJMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        aboutJMenuItem.setText("About");
        helpJMenu.add(aboutJMenuItem);

        mainFrameJMenuBar.add(helpJMenu);

        setJMenuBar(mainFrameJMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tittleJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(initialMessageJLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(canvas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(namesJLabel)
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(setThresholdJButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(convertToBlackAndWhiteJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(thresholdJLabel)))
                .addContainerGap(134, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(tittleJLabel)
                .addGap(18, 18, 18)
                .addComponent(canvas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(initialMessageJLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(thresholdJLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(setThresholdJButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(convertToBlackAndWhiteJButton)
                .addGap(81, 81, 81)
                .addComponent(namesJLabel)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void openImageJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openImageJMenuItemActionPerformed
        jFileChooser.setAcceptAllFileFilterUsed(false);
        fileNameExtensionFilter = new FileNameExtensionFilter("Images [.jpg, .png, .jpeg]", new String[]{"jpg", "png", "jpeg"});
        jFileChooser.addChoosableFileFilter(fileNameExtensionFilter);
        int res = jFileChooser.showOpenDialog(null);
        if (res == JFileChooser.APPROVE_OPTION) {
            canvas.setPath(jFileChooser.getSelectedFile().getAbsolutePath());
            if (canvas.loadImage()) {
                int width = canvas.getImage().getWidth();
                int height = canvas.getImage().getHeight();
                if (width < 400) {
                    width = 400;
                }
                if (height < 300) {
                    height = 300;
                }
                this.setSize(new Dimension(width + 80, height + 300));
                initialMessageJLabel.setVisible(false);
                convertToBlackAndWhiteJButton.setVisible(true);
                setThresholdJButton.setVisible(true);
                thresholdJLabel.setVisible(true);
                repaint();

            } else {
                JOptionPane.showMessageDialog(rootPane, "The image dimensions  must not be higher than 1024x768");
            }

        }
        if (res == JFileChooser.CANCEL_OPTION) {

        }
    }//GEN-LAST:event_openImageJMenuItemActionPerformed

    private void convertToBlackAndWhiteJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertToBlackAndWhiteJButtonActionPerformed
        canvas.converToBlackAndWhite();
        repaint();
    }//GEN-LAST:event_convertToBlackAndWhiteJButtonActionPerformed

    private void setThresholdJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setThresholdJButtonActionPerformed
        String res = JOptionPane.showInputDialog(rootPane,"Introduce a threshold value between 0 and 255");
        if (res != null) {
            int value = 0;
            try {
                value = Integer.parseInt(res);
            } catch (NumberFormatException numberFormatException) {
                JOptionPane.showMessageDialog(rootPane, "The value must be numeric");
                return;
            }
            System.out.println("PASE LA EXCEPCION!");
            if (value < 0 || value > 255) {
                JOptionPane.showMessageDialog(rootPane, "The threshold value must be between 0 and 255!");
            }else{
                canvas.setThreshold(Integer.parseInt(res));
                thresholdJLabel.setText("Threshold: " + res);
            }
            
        }
        
    }//GEN-LAST:event_setThresholdJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutJMenuItem;
    private model.Canvas canvas;
    private javax.swing.JButton convertToBlackAndWhiteJButton;
    private javax.swing.JMenuItem exitJMenuItem;
    private javax.swing.JMenu fileJMenu;
    private javax.swing.JMenu helpJMenu;
    private javax.swing.JLabel initialMessageJLabel;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuBar mainFrameJMenuBar;
    private javax.swing.JLabel namesJLabel;
    private javax.swing.JMenuItem openImageJMenuItem;
    private javax.swing.JMenuItem saveImageJMenuItem;
    private javax.swing.JButton setThresholdJButton;
    private javax.swing.JLabel thresholdJLabel;
    private javax.swing.JLabel tittleJLabel;
    // End of variables declaration//GEN-END:variables

    private static void setLookAndFeel() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
}
