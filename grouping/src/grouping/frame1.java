package grouping;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;

public class frame1 extends JFrame {

	private JPanel contentPane;
	private JTextField textPass;
	private String name;
	private int pass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame1 frame = new frame1();
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
	public frame1() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\user\\Downloads\\cinema.png"));
		setTitle("ProImax Cinema");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 462, 628);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setForeground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(139, 0, 0), new Color(139, 0, 0)), "Login", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		panel.setForeground(Color.BLACK);
		panel.setBounds(25, 74, 396, 502);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JTextArea textName = new JTextArea();
		textName.setText("");
		textName.setBounds(38, 110, 310, 22);
		panel.add(textName);
		
		textPass = new JTextField();
		textPass.setBounds(38, 174, 50, 22);
		panel.add(textPass);
		textPass.setColumns(10);
		
		JLabel lblname = new JLabel("Name");
		lblname.setFont(new Font("Tahoma", Font.BOLD, 9));
		lblname.setForeground(Color.WHITE);
		lblname.setBackground(Color.WHITE);
		lblname.setBounds(38, 87, 45, 13);
		panel.add(lblname);
		
		JLabel lblpass = new JLabel("Age");
		lblpass.setForeground(Color.WHITE);
		lblpass.setFont(new Font("Tahoma", Font.BOLD, 9));
		lblpass.setBounds(38, 156, 25, 13);
		panel.add(lblpass);
		
		JButton btnNewButton = new JButton("Reset");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 9));
		btnNewButton.setBackground(new Color(139, 0, 0));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textName.setText("");
				textPass.setText("");
			}
		});
		btnNewButton.setBounds(263, 229, 85, 21);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Enter");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 9));
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(139, 0, 0));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				name = textName.getText();
				pass = Integer.parseInt(textPass.getText());
				
				frame2 f2 = new frame2(name, pass);
				setVisible(false);
				f2.setVisible(true);
				
			}
		});
		btnNewButton_1.setBounds(41, 286, 85, 21);
		panel.add(btnNewButton_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.BLACK);
		panel_1.setBounds(0, 0, 458, 64);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(24, 22, 143, 32);
		panel_1.add(lblNewLabel);
	}
}
