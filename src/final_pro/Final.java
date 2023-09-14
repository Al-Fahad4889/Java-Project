package final_pro;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Final extends JFrame {

	private JPanel contentPanelogin;
	private JTextField tflogname;
	private JTextField tfid;
	private JTextField tfpass;
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
					Final frame = new Final();
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
	public Final() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 816, 524);
		login();
		setVisible(true);
	}

	void login() {
	contentPanelogin = new JPanel();
	contentPanelogin.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPanelogin);
	contentPanelogin.setLayout(null);
	
	JLabel lbllogname = new JLabel("Enter Your Name");
	lbllogname.setFont(new Font("Sitka Text", Font.BOLD, 20));
	lbllogname.setBounds(135, 88, 242, 46);
	contentPanelogin.add(lbllogname);
	
	tflogname = new JTextField();
	tflogname.setBounds(135, 145, 487, 35);
	contentPanelogin.add(tflogname);
	tflogname.setColumns(10);
	
	JLabel lbllogtitle = new JLabel("Log in");
	lbllogtitle.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
	lbllogtitle.setHorizontalAlignment(SwingConstants.CENTER);
	lbllogtitle.setBounds(297, 43, 220, 46);
	contentPanelogin.add(lbllogtitle);
	
	JLabel lblEnterYourId = new JLabel("Enter Your ID");
	lblEnterYourId.setFont(new Font("Sitka Text", Font.BOLD, 20));
	lblEnterYourId.setBounds(135, 191, 242, 46);
	contentPanelogin.add(lblEnterYourId);
	
	tfid = new JTextField();
	tfid.setColumns(10);
	tfid.setBounds(135, 248, 487, 35);
	contentPanelogin.add(tfid);
	
	JLabel lblEnterPassword = new JLabel("Enter Password");
	lblEnterPassword.setFont(new Font("Sitka Text", Font.BOLD, 20));
	lblEnterPassword.setBounds(135, 294, 242, 46);
	contentPanelogin.add(lblEnterPassword);
	
	tfpass = new JTextField();
	tfpass.setColumns(10);
	tfpass.setBounds(135, 351, 487, 35);
	contentPanelogin.add(tfpass);
	
	JButton btnlog = new JButton("Submit");
	btnlog.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		}
	});
	btnlog.setFont(new Font("Stencil", Font.PLAIN, 13));
	btnlog.setBounds(360, 425, 131, 35);
	contentPanelogin.add(btnlog);
	
	JLabel lbllognot = new JLabel("Haven't Registered?Register Here");
	lbllognot.setBounds(495, 0, 196, 35);
	contentPanelogin.add(lbllognot);
	
	JButton btnlognot = new JButton("Register");
	btnlognot.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		reg();	
		}
	});
	btnlognot.setBounds(701, 6, 89, 23);
	contentPanelogin.add(btnlognot);
	setVisible(true);
}
	void reg() {
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
		btnreg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnreg.setFont(new Font("Rockwell", Font.PLAIN, 19));
		btnreg.setBounds(359, 410, 117, 35);
		contentPanereg.add(btnreg);
		
		JButton btntregnot = new JButton("Log in");
		btntregnot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login();
			}
		});
		btntregnot.setBounds(681, 11, 89, 23);
		contentPanereg.add(btntregnot);
		
		JLabel lblregnot = new JLabel("Already registered?log in here");
		lblregnot.setBounds(487, 15, 197, 14);
		contentPanereg.add(lblregnot);
		setVisible(true);
	}
}

