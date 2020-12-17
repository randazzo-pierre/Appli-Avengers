package APP;

import java.awt.EventQueue;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.JFrame;

import acteurs.User;
import actions.Mission;
import util.dbUtil;
import java.sql.*;
import java.util.*;

public class ListeMission extends JFrame {
    private static final long serialVersionUID = 1;
    private JPanel contentPane;

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

    public ListeMission(User user, dbUtil utl) {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(450, 190, 1014, 597);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        // ============================================================================
        // ========CIVIL & ORGANISATION & HERO ========================================
        // ============================================================================

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
        
        JButton btnActualiser = new JButton("Actualiser");
	    btnActualiser.setForeground(new Color(0, 0, 0));
	    btnActualiser.setBackground(UIManager.getColor("Button.disabledForeground"));
	    btnActualiser.setFont(new Font("Tahoma", Font.PLAIN, 39));
        btnActualiser.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Connection connection = (Connection) DriverManager.getConnection(
                            "jdbc:mysql://rds-mysql-avengersapp.cdx9i8eyllsk.eu-west-3.rds.amazonaws.com:3306/BDD_AVENGERS_DEV",
                            "dbroot", "QeTuZ2LFJfSqtbpe");

                    PreparedStatement st = (PreparedStatement) connection
                            .prepareStatement("SELECT * FROM MISSION");
                    ResultSet rs = st.executeQuery();
                    List<Mission> ListeMission = new ArrayList<>();
                    while (rs.next()) { // while (rs.next())
                        Mission Mission = new Mission(rs.getString(1));
                        ListeMission.add(Mission);
                        System.out.println(Mission.getTitreM());
                    }
                } catch (SQLException sqlException) {
                    sqlException.printStackTrace();
                }
            }
        });
	    btnActualiser.setBounds(550, 400, 350, 50);
        contentPane.add(btnActualiser);
    }

}

        