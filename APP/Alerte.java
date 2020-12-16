package APP;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import util.Country;

import acteurs.User;

public class Alerte extends JFrame {

	 private static final long serialVersionUID = 1 ;
		private JPanel contentPane;
		private JLabel label;
		private JTextField textFieldQuoi;
		private JComboBox listePays;
		private JTextField textFieldZip;

	    /**
	     * Launch the application.
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
*/
	    
	    public Alerte (User user) {

	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setBounds(450, 190, 1014, 597);
	        setResizable(false);
	        contentPane = new JPanel();
	        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	        setContentPane(contentPane);
	        contentPane.setLayout(null);
	        
	        
	        
	        //============================================================================
	        //========CIVIL & ORGANISATION & HERO ========================================
	        //============================================================================
		   
			//Titre page
			JLabel lblNewLabel = new JLabel("Alerte");
       		lblNewLabel.setForeground(Color.BLACK);
        	lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 46));
        	lblNewLabel.setBounds(423, 13, 273, 93);
			contentPane.add(lblNewLabel);


			//zone texte ce passe quoi
			textFieldQuoi = new JTextField();
        	textFieldQuoi.setFont(new Font("Tahoma", Font.PLAIN, 32));
        	textFieldQuoi.setBounds(481, 170, 281, 68);
        	contentPane.add(textFieldQuoi);
			textFieldQuoi.setColumns(10);
			
			//liste des pays
			//String[] pays = {"Europe", "Afrique", "Amerique", "Russie", "Inde", "Australie"};
			//JComboBox listePays = new JComboBox(pays);			
        //	listePays.setFont(new Font("Tahoma", Font.PLAIN, 32));
        	//listePays.setBounds(481, 170, 281, 68);
			//contentPane.add(listePays);
			Country[] listCountry = createCountryList();
      		comboCountry = new JComboBox<>(listCountry);
			//listePays.setColumns(10);

			
			//zone de texte code zip
			textFieldZip = new JTextField();
        	textFieldZip.setFont(new Font("Tahoma", Font.PLAIN, 32));
        	textFieldZip.setBounds(481, 286, 281, 68);
        	contentPane.add(textFieldZip);
			textFieldZip.setColumns(10);
			
			//libelle description
			JLabel lblCepasseQuoi = new JLabel("Ce passe quoi");
        	lblCepasseQuoi.setBackground(Color.BLACK);
        	lblCepasseQuoi.setForeground(Color.BLACK);
        	lblCepasseQuoi.setFont(new Font("Tahoma", Font.PLAIN, 31));
        	lblCepasseQuoi.setBounds(250, 166, 193, 52);
			contentPane.add(lblCepasseQuoi);
			

			//libelle pays
			JLabel lblPays = new JLabel("C'est ou ?");
        	lblPays.setBackground(Color.BLACK);
        	lblPays.setForeground(Color.BLACK);
        	lblPays.setFont(new Font("Tahoma", Font.PLAIN, 31));
        	lblPays.setBounds(250, 286, 193, 52);
			contentPane.add(lblPays);
			
			//libelle code zip
			JLabel lblZip = new JLabel("C'est ou exactement ?");
        	lblZip.setBackground(Color.BLACK);
        	lblZip.setForeground(Color.BLACK);
        	lblZip.setFont(new Font("Tahoma", Font.PLAIN, 31));
        	lblZip.setBounds(50, 320, 193, 52);
        	contentPane.add(lblZip);

	        
	        JButton btnNewButton = new JButton("Envoyer");
	        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 26));
        	btnNewButton.setBounds(545, 392, 162, 73);
        	btnNewButton.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {

	            }
	        });
	        btnNewButton.setBounds(50, 20, 250, 50);
			contentPane.add(btnNewButton);
			
			label = new JLabel("");
        	label.setBounds(0, 0, 1008, 562);
        	contentPane.add(label);
	        
		}  
		public JComboBox getListePays(){
			return listePays;
		}      
}
