package vue;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
//import javax.swing.JTable;

public class Absence extends JFrame {



        public Absence() { // constructeur
            super("Gestion du personnel - Absence"); // titre donné à la classse mere JFrame
            this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // setter ferme l'instance dans la mémoire
            this.setSize( 1600, 1000); // setter taille de l'instance Connexion
            this.setLocationRelativeTo(null); // setter position par rapport au desktop
            
            
            JPanel contentPane = (JPanel) this.getContentPane(); // récupération composant contentPane casté en JPanel
            contentPane.setLayout( new FlowLayout()); // allignement des composant
            contentPane.add( new JButton( "Ajouter une absence")); // ajouter un JButton
            contentPane.add( new JButton( "Modifier une absence")); // ajouter un JButton
            contentPane.add( new JButton( "Supprimer une absence")); // ajouter un JButton
            //contentPane.add( new JTable(5,9));
    
        }
        
    
}
