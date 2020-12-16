package APP;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import acteurs.User;

public class Litige extends JFrame{

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

	
	public Litige(User user) {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setBounds(450, 190, 1014, 597);
	    setResizable(false);
	    contentPane = new JPanel();
	    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	    setContentPane(contentPane);
	    contentPane.setLayout(null);
	    
	    
	}


	public Litige() {
		
	}

	
}
