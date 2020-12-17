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
import java.sql.*;
import util.* ;

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

		//libelle date début

		JLabel lbldatedeb = new JLabel("Date de début");
		lbldatedeb.setForeground(Color.BLACK);
		lbldatedeb.setBackground(Color.CYAN);
		lbldatedeb.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbldatedeb.setBounds(100, 175, 193, 52);
		contentPane.add(lbldatedeb);

		//zone de texte date debut

		JTextField textFielddatedeb = new JTextField();
		textFielddatedeb.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFielddatedeb.setBounds(310, 175, 550, 35);
		contentPane.add(textFielddatedeb);
		textFielddatedeb.setColumns(10);

		//libelle héros

		JLabel lblLeader = new JLabel("Héros");
		lblLeader.setForeground(Color.BLACK);
		lblLeader.setBackground(Color.CYAN);
		lblLeader.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblLeader.setBounds(100, 225, 193, 52);
		contentPane.add(lblLeader);

		//ici récup liste des héros
		//choix du héros
		try{
			Connection cnx = utl.dbConnect() ;
			ResultSet rs = utl.dbRead(cnx, "SELECT * FROM MISSION") ;
			JComboBox jc = new JComboBox() ;
			while (rs.next()) {  
				//int id=rs.getInt("ID_M") ;
				String titreMission = rs.getString("TITREM") ;
				//Object[] itemData = new Object[] {id, titreMission};
				jc.addItem(titreMission);  
			}

		JTextField textFieldLeader = new JTextField();
		textFieldLeader.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldLeader.setBounds(310, 225, 600, 35);
		contentPane.add(textFieldLeader);
		textFieldLeader.setColumns(10);

		//libelle coéquipier

		JLabel lblassigner = new JLabel("Coéquipier");
		lblassigner.setForeground(Color.BLACK);
		lblassigner.setBackground(Color.CYAN);
		lblassigner.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblassigner.setBounds(100, 275, 193, 52);
		contentPane.add(lblassigner);

		//ici recup liste héros avec le précédent sélectionné en moins

		JTextField textFieldassigner = new JTextField();
		textFieldassigner.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldassigner.setBounds(310, 275, 600, 35);
		contentPane.add(textFieldassigner);
		textFieldassigner.setColumns(10);

		//libelle gravite

		JLabel lblGravite = new JLabel("Gravité");
		lblGravite.setForeground(Color.BLACK);
		lblGravite.setBackground(Color.CYAN);
		lblGravite.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblGravite.setBounds(100, 325, 193, 52);
		contentPane.add(lblGravite);

		//zone de texte gravite

		JTextField textFieldGravite = new JTextField();
		textFieldGravite.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldGravite.setBounds(310, 325, 600, 35);
		contentPane.add(textFieldGravite);
		textFieldGravite.setColumns(10);

		//libelle urgence

		JLabel lblUrgence = new JLabel("Urgence");
		lblUrgence.setForeground(Color.BLACK);
		lblUrgence.setBackground(Color.CYAN);
		lblUrgence.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblUrgence.setBounds(100, 375, 193, 35);
		contentPane.add(lblUrgence);

		//zone de texte urgence

		JTextField textFieldUrgence = new JTextField();
		textFieldUrgence.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldUrgence.setBounds(310, 375, 600, 35);
		contentPane.add(textFieldUrgence);
		textFieldUrgence.setColumns(10);

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
		button2.setBounds(150, 460, 350, 50);
		contentPane.add(button2);

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

	} catch (SQLException e) {
		System.out.println(e);
	}

	}
}
