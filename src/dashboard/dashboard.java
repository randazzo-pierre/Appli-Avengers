package dashboard;

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

import Login.ChangePassword;
import Login.UserHome;
import Login.UserLogin;

public class dashboard extends JFrame{
	
    private static final long serialVersionUID = 1 ;
    private JPanel contentPane;

	/**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    dashboard frame = new dashboard();
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
public dashboard(String userSes) {

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(450, 190, 1014, 597);
    setResizable(false);
    contentPane = new JPanel();
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPane);
    contentPane.setLayout(null);

    //=======================================================
    // BUTTON 1 
    
    JButton btnNewButton = new JButton("X1");
    btnNewButton.setForeground(new Color(0, 0, 0));
    btnNewButton.setBackground(UIManager.getColor("Button.disabledForeground"));
    btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 39));
    btnNewButton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
           
        }
    });
    btnNewButton.setBounds(100, 100, 250, 100);
    contentPane.add(btnNewButton);
    
    //=======================================================
    // BUTTON 2
    
    JButton button = new JButton("X2");
    button.setForeground(new Color(0, 0, 0));
    button.setBackground(UIManager.getColor("Button.disabledForeground"));
    button.setFont(new Font("Tahoma", Font.PLAIN, 39));
    button.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
           
        }
    });
    button.setBounds(100, 250, 250, 100);
    contentPane.add(button);
    
    //=======================================================
    // BUTTON 3
    
    JButton button2 = new JButton("X3");
    button2.setForeground(new Color(0, 0, 0));
    button2.setBackground(UIManager.getColor("Button.disabledForeground"));
    button2.setFont(new Font("Tahoma", Font.PLAIN, 39));
    button2.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
           
        }
    });
    button2.setBounds(100, 400, 250, 100);
    contentPane.add(button2);
    
    //=======================================================
    // BUTTON 4
    
    JButton button3 = new JButton("X4");
    button3.setForeground(new Color(0, 0, 0));
    button3.setBackground(UIManager.getColor("Button.disabledForeground"));
    button3.setFont(new Font("Tahoma", Font.PLAIN, 39));
    button3.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
           
        }
    });
    button3.setBounds(400, 100, 450, 100);
    contentPane.add(button3);
    
    //=======================================================
    // BUTTON 5
    
    JButton button4 = new JButton("X5");
    button4.setForeground(new Color(10, 15, 200));
    button4.setBackground(UIManager.getColor("Button.disabledForeground"));
    button4.setFont(new Font("Tahoma", Font.PLAIN, 39));
    button4.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
           
        }
    });
    button4.setBounds(400, 250, 450, 100);
    contentPane.add(button4);
    
    //=======================================================
}


public dashboard() {
	// TODO Auto-generated constructor stub
}
}

