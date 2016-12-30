package cn.wsh.server;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Color;

public class F_menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					F_menu frame = new F_menu();
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
	public F_menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.RED);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 4, 0, 0));
		
		JButton button_3 = new JButton("New button");
		contentPane.add(button_3);
		
		JButton button_10 = new JButton("New button");
		contentPane.add(button_10);
		
		JButton button_9 = new JButton("New button");
		contentPane.add(button_9);
		
		JButton btnNewButton = new JButton("New button");
		contentPane.add(btnNewButton);
		
		JButton button_14 = new JButton("New button");
		contentPane.add(button_14);
		
		JButton button_1 = new JButton("New button");
		contentPane.add(button_1);
		
		JButton button_5 = new JButton("New button");
		contentPane.add(button_5);
		
		JButton button_2 = new JButton("New button");
		contentPane.add(button_2);
		
		JButton button = new JButton("New button");
		contentPane.add(button);
		
		JButton button_4 = new JButton("New button");
		contentPane.add(button_4);
		
		JButton btnNewButton_1 = new JButton("New button");
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		contentPane.add(btnNewButton_3);
		
		JButton button_6 = new JButton("New button");
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("New button");
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("New button");
		contentPane.add(button_8);
		
		JButton button_11 = new JButton("New button");
		contentPane.add(button_11);
		
		JButton button_12 = new JButton("New button");
		contentPane.add(button_12);
		
		JButton button_13 = new JButton("New button");
		contentPane.add(button_13);
		
		JButton button_15 = new JButton("New button");
		contentPane.add(button_15);
	}

}
