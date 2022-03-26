package vue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FormAbsence extends JFrame {

    public FormAbsence() { // constructeur
        super("Gestion du personnel - Ajouter une Absence"); // titre donnÃ© Ã  la classse mere JFrame
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // setter ferme l'instance dans la mÃ©moire
        this.setSize( 600, 400); // setter taille de l'instance Connexion
        this.setLocationRelativeTo(null); // setter position par rapport au desktop
        
        
        JPanel contentPane = (JPanel) this.getContentPane();
        
        JButton btnButtonValiderAbsence = new JButton("Valider l'absence");
        btnButtonValiderAbsence.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		FormAbsence.this.setVisible(false);
        		Accueil accueil = new Accueil();
				accueil.setVisible(true);
        	}
        });
        btnButtonValiderAbsence.setBounds(83, 314, 182, 23);
        
        JButton btnButtonCloseAbsence = new JButton("Abandonner");
        btnButtonCloseAbsence.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		FormAbsence.this.setVisible(false);
        		Accueil accueil = new Accueil();
				accueil.setVisible(true);
        	}
        });
        btnButtonCloseAbsence.setBounds(312, 314, 190, 23);
        getContentPane().setLayout(null);
        getContentPane().add(btnButtonValiderAbsence);
        getContentPane().add(btnButtonCloseAbsence);
        
        JLabel lblMotif = new JLabel("Cochez le motif de l'absence");
        lblMotif.setBounds(23, 34, 231, 14);
        getContentPane().add(lblMotif);
        
        JCheckBox chckbxMaladie = new JCheckBox("Maladie");
        chckbxMaladie.setBounds(23, 53, 97, 23);
        getContentPane().add(chckbxMaladie);
        
        JCheckBox chckbxConges = new JCheckBox("Cong\u00E9s");
        chckbxConges.setBounds(133, 55, 97, 23);
        getContentPane().add(chckbxConges);
        
        JCheckBox chckbxCParental = new JCheckBox("Cong\u00E9s Parental");
        chckbxCParental.setBounds(244, 53, 137, 23);
        getContentPane().add(chckbxCParental);
        
        JCheckBox chckbxMotifFamilial = new JCheckBox("Motif Familial");
        chckbxMotifFamilial.setBounds(383, 53, 97, 23);
        getContentPane().add(chckbxMotifFamilial);
        
        JLabel lblPersonnelAbsent = new JLabel("Selectionnez le personnel concern\u00E9 par l'absence");
        lblPersonnelAbsent.setBounds(23, 117, 280, 14);
        getContentPane().add(lblPersonnelAbsent);
        
        JList listPersonnel = new JList();
        listPersonnel.setVisibleRowCount(1);
        listPersonnel.setBounds(23, 201, 260, -38);
        getContentPane().add(listPersonnel);
        
        JLabel lblDateDebutAbsence = new JLabel("Date de d\u00E9but");
        lblDateDebutAbsence.setBounds(23, 231, 137, 14);
        getContentPane().add(lblDateDebutAbsence);
        
        JLabel lblDateFinAbsence = new JLabel("Date de fin");
        lblDateFinAbsence.setBounds(276, 231, 89, 14);
        getContentPane().add(lblDateFinAbsence);

    }
}