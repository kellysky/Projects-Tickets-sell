package test;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import net.miginfocom.swing.MigLayout;

public class C2 extends JFrame {

	private JFrame frame2;
	private JTextField textField;
	private JPasswordField passwordField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					C2 window = new C2();
					window.frame2.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public C2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame2 = new JFrame();
		frame2.setFont(new Font("楷体", Font.PLAIN, 12));
		frame2.setTitle("注册");
		frame2.setBounds(100, 100, 450, 300);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		frame2.getContentPane().add(panel, BorderLayout.SOUTH);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnNewButton = new JButton("确定");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frame2.setVisible(false);
				new C5().setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("楷体", Font.PLAIN, 20));
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("登录");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frame2.setVisible(false);
				new C3().setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("楷体", Font.PLAIN, 20));
		panel.add(btnNewButton_1);
		
		JPanel panel_1 = new JPanel();
		frame2.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new MigLayout("", "[][][][][][][][][][][grow]", "[][][][][][]"));
		
		JLabel lblNewLabel = new JLabel("用户名：");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("楷体", Font.PLAIN, 20));
		panel_1.add(lblNewLabel, "cell 0 1,grow");
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("楷体", Font.PLAIN, 20));
		panel_1.add(textField, "cell 4 1 7 1,grow");
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("密码：");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("楷体", Font.PLAIN, 20));
		panel_1.add(lblNewLabel_2, "cell 0 3,grow");
		
		passwordField = new JPasswordField();
		passwordField.setHorizontalAlignment(SwingConstants.CENTER);
		passwordField.setFont(new Font("楷体", Font.PLAIN, 20));
		panel_1.add(passwordField, "flowx,cell 4 3 7 1,grow");
		
		JLabel lblNewLabel_1 = new JLabel("手机号码：");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("楷体", Font.PLAIN, 20));
		panel_1.add(lblNewLabel_1, "cell 0 5,grow");
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("楷体", Font.PLAIN, 20));
		panel_1.add(textField_1, "cell 4 5 7 1,grow");
		textField_1.setColumns(10);
	}


}
