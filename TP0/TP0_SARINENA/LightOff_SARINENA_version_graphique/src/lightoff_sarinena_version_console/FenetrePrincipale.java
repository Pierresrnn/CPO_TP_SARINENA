/*
SARINENA, TDC , LightOff_version_graphique, 06/11/2023
 */
package lightoff_sarinena_version_console;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author pierr
 */
public class FenetrePrincipale extends javax.swing.JFrame {

    /**
     * Creates new form FenetrePrincipale
     */
    GrilleDeJeu grille;
    int nbCoups;
    int i;
    int nbLignes;
    int nbColonnes;
    int nbCoupsMAX;

    public FenetrePrincipale() {

        initComponents();
        nbLignes = 2;
        nbColonnes = 2;
        this.grille = new GrilleDeJeu(nbLignes, nbColonnes);
        CreationGrille();
        initialiserPartie();
        FinDePartie();
    }

    public void initialiserPartie() {
        grille.eteindreToutesLesCellules();
        grille.melangerMatriceAleatoirement(10);
    }

    public void CreationGrille() {
        PanneauGrille.removeAll();
        Panneau_BoutonsHorizontals.removeAll();
        Panneau_BoutonsVerticaux.removeAll();
        PanneauBoutonsDifficulte.removeAll();
        PanneauGrille.setLayout(new GridLayout(nbLignes, nbColonnes));
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                CelluleGraphique bouton_cellule = new CelluleGraphique(grille.matriceCellule[i][j], 36, 36);// création d'un bouton
                PanneauGrille.add(bouton_cellule); // ajout au Jpanel PanneauGrille
            }
        }
        getContentPane().add(PanneauGrille, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, nbColonnes * 40, nbLignes * 40));
        this.pack();
        this.revalidate();
        Panneau_BoutonsVerticaux.setLayout(new GridLayout(nbLignes, 1));
        getContentPane().add(Panneau_BoutonsVerticaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 1 * 40, nbLignes * 40));
        this.pack();
        this.revalidate();
        // création du panneau de boutons verticaux (pour les lignes)
        for (i = 0; i < nbLignes; i++) {
            JButton bouton_ligne = new JButton();
            ActionListener ecouteurClick = new ActionListener() {
                final int j = i;

                @Override
                public void actionPerformed(ActionEvent e) {
                    grille.activerLigneDeCellules(j);
                    nbCoups++;
                    repaint();
                    FinDePartie();
                }
            };
            bouton_ligne.addActionListener(ecouteurClick);
            Panneau_BoutonsVerticaux.add(bouton_ligne);

        }
        Panneau_BoutonsHorizontals.setLayout(new GridLayout(1, nbColonnes));
        getContentPane().add(Panneau_BoutonsHorizontals, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, nbColonnes * 40, 1 * 40));
        this.pack();
        this.revalidate();
        // création du panneau de boutons horizontaux (pour les lignes)
        for (i = 0; i < nbColonnes; i++) {
            JButton bouton_colonne = new JButton();
            ActionListener ecouteurClick = new ActionListener() {
                final int j = i;

                @Override
                public void actionPerformed(ActionEvent e) {
                    grille.activerColonneDeCellules(j);
                    nbCoups++;
                    repaint();
                    FinDePartie();
                }
            };
            bouton_colonne.addActionListener(ecouteurClick);
            Panneau_BoutonsHorizontals.add(bouton_colonne);

        }
        getContentPane().add(Diagonale_Descandante, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 20, 1 * 40, 1 * 40));
        this.pack();
        this.revalidate();
        getContentPane().add(Diagonale_Montante, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 95 + nbLignes * 40, 1 * 40, 1 * 40));
        this.pack();
        this.revalidate();

        PanneauBoutonsDifficulte.setLayout(new GridLayout(1, 3));

        JButton boutonFacile = new JButton("Facile");
        JButton boutonMoyen = new JButton("Moyen");
        JButton boutonDifficile = new JButton("Difficile");
        PanneauBoutonsDifficulte.add(boutonFacile);
        PanneauBoutonsDifficulte.add(boutonMoyen);
        PanneauBoutonsDifficulte.add(boutonDifficile);

        getContentPane().add(PanneauBoutonsDifficulte, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 95 + nbLignes * 40, 6 * 40, 1 * 40));
        this.pack();
        this.revalidate();

        boutonFacile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                grille = new GrilleDeJeu(9, 9);
                nbLignes = 9;
                nbColonnes = 9;
                nbCoupsMAX = 15;

                CreationGrille();
                initialiserPartie();
                FinDePartie();

            }
        });

        boutonMoyen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                grille = new GrilleDeJeu(11, 11);
                nbLignes = 11;
                nbColonnes = 11;
                nbCoupsMAX = 12;

                CreationGrille();
                initialiserPartie();
                FinDePartie();

            }
        });

        boutonDifficile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                grille = new GrilleDeJeu(15, 15);
                nbLignes = 15;
                nbColonnes = 15;
                nbCoupsMAX = 10;
                CreationGrille();
                initialiserPartie();
                FinDePartie();

            }
        }
        );
    }

    public void FinDePartie() {
        if (nbCoups >= nbCoupsMAX) {
            this.dispose();
            FenetrePerdante r = new FenetrePerdante();
            r.setVisible(true);

        } else {
            if (this.grille.cellulesToutesEteintes()) {
                Diagonale_Descandante.setEnabled(false);
                Diagonale_Montante.setEnabled(false);
                System.out.println(nbCoups);
                this.dispose();
                FenetreVictoire f = new FenetreVictoire();
                f.setVisible(true);
                
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanneauGrille = new javax.swing.JPanel();
        Panneau_BoutonsVerticaux = new javax.swing.JPanel();
        Panneau_BoutonsHorizontals = new javax.swing.JPanel();
        Diagonale_Descandante = new javax.swing.JButton();
        Diagonale_Montante = new javax.swing.JButton();
        PanneauBoutonsDifficulte = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanneauGrille.setBackground(new java.awt.Color(204, 0, 204));
        PanneauGrille.setPreferredSize(new java.awt.Dimension(360, 360));

        javax.swing.GroupLayout PanneauGrilleLayout = new javax.swing.GroupLayout(PanneauGrille);
        PanneauGrille.setLayout(PanneauGrilleLayout);
        PanneauGrilleLayout.setHorizontalGroup(
            PanneauGrilleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        PanneauGrilleLayout.setVerticalGroup(
            PanneauGrilleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauGrille, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 400, 400));

        Panneau_BoutonsVerticaux.setBackground(new java.awt.Color(102, 0, 102));

        javax.swing.GroupLayout Panneau_BoutonsVerticauxLayout = new javax.swing.GroupLayout(Panneau_BoutonsVerticaux);
        Panneau_BoutonsVerticaux.setLayout(Panneau_BoutonsVerticauxLayout);
        Panneau_BoutonsVerticauxLayout.setHorizontalGroup(
            Panneau_BoutonsVerticauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 112, Short.MAX_VALUE)
        );
        Panneau_BoutonsVerticauxLayout.setVerticalGroup(
            Panneau_BoutonsVerticauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        getContentPane().add(Panneau_BoutonsVerticaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, -1, 400));

        Panneau_BoutonsHorizontals.setBackground(new java.awt.Color(102, 0, 102));

        javax.swing.GroupLayout Panneau_BoutonsHorizontalsLayout = new javax.swing.GroupLayout(Panneau_BoutonsHorizontals);
        Panneau_BoutonsHorizontals.setLayout(Panneau_BoutonsHorizontalsLayout);
        Panneau_BoutonsHorizontalsLayout.setHorizontalGroup(
            Panneau_BoutonsHorizontalsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        Panneau_BoutonsHorizontalsLayout.setVerticalGroup(
            Panneau_BoutonsHorizontalsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        getContentPane().add(Panneau_BoutonsHorizontals, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 400, 80));

        Diagonale_Descandante.setText("Diagonale Montante");
        Diagonale_Descandante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Diagonale_DescandanteActionPerformed(evt);
            }
        });
        getContentPane().add(Diagonale_Descandante, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 150, 80));

        Diagonale_Montante.setText("Diagonale Montante");
        Diagonale_Montante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Diagonale_MontanteActionPerformed(evt);
            }
        });
        getContentPane().add(Diagonale_Montante, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 510, 160, 80));

        PanneauBoutonsDifficulte.setBackground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout PanneauBoutonsDifficulteLayout = new javax.swing.GroupLayout(PanneauBoutonsDifficulte);
        PanneauBoutonsDifficulte.setLayout(PanneauBoutonsDifficulteLayout);
        PanneauBoutonsDifficulteLayout.setHorizontalGroup(
            PanneauBoutonsDifficulteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        PanneauBoutonsDifficulteLayout.setVerticalGroup(
            PanneauBoutonsDifficulteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauBoutonsDifficulte, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, -1, 290));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Diagonale_DescandanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Diagonale_DescandanteActionPerformed
        // TODO add your handling code here:
        this.grille.activerDiagonaleDescendante();
        nbCoups++;
        repaint();
        FinDePartie();
    }//GEN-LAST:event_Diagonale_DescandanteActionPerformed

    private void Diagonale_MontanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Diagonale_MontanteActionPerformed
        // TODO add your handling code here:
        this.grille.activerDiagonaleMontante();
        nbCoups++;
        repaint();
        FinDePartie();
    }//GEN-LAST:event_Diagonale_MontanteActionPerformed

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
            java.util.logging.Logger.getLogger(FenetrePrincipale.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FenetrePrincipale().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Diagonale_Descandante;
    private javax.swing.JButton Diagonale_Montante;
    private javax.swing.JPanel PanneauBoutonsDifficulte;
    private javax.swing.JPanel PanneauGrille;
    private javax.swing.JPanel Panneau_BoutonsHorizontals;
    private javax.swing.JPanel Panneau_BoutonsVerticaux;
    // End of variables declaration//GEN-END:variables
}
