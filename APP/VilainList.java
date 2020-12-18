package APP;

import java.awt.Color;
import java.awt.Font;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;
import javax.swing.UIManager;
import javax.swing.JComboBox;
import acteurs.User;
import java.sql.*;
import util.* ;

public class VilainList extends JFrame {

    private static final long serialVersionUID = 1;
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
     * @param utl
     */
    public VilainList(User user, dbUtil utl) {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(450, 190, 1014, 597);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        // ==========Content==============

        JLabel lblForm = new JLabel("Identifier un vilain");
        lblForm.setForeground(Color.BLACK);
        lblForm.setFont(new Font("Times New Roman", Font.PLAIN, 46));
        lblForm.setBounds(350, 5, 500, 93);
        contentPane.add(lblForm);

        JLabel lblCivil = new JLabel("Civil");
        lblCivil.setForeground(Color.BLACK);
        lblCivil.setBackground(Color.CYAN);
        lblCivil.setFont(new Font("Tahoma", Font.PLAIN, 31));
        lblCivil.setBounds(125, 150, 193, 52);
        contentPane.add(lblCivil);


        // Choix du civil:
		try{
			Connection cnx = utl.dbConnect() ;
			ResultSet rs = utl.dbRead(cnx, "SELECT * FROM CIVIL") ;
			JComboBox jcCivil = new JComboBox() ;
			while (rs.next()) {  
				jcCivil.addItem(rs.getString("IDENTIFIANT"));  
			}
			
            jcCivil.setBounds(330, 150, 550, 50);
            jcCivil.setFont(new Font("Tahoma", Font.PLAIN, 31));
            
			contentPane.add(jcCivil) ;
		} catch (SQLException e) {
			System.out.println(e);
		}

        JLabel lblVilain = new JLabel("Vilain");
        lblVilain.setForeground(Color.BLACK);
        lblVilain.setBackground(Color.CYAN);
        lblVilain.setFont(new Font("Tahoma", Font.PLAIN, 31));
        lblVilain.setBounds(125, 250, 193, 52);
        contentPane.add(lblVilain);

        // Choix du vilain :
        try{
            Connection cnx = utl.dbConnect() ;
            ResultSet rs = utl.dbRead(cnx, "SELECT * FROM VILAIN") ;
            JComboBox jcVilain = new JComboBox() ;
            while (rs.next()) {  
                jcVilain.addItem(rs.getString("TITREV"));  
            }

            jcVilain.setBounds(330, 250, 550, 50);
            jcVilain.setFont(new Font("Tahoma", Font.PLAIN, 31));

            contentPane.add(jcVilain) ;
        } catch (SQLException e) {
            System.out.println(e);
        }

        // BOUTONS
        JButton btnRetour = new JButton("Retour");
        btnRetour.setForeground(new Color(0, 0, 0));
        btnRetour.setBackground(UIManager.getColor("Button.disabledForeground"));
        btnRetour.setFont(new Font("Tahoma", Font.PLAIN, 39));
        btnRetour.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Dashboard bo = new Dashboard(user, null);
                bo.setTitle("Dashboard " + user.role);
                bo.setVisible(true);
            }
        });
        btnRetour.setBounds(150, 400, 350, 50);
        contentPane.add(btnRetour);

        JButton btnSumbit = new JButton("Valider");
        btnSumbit.setForeground(new Color(0, 0, 0));
        btnSumbit.setBackground(UIManager.getColor("Button.disabledForeground"));
        btnSumbit.setFont(new Font("Tahoma", Font.PLAIN, 39));
        btnSumbit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnSumbit.setBounds(550, 400, 350, 50);
        contentPane.add(btnSumbit);
    }

}
