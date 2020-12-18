package APP;

import java.awt.EventQueue;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import java.util.Date;

import acteurs.User;
import actions.Rapport;
import util.dbUtil;
import java.sql.*;

public class RapportMission extends JFrame {

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
	public RapportMission(User user, dbUtil utl) {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450, 190, 1014, 597);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(6, 6, 6, 6));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// ============================================================================
		// ======== RAPPORT MISSION ===========================================
		// ============================================================================

		JLabel lblForm = new JLabel("RAPPORT DE MISSION");
		lblForm.setForeground(Color.BLACK);
		lblForm.setFont(new Font("Times New Roman", Font.PLAIN, 46));
		lblForm.setBounds(250, 5, 500, 93);
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
				String titreMission = rs.getString("TITREM");
				jc.addItem(titreMission);
			}
			// Le Heros :
			ResultSet rs1 = utl.dbRead(cnx, "SELECT * FROM HEROS");
			JComboBox jc1 = new JComboBox();
			while (rs1.next()) {
				String identifiantCivil = rs1.getString("TITREH");
				jc1.addItem(identifiantCivil);
			}

			jc1.setBounds(310, 150, 550, 50);
			contentPane.add(jc1);

			jc.setBounds(310, 75, 550, 50);
			contentPane.add(jc);

			jc.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					e.getSource();
				}
			});

			jc1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					e.getSource();
				}
			});

			// nom auteur
			JLabel lblAuteur = new JLabel("Heros :");
			lblAuteur.setForeground(Color.BLACK);
			lblAuteur.setBackground(Color.CYAN);
			lblAuteur.setFont(new Font("Tahoma", Font.PLAIN, 31));
			lblAuteur.setBounds(100, 150, 193, 52);
			contentPane.add(lblAuteur);

			// libelle commentaire
			JLabel lblCommentaire = new JLabel("Description :");
			lblCommentaire.setForeground(Color.BLACK);
			lblCommentaire.setBackground(Color.CYAN);
			lblCommentaire.setFont(new Font("Tahoma", Font.PLAIN, 31));
			lblCommentaire.setBounds(100, 215, 193, 52);
			contentPane.add(lblCommentaire);

			// zone de texte commentaire
			JTextField textFieldCommentaire = new JTextField();
			textFieldCommentaire.setFont(new Font("Tahoma", Font.PLAIN, 32));
			textFieldCommentaire.setBounds(310, 215, 550, 50);
			contentPane.add(textFieldCommentaire);
			textFieldCommentaire.setColumns(10);

			// libelle statut
			JLabel lblScore = new JLabel("Statut :");
			lblScore.setForeground(Color.BLACK);
			lblScore.setBackground(Color.CYAN);
			lblScore.setFont(new Font("Tahoma", Font.PLAIN, 31));
			lblScore.setBounds(100, 280, 193, 52);
			contentPane.add(lblScore);

			// définir les élément de la liste

			Object[] elements = new Object[] { "ECHEC", "SUCCESS", "IN-PROGRESS" };
			;
			JComboBox jc3 = new JComboBox(elements);
			jc3.setBounds(310, 280, 550, 50);
			contentPane.add(jc3);

			jc3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					e.getSource();
				}
			});

			JButton button2 = new JButton("Retour");
			button2.setBackground(UIManager.getColor("Button.disabledForeground"));
			button2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dbUtil utl = new dbUtil();
					Dashboard bo = new Dashboard(user, utl);
					bo.setTitle("Dashboard " + user.role);
					bo.setVisible(true);
					dispose();
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
						JOptionPane.showMessageDialog(btnSumbit, "Vous devez completer tous les champs");
					} else {

						String titre = jc.getSelectedItem().toString();
						String hero = jc1.getSelectedItem().toString();
						String status = jc3.getSelectedItem().toString();
						String inputCommentaire = textFieldCommentaire.getText();

						System.out.println(titre + " " + hero + " " + status + " " + inputCommentaire);
						int id = 0;
						Date debut = new Date();
						try {
							Rapport satis = new Rapport(id, titre, hero, status, inputCommentaire, debut);
							JOptionPane.showMessageDialog(btnSumbit,
									"Formulaire envoyé, merci de votre coopération !!");

						} catch (SQLException e1) {
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