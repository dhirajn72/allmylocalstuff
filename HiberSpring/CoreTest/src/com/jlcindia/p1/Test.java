package com.jlcindia.p1;

import javax.swing.JOptionPane;

public class Test {
	public static void main(String[] args) {
		String val1 = JOptionPane.showInputDialog("Enter First int value");
		String val2 = JOptionPane.showInputDialog("Enter Second int value");
		int a = Integer.parseInt(val1);
		int b = Integer.parseInt(val2);
		String msg = "Sum is " + (a + b);
		JOptionPane.showMessageDialog(null, msg);

	}
}
