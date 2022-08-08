package net.calculator;

import javax.swing.JOptionPane;


public class Result
{


	public static void infoBox(String infoMessage, String titleBar)
    {
        JOptionPane.showMessageDialog(null, infoMessage, "Tests : " + titleBar, JOptionPane.INFORMATION_MESSAGE);
    }
}
