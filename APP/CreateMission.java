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

public class CreateMission extends JFrame {

    private static final long serialVersionUID = 1;
    private JPanel contentPane;

    /**
     * Launch the application.
     * 
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
     * 
     * @param user
     */
    public CreateMission(User user) {

	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setBounds(550, 300, 1280, 1080);
	        setResizable(false);
	        contentPane = new JPanel();
	        contentPane.setBorder(new EmptyBorder(6, 6, 6, 6));
	        setContentPane(contentPane);
	        contentPane.setLayout(null);
	        
	        
	        
	        //============================================================================
	        //======== CREATE MISSION ===========================================
	        //============================================================================
			
			JLabel lblForm = new JLabel("CREATION DE MISSION");
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

			JLabel lblAuteur = new JLabel("nature");
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
		
			JLabel lbldatedeb = new JLabel("datedeb");
        	lbldatedeb.setForeground(Color.BLACK);
        	lbldatedeb.setBackground(Color.CYAN);
        	lbldatedeb.setFont(new Font("Tahoma", Font.PLAIN, 31));
        	lbldatedeb.setBounds(100, 225, 193, 52);
        	contentPane.add(lbldatedeb);
			
			JTextField textFielddatedeb = new JTextField();
    		textFielddatedeb.setFont(new Font("Tahoma", Font.PLAIN, 32));
    		textFielddatedeb.setBounds(310, 225, 550, 50);
    		contentPane.add(textFielddatedeb);
            textFielddatedeb.setColumns(10);
            
            JLabel lbldatefin = new JLabel("datefin");
        	lbldatefin.setForeground(Color.BLACK);
        	lbldatefin.setBackground(Color.CYAN);
        	lbldatefin.setFont(new Font("Tahoma", Font.PLAIN, 31));
        	lbldatefin.setBounds(100, 325, 193, 52);
        	contentPane.add(lbldatefin);
			
			JTextField textFielddatefin = new JTextField();
    		textFielddatefin.setFont(new Font("Tahoma", Font.PLAIN, 32));
    		textFielddatefin.setBounds(310, 310, 550, 50);
    		contentPane.add(textFielddatefin);
			textFielddatefin.setColumns(10);

			JLabel lblCommentaire = new JLabel("Leader");
        	lblCommentaire.setForeground(Color.BLACK);
        	lblCommentaire.setBackground(Color.CYAN);
        	lblCommentaire.setFont(new Font("Tahoma", Font.PLAIN, 31));
        	lblCommentaire.setBounds(100, 400, 193, 52);
			contentPane.add(lblCommentaire);

			JTextField textFieldCommentaire = new JTextField();
    		textFieldCommentaire.setFont(new Font("Tahoma", Font.PLAIN, 32));
    		textFieldCommentaire.setBounds(310, 400, 600, 50);
    		contentPane.add(textFieldCommentaire);
            textFieldCommentaire.setColumns(10);
            
            JLabel lblGravite = new JLabel("Gravité");
        	lblGravite.setForeground(Color.BLACK);
        	lblGravite.setBackground(Color.CYAN);
        	lblGravite.setFont(new Font("Tahoma", Font.PLAIN, 31));
        	lblGravite.setBounds(100, 475, 193, 52);
			contentPane.add(lblGravite);

			JTextField textFieldGravite = new JTextField();
    		textFieldGravite.setFont(new Font("Tahoma", Font.PLAIN, 32));
    		textFieldGravite.setBounds(310, 475, 600, 50);
    		contentPane.add(textFieldGravite);
            textFieldGravite.setColumns(10);
            
            JLabel lblUrgence = new JLabel("Urgence");
        	lblUrgence.setForeground(Color.BLACK);
        	lblUrgence.setBackground(Color.CYAN);
        	lblUrgence.setFont(new Font("Tahoma", Font.PLAIN, 31));
        	lblUrgence.setBounds(100, 550, 193, 52);
			contentPane.add(lblUrgence);

			JTextField textFieldUrgence = new JTextField();
    		textFieldUrgence.setFont(new Font("Tahoma", Font.PLAIN, 32));
    		textFieldUrgence.setBounds(310, 550, 600, 50);
    		contentPane.add(textFieldUrgence);
			textFieldUrgence.setColumns(10);
            
    

			JButton btnSumbit = new JButton("Valider");
	        btnSumbit.setForeground(new Color(0, 0, 0));
	        btnSumbit.setBackground(UIManager.getColor("Button.disabledForeground"));
	        btnSumbit.setFont(new Font("Tahoma", Font.PLAIN, 39));
	        btnSumbit.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {

	            }
	        });
	        btnSumbit.setBounds(250, 600, 350, 50);
			contentPane.add(btnSumbit);

	    }        
}
