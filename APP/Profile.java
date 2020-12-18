package APP;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import acteurs.User;
import util.dbUtil;

public class Profile extends JFrame {
    private static final long serialVersionUID = 1;
    private JPanel contentPane;

    /**
     */
    /**
     * Launch the application.
     * @param args
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Profile frame = new Profile();
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
     * @param dbUtil
     */
    public Profile(User user, dbUtil dbUtil) {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(450, 190, 1014, 597);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JButton btnNewButton = new JButton("Logout");
        btnNewButton.setForeground(new Color(0, 0, 0));
        btnNewButton.setBackground(UIManager.getColor("Button.disabledForeground"));
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 39));
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int a = JOptionPane.showConfirmDialog(btnNewButton, "Are you sure?");
                if (a == JOptionPane.YES_OPTION) {
                    dispose();
                    dbUtil utl = new dbUtil();
                    UserLogin obj = new UserLogin(utl);
                    obj.setTitle("Student-Login");
                    obj.setVisible(true);
                }
                dispose();
                dbUtil utl = new dbUtil();
                UserLogin obj = new UserLogin(utl);

                obj.setTitle("Student-Login");
                obj.setVisible(true);

            }
        });
        btnNewButton.setBounds(247, 100, 491, 75);
        contentPane.add(btnNewButton);

        // devenir un super heros
        if ("CIVIL".equals(user.role)) {

            JButton button2 = new JButton("DEVENIR UN HEROS");
            button2.setBackground(UIManager.getColor("Button.disabledForeground"));
            button2.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    NewHero edit = new NewHero(user, dbUtil);
                    edit.setTitle("Modifier profile");
                    edit.setVisible(true);
                }
            });
            button2.setFont(new Font("Tahoma", Font.PLAIN, 35));
            button2.setBounds(247, 200, 491, 75);
            contentPane.add(button2);
        }

        // devenir un super vilain
        if ("CIVIL".equals(user.role)) {

            JButton button2 = new JButton("DEVENIR UN VILAIN");
            button2.setBackground(UIManager.getColor("Button.disabledForeground"));
            button2.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    NewVilain edit = new NewVilain(user, dbUtil);
                    edit.setTitle("Modifier profile");
                    edit.setVisible(true);
                }
            });
            button2.setFont(new Font("Tahoma", Font.PLAIN, 35));
            button2.setBounds(247, 300, 491, 75);
            contentPane.add(button2);
        }

        JButton button = new JButton("Change-password\r\n");
        button.setBackground(UIManager.getColor("Button.disabledForeground"));
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ChangePassword bo = new ChangePassword(user);
                bo.setTitle("Change Password");
                bo.setVisible(true);

            }
        });
        button.setFont(new Font("Tahoma", Font.PLAIN, 35));
        button.setBounds(247, 400, 491, 75);
        contentPane.add(button);
    }
}
