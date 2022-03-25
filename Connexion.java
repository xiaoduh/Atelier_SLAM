import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;


public class Connexion extends JFrame {

    public Connexion() { // constructeur
        super("Gestion du personnel"); // titre donné à la classse mere JFrame
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // setter ferme l'instance dans la mémoire
        this.setSize( 1200, 800); // setter taille de l'instance Connexion
        this.setLocationRelativeTo(null); // setter position par rapport au desktop
        
        
        JPanel contentPane = (JPanel) this.getContentPane(); // récupération composant contentPane casté en JPanel
        contentPane.setLayout( new FlowLayout()); // allignement des composant
        contentPane.add( new JTextField( "Entrez votre identifiant")); // ajouter un JTextField
        contentPane.add( new JTextField( "Entrez votre mot de passe")); // ajouter un JTextField
        contentPane.add( new JButton( "Se connecter")); // ajouter un JButton

    }
    
    public static void main(String[] args) throws Exception{
        // Appliquer un look'n feel
        UIManager.setLookAndFeel(new NimbusLookAndFeel());


        // Start my window
        Connexion maConnexion = new Connexion();
        maConnexion.setVisible(true);


    }
}