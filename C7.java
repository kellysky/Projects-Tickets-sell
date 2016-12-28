package test;

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
	public C7() {
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
		textArea.setBounds(0, 0, 440, 220);
		panel.add(textArea);
		
		JPanel panel_1 = new JPanel();
		frame7.getContentPane().add(panel_1, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("返回");
		btnNewButton.setFont(new Font("楷体", Font.PLAIN, 20));
		panel_1.add(btnNewButton);
	}

}
