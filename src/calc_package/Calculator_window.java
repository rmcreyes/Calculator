/**
 * Simple Calculator
 * Author: Roberto Martin Reyes
 * Last Modified: December 25, 2017
 * Description: This is code for an application exercising the use of Java programming
 * 		and the Swing toolkit on eclipse.
 */

package calc_package;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator_window {

	/*
	 * I removed the trailing zeroes when not needed, and the modified parts begin from line 263.
	 * I did the modification for the button =, ¡Ì, log, sin, cos and tan. Hope it will help u. Good luck.
	 * Modifier: Zeno Van (by the way, u can also call me Zeqiu Fan)
	 */
	
	private JFrame frame;
	private JTextField textField;
	
	private double num1;
	private String operation, degRad;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator_window window = new Calculator_window();
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
	public Calculator_window() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		// app frame
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.BLACK);
		frame.setBounds(100, 100, 317, 480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		// text field
		textField = new JTextField();
		textField.setBounds(67, 37, 213, 41);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		textField.setText("0");
		
		// reset
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("0");
			}
		});
		btnC.setFont(new Font("Agency FB", Font.BOLD, 16));
		btnC.setBounds(15, 37, 42, 41);
		frame.getContentPane().add(btnC);
		
		// 1
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("0")) {
					textField.setText("1");
				}
				else {
					textField.setText(textField.getText() + "1");
				}
			}});
		btn1.setFont(new Font("Agency FB", Font.PLAIN, 22));
		btn1.setBounds(15, 355, 49, 53);
		frame.getContentPane().add(btn1);
		
		// 2
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("0")) {
					textField.setText("2");
				}
				else {
					textField.setText(textField.getText() + "2");
				}
			}});
		btn2.setFont(new Font("Agency FB", Font.PLAIN, 22));
		btn2.setBounds(64, 355, 49, 53);
		frame.getContentPane().add(btn2);
		
		// 3
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("0")) {
					textField.setText("3");
				}
				else {
					textField.setText(textField.getText() + "3");
				}
			}});
		btn3.setFont(new Font("Agency FB", Font.PLAIN, 22));
		btn3.setBounds(113, 355, 49, 53);
		frame.getContentPane().add(btn3);
		
		// 4
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("0")) {
					textField.setText("4");
				}
				else {
					textField.setText(textField.getText() + "4");
				}
			}});
		btn4.setFont(new Font("Agency FB", Font.PLAIN, 22));
		btn4.setBounds(15, 302, 49, 53);
		frame.getContentPane().add(btn4);
		
		// 5
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("0")) {
					textField.setText("5");
				}
				else {
					textField.setText(textField.getText() + "5");
				}
			}});
		btn5.setFont(new Font("Agency FB", Font.PLAIN, 22));
		btn5.setBounds(64, 302, 49, 53);
		frame.getContentPane().add(btn5);
		
		// 6
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("0")) {
					textField.setText("6");
				}
				else {
					textField.setText(textField.getText() + "6");
				}
			}});
		btn6.setFont(new Font("Agency FB", Font.PLAIN, 22));
		btn6.setBounds(113, 302, 49, 53);
		frame.getContentPane().add(btn6);
		
		// 7
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("0")) {
					textField.setText("7");
				}
				else {
					textField.setText(textField.getText() + "7");
				}
			}});
		btn7.setFont(new Font("Agency FB", Font.PLAIN, 22));
		btn7.setBounds(15, 249, 49, 53);
		frame.getContentPane().add(btn7);
		
		// 8
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("0")) {
					textField.setText("8");
				}
				else {
					textField.setText(textField.getText() + "8");
				}
			}});
		btn8.setFont(new Font("Agency FB", Font.PLAIN, 22));
		btn8.setBounds(64, 249, 49, 53);
		frame.getContentPane().add(btn8);
		
		// 9
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("0")) {
					textField.setText("9");
				}
				else {
					textField.setText(textField.getText() + "9");
				}
				}});
		btn9.setFont(new Font("Agency FB", Font.PLAIN, 22));
		btn9.setBounds(113, 249, 49, 53);
		frame.getContentPane().add(btn9);
		
		// 0
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!textField.getText().equals("0")) {
					textField.setText(textField.getText() + "0");
				}
			}
		});
		btn0.setFont(new Font("Agency FB", Font.PLAIN, 22));
		btn0.setBounds(15, 196, 49, 53);
		frame.getContentPane().add(btn0);
		
		// equals
		JButton btnEq = new JButton("=");
		btnEq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num2 = Double.parseDouble(textField.getText());
				double result;
				
				if(operation.equals("+")) {
					result = num1 + num2;
				}
				else if(operation.equals("-")) {
					result = num1 - num2;
				}
				else if(operation.equals("*")) {
					result = num1 * num2;
				}
				else if(operation.equals("/")) {
					result = num1 / num2;
				}
				else if(operation.equals("^")) {
					result = Math.pow(num1, num2);
				}
				else {
					result = 0;
				}
