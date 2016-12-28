package test;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class C1  extends JFrame {

	private JFrame frame1;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					C1 window = new C1();
					window.frame1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public C1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame1 = new JFrame();
		frame1.setFont(new Font("楷体", Font.PLAIN, 12));
		frame1.setTitle("王森灏购票系统");
		frame1.setBounds(100, 100, 450, 300);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame1.getContentPane().add(panel, BorderLayout.SOUTH);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		btnNewButton = new JButton("注册");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame1.setVisible(false);
				new C2().setVisible(true);
			}

		
			
		});
		btnNewButton.setFont(new Font("楷体", Font.PLAIN, 20));
		panel.add(btnNewButton);
		
		
		JButton btnNewButton_1 = new JButton("登录");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame1.setVisible(false);
				new C3().setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("楷体", Font.PLAIN, 20));
		panel.add(btnNewButton_1);
		
		
		JPanel panel_1 = new JPanel();
		frame1.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("欢迎来到王森灏购票系统");
		lblNewLabel.setFont(new Font("楷体", Font.PLAIN, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel, BorderLayout.CENTER);
	}



}


	