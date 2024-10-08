package t22_Swing;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class T3_Image extends JFrame  {
	JPanel pn1, pn2, pn3;
	JButton btnTotal, btn1, btn2, btn3, btn4, btnClose, btnRandom, btnExit;
	JLabel lblImg1, lblImg2, lblImg3, lblImg4, lblCount;
	
	int img1Cnt=0, img2Cnt=0, img3Cnt=0, img4Cnt=0;

	public T3_Image() {
		super("카드 횟수 맞추기");
		setSize(800, 480);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// 윈도우 종료버튼 활성화
		setLocationRelativeTo(null);	// 윈도우창을 가운데 정렬
		setResizable(false);					// 윈도우창 크기 고정
		
		getContentPane().setLayout(null);
		
		pn1 = new JPanel();
		pn1.setBounds(0, 0, 784, 48);
		getContentPane().add(pn1);
		pn1.setLayout(null);
		
		btnTotal = new JButton("모두보기");
		btnTotal.setFont(new Font("굴림", Font.PLAIN, 16));
		btnTotal.setBounds(0, 0, 100, 48);
		pn1.add(btnTotal);
		
		btn1 = new JButton("1번보기");
		btn1.setFont(new Font("굴림", Font.PLAIN, 16));
		btn1.setBounds(100, 0, 100, 48);
		pn1.add(btn1);
		
		btn2 = new JButton("2번보기");
		btn2.setFont(new Font("굴림", Font.PLAIN, 16));
		btn2.setBounds(200, 0, 100, 48);
		pn1.add(btn2);
		
		btn3 = new JButton("3번보기");
		btn3.setFont(new Font("굴림", Font.PLAIN, 16));
		btn3.setBounds(300, 0, 100, 48);
		pn1.add(btn3);
		
		btn4 = new JButton("4번보기");
		btn4.setFont(new Font("굴림", Font.PLAIN, 16));
		btn4.setBounds(400, 0, 100, 48);
		pn1.add(btn4);
		
		btnExit = new JButton("종료");
		btnExit.setFont(new Font("굴림", Font.PLAIN, 16));
		btnExit.setBounds(699, 0, 85, 48);
		pn1.add(btnExit);
		
		btnRandom = new JButton("랜덤보기");
		btnRandom.setFont(new Font("굴림", Font.PLAIN, 16));
		btnRandom.setBounds(500, 0, 100, 48);
		pn1.add(btnRandom);
		
		btnClose = new JButton("모두닫기");
		btnClose.setFont(new Font("굴림", Font.PLAIN, 16));
		btnClose.setBounds(600, 0, 100, 48);
		pn1.add(btnClose);
		
		pn2 = new JPanel();
		pn2.setBounds(0, 49, 784, 344);
		getContentPane().add(pn2);
		pn2.setLayout(null);
		
		lblImg1 = new JLabel("");
		lblImg1.setIcon(new ImageIcon(T3_Image.class.getResource("/t22_Swing/images/11.jpg")));
		lblImg1.setBounds(0, 10, 180, 324);
		pn2.add(lblImg1);
		lblImg1.setVisible(false);
		
		lblImg2 = new JLabel("");
		lblImg2.setIcon(new ImageIcon(T3_Image.class.getResource("/t22_Swing/images/12.jpg")));
		lblImg2.setBounds(186, 10, 195, 324);
		pn2.add(lblImg2);
		lblImg2.setVisible(false);
		
		lblImg3 = new JLabel("");
		lblImg3.setIcon(new ImageIcon(T3_Image.class.getResource("/t22_Swing/images/13.jpg")));
		lblImg3.setBounds(389, 10, 187, 324);
		pn2.add(lblImg3);
		lblImg3.setVisible(false);
		
		lblImg4 = new JLabel("");
		lblImg4.setIcon(new ImageIcon(T3_Image.class.getResource("/t22_Swing/images/14.jpg")));
		lblImg4.setBounds(589, 10, 195, 324);
		pn2.add(lblImg4);
		lblImg4.setVisible(false);
		
		pn3 = new JPanel();
		pn3.setBounds(0, 393, 784, 48);
		getContentPane().add(pn3);
		pn3.setLayout(null);
		
		lblCount = new JLabel("1번 : 0 , 2번 : 0, 3번 : 0, 4번 : 0");
		lblCount.setHorizontalAlignment(SwingConstants.CENTER);
		lblCount.setForeground(Color.RED);
		lblCount.setFont(new Font("굴림", Font.BOLD, 16));
		lblCount.setBounds(23, 10, 732, 28);
		pn3.add(lblCount);
		
		// --------------------- 위쪽은 UI ----------------------------------------
		setVisible(true);
		// --------------------- 아래쪽은 메소드 ----------------------------------------
	
		// 모두보기 버튼
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				allDispaly();
				img1Cnt++; img2Cnt++; img3Cnt++; img4Cnt++;
				dispCount();
			}
		});
		
		// 1번보기
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblImg1.setVisible(true);
				lblImg2.setVisible(false);
				lblImg3.setVisible(false);
				lblImg4.setVisible(false);
				img1Cnt++;
				dispCount();
			}
		});
		
		// 2번보기
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblImg1.setVisible(false);
				lblImg2.setVisible(true);
				lblImg3.setVisible(false);
				lblImg4.setVisible(false);
				img2Cnt++;
				dispCount();
			}
		});
		
		// 3번보기
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblImg1.setVisible(false);
				lblImg2.setVisible(false);
				lblImg3.setVisible(true);
				lblImg4.setVisible(false);
				img3Cnt++;
				dispCount();
			}
		});
		
		// 4번보기
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblImg1.setVisible(false);
				lblImg2.setVisible(false);
				lblImg3.setVisible(false);
				lblImg4.setVisible(true);
				img4Cnt++;
				dispCount();
			}
		});
		
		// 랜덤보기
		btnRandom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int rand = (int) (Math.random()*4) + 1;
				if(rand == 1) {
					lblImg1.setVisible(true);
					lblImg2.setVisible(false);
					lblImg3.setVisible(false);
					lblImg4.setVisible(false);
					img1Cnt++;
				}
				if(rand == 2) {
					lblImg1.setVisible(false);
					lblImg2.setVisible(true);
					lblImg3.setVisible(false);
					lblImg4.setVisible(false);
					img2Cnt++;
				}
				if(rand == 3) {
					lblImg1.setVisible(false);
					lblImg2.setVisible(false);
					lblImg3.setVisible(true);
					lblImg4.setVisible(false);
					img3Cnt++;
				}
				if(rand == 4) {
					lblImg1.setVisible(false);
					lblImg2.setVisible(false);
					lblImg3.setVisible(false);
					lblImg4.setVisible(true);
					img4Cnt++;
				}
				dispCount();
			}
		});
		
		// 모두닫기 버튼
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				allClose();
			}
		});
		
		// 종료 버튼
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
	
	// 카운트 레이블에 표시하기
	protected void dispCount() {
		lblCount.setText("1번 : "+img1Cnt+" , 2번 : "+img2Cnt+", 3번 : "+img3Cnt+", 4번 : "+img4Cnt);
	}

	// 모두 닫기 처리
	protected void allClose() {
		lblImg1.setVisible(false);
		lblImg2.setVisible(false);
		lblImg3.setVisible(false);
		lblImg4.setVisible(false);
	}

	// 모두 보기
	protected void allDispaly() {
		lblImg1.setVisible(true);
		lblImg2.setVisible(true);
		lblImg3.setVisible(true);
		lblImg4.setVisible(true);
	}

	public static void main(String[] args) {
		new T3_Image();
	}
}
