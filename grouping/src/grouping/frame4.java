package grouping;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Font;
import javax.swing.JTextArea;

public class frame4 extends JFrame {

	private JPanel contentPane;
	
	/**
	 * Launch the application.
	 */
	/**
	 * Create the frame.
	 */
	public frame4(String movie, String time, String numseat, double totalseat, String name, int pass, double dispmovprice, String totalbev, String totalfood, double totalfnb) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 838, 437);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(139, 0, 0), null), "TICKET", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 255, 255)));
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(22, 29, 777, 356);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblname = new JLabel("Name:");
		lblname.setBackground(Color.WHITE);
		lblname.setFont(new Font("Dialog", Font.BOLD, 13));
		lblname.setForeground(Color.WHITE);
		lblname.setBounds(10, 55, 286, 13);
		panel.add(lblname);
		
		JLabel lblmov = new JLabel("Movie:");
		lblmov.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblmov.setForeground(Color.WHITE);
		lblmov.setBounds(10, 130, 286, 13);
		panel.add(lblmov);
		
		JLabel lblNewLabel_1 = new JLabel("Food and Beverages Order");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(585, 10, 228, 27);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Time:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(10, 269, 45, 13);
		panel.add(lblNewLabel_2);
		
		JLabel lblseat = new JLabel("Seat:");
		lblseat.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblseat.setForeground(Color.WHITE);
		lblseat.setBounds(10, 205, 45, 13);
		panel.add(lblseat);
		
		JLabel lblnamereceipt = new JLabel("");
		lblnamereceipt.setText(name);
		lblnamereceipt.setForeground(Color.LIGHT_GRAY);
		lblnamereceipt.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblnamereceipt.setBounds(10, 78, 486, 42);
		panel.add(lblnamereceipt);
		
		JLabel lblmovreceipt = new JLabel("");
		lblmovreceipt.setText(movie);
		lblmovreceipt.setForeground(Color.LIGHT_GRAY);
		lblmovreceipt.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblmovreceipt.setBounds(10, 153, 496, 42);
		panel.add(lblmovreceipt);
		
		JLabel lblseatreceipt = new JLabel("");
		lblseatreceipt.setText(numseat);
		lblseatreceipt.setForeground(Color.LIGHT_GRAY);
		lblseatreceipt.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblseatreceipt.setBounds(10, 217, 486, 42);
		panel.add(lblseatreceipt);
		
		JLabel lbltimereceipt = new JLabel("");
		lbltimereceipt.setText(time);
		lbltimereceipt.setFont(new Font("Tahoma", Font.BOLD, 25));
		lbltimereceipt.setForeground(Color.LIGHT_GRAY);
		lbltimereceipt.setBounds(10, 292, 228, 42);
		panel.add(lbltimereceipt);
		
		double total = totalseat + dispmovprice;
		JTextArea textArea = new JTextArea();
		textArea.setBackground(Color.LIGHT_GRAY);
		textArea.setForeground(Color.BLACK);
		textArea.setText("Seat order" + "\n" + "--------------------------------------" + "\n" + "Seat Booked: " + "\n" + numseat + "-" + "RM " + totalseat + "\n\n" + "--------------------------------------" + "\n" + "Movie booked: " + "\n" + movie + "-" + "RM " + dispmovprice + "\n\n" + "--------------------------------------" + "\n" + "Total: "  + "RM " + total);
		textArea.setBounds(390, 40, 180, 306);
		panel.add(textArea);
		
		JLabel lblNewLabel_1_1 = new JLabel("Seat and Movie Order");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_1.setBounds(390, 10, 228, 27);
		panel.add(lblNewLabel_1_1);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBackground(Color.LIGHT_GRAY);
		textArea_1.setText("RM " + totalfnb);
		textArea_1.setBounds(585, 40, 182, 306);
		panel.add(textArea_1);
	}
}
