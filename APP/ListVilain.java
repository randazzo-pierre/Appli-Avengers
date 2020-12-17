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

public class ListVilain extends JFrame {
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

    public ListVilain(User user) {
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
                Dashboard bo = new Dashboard(user);
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

            }
        });
	    btnActualiser.setBounds(550, 400, 350, 50);
        contentPane.add(btnActualiser);
    }

}
