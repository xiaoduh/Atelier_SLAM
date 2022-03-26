package modele;

import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

import vue.Accueil;
import vue.Connexion;
import vue.FormAbsence;
import vue.FormPersonnel;
import vue.Absence;


public class main {

    public static void main(String[] args) throws Exception{
        // Appliquer un look'n feel
        UIManager.setLookAndFeel(new NimbusLookAndFeel());


        // Start my window
        Connexion maConnexion = new Connexion();
        maConnexion.setVisible(true);

        Accueil monAccueil = new Accueil();
        monAccueil.setVisible(true);

        Absence lesAbsences = new Absence();
        lesAbsences.setVisible(true);

        FormAbsence ajouterAbsence = new FormAbsence();
        ajouterAbsence.setVisible(true);

        FormPersonnel ajouterPersonnel = new FormPersonnel();
        ajouterPersonnel.setVisible(true);
        


    }
    
}
