package test;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class C10 extends JFrame {

	private JFrame frame10;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					C10 window = new C10();
					window.frame10.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public C10() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame10 = new JFrame();
		frame10.setTitle("结果");
		frame10.setFont(new Font("楷体", Font.PLAIN, 12));
		frame10.setBounds(100, 100, 450, 300);
		frame10.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame10.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		frame10.getContentPane().add(panel, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("出票");
		btnNewButton.setFont(new Font("楷体", Font.PLAIN, 20));
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("评价");
		btnNewButton_1.setFont(new Font("楷体", Font.PLAIN, 20));
		panel.add(btnNewButton_1);
		
		JPanel panel_1 = new JPanel();
		frame10.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setEnabled(false);
		textArea.setEditable(false);
		textArea.setFont(new Font("楷体", Font.PLAIN, 20));
		textArea.setBounds(0, 0, 434, 219);
		panel_1.add(textArea);
	}

}
