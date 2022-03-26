package vue;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JLabel;

public class Accueil extends JFrame {
	private JTable table;


        public Accueil() { // constructeur
            super("Gestion du personnel - Page accueil"); // titre donnÃ© Ã  la classse mere JFrame
            this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // setter ferme l'instance dans la mÃ©moire
            this.setSize( 400, 400); // setter taille de l'instance Connexion
            this.setLocationRelativeTo(null); // setter position par rapport au desktop
            
            
            JPanel contentPane = (JPanel) this.getContentPane();
            getContentPane().setLayout(null);
            
            JButton btnButton = new JButton("Ajouter du personnel");
            btnButton.addActionListener(new ActionListener() {
            	public void actionPerformed(ActionEvent e) {
            		FormPersonnel ajouterPersonnel = new FormPersonnel();
            		ajouterPersonnel.setVisible(true);
    				// On cache l'ancienne fenêtre.
    				Accueil.this.setVisible(false);
            	}
            });
            btnButton.setBounds(10, 51, 144, 23);
            getContentPane().add(btnButton);
            
            JButton btnButton2 = new JButton("Ajouter une absence");
            btnButton2.addActionListener(new ActionListener() {
            	public void actionPerformed(ActionEvent e) {
            		FormAbsence ajouterAbsence = new FormAbsence();
            		ajouterAbsence.setVisible(true);
    				// On cache l'ancienne fenêtre.
    				Accueil.this.setVisible(false);
            	}
            });
            btnButton2.setBounds(230, 51, 144, 23);
            getContentPane().add(btnButton2);
            
            table = new JTable();
            table.setBounds(10, 85, 364, 265);
            getContentPane().add(table);
            
            JLabel lblWelcome = new JLabel("Bonjour, vous \u00EAtes connect\u00E9. ");
            lblWelcome.setBounds(10, 11, 168, 14);
            getContentPane().add(lblWelcome);

    
        }
}
