/*
SARINENA, TDC , LightOff_version_console, 25/10/2023
 */
package lightoff_sarinena_version_console;

/**
 *
 * @author pierr
 */
public class LightOff_SARINENA_version_console {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        CelluleLumineuse cellule_1 = new CelluleLumineuse();
        CelluleLumineuse cellule_2 = new CelluleLumineuse();

        cellule_1.estEteint();
        cellule_2.activerCellule();
        System.out.println(cellule_1);
        System.out.println(cellule_2);
        cellule_1.activerCellule();
        cellule_2.eteindreCellule();
        System.out.println(cellule_1);
        System.out.println(cellule_2);
        
        GrilleDeJeu GrilleDeCellules = new GrilleDeJeu(7, 7);
        /*
        System.out.println(GrilleDeCellules.toString());
        GrilleDeCellules.activerDiagonaleDescendante();
        System.out.println(GrilleDeCellules.toString());
        GrilleDeCellules.activerDiagonaleMontante();
        System.out.println(GrilleDeCellules.toString());
        GrilleDeCellules.eteindreToutesLesCellules();
        */
        System.out.println(GrilleDeCellules.toString());
    }
    
}
