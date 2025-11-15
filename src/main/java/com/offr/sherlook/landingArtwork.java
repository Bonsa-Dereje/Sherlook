
package com.offr.sherlook;


public class landingArtwork extends javax.swing.JFrame {


    public landingArtwork() {
        setUndecorated(true); 
        initComponents();
        setLocationRelativeTo(null); 
        appNameLanding.setFont(new java.awt.Font("Rotherland", java.awt.Font.PLAIN, 120));
        java.awt.EventQueue.invokeLater(() -> {
            int panelW = landingArtworkPanel.getWidth();
            int panelH = landingArtworkPanel.getHeight();
            int labelW = appNameLanding.getPreferredSize().width;
            int labelH = appNameLanding.getPreferredSize().height;

            int centeredX = (panelW - labelW) / 2;
            int centeredY = (panelH - labelH) / 2;

            appNameLanding.setBounds(centeredX, centeredY, labelW, labelH);  
        });       
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        landingArtworkPanel = new javax.swing.JPanel();
        appNameLanding = new javax.swing.JLabel();
        artworkImg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        landingArtworkPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        appNameLanding.setFont(new java.awt.Font("Rotherland", 0, 60)); // NOI18N
        appNameLanding.setForeground(new java.awt.Color(255, 255, 255));
        appNameLanding.setText("Sherlook");
        landingArtworkPanel.add(appNameLanding, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, -1, -1));

        artworkImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/landingArtwork.jpg"))); // NOI18N
        landingArtworkPanel.add(artworkImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 542));

        getContentPane().add(landingArtworkPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
  
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new landingArtwork().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel appNameLanding;
    private javax.swing.JLabel artworkImg;
    private javax.swing.JPanel landingArtworkPanel;
    // End of variables declaration//GEN-END:variables
}
