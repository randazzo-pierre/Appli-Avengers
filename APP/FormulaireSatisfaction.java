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
import actions.Satisfaction;
import java.sql.*;
import util.*;

public class FormulaireSatisfaction extends JFrame {

	public static final long serialVersionUID = 1;
	public JPanel contentPane;
	public String titre;
	public String auteur;
	public String agent;
	public String score;
	public JComboBox<String> jc;
	public JComboBox<String> jc1;
	public JComboBox<String> jc2;
	public JComboBox<String> jc3;

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
	public FormulaireSatisfaction(User user, dbUtil utl) {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450, 190, 1014, 597);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// ============================================================================
		// ======== FORMULAIRE SATISFACTION ===========================================
		// ============================================================================

		// Titre page
		JLabel lblForm = new JLabel("Formulaire de satisfaction");
		lblForm.setForeground(Color.BLACK);
		lblForm.setFont(new Font("Times New Roman", Font.PLAIN, 46));
		lblForm.setBounds(250, 4, 500, 93);
		contentPane.add(lblForm);

		// titre satisfaction
		JLabel lblTitre = new JLabel("Intitulé de la mission");
		lblTitre.setForeground(Color.BLACK);
		lblTitre.setBackground(Color.CYAN);
		lblTitre.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTitre.setBounds(100, 75, 193, 52);
		contentPane.add(lblTitre);

		// Choix de la mission :
		try {
			Connection cnx = utl.dbConnect();
			ResultSet rs = utl.dbRead(cnx, "SELECT * FROM MISSION");
			JComboBox jc = new JComboBox();
			while (rs.next()) {
				// int id=rs.getInt("ID_M") ;
				String titreMission = rs.getString("TITREM");
				// Object[] itemData = new Object[] {id, titreMission};
				jc.addItem(titreMission);
			}
			// utl.dbKill(cnx) ;
			// Connection cnx = utl.dbConnect() ;
			// L'AUTEUR
			ResultSet rs1 = utl.dbRead(cnx, "SELECT * FROM CIVIL WHERE type!=1");
			JComboBox jc1 = new JComboBox();
			while (rs1.next()) {
				// int id=rs.getInt("ID_M") ;
				String identifiantCivil = rs1.getString("IDENTIFIANT");
				// Object[] itemData = new Object[] {id, titreMission};
				jc1.addItem(identifiantCivil);
				// utl.dbKill(cnx) ;
			}
			// L'AGENT
			// Connection cnx = utl.dbConnect() ;
			ResultSet rs2 = utl.dbRead(cnx, "SELECT * FROM CIVIL WHERE type=1");
			JComboBox jc2 = new JComboBox();
			while (rs2.next()) {
				// int id=rs.getInt("ID_M") ;
				String identifiantAgent = rs2.getString("IDENTIFIANT");
				// Object[] itemData = new Object[] {id, titreMission};
				jc2.addItem(identifiantAgent);
				// utl.dbKill(cnx) ;
			}
			jc2.setBounds(310, 225, 550, 50);
			contentPane.add(jc2);

			jc1.setBounds(310, 150, 550, 50);
			contentPane.add(jc1);

			jc.setBounds(310, 75, 550, 50);
			contentPane.add(jc);

			jc.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					e.getSource();
					// String titre=(String) jc.getSelectedItem();
				}
			});

			jc1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					e.getSource();
					// String auteur=(String) jc1.getSelectedItem();
				}
			});

			jc2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					e.getSource();
					// String agent=(String) jc2.getSelectedItem();
				}
			});

			// nom auteur
			JLabel lblAuteur = new JLabel("Auteur");
			lblAuteur.setForeground(Color.BLACK);
			lblAuteur.setBackground(Color.CYAN);
			lblAuteur.setFont(new Font("Tahoma", Font.PLAIN, 31));
			lblAuteur.setBounds(100, 150, 193, 52);
			contentPane.add(lblAuteur);

			// nom agent
			JLabel lblAgent = new JLabel("Agent");
			lblAgent.setForeground(Color.BLACK);
			lblAgent.setBackground(Color.CYAN);
			lblAgent.setFont(new Font("Tahoma", Font.PLAIN, 31));
			lblAgent.setBounds(100, 225, 193, 52);
			contentPane.add(lblAgent);

			// libelle commentaire
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

			// lieblle score
			JLabel lblScore = new JLabel("Score");
			lblScore.setForeground(Color.BLACK);
			lblScore.setBackground(Color.CYAN);
			lblScore.setFont(new Font("Tahoma", Font.PLAIN, 31));
			lblScore.setBounds(100, 375, 193, 52);
			contentPane.add(lblScore);

			// zone de texte score
			/*
			 * JTextField textFieldScore = new JTextField(); textFieldScore.setFont(new
			 * Font("Tahoma", Font.PLAIN, 32)); textFieldScore.setBounds(250, 375, 550, 50);
			 * contentPane.add(textFieldScore); textFieldScore.setColumns(10);
			 */

			// - 2) --- définir les élément de la liste

			Object[] elements = new Object[] { "1", "2", "3", "4", "5" };
			;
			JComboBox jc3 = new JComboBox(elements);
			jc3.setBounds(250, 375, 550, 50);
			contentPane.add(jc3);

			jc3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					e.getSource();
					// String score=(String) jc3.getSelectedItem();
				}
			});

			// libelle fichier
			JLabel lblFichier = new JLabel("Fichier");
			lblFichier.setForeground(Color.BLACK);
			lblFichier.setBackground(Color.CYAN);
			lblFichier.setFont(new Font("Tahoma", Font.PLAIN, 31));
			lblFichier.setBounds(600, 375, 193, 52);
			contentPane.add(lblFichier);

			JButton button2 = new JButton("Retour");
			button2.setBackground(UIManager.getColor("Button.disabledForeground"));
			button2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dbUtil utl = new dbUtil();
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

					if (textFieldCommentaire.getText().isEmpty()) {
						// error
						JOptionPane.showMessageDialog(btnSumbit, "Vous devez completer tous les champs");
					} else {

						String titre = jc.getSelectedItem().toString();
						String auteur = jc1.getSelectedItem().toString();
						String agent = jc2.getSelectedItem().toString();
						String score = jc3.getSelectedItem().toString();
						String inputCommentaire = textFieldCommentaire.getText();

						System.out.println(titre + " " + auteur + " " + agent + " " + score + " " + inputCommentaire);

						try {
							Satisfaction satis = new Satisfaction(titre, auteur, agent, score, inputCommentaire);
							JOptionPane.showMessageDialog(btnSumbit,
									"Formulaire envoyé, merci de votre coopération !!");

						} catch (SQLDataException err) {
							System.out.println(err);
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}

					}
				}
			});
			btnSumbit.setBounds(550, 460, 350, 50);
			contentPane.add(btnSumbit);

		} catch (SQLException e) {
			System.out.println(e);
		}

	}
}
