package test;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class C11 extends JFrame  {

	private JFrame frame11;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					C11 window = new C11();
					window.frame11.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public C11() {
		setTitle("评价");
		setFont(new Font("楷体", Font.PLAIN, 12));
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(0, 0, 434, 219);
		panel.add(textArea);
		
		JPanel panel_1 = new JPanel();
		getContentPane().add(panel_1, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("确定");
		btnNewButton.setFont(new Font("楷体", Font.PLAIN, 20));
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("退出");
		btnNewButton_1.setFont(new Font("楷体", Font.PLAIN, 20));
		panel_1.add(btnNewButton_1);
		
		JPanel panel_2 = new JPanel();
		getContentPane().add(panel_2, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("请进行评价");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("楷体", Font.PLAIN, 20));
		panel_2.add(lblNewLabel);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame11 = new JFrame();
		frame11.setBounds(100, 100, 450, 300);
		frame11.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
