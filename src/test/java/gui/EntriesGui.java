package gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import ApplyingJobs.ApplyOnNaukri;
import ApplyingJobs.LoginLInkedIn;
import java.awt.Toolkit;
import javax.swing.SwingConstants;

public class EntriesGui extends JFrame {

	private JPanel contentPane;
	private JTextField gmail;
	private JTextField password;
	private JTextField jobTitle;
	private JTextField totalyearsOfExperience;
	private JTextField preferedLocationInput;
	private JTextField currentCTCInput;
	private JTextField HowSoonYouCanJoinInput;
	private JTextField countryCodeInput;
	private JTextField mobileNumberInput;
	private JTextField highSchoolPercentageInput;
	private JTextField InterPercentageInput;
	private JTextField noticePeriodInDaysInput;
	private JTextField lastCTCInput;
	private JTextField graduationPercentageInput;
	private JTextField immediatelyAvailableInput;
	private JTextField relocationInput;
	private JTextField comfortableInRemoteInput;
	private JTextField pgPercentageInput;
	private JTextField legallyAuthorizedInput;
	private JTextField expectedCTCInput;
	private JLabel resultLabel;
	private JLabel howMuchJobsAppliedLabel;
	private JLabel lblNewLabel;
	private JLabel resultArea;
	private JLabel totalJobAppliedArea;
	private JTextField gmailForNaukri;
	private JTextField passwordForNaukri;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EntriesGui frame = new EntriesGui();
					frame.setVisible(true);
					// Set the image as the window icon

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public EntriesGui() {
		setResizable(false);
		setIconImage(
				Toolkit.getDefaultToolkit().getImage("F:\\Selenium_Automation\\AutoApply_Bot\\resources\\icon.jpg"));
		setTitle("APPLY SMART");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 963, 667);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(168, 168, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel gmailIdLabel = new JLabel("Gmail ID For LinkedIn*");
		gmailIdLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		gmailIdLabel.setBounds(10, 74, 201, 27);
		contentPane.add(gmailIdLabel);

		JLabel passwordForLinkedIn = new JLabel("Password For LinkedIn*");
		passwordForLinkedIn.setFont(new Font("Tahoma", Font.PLAIN, 15));
		passwordForLinkedIn.setBounds(10, 108, 201, 27);
		contentPane.add(passwordForLinkedIn);

		JLabel jobTitleToApply = new JLabel("Job Title To Apply*");
		jobTitleToApply.setFont(new Font("Tahoma", Font.PLAIN, 15));
		jobTitleToApply.setBounds(10, 143, 201, 27);
		contentPane.add(jobTitleToApply);

		JLabel totalYearsOfExperience = new JLabel("Total Years Of Experience*");
		totalYearsOfExperience.setFont(new Font("Tahoma", Font.PLAIN, 15));
		totalYearsOfExperience.setBounds(10, 177, 201, 27);
		contentPane.add(totalYearsOfExperience);

		JLabel preferedLocation = new JLabel("Enter One Prefered Location*");
		preferedLocation.setFont(new Font("Tahoma", Font.PLAIN, 15));
		preferedLocation.setBounds(10, 211, 201, 27);
		contentPane.add(preferedLocation);

		JLabel currentCTC = new JLabel("Current CTC*");
		currentCTC.setFont(new Font("Tahoma", Font.PLAIN, 15));
		currentCTC.setBounds(10, 245, 201, 27);
		contentPane.add(currentCTC);

		JLabel howSoonYouCanJoin = new JLabel("How soon you can join ? *");
		howSoonYouCanJoin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		howSoonYouCanJoin.setBounds(10, 282, 201, 27);
		contentPane.add(howSoonYouCanJoin);

		JLabel countryCode = new JLabel("Phone Country Code*");
		countryCode.setFont(new Font("Tahoma", Font.PLAIN, 15));
		countryCode.setBounds(10, 316, 201, 27);
		contentPane.add(countryCode);

		JLabel lastCTC = new JLabel("Last CTC*");
		lastCTC.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lastCTC.setBounds(412, 420, 255, 27);
		contentPane.add(lastCTC);

		JLabel graduationPercentage = new JLabel("Gratudation Percentage*");
		graduationPercentage.setFont(new Font("Tahoma", Font.PLAIN, 15));
		graduationPercentage.setBounds(412, 176, 255, 27);
		contentPane.add(graduationPercentage);

		JLabel immediatelyAvailable = new JLabel("Are you immediately available ? yes/no*");
		immediatelyAvailable.setFont(new Font("Tahoma", Font.PLAIN, 15));
		immediatelyAvailable.setBounds(412, 211, 279, 27);
		contentPane.add(immediatelyAvailable);

		JLabel comfortableForRelocation = new JLabel("Are you comfortable for relocation ? yes/no*");
		comfortableForRelocation.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comfortableForRelocation.setBounds(412, 245, 305, 27);
		contentPane.add(comfortableForRelocation);

		JLabel mobileNumber = new JLabel("Mobile Phone Number*");
		mobileNumber.setFont(new Font("Tahoma", Font.PLAIN, 15));
		mobileNumber.setBounds(10, 349, 201, 27);
		contentPane.add(mobileNumber);

		JLabel highSchoolPercentage = new JLabel("10th Percentage*");
		highSchoolPercentage.setFont(new Font("Tahoma", Font.PLAIN, 15));
		highSchoolPercentage.setBounds(10, 383, 201, 27);
		contentPane.add(highSchoolPercentage);

		JLabel interPercentage = new JLabel("12th Percentage*");
		interPercentage.setFont(new Font("Tahoma", Font.PLAIN, 15));
		interPercentage.setBounds(413, 143, 255, 27);
		contentPane.add(interPercentage);

		JLabel noticePeriod = new JLabel("Notice Period In Days*");
		noticePeriod.setFont(new Font("Tahoma", Font.PLAIN, 15));
		noticePeriod.setBounds(10, 420, 179, 27);
		contentPane.add(noticePeriod);

		JLabel remoteWorking = new JLabel("Are you comfortable in remote? yes/no*");
		remoteWorking.setFont(new Font("Tahoma", Font.PLAIN, 15));
		remoteWorking.setBounds(412, 282, 305, 27);
		contentPane.add(remoteWorking);

		JLabel pgPercentage = new JLabel("PG Percentage ?");
		pgPercentage.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pgPercentage.setBounds(412, 319, 305, 27);
		contentPane.add(pgPercentage);

		JLabel legallyAuthorizedToWork = new JLabel("Are you legally authorized to work?  yes/no*");
		legallyAuthorizedToWork.setFont(new Font("Tahoma", Font.PLAIN, 15));
		legallyAuthorizedToWork.setBounds(412, 358, 305, 27);
		contentPane.add(legallyAuthorizedToWork);

		JLabel expectedCTC = new JLabel("Expected CTC*");
		expectedCTC.setFont(new Font("Tahoma", Font.PLAIN, 15));
		expectedCTC.setBounds(412, 392, 305, 27);
		contentPane.add(expectedCTC);

		gmail = new JTextField();
		gmail.setBounds(220, 74, 170, 25);
		contentPane.add(gmail);
		gmail.setColumns(10);

		password = new JPasswordField();
		password.setColumns(10);
		password.setBounds(221, 111, 170, 25);
		contentPane.add(password);

		jobTitle = new JTextField();
		jobTitle.setColumns(10);
		jobTitle.setBounds(221, 146, 170, 25);
		contentPane.add(jobTitle);

		totalyearsOfExperience = new JTextField();
		totalyearsOfExperience.setColumns(10);
		totalyearsOfExperience.setBounds(221, 180, 170, 25);
		contentPane.add(totalyearsOfExperience);

		preferedLocationInput = new JTextField();
		preferedLocationInput.setColumns(10);
		preferedLocationInput.setBounds(221, 214, 170, 25);
		contentPane.add(preferedLocationInput);

		currentCTCInput = new JTextField();
		currentCTCInput.setColumns(10);
		currentCTCInput.setBounds(221, 248, 170, 25);
		contentPane.add(currentCTCInput);

		HowSoonYouCanJoinInput = new JTextField();
		HowSoonYouCanJoinInput.setColumns(10);
		HowSoonYouCanJoinInput.setBounds(221, 283, 170, 25);
		contentPane.add(HowSoonYouCanJoinInput);

		countryCodeInput = new JTextField();
		countryCodeInput.setColumns(10);
		countryCodeInput.setBounds(221, 317, 170, 25);
		contentPane.add(countryCodeInput);

		mobileNumberInput = new JTextField();
		mobileNumberInput.setColumns(10);
		mobileNumberInput.setBounds(221, 351, 170, 25);
		contentPane.add(mobileNumberInput);

		highSchoolPercentageInput = new JTextField();
		highSchoolPercentageInput.setColumns(10);
		highSchoolPercentageInput.setBounds(221, 385, 170, 25);
		contentPane.add(highSchoolPercentageInput);

		InterPercentageInput = new JTextField();
		InterPercentageInput.setColumns(10);
		InterPercentageInput.setBounds(721, 143, 170, 25);
		contentPane.add(InterPercentageInput);

		noticePeriodInDaysInput = new JTextField();
		noticePeriodInDaysInput.setColumns(10);
		noticePeriodInDaysInput.setBounds(220, 423, 170, 25);
		contentPane.add(noticePeriodInDaysInput);

		lastCTCInput = new JTextField();
		lastCTCInput.setColumns(10);
		lastCTCInput.setBounds(721, 422, 170, 25);
		contentPane.add(lastCTCInput);

		graduationPercentageInput = new JTextField();
		graduationPercentageInput.setColumns(10);
		graduationPercentageInput.setBounds(721, 180, 170, 25);
		contentPane.add(graduationPercentageInput);

		immediatelyAvailableInput = new JTextField();
		immediatelyAvailableInput.setColumns(10);
		immediatelyAvailableInput.setBounds(721, 214, 170, 25);
		contentPane.add(immediatelyAvailableInput);

		relocationInput = new JTextField();
		relocationInput.setColumns(10);
		relocationInput.setBounds(721, 248, 170, 25);
		contentPane.add(relocationInput);

		comfortableInRemoteInput = new JTextField();
		comfortableInRemoteInput.setColumns(10);
		comfortableInRemoteInput.setBounds(721, 283, 170, 25);
		contentPane.add(comfortableInRemoteInput);

		pgPercentageInput = new JTextField();
		pgPercentageInput.setColumns(10);
		pgPercentageInput.setBounds(721, 317, 170, 25);
		contentPane.add(pgPercentageInput);

		legallyAuthorizedInput = new JTextField();
		legallyAuthorizedInput.setColumns(10);
		legallyAuthorizedInput.setBounds(721, 351, 170, 25);
		contentPane.add(legallyAuthorizedInput);

		expectedCTCInput = new JTextField();
		expectedCTCInput.setColumns(10);
		expectedCTCInput.setBounds(721, 385, 170, 25);
		contentPane.add(expectedCTCInput);

		resultArea = new JLabel("");
		resultArea.setFont(new Font("Tahoma", Font.BOLD, 20));
		resultArea.setBounds(83, 523, 220, 27);
		contentPane.add(resultArea);

		totalJobAppliedArea = new JLabel("");
		totalJobAppliedArea.setFont(new Font("Tahoma", Font.BOLD, 20));
		totalJobAppliedArea.setBounds(157, 559, 146, 27);
		contentPane.add(totalJobAppliedArea);
		
		JLabel lblHowManyJobs = new JLabel("How many jobs you want to apply? for linkedIn only :  ");
		lblHowManyJobs.setVerticalAlignment(SwingConstants.TOP);
		lblHowManyJobs.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblHowManyJobs.setBounds(10, 457, 437, 27);
		contentPane.add(lblHowManyJobs);

		JButton jobCounts = new JButton("25");
		jobCounts.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		jobCounts.setForeground(new Color(128, 0, 255));
		jobCounts.setFont(new Font("Dialog", Font.PLAIN, 15));
		jobCounts.setBackground(new Color(255, 255, 255));
		jobCounts.setBounds(83, 480, 97, 33);
		contentPane.add(jobCounts);

		JButton btnPlus = new JButton("+25");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int currentCount = Integer.parseInt(jobCounts.getText());
				int finalCount = currentCount;
				if (currentCount < 100) {
					finalCount = finalCount + 25;
				}
				jobCounts.setText(Integer.toString(finalCount));
			}
		});
		btnPlus.setHorizontalAlignment(SwingConstants.LEFT);
		btnPlus.setForeground(new Color(128, 0, 255));
		btnPlus.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnPlus.setBackground(new Color(255, 255, 255));
		btnPlus.setBounds(10, 480, 75, 33);
		contentPane.add(btnPlus);

		JButton btnMinus = new JButton("-25");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int currentCount = Integer.parseInt(jobCounts.getText());
				int finalCount = currentCount;
				if (currentCount > 25) {
					finalCount = finalCount - 25;
				}
				jobCounts.setText(Integer.toString(finalCount));
			}
		});
		btnMinus.setHorizontalAlignment(SwingConstants.LEFT);
		btnMinus.setForeground(new Color(128, 0, 255));
		btnMinus.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnMinus.setBackground(new Color(255, 255, 255));
		btnMinus.setBounds(178, 480, 69, 33);
		contentPane.add(btnMinus);
		

		JButton btnNewButton = new JButton("Apply On LinkedIN");
		btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginLInkedIn li = new LoginLInkedIn();
				li.linkedInGmail = gmail.getText().toString();
				li.linkedInPassword = password.getText().toString();
				li.jobTitle = jobTitle.getText().toString();
				li.totalYearsOfExperience = totalyearsOfExperience.getText().toString();
				li.preferedLocation = preferedLocationInput.getText().toString();
				li.currentCTC = currentCTCInput.getText().toString();
				li.howSoonYouCanJoin = HowSoonYouCanJoinInput.getText().toString();
				li.phoneCountyCode = countryCodeInput.getText().toString();
				li.mobilePhoneNumber = mobileNumberInput.getText().toString();
				li.highSchoolPercentage = highSchoolPercentageInput.getText().toString();
				li.interPercentage = InterPercentageInput.getText().toString();
				li.noticePeriodInDays = noticePeriodInDaysInput.getText().toString();
				li.lastCTC = lastCTCInput.getText().toString();
				li.graduationPergentage = graduationPercentageInput.getText().toString();
				li.immediateAvailable = immediatelyAvailableInput.getText().toString();
				li.comfortableforRelocation = relocationInput.getText().toString();
				li.comfortableInRemoteWork = comfortableInRemoteInput.getText().toString();
				li.pgPercentage = pgPercentageInput.getText().toString();
				li.legallyAuthorized = legallyAuthorizedInput.getText().toString();
				li.expectedCTC = expectedCTCInput.getText().toString();
				li.jobCounts = jobCounts.getText().toString();
				int results = li.loginLInkedIn();
				String resultsString = String.valueOf(results);
				System.out.println(results);
				if (results > 0) {
					resultArea.setText("Done");
					totalJobAppliedArea.setText(resultsString);
				} else {
					resultArea.setText("Failed To apply jobs!!");
				}
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setForeground(new Color(128, 0, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(120, 0, 163, 41);
		contentPane.add(btnNewButton);

		resultLabel = new JLabel("Result : ");
		resultLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		resultLabel.setBounds(10, 523, 75, 27);
		contentPane.add(resultLabel);

		howMuchJobsAppliedLabel = new JLabel("Total Jobs Applied : ");
		howMuchJobsAppliedLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		howMuchJobsAppliedLabel.setBounds(10, 557, 137, 27);
		contentPane.add(howMuchJobsAppliedLabel);

		lblNewLabel = new JLabel("Please fill some common details that required to apply jobs");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBackground(new Color(128, 128, 255));
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBounds(10, 47, 881, 27);
		contentPane.add(lblNewLabel);

		JLabel lblDataSaved = new JLabel("");
		lblDataSaved.setBackground(new Color(255, 255, 255));
		lblDataSaved.setForeground(new Color(255, 255, 255));
		lblDataSaved.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblDataSaved.setBounds(10, 587, 189, 39);
		contentPane.add(lblDataSaved);

		JButton btnSaveDetails = new JButton("Save Details");
		btnSaveDetails.setHorizontalAlignment(SwingConstants.LEFT);
		btnSaveDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File file = new File("details.properties");
				if (file.exists()) {
					file.delete();
				}
				saveData();
				lblDataSaved.setText("Details Saved!");
			}
		});
		btnSaveDetails.setForeground(new Color(128, 0, 255));
		btnSaveDetails.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSaveDetails.setBackground(new Color(255, 255, 255));
		btnSaveDetails.setBounds(0, 0, 121, 41);
		contentPane.add(btnSaveDetails);

		JButton btnStopAutomation = new JButton("Stop Automation");
		btnStopAutomation.setHorizontalAlignment(SwingConstants.LEFT);
		btnStopAutomation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginLInkedIn loginLinkedin = new LoginLInkedIn();
				loginLinkedin.tearDown();
			}
		});
		btnStopAutomation.setForeground(new Color(128, 0, 255));
		btnStopAutomation.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnStopAutomation.setBackground(new Color(255, 255, 255));
		btnStopAutomation.setBounds(468, 0, 156, 41);
		contentPane.add(btnStopAutomation);

		JButton btnApplyOnNaukricom = new JButton("Apply On Naukri.Com");
		btnApplyOnNaukricom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ApplyOnNaukri applyOnNaukri = new ApplyOnNaukri();
				applyOnNaukri.useridNaukri = gmailForNaukri.getText().toString();
				applyOnNaukri.passwordNaukri = passwordForNaukri.getText().toString();
				int results = applyOnNaukri.applyOnNaukri();
				String resultsString = String.valueOf(results);
				System.out.println(results);
				if (results > 0) {
					resultArea.setText("Done");
					totalJobAppliedArea.setText(resultsString);
				} else {
					resultArea.setText("Failed To apply jobs!!");
				}
			}
		});
		btnApplyOnNaukricom.setHorizontalAlignment(SwingConstants.LEFT);
		btnApplyOnNaukricom.setForeground(new Color(128, 0, 255));
		btnApplyOnNaukricom.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnApplyOnNaukricom.setBackground(new Color(255, 255, 255));
		btnApplyOnNaukricom.setBounds(281, 0, 189, 41);
		contentPane.add(btnApplyOnNaukricom);

		JButton btnApplyOnIndeed = new JButton("Apply On Indeed");
		btnApplyOnIndeed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnApplyOnIndeed.setEnabled(false);
		btnApplyOnIndeed.setHorizontalAlignment(SwingConstants.LEFT);
		btnApplyOnIndeed.setForeground(new Color(128, 0, 255));
		btnApplyOnIndeed.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnApplyOnIndeed.setBackground(new Color(255, 255, 255));
		btnApplyOnIndeed.setBounds(625, 0, 156, 41);
		contentPane.add(btnApplyOnIndeed);

		JButton btnApplyOnNaukricom_1_1 = new JButton("Apply On X(Twitter)");
		btnApplyOnNaukricom_1_1.setEnabled(false);
		btnApplyOnNaukricom_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		btnApplyOnNaukricom_1_1.setForeground(new Color(128, 0, 255));
		btnApplyOnNaukricom_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnApplyOnNaukricom_1_1.setBackground(new Color(255, 255, 255));
		btnApplyOnNaukricom_1_1.setBounds(782, 0, 170, 41);
		contentPane.add(btnApplyOnNaukricom_1_1);

		JLabel lblGmailIdForNaukri = new JLabel("Gmail ID For Naukri.Com");
		lblGmailIdForNaukri.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblGmailIdForNaukri.setBounds(413, 73, 255, 27);
		contentPane.add(lblGmailIdForNaukri);

		JLabel lblPasswordfornaukri = new JLabel("Password For Naukri.com");
		lblPasswordfornaukri.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPasswordfornaukri.setBounds(412, 106, 255, 27);
		contentPane.add(lblPasswordfornaukri);

		gmailForNaukri = new JTextField();
		gmailForNaukri.setColumns(10);
		gmailForNaukri.setBounds(721, 73, 170, 25);
		contentPane.add(gmailForNaukri);

		passwordForNaukri = new JPasswordField();
		passwordForNaukri.setColumns(10);
		passwordForNaukri.setBounds(721, 110, 170, 25);
		contentPane.add(passwordForNaukri);

		

	}

	private void saveData() {
		try {
			Properties properties = new Properties();
			// Set properties
			properties.setProperty("gmail", gmail.getText());
			properties.setProperty("password", password.getText());
			properties.setProperty("jobTitle", jobTitle.getText());
			properties.setProperty("totalyearsOfExperience", totalyearsOfExperience.getText());
			properties.setProperty("preferedLocationInput", preferedLocationInput.getText());
			properties.setProperty("currentCTCInput", currentCTCInput.getText());
			properties.setProperty("HowSoonYouCanJoinInput", HowSoonYouCanJoinInput.getText());
			properties.setProperty("countryCodeInput", countryCodeInput.getText());
			properties.setProperty("mobileNumberInput", mobileNumberInput.getText());
			properties.setProperty("highSchoolPercentageInput", highSchoolPercentageInput.getText());
			properties.setProperty("InterPercentageInput", InterPercentageInput.getText());
			properties.setProperty("noticePeriodInDaysInput", noticePeriodInDaysInput.getText());
			properties.setProperty("lastCTCInput", lastCTCInput.getText());
			properties.setProperty("graduationPercentageInput", graduationPercentageInput.getText());
			properties.setProperty("immediatelyAvailableInput", immediatelyAvailableInput.getText());
			properties.setProperty("relocationInput", relocationInput.getText());
			properties.setProperty("comfortableInRemoteInput", comfortableInRemoteInput.getText());
			properties.setProperty("pgPercentageInput", pgPercentageInput.getText());
			properties.setProperty("legallyAuthorizedInput", legallyAuthorizedInput.getText());
			properties.setProperty("expectedCTCInput", expectedCTCInput.getText());
			properties.setProperty("naukriUsername", gmailForNaukri.getText());
			properties.setProperty("naukriPassword", passwordForNaukri.getText());
			// Add other properties similarly

			// Save properties to file
			FileOutputStream fos = new FileOutputStream("details.properties");
			properties.store(fos, "Application Configuration");
			fos.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	public void loadData() {
		try {
			Properties properties = new Properties();
			FileInputStream fis = new FileInputStream("details.properties");
			properties.load(fis);
			fis.close();

			// Load properties and set to labels and input fields
			gmail.setText(properties.getProperty("gmail", ""));
			password.setText(properties.getProperty("password", ""));
			jobTitle.setText(properties.getProperty("jobTitle", ""));
			totalyearsOfExperience.setText(properties.getProperty("totalyearsOfExperience", ""));
			preferedLocationInput.setText(properties.getProperty("preferedLocationInput", ""));
			currentCTCInput.setText(properties.getProperty("currentCTCInput", ""));
			HowSoonYouCanJoinInput.setText(properties.getProperty("HowSoonYouCanJoinInput", ""));
			countryCodeInput.setText(properties.getProperty("countryCodeInput", ""));
			mobileNumberInput.setText(properties.getProperty("mobileNumberInput", ""));
			highSchoolPercentageInput.setText(properties.getProperty("highSchoolPercentageInput", ""));
			InterPercentageInput.setText(properties.getProperty("InterPercentageInput", ""));
			noticePeriodInDaysInput.setText(properties.getProperty("noticePeriodInDaysInput", ""));
			lastCTCInput.setText(properties.getProperty("lastCTCInput", ""));
			graduationPercentageInput.setText(properties.getProperty("graduationPercentageInput", ""));
			immediatelyAvailableInput.setText(properties.getProperty("immediatelyAvailableInput", ""));
			relocationInput.setText(properties.getProperty("relocationInput", ""));
			comfortableInRemoteInput.setText(properties.getProperty("comfortableInRemoteInput", ""));
			pgPercentageInput.setText(properties.getProperty("pgPercentageInput", ""));
			legallyAuthorizedInput.setText(properties.getProperty("legallyAuthorizedInput", ""));
			expectedCTCInput.setText(properties.getProperty("expectedCTCInput", ""));
			gmailForNaukri.setText(properties.getProperty("naukriUsername"));
			passwordForNaukri.setText(properties.getProperty("naukriPassword"));
			// Set other properties similarly

		} catch (IOException ex) {
			// File doesn't exist or unable to load data
			// You can handle this case as per your requirement
			ex.printStackTrace();
		}
	}
}
