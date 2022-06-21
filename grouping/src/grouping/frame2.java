package grouping;
import java.util.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.ImageIcon;

public class frame2 extends JFrame {

	private JPanel contentPane;
	private JTextField textdispseat;
	private JFrame frame2;
	JLabel lbldispmov;
	JLabel lbldisptime;
	JLabel lbldispseat;
	JLabel lblprice;
	String seat;
	int movprice;
	int seatprice;
	int price;
	String movie;
    String time;
    String numseat;
    double totalseat;
    JLabel lbldispmovprice;
    double dispmovprice;
    double b = 15.00;
    double m = 17.00;
    double mar = 20.00;
    double ass = 24.00;
 

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public frame2(String name, int pass) {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1075, 671);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.BLACK);
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(139, 0, 0), new Color(139, 0, 0)), "Showtime", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 255, 255)));
		panel.setBackground(Color.BLACK);
		panel.setBounds(24, 73, 701, 540);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBackground(Color.DARK_GRAY);
		panel_1.setBounds(26, 56, 324, 187);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblboboiboyprice = new JLabel("RM 15");
		lblboboiboyprice.setBackground(new Color(128, 0, 0));
		lblboboiboyprice.setForeground(new Color(255, 255, 255));
		lblboboiboyprice.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblboboiboyprice.setBounds(0, -12, 95, 42);
		panel_1.add(lblboboiboyprice);

		JButton btn1115 = new JButton("11:15");
		btn1115.setFont(new Font("Tahoma", Font.BOLD, 8));
		btn1115.setBackground(new Color(139, 0, 0));
		btn1115.setForeground(new Color(255, 255, 255));
		btn1115.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbldispmov.setText("Boboiboy the Movie");
				lbldisptime.setText("11:15");
				lbldispmovprice.setText("" + b);
			}
		});
		
		
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\user\\Downloads\\7boiboiboi00_450 (2).jpg"));
		lblNewLabel_4.setBounds(36, 22, 127, 143);
		panel_1.add(lblNewLabel_4);
		btn1115.setBounds(174, 38, 59, 21);
		panel_1.add(btn1115);
		
		JButton btn1130 = new JButton("11:30");
		btn1130.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbldispmov.setText("Boboiboy the Movie");
				lbldisptime.setText("11:30");
				lbldispmovprice.setText("" + b);
			}
		});
		btn1130.setFont(new Font("Tahoma", Font.BOLD, 8));
		btn1130.setForeground(new Color(255, 255, 255));
		btn1130.setBackground(new Color(139, 0, 0));
		btn1130.setBounds(243, 38, 59, 21);
		panel_1.add(btn1130);
		
		JButton btn1200 = new JButton("12:00");
		btn1200.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbldispmov.setText("Boboiboy the Movie");
				lbldisptime.setText("12:00 p.m");
				lbldispmovprice.setText("" + b);
			}
		});
		btn1200.setFont(new Font("Tahoma", Font.BOLD, 8));
		btn1200.setBackground(new Color(139, 0, 0));
		btn1200.setForeground(new Color(255, 255, 255));
		btn1200.setBounds(174, 72, 59, 21);
		panel_1.add(btn1200);
		
		JButton btn440 = new JButton("4:40");
		btn440.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbldispmov.setText("Boboiboy the Movie");
				lbldisptime.setText("4:40 p.m");
				lbldispmovprice.setText("" + b);
			}
		});
		btn440.setFont(new Font("Tahoma", Font.BOLD, 8));
		btn440.setBackground(new Color(139, 0, 0));
		btn440.setForeground(new Color(255, 255, 255));
		btn440.setBounds(243, 69, 59, 21);
		panel_1.add(btn440);
		
		JButton btn700 = new JButton("7:00");
		btn700.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbldispmov.setText("Boboiboy the Movie");
				lbldisptime.setText("7:00 p.m");
				lbldispmovprice.setText("" + b);
			}
		});
		btn700.setFont(new Font("Tahoma", Font.BOLD, 8));
		btn700.setForeground(new Color(255, 255, 255));
		btn700.setBackground(new Color(139, 0, 0));
		btn700.setBounds(174, 103, 59, 21);
		panel_1.add(btn700);
		
		JButton btn1000 = new JButton("10:00");
		btn1000.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbldispmov.setText("Boboiboy the Movie");
				lbldisptime.setText("10:00 p.m");
				lbldispmovprice.setText("" + b);
			}
		});
		btn1000.setFont(new Font("Tahoma", Font.BOLD, 8));
		btn1000.setBackground(new Color(139, 0, 0));
		btn1000.setForeground(new Color(255, 255, 255));
		btn1000.setBounds(243, 103, 59, 21);
		panel_1.add(btn1000);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBackground(Color.DARK_GRAY);
		panel_2.setBounds(360, 56, 324, 187);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblminionsprice = new JLabel("RM 17");
		lblminionsprice.setForeground(Color.WHITE);
		lblminionsprice.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblminionsprice.setBounds(0, -14, 95, 49);
		panel_2.add(lblminionsprice);
		
		JButton btn1130a = new JButton("1130");
		btn1130a.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbldispmov.setText("Minions");
				lbldisptime.setText("11:30 a.m");
				lbldispmovprice.setText("" + m);
			}
		});
		
		
		btn1130a.setFont(new Font("Tahoma", Font.BOLD, 8));
		btn1130a.setForeground(new Color(255, 255, 255));
		btn1130a.setBackground(new Color(139, 0, 0));
		btn1130a.setBounds(239, 46, 59, 21);
		panel_2.add(btn1130a);
		
		JButton btn1200a = new JButton("12:00");
		btn1200a.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbldispmov.setText("Minions");
				lbldisptime.setText("12:00 p.m");
				lbldispmovprice.setText("" + m);
			}
		});
		btn1200a.setFont(new Font("Tahoma", Font.BOLD, 8));
		btn1200a.setForeground(new Color(255, 255, 255));
		btn1200a.setBackground(new Color(139, 0, 0));
		btn1200a.setBounds(170, 77, 59, 21);
		panel_2.add(btn1200a);
		
		JButton btn440a = new JButton("4:40");
		btn440a.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbldispmov.setText("Minions");
				lbldisptime.setText("4:40 p.m");
				lbldispmovprice.setText("" + m);
			}
		});
		btn440a.setFont(new Font("Tahoma", Font.BOLD, 8));
		btn440a.setBackground(new Color(139, 0, 0));
		btn440a.setForeground(new Color(255, 255, 255));
		btn440a.setBounds(239, 77, 59, 21);
		panel_2.add(btn440a);
		
		JButton btn700a = new JButton("7:00");
		btn700a.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbldispmov.setText("Minions");
				lbldisptime.setText("7:00 p.m");
				lbldispmovprice.setText("" + m);
			}
		});
		btn700a.setFont(new Font("Tahoma", Font.BOLD, 8));
		btn700a.setForeground(new Color(255, 255, 255));
		btn700a.setBackground(new Color(139, 0, 0));
		btn700a.setBounds(170, 108, 59, 21);
		panel_2.add(btn700a);
		
		JButton btn1000a = new JButton("10:00");
		btn1000a.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbldispmov.setText("Minions");
				lbldisptime.setText("10:00 p.m");
				lbldispmovprice.setText("" + m);
			}
		});
		btn1000a.setFont(new Font("Tahoma", Font.BOLD, 8));
		btn1000a.setBackground(new Color(139, 0, 0));
		btn1000a.setForeground(new Color(255, 255, 255));
		btn1000a.setBounds(239, 108, 59, 21);
		panel_2.add(btn1000a);
		
		JButton btn1115a = new JButton("1115");
		btn1115a.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbldispmov.setText("Minions");
				lbldisptime.setText("11:15 a.m");
				lbldispmovprice.setText("" + m);
			}
		});
		btn1115a.setFont(new Font("Tahoma", Font.BOLD, 8));
		btn1115a.setBounds(170, 46, 59, 21);
		panel_2.add(btn1115a);
		btn1115a.setBackground(new Color(139, 0, 0));
		btn1115a.setForeground(new Color(255, 255, 255));
		
		JLabel lblNewLabel_4_1 = new JLabel("");
		lblNewLabel_4_1.setIcon(new ImageIcon("C:\\Users\\user\\Downloads\\Minions_(2015_film)1.jpg"));
		lblNewLabel_4_1.setBounds(33, 23, 127, 143);
		panel_2.add(lblNewLabel_4_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_3.setBackground(Color.DARK_GRAY);
		panel_3.setBounds(26, 302, 324, 187);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblmarvelprice = new JLabel("RM 20");
		lblmarvelprice.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblmarvelprice.setForeground(Color.WHITE);
		lblmarvelprice.setBounds(0, -17, 95, 54);
		panel_3.add(lblmarvelprice);
		
		JButton btn1115b = new JButton("11:15");
		btn1115b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbldispmov.setText("Marvel The Avengers");
				lbldisptime.setText("11:15 a.m");
				lbldispmovprice.setText("" + mar);
			}
		});
		
		
		
		JLabel lblNewLabel_4_2 = new JLabel("");
		lblNewLabel_4_2.setIcon(new ImageIcon("C:\\Users\\user\\Downloads\\AvengersEndgame_Payoff1.jpg"));
		lblNewLabel_4_2.setBounds(34, 22, 127, 143);
		panel_3.add(lblNewLabel_4_2);
		btn1115b.setFont(new Font("Tahoma", Font.BOLD, 8));
		btn1115b.setBackground(new Color(139, 0, 0));
		btn1115b.setForeground(new Color(255, 255, 255));
		btn1115b.setBounds(171, 55, 59, 21);
		panel_3.add(btn1115b);
		
		JButton btn1130b = new JButton("11:30");
		btn1130b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbldispmov.setText("Marvel The Avengers");
				lbldisptime.setText("11:30 a.m");
				lbldispmovprice.setText("" + mar);
			}
		});
		btn1130b.setFont(new Font("Tahoma", Font.BOLD, 8));
		btn1130b.setForeground(new Color(255, 255, 255));
		btn1130b.setBackground(new Color(139, 0, 0));
		btn1130b.setBounds(236, 55, 59, 21);
		panel_3.add(btn1130b);
		
		JButton btn1200b = new JButton("12:00");
		btn1200b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbldispmov.setText("Marvel The Avengers");
				lbldisptime.setText("12:00 a.m");
				lbldispmovprice.setText("" + mar);
			}
		});
		btn1200b.setFont(new Font("Tahoma", Font.BOLD, 8));
		btn1200b.setForeground(new Color(255, 255, 255));
		btn1200b.setBackground(new Color(139, 0, 0));
		btn1200b.setBounds(171, 86, 59, 21);
		panel_3.add(btn1200b);
		
		JButton btn440b = new JButton("4:40");
		btn440b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbldispmov.setText("Marvel The Avengers");
				lbldisptime.setText("4:40 p.m");
				lbldispmovprice.setText("" + mar);
			}
		});
		btn440b.setFont(new Font("Tahoma", Font.BOLD, 8));
		btn440b.setForeground(new Color(255, 255, 255));
		btn440b.setBackground(new Color(139, 0, 0));
		btn440b.setBounds(236, 86, 59, 21);
		panel_3.add(btn440b);
		
		JButton btn700b = new JButton("7:00");
		btn700b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbldispmov.setText("Marvel The Avengers");
				lbldisptime.setText("7:00 p.m");
				lbldispmovprice.setText("" + mar);
			}
		});
		btn700b.setFont(new Font("Tahoma", Font.BOLD, 8));
		btn700b.setBackground(new Color(139, 0, 0));
		btn700b.setForeground(new Color(255, 255, 255));
		btn700b.setBounds(171, 117, 59, 21);
		panel_3.add(btn700b);
		
		JButton btn1000b = new JButton("10:00");
		btn1000b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbldispmov.setText("Marvel The Avengers");
				lbldisptime.setText("10:00 p.m");
				lbldispmovprice.setText("" + mar);
			}
		});
		btn1000b.setFont(new Font("Tahoma", Font.BOLD, 8));
		btn1000b.setForeground(new Color(255, 255, 255));
		btn1000b.setBackground(new Color(139, 0, 0));
		btn1000b.setBounds(236, 117, 59, 21);
		panel_3.add(btn1000b);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_3_1.setBackground(Color.DARK_GRAY);
		panel_3_1.setBounds(360, 302, 324, 187);
		panel.add(panel_3_1);
		panel_3_1.setLayout(null);
		
		JLabel lblassistanprice = new JLabel("RM 24");
		lblassistanprice.setForeground(Color.WHITE);
		lblassistanprice.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblassistanprice.setBounds(0, -15, 95, 54);
		panel_3_1.add(lblassistanprice);
		
		JButton btn1115c = new JButton("11:15");
		btn1115c.setFont(new Font("Tahoma", Font.BOLD, 8));
		btn1115c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbldispmov.setText("The Assistant");
				lbldisptime.setText("11:15 a.m");
				lbldispmovprice.setText("" + ass);
			}
		});
		btn1115c.setBackground(new Color(139, 0, 0));
		btn1115c.setForeground(new Color(255, 255, 255));
		btn1115c.setBounds(168, 52, 59, 21);
		panel_3_1.add(btn1115c);
		
		JButton btn1130c = new JButton("11:30");
		btn1130c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbldispmov.setText("The Assistant");
				lbldisptime.setText("11:30 a.m");
				lbldispmovprice.setText("" + ass);
			}
		});
		btn1130c.setFont(new Font("Tahoma", Font.BOLD, 8));
		btn1130c.setForeground(new Color(255, 255, 255));
		btn1130c.setBackground(new Color(139, 0, 0));
		btn1130c.setBounds(237, 52, 59, 21);
		panel_3_1.add(btn1130c);
		
		JButton btn1200c = new JButton("12:00");
		btn1200c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbldispmov.setText("The Assistant");
				lbldisptime.setText("12:00 p.m");
				lbldispmovprice.setText("" + ass);
			}
			
		});
		btn1200c.setFont(new Font("Tahoma", Font.BOLD, 8));
		btn1200c.setBackground(new Color(139, 0, 0));
		btn1200c.setForeground(new Color(255, 255, 255));
		btn1200c.setBounds(168, 83, 59, 21);
		panel_3_1.add(btn1200c);
		
		JButton btn440c = new JButton("4:40");
		btn440c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbldispmov.setText("The Assistant");
				lbldisptime.setText("4:40 p.m");
				lbldispmovprice.setText("" + ass);
			}
		});
		btn440c.setFont(new Font("Tahoma", Font.BOLD, 8));
		btn440c.setBackground(new Color(139, 0, 0));
		btn440c.setForeground(new Color(255, 255, 255));
		btn440c.setBounds(237, 83, 59, 21);
		panel_3_1.add(btn440c);
		
		JButton btn700c = new JButton("7:00");
		btn700c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbldispmov.setText("The Assistant");
				lbldisptime.setText("7:00 p.m");
				lbldispmovprice.setText("" + ass);
			}
		});
		btn700c.setFont(new Font("Tahoma", Font.BOLD, 8));
		btn700c.setForeground(new Color(255, 255, 255));
		btn700c.setBackground(new Color(139, 0, 0));
		btn700c.setBounds(168, 114, 59, 21);
		panel_3_1.add(btn700c);
		
		JButton btn1000c = new JButton("10:00");
		btn1000c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbldispmov.setText("The Assistant");
				lbldisptime.setText("10:00 p.m");
				lbldispmovprice.setText("" + ass);
			}
		});
		btn1000c.setFont(new Font("Tahoma", Font.BOLD, 8));
		btn1000c.setForeground(new Color(255, 255, 255));
		btn1000c.setBackground(new Color(139, 0, 0));
		btn1000c.setBounds(237, 114, 59, 21);
		panel_3_1.add(btn1000c);
		
		JLabel lblNewLabel_4_3 = new JLabel("");
		lblNewLabel_4_3.setIcon(new ImageIcon("C:\\Users\\user\\Downloads\\7assistant00_4501.jpg"));
		lblNewLabel_4_3.setBounds(36, 25, 127, 143);
		panel_3_1.add(lblNewLabel_4_3);
		
		
		
		JLabel lblNewLabel = new JLabel("Boboiboy The Movie");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(26, 33, 156, 13);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Minions");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(360, 33, 107, 13);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Marvel The Avengers");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(26, 280, 171, 13);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("The Assistant");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(360, 280, 107, 13);
		panel.add(lblNewLabel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_4.setBackground(Color.DARK_GRAY);
		panel_4.setBounds(735, 148, 304, 465);
		contentPane.add(panel_4);
		panel_4.setLayout(null);
		
		JCheckBox chckbxA7 = new JCheckBox("A-7");
		chckbxA7.setBackground(Color.DARK_GRAY);
		chckbxA7.setBounds(27, 266, 17, 21);
		panel_4.add(chckbxA7);
		
		JCheckBox chckbxB7 = new JCheckBox("B-7");
		chckbxB7.setBackground(Color.DARK_GRAY);
		chckbxB7.setBounds(27, 242, 17, 21);
		panel_4.add(chckbxB7);
		
		JCheckBox chckbxC7 = new JCheckBox("C-7");
		chckbxC7.setBackground(Color.DARK_GRAY);
		chckbxC7.setBounds(27, 219, 17, 21);
		panel_4.add(chckbxC7);
		
		JCheckBox chckbxD7 = new JCheckBox("D-7");
		chckbxD7.setBackground(Color.DARK_GRAY);
		chckbxD7.setForeground(Color.DARK_GRAY);
		chckbxD7.setBounds(27, 196, 17, 21);
		panel_4.add(chckbxD7);
		
		JCheckBox chckbxE7 = new JCheckBox("E-7");
		chckbxE7.setBackground(Color.DARK_GRAY);
		chckbxE7.setBounds(27, 170, 17, 21);
		panel_4.add(chckbxE7);
		
		JCheckBox chckbxA5 = new JCheckBox("A-4");
		chckbxA5.setBackground(Color.DARK_GRAY);
		chckbxA5.setBounds(118, 266, 23, 21);
		panel_4.add(chckbxA5);
		
		JCheckBox chckbxB5 = new JCheckBox("B-5");
		chckbxB5.setBackground(Color.DARK_GRAY);
		chckbxB5.setBounds(118, 242, 23, 21);
		panel_4.add(chckbxB5);
		
		JCheckBox chckbxC5 = new JCheckBox("C-5");
		chckbxC5.setBackground(Color.DARK_GRAY);
		chckbxC5.setBounds(118, 219, 23, 21);
		panel_4.add(chckbxC5);
		
		JCheckBox chckbxA6 = new JCheckBox("A-6");
		chckbxA6.setBackground(Color.DARK_GRAY);
		chckbxA6.setBounds(52, 266, 17, 21);
		panel_4.add(chckbxA6);
		
		JCheckBox chckbxB6 = new JCheckBox("B-6");
		chckbxB6.setBackground(Color.DARK_GRAY);
		chckbxB6.setBounds(52, 242, 17, 21);
		panel_4.add(chckbxB6);
		
		JCheckBox chckbxC6 = new JCheckBox("C-6");
		chckbxC6.setBackground(Color.DARK_GRAY);
		chckbxC6.setBounds(52, 219, 17, 21);
		panel_4.add(chckbxC6);
		
		JCheckBox chckbxD6 = new JCheckBox("D-6");
		chckbxD6.setBackground(Color.DARK_GRAY);
		chckbxD6.setBounds(52, 196, 17, 21);
		panel_4.add(chckbxD6);
		
		JCheckBox chckbxE6 = new JCheckBox("E-6");
		chckbxE6.setBackground(Color.DARK_GRAY);
		chckbxE6.setForeground(Color.DARK_GRAY);
		chckbxE6.setBounds(52, 170, 17, 21);
		panel_4.add(chckbxE6);
		
		JCheckBox chckbxA4 = new JCheckBox("A-4");
		chckbxA4.setBackground(Color.DARK_GRAY);
		chckbxA4.setBounds(139, 266, 23, 21);
		panel_4.add(chckbxA4);
		
		JCheckBox chckbxB4 = new JCheckBox("B-4");
		chckbxB4.setBackground(Color.DARK_GRAY);
		chckbxB4.setBounds(138, 242, 23, 21);
		panel_4.add(chckbxB4);
		
		JCheckBox chckbxC4 = new JCheckBox("C-4");
		chckbxC4.setBackground(Color.DARK_GRAY);
		chckbxC4.setBounds(139, 219, 23, 21);
		panel_4.add(chckbxC4);
		
		JCheckBox chckbxD5 = new JCheckBox("D-5");
		chckbxD5.setBackground(Color.DARK_GRAY);
		chckbxD5.setBounds(118, 196, 23, 21);
		panel_4.add(chckbxD5);
		
		JCheckBox chckbxD4 = new JCheckBox("D-4");
		chckbxD4.setBackground(Color.DARK_GRAY);
		chckbxD4.setBounds(139, 196, 23, 21);
		panel_4.add(chckbxD4);
		
		JCheckBox chckbxE5 = new JCheckBox("E-5");
		chckbxE5.setBackground(Color.DARK_GRAY);
		chckbxE5.setBounds(116, 170, 23, 21);
		panel_4.add(chckbxE5);
		
		JCheckBox chckbxE4 = new JCheckBox("E-4");
		chckbxE4.setBackground(Color.DARK_GRAY);
		chckbxE4.setBounds(139, 170, 23, 21);
		panel_4.add(chckbxE4);
		
		JCheckBox chckbxA3 = new JCheckBox("A-3");
		chckbxA3.setBackground(Color.DARK_GRAY);
		chckbxA3.setBounds(164, 266, 23, 21);
		panel_4.add(chckbxA3);
		
		JCheckBox chckbxB3 = new JCheckBox("B-3");
		chckbxB3.setBackground(Color.DARK_GRAY);
		chckbxB3.setBounds(163, 242, 24, 21);
		panel_4.add(chckbxB3);
		
		JCheckBox chckbxC3 = new JCheckBox("C-3");
		chckbxC3.setBackground(Color.DARK_GRAY);
		chckbxC3.setBounds(163, 219, 23, 21);
		panel_4.add(chckbxC3);
		
		JCheckBox chckbxD3 = new JCheckBox("D-3");
		chckbxD3.setBackground(Color.DARK_GRAY);
		chckbxD3.setBounds(164, 196, 23, 21);
		panel_4.add(chckbxD3);
		
		JCheckBox chckbxE3 = new JCheckBox("E-3");
		chckbxE3.setBackground(Color.DARK_GRAY);
		chckbxE3.setBounds(164, 170, 23, 21);
		panel_4.add(chckbxE3);
		
		JCheckBox chckbxA2 = new JCheckBox("A-2");
		chckbxA2.setBackground(Color.DARK_GRAY);
		chckbxA2.setBounds(232, 266, 23, 21);
		panel_4.add(chckbxA2);
		
		JCheckBox chckbxB2 = new JCheckBox("B-2");
		chckbxB2.setBackground(Color.DARK_GRAY);
		chckbxB2.setBounds(232, 242, 23, 21);
		panel_4.add(chckbxB2);
		
		JCheckBox chckbxC2 = new JCheckBox("C-2");
		chckbxC2.setBackground(Color.DARK_GRAY);
		chckbxC2.setBounds(232, 219, 23, 21);
		panel_4.add(chckbxC2);
		
		JCheckBox chckbxD2 = new JCheckBox("D-2");
		chckbxD2.setBackground(Color.DARK_GRAY);
		chckbxD2.setBounds(232, 196, 23, 21);
		panel_4.add(chckbxD2);
		
		JCheckBox chckbxE2 = new JCheckBox("E2");
		chckbxE2.setBackground(Color.DARK_GRAY);
		chckbxE2.setBounds(232, 170, 23, 21);
		panel_4.add(chckbxE2);
		
		JCheckBox chckbxA1 = new JCheckBox("A-1");
		chckbxA1.setBackground(Color.DARK_GRAY);
		chckbxA1.setBounds(255, 266, 23, 21);
		panel_4.add(chckbxA1);
		
		JCheckBox chckbxB1 = new JCheckBox("B-1");
		chckbxB1.setBackground(Color.DARK_GRAY);
		chckbxB1.setBounds(257, 242, 23, 21);
		panel_4.add(chckbxB1);
		
		JCheckBox chckbxC1 = new JCheckBox("C-1");
		chckbxC1.setBackground(Color.DARK_GRAY);
		chckbxC1.setBounds(256, 219, 23, 21);
		panel_4.add(chckbxC1);
		
		JCheckBox chckbxD1 = new JCheckBox("D-1");
		chckbxD1.setBackground(Color.DARK_GRAY);
		chckbxD1.setBounds(255, 196, 23, 21);
		panel_4.add(chckbxD1);
		
		JCheckBox chckbxE1 = new JCheckBox("E-1");
		chckbxE1.setBackground(Color.DARK_GRAY);
		chckbxE1.setBounds(255, 170, 23, 21);
		panel_4.add(chckbxE1);
		
		textdispseat = new JTextField();
		textdispseat.setBounds(107, 330, 187, 25);
		panel_4.add(textdispseat);
		textdispseat.setColumns(10);
		
		JButton btnreset2 = new JButton("Reset");
		btnreset2.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnreset2.setForeground(new Color(255, 255, 255));
		btnreset2.setBackground(new Color(139, 0, 0));
		btnreset2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textdispseat.setText("");
				lbldispseat.setText("");
				lblprice.setText("");
			}
		});
		btnreset2.setBounds(27, 333, 70, 21);
		panel_4.add(btnreset2);
		
		JButton btnconfirm = new JButton("Confirm Seat");
		btnconfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seat = textdispseat.getText();
				movprice = 20;
				seatprice = 14;
				price =0;

				
				
				if(e.getSource() == btnconfirm) {
					
					if(chckbxA1.isSelected()) {
						seat = chckbxA1.getText();
						price = price + seatprice;
					}
					if(chckbxA2.isSelected()) {
						seat = seat + "," + chckbxA2.getText();
						price = price + seatprice;
				    }
					if(chckbxA3.isSelected()) {
						seat = seat + "," + chckbxA3.getText();
						price = price + seatprice;
				    }
					if(chckbxA4.isSelected()) {
						seat = seat + "," + chckbxA4.getText();
						price = price + seatprice;
				    }
					if(chckbxA5.isSelected()) {
						seat = seat + "," + chckbxA5.getText();
						price = price + seatprice;
				    }
					if(chckbxA6.isSelected()) {
						seat = seat + "," + chckbxA6.getText();
						price = price + seatprice;
				    }
					if(chckbxA7.isSelected()) {
						seat = seat + "," + chckbxA7.getText();
						price = price + seatprice;
				    }
					if(chckbxB1.isSelected()) {
						seat = seat + "," + chckbxB1.getText();
						price = price + seatprice;
					}
					if(chckbxB2.isSelected()) {
						seat = seat + "," + chckbxB2.getText();
						price = price + seatprice;
					}
					if(chckbxB3.isSelected()) {
						seat = seat + "," + chckbxB3.getText();
						price = price + seatprice;
					}
					if(chckbxB4.isSelected()) {
						seat = seat + "," + chckbxB4.getText();
						price = price + seatprice;
					}
					if(chckbxB5.isSelected()) {
						seat = seat + "," + chckbxB5.getText();
						price = price + seatprice;
					}
					if(chckbxB6.isSelected()) {
						seat = seat + "," + chckbxB6.getText();
						price = price + seatprice;
					}
					if(chckbxB7.isSelected()) {
						seat = seat + "," + chckbxB7.getText();
						price = price + seatprice;
					}

					if(chckbxC1.isSelected()) {
						seat =seat + "," + chckbxC1.getText();
						price = price + seatprice;
					}
					if(chckbxC2.isSelected()) {
						seat = seat + "," + chckbxC2.getText();
						price = price + seatprice;
				    }
					if(chckbxC3.isSelected()) {
						seat = seat + "," + chckbxC3.getText();
						price = price + seatprice;
				    }
					if(chckbxC4.isSelected()) {
						seat = seat + "," + chckbxC4.getText();
						price = price + seatprice;
				    }
					if(chckbxC5.isSelected()) {
						seat = seat + "," + chckbxC5.getText();
						price = price + seatprice;
				    }
					if(chckbxC6.isSelected()) {
						seat = seat + "," + chckbxC6.getText();
						price = price + seatprice;
				    }
					if(chckbxC7.isSelected()) {
						seat = seat + "," + chckbxC7.getText();
						price = price + seatprice;
				    }
					if(chckbxD1.isSelected()) {
						seat = seat + "," + chckbxD1.getText();
						price = price + seatprice;
					}
					if(chckbxD2.isSelected()) {
						seat = seat + "," + chckbxD2.getText();
						price = price + seatprice;
				    }
					if(chckbxD3.isSelected()) {
						seat = seat + "," + chckbxD3.getText();
						price = price + seatprice;
				    }
					if(chckbxD4.isSelected()) {
						seat = seat + "," + chckbxD4.getText();
						price = price + seatprice;
				    }
					if(chckbxD5.isSelected()) {
						seat = seat + "," + chckbxD5.getText();
						price = price + seatprice;
				    }
					if(chckbxD6.isSelected()) {
						seat = seat + "," + chckbxD6.getText();
						price = price + seatprice;
				    }
					if(chckbxD7.isSelected()) {
						seat = seat + "," + chckbxD7.getText();
						price = price + seatprice;
				    }
					if(chckbxE1.isSelected()) {
						seat = seat + "," + chckbxE1.getText();
						price = price + seatprice;
					}
					if(chckbxE2.isSelected()) {
						seat = seat + "," + chckbxE2.getText();
						price = price + seatprice;
				    }
					if(chckbxE3.isSelected()) {
						seat = seat + "," + chckbxE3.getText();
						price = price + seatprice;
				    }
					if(chckbxE4.isSelected()) {
						seat = seat + "," + chckbxE4.getText();
						price = price + seatprice;
				    }
					if(chckbxE5.isSelected()) {
						seat = seat + "," + chckbxE5.getText();
						price = price + seatprice;
				    }
					if(chckbxE6.isSelected()) {
						seat = seat + "," + chckbxE6.getText();
						price = price + seatprice;
				    }
					if(chckbxE7.isSelected()) {
						seat = seat + "," + chckbxE7.getText();
						price = price + seatprice;
				    }
				    textdispseat.setText(seat);
				    lbldispseat.setText(seat);
				    lblprice.setText("" + price); 
			    }
			}
		});
		btnconfirm.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnconfirm.setForeground(new Color(255, 255, 255));
		btnconfirm.setBackground(new Color(139, 0, 0));
		btnconfirm.setBounds(191, 365, 103, 21);
		panel_4.add(btnconfirm);
		
		JLabel lbltime = new JLabel("");
		lbltime.setBounds(10, 56, 45, 13);
		panel_4.add(lbltime);
		
		JLabel lblNewLabel_5 = new JLabel("Front Screen");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5.setForeground(Color.GREEN);
		lblNewLabel_5.setBounds(105, 57, 117, 25);
		panel_4.add(lblNewLabel_5);
		
		lbldispseat = new JLabel("");
		lbldispseat.setForeground(new Color(255, 255, 255));
		lbldispseat.setFont(new Font("Tahoma", Font.BOLD, 10));
		lbldispseat.setBounds(40, 392, 254, 31);
		panel_4.add(lbldispseat);
		
		lblprice = new JLabel("");
		lblprice.setForeground(new Color(255, 255, 255));
		lblprice.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblprice.setBounds(90, 429, 128, 25);
		panel_4.add(lblprice);
		
		JButton btnNext = new JButton("Next");
		btnNext.setBackground(new Color(139, 0, 0));
		btnNext.setForeground(new Color(255, 255, 255));
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				movie = lbldispmov.getText();
				time = lbldisptime.getText();
				numseat = textdispseat.getText();
				totalseat = Double.parseDouble(lblprice.getText());
				dispmovprice = Double.parseDouble(lbldispmovprice.getText());
				
				frame3 f3 = new frame3(movie, time, numseat, totalseat, name, pass, dispmovprice);
				setVisible(false);
				f3.setVisible(true);
				
			}
		});
		btnNext.setBounds(224, 433, 70, 21);
		panel_4.add(btnNext);
		
		JLabel lblSeat = new JLabel("Seat:");
		lblSeat.setForeground(Color.WHITE);
		lblSeat.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblSeat.setBounds(10, 392, 70, 31);
		panel_4.add(lblSeat);
		
		JLabel lblSeatPriceRm = new JLabel("Seat Price: RM ");
		lblSeatPriceRm.setForeground(Color.WHITE);
		lblSeatPriceRm.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblSeatPriceRm.setBounds(10, 428, 87, 31);
		panel_4.add(lblSeatPriceRm);
		
		lbldispmov = new JLabel("");
		lbldispmov.setForeground(new Color(255, 255, 255));
		lbldispmov.setBounds(781, 73, 270, 29);
		contentPane.add(lbldispmov);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(0, 0, 0));
		panel_5.setBounds(0, 0, 1061, 63);
		contentPane.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblgreet = new JLabel("");
		lblgreet.setText("Welcome, " + name);
		lblgreet.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblgreet.setForeground(new Color(255, 255, 255));
		lblgreet.setBounds(10, 10, 431, 43);
		panel_5.add(lblgreet);
		
		JLabel lblMovie = new JLabel("Movie:");
		lblMovie.setForeground(Color.WHITE);
		lblMovie.setBounds(735, 98, 70, 29);
		contentPane.add(lblMovie);
		
		JLabel lblTime = new JLabel("Time:");
		lblTime.setForeground(Color.WHITE);
		lblTime.setBounds(735, 73, 70, 29);
		contentPane.add(lblTime);
		
		lbldispmovprice = new JLabel("");
		lbldispmovprice.setBounds(815, 123, 218, 31);
		contentPane.add(lbldispmovprice);
		lbldispmovprice.setForeground(Color.WHITE);
		lbldispmovprice.setFont(new Font("Tahoma", Font.BOLD, 10));
		
		JLabel lblMoviePrice = new JLabel("Movie Price: RM");
		lblMoviePrice.setBounds(735, 123, 86, 31);
		contentPane.add(lblMoviePrice);
		lblMoviePrice.setForeground(Color.WHITE);
		lblMoviePrice.setFont(new Font("Tahoma", Font.PLAIN, 10));
		
		lbldisptime = new JLabel("");
		lbldisptime.setBounds(781, 98, 271, 29);
		contentPane.add(lbldisptime);
		lbldisptime.setForeground(new Color(255, 255, 255));
		
		
	}
}
