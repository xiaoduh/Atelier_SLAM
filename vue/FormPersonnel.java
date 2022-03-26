package vue;

import javax.swing.JFrame;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.plaf.LabelUI;

public class FormPersonnel extends JFrame {

    public FormPersonnel() { // constructeur
        super("Gestion du personnel - Ajouter unpersonnel"); // titre donné à la classse mere JFrame
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // setter ferme l'instance dans la mémoire
        this.setSize( 600, 400); // setter taille de l'instance Connexion
        this.setLocationRelativeTo(null); // setter position par rapport au desktop
        
        
        JPanel contentPane = (JPanel) this.getContentPane(); // récupération composant contentPane casté en JPanel
        contentPane.setLayout( new FlowLayout()); // allignement des composant
        contentPane.add( new JTextField( "Nom")); // ajouter un JTextField
        contentPane.add( new JTextField( "Prénom")); // ajouter un JTextField
        contentPane.add( new JTextField( "Téléphone")); // ajouter un JTextField
        contentPane.add( new JTextField( "Email")); // ajouter un JTextField
        contentPane.add( new JComboBox<>()); 
        contentPane.add( new JComboBox<>()); 
        //DateTimeFormatter dateFormatter;
        //contentPane.add( new DateField(dateFormatter));
        contentPane.add( new JButton( "Valider le personnel")); // ajouter un JButton

    }
    
    
}
