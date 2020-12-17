package APP;

import java.awt.EventQueue;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JFrame;

import acteurs.User;
import actions.Satisfaction;
import util.dbUtil;
import java.sql.*;
import java.util.*;

public class SatisfactionList extends JFrame {

    private static final long serialVersionUID = 1;
    private JPanel contentPane;
    private JButton btnNewButton;
    public Object ArrayListSatisfaction;

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

    public SatisfactionList(User user) {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(450, 190, 1014, 597);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        // Titre page
		JLabel lblForm = new JLabel("Liste des satisfactions");
		lblForm.setForeground(Color.BLACK);
		lblForm.setFont(new Font("Times New Roman", Font.PLAIN, 46));
		lblForm.setBounds(340, 4, 500, 93);
		contentPane.add(lblForm);
        
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
	    btnRetour.setBounds(125, 450, 350, 50);
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
                            .prepareStatement("SELECT * FROM SATISFACTION");
                    ResultSet rs = st.executeQuery();
                    int i = 0;
                    String column[]={"idS","idC","Titre","Auteur","Agent","Commentaire","Note","Fichier"};
                    String data[][] = new String[8][20];
                    while (rs.next()) { // while (rs.next())
                        data[i][0] = rs.getString(1);
                        data[i][1] = rs.getString(2);
                        data[i][2] = rs.getString(3);
                        data[i][3] = rs.getString(4);
                        data[i][4] = rs.getString(5);
                        data[i][5] = rs.getString(6);
                        data[i][6] = rs.getString(7);
                        data[i][7] = rs.getString(8);
                        i++;
                    }
                    DefaultTableModel model = new DefaultTableModel(data, column);
                    JTable table = new JTable(model);
                    table.setShowGrid(true);
                    table.setShowVerticalLines(true);
                    JScrollPane pane = new JScrollPane(table);
	                pane.setBounds(100, 100, 800, 300);
                    contentPane.add(pane);
                } catch (SQLException sqlException) {
                    sqlException.printStackTrace();
                }
            }
        });
	    btnActualiser.setBounds(525, 450, 350, 50);
        contentPane.add(btnActualiser);
    }

}