// altered by Zeno*****************************************************************
// to remove the trailing zeroes when not needed
				if (result == (int)result)
					textField.setText("" + (int)result);
				else
					textField.setText("" + result);
				
//				textField.setText(String.format("%g", result));
// ********************************************************************************
			}
		});
		btnEq.setFont(new Font("Agency FB", Font.PLAIN, 22));
		btnEq.setBounds(165, 355, 115, 53);
		frame.getContentPane().add(btnEq);
		
		// add
		JButton btnPlus = new JButton("+\r\n");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textField.getText());
				textField.setText("0");
				operation = "+";
			}
		});
		btnPlus.setFont(new Font("Agency FB", Font.PLAIN, 20));
		btnPlus.setBounds(238, 294, 42, 62);
		frame.getContentPane().add(btnPlus);
		
		// subtract
		JButton btnMin = new JButton("-\r\n");
		btnMin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textField.getText());
				textField.setText("0");
				operation = "-";
			}
		});
		btnMin.setFont(new Font("Agency FB", Font.PLAIN, 25));
		btnMin.setBounds(238, 232, 42, 62);
		frame.getContentPane().add(btnMin);
		
		// multiply
		JButton btnMult = new JButton("x\r\n");
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textField.getText());
				textField.setText("0");
				operation = "*";
			}
		});
		btnMult.setFont(new Font("Agency FB", Font.PLAIN, 25));
		btnMult.setBounds(238, 170, 42, 62);
		frame.getContentPane().add(btnMult);
		
		// divide
		JButton btnDiv = new JButton("÷\r\n");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textField.getText());
				textField.setText("0");
				operation = "/";
			}
		});
		btnDiv.setFont(new Font("Agency FB", Font.PLAIN, 20));
		btnDiv.setBounds(238, 108, 42, 62);
		frame.getContentPane().add(btnDiv);
		
		// negate
		JButton btnNeg = new JButton("(-)");
		btnNeg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(String.valueOf(Double.parseDouble(String
						.valueOf(textField.getText())) * (-1)));
			}
		});
		btnNeg.setFont(new Font("Agency FB", Font.PLAIN, 20));
		btnNeg.setBounds(165, 293, 70, 31);
		frame.getContentPane().add(btnNeg);
		
		JButton btnDec = new JButton(".");
		btnDec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!textField.getText().contains("."))
					textField.setText(textField.getText() + ".");
			}
		});
		btnDec.setFont(new Font("Agency FB", Font.PLAIN, 20));
		btnDec.setBounds(165, 324, 70, 31);
		frame.getContentPane().add(btnDec);
		
		JButton btnPow = new JButton("pow");
		btnPow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textField.getText());
				textField.setText("0");
				operation = "^";
			}
		});
		btnPow.setFont(new Font("Agency FB", Font.PLAIN, 20));
		btnPow.setBounds(165, 155, 70, 61);
		frame.getContentPane().add(btnPow);
		
		// square root
		JButton btnSqrt = new JButton("sqrt");
		btnSqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double value = Double.parseDouble(textField.getText());
				if(value >= 0) {
					double sqrt = Math.sqrt(value);	
// ********************************************************************************
					if (sqrt == (int)sqrt)
						textField.setText("" + (int)sqrt);
					else
						textField.setText("" + sqrt);
					
//					textField.setText(String.valueOf(sqrt));
// ********************************************************************************
				}
			}
		});
		btnSqrt.setFont(new Font("Agency FB", Font.PLAIN, 20));
		btnSqrt.setBounds(165, 216, 70, 61);
		frame.getContentPane().add(btnSqrt);
		
		// logarithm base 10
		JButton btnLog = new JButton("log");
		btnLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double value = Double.parseDouble(textField.getText());
				if(value > 0) {
					double log = Math.log10(value);
// ********************************************************************************
					if (log == (int)log)
						textField.setText("" + (int)log);
					else
						textField.setText("" + log);
//					textField.setText(String.valueOf(log));
// ********************************************************************************
				}
			}
		});
		btnLog.setFont(new Font("Agency FB", Font.PLAIN, 20));
		btnLog.setBounds(95, 172, 70, 61);
		frame.getContentPane().add(btnLog);
		
		// sin
		JButton btnSin = new JButton("sin");
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double value = Double.parseDouble(textField.getText());
				if(degRad.equals("rad")) {
					value *= Math.PI / 180.0;
				}
				double sin = Math.sin(value);
