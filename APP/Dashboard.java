package APP;

import java.awt.EventQueue;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import acteurs.User;
import util.dbUtil;

public class Dashboard extends JFrame {

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
    public Dashboard(User user, dbUtil dbUtil) {

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

        JLabel lblMission = new JLabel("Mission");
        lblMission.setForeground(Color.BLACK);
        lblMission.setFont(new Font("Tahoma", Font.PLAIN, 39));
        lblMission.setBounds(150, 15, 400, 93);
        contentPane.add(lblMission);

        JLabel lblHero = new JLabel("Heros");
        lblHero.setForeground(Color.BLACK);
        lblHero.setFont(new Font("Tahoma", Font.PLAIN, 39));
        lblHero.setBounds(750, 25, 400, 93);
        contentPane.add(lblHero);

        JLabel lblVilain = new JLabel("Vilains");
        lblVilain.setForeground(Color.BLACK);
        lblVilain.setFont(new Font("Tahoma", Font.PLAIN, 39));
        lblVilain.setBounds(750, 175, 400, 93);
        contentPane.add(lblVilain);

        JLabel lblCivil = new JLabel("Civil");
        lblCivil.setForeground(Color.BLACK);
        lblCivil.setFont(new Font("Tahoma", Font.PLAIN, 39));
        lblCivil.setBounds(175, 250, 400, 90);
        contentPane.add(lblCivil);

        JLabel lblProbleme = new JLabel("Probleme");
        lblProbleme.setForeground(Color.BLACK);
        lblProbleme.setFont(new Font("Tahoma", Font.PLAIN, 39));
        lblProbleme.setBounds(150, 375, 400, 90);
        contentPane.add(lblProbleme);

        // ======== BEA ============ FRONT => OK | BACK => DEV =======
        JButton btnNewButton = new JButton("Incident");
        btnNewButton.setForeground(new Color(0, 0, 0));
        btnNewButton.setBackground(UIManager.getColor("Button.disabledForeground"));
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 25));
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                DeclarerIncident incident = new DeclarerIncident(user);
                // alert.setTitle();
                incident.setVisible(true);
                dispose();
            }
        });
        btnNewButton.setBounds(50, 120, 200, 40);
        contentPane.add(btnNewButton);

        JButton btnListRapport = new JButton("Rapport liste");
        btnListRapport.setForeground(new Color(0, 0, 0));
        btnListRapport.setBackground(UIManager.getColor("Button.disabledForeground"));
        btnListRapport.setFont(new Font("Tahoma", Font.PLAIN, 25));
        btnListRapport.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ListeRapport listeRapport = new ListeRapport(user, dbUtil);
                listeRapport.setTitle("Liste des rapports");
                listeRapport.setVisible(true);
                dispose();
            }
        });

        btnListRapport.setBounds(250, 175, 200, 40);
        contentPane.add(btnListRapport);

        JButton btnListMission = new JButton("Mission Liste");
        btnListMission.setForeground(new Color(0, 0, 0));
        btnListMission.setBackground(UIManager.getColor("Button.disabledForeground"));
        btnListMission.setFont(new Font("Tahoma", Font.PLAIN, 25));
        btnListMission.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ListeMission listeMission = new ListeMission(user, dbUtil);
                listeMission.setTitle("Mission Liste");
                listeMission.setVisible(true);
                dispose();
            }
        });
        btnListMission.setBounds(250, 120, 200, 40);
        contentPane.add(btnListMission);

        // ==========THIB============= FRONT => OK | BACK => DEV =======
        if ("CIVIL".equals(user.role)) {
            JButton button2 = new JButton("Formulaire Satisfaction");
            button2.setForeground(new Color(0, 0, 0));
            button2.setBackground(new Color(20, 150, 20));
            button2.setBackground(UIManager.getColor("Button.disabledForeground"));
            button2.setFont(new Font("Tahoma", Font.PLAIN, 39));
            button2.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    FormulaireSatisfaction formulaireSatisfaction = new FormulaireSatisfaction(user, dbUtil);
                    formulaireSatisfaction.setVisible(true);
                }
            });
            button2.setBounds(450, 275, 200, 50);
            contentPane.add(button2);
            dispose();

        }

        // ==========PIERRE======== FRONT => OK | BACK => DEV =========
        if ("ORGA".equals(user.role)) {
            JButton button3 = new JButton("Creer mission");
            button3.setForeground(new Color(0, 0, 0));
            button3.setBackground(new Color(20, 150, 20));
            button3.setBackground(UIManager.getColor("Button.disabledForeground"));
            button3.setFont(new Font("Tahoma", Font.PLAIN, 25));
            button3.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    CreateMission CreateMission = new CreateMission(user, dbUtil);
                    CreateMission.setTitle("Mission");
                    CreateMission.setVisible(true);
                    dispose();
                }
            });
            button3.setBounds(50, 175, 200, 40);
            contentPane.add(button3);
            dispose();

        }

        // ==========........======== FRONT => DEV | BACK => DEV =========
        if ("ORGA".equals(user.role)) {
            JButton button9 = new JButton("Liste Vilain");
            button9.setForeground(new Color(0, 0, 0));
            button9.setBackground(new Color(20, 150, 20));
            button9.setBackground(UIManager.getColor("Button.disabledForeground"));
            button9.setFont(new Font("Tahoma", Font.PLAIN, 25));
            button9.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    ListVilain list = new ListVilain(user);
                    list.setTitle("List Vilain");
                    list.setVisible(true);
                    dispose();
                }
            });
            button9.setBounds(700, 250, 200, 40);
            contentPane.add(button9);

        }

        // ==========PIERRE============ FRONT => OK | BACK => DEV ========
        if ("HEROS".equals(user.role) || "ORGA".equals(user.role)) {
            JButton button4 = new JButton("Rapport");
            button4.setForeground(new Color(0, 0, 0));
            button4.setBackground(new Color(20, 150, 20));
            button4.setBackground(UIManager.getColor("Button.disabledForeground"));
            button4.setFont(new Font("Tahoma", Font.PLAIN, 25));
            button4.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    RapportMission RapportMission = new RapportMission(user, dbUtil);
                    RapportMission.setTitle("Rapport");
                    RapportMission.setVisible(true);
                    dispose();
                }
            });
            button4.setBounds(100, 220, 250, 40);
            contentPane.add(button4);

            // ==========THIBAUT========== FRONT => DEV | BACK => DEV ==========
            JButton button5 = new JButton("Identifier Vilain");
            button5.setForeground(new Color(0, 0, 0));
            button5.setBackground(new Color(20, 150, 20));
            button5.setBackground(UIManager.getColor("Button.disabledForeground"));
            button5.setFont(new Font("Tahoma", Font.PLAIN, 25));
            button5.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    VilainList vilain = new VilainList(user, dbUtil);
                    vilain.setTitle("Identifier un Vilain");
                    vilain.setVisible(true);
                    dispose();
                }
            });
            button5.setBounds(700, 320, 200, 40);
            contentPane.add(button5);

        }

        // ==========THIBAUT========== FRONT => DEV | BACK => DEV ==========
        JButton buttonListHero = new JButton("Liste Heros");
        buttonListHero.setForeground(new Color(0, 0, 0));
        buttonListHero.setBackground(new Color(20, 150, 20));
        buttonListHero.setBackground(UIManager.getColor("Button.disabledForeground"));
        buttonListHero.setFont(new Font("Tahoma", Font.PLAIN, 25));
        buttonListHero.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ListHero vilain = new ListHero(user, dbUtil);
                vilain.setTitle("Liste Heros");
                vilain.setVisible(true);
                dispose();
            }
        });
        buttonListHero.setBounds(700, 100, 200, 40);
        contentPane.add(buttonListHero);

        // ==========NATHAN========FRONT => OK | BACK => DEV =======
        if ("ORGA".equals(user.role)) {
            JButton button6 = new JButton("Satisfaction Info");
            button6.setForeground(new Color(0, 0, 0));
            button6.setBackground(new Color(20, 150, 20));
            button6.setBackground(UIManager.getColor("Button.disabledForeground"));
            button6.setFont(new Font("Tahoma", Font.PLAIN, 25));
            button6.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    SatisfactionList list = new SatisfactionList(user);
                    list.setTitle("Liste des Satisfactions");
                    list.setVisible(true);
                    dispose();
                }
            });
            button6.setBounds(125, 325, 200, 40);
            contentPane.add(button6);

        }

        // ==========NATHAN======== FRONT => DEV | BACK => DEV ============
        JButton button7 = new JButton("Litige");
        button7.setForeground(new Color(0, 0, 0));
        button7.setBackground(new Color(20, 150, 20));
        button7.setBackground(UIManager.getColor("Button.disabledForeground"));
        button7.setFont(new Font("Tahoma", Font.PLAIN, 25));
        button7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Litige litige = new Litige(user, dbUtil);
                litige.setTitle("Creer un Litige");
                litige.setVisible(true);
                dispose();

            }
        });
        button7.setBounds(125, 480, 200, 40);
        contentPane.add(button7);

    }

}