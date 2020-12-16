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

import acteurs.User;

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
public Dashboard (User user) {

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
    

    	JButton btnNewButton = new JButton(user.role);
    btnNewButton.setForeground(new Color(0, 0, 0));
    btnNewButton.setBackground(UIManager.getColor("Button.disabledForeground"));
    btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 39));
    btnNewButton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        		Alerte alert = new Alerte(user);
        		//alert.setTitle();
        		alert.setVisible(true);
        }
    });
    btnNewButton.setBounds(50, 20, 250, 50);
    contentPane.add(btnNewButton);
    
    
    
    //if(user.role == "CIVIL") {
    JButton button2 = new JButton("Formulaire Satisfaction");
    button2.setForeground(new Color(0, 0, 0));
    button2.setBackground(new Color(20, 150, 20));
    button2.setBackground(UIManager.getColor("Button.disabledForeground"));
    button2.setFont(new Font("Tahoma", Font.PLAIN, 39));
    button2.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
                    FormulaireSatisfaction formulaireSatisfaction = new FormulaireSatisfaction(user);
                    formulaireSatisfaction.setVisible(true);
                        }
    });
    button2.setBounds(450, 20, 450, 50);
    contentPane.add(button2);
    
   // }


    //if(user.role == "ORGA") {
    
    JButton button3 = new JButton("Creer mission");
    button3.setForeground(new Color(0, 0, 0));
    button3.setBackground(new Color(20, 150, 20));
    button3.setBackground(UIManager.getColor("Button.disabledForeground"));
    button3.setFont(new Font("Tahoma", Font.PLAIN, 39));
    button3.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {

                        }
    });
    button3.setBounds(50, 160, 850, 50);
    contentPane.add(button3);
    
    //}
    
    
   // if (user.role == "ORGA" || user.role == "HEROS") {
    JButton button4 = new JButton("Rapport");
    button4.setForeground(new Color(0, 0, 0));
    button4.setBackground(new Color(20, 150, 20));
    button4.setBackground(UIManager.getColor("Button.disabledForeground"));
    button4.setFont(new Font("Tahoma", Font.PLAIN, 39));
    button4.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {

                        }
    });
    button4.setBounds(50, 240, 850, 50);
    contentPane.add(button4);
    
    
    
    JButton button5 = new JButton("Identifier Vilain");
    button5.setForeground(new Color(0, 0, 0));
    button5.setBackground(new Color(20, 150, 20));
    button5.setBackground(UIManager.getColor("Button.disabledForeground"));
    button5.setFont(new Font("Tahoma", Font.PLAIN, 39));
    button5.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {

                        }
    });
    button5.setBounds(50, 320, 850, 50);
    contentPane.add(button5);
    
    //}
    
    
    //if (user.role == "ORGA") {
    JButton button6 = new JButton("Satisfaction Info");
    button6.setForeground(new Color(0, 0, 0));
    button6.setBackground(new Color(20, 150, 20));
    button6.setBackground(UIManager.getColor("Button.disabledForeground"));
    button6.setFont(new Font("Tahoma", Font.PLAIN, 39));
    button6.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {

                        }
    });
    button6.setBounds(50, 400, 850, 50);
    contentPane.add(button6);
    
    //}
    
    
    
    JButton button7 = new JButton("Litige");
    button7.setForeground(new Color(0, 0, 0));
    button7.setBackground(new Color(20, 150, 20));
    button7.setBackground(UIManager.getColor("Button.disabledForeground"));
    button7.setFont(new Font("Tahoma", Font.PLAIN, 39));
    button7.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {

                        }
    });
    button7.setBounds(50, 480, 850, 50);
    contentPane.add(button7);

}


}