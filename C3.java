package test;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import net.miginfocom.swing.MigLayout;


public class C3 extends JFrame  {

	private JFrame frame3;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					C3 window = new C3();
					window.frame3.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public C3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame3 = new JFrame();
		frame3.setFont(new Font("楷体", Font.PLAIN, 12));
		frame3.setTitle("\u767B\u9646");
		frame3.setBounds(100, 100, 450, 300);
		frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame3.getContentPane().add(panel, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("确定");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frame3.setVisible(false);
				new C6().setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("楷体", Font.PLAIN, 20));
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("返回");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame3.setVisible(false);
				new C1().setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("楷体", Font.PLAIN, 20));
		panel.add(btnNewButton_1);
		
		JPanel panel_1 = new JPanel();
		frame3.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new MigLayout("", "[80px][106px][60px][6px][][][][][grow][grow]", "[30px][][][][][]"));
		
		JLabel lblNewLabel = new JLabel("用户名：");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("楷体", Font.PLAIN, 20));
		panel_1.add(lblNewLabel, "cell 0 1,alignx left,aligny center");
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("楷体", Font.PLAIN, 20));
		panel_1.add(textField, "cell 2 1 8 1,growx");
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("密码：");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("楷体", Font.PLAIN, 20));
		panel_1.add(lblNewLabel_1, "cell 0 5,alignx left,aligny center");
		
		passwordField = new JPasswordField();
		passwordField.setHorizontalAlignment(SwingConstants.CENTER);
		passwordField.setFont(new Font("楷体", Font.PLAIN, 20));
		panel_1.add(passwordField, "cell 2 5 8 1,growx");
	}

	

}