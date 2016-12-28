package test;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import net.miginfocom.swing.MigLayout;

public class C9 extends JFrame {

	private JFrame frame9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					C9 window = new C9();
					window.frame9.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public C9() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame9 = new JFrame();
		frame9.setTitle("选择座位");
		frame9.setFont(new Font("楷体", Font.PLAIN, 12));
		frame9.setBounds(100, 100, 640, 361);
		frame9.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame9.getContentPane().add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("请选择座位");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("楷体", Font.PLAIN, 20));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		frame9.getContentPane().add(panel_1, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("确定");
		btnNewButton.setFont(new Font("楷体", Font.PLAIN, 20));
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("返回");
		btnNewButton_1.setFont(new Font("楷体", Font.PLAIN, 20));
		panel_1.add(btnNewButton_1);
		
		JPanel panel_2 = new JPanel();
		frame9.getContentPane().add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(null);
		
		
		JToggleButton toggleButton = new JToggleButton("01");
		toggleButton.setBounds(5, 5, 45, 25);
		toggleButton.setSelected(true);
		toggleButton.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton);
		
		JToggleButton toggleButton_1 = new JToggleButton("02");
		toggleButton_1.setBounds(55, 5, 45, 25);
		toggleButton_1.setSelected(true);
		toggleButton_1.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_1);
		
		JToggleButton toggleButton_2 = new JToggleButton("03");
		toggleButton_2.setBounds(105, 5, 45, 25);
		toggleButton_2.setSelected(true);
		toggleButton_2.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_2);
		
		JToggleButton toggleButton_3 = new JToggleButton("04");
		toggleButton_3.setBounds(155, 5, 45, 25);
		toggleButton_3.setSelected(true);
		toggleButton_3.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_3);
		
		JToggleButton toggleButton_4 = new JToggleButton("05");
		toggleButton_4.setBounds(205, 5, 45, 25);
		toggleButton_4.setSelected(true);
		toggleButton_4.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_4);
		
		JToggleButton toggleButton_5 = new JToggleButton("06");
		toggleButton_5.setBounds(255, 5, 45, 25);
		toggleButton_5.setSelected(true);
		toggleButton_5.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_5);
		
		JToggleButton toggleButton_6 = new JToggleButton("07");
		toggleButton_6.setBounds(325, 5, 45, 25);
		toggleButton_6.setSelected(true);
		toggleButton_6.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_6);
		
		JToggleButton toggleButton_7 = new JToggleButton("08");
		toggleButton_7.setBounds(375, 5, 45, 25);
		toggleButton_7.setSelected(true);
		toggleButton_7.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_7);
		
		JToggleButton toggleButton_8 = new JToggleButton("09");
		toggleButton_8.setBounds(425, 5, 45, 25);
		toggleButton_8.setSelected(true);
		toggleButton_8.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_8);
		
		JToggleButton toggleButton_9 = new JToggleButton("10");
		toggleButton_9.setBounds(475, 5, 45, 25);
		toggleButton_9.setSelected(true);
		toggleButton_9.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_9);
		
		JToggleButton toggleButton_10 = new JToggleButton("11");
		toggleButton_10.setBounds(525, 5, 45, 25);
		toggleButton_10.setSelected(true);
		toggleButton_10.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_10);
		
		JToggleButton toggleButton_11 = new JToggleButton("12");
		toggleButton_11.setBounds(575, 5, 45, 25);
		toggleButton_11.setSelected(true);
		toggleButton_11.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_11);
		
		JToggleButton toggleButton_12 = new JToggleButton("13");
		toggleButton_12.setBounds(5, 35, 45, 25);
		toggleButton_12.setSelected(true);
		toggleButton_12.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_12);
		
		JToggleButton toggleButton_13 = new JToggleButton("14");
		toggleButton_13.setBounds(55, 35, 45, 25);
		toggleButton_13.setSelected(true);
		toggleButton_13.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_13);
		
		JToggleButton toggleButton_14 = new JToggleButton("15");
		toggleButton_14.setBounds(105, 35, 45, 25);
		toggleButton_14.setSelected(true);
		toggleButton_14.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_14);
		
		JToggleButton toggleButton_15 = new JToggleButton("16");
		toggleButton_15.setBounds(155, 35, 45, 25);
		toggleButton_15.setSelected(true);
		toggleButton_15.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_15);
		
		JToggleButton toggleButton_16 = new JToggleButton("17");
		toggleButton_16.setBounds(205, 35, 45, 25);
		toggleButton_16.setSelected(true);
		toggleButton_16.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_16);
		
		JToggleButton toggleButton_17 = new JToggleButton("18");
		toggleButton_17.setBounds(255, 35, 45, 25);
		toggleButton_17.setSelected(true);
		toggleButton_17.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_17);
		
		JToggleButton toggleButton_18 = new JToggleButton("19");
		toggleButton_18.setBounds(325, 35, 45, 25);
		toggleButton_18.setSelected(true);
		toggleButton_18.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_18);
		
		JToggleButton toggleButton_19 = new JToggleButton("20");
		toggleButton_19.setBounds(375, 35, 45, 25);
		toggleButton_19.setSelected(true);
		toggleButton_19.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_19);
		
		JToggleButton toggleButton_20 = new JToggleButton("21");
		toggleButton_20.setBounds(425, 35, 45, 25);
		toggleButton_20.setSelected(true);
		toggleButton_20.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_20);
		
		JToggleButton toggleButton_21 = new JToggleButton("22");
		toggleButton_21.setBounds(475, 35, 45, 25);
		toggleButton_21.setSelected(true);
		toggleButton_21.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_21);
		
		JToggleButton toggleButton_22 = new JToggleButton("23");
		toggleButton_22.setBounds(525, 35, 45, 25);
		toggleButton_22.setSelected(true);
		toggleButton_22.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_22);
		
		JToggleButton toggleButton_23 = new JToggleButton("24");
		toggleButton_23.setBounds(575, 35, 45, 25);
		toggleButton_23.setSelected(true);
		toggleButton_23.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_23);
		
		JToggleButton toggleButton_30 = new JToggleButton("25");
		toggleButton_30.setBounds(5, 65, 45, 25);
		toggleButton_30.setSelected(true);
		toggleButton_30.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_30);
		
		JToggleButton toggleButton_41 = new JToggleButton("26");
		toggleButton_41.setBounds(55, 65, 45, 25);
		toggleButton_41.setSelected(true);
		toggleButton_41.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_41);
		
		JToggleButton toggleButton_42 = new JToggleButton("27");
		toggleButton_42.setBounds(105, 65, 45, 25);
		toggleButton_42.setSelected(true);
		toggleButton_42.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_42);
		
		JToggleButton toggleButton_43 = new JToggleButton("28");
		toggleButton_43.setBounds(155, 65, 45, 25);
		toggleButton_43.setSelected(true);
		toggleButton_43.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_43);
		
		JToggleButton toggleButton_44 = new JToggleButton("29");
		toggleButton_44.setBounds(205, 65, 45, 25);
		toggleButton_44.setSelected(true);
		toggleButton_44.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_44);
		
		JToggleButton toggleButton_45 = new JToggleButton("30");
		toggleButton_45.setBounds(255, 65, 45, 25);
		toggleButton_45.setSelected(true);
		toggleButton_45.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_45);
		
		JToggleButton toggleButton_66 = new JToggleButton("31");
		toggleButton_66.setBounds(325, 65, 45, 25);
		toggleButton_66.setSelected(true);
		toggleButton_66.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_66);
		
		JToggleButton toggleButton_67 = new JToggleButton("32");
		toggleButton_67.setBounds(375, 65, 45, 25);
		toggleButton_67.setSelected(true);
		toggleButton_67.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_67);
		
		JToggleButton toggleButton_68 = new JToggleButton("33");
		toggleButton_68.setBounds(425, 65, 45, 25);
		toggleButton_68.setSelected(true);
		toggleButton_68.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_68);
		
		JToggleButton toggleButton_69 = new JToggleButton("34");
		toggleButton_69.setBounds(475, 65, 45, 25);
		toggleButton_69.setSelected(true);
		toggleButton_69.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_69);
		
		JToggleButton toggleButton_70 = new JToggleButton("35");
		toggleButton_70.setBounds(525, 65, 45, 25);
		toggleButton_70.setSelected(true);
		toggleButton_70.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_70);
		
		JToggleButton toggleButton_24 = new JToggleButton("36");
		toggleButton_24.setBounds(575, 65, 45, 25);
		toggleButton_24.setSelected(true);
		toggleButton_24.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_24);
		
		JToggleButton toggleButton_31 = new JToggleButton("37");
		toggleButton_31.setBounds(5, 95, 45, 25);
		toggleButton_31.setSelected(true);
		toggleButton_31.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_31);
		
		JToggleButton toggleButton_40 = new JToggleButton("38");
		toggleButton_40.setBounds(55, 95, 45, 25);
		toggleButton_40.setSelected(true);
		toggleButton_40.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_40);
		
		JToggleButton toggleButton_49 = new JToggleButton("39");
		toggleButton_49.setBounds(105, 95, 45, 25);
		toggleButton_49.setSelected(true);
		toggleButton_49.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_49);
		
		JToggleButton toggleButton_48 = new JToggleButton("40");
		toggleButton_48.setBounds(155, 95, 45, 25);
		toggleButton_48.setSelected(true);
		toggleButton_48.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_48);
		
		JToggleButton toggleButton_47 = new JToggleButton("41");
		toggleButton_47.setBounds(205, 95, 45, 25);
		toggleButton_47.setSelected(true);
		toggleButton_47.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_47);
		
		JToggleButton toggleButton_46 = new JToggleButton("42");
		toggleButton_46.setBounds(255, 95, 45, 25);
		toggleButton_46.setSelected(true);
		toggleButton_46.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_46);
		
		JToggleButton toggleButton_71 = new JToggleButton("43");
		toggleButton_71.setBounds(325, 95, 45, 25);
		toggleButton_71.setSelected(true);
		toggleButton_71.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_71);
		
		JToggleButton toggleButton_72 = new JToggleButton("44");
		toggleButton_72.setBounds(375, 95, 45, 25);
		toggleButton_72.setSelected(true);
		toggleButton_72.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_72);
		
		JToggleButton toggleButton_73 = new JToggleButton("45");
		toggleButton_73.setBounds(425, 95, 45, 25);
		toggleButton_73.setSelected(true);
		toggleButton_73.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_73);
		
		JToggleButton toggleButton_74 = new JToggleButton("46");
		toggleButton_74.setBounds(475, 95, 45, 25);
		toggleButton_74.setSelected(true);
		toggleButton_74.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_74);
		
		JToggleButton toggleButton_75 = new JToggleButton("47");
		toggleButton_75.setBounds(525, 95, 45, 25);
		toggleButton_75.setSelected(true);
		toggleButton_75.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_75);
		
		JToggleButton toggleButton_25 = new JToggleButton("48");
		toggleButton_25.setBounds(575, 95, 45, 25);
		toggleButton_25.setSelected(true);
		toggleButton_25.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_25);
		
		JToggleButton toggleButton_32 = new JToggleButton("49");
		toggleButton_32.setBounds(5, 125, 45, 25);
		toggleButton_32.setSelected(true);
		toggleButton_32.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_32);
		
		JToggleButton toggleButton_39 = new JToggleButton("50");
		toggleButton_39.setBounds(55, 125, 45, 25);
		toggleButton_39.setSelected(true);
		toggleButton_39.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_39);
		
		JToggleButton toggleButton_50 = new JToggleButton("51");
		toggleButton_50.setBounds(105, 125, 45, 25);
		toggleButton_50.setSelected(true);
		toggleButton_50.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_50);
		
		JToggleButton toggleButton_51 = new JToggleButton("52");
		toggleButton_51.setBounds(155, 125, 45, 25);
		toggleButton_51.setSelected(true);
		toggleButton_51.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_51);
		
		JToggleButton toggleButton_52 = new JToggleButton("53");
		toggleButton_52.setBounds(205, 125, 45, 25);
		toggleButton_52.setSelected(true);
		toggleButton_52.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_52);
		
		JToggleButton toggleButton_53 = new JToggleButton("54");
		toggleButton_53.setBounds(255, 125, 45, 25);
		toggleButton_53.setSelected(true);
		toggleButton_53.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_53);
		
		JToggleButton toggleButton_80 = new JToggleButton("55");
		toggleButton_80.setBounds(325, 125, 45, 25);
		toggleButton_80.setSelected(true);
		toggleButton_80.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_80);
		
		JToggleButton toggleButton_79 = new JToggleButton("56");
		toggleButton_79.setBounds(375, 125, 45, 25);
		toggleButton_79.setSelected(true);
		toggleButton_79.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_79);
		
		JToggleButton toggleButton_78 = new JToggleButton("57");
		toggleButton_78.setBounds(425, 125, 45, 25);
		toggleButton_78.setSelected(true);
		toggleButton_78.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_78);
		
		JToggleButton toggleButton_77 = new JToggleButton("58");
		toggleButton_77.setBounds(475, 125, 45, 25);
		toggleButton_77.setSelected(true);
		toggleButton_77.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_77);
		
		JToggleButton toggleButton_76 = new JToggleButton("59");
		toggleButton_76.setBounds(525, 125, 45, 25);
		toggleButton_76.setSelected(true);
		toggleButton_76.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_76);
		
		JToggleButton toggleButton_26 = new JToggleButton("60");
		toggleButton_26.setBounds(575, 125, 45, 25);
		toggleButton_26.setSelected(true);
		toggleButton_26.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_26);
		
		JToggleButton toggleButton_33 = new JToggleButton("61");
		toggleButton_33.setBounds(5, 155, 45, 25);
		toggleButton_33.setSelected(true);
		toggleButton_33.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_33);
		
		JToggleButton toggleButton_38 = new JToggleButton("62");
		toggleButton_38.setBounds(55, 155, 45, 25);
		toggleButton_38.setSelected(true);
		toggleButton_38.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_38);
		
		JToggleButton toggleButton_54 = new JToggleButton("63");
		toggleButton_54.setBounds(105, 155, 45, 25);
		toggleButton_54.setSelected(true);
		toggleButton_54.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_54);
		
		JToggleButton toggleButton_55 = new JToggleButton("64");
		toggleButton_55.setBounds(155, 155, 45, 25);
		toggleButton_55.setSelected(true);
		toggleButton_55.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_55);
		
		JToggleButton toggleButton_56 = new JToggleButton("65");
		toggleButton_56.setBounds(205, 155, 45, 25);
		toggleButton_56.setSelected(true);
		toggleButton_56.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_56);
		
		JToggleButton toggleButton_57 = new JToggleButton("66");
		toggleButton_57.setBounds(255, 155, 45, 25);
		toggleButton_57.setSelected(true);
		toggleButton_57.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_57);
		
		JToggleButton toggleButton_81 = new JToggleButton("67");
		toggleButton_81.setBounds(325, 155, 45, 25);
		toggleButton_81.setSelected(true);
		toggleButton_81.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_81);
		
		JToggleButton toggleButton_82 = new JToggleButton("68");
		toggleButton_82.setBounds(375, 155, 45, 25);
		toggleButton_82.setSelected(true);
		toggleButton_82.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_82);
		
		JToggleButton toggleButton_83 = new JToggleButton("69");
		toggleButton_83.setBounds(425, 155, 45, 25);
		toggleButton_83.setSelected(true);
		toggleButton_83.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_83);
		
		JToggleButton toggleButton_84 = new JToggleButton("70");
		toggleButton_84.setBounds(475, 155, 45, 25);
		toggleButton_84.setSelected(true);
		toggleButton_84.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_84);
		
		JToggleButton toggleButton_85 = new JToggleButton("71");
		toggleButton_85.setBounds(525, 155, 45, 25);
		toggleButton_85.setSelected(true);
		toggleButton_85.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_85);
		
		JToggleButton toggleButton_27 = new JToggleButton("72");
		toggleButton_27.setBounds(575, 155, 45, 25);
		toggleButton_27.setSelected(true);
		toggleButton_27.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_27);
		
		JToggleButton toggleButton_34 = new JToggleButton("73");
		toggleButton_34.setBounds(5, 185, 45, 25);
		toggleButton_34.setSelected(true);
		toggleButton_34.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_34);
		
		JToggleButton toggleButton_37 = new JToggleButton("74");
		toggleButton_37.setBounds(55, 185, 45, 25);
		toggleButton_37.setSelected(true);
		toggleButton_37.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_37);
		
		JToggleButton toggleButton_58 = new JToggleButton("75");
		toggleButton_58.setBounds(105, 185, 45, 25);
		toggleButton_58.setSelected(true);
		toggleButton_58.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_58);
		
		JToggleButton toggleButton_59 = new JToggleButton("76");
		toggleButton_59.setBounds(155, 185, 45, 25);
		toggleButton_59.setSelected(true);
		toggleButton_59.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_59);
		
		JToggleButton toggleButton_60 = new JToggleButton("77");
		toggleButton_60.setBounds(205, 185, 45, 25);
		toggleButton_60.setSelected(true);
		toggleButton_60.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_60);
		
		JToggleButton toggleButton_61 = new JToggleButton("78");
		toggleButton_61.setBounds(255, 185, 45, 25);
		toggleButton_61.setSelected(true);
		toggleButton_61.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_61);
		
		JToggleButton toggleButton_90 = new JToggleButton("79");
		toggleButton_90.setBounds(325, 185, 45, 25);
		toggleButton_90.setSelected(true);
		toggleButton_90.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_90);
		
		JToggleButton toggleButton_89 = new JToggleButton("80");
		toggleButton_89.setBounds(375, 185, 45, 25);
		toggleButton_89.setSelected(true);
		toggleButton_89.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_89);
		
		JToggleButton toggleButton_88 = new JToggleButton("81");
		toggleButton_88.setBounds(425, 185, 45, 25);
		toggleButton_88.setSelected(true);
		toggleButton_88.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_88);
		
		JToggleButton toggleButton_87 = new JToggleButton("82");
		toggleButton_87.setBounds(475, 185, 45, 25);
		toggleButton_87.setSelected(true);
		toggleButton_87.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_87);
		
		JToggleButton toggleButton_86 = new JToggleButton("83");
		toggleButton_86.setBounds(525, 185, 45, 25);
		toggleButton_86.setSelected(true);
		toggleButton_86.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_86);
		
		JToggleButton toggleButton_28 = new JToggleButton("84");
		toggleButton_28.setBounds(575, 185, 45, 25);
		toggleButton_28.setSelected(true);
		toggleButton_28.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_28);
		
		JToggleButton toggleButton_35 = new JToggleButton("85");
		toggleButton_35.setBounds(5, 215, 45, 25);
		toggleButton_35.setSelected(true);
		toggleButton_35.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_35);
		
		JToggleButton toggleButton_36 = new JToggleButton("86");
		toggleButton_36.setBounds(55, 215, 45, 25);
		toggleButton_36.setSelected(true);
		toggleButton_36.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_36);
		
		JToggleButton toggleButton_62 = new JToggleButton("87");
		toggleButton_62.setBounds(105, 215, 45, 25);
		toggleButton_62.setSelected(true);
		toggleButton_62.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_62);
		
		JToggleButton toggleButton_63 = new JToggleButton("88");
		toggleButton_63.setBounds(155, 215, 45, 25);
		toggleButton_63.setSelected(true);
		toggleButton_63.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_63);
		
		JToggleButton toggleButton_64 = new JToggleButton("89");
		toggleButton_64.setBounds(205, 215, 45, 25);
		toggleButton_64.setSelected(true);
		toggleButton_64.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_64);
		
		JToggleButton toggleButton_65 = new JToggleButton("90");
		toggleButton_65.setBounds(255, 215, 45, 25);
		toggleButton_65.setSelected(true);
		toggleButton_65.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_65);
		
		JToggleButton toggleButton_91 = new JToggleButton("91");
		toggleButton_91.setBounds(325, 215, 45, 25);
		toggleButton_91.setSelected(true);
		toggleButton_91.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_91);
		
		JToggleButton toggleButton_92 = new JToggleButton("92");
		toggleButton_92.setBounds(375, 215, 45, 25);
		toggleButton_92.setSelected(true);
		toggleButton_92.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_92);
		
		JToggleButton toggleButton_93 = new JToggleButton("93");
		toggleButton_93.setBounds(425, 215, 45, 25);
		toggleButton_93.setSelected(true);
		toggleButton_93.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_93);
		
		JToggleButton toggleButton_94 = new JToggleButton("94");
		toggleButton_94.setBounds(475, 215, 45, 25);
		toggleButton_94.setSelected(true);
		toggleButton_94.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_94);
		
		JToggleButton toggleButton_95 = new JToggleButton("95");
		toggleButton_95.setBounds(525, 215, 45, 25);
		toggleButton_95.setSelected(true);
		toggleButton_95.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_95);
		
		JToggleButton toggleButton_29 = new JToggleButton("96");
		toggleButton_29.setBounds(575, 215, 45, 25);
		toggleButton_29.setSelected(true);
		toggleButton_29.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_29);
	}

}
