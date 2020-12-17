package APP;

import java.awt.Color;
import java.awt.Font;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;
import javax.swing.UIManager;

import acteurs.User;

public class VilainList extends JFrame {
	
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
public VilainList (User user) {
	
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(450, 190, 1014, 597);
    setResizable(false);
    contentPane = new JPanel();
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPane);
    contentPane.setLayout(null);
    
    
    //==========Content==============

    JLabel lblForm = new JLabel("Identifier un vilain");
	lblForm.setForeground(Color.BLACK);
	lblForm.setFont(new Font("Times New Roman", Font.PLAIN, 46));
	lblForm.setBounds(350, 5, 500, 93);
	contentPane.add(lblForm);
    
    JLabel lblCivil = new JLabel("Civil");
    lblCivil.setForeground(Color.BLACK);
    lblCivil.setBackground(Color.CYAN);
    lblCivil.setFont(new Font("Tahoma", Font.PLAIN, 31));
    lblCivil.setBounds(125, 150, 193, 52);
	contentPane.add(lblCivil);
			
	JTextField textFieldCivil = new JTextField();
    textFieldCivil.setFont(new Font("Tahoma", Font.PLAIN, 32));
    textFieldCivil.setBounds(330, 150, 550, 50);
    contentPane.add(textFieldCivil);
	textFieldCivil.setColumns(10);


    JLabel lblVilain = new JLabel("Vilain");
    lblVilain.setForeground(Color.BLACK);
    lblVilain.setBackground(Color.CYAN);
    lblVilain.setFont(new Font("Tahoma", Font.PLAIN, 31));
    lblVilain.setBounds(125, 250, 193, 52);
	contentPane.add(lblVilain);
			
	JTextField textFieldVilain = new JTextField();
    textFieldVilain.setFont(new Font("Tahoma", Font.PLAIN, 32));
    textFieldVilain.setBounds(330, 250, 550, 50);
    contentPane.add(textFieldVilain);
    textFieldVilain.setColumns(10);
    
    
    // BOUTONS

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


	JButton btnSumbit = new JButton("Valider");
	btnSumbit.setForeground(new Color(0, 0, 0));
	btnSumbit.setBackground(UIManager.getColor("Button.disabledForeground"));
	btnSumbit.setFont(new Font("Tahoma", Font.PLAIN, 39));
	btnSumbit.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
	    }
	});
	btnSumbit.setBounds(550, 400, 350, 50);
	contentPane.add(btnSumbit);
}

}
