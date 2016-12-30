package cn.wsh.client;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class C9 extends JFrame {

	public JFrame frame9;

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
	private void initialize() {                                      //少一个场次
		//final ArrayTX.list TX.list=new ArrayTX.list();
		final int a=0;
		final int b=0;
		final int k=0;
		final String[][] seat=new String[10][10];
		final String[] str=new String[100];
		final int[] row=new int[10];
		final int[] line=new int[10];
		for(int i=0;i<100;i++){
			for(int j=0;j<10;j++){
			try {
				seat[i][j]=TX.is.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		}
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
		
		
		JPanel panel_2 = new JPanel();
		frame9.getContentPane().add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(null);
		
		
		final JButton toggleButton = new JButton("0101");
		toggleButton.setBounds(5, 5, 45, 25);
		toggleButton.setSelected(true);
		toggleButton.setFont(new Font("楷体", Font.PLAIN, 12));
		
		 str[0]=(String) toggleButton.getText();
		 row[0]=Integer.parseInt(str[0]);
		 line[0]=row[0]%10;
		 row[0]=row[0]/10;
		 
		if(seat[row[0]][line[0]].equals("true")){
			toggleButton.setBackground(Color.BLUE);
	
		}else if(seat[row[0]][line[0]].equals("false")){
			toggleButton.setBackground(Color.red);
			
			
		}
		toggleButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
			 	if(seat[row[0]][line[0]].equals("true")){
			 		toggleButton.setBackground(Color.red);
			          TX.list.add(str[0]);
			 	}
			}
			
		});
		panel_2.add(toggleButton);
		
		final JButton toggleButton_1 = new JButton("0102");
		toggleButton_1.setBounds(55, 5, 45, 25);
		toggleButton_1.setSelected(true);
		toggleButton_1.setFont(new Font("楷体", Font.PLAIN, 12));
          str[1]=toggleButton.getText();
		 row[0]=Integer.parseInt(str[1]);
		 line[0]=row[0]%10;
		 row[0]=row[0]/10;
		 
		if(seat[row[0]][line[0]].equals("true")){
			toggleButton_1.setBackground(Color.BLUE);
	
		}else if(seat[row[0]][line[0]].equals("false")){
			toggleButton_1.setBackground(Color.red);
			
		}
		toggleButton_1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
			 	if(seat[row[0]][line[0]].equals("true")){
			 		toggleButton_1.setBackground(Color.red);
			         
			          TX.list.add(str[1]);
			 	}
			}
			
		});
		panel_2.add(toggleButton_1);
		
		final JButton toggleButton_2 = new JButton("0103");
		toggleButton_2.setBounds(105, 5, 45, 25);
		toggleButton_2.setSelected(true);
		toggleButton_2.setFont(new Font("楷体", Font.PLAIN, 12));
	    str[2]=toggleButton_2.getText();
		 row[0]=Integer.parseInt(str[2]);
		 line[0]=row[0]%10;
		 row[0]=row[0]/10;
		 
		if(seat[row[0]][line[0]].equals("true")){
			toggleButton_2.setBackground(Color.BLUE);
	
		}else if(seat[row[0]][line[0]].equals("false")){
			toggleButton_2.setBackground(Color.red);
			
		}
		toggleButton_2.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
			 	if(seat[row[0]][line[0]].equals("true")){
			 		toggleButton_2.setBackground(Color.red);
			          TX.list.add(str[2]);
			 	}
			}
			
		});
		panel_2.add(toggleButton_2);
		
		final JButton toggleButton_3 = new JButton("0104");
		toggleButton_3.setBounds(155, 5, 45, 25);
		toggleButton_3.setSelected(true);
		toggleButton_3.setFont(new Font("楷体", Font.PLAIN, 12));
             str[3]=toggleButton_3.getText();
		 row[0]=Integer.parseInt(str[3]);
		 line[0]=row[0]%10;
		 row[0]=row[0]/10;
		 
		if(seat[row[0]][line[0]].equals("true")){
			toggleButton_3.setBackground(Color.BLUE);
	
		}else if(seat[row[0]][line[0]].equals("false")){
			toggleButton_3.setBackground(Color.red);
			
		}
		toggleButton_3.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
			 	if(seat[row[0]][line[0]].equals("true")){
			 		toggleButton_3.setBackground(Color.red);
			          TX.list.add(str[3]);
			 	}
			}
			
		});
		panel_2.add(toggleButton_3);
		
		final JButton toggleButton_4 = new JButton("0105");
		toggleButton_4.setBounds(205, 5, 45, 25);
		toggleButton_4.setSelected(true);
		toggleButton_4.setFont(new Font("楷体", Font.PLAIN, 12));
		 str[4]=toggleButton_4.getText();
		 row[0]=Integer.parseInt(str[4]);
		 line[0]=row[0]%10;
		 row[0]=row[0]/10;
		 
		if(seat[row[0]][line[0]].equals("true")){
			toggleButton_4.setBackground(Color.BLUE);
	
		}else if(seat[row[0]][line[0]].equals("false")){
			toggleButton_4.setBackground(Color.red);
			
		}
		toggleButton_4.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
			 	if(seat[row[0]][line[0]].equals("true")){
			 		toggleButton_4.setBackground(Color.red);
			          TX.list.add(str[4]);
			 	}
			}
			
		});
		panel_2.add(toggleButton_4);
		
		final JButton toggleButton_5 = new JButton("0106");
		toggleButton_5.setBounds(255, 5, 45, 25);
		toggleButton_5.setSelected(true);
		toggleButton_5.setFont(new Font("楷体", Font.PLAIN, 12));
	     str[5]=toggleButton_5.getText();
		 row[0]=Integer.parseInt(str[5]);
		 line[0]=row[0]%10;
		 row[0]=row[0]/10;
		 
		if(seat[row[0]][line[0]].equals("true")){
			toggleButton_5.setBackground(Color.BLUE);
	
		}else if(seat[row[0]][line[0]].equals("false")){
			toggleButton_5.setBackground(Color.red);
			
		}
		toggleButton_5.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
			 	if(seat[row[0]][line[0]].equals("true")){
			 		toggleButton_5.setBackground(Color.red);
			          TX.list.add(str[5]);
			 	}
			}
			
		});
		panel_2.add(toggleButton_5);
		
		final JButton toggleButton_6 = new JButton("0107");
		toggleButton_6.setBounds(325, 5, 45, 25);
		toggleButton_6.setSelected(true);
		toggleButton_6.setFont(new Font("楷体", Font.PLAIN, 12));
		 str[6]=toggleButton_6.getText();
		 row[0]=Integer.parseInt(str[6]);
		 line[0]=row[0]%10;
		 row[0]=row[0]/10;
		 
		if(seat[row[0]][line[0]].equals("true")){
			toggleButton_6.setBackground(Color.BLUE);
	
		}else if(seat[row[0]][line[0]].equals("false")){
			toggleButton_6.setBackground(Color.red);
			
		}
		toggleButton_6.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
			 	if(seat[row[0]][line[0]].equals("true")){
			 		toggleButton_6.setBackground(Color.red);
			          TX.list.add(str[6]);
			 	}
			}
			
		});
		
		panel_2.add(toggleButton_6);
		
		final JButton toggleButton_7 = new JButton("0108");
		toggleButton_7.setBounds(375, 5, 45, 25);
		toggleButton_7.setSelected(true);
		toggleButton_7.setFont(new Font("楷体", Font.PLAIN, 12));
		 str[7]=toggleButton_7.getText();
		 row[0]=Integer.parseInt(str[7]);
		 line[0]=row[0]%10;
		 row[0]=row[0]/10;
		 
		if(seat[row[0]][line[0]].equals("true")){
			toggleButton_7.setBackground(Color.BLUE);
	
		}else if(seat[row[0]][line[0]].equals("false")){
			toggleButton_7.setBackground(Color.red);
			
		}
		toggleButton_7.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
			 	if(seat[row[0]][line[0]].equals("true")){
			 		toggleButton_7.setBackground(Color.red);
			          TX.list.add(str[7]);
			 	}
			}
			
		});
		panel_2.add(toggleButton_7);
		
		final JButton toggleButton_8 = new JButton("0109");
		toggleButton_8.setBounds(425, 5, 45, 25);
		toggleButton_8.setSelected(true);
		toggleButton_8.setFont(new Font("楷体", Font.PLAIN, 12));
		 str[8]=toggleButton_8.getText();
		 row[0]=Integer.parseInt(str[8]);
		 line[0]=row[0]%10;
		 row[0]=row[0]/10;
		 
		if(seat[row[0]][line[0]].equals("true")){
			toggleButton_8.setBackground(Color.BLUE);
	
		}else if(seat[row[0]][line[0]].equals("false")){
			toggleButton_8.setBackground(Color.red);
			
		}
		toggleButton_8.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
			 	if(seat[row[0]][line[0]].equals("true")){
			 		toggleButton_8.setBackground(Color.red);
			          TX.list.add(str[8]);
			 	}
			}
			
		});
		panel_2.add(toggleButton_8);
		
		final JButton toggleButton_9 = new JButton("0201");
		toggleButton_9.setBounds(475, 5, 45, 25);
		toggleButton_9.setSelected(true);
		toggleButton_9.setFont(new Font("楷体", Font.PLAIN, 12));
		 str[9]=toggleButton_9.getText();
		 row[0]=Integer.parseInt(str[9]);
		 line[0]=row[0]%10;
		 row[0]=row[0]/10;
		 
		if(seat[row[0]][line[0]].equals("true")){
			toggleButton_9.setBackground(Color.BLUE);
	
		}else if(seat[row[0]][line[0]].equals("false")){
			toggleButton_9.setBackground(Color.red);
			
		}
		toggleButton_9.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
			 	if(seat[row[0]][line[0]].equals("true")){
			 		toggleButton_9.setBackground(Color.red);
			          TX.list.add(str[9]);
			 	}
			}
			
		});
		panel_2.add(toggleButton_9);
		
		final JButton toggleButton_10 = new JButton("0202");
		toggleButton_10.setBounds(525, 5, 45, 25);
		toggleButton_10.setSelected(true);
		toggleButton_10.setFont(new Font("楷体", Font.PLAIN, 12));
		 str[10]=toggleButton_10.getText();
		 row[0]=Integer.parseInt(str[10]);
		 line[0]=row[0]%10;
		 row[0]=row[0]/10;
		 
		if(seat[row[0]][line[0]].equals("true")){
			toggleButton_10.setBackground(Color.BLUE);
	
		}else if(seat[row[0]][line[0]].equals("false")){
			toggleButton_10.setBackground(Color.red);
			
		}
		toggleButton_10.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
			 	if(seat[row[0]][line[0]].equals("true")){
			 		toggleButton_10.setBackground(Color.red);
			          TX.list.add(str[10]);
			 	}
			}
			
		});
		panel_2.add(toggleButton_10);
		
		final JButton toggleButton_11 = new JButton("0203");
		toggleButton_11.setBounds(575, 5, 45, 25);
		toggleButton_11.setSelected(true);
		toggleButton_11.setFont(new Font("楷体", Font.PLAIN, 12));
		 str[11]=toggleButton_11.getText();
		 row[0]=Integer.parseInt(str[11]);
		 line[0]=row[0]%10;
		 row[0]=row[0]/10;
		 
		if(seat[row[0]][line[0]].equals("true")){
			toggleButton_11.setBackground(Color.BLUE);
	
		}else if(seat[row[0]][line[0]].equals("false")){
			toggleButton_11.setBackground(Color.red);
			
		}
		toggleButton_11.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
			 	if(seat[row[0]][line[0]].equals("true")){
			 		toggleButton_11.setBackground(Color.red);
			          TX.list.add(str[11]);
			 	}
			}
			
		});
		panel_2.add(toggleButton_11);
		
		final JButton toggleButton_12 = new JButton("0204");
		toggleButton_12.setBounds(5, 35, 45, 25);
		toggleButton_12.setSelected(true);
		toggleButton_12.setFont(new Font("楷体", Font.PLAIN, 12));
		 str[12]=toggleButton_12.getText();
		 row[0]=Integer.parseInt(str[12]);
		 line[0]=row[0]%10;
		 row[0]=row[0]/10;
		 
		if(seat[row[0]][line[0]].equals("true")){
			toggleButton_12.setBackground(Color.BLUE);
	
		}else if(seat[row[0]][line[0]].equals("false")){
			toggleButton_12.setBackground(Color.red);
			
		}
		toggleButton_12.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
			 	if(seat[row[0]][line[0]].equals("true")){
			 		toggleButton_12.setBackground(Color.red);
			          TX.list.add(str[12]);
			 	}
			}
			
		});
		panel_2.add(toggleButton_12);
		
		final JButton toggleButton_13 = new JButton("0205");
		toggleButton_13.setBounds(55, 35, 45, 25);
		toggleButton_13.setSelected(true);
		toggleButton_13.setFont(new Font("楷体", Font.PLAIN, 12));
		 str[13]=toggleButton_13.getText();
		 row[0]=Integer.parseInt(str[13]);
		 line[0]=row[0]%10;
		 row[0]=row[0]/10;
		 
		if(seat[row[0]][line[0]].equals("true")){
			toggleButton_13.setBackground(Color.BLUE);
	
		}else if(seat[row[0]][line[0]].equals("false")){
			toggleButton_13.setBackground(Color.red);
			
		}
		toggleButton_13.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
			 	if(seat[row[0]][line[0]].equals("true")){
			 		toggleButton_13.setBackground(Color.red);
			          TX.list.add(str[13]);
			 	}
			}
			
		});
		panel_2.add(toggleButton_13);
		
		final JButton toggleButton_14 = new JButton("0206");
		toggleButton_14.setBounds(105, 35, 45, 25);
		toggleButton_14.setSelected(true);
		toggleButton_14.setFont(new Font("楷体", Font.PLAIN, 12));
		 str[14]=toggleButton_14.getText();
		 row[0]=Integer.parseInt(str[14]);
		 line[0]=row[0]%10;
		 row[0]=row[0]/10;
		 
		if(seat[row[0]][line[0]].equals("true")){
			toggleButton_14.setBackground(Color.BLUE);
	
		}else if(seat[row[0]][line[0]].equals("false")){
			toggleButton_14.setBackground(Color.red);
			
		}
		toggleButton_14.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
			 	if(seat[row[0]][line[0]].equals("true")){
			 		toggleButton_14.setBackground(Color.red);
			          TX.list.add(str[14]);
			 	}
			}
			
		});
		panel_2.add(toggleButton_14);
		
		final JButton toggleButton_15 = new JButton("0207");
		toggleButton_15.setBounds(155, 35, 45, 25);
		toggleButton_15.setSelected(true);
		toggleButton_15.setFont(new Font("楷体", Font.PLAIN, 12));
		 str[15]=toggleButton_15.getText();
		 row[0]=Integer.parseInt(str[15]);
		 line[0]=row[0]%10;
		 row[0]=row[0]/10;
		 
		if(seat[row[0]][line[0]].equals("true")){
			toggleButton_15.setBackground(Color.BLUE);
	
		}else if(seat[row[0]][line[0]].equals("false")){
			toggleButton_15.setBackground(Color.red);
			
		}
		toggleButton_15.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
			 	if(seat[row[0]][line[0]].equals("true")){
			 		toggleButton_15.setBackground(Color.red);
			          TX.list.add(str[15]);
			 	}
			}
			
		});
		panel_2.add(toggleButton_15);
		
		final JButton toggleButton_16 = new JButton("0208");
		toggleButton_16.setBounds(205, 35, 45, 25);
		toggleButton_16.setSelected(true);
		toggleButton_16.setFont(new Font("楷体", Font.PLAIN, 12));
		 str[16]=toggleButton_16.getText();
		 row[0]=Integer.parseInt(str[16]);
		 line[0]=row[0]%10;
		 row[0]=row[0]/10;
		 
		if(seat[row[0]][line[0]].equals("true")){
			toggleButton_16.setBackground(Color.BLUE);
	
		}else if(seat[row[0]][line[0]].equals("false")){
			toggleButton_16.setBackground(Color.red);
			
		}
		toggleButton_16.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
			 	if(seat[row[0]][line[0]].equals("true")){
			 		toggleButton_16.setBackground(Color.red);
			          TX.list.add(str[16]);
			 	}
			}
			
		});
		panel_2.add(toggleButton_16);
		
		final JButton toggleButton_17 = new JButton("0209");
		toggleButton_17.setBounds(255, 35, 45, 25);
		toggleButton_17.setSelected(true);
		toggleButton_17.setFont(new Font("楷体", Font.PLAIN, 12));
		 str[17]=toggleButton_17.getText();
		 row[0]=Integer.parseInt(str[17]);
		 line[0]=row[0]%10;
		 row[0]=row[0]/10;
		 
		if(seat[row[0]][line[0]].equals("true")){
			toggleButton_17.setBackground(Color.BLUE);
	
		}else if(seat[row[0]][line[0]].equals("false")){
			toggleButton_17.setBackground(Color.red);
			
		}
		toggleButton_17.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
			 	if(seat[row[0]][line[0]].equals("true")){
			 		toggleButton_17.setBackground(Color.red);
			          TX.list.add(str[17]);
			 	}
			}
			
		});
		panel_2.add(toggleButton_17);
		
		final JButton toggleButton_18 = new JButton("0302");
		toggleButton_18.setBounds(325, 35, 45, 25);
		toggleButton_18.setSelected(true);
		toggleButton_18.setFont(new Font("楷体", Font.PLAIN, 12));
		 str[18]=toggleButton_18.getText();
		 row[0]=Integer.parseInt(str[18]);
		 line[0]=row[0]%10;
		 row[0]=row[0]/10;
		 
		if(seat[row[0]][line[0]].equals("true")){
			toggleButton_18.setBackground(Color.BLUE);
	
		}else if(seat[row[0]][line[0]].equals("false")){
			toggleButton_18.setBackground(Color.red);
			
		}
		toggleButton_18.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
			 	if(seat[row[0]][line[0]].equals("true")){
			 		toggleButton_18.setBackground(Color.red);
			          TX.list.add(str[18]);
			 	}
			}
			
		});
		panel_2.add(toggleButton_18);
		
		final JButton toggleButton_19 = new JButton("0301");
		toggleButton_19.setBounds(375, 35, 45, 25);
		toggleButton_19.setSelected(true);
		toggleButton_19.setFont(new Font("楷体", Font.PLAIN, 12));
		 str[19]=toggleButton_19.getText();
		 row[0]=Integer.parseInt(str[19]);
		 line[0]=row[0]%10;
		 row[0]=row[0]/10;
		 
		if(seat[row[0]][line[0]].equals("true")){
			toggleButton_19.setBackground(Color.BLUE);
	
		}else if(seat[row[0]][line[0]].equals("false")){
			toggleButton_19.setBackground(Color.red);
			
		}
		toggleButton_19.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
			 	if(seat[row[0]][line[0]].equals("true")){
			 		toggleButton_19.setBackground(Color.red);
			          TX.list.add(str[19]);
			 	}
			}
			
		});
		panel_2.add(toggleButton_19);
		
		final JButton toggleButton_20 = new JButton("0303");
		toggleButton_20.setBounds(425, 35, 45, 25);
		toggleButton_20.setSelected(true);
		toggleButton_20.setFont(new Font("楷体", Font.PLAIN, 12));
		 str[20]=toggleButton_20.getText();
		 row[0]=Integer.parseInt(str[20]);
		 line[0]=row[0]%10;
		 row[0]=row[0]/10;
		 
		if(seat[row[0]][line[0]].equals("true")){
			toggleButton_20.setBackground(Color.BLUE);
	
		}else if(seat[row[0]][line[0]].equals("false")){
			toggleButton_20.setBackground(Color.red);
			
		}
		toggleButton_20.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
			 	if(seat[row[0]][line[0]].equals("true")){
			 		toggleButton_20.setBackground(Color.red);
			          TX.list.add(str[20]);
			 	}
			}
			
		});
		panel_2.add(toggleButton_20);
		
		final JButton toggleButton_21 = new JButton("0304");
		toggleButton_21.setBounds(475, 35, 45, 25);
		toggleButton_21.setSelected(true);
		toggleButton_21.setFont(new Font("楷体", Font.PLAIN, 12));
		 str[21]=toggleButton_21.getText();
		 row[0]=Integer.parseInt(str[21]);
		 line[0]=row[0]%10;
		 row[0]=row[0]/10;
		 
		if(seat[row[0]][line[0]].equals("true")){
			toggleButton_21.setBackground(Color.BLUE);
	
		}else if(seat[row[0]][line[0]].equals("false")){
			toggleButton_21.setBackground(Color.red);
			
		}
		toggleButton_21.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
			 	if(seat[row[0]][line[0]].equals("true")){
			 		toggleButton_21.setBackground(Color.red);
			          TX.list.add(str[21]);
			 	}
			}
			
		});
		panel_2.add(toggleButton_21);
		
		final JButton toggleButton_22 = new JButton("0305");
		toggleButton_22.setBounds(525, 35, 45, 25);
		toggleButton_22.setSelected(true);
		toggleButton_22.setFont(new Font("楷体", Font.PLAIN, 12));
		 str[22]=toggleButton_22.getText();
		 row[0]=Integer.parseInt(str[22]);
		 line[0]=row[0]%10;
		 row[0]=row[0]/10;
		 
		if(seat[row[0]][line[0]].equals("true")){
			toggleButton_22.setBackground(Color.BLUE);
	
		}else if(seat[row[0]][line[0]].equals("false")){
			toggleButton_22.setBackground(Color.red);
			
		}
		toggleButton_22.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
			 	if(seat[row[0]][line[0]].equals("true")){
			 		toggleButton_22.setBackground(Color.red);
			          TX.list.add(str[22]);
			 	}
			}
			
		});
		panel_2.add(toggleButton_22);
		
		final JButton toggleButton_23 = new JButton("0306");
		toggleButton_23.setBounds(575, 35, 45, 25);
		toggleButton_23.setSelected(true);
		toggleButton_23.setFont(new Font("楷体", Font.PLAIN, 12));
		 str[23]=toggleButton_23.getText();
		 row[0]=Integer.parseInt(str[23]);
		 line[0]=row[0]%10;
		 row[0]=row[0]/10;
		 
		if(seat[row[0]][line[0]].equals("true")){
			toggleButton_23.setBackground(Color.BLUE);
	
		}else if(seat[row[0]][line[0]].equals("false")){
			toggleButton_23.setBackground(Color.red);
			
		}
		toggleButton_23.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
			 	if(seat[row[0]][line[0]].equals("true")){
			 		toggleButton_23.setBackground(Color.red);
			          TX.list.add(str[23]);
			 	}
			}
			
		});
		panel_2.add(toggleButton_23);
		
		final JButton toggleButton_30 = new JButton("0307");
		toggleButton_30.setBounds(5, 65, 45, 25);
		toggleButton_30.setSelected(true);
		toggleButton_30.setFont(new Font("楷体", Font.PLAIN, 12));
		 str[24]=toggleButton_30.getText();
		 row[0]=Integer.parseInt(str[24]);
		 line[0]=row[0]%10;
		 row[0]=row[0]/10;
		 
		if(seat[row[0]][line[0]].equals("true")){
			toggleButton_30.setBackground(Color.BLUE);
	
		}else if(seat[row[0]][line[0]].equals("false")){
			toggleButton_30.setBackground(Color.red);
			
		}
		toggleButton_30.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
			 	if(seat[row[0]][line[0]].equals("true")){
			 		toggleButton_30.setBackground(Color.red);
			          TX.list.add(str[24]);
			 	}
			}
			
		});
		panel_2.add(toggleButton_30);
		
		JButton toggleButton_41 = new JButton("26");
		toggleButton_41.setBounds(55, 65, 45, 25);
		toggleButton_41.setSelected(true);
		toggleButton_41.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_41);
		
		JButton toggleButton_42 = new JButton("27");
		toggleButton_42.setBounds(105, 65, 45, 25);
		toggleButton_42.setSelected(true);
		toggleButton_42.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_42);
		
		JButton toggleButton_43 = new JButton("28");
		toggleButton_43.setBounds(155, 65, 45, 25);
		toggleButton_43.setSelected(true);
		toggleButton_43.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_43);
		
		JButton toggleButton_44 = new JButton("29");
		toggleButton_44.setBounds(205, 65, 45, 25);
		toggleButton_44.setSelected(true);
		toggleButton_44.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_44);
		
		JButton toggleButton_45 = new JButton("30");
		toggleButton_45.setBounds(255, 65, 45, 25);
		toggleButton_45.setSelected(true);
		toggleButton_45.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_45);
		
		JButton toggleButton_66 = new JButton("31");
		toggleButton_66.setBounds(325, 65, 45, 25);
		toggleButton_66.setSelected(true);
		toggleButton_66.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_66);
		
		JButton toggleButton_67 = new JButton("32");
		toggleButton_67.setBounds(375, 65, 45, 25);
		toggleButton_67.setSelected(true);
		toggleButton_67.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_67);
		
		JButton toggleButton_68 = new JButton("33");
		toggleButton_68.setBounds(425, 65, 45, 25);
		toggleButton_68.setSelected(true);
		toggleButton_68.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_68);
		
		JButton toggleButton_69 = new JButton("34");
		toggleButton_69.setBounds(475, 65, 45, 25);
		toggleButton_69.setSelected(true);
		toggleButton_69.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_69);
		
		JButton toggleButton_70 = new JButton("35");
		toggleButton_70.setBounds(525, 65, 45, 25);
		toggleButton_70.setSelected(true);
		toggleButton_70.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_70);
		
		JButton toggleButton_24 = new JButton("36");
		toggleButton_24.setBounds(575, 65, 45, 25);
		toggleButton_24.setSelected(true);
		toggleButton_24.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_24);
		
		JButton toggleButton_31 = new JButton("37");
		toggleButton_31.setBounds(5, 95, 45, 25);
		toggleButton_31.setSelected(true);
		toggleButton_31.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_31);
		
		JButton toggleButton_40 = new JButton("38");
		toggleButton_40.setBounds(55, 95, 45, 25);
		toggleButton_40.setSelected(true);
		toggleButton_40.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_40);
		
		JButton toggleButton_49 = new JButton("39");
		toggleButton_49.setBounds(105, 95, 45, 25);
		toggleButton_49.setSelected(true);
		toggleButton_49.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_49);
		
		JButton toggleButton_48 = new JButton("40");
		toggleButton_48.setBounds(155, 95, 45, 25);
		toggleButton_48.setSelected(true);
		toggleButton_48.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_48);
		
		JButton toggleButton_47 = new JButton("41");
		toggleButton_47.setBounds(205, 95, 45, 25);
		toggleButton_47.setSelected(true);
		toggleButton_47.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_47);
		
		JButton toggleButton_46 = new JButton("42");
		toggleButton_46.setBounds(255, 95, 45, 25);
		toggleButton_46.setSelected(true);
		toggleButton_46.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_46);
		
		JButton toggleButton_71 = new JButton("43");
		toggleButton_71.setBounds(325, 95, 45, 25);
		toggleButton_71.setSelected(true);
		toggleButton_71.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_71);
		
		JButton toggleButton_72 = new JButton("44");
		toggleButton_72.setBounds(375, 95, 45, 25);
		toggleButton_72.setSelected(true);
		toggleButton_72.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_72);
		
		JButton toggleButton_73 = new JButton("45");
		toggleButton_73.setBounds(425, 95, 45, 25);
		toggleButton_73.setSelected(true);
		toggleButton_73.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_73);
		
		JButton toggleButton_74 = new JButton("46");
		toggleButton_74.setBounds(475, 95, 45, 25);
		toggleButton_74.setSelected(true);
		toggleButton_74.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_74);
		
		JButton toggleButton_75 = new JButton("47");
		toggleButton_75.setBounds(525, 95, 45, 25);
		toggleButton_75.setSelected(true);
		toggleButton_75.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_75);
		
		JButton toggleButton_25 = new JButton("48");
		toggleButton_25.setBounds(575, 95, 45, 25);
		toggleButton_25.setSelected(true);
		toggleButton_25.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_25);
		
		JButton toggleButton_32 = new JButton("49");
		toggleButton_32.setBounds(5, 125, 45, 25);
		toggleButton_32.setSelected(true);
		toggleButton_32.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_32);
		
		JButton toggleButton_39 = new JButton("50");
		toggleButton_39.setBounds(55, 125, 45, 25);
		toggleButton_39.setSelected(true);
		toggleButton_39.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_39);
		
		JButton toggleButton_50 = new JButton("51");
		toggleButton_50.setBounds(105, 125, 45, 25);
		toggleButton_50.setSelected(true);
		toggleButton_50.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_50);
		
		JButton toggleButton_51 = new JButton("52");
		toggleButton_51.setBounds(155, 125, 45, 25);
		toggleButton_51.setSelected(true);
		toggleButton_51.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_51);
		
		JButton toggleButton_52 = new JButton("53");
		toggleButton_52.setBounds(205, 125, 45, 25);
		toggleButton_52.setSelected(true);
		toggleButton_52.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_52);
		
		JButton toggleButton_53 = new JButton("54");
		toggleButton_53.setBounds(255, 125, 45, 25);
		toggleButton_53.setSelected(true);
		toggleButton_53.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_53);
		
		JButton toggleButton_80 = new JButton("55");
		toggleButton_80.setBounds(325, 125, 45, 25);
		toggleButton_80.setSelected(true);
		toggleButton_80.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_80);
		
		JButton toggleButton_79 = new JButton("56");
		toggleButton_79.setBounds(375, 125, 45, 25);
		toggleButton_79.setSelected(true);
		toggleButton_79.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_79);
		
		JButton toggleButton_78 = new JButton("57");
		toggleButton_78.setBounds(425, 125, 45, 25);
		toggleButton_78.setSelected(true);
		toggleButton_78.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_78);
		
		JButton toggleButton_77 = new JButton("58");
		toggleButton_77.setBounds(475, 125, 45, 25);
		toggleButton_77.setSelected(true);
		toggleButton_77.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_77);
		
		JButton toggleButton_76 = new JButton("59");
		toggleButton_76.setBounds(525, 125, 45, 25);
		toggleButton_76.setSelected(true);
		toggleButton_76.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_76);
		
		JButton toggleButton_26 = new JButton("60");
		toggleButton_26.setBounds(575, 125, 45, 25);
		toggleButton_26.setSelected(true);
		toggleButton_26.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_26);
		
		JButton toggleButton_33 = new JButton("61");
		toggleButton_33.setBounds(5, 155, 45, 25);
		toggleButton_33.setSelected(true);
		toggleButton_33.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_33);
		
		JButton toggleButton_38 = new JButton("62");
		toggleButton_38.setBounds(55, 155, 45, 25);
		toggleButton_38.setSelected(true);
		toggleButton_38.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_38);
		
		JButton toggleButton_54 = new JButton("63");
		toggleButton_54.setBounds(105, 155, 45, 25);
		toggleButton_54.setSelected(true);
		toggleButton_54.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_54);
		
		JButton toggleButton_55 = new JButton("64");
		toggleButton_55.setBounds(155, 155, 45, 25);
		toggleButton_55.setSelected(true);
		toggleButton_55.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_55);
		
		JButton toggleButton_56 = new JButton("65");
		toggleButton_56.setBounds(205, 155, 45, 25);
		toggleButton_56.setSelected(true);
		toggleButton_56.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_56);
		
		JButton toggleButton_57 = new JButton("66");
		toggleButton_57.setBounds(255, 155, 45, 25);
		toggleButton_57.setSelected(true);
		toggleButton_57.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_57);
		
		JButton toggleButton_81 = new JButton("67");
		toggleButton_81.setBounds(325, 155, 45, 25);
		toggleButton_81.setSelected(true);
		toggleButton_81.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_81);
		
		JButton toggleButton_82 = new JButton("68");
		toggleButton_82.setBounds(375, 155, 45, 25);
		toggleButton_82.setSelected(true);
		toggleButton_82.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_82);
		
		JButton toggleButton_83 = new JButton("69");
		toggleButton_83.setBounds(425, 155, 45, 25);
		toggleButton_83.setSelected(true);
		toggleButton_83.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_83);
		
		JButton toggleButton_84 = new JButton("70");
		toggleButton_84.setBounds(475, 155, 45, 25);
		toggleButton_84.setSelected(true);
		toggleButton_84.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_84);
		
		JButton toggleButton_85 = new JButton("71");
		toggleButton_85.setBounds(525, 155, 45, 25);
		toggleButton_85.setSelected(true);
		toggleButton_85.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_85);
		
		JButton toggleButton_27 = new JButton("72");
		toggleButton_27.setBounds(575, 155, 45, 25);
		toggleButton_27.setSelected(true);
		toggleButton_27.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_27);
		
		JButton toggleButton_34 = new JButton("73");
		toggleButton_34.setBounds(5, 185, 45, 25);
		toggleButton_34.setSelected(true);
		toggleButton_34.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_34);
		
		JButton toggleButton_37 = new JButton("74");
		toggleButton_37.setBounds(55, 185, 45, 25);
		toggleButton_37.setSelected(true);
		toggleButton_37.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_37);
		
		JButton toggleButton_58 = new JButton("75");
		toggleButton_58.setBounds(105, 185, 45, 25);
		toggleButton_58.setSelected(true);
		toggleButton_58.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_58);
		
		JButton toggleButton_59 = new JButton("76");
		toggleButton_59.setBounds(155, 185, 45, 25);
		toggleButton_59.setSelected(true);
		toggleButton_59.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_59);
		
		JButton toggleButton_60 = new JButton("77");
		toggleButton_60.setBounds(205, 185, 45, 25);
		toggleButton_60.setSelected(true);
		toggleButton_60.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_60);
		
		JButton toggleButton_61 = new JButton("78");
		toggleButton_61.setBounds(255, 185, 45, 25);
		toggleButton_61.setSelected(true);
		toggleButton_61.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_61);
		
		JButton toggleButton_90 = new JButton("79");
		toggleButton_90.setBounds(325, 185, 45, 25);
		toggleButton_90.setSelected(true);
		toggleButton_90.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_90);
		
		JButton toggleButton_89 = new JButton("80");
		toggleButton_89.setBounds(375, 185, 45, 25);
		toggleButton_89.setSelected(true);
		toggleButton_89.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_89);
		
		JButton toggleButton_88 = new JButton("81");
		toggleButton_88.setBounds(425, 185, 45, 25);
		toggleButton_88.setSelected(true);
		toggleButton_88.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_88);
		
		JButton toggleButton_87 = new JButton("82");
		toggleButton_87.setBounds(475, 185, 45, 25);
		toggleButton_87.setSelected(true);
		toggleButton_87.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_87);
		
		JButton toggleButton_86 = new JButton("83");
		toggleButton_86.setBounds(525, 185, 45, 25);
		toggleButton_86.setSelected(true);
		toggleButton_86.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_86);
		
		JButton toggleButton_28 = new JButton("84");
		toggleButton_28.setBounds(575, 185, 45, 25);
		toggleButton_28.setSelected(true);
		toggleButton_28.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_28);
		
		JButton toggleButton_35 = new JButton("85");
		toggleButton_35.setBounds(5, 215, 45, 25);
		toggleButton_35.setSelected(true);
		toggleButton_35.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_35);
		
		JButton toggleButton_36 = new JButton("86");
		toggleButton_36.setBounds(55, 215, 45, 25);
		toggleButton_36.setSelected(true);
		toggleButton_36.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_36);
		
		JButton toggleButton_62 = new JButton("87");
		toggleButton_62.setBounds(105, 215, 45, 25);
		toggleButton_62.setSelected(true);
		toggleButton_62.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_62);
		
		JButton toggleButton_63 = new JButton("88");
		toggleButton_63.setBounds(155, 215, 45, 25);
		toggleButton_63.setSelected(true);
		toggleButton_63.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_63);
		
		JButton toggleButton_64 = new JButton("89");
		toggleButton_64.setBounds(205, 215, 45, 25);
		toggleButton_64.setSelected(true);
		toggleButton_64.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_64);
		
		JButton toggleButton_65 = new JButton("90");
		toggleButton_65.setBounds(255, 215, 45, 25);
		toggleButton_65.setSelected(true);
		toggleButton_65.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_65);
		
		JButton toggleButton_91 = new JButton("91");
		toggleButton_91.setBounds(325, 215, 45, 25);
		toggleButton_91.setSelected(true);
		toggleButton_91.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_91);
		
		JButton toggleButton_92 = new JButton("92");
		toggleButton_92.setBounds(375, 215, 45, 25);
		toggleButton_92.setSelected(true);
		toggleButton_92.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_92);
		
		JButton toggleButton_93 = new JButton("93");
		toggleButton_93.setBounds(425, 215, 45, 25);
		toggleButton_93.setSelected(true);
		toggleButton_93.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_93);
		
		JButton toggleButton_94 = new JButton("94");
		toggleButton_94.setBounds(475, 215, 45, 25);
		toggleButton_94.setSelected(true);
		toggleButton_94.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_94);
		
		JButton toggleButton_95 = new JButton("95");
		toggleButton_95.setBounds(525, 215, 45, 25);
		toggleButton_95.setSelected(true);
		toggleButton_95.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_95);
		
		JButton toggleButton_29 = new JButton("96");
		toggleButton_29.setBounds(575, 215, 45, 25);
		toggleButton_29.setSelected(true);
		toggleButton_29.setFont(new Font("楷体", Font.PLAIN, 12));
		panel_2.add(toggleButton_29);

		JButton btnNewButton = new JButton("确定");
		btnNewButton.setFont(new Font("楷体", Font.PLAIN, 20));
		btnNewButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				for(int i=0;i<TX.list.size();i++){
					TX.os.println(TX.list.get(i));
					TX.os.flush();
				}
				TX.os.println(false);
				TX.os.flush();
			}
			
		});
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("返回");
		btnNewButton_1.setFont(new Font("楷体", Font.PLAIN, 20));
		btnNewButton_1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				  frame9.setVisible(false);
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
			
		});
		panel_1.add(btnNewButton_1);
	}

}
