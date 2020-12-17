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
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import acteurs.User;
import util.dbUtil;

public class EditProfil extends JFrame {
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
                    EditProfil frame = new EditProfil();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public EditProfil() {

    }

    /**
     * Create the frame.
     */
    public EditProfil(User user, dbUtil dbUtil) {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(450, 300, 1014, 597);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        // ============================================================================
        // ======== EDIT PROFIL ===========================================
        // ============================================================================

        if ("".equals(affichage)) {
            // =========VILAIN+++++++++++++++
            JButton button3 = new JButton("VILAIN");
            button3.setBackground(UIManager.getColor("Button.disabledForeground"));
            button3.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    affichage = "VILAINS";
                }
            });
            button3.setFont(new Font("Tahoma", Font.PLAIN, 35));
            button3.setBounds(50, 450, 350, 50);
            contentPane.add(button3);
            // =========HEROS+++++++++++++++
            JButton button4 = new JButton("HEROS");
            button4.setBackground(UIManager.getColor("Button.disabledForeground"));
            button4.addActionListener(new ActionListener() {
                public String affi = "";

                public void actionPerformed(ActionEvent e) {
                    affi = "HEROS";
                    affichage = affi;
                }
            });
            button4.setFont(new Font("Tahoma", Font.PLAIN, 35));
            button4.setBounds(450, 450, 350, 50);
            contentPane.add(button4);

        }

        JLabel lblForm = new JLabel("EDIT PROFILE");
        lblForm.setForeground(Color.BLACK);
        lblForm.setFont(new Font("Times New Roman", Font.PLAIN, 46));
        lblForm.setBounds(250, 5, 500, 93);
        contentPane.add(lblForm);

        if ("HEROS".equals(affichage) || "VILAIN".equals(affichage)) {
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

            if ("HEROS".equals(affichage)) {
                JButton btnSumbit = new JButton("Valider HEROS");
                btnSumbit.setForeground(new Color(0, 0, 0));
                btnSumbit.setBackground(UIManager.getColor("Button.disabledForeground"));
                btnSumbit.setFont(new Font("Tahoma", Font.PLAIN, 39));
                btnSumbit.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                    }
                });
                btnSumbit.setBounds(450, 450, 350, 50);
                contentPane.add(btnSumbit);
            } else {
                JButton btnSumbit = new JButton("Valider VILAIN");
                btnSumbit.setForeground(new Color(0, 0, 0));
                btnSumbit.setBackground(UIManager.getColor("Button.disabledForeground"));
                btnSumbit.setFont(new Font("Tahoma", Font.PLAIN, 39));
                btnSumbit.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                    }
                });
                btnSumbit.setBounds(450, 450, 350, 50);
                contentPane.add(btnSumbit);
            }

        }

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
