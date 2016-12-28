package test;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class C12 extends JFrame {

	private JFrame frame12;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					C12 window = new C12();
					window.frame12.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public C12() {
		setTitle("退出");
		setFont(new Font("楷体", Font.PLAIN, 12));
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("确定");
		btnNewButton.setFont(new Font("楷体", Font.PLAIN, 20));
		panel.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("期待您的再次光临");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("楷体", Font.PLAIN, 30));
		panel_1.add(lblNewLabel, BorderLayout.CENTER);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame12 = new JFrame();
		frame12.setBounds(100, 100, 450, 300);
		frame12.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
