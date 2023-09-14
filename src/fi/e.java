package fi;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class e extends JFrame {

	private JPanel contentPanereg;
	private JTextField tfregname;
	private JTextField tfregid;
	private JTextField tfregbirth;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					e frame = new e();
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
	public e() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 816, 524);
		contentPanereg = new JPanel();
		contentPanereg.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPanereg);
		contentPanereg.setLayout(null);
		
		JLabel lblreg = new JLabel("Registration");
		lblreg.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblreg.setHorizontalAlignment(SwingConstants.CENTER);
		lblreg.setBounds(328, 36, 181, 35);
		contentPanereg.add(lblreg);
		
		JLabel lblregname = new JLabel("Enter Your Name");
		lblregname.setFont(new Font("Sitka Text", Font.BOLD, 20));
		lblregname.setBounds(214, 91, 236, 35);
		contentPanereg.add(lblregname);
		
		tfregname = new JTextField();
		tfregname.setBounds(214, 126, 393, 27);
		contentPanereg.add(tfregname);
		tfregname.setColumns(10);
		
		tfregid = new JTextField();
		tfregid.setColumns(10);
		tfregid.setBounds(214, 199, 393, 27);
		contentPanereg.add(tfregid);
		
		JLabel lblEnterRegistrationId = new JLabel("Enter Registration ID");
		lblEnterRegistrationId.setFont(new Font("Sitka Text", Font.BOLD, 20));
		lblEnterRegistrationId.setBounds(214, 164, 236, 35);
		contentPanereg.add(lblEnterRegistrationId);
		
		tfregbirth = new JTextField();
		tfregbirth.setColumns(10);
		tfregbirth.setBounds(214, 272, 393, 27);
		contentPanereg.add(tfregbirth);
		
		JLabel lblEnterYourBirthdate = new JLabel("Enter Your Birthdate");
		lblEnterYourBirthdate.setFont(new Font("Sitka Text", Font.BOLD, 20));
		lblEnterYourBirthdate.setBounds(214, 237, 236, 35);
		contentPanereg.add(lblEnterYourBirthdate);
		
		JLabel lblreggen = new JLabel("Gender");
		lblreggen.setFont(new Font("Sitka Text", Font.BOLD, 20));
		lblreggen.setBounds(214, 310, 236, 35);
		contentPanereg.add(lblreggen);
		String[] reggender= { "Select", "Male", "Female" };
		JComboBox comboBoxreg = new JComboBox(reggender);
		comboBoxreg.setBounds(214, 339, 393, 35);
		contentPanereg.add(comboBoxreg);
		
		JButton btnreg = new JButton("Register");
		btnreg.setFont(new Font("Rockwell", Font.PLAIN, 19));
		btnreg.setBounds(359, 410, 117, 35);
		contentPanereg.add(btnreg);
		
		JButton btntregnot = new JButton("Log in");
		btntregnot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btntregnot.setBounds(681, 11, 89, 23);
		contentPanereg.add(btntregnot);
		
		JLabel lblregnot = new JLabel("Already registered?log in here");
		lblregnot.setBounds(487, 15, 197, 14);
		contentPanereg.add(lblregnot);
	}
}
