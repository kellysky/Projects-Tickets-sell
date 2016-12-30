package cn.wsh.client;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class C7 extends JFrame {

	private JFrame frame7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					C7 window = new C7();
					window.frame7.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public void  C7() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame7 = new JFrame();
		frame7.setTitle("详情");
		frame7.setFont(new Font("楷体", Font.PLAIN, 12));
		frame7.setBounds(100, 100, 453, 297);
		frame7.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame7.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		frame7.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setEnabled(false);
		textArea.setEditable(false);
		textArea.setFont(new Font("楷体", Font.PLAIN, 20));
		textArea.setBounds(0, 0, 440, 110);
		panel.add(textArea);
		
		JLabel lblNewLabel = new JLabel("影评");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("楷体", Font.PLAIN, 20));
		lblNewLabel.setBounds(0, 110, 440, 25);
		panel.add(lblNewLabel);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setFont(new Font("楷体", Font.PLAIN, 20));
		textArea_1.setEnabled(false);
		textArea_1.setEditable(false);
		textArea_1.setBounds(0, 135, 440, 81);
		panel.add(textArea_1);
		
		JPanel panel_1 = new JPanel();
		frame7.getContentPane().add(panel_1, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("返回");
		btnNewButton.setFont(new Font("楷体", Font.PLAIN, 20));
		panel_1.add(btnNewButton);
	}
}
