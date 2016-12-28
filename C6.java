package test;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class C6 extends JFrame {

	private JFrame frame6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					C6 window = new C6();
					window.frame6.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public C6() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame6 = new JFrame();
		frame6.setTitle("电影列表");
		frame6.setFont(new Font("楷体", Font.PLAIN, 12));
		frame6.setBounds(100, 100, 450, 300);
		frame6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame6.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		frame6.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBounds(30, 10, 110, 150);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBounds(170, 10, 110, 150);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setBounds(310, 10, 110, 150);
		panel.add(btnNewButton_2);
		
		JTextArea textArea = new JTextArea();
		textArea.setEnabled(false);
		textArea.setEditable(false);
		textArea.setFont(new Font("楷体", Font.PLAIN, 20));
		textArea.setBounds(30, 170, 110, 30);
		panel.add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setEnabled(false);
		textArea_1.setEditable(false);
		textArea_1.setFont(new Font("楷体", Font.PLAIN, 20));
		textArea_1.setBounds(170, 170, 110, 30);
		panel.add(textArea_1);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setEnabled(false);
		textArea_2.setEditable(false);
		textArea_2.setFont(new Font("楷体", Font.PLAIN, 20));
		textArea_2.setText("");
		textArea_2.setBounds(310, 170, 110, 30);
		panel.add(textArea_2);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("选择");
		chckbxNewCheckBox.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxNewCheckBox.setFont(new Font("楷体", Font.PLAIN, 12));
		chckbxNewCheckBox.setBounds(30, 200, 110, 25);
		panel.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("选择");
		chckbxNewCheckBox_1.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxNewCheckBox_1.setFont(new Font("楷体", Font.PLAIN, 12));
		chckbxNewCheckBox_1.setBounds(170, 200, 110, 25);
		panel.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("选择");
		chckbxNewCheckBox_2.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxNewCheckBox_2.setFont(new Font("楷体", Font.PLAIN, 12));
		chckbxNewCheckBox_2.setBounds(310, 200, 110, 25);
		panel.add(chckbxNewCheckBox_2);
		
		JPanel panel_1 = new JPanel();
		frame6.getContentPane().add(panel_1, BorderLayout.SOUTH);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JButton btnNewButton_3 = new JButton("确定");
		btnNewButton_3.setFont(new Font("楷体", Font.PLAIN, 20));
		panel_1.add(btnNewButton_3, BorderLayout.EAST);
		
	}
}
