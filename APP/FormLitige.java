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

import acteurs.User;

public class FormLitige extends JFrame{

	 private static final long serialVersionUID = 1 ;
	    private JPanel contentPane;

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
	    public FormLitige (User user) {

	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setBounds(450, 190, 1014, 597);
	        setResizable(false);
	        contentPane = new JPanel();
	        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	        setContentPane(contentPane);
	        contentPane.setLayout(null);
	        
	        
	        
	        //============================================================================
	        //======== FORMULAIRE litige ===========================================
	        //============================================================================
			
			JLabel lblAuteur = new JLabel("Auteur");
        	lblAuteur.setForeground(Color.BLACK);
        	lblAuteur.setBackground(Color.CYAN);
        	lblAuteur.setFont(new Font("Tahoma", Font.PLAIN, 31));
        	lblAuteur.setBounds(250, 286, 193, 52);
			contentPane.add(lblAuteur);
			
			JLabel lblAgent = new JLabel("Agent");
        	lblAgent.setForeground(Color.BLACK);
        	lblAgent.setBackground(Color.CYAN);
        	lblAgent.setFont(new Font("Tahoma", Font.PLAIN, 31));
        	lblAgent.setBounds(250, 286, 193, 52);
        	contentPane.add(lblAgent);
			
			JLabel lblTitre = new JLabel("Titre");
        	lblTitre.setForeground(Color.BLACK);
        	lblTitre.setBackground(Color.CYAN);
        	lblTitre.setFont(new Font("Tahoma", Font.PLAIN, 31));
        	lblTitre.setBounds(250, 286, 193, 52);
			contentPane.add(lblTitre);
			
			JLabel lblCommentaire = new JLabel("Commentaire");
        	lblCommentaire.setForeground(Color.BLACK);
        	lblCommentaire.setBackground(Color.CYAN);
        	lblCommentaire.setFont(new Font("Tahoma", Font.PLAIN, 31));
        	lblCommentaire.setBounds(250, 286, 193, 52);
			contentPane.add(lblCommentaire);

// todo -> inclure des fichiers 

			JLabel lblScore = new JLabel("Score");
        	lblScore.setForeground(Color.BLACK);
        	lblScore.setBackground(Color.CYAN);
        	lblScore.setFont(new Font("Tahoma", Font.PLAIN, 31));
        	lblScore.setBounds(250, 286, 193, 52);
			contentPane.add(lblScore);


			// BOUTONS
			JButton btnReset = new JButton("Réinitialiser");
	        btnReset.setForeground(new Color(0, 0, 0));
	        btnReset.setBackground(UIManager.getColor("Button.disabledForeground"));
	        btnReset.setFont(new Font("Tahoma", Font.PLAIN, 39));
	        btnReset.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {

	            }
	        });

			btnReset.setBounds(50, 20, 250, 50);
			contentPane.add(btnReset);

			JButton btnSumbit = new JButton("Valider");
	        btnSumbit.setForeground(new Color(0, 0, 0));
	        btnSumbit.setBackground(UIManager.getColor("Button.disabledForeground"));
	        btnSumbit.setFont(new Font("Tahoma", Font.PLAIN, 39));
	        btnSumbit.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {

	            }
	        });
	        btnSumbit.setBounds(50, 20, 250, 50);
			contentPane.add(btnSumbit);

	    }        
}