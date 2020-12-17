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
import javax.swing.JComboBox;

import acteurs.User;
import actions.Mission;
import util.Country;
import java.sql.*;
import java.util.Arrays;
import java.util.Locale;

import util.*;

public class CreateMission extends JFrame {

	private static final long serialVersionUID = 1;
	private JPanel contentPane;
	private JTextField textFieldZip;

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
	 * 
	 * @param user
	 */
	public CreateMission(User user, dbUtil utl) {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450, 190, 1014, 597);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(6, 6, 6, 6));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// ============================================================================
		// ======== CREATE MISSION ===========================================
		// ============================================================================

		// Titre page
		JLabel lblForm = new JLabel("CREATION DE MISSION");
		lblForm.setForeground(Color.BLACK);
		lblForm.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		lblForm.setBounds(250, 5, 500, 93);
		contentPane.add(lblForm);

		// libelle titre mission
		JLabel lblTitre = new JLabel("Titre");
		lblTitre.setForeground(Color.BLACK);
		lblTitre.setBackground(Color.CYAN);
		lblTitre.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTitre.setBounds(100, 75, 193, 52);
		contentPane.add(lblTitre);

		//zone de texte titre mission
		JTextField textFieldTitre = new JTextField();
		textFieldTitre.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldTitre.setBounds(310, 75, 550, 35);
		contentPane.add(textFieldTitre);
		textFieldTitre.setColumns(10);

		// libelle description
		JLabel lblDescript = new JLabel("Description");
		lblDescript.setForeground(Color.BLACK);
		lblDescript.setBackground(Color.CYAN);
		lblDescript.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDescript.setBounds(100, 125, 193, 52);
		contentPane.add(lblDescript);

		//zone de texte description mission

		JTextField textFieldDescript = new JTextField();
		textFieldDescript.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldDescript.setBounds(310, 125, 550, 35);
		contentPane.add(textFieldDescript);
		textFieldDescript.setColumns(10);

		//libelle pays

		JLabel lblPays = new JLabel("Pays");
		lblPays.setForeground(Color.BLACK);
		lblPays.setBackground(Color.CYAN);
		lblPays.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPays.setBounds(100, 175, 193, 52);
		contentPane.add(lblPays);

		//liste des pays

		Country[] listCountry = createCountryList();
		JComboBox<Country> comboCountry = new JComboBox<>(listCountry);
		comboCountry.setBounds(310, 175, 550, 35);
		contentPane.add(comboCountry);

		// libelle code zip
		JLabel lblZip = new JLabel("Code postal");
		lblZip.setBackground(Color.BLACK);
		lblZip.setForeground(Color.BLACK);
		lblZip.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblZip.setBounds(100, 225, 193, 52);
		contentPane.add(lblZip);

		// zone de texte code zip
		textFieldZip = new JTextField();
		textFieldZip.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldZip.setBounds(310, 225, 550, 35);
		contentPane.add(textFieldZip);
		textFieldZip.setColumns(10);

		//libelle héros

		JLabel lblLeader = new JLabel("Héros");
		lblLeader.setForeground(Color.BLACK);
		lblLeader.setBackground(Color.CYAN);
		lblLeader.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblLeader.setBounds(100, 275, 193, 52);
		contentPane.add(lblLeader);

		//ici récup liste des héros
		//choix du héros
		try{
			Connection cnx = utl.dbConnect() ;
			ResultSet rs = utl.dbRead(cnx, "SELECT * FROM HEROS") ;
			JComboBox jc = new JComboBox() ;
			while (rs.next()) {  
				String nomHero = rs.getString("TITREH") ;
				jc.addItem(nomHero);  
			}
			jc.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					e.getSource();
				//	String titre=(String) jc.getSelectedItem();
					}
			});
			jc.setBounds(310, 275, 550, 35);
				contentPane.add(jc) ;

		//libelle coéquipier

		JLabel lblassigner = new JLabel("Coéquipier");
		lblassigner.setForeground(Color.BLACK);
		lblassigner.setBackground(Color.CYAN);
		lblassigner.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblassigner.setBounds(100, 325, 193, 52);
		contentPane.add(lblassigner);

		//ici recup liste héros avec le précédent sélectionné en moins
		ResultSet rs1 = utl.dbRead(cnx, "SELECT * FROM HEROS") ;
		JComboBox jc1 = new JComboBox() ;
		while (rs1.next()) {  
			//int id=rs.getInt("ID_M") ;
			String nomHero2 = rs1.getString("TITREH") ;
			//Object[] itemData = new Object[] {id, titreMission};
			jc1.addItem(nomHero2);  
		//	utl.dbKill(cnx) ;
		}
		jc1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				e.getSource();
			//	String titre=(String) jc.getSelectedItem();
				}
		});
		jc1.setBounds(310, 325, 550, 35);
			contentPane.add(jc1) ;

		//libelle gravite

		JLabel lblGravite = new JLabel("Gravité");
		lblGravite.setForeground(Color.BLACK);
		lblGravite.setBackground(Color.CYAN);
		lblGravite.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblGravite.setBounds(100, 375, 193, 52);
		contentPane.add(lblGravite);

		//liste des niveau de gravite

		Object[] elements = new Object[]{"Très faible", "Faible", "Moyenne", "Forte", "Méga forte"};  ;
				JComboBox jc3 = new JComboBox(elements) ;
				jc3.setBounds(310, 375, 550, 35);
				contentPane.add(jc3) ;
		
				jc3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						e.getSource();
						}
				});


		//libelle urgence

		JLabel lblUrgence = new JLabel("Urgence");
		lblUrgence.setForeground(Color.BLACK);
		lblUrgence.setBackground(Color.CYAN);
		lblUrgence.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblUrgence.setBounds(100, 425, 193, 35);
		contentPane.add(lblUrgence);

		//liste des niveau urgence

		Object[] trucs = new Object[]{"Un peu urgent", "Moyen urgent", "Commence à devenir vraiment urgent", "Alors là ça urge beaucoup", "On est tous morts !"};  ;
				JComboBox jc4 = new JComboBox(trucs) ;
				jc4.setBounds(310, 425, 550, 35);
				contentPane.add(jc4) ;
		
				jc4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						e.getSource();
						}
				});

		//boutons
		JButton button2 = new JButton("Retour");
		button2.setBackground(UIManager.getColor("Button.disabledForeground"));
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dashboard bo = new Dashboard(user, null);
				bo.setTitle("Dashboard " + user.role);
				bo.setVisible(true);
			}
		});
		button2.setFont(new Font("Tahoma", Font.PLAIN, 35));
		button2.setBounds(150, 500, 350, 50);
		contentPane.add(button2);

		JButton btnSumbit = new JButton("Valider");
		btnSumbit.setForeground(new Color(0, 0, 0));
		btnSumbit.setBackground(UIManager.getColor("Button.disabledForeground"));
		btnSumbit.setFont(new Font("Tahoma", Font.PLAIN, 39));
		btnSumbit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				//quand clic sur valider
				if(textFieldTitre.getText().isEmpty() || textFieldDescript.getText().isEmpty() || 
				textFieldZip.getText().isEmpty()){
					JOptionPane.showMessageDialog(btnSumbit, "Vous devez completer tous les champs");
				}  else {
					String inputTitre = textFieldTitre.getText();
					String inputDescript = textFieldDescript.getText();
					Country selectedCountry = (Country) comboCountry.getSelectedItem();
					String inputZip = textFieldZip.getText();
					int inputzipInt = Integer.parseInt(inputZip);
					String hero = jc.getSelectedItem().toString();
					String coequipier = jc1.getSelectedItem().toString();
					String gravite = jc3.getSelectedItem().toString();
					String urgence = jc4.getSelectedItem().toString();

					System.out.println(inputTitre+" "+inputDescript+" "+selectedCountry+" "+inputzipInt+" "+hero+" "+coequipier+" "+gravite+" "+urgence);

					try {
						Mission miss = new Mission(inputTitre, inputDescript, coequipier, hero, gravite, urgence, selectedCountry, inputzipInt);
						JOptionPane.showMessageDialog(btnSumbit, "Formulaire envoyé, merci de votre coopération !!");

					} catch (SQLDataException err) {
						System.out.println(err);
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
				}
			}
		
			}
		});
		btnSumbit.setBounds(550, 500, 350, 50);
		contentPane.add(btnSumbit);

	} catch (SQLException e) {
		System.out.println(e);
	}

	}
}
