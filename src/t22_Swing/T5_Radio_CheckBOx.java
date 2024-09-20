package t22_Swing;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class T5_Radio_CheckBOx extends JFrame {
	private final ButtonGroup buttonGroup = new ButtonGroup();
	JPanel pn1, pn2, pn3;
	JLabel lblTitle, lblGender, lblHobby, lblMessage;
	JRadioButton rdMale, rdFemale;
	JCheckBox ckHobby1, ckHobby2, ckHobby3, ckHobby4;
	JButton btnGender, btnHobby, btnExit;

	
	public T5_Radio_CheckBOx() {
		setTitle("텍스트박스 연습");
		setSize(600, 480);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		getContentPane().setLayout(null);
		
		pn1 = new JPanel();
		pn1.setBounds(0, 0, 584, 60);
		getContentPane().add(pn1);
		pn1.setLayout(null);
		
		lblTitle = new JLabel("라디오버튼/체크박스 연습");
		lblTitle.setFont(new Font("굴림", Font.BOLD, 22));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(0, 0, 584, 60);
		pn1.add(lblTitle);
		
		pn2 = new JPanel();
		pn2.setBounds(0, 62, 584, 316);
		getContentPane().add(pn2);
		pn2.setLayout(null);
		
		lblGender = new JLabel("성  별");
		lblGender.setHorizontalAlignment(SwingConstants.CENTER);
		lblGender.setFont(new Font("굴림", Font.BOLD, 20));
		lblGender.setBounds(66, 65, 92, 24);
		pn2.add(lblGender);
		
		lblHobby = new JLabel("취  미");
		lblHobby.setHorizontalAlignment(SwingConstants.CENTER);
		lblHobby.setFont(new Font("굴림", Font.BOLD, 20));
		lblHobby.setBounds(66, 167, 92, 24);
		pn2.add(lblHobby);
		
		rdMale = new JRadioButton("남  자");
		buttonGroup.add(rdMale);
		rdMale.setFont(new Font("굴림", Font.BOLD, 18));
		rdMale.setBounds(196, 65, 92, 29);
		pn2.add(rdMale);
		
		rdFemale = new JRadioButton("여  자");
		buttonGroup.add(rdFemale);
		rdFemale.setFont(new Font("굴림", Font.BOLD, 18));
		rdFemale.setBounds(328, 65, 92, 29);
		pn2.add(rdFemale);
		
		ckHobby1 = new JCheckBox("등산");
		ckHobby1.setFont(new Font("굴림", Font.BOLD, 18));
		ckHobby1.setBounds(173, 167, 77, 23);
		pn2.add(ckHobby1);
		
		ckHobby2 = new JCheckBox("낚시");
		ckHobby2.setFont(new Font("굴림", Font.BOLD, 18));
		ckHobby2.setBounds(265, 167, 77, 23);
		pn2.add(ckHobby2);
		
		ckHobby3 = new JCheckBox("수영");
		ckHobby3.setFont(new Font("굴림", Font.BOLD, 18));
		ckHobby3.setBounds(375, 167, 77, 23);
		pn2.add(ckHobby3);
		
		ckHobby4 = new JCheckBox("바둑");
		ckHobby4.setFont(new Font("굴림", Font.BOLD, 18));
		ckHobby4.setBounds(485, 167, 77, 23);
		pn2.add(ckHobby4);
		
		lblMessage = new JLabel("메세지 출력");
		lblMessage.setFont(new Font("굴림", Font.BOLD, 18));
		lblMessage.setHorizontalAlignment(SwingConstants.CENTER);
		lblMessage.setBounds(37, 233, 512, 55);
		pn2.add(lblMessage);
		
		pn3 = new JPanel();
		pn3.setBounds(0, 381, 584, 60);
		getContentPane().add(pn3);
		pn3.setLayout(null);
		
		btnGender = new JButton("성별출력");
		btnGender.setFont(new Font("굴림", Font.BOLD, 16));
		btnGender.setBounds(31, 11, 153, 36);
		pn3.add(btnGender);
		
		btnHobby = new JButton("취미출력");
		btnHobby.setFont(new Font("굴림", Font.BOLD, 16));
		btnHobby.setBounds(215, 11, 153, 36);
		pn3.add(btnHobby);
		
		btnExit = new JButton("작업종료");
		btnExit.setFont(new Font("굴림", Font.BOLD, 16));
		btnExit.setBounds(399, 11, 153, 36);
		pn3.add(btnExit);
		
		// =================================================
		setVisible(true);
		// =================================================
		
		// 성별버튼 클릭
		btnGender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String gender = "선택하신 성별은? ";
				if(rdMale.isSelected()) gender += rdMale.getText();
				else gender += rdFemale.getText();
				
				lblMessage.setText(gender);
			}
		});
		
		// 취미버튼 클릭
		btnHobby.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String hobby = "";
				if(ckHobby1.isSelected()) hobby += ckHobby1.getText() + "/";
				if(ckHobby2.isSelected()) hobby += ckHobby2.getText() + "/";
				if(ckHobby3.isSelected()) hobby += ckHobby3.getText() + "/";
				if(ckHobby4.isSelected()) hobby += ckHobby4.getText() + "/";
				
				hobby = hobby.substring(0, hobby.length()-1);
				
				lblMessage.setText("선택하신 취미는? " + hobby);
			}
		});
		
		// 작업 종료버튼 클릭
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
	
	public static void main(String[] args) {
		new T5_Radio_CheckBOx();
	}
}