// ********************************************************************************
				if (sin == (int)sin)
					textField.setText("" + (int)sin);
				else
					textField.setText("" + sin);
//				textField.setText(String.valueOf(sin));
//********************************************************************************
			}
		});
		btnSin.setFont(new Font("Agency FB", Font.PLAIN, 20));
		btnSin.setBounds(15, 108, 70, 29);
		frame.getContentPane().add(btnSin);
		
		// cos
		JButton btnCos = new JButton("cos");
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double value = Double.parseDouble(textField.getText());
				if(degRad.equals("rad")) {
					value *= Math.PI / 180.0;
				}
				double cos = Math.cos(value);
// ********************************************************************************
				if (cos == (int)cos)
					textField.setText("" + (int)cos);
				else
					textField.setText("" + cos);
//				textField.setText(String.valueOf(cos));
//********************************************************************************
			}
		});
		btnCos.setFont(new Font("Agency FB", Font.PLAIN, 20));
		btnCos.setBounds(85, 108, 70, 29);
		frame.getContentPane().add(btnCos);
		
		// tan
		JButton btnTan = new JButton("tan");
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double value = Double.parseDouble(textField.getText());
				if(degRad.equals("rad")) {
					value *= Math.PI / 180.0;
				}
				double tan = Math.tan(value);
// ********************************************************************************
				if (tan == (int)tan)
					textField.setText("" + (int)tan);
				else
					textField.setText("" + tan);
//				textField.setText(String.valueOf(tan));
//********************************************************************************
			}
		});
		btnTan.setFont(new Font("Agency FB", Font.PLAIN, 20));
		btnTan.setBounds(155, 108, 70, 29);
		frame.getContentPane().add(btnTan);
		
		// degrees
		JRadioButton rdbtnDeg = new JRadioButton("DEG");
		rdbtnDeg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				degRad = "deg";
			}
		});
		rdbtnDeg.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rdbtnDeg.setBounds(16, 140, 59, 20);
		frame.getContentPane().add(rdbtnDeg);
		
		// radians
		JRadioButton rdbtnRad = new JRadioButton("RAD");
		rdbtnRad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				degRad = "rad";
			}
		});
		rdbtnRad.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rdbtnRad.setBounds(77, 140, 59, 20);
		frame.getContentPane().add(rdbtnRad);
		
		JLabel watermark = new JLabel("github.com/rmcreyes");
		watermark.setFont(new Font("Agency FB", Font.PLAIN, 15));
		watermark.setBounds(192, 0, 103, 20);
		frame.getContentPane().add(watermark);
		
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnDeg); group.add(rdbtnRad);
		
	}
}
