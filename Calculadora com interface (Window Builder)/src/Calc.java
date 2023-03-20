import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Calc extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	double valor1, valor2;
	String operacao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calc frame = new Calc();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calc() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		int n1 = 0, n2=0,n3=0,n4=0,n5=0,n6=0,n7=0,n8=0,n9=0;
		
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 59, 245, 202);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(5, 4, 7, 0));
		
		JButton btnNewButton_1 = new JButton("C");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_5 = new JButton("/");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				valor1 = Double.parseDouble(textField.getText());
				textField.setText(null);
				operacao = "div";
				
			}
		});
		panel.add(btnNewButton_5);
		
		JButton btnNewButton = new JButton("*");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				valor1 = Double.parseDouble(textField.getText());
				textField.setText(null);
				operacao = "multi";
				
			}
		});
		panel.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("-");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				valor1 = Double.parseDouble(textField.getText());
				textField.setText(null);
				operacao = "sub";
			}
		});
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_6 = new JButton("7");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = textField.getText();
				textField.setText(a+"7");
				
				
			}
		});
		panel.add(btnNewButton_6);
		
		JButton btnNewButton_3 = new JButton("8");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = textField.getText();
				textField.setText(a+"8");
			}
		});
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_10 = new JButton("9");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = textField.getText();
				textField.setText(a+"9");
			}
		});
		panel.add(btnNewButton_10);
		
		JButton btnNewButton_8 = new JButton("+");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				valor1 = Double.parseDouble(textField.getText());
				textField.setText(null);
				operacao = "soma";
				
			}
		});
		panel.add(btnNewButton_8);
		
		JButton btnNewButton_4 = new JButton("4");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = textField.getText();
				textField.setText(a+"4");
			}
		});
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_7 = new JButton("5");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = textField.getText();
				textField.setText(a+"5");
			}
			
		});
		panel.add(btnNewButton_7);
		
		JButton btnNewButton_12 = new JButton("6");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = textField.getText();
				textField.setText(a+"6");
			}
		});
		panel.add(btnNewButton_12);
		
		JButton btnNewButton_9 = new JButton(".");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(btnNewButton_9);
		
		JButton btnNewButton_15 = new JButton("1");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = textField.getText();
				textField.setText(a+"1");
				
			}
		});
		panel.add(btnNewButton_15);
		
		JButton btnNewButton_11 = new JButton("2");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = textField.getText();
				textField.setText(a+"2");
			}
		});
		panel.add(btnNewButton_11);
		
		JButton btnNewButton_13 = new JButton("3");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = textField.getText();
				textField.setText(a+"3");
			}
		});
		panel.add(btnNewButton_13);
		
		JButton btnNewButton_16 = new JButton("DEL");
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(btnNewButton_16);
		
		JButton btnNewButton_14 = new JButton("0");
		
		panel.add(btnNewButton_14);
		
		JButton btnNewButton_18 = new JButton(",");
		btnNewButton_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		panel.add(btnNewButton_18);
		
		JButton btnEnter = new JButton("=");
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor2 = Double.parseDouble(textField.getText());
				
				switch(operacao) {
				case "soma":
					textField.setText(String.valueOf(valor1+valor2));
					break;
				case "sub":
					textField.setText(String.valueOf(valor1-valor2));
					break;
				case "multi":
					textField.setText(String.valueOf(valor1*valor2));
					break;
				case "div":
					textField.setText(String.valueOf(valor1/valor2));
					break;
	
				}
			}
		});
		panel.add(btnEnter);
		
		textField = new JTextField();
		textField.setBounds(0, 11, 245, 37);
		contentPane.add(textField);
		textField.setColumns(10);
		
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				textField.setText(textField.getText()+"0");
				
			}
		});
	}
}
