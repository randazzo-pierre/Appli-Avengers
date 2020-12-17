package APP;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;

import acteurs.User;
import actions.Satisfaction;
import actions.Mission;
import java.sql.*;
import util.* ;

public class FormulaireSatisfaction extends JFrame{

	 private static final long serialVersionUID = 1 ;
		private JPanel contentPane;
		private JTextField textField;
		private JLabel label;
		

		/**
		 * Launch the application.
		 * @param args
		 */
	    public static void main(String[] args) {
	        EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                try {
	                    UserHome frame = new UserHome();
	                    frame.setVisible(true);
	                } catch (Exception e) {
	                    e.printStackTrace();
	                }
	            }
	        });
		}
		

	    /**
		 * Create the frame.
		 * @param user
		 */
	    public FormulaireSatisfaction (User user, dbUtil utl) {
		
			

	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setBounds(450, 190, 1014, 597);
	        setResizable(false);
	        contentPane = new JPanel();
	        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	        setContentPane(contentPane);
	        contentPane.setLayout(null);
	        
	        
	        
	        //============================================================================
	        //======== FORMULAIRE SATISFACTION ===========================================
	        //============================================================================
			
			// Titre page
			JLabel lblForm = new JLabel("Formulaire de satisfaction");
			lblForm.setForeground(Color.BLACK);
			lblForm.setFont(new Font("Times New Roman", Font.PLAIN, 46));
			lblForm.setBounds(250, 5, 500, 93);
			contentPane.add(lblForm);

			//Choix de la mission :
			try{
				Connection cnx = utl.dbConnect() ;
				ResultSet rs = utl.dbRead(cnx, "SELECT * FROM INCIDENT") ;
				JComboBox jc = new JComboBox() ;
				while (rs.next()) {  

					jc.addItem(rs.getString("ID_I"));  
				}
				
				jc.setBounds(100, 75, 193, 52);
				contentPane.add(jc) ;
			} catch (SQLException e) {
				System.out.println(e);
			}
	

			// titre satisfaction
		/* 	JLabel lblTitre = new JLabel("Titre");
        	lblTitre.setForeground(Color.BLACK);
        	lblTitre.setBackground(Color.CYAN);
        	lblTitre.setFont(new Font("Tahoma", Font.PLAIN, 31));
        	lblTitre.setBounds(100, 75, 193, 52);
			contentPane.add(lblTitre); */

			// zone texte titre
			JTextField textFieldTitre = new JTextField();
    		textFieldTitre.setFont(new Font("Tahoma", Font.PLAIN, 32));
    		textFieldTitre.setBounds(310, 75, 550, 50);
    		contentPane.add(textFieldTitre);
			textFieldTitre.setColumns(10);

		

			//nom auteur
			JLabel lblAuteur = new JLabel("Auteur");
        	lblAuteur.setForeground(Color.BLACK);
        	lblAuteur.setBackground(Color.CYAN);
        	lblAuteur.setFont(new Font("Tahoma", Font.PLAIN, 31));
        	lblAuteur.setBounds(100, 150, 193, 52);
			contentPane.add(lblAuteur);

			//zone de texte auteur
			JTextField textFieldAuteur = new JTextField();
    		textFieldAuteur.setFont(new Font("Tahoma", Font.PLAIN, 32));
    		textFieldAuteur.setBounds(310, 150, 550, 50);
    		contentPane.add(textFieldAuteur);
			textFieldAuteur.setColumns(10);

			//nom agent
			JLabel lblAgent = new JLabel("Agent");
        	lblAgent.setForeground(Color.BLACK);
        	lblAgent.setBackground(Color.CYAN);
        	lblAgent.setFont(new Font("Tahoma", Font.PLAIN, 31));
        	lblAgent.setBounds(100, 225, 193, 52);
			contentPane.add(lblAgent);
			
			//zone texte agent			
			JTextField textFieldAgent = new JTextField();
    		textFieldAgent.setFont(new Font("Tahoma", Font.PLAIN, 32));
    		textFieldAgent.setBounds(310, 225, 550, 50);
    		contentPane.add(textFieldAgent);
			textFieldAgent.setColumns(10);

			//libelle commentaire
			JLabel lblCommentaire = new JLabel("Commentaire");
        	lblCommentaire.setForeground(Color.BLACK);
        	lblCommentaire.setBackground(Color.CYAN);
        	lblCommentaire.setFont(new Font("Tahoma", Font.PLAIN, 31));
        	lblCommentaire.setBounds(100, 300, 193, 52);
			contentPane.add(lblCommentaire);

			// zone de texte commentaire
			JTextField textFieldCommentaire = new JTextField();
    		textFieldCommentaire.setFont(new Font("Tahoma", Font.PLAIN, 32));
    		textFieldCommentaire.setBounds(310, 300, 550, 50);
    		contentPane.add(textFieldCommentaire);
			textFieldCommentaire.setColumns(10);

			//lieblle score
			JLabel lblScore = new JLabel("Score");
        	lblScore.setForeground(Color.BLACK);
        	lblScore.setBackground(Color.CYAN);
        	lblScore.setFont(new Font("Tahoma", Font.PLAIN, 31));
        	lblScore.setBounds(100, 375, 193, 52);
			contentPane.add(lblScore);

			//zone de texte score
			JTextField textFieldScore = new JTextField();
    		textFieldScore.setFont(new Font("Tahoma", Font.PLAIN, 32));
    		textFieldScore.setBounds(250, 375, 550, 50);
    		contentPane.add(textFieldScore);
			textFieldScore.setColumns(10);

			//libelle fichier
			JLabel lblFichier = new JLabel("Fichier");
        	lblFichier.setForeground(Color.BLACK);
        	lblFichier.setBackground(Color.CYAN);
        	lblFichier.setFont(new Font("Tahoma", Font.PLAIN, 31));
        	lblFichier.setBounds(600, 375, 193, 52);
			contentPane.add(lblFichier);

			// BOUTONS
			/* JButton btnReset = new JButton("Reinitialiser");
	        btnReset.setForeground(new Color(0, 0, 0));
	        btnReset.setBackground(UIManager.getColor("Button.disabledForeground"));
	        btnReset.setFont(new Font("Tahoma", Font.PLAIN, 39));
	        btnReset.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {

	            }
	        });

			btnReset.setBounds(150, 460, 350, 50);
			contentPane.add(btnReset); */

			JButton button2 = new JButton("Retour");
        button2.setBackground(UIManager.getColor("Button.disabledForeground"));
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
				dbUtil utl = new dbUtil() ;
                Dashboard bo = new Dashboard(user, utl);
                bo.setTitle("Dashboard " + user.role);
                bo.setVisible(true);
            }
        });
        button2.setFont(new Font("Tahoma", Font.PLAIN, 35));
        button2.setBounds(150, 460, 350, 50);
        contentPane.add(button2);

			JButton btnSumbit = new JButton("Valider");
	        btnSumbit.setForeground(new Color(0, 0, 0));
	        btnSumbit.setBackground(UIManager.getColor("Button.disabledForeground"));
	        btnSumbit.setFont(new Font("Tahoma", Font.PLAIN, 39));
	        btnSumbit.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
					// Au clique sur le boutton Valider
				// On récupère le texte du formulaire de satisfaction :
				
				// On récupère le titre satisfaction
				
				// On récupère le nom auteur

				// On recupère le nom agent

				//On recupère le commentaire

				//On recupère le score

				if(textFieldTitre.getText().isEmpty() || textFieldAuteur.getText().isEmpty() || 
				textFieldCommentaire.getText().isEmpty() || textFieldScore.getText().isEmpty()){
					//error
					JOptionPane.showMessageDialog(btnSumbit, "Vous devez completer tous les champs");
				}  else {
					String inputTitre = textFieldTitre.getText();
					String inputAuteur = textFieldAuteur.getText();

	            }
			}});
	        btnSumbit.setBounds(550, 460, 350, 50);
			contentPane.add(btnSumbit);

	    }
}
