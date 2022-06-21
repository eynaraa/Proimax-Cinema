package grouping;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JEditorPane;
import javax.swing.JTextPane;
import javax.swing.JTextArea;

public class frame3 extends JFrame {

	private JPanel contentPane;
	private JTextField texthotdog;
	private JTextField textpopcorn;
	private JTextField textsausage;
	private JTextField textmac;
	private JTextField textlemtea;
	private JTextField textsprite;
	private JTextField textcola;
	private JTextField textmilo;
	private JTextField textcoklat;
	private JTextField textcombo1;
	private JTextField textcombo2;
	private JTextField textcombo3;
	JLabel lblfnbprice;
	String food;
   	String bev;
   	String combo;
   	double total = 0.0;
   	double hotdog ;
	double popcorn;
	double sausage;
	double mac;
	double softdrinklarge;
	double softdrinkregular;
	double icemilo;
	double hotmilo;
   	double hotcoklat;
   	double combo1;
   	double combo2;
   	double combo3;
	
   	 
	
	/**
	 * Launch the application.
	 * 
	 */
	/**
	 * Create the frame.
	 */
	public frame3(String movie, String time, String numseat, double totalseat, String name, int pass, double dispmovprice) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1094, 687);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setForeground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBackground(Color.BLACK);
		panel.setBounds(10, 72, 1051, 568);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblfnbprice = new JLabel("");
		lblfnbprice.setBounds(676, 386, 328, 107);
		panel.add(lblfnbprice);
		
		JCheckBox chckbxregularcoklat = new JCheckBox("(M)");
		chckbxregularcoklat.setForeground(new Color(255, 255, 255));
		chckbxregularcoklat.setBackground(new Color(139, 0, 0));
		chckbxregularcoklat.setFont(new Font("Tahoma", Font.BOLD, 8));
		chckbxregularcoklat.setBounds(508, 215, 48, 21);
		panel.add(chckbxregularcoklat);
		
		JCheckBox chckbxlargecoklat = new JCheckBox("(L)");
		chckbxlargecoklat.setForeground(new Color(255, 255, 255));
		chckbxlargecoklat.setBackground(new Color(139, 0, 0));
		chckbxlargecoklat.setFont(new Font("Tahoma", Font.BOLD, 8));
		chckbxlargecoklat.setBounds(508, 195, 48, 21);
		panel.add(chckbxlargecoklat);
		
		JCheckBox chckbxregularcola = new JCheckBox("(M)");
		chckbxregularcola.setForeground(new Color(255, 255, 255));
		chckbxregularcola.setFont(new Font("Tahoma", Font.BOLD, 8));
		chckbxregularcola.setBackground(new Color(139, 0, 0));
		chckbxregularcola.setBounds(299, 215, 48, 21);
		panel.add(chckbxregularcola);
		
		JCheckBox chckbxlargecola = new JCheckBox("(L)");
		chckbxlargecola.setFont(new Font("Tahoma", Font.BOLD, 8));
		chckbxlargecola.setForeground(new Color(255, 255, 255));
		chckbxlargecola.setBackground(new Color(139, 0, 0));
		chckbxlargecola.setBounds(300, 195, 47, 21);
		panel.add(chckbxlargecola);
		
		JCheckBox chckbxregularsprite = new JCheckBox("(M)");
		chckbxregularsprite.setFont(new Font("Tahoma", Font.BOLD, 8));
		chckbxregularsprite.setForeground(new Color(255, 255, 255));
		chckbxregularsprite.setBackground(new Color(139, 0, 0));
		chckbxregularsprite.setBounds(208, 215, 47, 21);
		panel.add(chckbxregularsprite);
		
		JCheckBox chckbxlargesprite = new JCheckBox("(L)");
		chckbxlargesprite.setFont(new Font("Tahoma", Font.BOLD, 8));
		chckbxlargesprite.setBackground(new Color(139, 0, 0));
		chckbxlargesprite.setForeground(new Color(255, 255, 255));
		chckbxlargesprite.setBounds(207, 195, 48, 21);
		panel.add(chckbxlargesprite);
		
		JCheckBox chckbxregularlemtea = new JCheckBox("(M)");
		chckbxregularlemtea.setFont(new Font("Tahoma", Font.BOLD, 8));
		chckbxregularlemtea.setForeground(new Color(255, 255, 255));
		chckbxregularlemtea.setBackground(new Color(139, 0, 0));
		chckbxregularlemtea.setBounds(100, 215, 46, 21);
		panel.add(chckbxregularlemtea);
		
		JCheckBox chckbxlargelemtea = new JCheckBox("(L)");
		chckbxlargelemtea.setFont(new Font("Tahoma", Font.BOLD, 8));
		chckbxlargelemtea.setForeground(new Color(255, 255, 255));
		chckbxlargelemtea.setBackground(new Color(139, 0, 0));
		chckbxlargelemtea.setBounds(100, 195, 46, 21);
		panel.add(chckbxlargelemtea);
		
		JCheckBox chckbxregularmilo = new JCheckBox("(M)");
		chckbxregularmilo.setFont(new Font("Tahoma", Font.BOLD, 8));
		chckbxregularmilo.setForeground(new Color(255, 255, 255));
		chckbxregularmilo.setBackground(new Color(139, 0, 0));
		chckbxregularmilo.setBounds(405, 216, 53, 21);
		panel.add(chckbxregularmilo);
		
		JCheckBox chckbxlargemilo = new JCheckBox("(L)");
		chckbxlargemilo.setFont(new Font("Tahoma", Font.BOLD, 8));
		chckbxlargemilo.setBackground(new Color(139, 0, 0));
		chckbxlargemilo.setForeground(new Color(255, 255, 255));
		chckbxlargemilo.setBounds(405, 196, 53, 21);
		panel.add(chckbxlargemilo);
		
		JPanel panel_2_6_2 = new JPanel();
		panel_2_6_2.setBackground(new Color(139, 0, 0));
		panel_2_6_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2_6_2.setBounds(454, 196, 76, 65);
		panel.add(panel_2_6_2);
		panel_2_6_2.setLayout(null);
		
		JLabel lblNewLabel_4_1_4 = new JLabel("");
		lblNewLabel_4_1_4.setIcon(new ImageIcon("C:\\Users\\user\\Downloads\\pngwing.com (41).png"));
		lblNewLabel_4_1_4.setBounds(10, 10, 66, 45);
		panel_2_6_2.add(lblNewLabel_4_1_4);
		
		JPanel panel_2_8_1 = new JPanel();
		panel_2_8_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2_8_1.setBackground(new Color(139, 0, 0));
		panel_2_8_1.setBounds(51, 30, 115, 107);
		panel.add(panel_2_8_1);
		panel_2_8_1.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(57, 5, 0, 0);
		panel_2_8_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(62, 5, 0, 0);
		panel_2_8_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBackground(new Color(139, 0, 0));
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\user\\Downloads\\toppng.com-hot-dog-974x5241.png"));
		lblNewLabel_1.setBounds(10, 10, 105, 82);
		panel_2_8_1.add(lblNewLabel_1);
		
		JPanel panel_2_8_1_1 = new JPanel();
		panel_2_8_1_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2_8_1_1.setLayout(null);
		panel_2_8_1_1.setBackground(new Color(139, 0, 0));
		panel_2_8_1_1.setBounds(188, 30, 115, 107);
		panel.add(panel_2_8_1_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("");
		lblNewLabel_3_1.setBounds(57, 5, 0, 0);
		panel_2_8_1_1.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setBounds(62, 5, 0, 0);
		panel_2_8_1_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon("C:\\Users\\user\\Downloads\\imgbin_popcorn-png8.png"));
		lblNewLabel_1_1.setBackground(new Color(139, 0, 0));
		lblNewLabel_1_1.setBounds(10, 10, 90, 82);
		panel_2_8_1_1.add(lblNewLabel_1_1);
		
		JPanel panel_2_8_1_2 = new JPanel();
		panel_2_8_1_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2_8_1_2.setLayout(null);
		panel_2_8_1_2.setBackground(new Color(139, 0, 0));
		panel_2_8_1_2.setBounds(325, 30, 115, 107);
		panel.add(panel_2_8_1_2);
		
		JLabel lblNewLabel_3_2 = new JLabel("");
		lblNewLabel_3_2.setBounds(57, 5, 0, 0);
		panel_2_8_1_2.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_2_2 = new JLabel("");
		lblNewLabel_2_2.setBounds(62, 5, 0, 0);
		panel_2_8_1_2.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_1_2 = new JLabel("");
		lblNewLabel_1_2.setIcon(new ImageIcon("C:\\Users\\user\\Downloads\\—Pngtree—delicious red sausage_47173556.png"));
		lblNewLabel_1_2.setBackground(new Color(139, 0, 0));
		lblNewLabel_1_2.setBounds(10, 10, 90, 82);
		panel_2_8_1_2.add(lblNewLabel_1_2);
		
		JPanel panel_2_8_1_3 = new JPanel();
		panel_2_8_1_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2_8_1_3.setLayout(null);
		panel_2_8_1_3.setBackground(new Color(139, 0, 0));
		panel_2_8_1_3.setBounds(467, 30, 115, 107);
		panel.add(panel_2_8_1_3);
		
		JLabel lblNewLabel_3_3 = new JLabel("");
		lblNewLabel_3_3.setBounds(57, 5, 0, 0);
		panel_2_8_1_3.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_2_3 = new JLabel("");
		lblNewLabel_2_3.setBounds(62, 5, 0, 0);
		panel_2_8_1_3.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_1_3 = new JLabel("");
		lblNewLabel_1_3.setIcon(new ImageIcon("C:\\Users\\user\\Downloads\\SeekPng.com_cheese-png_3588278.png"));
		lblNewLabel_1_3.setBackground(new Color(139, 0, 0));
		lblNewLabel_1_3.setBounds(10, 5, 105, 87);
		panel_2_8_1_3.add(lblNewLabel_1_3);
		
		JPanel panel_2_4 = new JPanel();
		panel_2_4.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2_4.setBackground(new Color(139, 0, 0));
		panel_2_4.setBounds(51, 196, 76, 65);
		panel.add(panel_2_4);
		panel_2_4.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\user\\Downloads\\favpng_logo-nestea-iced-tea-nestea-iced-tea1.png"));
		lblNewLabel_4.setBounds(10, 10, 56, 45);
		panel_2_4.add(lblNewLabel_4);
		
		JPanel panel_2_4_1 = new JPanel();
		panel_2_4_1.setBackground(new Color(139, 0, 0));
		panel_2_4_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2_4_1.setBounds(150, 196, 76, 65);
		panel.add(panel_2_4_1);
		panel_2_4_1.setLayout(null);
		
		JLabel lblNewLabel_4_1 = new JLabel("");
		lblNewLabel_4_1.setIcon(new ImageIcon("C:\\Users\\user\\Downloads\\pngwing.com (11).png"));
		lblNewLabel_4_1.setBounds(10, 10, 56, 45);
		panel_2_4_1.add(lblNewLabel_4_1);
		
		JPanel panel_2_6 = new JPanel();
		panel_2_6.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2_6.setBackground(new Color(139, 0, 0));
		panel_2_6.setBounds(249, 196, 76, 65);
		panel.add(panel_2_6);
		panel_2_6.setLayout(null);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("");
		lblNewLabel_4_1_1.setIcon(new ImageIcon("C:\\Users\\user\\Downloads\\pngwing.com (21).png"));
		lblNewLabel_4_1_1.setBounds(10, 10, 56, 45);
		panel_2_6.add(lblNewLabel_4_1_1);
		
		JPanel panel_2_6_1 = new JPanel();
		panel_2_6_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2_6_1.setBackground(new Color(139, 0, 0));
		panel_2_6_1.setBounds(346, 196, 76, 65);
		panel.add(panel_2_6_1);
		panel_2_6_1.setLayout(null);
		
		JLabel lblNewLabel_4_1_2 = new JLabel("");
		lblNewLabel_4_1_2.setBounds(38, 5, 0, 0);
		panel_2_6_1.add(lblNewLabel_4_1_2);
		
		JLabel lblNewLabel_4_1_3 = new JLabel("");
		lblNewLabel_4_1_3.setIcon(new ImageIcon("C:\\Users\\user\\Downloads\\pngwing.com (3)1.png"));
		lblNewLabel_4_1_3.setBounds(10, 10, 56, 45);
		panel_2_6_1.add(lblNewLabel_4_1_3);
		
		JPanel panel_2_8_1_4 = new JPanel();
		panel_2_8_1_4.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2_8_1_4.setLayout(null);
		panel_2_8_1_4.setBackground(new Color(139, 0, 0));
		panel_2_8_1_4.setBounds(51, 344, 138, 107);
		panel.add(panel_2_8_1_4);
		
		JLabel lblNewLabel_3_4 = new JLabel("");
		lblNewLabel_3_4.setBounds(57, 5, 0, 0);
		panel_2_8_1_4.add(lblNewLabel_3_4);
		
		JLabel lblNewLabel_2_4 = new JLabel("");
		lblNewLabel_2_4.setBounds(62, 5, 0, 0);
		panel_2_8_1_4.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_1_4 = new JLabel("");
		lblNewLabel_1_4.setIcon(new ImageIcon("C:\\Users\\user\\Downloads\\imgbin_soft-drink-popcorn-png.png"));
		lblNewLabel_1_4.setBackground(new Color(139, 0, 0));
		lblNewLabel_1_4.setBounds(23, 10, 105, 82);
		panel_2_8_1_4.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_5 = new JLabel("Combo 1");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_5.setBounds(93, 0, 45, 13);
		panel_2_8_1_4.add(lblNewLabel_5);
		
		JPanel panel_2_8_1_5 = new JPanel();
		panel_2_8_1_5.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2_8_1_5.setLayout(null);
		panel_2_8_1_5.setBackground(new Color(139, 0, 0));
		panel_2_8_1_5.setBounds(239, 344, 136, 107);
		panel.add(panel_2_8_1_5);
		
		JLabel lblNewLabel_3_5 = new JLabel("");
		lblNewLabel_3_5.setBounds(57, 5, 0, 0);
		panel_2_8_1_5.add(lblNewLabel_3_5);
		
		JLabel lblNewLabel_2_5 = new JLabel("");
		lblNewLabel_2_5.setBounds(62, 5, 0, 0);
		panel_2_8_1_5.add(lblNewLabel_2_5);
		
		JLabel lblNewLabel_1_5_1 = new JLabel("");
		lblNewLabel_1_5_1.setIcon(new ImageIcon("C:\\Users\\user\\Downloads\\imgbin_soft-drink-popcorn-png.png"));
		lblNewLabel_1_5_1.setBackground(new Color(139, 0, 0));
		lblNewLabel_1_5_1.setBounds(10, 15, 105, 82);
		panel_2_8_1_5.add(lblNewLabel_1_5_1);
		
		JLabel lblNewLabel_1_5 = new JLabel("");
		lblNewLabel_1_5.setIcon(new ImageIcon("C:\\Users\\user\\Downloads\\imgbin_soft-drink-popcorn-png.png"));
		lblNewLabel_1_5.setBackground(new Color(139, 0, 0));
		lblNewLabel_1_5.setBounds(29, 15, 105, 82);
		panel_2_8_1_5.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_5_2 = new JLabel("Combo 2");
		lblNewLabel_5_2.setForeground(Color.WHITE);
		lblNewLabel_5_2.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_5_2.setBounds(89, 0, 45, 13);
		panel_2_8_1_5.add(lblNewLabel_5_2);
		
		JPanel panel_2_8_1_6 = new JPanel();
		panel_2_8_1_6.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2_8_1_6.setLayout(null);
		panel_2_8_1_6.setBackground(new Color(139, 0, 0));
		panel_2_8_1_6.setBounds(418, 344, 138, 107);
		panel.add(panel_2_8_1_6);
		
		JLabel lblNewLabel_1_5_2 = new JLabel("");
		lblNewLabel_1_5_2.setBounds(20, 42, 105, 82);
		panel_2_8_1_6.add(lblNewLabel_1_5_2);
		lblNewLabel_1_5_2.setIcon(new ImageIcon("C:\\Users\\user\\Downloads\\toppng.com-hot-dog-974x5241.png"));
		lblNewLabel_1_5_2.setBackground(new Color(139, 0, 0));
		
		JLabel lblNewLabel_1_6 = new JLabel("");
		lblNewLabel_1_6.setIcon(new ImageIcon("C:\\Users\\user\\Downloads\\imgbin_soft-drink-popcorn-png.png"));
		lblNewLabel_1_6.setBackground(new Color(139, 0, 0));
		lblNewLabel_1_6.setBounds(10, 15, 105, 82);
		panel_2_8_1_6.add(lblNewLabel_1_6);
		
		JLabel lblNewLabel_3_6 = new JLabel("");
		lblNewLabel_3_6.setBounds(57, 5, 0, 0);
		panel_2_8_1_6.add(lblNewLabel_3_6);
		
		JLabel lblNewLabel_2_6 = new JLabel("");
		lblNewLabel_2_6.setBounds(62, 5, 0, 0);
		panel_2_8_1_6.add(lblNewLabel_2_6);
		
		JLabel lblNewLabel_5_3 = new JLabel("Combo 3");
		lblNewLabel_5_3.setForeground(Color.WHITE);
		lblNewLabel_5_3.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_5_3.setBounds(93, 4, 45, 13);
		panel_2_8_1_6.add(lblNewLabel_5_3);
		
		JRadioButton rdbtnlemtea = new JRadioButton("Lemon Tea");
		rdbtnlemtea.setBackground(new Color(0, 0, 0));
		rdbtnlemtea.setForeground(new Color(255, 255, 255));
		rdbtnlemtea.setFont(new Font("Tahoma", Font.BOLD, 8));
		rdbtnlemtea.setBounds(51, 267, 76, 21);
		panel.add(rdbtnlemtea);
		
		JRadioButton rdbtnsprite = new JRadioButton("Sprite");
		rdbtnsprite.setFont(new Font("Tahoma", Font.BOLD, 8));
		rdbtnsprite.setForeground(new Color(255, 255, 255));
		rdbtnsprite.setBackground(new Color(0, 0, 0));
		rdbtnsprite.setBounds(150, 267, 76, 21);
		panel.add(rdbtnsprite);
		
		JRadioButton rdbtncocacola = new JRadioButton("Coca Cola");
		rdbtncocacola.setBackground(new Color(0, 0, 0));
		rdbtncocacola.setForeground(new Color(255, 255, 255));
		rdbtncocacola.setFont(new Font("Tahoma", Font.BOLD, 8));
		rdbtncocacola.setBounds(249, 267, 76, 21);
		panel.add(rdbtncocacola);
		
		JRadioButton rdbtnmilo = new JRadioButton("Iced Milo");
		rdbtnmilo.setForeground(new Color(255, 255, 255));
		rdbtnmilo.setBackground(new Color(0, 0, 0));
		rdbtnmilo.setBounds(346, 267, 76, 21);
		panel.add(rdbtnmilo);
		
		JRadioButton rdbtncoklat = new JRadioButton("Hot Chocolate");
		rdbtncoklat.setFont(new Font("Tahoma", Font.BOLD, 8));
		rdbtncoklat.setForeground(new Color(255, 255, 255));
		rdbtncoklat.setBackground(new Color(0, 0, 0));
		rdbtncoklat.setBounds(444, 267, 101, 21);
		panel.add(rdbtncoklat);
		
		JRadioButton rdbtncombo1 = new JRadioButton("1x Popcorn, 1x Coca Cola");
		rdbtncombo1.setForeground(new Color(255, 255, 255));
		rdbtncombo1.setBackground(new Color(0, 0, 0));
		rdbtncombo1.setFont(new Font("Tahoma", Font.BOLD, 8));
		rdbtncombo1.setBounds(51, 457, 150, 21);
		panel.add(rdbtncombo1);
		
		JRadioButton rdbtncombo2 = new JRadioButton("2x Popcorn, 2x Coca Cola");
		rdbtncombo2.setFont(new Font("Tahoma", Font.BOLD, 8));
		rdbtncombo2.setForeground(new Color(255, 255, 255));
		rdbtncombo2.setBackground(new Color(0, 0, 0));
		rdbtncombo2.setBounds(239, 457, 166, 21);
		panel.add(rdbtncombo2);
		
		JRadioButton rdbtncombo3 = new JRadioButton("1x Popcorn, 1x Coca Cola, 1x Hotdog");
		rdbtncombo3.setFont(new Font("Tahoma", Font.BOLD, 8));
		rdbtncombo3.setForeground(new Color(255, 255, 255));
		rdbtncombo3.setBackground(new Color(0, 0, 0));
		rdbtncombo3.setVerticalAlignment(SwingConstants.BOTTOM);
		rdbtncombo3.setBounds(405, 455, 193, 21);
		panel.add(rdbtncombo3);
		
		texthotdog = new JTextField();
		texthotdog.setBounds(90, 167, 47, 19);
		panel.add(texthotdog);
		texthotdog.setColumns(10);
		
		textpopcorn = new JTextField();
		textpopcorn.setBounds(224, 167, 47, 19);
		panel.add(textpopcorn);
		textpopcorn.setColumns(10);
		
		textsausage = new JTextField();
		textsausage.setColumns(10);
		textsausage.setBounds(353, 170, 47, 19);
		panel.add(textsausage);
		
		textmac = new JTextField();
		textmac.setColumns(10);
		textmac.setBounds(498, 170, 47, 19);
		panel.add(textmac);
		
		textlemtea = new JTextField();
		textlemtea.setColumns(10);
		textlemtea.setBounds(71, 294, 37, 19);
		panel.add(textlemtea);
		
		textsprite = new JTextField();
		textsprite.setColumns(10);
		textsprite.setBounds(170, 294, 37, 19);
		panel.add(textsprite);
		
		textcola = new JTextField();
		textcola.setColumns(10);
		textcola.setBounds(269, 294, 37, 19);
		panel.add(textcola);
		
		textmilo = new JTextField();
		textmilo.setColumns(10);
		textmilo.setBounds(368, 322, 37, 19);
		panel.add(textmilo);
		
		textcoklat = new JTextField();
		textcoklat.setColumns(10);
		textcoklat.setBounds(464, 294, 37, 19);
		panel.add(textcoklat);
		
		textcombo1 = new JTextField();
		textcombo1.setColumns(10);
		textcombo1.setBounds(90, 484, 47, 19);
		panel.add(textcombo1);
		
		textcombo2 = new JTextField();
		textcombo2.setColumns(10);
		textcombo2.setBounds(290, 484, 47, 19);
		panel.add(textcombo2);
		
		textcombo3 = new JTextField();
		textcombo3.setColumns(10);
		textcombo3.setBounds(481, 484, 47, 19);
		panel.add(textcombo3);
		
		JCheckBox chckbxhotdog = new JCheckBox("Hotdog");
		chckbxhotdog.setFont(new Font("Tahoma", Font.BOLD, 8));
		chckbxhotdog.setForeground(new Color(255, 255, 255));
		chckbxhotdog.setBackground(new Color(139, 0, 0));
		chckbxhotdog.setBounds(61, 143, 93, 21);
		panel.add(chckbxhotdog);
		
		JCheckBox chckbxpopcorn = new JCheckBox("Popcorn");
		chckbxpopcorn.setFont(new Font("Tahoma", Font.BOLD, 8));
		chckbxpopcorn.setForeground(new Color(255, 255, 255));
		chckbxpopcorn.setBackground(new Color(139, 0, 0));
		chckbxpopcorn.setBounds(198, 143, 93, 21);
		panel.add(chckbxpopcorn);
		
		JCheckBox chckbxsausage = new JCheckBox("Sausage");
		chckbxsausage.setForeground(new Color(255, 255, 255));
		chckbxsausage.setBackground(new Color(139, 0, 0));
		chckbxsausage.setFont(new Font("Tahoma", Font.BOLD, 8));
		chckbxsausage.setBounds(335, 143, 93, 21);
		panel.add(chckbxsausage);
		
		JRadioButton rdbtnhotmilo = new JRadioButton("Hot Milo");
		rdbtnhotmilo.setForeground(new Color(255, 255, 255));
		rdbtnhotmilo.setBackground(new Color(0, 0, 0));
		rdbtnhotmilo.setBounds(346, 293, 103, 21);
		panel.add(rdbtnhotmilo);
		
		JCheckBox chckbxmac = new JCheckBox("Mac & Cheese");
		chckbxmac.setForeground(new Color(255, 255, 255));
		chckbxmac.setBackground(new Color(139, 0, 0));
		chckbxmac.setFont(new Font("Tahoma", Font.BOLD, 8));
		chckbxmac.setBounds(477, 143, 93, 21);
		panel.add(chckbxmac);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(697, 41, 328, 437);
		panel.add(textArea);
		
		JButton btnproceed2 = new JButton("Proceed");
		btnproceed2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				food = textArea.getText();
				bev = textArea.getText();
				combo = textArea.getText();
				
			   	int valhotdog = 0;
			   	int valpopcorn = 0;
			   	int valsausage = 0;
				int valmac = 0;
				int vallemtea = 0;
				int valcola = 0;
				int valcoklat = 0;
				int valsprite = 0;
				int valmilo = 0;
				int valcombo1 = 0;
				int valcombo2 = 0;
				int valcombo3 = 0;
				
			   	valhotdog = valhotdog + Integer.parseInt(texthotdog.getText());
				valpopcorn = valpopcorn + Integer.parseInt(textpopcorn.getText());
				valsausage = valsausage + Integer.parseInt(textsausage.getText());
				valmac = valmac + Integer.parseInt(textmac.getText());
				vallemtea = vallemtea + Integer.parseInt(textlemtea.getText());
				valcola = valcola + Integer.parseInt(textcola.getText());
				valcoklat = valcoklat + Integer.parseInt(textcoklat.getText());
				valsprite = valsprite + Integer.parseInt(textsprite.getText());
				valmilo = valmilo + Integer.parseInt(textmilo.getText());
				valcombo1 = valcombo1 + Integer.parseInt(textcombo1.getText());
				valcombo2 = valcombo2 + Integer.parseInt(textcombo2.getText());
				valcombo3 = valcombo3 + Integer.parseInt(textcombo3.getText());
				 
				 
				hotdog = 5.00 * valhotdog;
				popcorn = 5.00 * valpopcorn;
				sausage = 8.00 * valsausage;
				mac = 12.00 * valmac;
				softdrinklarge = 2.60;
				softdrinkregular = 3.10;
				icemilo = 3.30 * valmilo;
				hotmilo = 4.40 * valmilo;
			   	hotcoklat = 4.20 * valcoklat;
			   	combo1 = 8.00 * valcombo1;
			   	combo2 = 16.00 * valcombo2;
			   	combo3 = 12.80 * valcombo3;
			   	
			   	
			   	
			   	if(chckbxpopcorn.isSelected()) {
		  			 food = food + chckbxpopcorn.getText() + "RM " + popcorn;
		  			 total = total + popcorn;
		  		}
		  		if(chckbxhotdog.isSelected()) {
		  			 food = food + chckbxhotdog.getText() + "RM " + hotdog;
		  			 total = total + hotdog;
		  		}
		  		if(chckbxsausage.isSelected()) {
		  			 food = food + chckbxsausage.getText() + "RM " + sausage;
		  			 total = total + sausage;
		  		}
		  		if(chckbxmac.isSelected()) {
		  			 food = food + chckbxmac.getText() + "RM " + mac;
		  			 total = total + mac;
		  		}
		  		 
		  		 
		  		if(rdbtnlemtea.isSelected()) {
		  			if(chckbxlargelemtea.isSelected()) {
		  				 bev = bev + rdbtnlemtea.getText() + "RM " + softdrinklarge;
		  				 total = softdrinklarge;
		  			} else if(chckbxregularlemtea.isSelected()) {
		  				 bev = bev + rdbtnlemtea.getText() + "RM " + softdrinkregular;
		  				 total = total + softdrinkregular;
		  				
		  			}
		  		}
		  		if(rdbtncocacola.isSelected()) {
		  			if(chckbxlargecola.isSelected()) {
		  				 bev = bev + rdbtncocacola.getText() + "RM " + softdrinklarge;
		  				 total = total + softdrinklarge;
		  			} else if(chckbxregularcola.isSelected()) {
		  				bev = bev + rdbtncocacola.getText() + "RM " + softdrinkregular;
		  				total = total + softdrinkregular;
		  			}
		  		}
		  		if(rdbtncoklat.isSelected()) {
		  			bev = bev + rdbtncoklat.getText() + "RM " + hotcoklat;
		  			total = total + hotcoklat;
		  		}
		  		if(rdbtnsprite.isSelected()) {
		  			if(chckbxlargesprite.isSelected()) {
		  				 bev = bev + rdbtnsprite.getText() + "RM " + softdrinklarge;
		  				total = total + softdrinklarge;
		  			} else if(chckbxregularsprite.isSelected()) {
		  				bev = bev + rdbtnsprite.getText() + "RM " + softdrinkregular;
		  				total = total + softdrinkregular;
		  			}
		  		}
		  		if(rdbtnmilo.isSelected()) {
		  			bev = bev + rdbtnmilo.getText() + "RM " + icemilo;
		  			total = total + icemilo;
		  		}
		  		if(rdbtnhotmilo.isSelected()) {
		  			bev = bev + rdbtnmilo.getText() + "RM " + hotmilo;
		  			total = total + hotmilo;
		  		}
		  		
		  	    if(rdbtncombo1.isSelected()) {
		  			bev = bev + rdbtncombo1.getText() + "RM " + combo1;
		  			total = total + combo1;
		  		}
		  		if(rdbtncombo2.isSelected()) {
		  			bev = bev + rdbtncombo2.getText() + "RM " + combo2;
		  			total = total + combo2;
		  		}
		  		if(rdbtncombo3.isSelected()) {
		  			bev = bev + rdbtncombo3.getText() + "RM " + icemilo;
		  			total = total + icemilo;
		  		}
		  		textArea.setText(bev + food + total);
				
				
			}
		});
		btnproceed2.setForeground(new Color(255, 255, 255));
		btnproceed2.setBounds(471, 526, 85, 21);
		panel.add(btnproceed2);
		
		
  		
  		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String totalbev = bev;
			   	double totalfnb = total;
			   	String totalfood = food;
				
				frame4 f4 = new frame4(movie, time, numseat, totalseat, name, pass, dispmovprice, totalbev, totalfood, totalfnb);
				setVisible(false);
				f4.setVisible(true);
				
			}
		});
		btnNext.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnNext.setForeground(new Color(255, 255, 255));
		btnNext.setBackground(new Color(139, 0, 0));
		btnNext.setBounds(940, 502, 85, 21);
		panel.add(btnNext);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setBounds(330, 344, 45, 13);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_5_1 = new JLabel("Combo 2");
		lblNewLabel_5_1.setForeground(Color.WHITE);
		lblNewLabel_5_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_5_1.setBounds(330, 344, 45, 13);
		panel.add(lblNewLabel_5_1);
		
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 0));
		panel_1.setBounds(0, 0, 1080, 54);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Food and Beverages");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 25));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(10, 10, 255, 34);
		panel_1.add(lblNewLabel);
		
		
		
		
		
		
	}
}
