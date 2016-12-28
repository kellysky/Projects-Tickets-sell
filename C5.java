package test;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class C5 extends JFrame {

	private JFrame frame5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					C5 window = new C5();
					window.frame5.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public C5() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame5 = new JFrame();
		frame5.setTitle("注册提示");
		frame5.setFont(new Font("楷体", Font.PLAIN, 12));
		frame5.setBounds(100, 100, 450, 300);
		frame5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame5.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		frame5.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("注册成功");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("楷体", Font.PLAIN, 30));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("确定");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frame5.setVisible(false);
				new C1().setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("楷体", Font.PLAIN, 20));
		panel_1.add(btnNewButton);
	}

}