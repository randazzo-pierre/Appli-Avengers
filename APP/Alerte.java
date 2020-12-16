package APP;

import java.awt.Color;
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

public class Alerte extends JFrame{

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
	    
	    public Alerte (User user) {

	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setBounds(450, 190, 1014, 597);
	        setResizable(false);
	        contentPane = new JPanel();
	        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	        setContentPane(contentPane);
	        contentPane.setLayout(null);
	        
	        
	        
	        //============================================================================
	        //========CIVIL & ORGANISATION & HERO ========================================
	        //============================================================================
	        
	        
	        JButton btnNewButton = new JButton("c good ");
	        btnNewButton.setForeground(new Color(0, 0, 0));
	        btnNewButton.setBackground(UIManager.getColor("Button.disabledForeground"));
	        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 39));
	        btnNewButton.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {

	            }
	        });
	        btnNewButton.setBounds(50, 20, 250, 50);
	        contentPane.add(btnNewButton);
	        
	    }        
}
