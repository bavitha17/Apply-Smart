package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import ApplyingJobs.ApplyingJobs;
import ApplyingJobs.LoginLInkedIn;

public class entries extends JFrame {
	public static void main(String[] args) {
		JFrame f = new JFrame();// creating instance of JFrame
		// Load the image file and create an ImageIcon
		ImageIcon icon = new ImageIcon("resources/icon.jpg");
		// Set the image as the window icon
		f.setIconImage(icon.getImage());
		f.setTitle("autoapply.ai");
		f.getContentPane().setBackground(Color.white);

		// Login To LinkedIn Button
		JButton b = new JButton("Apply On LinkedIn");// creating instance of JButton
		b.setBounds(50, 280, 200, 20);

		JLabel l1, l2, l3, l7, l8, l9;
		l1 = new JLabel("Enter linkedin gmail id!!");
		l2 = new JLabel("Enter linkedin password");
		l7 = new JLabel("Enter job title");
		l8 = new JLabel("Enter year of experience");
		l9 = new JLabel("Enter only one location, make sure spelling is correct..");
		l3 = new JLabel("Result!!");
		l1.setBounds(50, 30, 350, 20);
		l2.setBounds(50, 80, 350, 20);
		l7.setBounds(50, 130, 350, 20);
		l8.setBounds(50, 180, 350, 20);
		l9.setBounds(50, 230, 350, 20);
		l3.setBounds(50, 310, 350, 20);
		JLabel l4, l5, l6, l10;
		l4 = new JLabel("Developed By : @JobVacancy2024");
		l4.setBounds(50, 320, 300, 30);
		l5 = new JLabel("All Rights Reserved By @JobVacancy2024");
		l5.setBounds(50, 340, 300, 30);
		l6 = new JLabel("Youtube Channel : @LatestJobVacancy2024");
		l6.setBounds(50, 360, 300, 30);
		l10 = new JLabel("Total Jobs Applied : ");
		l10.setBounds(50, 380, 300, 30);

		JTextField tf1, tf2, tf3, tf4, tf5, tf6, tf7, tf8, tf9, tf10;
		tf1 = new JTextField();
		tf1.setBounds(50, 50, 350, 20);
		tf2 = new JTextField();
		tf2.setBounds(50, 100, 350, 20);
		tf3 = new JTextField();
		tf3.setBounds(50, 150, 350, 20);
		tf4 = new JTextField();
		tf4.setBounds(50, 200, 350, 20);
		tf5 = new JTextField();
		tf5.setBounds(50, 250, 350, 20);
		tf6 = new JTextField();
		tf6.setBounds(500, 50, 350, 20);
		tf7 = new JTextField();
		tf7.setBounds(500, 100, 350, 20);
		tf8 = new JTextField();
		tf8.setBounds(500, 150, 350, 20);
		tf9 = new JTextField();
		tf9.setBounds(500, 200, 350, 20);
		tf10 = new JTextField();
		tf10.setBounds(500, 250, 350, 20);

		JTextArea areaResults = new JTextArea("");
		areaResults.setBounds(100, 310, 200, 20);
		JTextArea totalJobsApplied = new JTextArea("");
		areaResults.setBounds(170, 385, 200, 20);

		f.add(b);
		f.add(areaResults);
		f.add(totalJobsApplied);
		f.add(l4);
		f.add(l5);
		f.add(l6);
		f.add(tf1);
		f.add(tf2);
		f.add(tf3);
		f.add(tf4);
		f.add(tf5);
		f.add(tf6);
		f.add(tf7);
		f.add(tf8);
		f.add(tf9);
		f.add(tf10);
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(l7);
		f.add(l8);
		f.add(l9);
		f.add(l10);
		f.setSize(1000, 500);// 400 width and 500 height
		f.setLayout(null);// using no layout managers
		f.setVisible(true);// making the frame visible
		f.setResizable(true);

		// here we are disabilling all the UI
		tf1.setVisible(true);
		tf2.setVisible(true);
		l1.setVisible(true);
		l2.setVisible(true);
		l3.setVisible(true);
		areaResults.setVisible(true);

		try {
			b.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					// here we are sending data to other class
					LoginLInkedIn li = new LoginLInkedIn();
					// boolean results = cl.onlyVist(l7.getText());
					//boolean results = li.loginLInkedIn();
					/*
					 * System.out.println(results); if (results) { areaResults.setText("Done"); }
					 * else { areaResults.setText("Failed To apply jobs!!"); }
					 */

				}
			});
		} catch (Exception e) {
			// TODO: handle exception
			areaResults.setText(e.toString());
		}
	}
}