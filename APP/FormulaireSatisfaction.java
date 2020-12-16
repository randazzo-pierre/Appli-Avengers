package APP;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;

import acteurs.User;

public class FormulaireSatisfaction extends JFrame{

	 private static final long serialVersionUID = 1 ;
		private JPanel contentPane;
		private JTextField textField;
		

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
	    public FormulaireSatisfaction (User user) {

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
			
			JLabel lblForm = new JLabel("Formulaire de satisfaction");
			lblForm.setForeground(Color.BLACK);
			lblForm.setFont(new Font("Times New Roman", Font.PLAIN, 46));
			lblForm.setBounds(250, 5, 500, 93);
			contentPane.add(lblForm);


			JLabel lblTitre = new JLabel("Titre");
        	lblTitre.setForeground(Color.BLACK);
        	lblTitre.setBackground(Color.CYAN);
        	lblTitre.setFont(new Font("Tahoma", Font.PLAIN, 31));
        	lblTitre.setBounds(100, 75, 193, 52);
			contentPane.add(lblTitre);

			JTextField textFieldTitre = new JTextField();
    		textFieldTitre.setFont(new Font("Tahoma", Font.PLAIN, 32));
    		textFieldTitre.setBounds(310, 75, 550, 50);
    		contentPane.add(textFieldTitre);
			textFieldTitre.setColumns(10);

			JLabel lblAuteur = new JLabel("Auteur");
        	lblAuteur.setForeground(Color.BLACK);
        	lblAuteur.setBackground(Color.CYAN);
        	lblAuteur.setFont(new Font("Tahoma", Font.PLAIN, 31));
        	lblAuteur.setBounds(100, 150, 193, 52);
			contentPane.add(lblAuteur);
			
			JTextField textFieldAuteur = new JTextField();
    		textFieldAuteur.setFont(new Font("Tahoma", Font.PLAIN, 32));
    		textFieldAuteur.setBounds(310, 150, 550, 50);
    		contentPane.add(textFieldAuteur);
			textFieldAuteur.setColumns(10);
		
			JLabel lblAgent = new JLabel("Agent");
        	lblAgent.setForeground(Color.BLACK);
        	lblAgent.setBackground(Color.CYAN);
        	lblAgent.setFont(new Font("Tahoma", Font.PLAIN, 31));
        	lblAgent.setBounds(100, 225, 193, 52);
        	contentPane.add(lblAgent);
			
			JTextField textFieldAgent = new JTextField();
    		textFieldAgent.setFont(new Font("Tahoma", Font.PLAIN, 32));
    		textFieldAgent.setBounds(310, 225, 550, 50);
    		contentPane.add(textFieldAgent);
			textFieldAgent.setColumns(10);

			JLabel lblCommentaire = new JLabel("Commentaire");
        	lblCommentaire.setForeground(Color.BLACK);
        	lblCommentaire.setBackground(Color.CYAN);
        	lblCommentaire.setFont(new Font("Tahoma", Font.PLAIN, 31));
        	lblCommentaire.setBounds(100, 300, 193, 52);
			contentPane.add(lblCommentaire);

			JTextField textFieldCommentaire = new JTextField();
    		textFieldCommentaire.setFont(new Font("Tahoma", Font.PLAIN, 32));
    		textFieldCommentaire.setBounds(310, 300, 550, 50);
    		contentPane.add(textFieldCommentaire);
			textFieldCommentaire.setColumns(10);

			JLabel lblScore = new JLabel("Score");
        	lblScore.setForeground(Color.BLACK);
        	lblScore.setBackground(Color.CYAN);
        	lblScore.setFont(new Font("Tahoma", Font.PLAIN, 31));
        	lblScore.setBounds(100, 375, 193, 52);
			contentPane.add(lblScore);

			JTextField textFieldScore = new JTextField();
    		textFieldScore.setFont(new Font("Tahoma", Font.PLAIN, 32));
    		textFieldScore.setBounds(250, 375, 550, 50);
    		contentPane.add(textFieldScore);
			textFieldScore.setColumns(10);

			JLabel lblFichier = new JLabel("Fichier");
        	lblFichier.setForeground(Color.BLACK);
        	lblFichier.setBackground(Color.CYAN);
        	lblFichier.setFont(new Font("Tahoma", Font.PLAIN, 31));
        	lblFichier.setBounds(600, 375, 193, 52);
			contentPane.add(lblFichier);
			// BOUTONS
			JButton btnReset = new JButton("Reinitialiser");
	        btnReset.setForeground(new Color(0, 0, 0));
	        btnReset.setBackground(UIManager.getColor("Button.disabledForeground"));
	        btnReset.setFont(new Font("Tahoma", Font.PLAIN, 39));
	        btnReset.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {

	            }
	        });

			btnReset.setBounds(150, 460, 350, 50);
			contentPane.add(btnReset);

			JButton btnSumbit = new JButton("Valider");
	        btnSumbit.setForeground(new Color(0, 0, 0));
	        btnSumbit.setBackground(UIManager.getColor("Button.disabledForeground"));
	        btnSumbit.setFont(new Font("Tahoma", Font.PLAIN, 39));
	        btnSumbit.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {

	            }
	        });
	        btnSumbit.setBounds(550, 460, 350, 50);
			contentPane.add(btnSumbit);

	    }        
}
