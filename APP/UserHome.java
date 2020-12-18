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

import acteurs.User;
import util.dbUtil;

public class UserHome extends JFrame {

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

    public UserHome() {

    }

    /**
     * Create the frame.
     * @param user
     * @param dbUtil
     */
    public UserHome(User user, dbUtil dbUtil) {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(450, 190, 1014, 597);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("Bievenue : " + user.role + " " + user.username);
        lblNewLabel.setForeground(Color.BLACK);
        lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 46));
        lblNewLabel.setBounds(250, 13, 673, 93);
        contentPane.add(lblNewLabel);

        JButton button2 = new JButton("Dashboard");
        button2.setBackground(UIManager.getColor("Button.disabledForeground"));
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Dashboard bo = new Dashboard(user, dbUtil);
                bo.setTitle("Dashboard " + user.role);
                bo.setVisible(true);
                dispose();
            }
        });
        button2.setFont(new Font("Tahoma", Font.PLAIN, 35));
        button2.setBounds(247, 250, 491, 114);
        contentPane.add(button2);

        JButton button = new JButton("Profile");
        button.setBackground(UIManager.getColor("Button.disabledForeground"));
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Profile bo = new Profile(user, dbUtil);
                bo.setTitle("Profile");
                bo.setVisible(true);

            }
        });
        button.setFont(new Font("Tahoma", Font.PLAIN, 35));
        button.setBounds(247, 400, 491, 114);
        contentPane.add(button);
    }
}