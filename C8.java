package test;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import net.miginfocom.swing.MigLayout;

public class C8 extends JFrame {

	private JFrame frame8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					C8 window = new C8();
					window.frame8.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public C8() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame8 = new JFrame();
		frame8.setFont(new Font("楷体", Font.PLAIN, 12));
		frame8.setTitle("选择时间");
		frame8.setBounds(100, 100, 450, 300);
		frame8.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame8.getContentPane().add(panel, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("确定");
		btnNewButton.setFont(new Font("楷体", Font.PLAIN, 20));
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("返回");
		btnNewButton_1.setFont(new Font("楷体", Font.PLAIN, 20));
		panel.add(btnNewButton_1);
		
		JPanel panel_1 = new JPanel();
		frame8.getContentPane().add(panel_1, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("请选择时间");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("楷体", Font.PLAIN, 20));
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		frame8.getContentPane().add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new MigLayout("", "[40px][50px][40px][38px][40px][38px][][][][][]", "[24px][][][][][]"));
		panel_2.setLayout(new MigLayout("", "[1px][][][][][][][]", "[1px][][][][][][]"));
		
		JLabel lblNewLabel_1 = new JLabel("年份");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("楷体", Font.PLAIN, 20));
		panel_2.add(lblNewLabel_1, "cell 3 1,grow");
		
		JComboBox comboBox = new JComboBox();
		comboBox.setEditable(true);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020"}));
		comboBox.setMaximumRowCount(9);
		comboBox.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(comboBox, "cell 7 1,grow");
		
		JLabel lblNewLabel_2 = new JLabel("月份");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("楷体", Font.PLAIN, 20));
		panel_2.add(lblNewLabel_2, "cell 3 3,grow");
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setEditable(true);
		comboBox_1.setFont(new Font("楷体", Font.PLAIN, 12));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		comboBox_1.setMaximumRowCount(12);
		panel_2.add(comboBox_1, "cell 7 3,grow");
		
		JLabel lblNewLabel_3 = new JLabel("日期");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("楷体", Font.PLAIN, 20));
		panel_2.add(lblNewLabel_3, "cell 3 5,grow");
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setEditable(true);
		comboBox_2.setFont(new Font("楷体", Font.PLAIN, 12));
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBox_2.setMaximumRowCount(31);
		panel_2.add(comboBox_2, "cell 7 5,grow");
	}

}