package project;

import javax.swing.border.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class p extends JFrame {
	
	private JButton btdone,btdone2;
	private String reshem;
	private JPanel contentPane5, contentPane6;
	private JTextField tf;
	private JTextField tfname2;
	private JTextField tfage;
	private String cbcinfo;
	private String rescbc;
	private JPanel contentPane;
	private JPanel contentPane1;
	private JPanel contentPane2;
	private JPanel contentPane3;
	private JTextField tfName;
	private JLabel lblwelcome;
	private JLabel lblBMI;
	private JLabel lblBMIres,lblwc;
	private JLabel lblheight;
	private JLabel lblWeight;
	private JLabel lblhei;
	private JLabel lblwei;
	private JLabel lblres,lblwcpic,lblwcpic2;
	private JTextField tfwm;
	private JLabel lblwm;
	private JTextField tfpass;
	private JTextField tfWeight;
	private JTextField tfHeight;
	private JTextField tfres;
	private JTextPane textPane,tpwc;
	private String w1;
	private String h1;
	private String result;
	private double weight;
	private double height;
	private double res;
	private JLabel lblcbc,lblgender;
	private JLabel lblhem;
	private JLabel lblleu;
	private JLabel lblbsr;
	private JLabel lbltrom;
	private JLabel lblhema;
	private JLabel lblltc;
	private JLabel lblmchc;
	private JLabel lblmch;
	private JLabel lblmcv;
	private JLabel lblery;
	private JLabel lblmono;
	private JLabel lbllym;
	private JLabel lblneu;
	private JLabel lblbas;
	private JLabel lbleo;
	private JLabel lbloplogo;
	private JLabel lblbmicon;
	private JLabel lblbmicon2;
	private JLabel lblcbcicon;
	private JLabel lblcbcicon2, lblcbcres2, lblcbcres3, lblcbcres4,lblSelectRegion;
	private double hem;
	private double leu;
	private double bsr;
	private double trom;
	private double hema;
	private double ltc;
	private double mchc;
	private double mch;
	private double mcv;
	private double ery;
	private double mono;
	private double lym;
	private double neu;
	private double bas;
	private double eo;
	private JTextField tfhem;
	private JTextField tfleu;
	private JTextField tfbsr;
	private JTextField tftrom;
	private JTextField tfhema;
	private JTextField tfltc;
	private JTextField tfmchc;
	private JTextField tfmch;
	private JTextField tfmcv;
	private JTextField tfery;
	private JTextField tfmono;
	private JTextField tflym;
	private JTextField tfneu;
	private JTextField tfbas;
	private JTextField tfeo;
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tf3;
	private JTextField tf4;
	private JTextField tf5;
	private JTextField tf6;
	private JTextField tf7;
	private JTextField tf8;
	private JTextField tf9;
	private JTextField tf10;
	private JTextField tf11;
	private JTextField tf12;
	private JTextField tf13;
	private JTextField tf14;
	private JTextField tf15;
	private JTextField tfOk;
	private JTextField tfresn;
	private JTextField tfresa,tfreg2;
	private JTextField tfresgen,tfwcres;
	private JPasswordField tppass;
	private JPanel contentPane7;
	private JLabel lblwcinfo,lblwcname,lblwcage,lblwcmes;
	private JButton btwcinfo;
	private JComboBox regionbox;
	private JTextField tfwcname;
	private JTextField tfwcage;
	private JTextField tfwcmes;
	private JComboBox comboBox,comboBox2,comboBox3;
	private int c = 0;
	private Font fname = new Font("Times New Roman", Font.BOLD, 25);

	/**
	 * Launch the application. input 
	 * underweight:30 152 
	 * healthy:50 152 
	 * overweight:60
	 * 152 obesity 1:70 152 
	 * obesity 2:90 152 
	 * obesity 3:100 152
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					p frame = new p();
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
	public p() {
		setTitle("Elixir");

		ImageIcon im1 = new ImageIcon("1.jpg");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setIconImage(im1.getImage());
		setBounds(100, 100, 818, 545);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(SystemColor.window);
		setContentPane(contentPane);
		contentPane.setLayout(null);

		lbloplogo = new JLabel("");
		lbloplogo.setHorizontalAlignment(SwingConstants.CENTER);
		lbloplogo.setIcon(new ImageIcon("2.JPG"));
		lbloplogo.setBounds(266, 23, 272, 192);
		contentPane.add(lbloplogo);

		Font fname = new Font("Lucida Calligraphy", Font.BOLD, 26);
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(193, 187, 99, 28);
		lblNewLabel.setFont(fname);
		contentPane.add(lblNewLabel);

		tfName = new JTextField();
		tfName.setBounds(193, 247, 436, 28);
		contentPane.add(tfName);
		tfName.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(193, 305, 157, 28);
		lblNewLabel_1.setFont(fname);
		contentPane.add(lblNewLabel_1);

		tppass = new JPasswordField();
		tppass.setBounds(193, 358, 436, 28);
		contentPane.add(tppass);
		tppass.setColumns(10);

		JButton btnnew = new JButton("Submit");
		btnnew.setFont(new Font("Agency FB", Font.BOLD, 25));
		btnnew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String t = tfName.getText();
				String t1 = tppass.getText();
				String n = "F";
				String pass = "C";
				int a = t.compareTo(n);
				int b = t1.compareTo(pass);
				contentPane1 = new JPanel();
				contentPane1.setBorder(new EmptyBorder(5, 5, 5, 5));
				setContentPane(contentPane1);
				contentPane1.setBackground(SystemColor.window);
				contentPane1.setLayout(null);
				Font f2 = new Font("Times New Roman", Font.BOLD, 15);
				lblwelcome = new JLabel("");
				contentPane1.add(lblwelcome);

				if (a == 0 && b == 0) {
					app();
				} else {

					Font f = new Font("Times New Roman", Font.BOLD, 25);
					lblwelcome.setHorizontalAlignment(SwingConstants.CENTER);
					lblwelcome.setFont(f);
					lblwelcome.setBounds(100, 100, 300, 100);
					lblwelcome.setText("Wrong id or password");
				}
			}
		});
		btnnew.setBounds(338, 427, 142, 50);
		contentPane.add(btnnew);

	}

	void app() {
		Font fname = new Font("Times New Roman", Font.BOLD, 25);
		Font f = new Font("Times New Roman", Font.BOLD, 25);
		lblwelcome.setHorizontalAlignment(SwingConstants.CENTER);
		lblwelcome.setFont(new Font("Algerian", Font.BOLD, 25));
		lblwelcome.setBounds(264, 22, 220, 100);
		lblwelcome.setText("welcome");

		lblbmicon = new JLabel("");
		lblbmicon.setHorizontalAlignment(SwingConstants.CENTER);
		lblbmicon.setIcon(new ImageIcon("7.4.JPG"));
		lblbmicon.setBackground(SystemColor.window);
		lblbmicon.setBounds(133, 118, 195, 150);
		contentPane1.add(lblbmicon);

		lblbmicon2 = new JLabel("Body Mass Index");
		lblbmicon2.setFont(new Font("Bell MT", Font.BOLD, 25));
		lblbmicon2.setHorizontalAlignment(SwingConstants.CENTER);
		lblbmicon2.setBounds(133, 266, 195, 33);
		contentPane1.add(lblbmicon2);

		JButton btnnew2 = new JButton("BMI");
		Font fbmi = new Font("Copperplate Gothic Light", Font.BOLD, 25);
		btnnew2.setFont(fbmi);
		btnnew2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bmi();
			}
		});
		btnnew2.setBounds(135, 310, 195, 83);
		contentPane1.add(btnnew2);

		lblcbcicon = new JLabel("");
		lblcbcicon.setHorizontalAlignment(SwingConstants.CENTER);
		lblcbcicon.setIcon(new ImageIcon("4.365.JPG"));
		lblcbcicon.setBounds(446, 120, 195, 148);
		contentPane1.add(lblcbcicon);

		lblcbcicon2 = new JLabel("Complete Blood Count");
		lblcbcicon2.setFont(new Font("Bell MT", Font.BOLD, 19));
		lblcbcicon2.setHorizontalAlignment(SwingConstants.CENTER);
		lblcbcicon2.setBounds(446, 268, 195, 33);
		contentPane1.add(lblcbcicon2);

		JButton btnnew3 = new JButton("CBC Test");
		btnnew3.setFont(fbmi);
		btnnew3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cbcinfo();
			}
		});
		btnnew3.setBounds(446, 310, 195, 83);
		contentPane1.add(btnnew3);
		getContentPane().add(contentPane1);
		setVisible(true);
	}

	void cbc() {
		contentPane2 = new JPanel();
		contentPane2.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane2);
		contentPane2.setBackground(SystemColor.window);
		contentPane2.setLayout(null);

		lblcbc = new JLabel("");
		lblcbc.setHorizontalAlignment(SwingConstants.CENTER);
		lblcbc.setVerticalAlignment(SwingConstants.CENTER);
		lblcbc.setBounds(176, 11, 427, 53);
		lblcbc.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblcbc.setOpaque(true);
		lblcbc.setBackground(SystemColor.window);
		contentPane2.add(lblcbc);
		lblcbc.setText("Hematology Examination Result");

		lblhem = new JLabel("Hemoglobin");
		lblhem.setBounds(59, 97, 173, 20);
		lblhem.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblhem.setHorizontalAlignment(SwingConstants.CENTER);
		lblhem.setOpaque(true);
		lblhem.setBackground(new Color(176, 224, 230));
		contentPane2.add(lblhem);

		tf2 = new JTextField();
		tf2.setBounds(59, 134, 173, 20);
		contentPane2.add(tf2);
		tf2.setColumns(10);

		lblleu = new JLabel("Leukocyte");
		lblleu.setBounds(59, 162, 173, 20);
		lblleu.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblleu.setHorizontalAlignment(SwingConstants.CENTER);
		lblleu.setOpaque(true);
		lblleu.setBackground(new Color(176, 224, 230));
		contentPane2.add(lblleu);

		tf3 = new JTextField();
		tf3.setColumns(10);
		tf3.setBounds(59, 198, 173, 20);
		contentPane2.add(tf3);

		lblbsr = new JLabel("Blood Sedimentation rate");
		lblbsr.setBounds(59, 229, 173, 20);
		lblbsr.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblbsr.setHorizontalAlignment(SwingConstants.CENTER);
		lblbsr.setOpaque(true);
		lblbsr.setBackground(new Color(176, 224, 230));
		contentPane2.add(lblbsr);

		tf4 = new JTextField();
		tf4.setColumns(10);
		tf4.setBounds(59, 254, 173, 20);
		contentPane2.add(tf4);

		lbltrom = new JLabel("Trombosite Amount");
		lbltrom.setBounds(59, 285, 173, 20);
		lbltrom.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbltrom.setHorizontalAlignment(SwingConstants.CENTER);
		lbltrom.setOpaque(true);
		lbltrom.setBackground(new Color(176, 224, 230));
		contentPane2.add(lbltrom);

		tf5 = new JTextField();
		tf5.setColumns(10);
		tf5.setBounds(59, 310, 173, 20);
		contentPane2.add(tf5);

		lblhema = new JLabel("Hematocrite");
		lblhema.setBounds(59, 341, 173, 20);
		lblhema.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblhema.setHorizontalAlignment(SwingConstants.CENTER);
		lblhema.setOpaque(true);
		lblhema.setBackground(new Color(176, 224, 230));
		contentPane2.add(lblhema);

		tf6 = new JTextField();
		tf6.setColumns(10);
		tf6.setBounds(59, 366, 173, 20);
		contentPane2.add(tf6);

		tf7 = new JTextField();
		tf7.setColumns(10);
		tf7.setBounds(311, 366, 173, 20);
		contentPane2.add(tf7);

		lblltc = new JLabel("Leukocytes type count");
		lblltc.setBounds(311, 341, 173, 20);
		lblltc.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblltc.setHorizontalAlignment(SwingConstants.CENTER);
		lblltc.setOpaque(true);
		lblltc.setBackground(new Color(176, 224, 230));
		contentPane2.add(lblltc);

		tf8 = new JTextField();
		tf8.setColumns(10);
		tf8.setBounds(311, 310, 173, 20);
		contentPane2.add(tf8);

		lblmchc = new JLabel("MCHC");
		lblmchc.setBounds(311, 285, 173, 20);
		lblmchc.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblmchc.setHorizontalAlignment(SwingConstants.CENTER);
		lblmchc.setOpaque(true);
		lblmchc.setBackground(new Color(176, 224, 230));
		contentPane2.add(lblmchc);

		tf9 = new JTextField();
		tf9.setColumns(10);
		tf9.setBounds(311, 254, 173, 20);
		contentPane2.add(tf9);

		lblmch = new JLabel("MCH");
		lblmch.setBounds(311, 229, 173, 20);
		lblmch.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblmch.setHorizontalAlignment(SwingConstants.CENTER);
		lblmch.setOpaque(true);
		lblmch.setBackground(new Color(176, 224, 230));
		contentPane2.add(lblmch);

		tf10 = new JTextField();
		tf10.setColumns(10);
		tf10.setBounds(311, 198, 173, 20);
		contentPane2.add(tf10);

		lblmcv = new JLabel("MCV");
		lblmcv.setBounds(311, 162, 173, 20);
		lblmcv.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblmcv.setHorizontalAlignment(SwingConstants.CENTER);
		lblmcv.setOpaque(true);
		lblmcv.setBackground(new Color(176, 224, 230));
		contentPane2.add(lblmcv);

		tf11 = new JTextField();
		tf11.setColumns(10);
		tf11.setBounds(311, 134, 173, 20);
		contentPane2.add(tf11);

		lblery = new JLabel("Erythrocyte");
		lblery.setBounds(311, 97, 173, 20);
		lblery.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblery.setHorizontalAlignment(SwingConstants.CENTER);
		lblery.setOpaque(true);
		lblery.setBackground(new Color(176, 224, 230));
		contentPane2.add(lblery);

		tf12 = new JTextField();
		tf12.setColumns(10);
		tf12.setBounds(567, 366, 173, 20);
		contentPane2.add(tf12);

		lblmono = new JLabel("Monocytes");
		lblmono.setBounds(567, 341, 173, 20);
		lblmono.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblmono.setHorizontalAlignment(SwingConstants.CENTER);
		lblmono.setOpaque(true);
		lblmono.setBackground(new Color(176, 224, 230));
		contentPane2.add(lblmono);

		tf13 = new JTextField();
		tf13.setColumns(10);
		tf13.setBounds(567, 310, 173, 20);
		contentPane2.add(tf13);

		lbllym = new JLabel("Lymphocytes");
		lbllym.setBounds(567, 285, 173, 20);
		lbllym.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbllym.setHorizontalAlignment(SwingConstants.CENTER);
		lbllym.setOpaque(true);
		lbllym.setBackground(new Color(176, 224, 230));
		contentPane2.add(lbllym);

		tf14 = new JTextField();
		tf14.setColumns(10);
		tf14.setBounds(567, 254, 173, 20);
		contentPane2.add(tf14);

		lblneu = new JLabel("Neutrophil");
		lblneu.setBounds(567, 229, 173, 20);
		lblneu.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblneu.setHorizontalAlignment(SwingConstants.CENTER);
		lblneu.setOpaque(true);
		lblneu.setBackground(new Color(176, 224, 230));
		contentPane2.add(lblneu);

		tf15 = new JTextField();
		tf15.setColumns(10);
		tf15.setBounds(567, 198, 173, 20);
		contentPane2.add(tf15);

		lblbas = new JLabel("Basophil");
		lblbas.setBounds(567, 162, 173, 20);
		lblbas.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblbas.setHorizontalAlignment(SwingConstants.CENTER);
		lblbas.setOpaque(true);
		lblbas.setBackground(new Color(176, 224, 230));
		contentPane2.add(lblbas);

		tf1 = new JTextField();
		tf1.setColumns(10);
		tf1.setBounds(567, 134, 173, 20);
		contentPane2.add(tf1);

		lbleo = new JLabel("Eosinophil");
		lbleo.setBounds(567, 97, 173, 20);
		lbleo.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbleo.setHorizontalAlignment(SwingConstants.CENTER);
		lbleo.setOpaque(true);
		lbleo.setBackground(new Color(176, 224, 230));
		contentPane2.add(lbleo);

		JButton btagain = new JButton("Check");
		btagain.setFont(new Font("Stencil", Font.PLAIN, 25));
		btagain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cbcres();
				JButton btagain = new JButton("Check Again");
				btagain.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						cbc();
					}
				});
				btagain.setBounds(315, 445, 142, 50);
				contentPane3.add(btagain);
			}

		});
		btagain.setBounds(315, 445, 142, 50);
		contentPane2.add(btagain);

		JButton btback = new JButton("<< Back");
		btback.setFont(new Font("Stencil", Font.PLAIN, 25));
		btback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				remove(lblcbc);
				remove(lblhem);
				remove(lblcbcres2);
				remove(lblleu);
				remove(lblbsr);
				remove(lbltrom);
				remove(lblhema);
				remove(lblltc);
				remove(lblmchc);
				remove(lblmch);
				remove(lblmcv);
				remove(lblery);
				remove(lblmono);
				remove(lbllym);
				remove(lblneu);
				remove(lblbas);
				remove(lbleo);
				remove(tf1);
				remove(tf2);
				remove(tf3);
				remove(tf4);
				remove(tf5);
				remove(tf6);
				remove(tf7);
				remove(tf8);
				remove(tf9);
				remove(tf10);
				remove(tf11);
				remove(tf12);
				remove(tf13);
				remove(tf14);
				remove(tf15);
				remove(btagain);
				remove(btback);
				setVisible(false);
				app();
			}
		});
		btback.setBounds(639, 11, 153, 44);
		contentPane2.add(btback);
		lblcbcres2 = new JLabel("");
		lblcbcres2.setIcon(new ImageIcon("18.jpg"));

		lblcbcres2.setHorizontalAlignment(SwingConstants.CENTER);
		lblcbcres2.setBounds(0, 0, 802, 506);
		contentPane2.add(lblcbcres2);
	}

	void cbcres() {

		contentPane3 = new JPanel();
		contentPane3.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane3.setBackground(SystemColor.window);
		setContentPane(contentPane3);
		contentPane3.setLayout(null);

		JLabel lblresname = new JLabel("Name");
		lblresname.setBounds(51, 76, 46, 14);
		getContentPane().add(lblresname);

		tfresn = new JTextField();
		tfresn.setBounds(85, 75, 137, 20);
		tfresn.setText(tfname2.getText());
		getContentPane().add(tfresn);
		tfresn.setColumns(10);

		JLabel lblresage = new JLabel("Age");
		lblresage.setBounds(320, 76, 46, 14);
		getContentPane().add(lblresage);

		tfresa = new JTextField();
		tfresa.setColumns(10);
		tfresa.setBounds(352, 76, 137, 20);
		tfresa.setText(tfage.getText());
		getContentPane().add(tfresa);

		JLabel lblresgen = new JLabel("Gender");
		lblresgen.setBounds(553, 79, 46, 14);
		getContentPane().add(lblresgen);

		tfresgen = new JTextField();
		tfresgen.setColumns(10);
		tfresgen.setBounds(597, 76, 128, 20);
		tfresgen.setText(comboBox.getSelectedItem().toString());
		getContentPane().add(tfresgen);

		lblcbc = new JLabel("");
		lblcbc.setHorizontalAlignment(SwingConstants.CENTER);
		lblcbc.setVerticalAlignment(SwingConstants.TOP);
		lblcbc.setBounds(204, 11, 427, 53);
		Font fcheck = new Font("Times New Roman", Font.BOLD, 25);
		lblcbc.setFont(fcheck);
		contentPane3.add(lblcbc);
		lblcbc.setText("CBC Test Result");

		lblhem = new JLabel("Hemoglobin");
		lblhem.setBounds(51, 142, 113, 26);
		contentPane3.add(lblhem);

		tfhem = new JTextField();
		tfhem.setBounds(51, 179, 173, 20);
		contentPane3.add(tfhem);
		tfhem.setColumns(10);
		reshem = tf2.getText();
		hem = Double.parseDouble(reshem);
		rescbc = hem + "";
		tfhem.setText(rescbc);
		
		String fe="Female";
		String fe2=comboBox.getSelectedItem().toString();
		int fe3=fe.compareTo(fe2);
		int fe4=0;
		if(fe3==0)
		{
			fe4=1;
		}
		if(fe4==0) {
			if (hem >= 13 && hem <= 18) {
				tfOk = new JTextField();
				tfOk.setBackground(Color.GREEN);
				tfOk.setEditable(false);
				tfOk.setHorizontalAlignment(SwingConstants.LEADING);
				tfOk.setBounds(234, 179, 27, 20);
				contentPane3.add(tfOk);
				tfOk.setColumns(10);
			} else {
				tfOk = new JTextField();
				tfOk.setBackground(Color.red);
				tfOk.setEditable(false);
				tfOk.setHorizontalAlignment(SwingConstants.LEADING);
				tfOk.setBounds(234, 179, 27, 20);
				contentPane3.add(tfOk);
				tfOk.setColumns(10);
			}
		}
		else {
			if (hem >= 12 && hem <= 16) {
				tfOk = new JTextField();
				tfOk.setBackground(Color.GREEN);
				tfOk.setEditable(false);
				tfOk.setHorizontalAlignment(SwingConstants.LEADING);
				tfOk.setBounds(234, 179, 27, 20);
				contentPane3.add(tfOk);
				tfOk.setColumns(10);
			} else {
				tfOk = new JTextField();
				tfOk.setBackground(Color.red);
				tfOk.setEditable(false);
				tfOk.setHorizontalAlignment(SwingConstants.LEADING);
				tfOk.setBounds(234, 179, 27, 20);
				contentPane3.add(tfOk);
				tfOk.setColumns(10);
			}
		}

		lblleu = new JLabel("Leukocyte");
		lblleu.setBounds(51, 207, 113, 36);
		contentPane3.add(lblleu);

		tfleu = new JTextField();
		tfleu.setBounds(51, 243, 173, 20);
		contentPane3.add(tfleu);
		tfleu.setColumns(10);
		reshem = tf3.getText();
		leu = Double.parseDouble(reshem);
		rescbc = leu + "";
		tfleu.setText(rescbc);
		if (leu >= 3.2 && leu <= 10) {
			tfOk = new JTextField();
			tfOk.setBackground(Color.GREEN);
			tfOk.setEditable(false);
			tfOk.setHorizontalAlignment(SwingConstants.LEADING);
			tfOk.setBounds(234, 243, 27, 20);
			contentPane3.add(tfOk);
			tfOk.setColumns(10);
		} else {
			tfOk = new JTextField();
			tfOk.setBackground(Color.red);
			tfOk.setEditable(false);
			tfOk.setHorizontalAlignment(SwingConstants.LEADING);
			tfOk.setBounds(234, 243, 27, 20);
			contentPane3.add(tfOk);
			tfOk.setColumns(10);
		}

		lblbsr = new JLabel("Blood Sedimentation rate");
		lblbsr.setBounds(51, 274, 173, 14);
		contentPane3.add(lblbsr);

		tfbsr = new JTextField();
		tfbsr.setBounds(51, 299, 173, 20);
		contentPane3.add(tfbsr);
		tfbsr.setColumns(10);
		reshem = tf4.getText();
		bsr = Double.parseDouble(reshem);
		rescbc = bsr + "";
		tfbsr.setText(rescbc);
		if (bsr >= 0 && bsr <= 15) {
			tfOk = new JTextField();
			tfOk.setBackground(Color.GREEN);
			tfOk.setEditable(false);
			tfOk.setHorizontalAlignment(SwingConstants.LEADING);
			tfOk.setBounds(234, 299, 27, 20);
			contentPane3.add(tfOk);
			tfOk.setColumns(10);
		} else {
			tfOk = new JTextField();
			tfOk.setBackground(Color.red);
			tfOk.setEditable(false);
			tfOk.setHorizontalAlignment(SwingConstants.LEADING);
			tfOk.setBounds(234, 299, 27, 20);
			contentPane3.add(tfOk);
			tfOk.setColumns(10);
		}

		lbltrom = new JLabel("Trombosite Amount");
		lbltrom.setBounds(51, 330, 173, 14);
		contentPane3.add(lbltrom);

		tftrom = new JTextField();
		tftrom.setColumns(10);
		tftrom.setBounds(51, 355, 173, 20);
		contentPane3.add(tftrom);
		reshem = tf5.getText();
		trom = Double.parseDouble(reshem);
		rescbc = trom + "";
		tftrom.setText(rescbc);
		if (trom >= 170 && trom <= 380) {
			tfOk = new JTextField();
			tfOk.setBackground(Color.GREEN);
			tfOk.setEditable(false);
			tfOk.setHorizontalAlignment(SwingConstants.LEADING);
			tfOk.setBounds(234, 355, 27, 20);
			contentPane3.add(tfOk);
			tfOk.setColumns(10);
		} else {
			tfOk = new JTextField();
			tfOk.setBackground(Color.red);
			tfOk.setEditable(false);
			tfOk.setHorizontalAlignment(SwingConstants.LEADING);
			tfOk.setBounds(234, 355, 27, 20);
			contentPane3.add(tfOk);
			tfOk.setColumns(10);
		}

		lblhema = new JLabel("Hematocrite");
		lblhema.setBounds(51, 386, 173, 14);
		contentPane3.add(lblhema);

		tfhema = new JTextField();
		tfhema.setColumns(10);
		tfhema.setBounds(51, 411, 173, 20);
		contentPane3.add(tfhema);
		reshem = tf6.getText();
		hema = Double.parseDouble(reshem);
		rescbc = hema + "";
		tfhema.setText(rescbc);
		if(fe4==0) {
			if (hema >= 40 && hema <= 50) {
				tfOk = new JTextField();
				tfOk.setBackground(Color.GREEN);
				tfOk.setEditable(false);
				tfOk.setHorizontalAlignment(SwingConstants.LEADING);
				tfOk.setBounds(234, 411, 27, 20);
				contentPane3.add(tfOk);
				tfOk.setColumns(10);
			} else {
				tfOk = new JTextField();
				tfOk.setBackground(Color.red);
				tfOk.setEditable(false);
				tfOk.setHorizontalAlignment(SwingConstants.LEADING);
				tfOk.setBounds(234, 411, 27, 20);
				contentPane3.add(tfOk);
				tfOk.setColumns(10);
			}
		}
		else {
			if (hema >= 35 && hema <= 45) {
				tfOk = new JTextField();
				tfOk.setBackground(Color.GREEN);
				tfOk.setEditable(false);
				tfOk.setHorizontalAlignment(SwingConstants.LEADING);
				tfOk.setBounds(234, 411, 27, 20);
				contentPane3.add(tfOk);
				tfOk.setColumns(10);
			} else {
				tfOk = new JTextField();
				tfOk.setBackground(Color.red);
				tfOk.setEditable(false);
				tfOk.setHorizontalAlignment(SwingConstants.LEADING);
				tfOk.setBounds(234, 411, 27, 20);
				contentPane3.add(tfOk);
				tfOk.setColumns(10);
			}
		}

		lblltc = new JLabel("Leukocytes type count");
		lblltc.setBounds(303, 386, 173, 14);
		contentPane3.add(lblltc);

		tfltc = new JTextField();
		tfltc.setColumns(10);
		tfltc.setBounds(303, 411, 173, 20);
		contentPane3.add(tfltc);
		reshem = tf7.getText();
		ltc = Double.parseDouble(reshem);
		rescbc = ltc + "";
		tfltc.setText(rescbc);
		if (ltc >= 4.4 && ltc <= 5.6) {
			tfOk = new JTextField();
			tfOk.setBackground(Color.GREEN);
			tfOk.setEditable(false);
			tfOk.setHorizontalAlignment(SwingConstants.LEADING);
			tfOk.setBounds(486, 411, 27, 20);
			contentPane3.add(tfOk);
			tfOk.setColumns(10);
		} else {
			tfOk = new JTextField();
			tfOk.setBackground(Color.red);
			tfOk.setEditable(false);
			tfOk.setHorizontalAlignment(SwingConstants.LEADING);
			tfOk.setBounds(486, 411, 27, 20);
			contentPane3.add(tfOk);
			tfOk.setColumns(10);
		}

		lblmchc = new JLabel("MCHC");
		lblmchc.setBounds(303, 330, 46, 14);
		contentPane3.add(lblmchc);

		tfmchc = new JTextField();
		tfmchc.setColumns(10);
		tfmchc.setBounds(303, 355, 173, 20);
		contentPane3.add(tfmchc);
		reshem = tf8.getText();
		mchc = Double.parseDouble(reshem);
		rescbc = mchc + "";
		tfmchc.setText(rescbc);
		if (mchc >= 32 && mchc <= 36) {
			tfOk = new JTextField();
			tfOk.setBackground(Color.GREEN);
			tfOk.setEditable(false);
			tfOk.setHorizontalAlignment(SwingConstants.LEADING);
			tfOk.setBounds(486, 355, 27, 20);
			contentPane3.add(tfOk);
			tfOk.setColumns(10);
		} else {
			tfOk = new JTextField();
			tfOk.setBackground(Color.red);
			tfOk.setEditable(false);
			tfOk.setHorizontalAlignment(SwingConstants.LEADING);
			tfOk.setBounds(486, 355, 27, 20);
			contentPane3.add(tfOk);
			tfOk.setColumns(10);
		}

		lblmch = new JLabel("MCH");
		lblmch.setBounds(303, 274, 46, 14);
		contentPane3.add(lblmch);

		tfmch = new JTextField();
		tfmch.setColumns(10);
		tfmch.setBounds(303, 299, 173, 20);
		contentPane3.add(tfmch);
		reshem = tf9.getText();
		mch = Double.parseDouble(reshem);
		rescbc = mch + "";
		tfmch.setText(rescbc);
		if (mch >= 28 && mch <= 34) {
			tfOk = new JTextField();
			tfOk.setBackground(Color.GREEN);
			tfOk.setEditable(false);
			tfOk.setHorizontalAlignment(SwingConstants.LEADING);
			tfOk.setBounds(486, 299, 27, 20);
			contentPane3.add(tfOk);
			tfOk.setColumns(10);
		} else {
			tfOk = new JTextField();
			tfOk.setBackground(Color.red);
			tfOk.setEditable(false);
			tfOk.setHorizontalAlignment(SwingConstants.LEADING);
			tfOk.setBounds(486, 299, 27, 20);
			contentPane3.add(tfOk);
			tfOk.setColumns(10);
		}

		lblmcv = new JLabel("MCV");
		lblmcv.setBounds(303, 207, 113, 36);
		contentPane3.add(lblmcv);

		tfmcv = new JTextField();
		tfmcv.setColumns(10);
		tfmcv.setBounds(303, 243, 173, 20);
		contentPane3.add(tfmcv);
		reshem = tf10.getText();
		mcv = Double.parseDouble(reshem);
		rescbc = mcv + "";
		tfmcv.setText(rescbc);
		if (mcv >= 80 && mcv <= 100) {
			tfOk = new JTextField();
			tfOk.setBackground(Color.GREEN);
			tfOk.setEditable(false);
			tfOk.setHorizontalAlignment(SwingConstants.LEADING);
			tfOk.setBounds(486, 243, 27, 20);
			contentPane3.add(tfOk);
			tfOk.setColumns(10);
		} else {
			tfOk = new JTextField();
			tfOk.setBackground(Color.red);
			tfOk.setEditable(false);
			tfOk.setHorizontalAlignment(SwingConstants.LEADING);
			tfOk.setBounds(486, 243, 27, 20);
			contentPane3.add(tfOk);
			tfOk.setColumns(10);
		}

		lblery = new JLabel("Erythrocyte");
		lblery.setBounds(303, 142, 113, 26);
		contentPane3.add(lblery);

		tfery = new JTextField();
		tfery.setColumns(10);
		tfery.setBounds(303, 179, 173, 20);
		contentPane3.add(tfery);
		reshem = tf11.getText();
		ery = Double.parseDouble(reshem);
		rescbc = ery + "";
		tfery.setText(rescbc);
		if(fe4==0) {
			if (ery >= 4.4 && ery <= 5.6) {
				tfOk = new JTextField();
				tfOk.setBackground(Color.GREEN);
				tfOk.setEditable(false);
				tfOk.setHorizontalAlignment(SwingConstants.LEADING);
				tfOk.setBounds(486, 179, 27, 20);
				contentPane3.add(tfOk);
				tfOk.setColumns(10);
			} else {
				tfOk = new JTextField();
				tfOk.setBackground(Color.red);
				tfOk.setEditable(false);
				tfOk.setHorizontalAlignment(SwingConstants.LEADING);
				tfOk.setBounds(486, 179, 27, 20);
				contentPane3.add(tfOk);
				tfOk.setColumns(10);
			}
		}
		else {
			if (ery >= 3.8 && ery <= 5.0) {
				tfOk = new JTextField();
				tfOk.setBackground(Color.GREEN);
				tfOk.setEditable(false);
				tfOk.setHorizontalAlignment(SwingConstants.LEADING);
				tfOk.setBounds(486, 179, 27, 20);
				contentPane3.add(tfOk);
				tfOk.setColumns(10);
			} else {
				tfOk = new JTextField();
				tfOk.setBackground(Color.red);
				tfOk.setEditable(false);
				tfOk.setHorizontalAlignment(SwingConstants.LEADING);
				tfOk.setBounds(486, 179, 27, 20);
				contentPane3.add(tfOk);
				tfOk.setColumns(10);
			}
		}

		lblmono = new JLabel("Monocyte");
		lblmono.setBounds(559, 386, 173, 14);
		contentPane3.add(lblmono);

		tfmono = new JTextField();
		tfmono.setColumns(10);
		tfmono.setBounds(559, 411, 173, 20);
		contentPane3.add(tfmono);
		reshem = tf12.getText();
		mono = Double.parseDouble(reshem);
		rescbc = mono + "";
		tfmono.setText(rescbc);
		if (mono >= 0 && mono <= 10) {
			tfOk = new JTextField();
			tfOk.setBackground(Color.GREEN);
			tfOk.setEditable(false);
			tfOk.setHorizontalAlignment(SwingConstants.LEADING);
			tfOk.setBounds(742, 411, 27, 20);
			contentPane3.add(tfOk);
			tfOk.setColumns(10);
		} else {
			tfOk = new JTextField();
			tfOk.setBackground(Color.red);
			tfOk.setEditable(false);
			tfOk.setHorizontalAlignment(SwingConstants.LEADING);
			tfOk.setBounds(742, 411, 27, 20);
			contentPane3.add(tfOk);
			tfOk.setColumns(10);
		}

		lbllym = new JLabel("Lymphocytes");
		lbllym.setBounds(559, 330, 173, 14);
		contentPane3.add(lbllym);

		tflym = new JTextField();
		tflym.setColumns(10);
		tflym.setBounds(559, 355, 173, 20);
		contentPane3.add(tflym);
		reshem = tf13.getText();
		lym = Double.parseDouble(reshem);
		rescbc = lym + "";
		tflym.setText(rescbc);
		if (lym >= 15 && lym <= 45) {
			tfOk = new JTextField();
			tfOk.setBackground(Color.GREEN);
			tfOk.setEditable(false);
			tfOk.setHorizontalAlignment(SwingConstants.LEADING);
			tfOk.setBounds(742, 355, 27, 20);
			contentPane3.add(tfOk);
			tfOk.setColumns(10);
		} else {
			tfOk = new JTextField();
			tfOk.setBackground(Color.red);
			tfOk.setEditable(false);
			tfOk.setHorizontalAlignment(SwingConstants.LEADING);
			tfOk.setBounds(742, 355, 27, 20);
			contentPane3.add(tfOk);
			tfOk.setColumns(10);
		}

		lblneu = new JLabel("Neutrophil");
		lblneu.setBounds(559, 274, 173, 14);
		contentPane3.add(lblneu);

		tfneu = new JTextField();
		tfneu.setColumns(10);
		tfneu.setBounds(559, 299, 173, 20);
		contentPane3.add(tfneu);
		reshem = tf14.getText();
		neu = Double.parseDouble(reshem);
		rescbc = neu + "";
		tfneu.setText(rescbc);
		if (neu >= 36 && neu <= 73) {
			tfOk = new JTextField();
			tfOk.setBackground(Color.GREEN);
			tfOk.setEditable(false);
			tfOk.setHorizontalAlignment(SwingConstants.LEADING);
			tfOk.setBounds(742, 299, 27, 20);
			contentPane3.add(tfOk);
			tfOk.setColumns(10);
		} else {
			tfOk = new JTextField();
			tfOk.setBackground(Color.red);
			tfOk.setEditable(false);
			tfOk.setHorizontalAlignment(SwingConstants.LEADING);
			tfOk.setBounds(742, 299, 27, 20);
			contentPane3.add(tfOk);
			tfOk.setColumns(10);
		}

		lblbas = new JLabel("Basophil");
		lblbas.setBounds(559, 207, 113, 36);
		contentPane3.add(lblbas);

		tfbas = new JTextField();
		tfbas.setColumns(10);
		tfbas.setBounds(559, 243, 173, 20);
		contentPane3.add(tfbas);
		reshem = tf15.getText();
		bas = Double.parseDouble(reshem);
		rescbc = bas + "";
		tfbas.setText(rescbc);
		if (bas >= 0 && bas <= 2) {
			tfOk = new JTextField();
			tfOk.setBackground(Color.GREEN);
			tfOk.setEditable(false);
			tfOk.setHorizontalAlignment(SwingConstants.LEADING);
			tfOk.setBounds(742, 243, 27, 20);
			contentPane3.add(tfOk);
			tfOk.setColumns(10);
		} else {
			tfOk = new JTextField();
			tfOk.setBackground(Color.red);
			tfOk.setEditable(false);
			tfOk.setHorizontalAlignment(SwingConstants.LEADING);
			tfOk.setBounds(742, 243, 27, 20);
			contentPane3.add(tfOk);
			tfOk.setColumns(10);
		}

		lbleo = new JLabel("Eosinophil");
		lbleo.setBounds(559, 142, 113, 26);
		contentPane3.add(lbleo);

		tfeo = new JTextField();
		tfeo.setColumns(10);
		tfeo.setBounds(559, 179, 173, 20);
		contentPane3.add(tfeo);
		reshem = tf1.getText();
		eo = Double.parseDouble(reshem);
		rescbc = eo + "";
		tfeo.setText(rescbc);
		if (eo >= 0 && eo <= 6) {
			tfOk = new JTextField();
			tfOk.setBackground(Color.GREEN);
			tfOk.setEditable(false);
			tfOk.setHorizontalAlignment(SwingConstants.LEADING);
			tfOk.setBounds(742, 179, 27, 20);
			contentPane3.add(tfOk);
			tfOk.setColumns(10);
		} else {
			tfOk = new JTextField();
			tfOk.setBackground(Color.red);
			tfOk.setEditable(false);
			tfOk.setHorizontalAlignment(SwingConstants.LEADING);
			tfOk.setBounds(742, 179, 27, 20);
			contentPane3.add(tfOk);
			tfOk.setColumns(10);
		}
		lblcbcres3 = new JLabel("");
		lblcbcres3.setIcon(new ImageIcon("22.jpg"));
		lblcbcres3.setHorizontalAlignment(SwingConstants.CENTER);
		lblcbcres3.setBounds(0, 0, 802, 506);
		contentPane3.add(lblcbcres3);
	}

	void cbcinfo() {
		contentPane5 = new JPanel();
		contentPane5.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane5.setBackground(SystemColor.control);
		setContentPane(contentPane5);
		contentPane5.setLayout(null);

		JLabel lblinfo = new JLabel("Information");
		lblinfo.setHorizontalAlignment(SwingConstants.CENTER);
		lblinfo.setOpaque(true);
		lblinfo.setBackground(SystemColor.window);
		lblinfo.setFont(new Font("Book Antiqua", Font.BOLD, 25));
		lblinfo.setBounds(303, 11, 167, 43);
		contentPane5.add(lblinfo);

		JLabel lblinname = new JLabel("Name");
		lblinname.setFont(new Font("Book Antiqua", Font.BOLD, 20));
		lblinname.setBounds(246, 133, 144, 23);
		contentPane5.add(lblinname);

		tfname2 = new JTextField();
		tfname2.setBounds(246, 158, 307, 36);
		contentPane5.add(tfname2);
		tfname2.setColumns(10);

		JLabel lblage = new JLabel("Age");
		lblage.setFont(new Font("Book Antiqua", Font.BOLD, 20));
		lblage.setBounds(246, 205, 144, 23);
		contentPane5.add(lblage);

		tfage = new JTextField();
		tfage.setColumns(10);
		tfage.setBounds(246, 239, 307, 36);
		contentPane5.add(tfage);

		JLabel lblgender = new JLabel("Gender");
		lblgender.setFont(new Font("Book Antiqua", Font.BOLD, 20));
		lblgender.setBounds(246, 288, 144, 23);
		contentPane5.add(lblgender);

		String[] gender = { "Select", "Male", "Female" };

		comboBox = new JComboBox(gender);
		comboBox.setBounds(246, 322, 307, 36);
		contentPane5.add(comboBox);
		cbcinfo = comboBox.getSelectedItem().toString();

		JButton btnentr = new JButton("Enter");
		btnentr.setFont(new Font("Cooper Black", Font.PLAIN, 20));
		btnentr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cbc();
			}
		});
		btnentr.setBounds(338, 427, 142, 50);
		contentPane5.add(btnentr);
		JButton btback = new JButton("<< Back");
		btback.setFont(new Font("Cooper Black", Font.PLAIN, 20));
		btback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				remove(lblinname);
				remove(lblinfo);
				remove(lblage);
				remove(lblgender);
				remove(lblcbcres3);
				remove(comboBox);
				remove(tfname2);
				remove(tfage);
				remove(btnentr);
				remove(btback);
				setVisible(false);
				app();
			}
		});
		btback.setBounds(639, 11, 153, 44);
		contentPane5.add(btback);
		lblcbcres3 = new JLabel("");
		lblcbcres3.setIcon(new ImageIcon("17.jpg"));
		lblcbcres3.setHorizontalAlignment(SwingConstants.CENTER);
		lblcbcres3.setBounds(0, 0, 802, 506);
		contentPane5.add(lblcbcres3);
		setVisible(true);
	}
	void wc() {
		contentPane5 = new JPanel();
		contentPane5.setBackground(SystemColor.window);
		contentPane5.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane5);
		contentPane5.setLayout(null);
		
		lblwc = new JLabel("How to measure your waist");
		lblwc.setFont(new Font("Colonna MT", Font.BOLD, 30));
		lblwc.setHorizontalAlignment(SwingConstants.CENTER);
		lblwc.setBounds(89, 36, 633, 45);
		contentPane5.add(lblwc);
		
		tpwc = new JTextPane();
		tpwc.setFont(new Font("Sylfaen", Font.PLAIN, 25));
		tpwc.setBounds(89, 124, 633, 219);
		tpwc.setEditable(false);
		
		tpwc.setText("1.Find the bottom of your ribs and the top of your hips.\r\n"
				+ "2.Place a tape measure around your middle at a point halfway between them (just above the belly button).\r\n"
				+ "3.Make sure it’s pulled tight, but isn’t digging into your skin.\r\n"
				+ "4.Breathe out naturally and take your measurement.\r\n"
				+ "5.Take your measurement again, just to be sure.");
		contentPane5.add(tpwc);
		
		btdone = new JButton("Done");
		btdone.setFont(new Font("Baskerville Old Face", Font.PLAIN, 25));
		btdone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			wc2();	
			}
		});
		btdone.setBounds(338, 445, 142, 50);
		btdone.setFont(new Font("Baskerville Old Face", Font.PLAIN, 25));
		contentPane5.add(btdone);
		String[] region = { "Select", "European,African,Middle Eastern","African Caribbean, South Asian, Chinese and Japanese" };
		comboBox2 = new JComboBox(region);
		comboBox2.setBounds(431, 401, 314, 33);
		contentPane5.add(comboBox2);
		
		tfwm = new JTextField();
		tfwm.setBounds(89, 401, 314, 33);
		contentPane5.add(tfwm);
		tfwm.setColumns(10);
		
		lblwm = new JLabel(" Enter Measurement(in CM)");
		lblwm.setFont(new Font("Cooper Black", Font.PLAIN, 18));
		lblwm.setBounds(89, 364, 314, 36);
		contentPane5.add(lblwm);
		
		lblSelectRegion = new JLabel("Select Region");
		lblSelectRegion.setFont(new Font("Cooper Black", Font.PLAIN, 18));
		lblSelectRegion.setBounds(431, 354, 314, 36);
		contentPane5.add(lblSelectRegion);
		lblwcpic = new JLabel("");
		lblwcpic.setIcon(new ImageIcon("24.JPG"));
		lblwcpic.setHorizontalAlignment(SwingConstants.CENTER);
		lblwcpic.setBounds(10, 11, 137, 102);
		contentPane5.add(lblwcpic);
		
		lblwcpic2 = new JLabel("");
		lblwcpic2.setIcon(new ImageIcon("26.JPG"));
		lblwcpic2.setHorizontalAlignment(SwingConstants.CENTER);
		lblwcpic2.setBounds(660, 11, 137, 102);
		contentPane5.add(lblwcpic2);

	}
	void wcinfo(){
		contentPane7 = new JPanel();
		contentPane7.setBackground(SystemColor.window);
		contentPane7.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane7);
		contentPane7.setLayout(null);
		
		lblwcinfo = new JLabel("New label");
		lblwcinfo.setHorizontalAlignment(SwingConstants.CENTER);
		lblwcinfo.setBounds(271, 11, 228, 36);
		contentPane7.add(lblwcinfo);
		
		lblwcname = new JLabel("New label");
		lblwcname.setBounds(222, 90, 191, 26);
		contentPane7.add(lblwcname);
		
		tfwcname = new JTextField();
		tfwcname.setBounds(222, 127, 340, 36);
		contentPane7.add(tfwcname);
		tfwcname.setColumns(10);
		
		lblwcage = new JLabel("New label");
		lblwcage.setBounds(222, 174, 191, 36);
		contentPane7.add(lblwcage);
		
		tfwcage = new JTextField();
		tfwcage.setColumns(10);
		tfwcage.setBounds(222, 221, 340, 36);
		contentPane7.add(tfwcage);
		
		lblwcmes = new JLabel("New label");
		lblwcmes.setBounds(222, 268, 191, 36);
		contentPane7.add(lblwcmes);
		
		tfwcmes = new JTextField();
		tfwcmes.setColumns(10);
		tfwcmes.setBounds(222, 315, 340, 36);
		contentPane7.add(tfwcmes);
		
		btwcinfo = new JButton("New button");
		btwcinfo.setBounds(333, 443, 122, 52);
		contentPane7.add(btwcinfo);
		
		String[] region = { "Select Region", "European,African,Middle Eastern","African Caribbean, South Asian, Chinese and Japanese" };
		regionbox = new JComboBox(region);
		regionbox.setBounds(222, 367, 340, 36);
		contentPane7.add(regionbox);
			
	}
	void wc2() {
	String reg=regionbox.getSelectedItem().toString();
	String wc=tfwcmes.getText();
	String reg1="European,African,Middle Eastern";
	int r1=reg.compareTo(reg1);
	double wcres=Double.parseDouble(wc);
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 818, 545);
		contentPane6 = new JPanel();
		contentPane6.setBackground(SystemColor.window);
		contentPane6.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane6);
		contentPane6.setLayout(null);
		
		lblwc = new JLabel("How to measure your waist");
		lblwc.setFont(new Font("Colonna MT", Font.BOLD, 30));
		lblwc.setHorizontalAlignment(SwingConstants.CENTER);
		lblwc.setBounds(157, 36, 493, 45);
		contentPane6.add(lblwc);
		
		tpwc = new JTextPane();
		tpwc.setFont(new Font("Sylfaen", Font.PLAIN, 25));
		tpwc.setBounds(89, 124, 633, 219);
		tpwc.setEditable(false);
		
		tpwc.setText("1.Find the bottom of your ribs and the top of your hips.\r\n"
				+ "2.Place a tape measure around your middle at a point halfway between them (just above the belly button).\r\n"
				+ "3.Make sure it’s pulled tight, but isn’t digging into your skin.\r\n"
				+ "4.Breathe out naturally and take your measurement.\r\n"
				+ "5.Take your measurement again, just to be sure.");
		contentPane6.add(tpwc);
		
		btdone = new JButton("Check again");
		btdone.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		btdone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				wc();
			}
		});
		btdone.setBounds(10, 11, 142, 50);
		contentPane6.add(btdone);
		tfreg2 = new JTextField();
		tfreg2.setEditable(false);
		tfreg2.setColumns(10);
		tfreg2.setBounds(431, 401, 314, 33);
		tfreg2.setText(reg);
		contentPane6.add(tfreg2);
		
		tfwm = new JTextField();
		tfwm.setEditable(false);
		tfwm.setBounds(89, 401, 314, 33);
		contentPane6.add(tfwm);
		tfwm.setText(wc);
		tfwm.setColumns(10);
		
		lblwm = new JLabel(" Enter Waist Measurement");
		lblwm.setFont(new Font("Cooper Black", Font.PLAIN, 18));
		lblwm.setBounds(89, 364, 314, 36);
		contentPane6.add(lblwm);
		
		
		
		lblSelectRegion = new JLabel("Select Region");
		lblSelectRegion.setFont(new Font("Cooper Black", Font.PLAIN, 18));
		lblSelectRegion.setBounds(431, 354, 314, 36);
		contentPane6.add(lblSelectRegion);
		
		if(r1==0) {
			if(wcres<80) {
				tfwcres = new JTextField();
				tfwcres.setEditable(false);
				tfwcres.setColumns(10);
				tfwcres.setText("Low risk of heart and circulatory diseases");
				tfwcres.setBounds(251, 462, 314, 33);
				contentPane6.add(tfwcres);
			}
			else if(80<wcres&&wcres<88) {
				tfwcres = new JTextField();
				tfwcres.setEditable(false);
				tfwcres.setColumns(10);
				tfwcres.setText("High risk of heart and circulatory diseases");
				tfwcres.setBounds(251, 462, 314, 33);
				contentPane6.add(tfwcres);
			}
			else if(88<wcres) {
				tfwcres = new JTextField();
				tfwcres.setEditable(false);
				tfwcres.setColumns(10);
				tfwcres.setText("Very high risk of heart and circulatory diseases");
				tfwcres.setBounds(251, 462, 314, 33);
				contentPane6.add(tfwcres);
			}
		}
		else {
			if(wcres<80) {
				tfwcres = new JTextField();
				tfwcres.setEditable(false);
				tfwcres.setColumns(10);
				tfwcres.setText("Low risk of heart and circulatory diseases");
				tfwcres.setBounds(251, 462, 314, 33);
				contentPane6.add(tfwcres);
			}
			else {
				tfwcres = new JTextField();
				tfwcres.setEditable(false);
				tfwcres.setColumns(10);
				tfwcres.setText("High risk of heart and circulatory diseases");
				tfwcres.setBounds(251, 462, 314, 33);
				contentPane6.add(tfwcres);
			}
		}
		btdone2 = new JButton("Back");
		btdone2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				remove(lblwc);
				remove(tpwc);
				remove(btdone);
				remove(tfwm);
				remove(lblwm);
				remove(tfwcres);
				remove(lblSelectRegion);
				remove(btdone2);
				remove(tfreg2);	
				setVisible(false);
				app();
			}
		});
		btdone2.setFont(new Font("Baskerville Old Face", Font.PLAIN, 25));
		btdone2.setBounds(650, 11, 142, 50);
		contentPane6.add(btdone2);
	}
	void bmi() {
		contentPane2 = new JPanel();
		contentPane2.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane2.setBackground(SystemColor.control);
		setContentPane(contentPane2);
		contentPane2.setLayout(null);

		lblBMI = new JLabel("");
		lblBMI.setHorizontalAlignment(SwingConstants.LEADING);
		lblBMI.setVerticalAlignment(SwingConstants.TOP);
		lblBMI.setBounds(293, 0, 200, 110);
		lblBMI.setIcon(new ImageIcon("3.3.JPG"));

		lblBMI.setFont(new Font("Baskerville Old Face", Font.BOLD, 25));
		contentPane2.add(lblBMI);

		lblWeight = new JLabel("");
		lblWeight.setHorizontalAlignment(SwingConstants.LEADING);
		lblWeight.setVerticalAlignment(SwingConstants.TOP);
		lblWeight.setBounds(193, 109, 200, 47);
		lblWeight.setFont(new Font("Bodoni MT", Font.PLAIN, 25));
		contentPane2.add(lblWeight);
		lblWeight.setText("Enter Weight");

		tfWeight = new JTextField();
		tfWeight.setBounds(193, 155, 436, 28);
		contentPane2.add(tfWeight);
		tfWeight.setColumns(10);

		lblheight = new JLabel("");
		lblheight.setHorizontalAlignment(SwingConstants.LEADING);
		lblheight.setVerticalAlignment(SwingConstants.TOP);
		lblheight.setBounds(193, 190, 436, 47);
		lblheight.setFont(new Font("Bodoni MT", Font.PLAIN, 25));
		contentPane2.add(lblheight);
		lblheight.setText("Enter Height(in cm)");

		lblwei = new JLabel("");
		lblwei.setHorizontalAlignment(SwingConstants.CENTER);
		lblwei.setIcon(new ImageIcon("5.532.JPG"));
		lblwei.setBounds(28, 174, 140, 167);
		contentPane2.add(lblwei);

		lblhei = new JLabel("");
		lblhei.setForeground(Color.WHITE);
		lblhei.setIcon(new ImageIcon("6.96.JPG"));
		lblhei.setHorizontalAlignment(SwingConstants.CENTER);
		lblhei.setBounds(652, 184, 140, 145);
		contentPane2.add(lblhei);

		tfHeight = new JTextField();
		tfHeight.setBounds(193, 230, 436, 28);
		contentPane2.add(tfHeight);
		tfHeight.setColumns(10);
		
		lblgender = new JLabel("Gender");
		lblgender.setBounds(193, 255, 436, 47);
		lblgender.setFont(new Font("Bodoni MT", Font.PLAIN, 25));
		contentPane2.add(lblgender);
		
		String[] gender = { "Select", "Male", "Female" };

		comboBox = new JComboBox(gender);
		comboBox.setBounds(193, 306, 436, 47);
		comboBox.setBackground(SystemColor.window);
		contentPane2.add(comboBox);
		
		
		JButton btnnew3 = new JButton("Submit");
		btnnew3.setFont(new Font("Segoe UI Black", Font.PLAIN, 25));
		btnnew3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String bmigen=comboBox.getSelectedItem().toString(),bmigen2="Female";
				int c=bmigen.compareTo(bmigen2);
				if(c==0) {
				bmiresfem();	
				}
				else
				{
					bmires();
				}
			}
		});
		btnnew3.setBounds(338, 401, 142, 50);
		contentPane2.add(btnnew3);

		JButton btback = new JButton("<< Back");
		btback.setFont(new Font("Segoe UI Black", Font.PLAIN, 25));
		btback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				remove(lblBMI);
				remove(lblWeight);
				remove(tfWeight);
				remove(lblheight);
				remove(tfHeight);
				remove(lblwei);
				remove(lblhei);
				remove(lblgender);
				remove(comboBox);
				remove(btnnew3);
				remove(btback);
				setVisible(false);
				app();
			}
		});
		btback.setBounds(639, 11, 153, 44);
		contentPane2.add(btback);
	}
	void bmiresfem() {
		contentPane3 = new JPanel();
		contentPane3.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane3.setBackground(SystemColor.window);
		setContentPane(contentPane3);
		contentPane3.setLayout(null);
		lblBMIres = new JLabel("");
		lblBMIres.setHorizontalAlignment(SwingConstants.CENTER);
		lblBMIres.setVerticalAlignment(SwingConstants.CENTER);
		lblBMIres.setBounds(273, 0, 249, 118);
		contentPane3.add(lblBMIres);

		lblres = new JLabel("");
		lblres.setHorizontalAlignment(SwingConstants.LEADING);
		lblres.setVerticalAlignment(SwingConstants.TOP);
		lblres.setBounds(10, 85, 300, 52);
		lblres.setFont(new Font("Baskerville Old Face", Font.BOLD, 25));
		contentPane3.add(lblres);
		lblres.setText("BMI");

		tfres = new JTextField();
		tfres.setBounds(10, 132, 384, 37);
		tfres.setEditable(false);
		tfres.setBackground(SystemColor.window);
		contentPane3.add(tfres);
		tfres.setColumns(10);
		w1 = tfWeight.getText();
		h1 = tfHeight.getText();
		weight = Double.parseDouble(w1);
		height = Double.parseDouble(h1);
		res = weight / ((height / 100) * (height / 100));
		result = res + "";
		tfres.setText(result);
		if (res < 17) {
			lblBMIres.setIcon(new ImageIcon("10.JPG"));
			textPane = new JTextPane();
			textPane.setText("");
			textPane.setBounds(10, 180, 782, 315);
			textPane.setEditable(false);
			contentPane3.add(textPane);
			textPane.setFont(new Font("Times New Roman", Font.PLAIN, 23));
			textPane.setText(
					"Condition:Severely Underweight\n\nRecommendation:You need to start gaining weight and stay healthy, such as getting more healthy foods in your diet and doing exercises to build muscle.\n\nHere are some healthy ways to gain weight when you're underweight:\n"
							+ "Eat more frequently:When you're underweight, you may feel full faster. Eat five to six smaller meals during the day rather than two or three large meals.\n"
							+ "Choose nutrient-rich foods:As part of an overall healthy diet, choose whole-grain breads, pastas and cereals; fruits and vegetables; dairy products; lean protein sources; and nuts and seeds.");
		} else if (res > 17 && res < 18.5) {
			lblBMIres.setIcon(new ImageIcon("9.JPG"));
			Font f3 = new Font("Times New Roman", Font.PLAIN, 25);
			textPane = new JTextPane();
			textPane.setText("");
			textPane.setBounds(10, 180, 782, 315);
			textPane.setEditable(false);
			contentPane3.add(textPane);
			textPane.setFont(f3);
			textPane.setText(
					"\nCondition:Underweight\n\nRecommendation:Talk with your doctor about steps you can take to stay healthy or improve your health.\nYou may need to make lifestyle changes to gain or maintain weight and stay healthy, such as getting more healthy foods in your diet and doing exercises to build muscle.");
		} else if (res >= 18.5 && res <= 24.9) {
			Font f3 = new Font("Times New Roman", Font.PLAIN, 25);
			lblBMIres.setIcon(new ImageIcon("11.JPG"));
			textPane = new JTextPane();
			textPane.setText("");
			textPane.setBounds(10, 180, 782, 315);
			textPane.setEditable(false);
			contentPane3.add(textPane);
			textPane.setFont(f3);
			textPane.setText(
					"\n\nCondition:Healthy\n\nRecommendation:Your Health is sound,try to keep it that way.\nTry not to smoke and do exersice regularly");
		} else if (res > 24.9 && res <= 29.9) {
			Font f3 = new Font("Times New Roman", Font.PLAIN, 25);
			lblBMIres.setIcon(new ImageIcon("12.JPG"));
			textPane = new JTextPane();
			textPane.setText("");
			textPane.setBounds(10, 180, 782, 315);
			textPane.setEditable(false);
			contentPane3.add(textPane);
			textPane.setFont(f3);
			textPane.setText(
					"\nCondition:Overweight\nyou may be at increased risk for weight-related health problems, such as high blood pressure, heart disease, stroke, arthritis or joint pain, and diabetes.\n\nRecommendation:\nEngaging in moderate physical activity, progressing to 30 minutes or more on most or preferably all days of the week.");
		} else if (res > 29.9 && res <= 34.9) {
			Font f3 = new Font("Times New Roman", Font.PLAIN, 22);
			lblBMIres.setIcon(new ImageIcon("14.JPG"));
			textPane = new JTextPane();
			textPane.setText("");
			textPane.setBounds(10, 180, 782, 315);
			textPane.setEditable(false);
			contentPane3.add(textPane);
			textPane.setFont(f3);
			textPane.setText(
					"Condition:Obesity(class 1)\nyou may face various weight-related health problems.\nRecommendation:\nTry to maintain a diet and do exercise to lose weight\nA healthy diet should consist of:\n"
							+ "1.plenty of fruit and vegetables\n"
							+ "2.plenty of potatoes, bread, rice, pasta and other starchy foods (ideally you should choose wholegrain varieties)\n"
							+ "3.some milk and dairy foods\n"
							+ "4.some meat, fish, eggs, beans and other non-dairy sources of protein\n"
							+ "5.just small amounts of food and drinks that are high in fat and sugar");
		} else if (res > 34.9 && res <= 39.9) {
			Font f3 = new Font("Times New Roman", Font.PLAIN, 20);
			lblBMIres.setIcon(new ImageIcon("14.JPG"));
			textPane = new JTextPane();
			textPane.setText("");
			textPane.setBounds(10, 180, 782, 315);
			textPane.setEditable(false);
			contentPane3.add(textPane);
			textPane.setFont(f3);
			textPane.setText(
					"Condition:Obesity(class 2)\nyou need to start losing weight to avoid health problems.\nRecommendation:\nTry to avoid foods containing high levels of salt because they can raise your blood pressure, which can be dangerous for people who are already obese. Read some tips for a lower-salt diet.\n"
							+ "You'll also need to check calorie information for each type of food and drink you consume to make sure you don't go over your daily limit.\n"
							+ "Some restaurants, cafés and fast food outlets provide calorie information per portion, although providing this information isn't compulsory. Be careful when eating out because some foods can quickly take you over the limit, such as burgers, fried chicken, and some curries or Chinese dishes");
		} else if (res > 39.9) {
			Font f3 = new Font("Times New Roman", Font.PLAIN, 20);
			lblBMIres.setIcon(new ImageIcon("15.JPG"));
			textPane = new JTextPane();
			textPane.setText("");
			textPane.setBounds(10, 180, 782, 315);
			textPane.setEditable(false);
			contentPane3.add(textPane);
			textPane.setFont(f3);
			textPane.setText(
					"Condition:Obesity(class 3)/Severe obesity\nClass III obesity is a complex disease that has several contributing factors."
							+ "The main cause of why your body stores fat is that there’s an imbalance between the number of calories (energy) you consume and the number of calories (energy) your body uses.\nRecommendation:\nTreating class III obesity involves a multi-prong strategy. Management for class III obesity may include:\n"
							+ "1.Healthy lifestyle changes.\n" + "2.Behavioral and psychological therapy.\n"
							+ "3.Medications.\n" + "4.Surgical procedures.");
		}
		JButton btagain = new JButton("Check W.C.");
		btagain.setFont(new Font("Siyam Rupali", Font.BOLD, 17));
		btagain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				wc();
			}
		});
		btagain.setBounds(10, 9, 142, 43);
		contentPane3.add(btagain);

		JButton btback2 = new JButton("Check Again");
		btback2.setFont(new Font("Siyam Rupali", Font.BOLD, 20));
		btback2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bmi();
			}
		});
		btback2.setBounds(639, 11, 153, 44);
		contentPane3.add(btback2);
	}
	void bmires() {
		contentPane3 = new JPanel();
		contentPane3.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane3.setBackground(SystemColor.window);
		setContentPane(contentPane3);
		contentPane3.setLayout(null);
		lblBMIres = new JLabel("");
		lblBMIres.setHorizontalAlignment(SwingConstants.CENTER);
		lblBMIres.setVerticalAlignment(SwingConstants.CENTER);
		lblBMIres.setBounds(273, 0, 249, 118);
		contentPane3.add(lblBMIres);

		lblres = new JLabel("");
		lblres.setHorizontalAlignment(SwingConstants.LEADING);
		lblres.setVerticalAlignment(SwingConstants.TOP);
		lblres.setBounds(10, 85, 300, 52);
		lblres.setFont(new Font("Baskerville Old Face", Font.BOLD, 25));
		contentPane3.add(lblres);
		lblres.setText("BMI");

		tfres = new JTextField();
		tfres.setBounds(10, 132, 384, 37);
		tfres.setEditable(false);
		tfres.setBackground(SystemColor.window);
		contentPane3.add(tfres);
		tfres.setColumns(10);
		w1 = tfWeight.getText();
		h1 = tfHeight.getText();
		weight = Double.parseDouble(w1);
		height = Double.parseDouble(h1);
		res = weight / ((height / 100) * (height / 100));
		result = res + "";
		tfres.setText(result);
		if (res < 17) {
			lblBMIres.setIcon(new ImageIcon("10.JPG"));
			textPane = new JTextPane();
			textPane.setText("");
			textPane.setBounds(10, 180, 782, 315);
			textPane.setEditable(false);
			contentPane3.add(textPane);
			textPane.setFont(new Font("Times New Roman", Font.PLAIN, 23));
			textPane.setText(
					"Condition:Severely Underweight\n\nRecommendation:You need to start gaining weight and stay healthy, such as getting more healthy foods in your diet and doing exercises to build muscle.\n\nHere are some healthy ways to gain weight when you're underweight:\n"
							+ "Eat more frequently:When you're underweight, you may feel full faster. Eat five to six smaller meals during the day rather than two or three large meals.\n"
							+ "Choose nutrient-rich foods:As part of an overall healthy diet, choose whole-grain breads, pastas and cereals; fruits and vegetables; dairy products; lean protein sources; and nuts and seeds.");
		} else if (res > 17 && res < 18.5) {
			lblBMIres.setIcon(new ImageIcon("9.JPG"));
			Font f3 = new Font("Times New Roman", Font.PLAIN, 25);
			textPane = new JTextPane();
			textPane.setText("");
			textPane.setBounds(10, 180, 782, 315);
			textPane.setEditable(false);
			contentPane3.add(textPane);
			textPane.setFont(f3);
			textPane.setText(
					"\nCondition:Underweight\n\nRecommendation:Talk with your doctor about steps you can take to stay healthy or improve your health.\nYou may need to make lifestyle changes to gain or maintain weight and stay healthy, such as getting more healthy foods in your diet and doing exercises to build muscle.");
		} else if (res >= 18.5 && res <= 24.9) {
			Font f3 = new Font("Times New Roman", Font.PLAIN, 25);
			lblBMIres.setIcon(new ImageIcon("11.JPG"));
			textPane = new JTextPane();
			textPane.setText("");
			textPane.setBounds(10, 180, 782, 315);
			textPane.setEditable(false);
			contentPane3.add(textPane);
			textPane.setFont(f3);
			textPane.setText(
					"\n\nCondition:Healthy\n\nRecommendation:Your Health is sound,try to keep it that way.\nTry not to smoke and do exersice regularly");
		} else if (res > 24.9 && res <= 29.9) {
			Font f3 = new Font("Times New Roman", Font.PLAIN, 25);
			lblBMIres.setIcon(new ImageIcon("12.JPG"));
			textPane = new JTextPane();
			textPane.setText("");
			textPane.setBounds(10, 180, 782, 315);
			textPane.setEditable(false);
			contentPane3.add(textPane);
			textPane.setFont(f3);
			textPane.setText(
					"\nCondition:Overweight\nyou may be at increased risk for weight-related health problems, such as high blood pressure, heart disease, stroke, arthritis or joint pain, and diabetes.\n\nRecommendation:\nEngaging in moderate physical activity, progressing to 30 minutes or more on most or preferably all days of the week.");
		} else if (res > 29.9 && res <= 34.9) {
			Font f3 = new Font("Times New Roman", Font.PLAIN, 22);
			lblBMIres.setIcon(new ImageIcon("14.JPG"));
			textPane = new JTextPane();
			textPane.setText("");
			textPane.setBounds(10, 180, 782, 315);
			textPane.setEditable(false);
			contentPane3.add(textPane);
			textPane.setFont(f3);
			textPane.setText(
					"Condition:Obesity(class 1)\nyou may face various weight-related health problems.\nRecommendation:\nTry to maintain a diet and do exercise to lose weight\nA healthy diet should consist of:\n"
							+ "1.plenty of fruit and vegetables\n"
							+ "2.plenty of potatoes, bread, rice, pasta and other starchy foods (ideally you should choose wholegrain varieties)\n"
							+ "3.some milk and dairy foods\n"
							+ "4.some meat, fish, eggs, beans and other non-dairy sources of protein\n"
							+ "5.just small amounts of food and drinks that are high in fat and sugar");
		} else if (res > 34.9 && res <= 39.9) {
			Font f3 = new Font("Times New Roman", Font.PLAIN, 20);
			lblBMIres.setIcon(new ImageIcon("14.JPG"));
			textPane = new JTextPane();
			textPane.setText("");
			textPane.setBounds(10, 180, 782, 315);
			textPane.setEditable(false);
			contentPane3.add(textPane);
			textPane.setFont(f3);
			textPane.setText(
					"Condition:Obesity(class 2)\nyou need to start losing weight to avoid health problems.\nRecommendation:\nTry to avoid foods containing high levels of salt because they can raise your blood pressure, which can be dangerous for people who are already obese. Read some tips for a lower-salt diet.\n"
							+ "You'll also need to check calorie information for each type of food and drink you consume to make sure you don't go over your daily limit.\n"
							+ "Some restaurants, cafés and fast food outlets provide calorie information per portion, although providing this information isn't compulsory. Be careful when eating out because some foods can quickly take you over the limit, such as burgers, fried chicken, and some curries or Chinese dishes");
		} else if (res > 39.9) {
			Font f3 = new Font("Times New Roman", Font.PLAIN, 20);
			lblBMIres.setIcon(new ImageIcon("15.JPG"));
			textPane = new JTextPane();
			textPane.setText("");
			textPane.setBounds(10, 180, 782, 315);
			textPane.setEditable(false);
			contentPane3.add(textPane);
			textPane.setFont(f3);
			textPane.setText(
					"Condition:Obesity(class 3)/Severe obesity\nClass III obesity is a complex disease that has several contributing factors."
							+ "The main cause of why your body stores fat is that there’s an imbalance between the number of calories (energy) you consume and the number of calories (energy) your body uses.\nRecommendation:\nTreating class III obesity involves a multi-prong strategy. Management for class III obesity may include:\n"
							+ "1.Healthy lifestyle changes.\n" + "2.Behavioral and psychological therapy.\n"
							+ "3.Medications.\n" + "4.Surgical procedures.");
		}
		JButton btagain = new JButton("Check Again");
		btagain.setFont(new Font("Siyam Rupali", Font.BOLD, 17));
		btagain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bmi();
			}
		});
		btagain.setBounds(10, 9, 142, 43);
		contentPane3.add(btagain);

		JButton btback2 = new JButton("<< Back");
		btback2.setFont(new Font("Siyam Rupali", Font.BOLD, 20));
		btback2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				remove(textPane);
				remove(lblres);
				remove(tfres);
				remove(lblBMIres);
				remove(btback2);
				remove(btagain);
				setVisible(false);
				app();
			}
		});
		btback2.setBounds(639, 11, 153, 44);
		contentPane3.add(btback2);
	}}