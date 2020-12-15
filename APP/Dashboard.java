package APP;

import java.awt.EventQueue;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

public class Dashboard extends JFrame {

		
		 private static final long serialVersionUID = 1 ;
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
public Dashboard (String userSes) {

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(450, 190, 1014, 597);
    setResizable(false);
    contentPane = new JPanel();
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPane);
    contentPane.setLayout(null);
    
    
    JButton btnNewButton = new JButton("X1");
    btnNewButton.setForeground(new Color(0, 0, 0));
    btnNewButton.setBackground(UIManager.getColor("Button.disabledForeground"));
    btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 39));
    btnNewButton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {


        }
    });
    btnNewButton.setBounds(247, 100, 491, 114);
    contentPane.add(btnNewButton);
    
    
    JButton button2 = new JButton("X2");
    button2.setForeground(new Color(0, 0, 0));
    button2.setBackground(new Color(20, 150, 20));
    button2.setBackground(UIManager.getColor("Button.disabledForeground"));
    button2.setFont(new Font("Tahoma", Font.PLAIN, 39));
    button2.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {

                        }
    });
    button2.setBounds(247, 250, 491, 114);
    contentPane.add(button2);
    
    
}
}