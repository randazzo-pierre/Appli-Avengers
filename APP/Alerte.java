package APP;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import acteurs.User;

import util.Country;

public class Alerte extends JFrame {

	 private static final long serialVersionUID = 1 ;
		private JPanel contentPane;
		private JLabel label;
		private JTextField textFieldQuoi;
		private JTextField textFieldPays;
		private JTextField textFieldZip;

	    /**
	     * Launch the application.
		 *  @param args
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
		
		private Country[] createCountryList() {
			String[] countryCodes = Locale.getISOCountries();
			Country[] listCountry = new Country[countryCodes.length];
		 
			for (int i = 0; i < countryCodes.length; i++) {
				Locale locale = new Locale("", countryCodes[i]);
				String code = locale.getCountry();
				String name = locale.getDisplayCountry();
		 
				listCountry[i] = new Country(code, name);
			}
		 
			Arrays.sort(listCountry);
		 
			return listCountry;
		}


/**
* Create the frame.
* @param user
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
        	lblNewLabel.setBounds(423, 4, 273, 93);
			contentPane.add(lblNewLabel);

			//libelle description
			JLabel lblCepasseQuoi = new JLabel("Ce passe quoi ?");
        	lblCepasseQuoi.setBackground(Color.BLACK);
        	lblCepasseQuoi.setForeground(Color.BLACK);
        	lblCepasseQuoi.setFont(new Font("Tahoma", Font.PLAIN, 18));
        	lblCepasseQuoi.setBounds(85, 100, 193, 52);
			contentPane.add(lblCepasseQuoi);


			//zone texte ce passe quoi
			textFieldQuoi = new JTextField();
        	textFieldQuoi.setFont(new Font("Tahoma", Font.PLAIN, 18));
        	textFieldQuoi.setBounds(310, 100, 550, 50);
        	contentPane.add(textFieldQuoi);
			textFieldQuoi.setColumns(10);

			//libelle pays
			JLabel lblPays = new JLabel("Quel pays ?");
        	lblPays.setBackground(Color.BLACK);
        	lblPays.setForeground(Color.BLACK);
        	lblPays.setFont(new Font("Tahoma", Font.PLAIN, 18));
        	lblPays.setBounds(85, 200, 193, 52);
			contentPane.add(lblPays);
			
			//liste des pays
			/* String[] pays = {"Europe", "Afrique", "Amerique", "Russie", "Inde", "Australie"};
			JComboBox listePays = new JComboBox(pays);			
        	listePays.setFont(new Font("Tahoma", Font.PLAIN, 32));
        	listePays.setBounds(481, 170, 281, 68);
			contentPane.add(listePays); */
			Country[] listCountry = createCountryList();
			JComboBox<Country> comboCountry = new JComboBox<>(listCountry);
			comboCountry.setBounds(310, 200, 550, 50);
			contentPane.add(comboCountry) ;
			
			//zone de texte pays
			/* textFieldPays = new JTextField();
        	textFieldPays.setFont(new Font("Tahoma", Font.PLAIN, 18));
        	textFieldPays.setBounds(310, 200, 550, 50);
        	contentPane.add(textFieldPays);
			textFieldPays.setColumns(10); */
				
			//libelle code zip
			JLabel lblZip = new JLabel("C'est ou exactement ?");
        	lblZip.setBackground(Color.BLACK);
        	lblZip.setForeground(Color.BLACK);
        	lblZip.setFont(new Font("Tahoma", Font.PLAIN, 18));
        	lblZip.setBounds(85, 300, 193, 52);
        	contentPane.add(lblZip);
			
			//zone de texte code zip
			textFieldZip = new JTextField();
        	textFieldZip.setFont(new Font("Tahoma", Font.PLAIN, 18));
        	textFieldZip.setBounds(310, 300, 550, 50);
        	contentPane.add(textFieldZip);
			textFieldZip.setColumns(10);
			
			// bouton
				        
	        JButton btnEnvoyer = new JButton("Envoyer");
	        btnEnvoyer.setForeground(new Color(0, 0, 0));
	        btnEnvoyer.setBackground(UIManager.getColor("Button.disabledForeground"));
	        btnEnvoyer.setFont(new Font("Tahoma", Font.PLAIN, 25));
	        btnEnvoyer.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {

	            }
	        });
	        btnEnvoyer.setBounds(550, 392, 162, 73);
			contentPane.add(btnEnvoyer);
			
			label = new JLabel("");
        	label.setBounds(0, 0, 1008, 562);
        	contentPane.add(label);
	        
		}  
		 
}
