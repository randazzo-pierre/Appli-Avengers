package APP;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import acteurs.Hero;
import acteurs.User;
import util.dbUtil;

public class NewHero extends JFrame {
    private static final long serialVersionUID = 1;
    private JPanel contentPane;
    public String affichage = "";

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    NewHero frame = new NewHero();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public NewHero() {

    }

    /**
     * Create the frame.
     */
    public NewHero(User user, dbUtil dbUtil) {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(450, 190, 1014, 597);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        // ============================================================================
        // ======== EDIT PROFIL ===========================================
        // ============================================================================

        JLabel lblForm = new JLabel("DEVENIR UN HEROS");
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

        JLabel lblAuteur = new JLabel("Pouvoir");
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

        JLabel lbldatedeb = new JLabel("Faiblesse");
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

        JLabel lbldatefin = new JLabel("Description");
        lbldatefin.setForeground(Color.BLACK);
        lbldatefin.setBackground(Color.CYAN);
        lbldatefin.setFont(new Font("Tahoma", Font.PLAIN, 31));
        lbldatefin.setBounds(100, 310, 193, 52);
        contentPane.add(lbldatefin);

        JTextField textFielddatefin = new JTextField();
        textFielddatefin.setFont(new Font("Tahoma", Font.PLAIN, 32));
        textFielddatefin.setBounds(310, 310, 550, 50);
        contentPane.add(textFielddatefin);
        textFielddatefin.setColumns(10);

        JButton btnSumbit = new JButton("Valider HEROS");
        btnSumbit.setForeground(new Color(0, 0, 0));
        btnSumbit.setBackground(UIManager.getColor("Button.disabledForeground"));
        btnSumbit.setFont(new Font("Tahoma", Font.PLAIN, 39));
        btnSumbit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String pouvoirh = textFieldAuteur.getText();
                String titreh = textFieldTitre.getText();
                String pointFaibleh = textFielddatedeb.getText();
                String commentaireHero = textFielddatefin.getText();
                String identiteC = user.username;
                int scoreh = 0;
                int nbMissionEff = 0;
                int idC = user.id;
                int idH = 0;

                String pstr = "HEROS";
                try {
                    Connection con = DriverManager.getConnection(
                            "jdbc:mysql://rds-mysql-avengersapp.cdx9i8eyllsk.eu-west-3.rds.amazonaws.com:3306/BDD_AVENGERS_DEV",
                            "dbroot", "QeTuZ2LFJfSqtbpe");

                    PreparedStatement st = (PreparedStatement) con
                            .prepareStatement("Update USER set role=? where username=?");

                    st.setString(1, pstr);
                    st.setString(2, user.username);
                    st.executeUpdate();
                    // JOptionPane.showMessageDialog(btnSearch, "Password has been successfully
                    // changed");

                } catch (SQLException sqlException) {
                    sqlException.printStackTrace();
                }

                try {
                    Hero hero = new Hero(idH, idC, titreh, pouvoirh, pointFaibleh, identiteC, scoreh, nbMissionEff,
                            commentaireHero);
                    System.out.println(hero);
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }

                UserLogin frame = new UserLogin(dbUtil);
                frame.setVisible(true);
            }
        });
        btnSumbit.setBounds(450, 450, 350, 50);
        contentPane.add(btnSumbit);

        JButton button2 = new JButton("Retour");
        button2.setBackground(UIManager.getColor("Button.disabledForeground"));
        button2.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                dbUtil utl = new dbUtil();
                Profile bo = new Profile(user, utl);
                bo.setTitle("Profile ");
                bo.setVisible(true);
                
            }
        });
        button2.setFont(new Font("Tahoma", Font.PLAIN, 35));
        button2.setBounds(50, 450, 350, 50);
        contentPane.add(button2);

    }
}
