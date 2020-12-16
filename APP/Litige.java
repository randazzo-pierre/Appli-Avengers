package APP;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import acteurs.User;

public class Litige extends JFrame {

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

    public Litige(User user) {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(450, 190, 1014, 597);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JButton button2 = new JButton("Retour");
        button2.setBackground(UIManager.getColor("Button.disabledForeground"));
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Dashboard bo = new Dashboard(user);
                bo.setTitle("Dashboard " + user.role);
                bo.setVisible(true);
            }
        });
        button2.setFont(new Font("Tahoma", Font.PLAIN, 35));
        button2.setBounds(100, 400, 200, 100);
        contentPane.add(button2);

    }

    public Litige() {

    }

}
