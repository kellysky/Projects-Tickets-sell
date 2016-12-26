import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.Font;
import net.miginfocom.swing.MigLayout;
import javax.swing.SwingConstants;


public class C2 {

	private JFrame frame;
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
					window.frame.setVisible(true);
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
		frame = new JFrame();
		frame.setFont(new Font("楷体", Font.PLAIN, 12));
		frame.setTitle("\u6CE8\u518C");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("\u786E\u5B9A");
		btnNewButton.setFont(new Font("楷体", Font.PLAIN, 20));
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u767B\u9646");
		btnNewButton_1.setFont(new Font("楷体", Font.PLAIN, 20));
		panel.add(btnNewButton_1);
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new MigLayout("", "[][][][grow]", "[][][][][][][][]"));
		
		JLabel lblNewLabel = new JLabel("\u7528\u6237\u540D\uFF1A");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("楷体", Font.PLAIN, 20));
		panel_1.add(lblNewLabel, "cell 0 1");
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("楷体", Font.PLAIN, 20));
		panel_1.add(textField, "cell 1 1 3 1,growx");
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\u5BC6\u7801\uFF1A");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("楷体", Font.PLAIN, 20));
		panel_1.add(lblNewLabel_1, "cell 0 3");
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("楷体", Font.PLAIN, 20));
		passwordField.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(passwordField, "cell 1 3 3 1,growx");
		
		JLabel lblNewLabel_2 = new JLabel("\u624B\u673A\u53F7\u7801\uFF1A");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("楷体", Font.PLAIN, 20));
		panel_1.add(lblNewLabel_2, "cell 0 5");
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("楷体", Font.PLAIN, 20));
		panel_1.add(textField_1, "cell 1 5 3 1,growx");
		textField_1.setColumns(10);
	}

}
