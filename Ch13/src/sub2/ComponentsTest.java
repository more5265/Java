package sub2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JToolBar;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;

public class ComponentsTest {

	private JFrame frame;
	private JTextField textUid;
	private JTextField textName;
	private JTextField textHp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComponentsTest window = new ComponentsTest();
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
	public ComponentsTest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 610, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Component Test");
		lblNewLabel.setFont(new Font("돋움", Font.BOLD, 18));
		lblNewLabel.setBounds(12, 10, 186, 51);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btn1 = new JButton("확인1");
		btn1.setFont(new Font("돋움", Font.BOLD, 20));
		
		
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼1 클릭...");
}
		});
		btn1.setBounds(22, 65, 127, 23);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("확인2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "버튼2 클릭...");
			}
		});
		btn2.setFont(new Font("돋움", Font.BOLD, 20));
		btn2.setBounds(178, 65, 127, 23);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("확인3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		int answer = JOptionPane.showConfirmDialog(null, "버튼3 클릭...", "확인대화상자", JOptionPane.YES_NO_OPTION);
			
		if(answer == 0) {
			System.out.println("YES 클릭...");
			}else {
				System.out.println("NO 클릭...");
			}			
			}
		});
		
		btn3.setFont(new Font("돋움", Font.BOLD, 20));
		btn3.setBounds(333, 65, 127, 23);
		frame.getContentPane().add(btn3);
		
		JLabel lblNewLabel_1 = new JLabel("TextField 실습");
		lblNewLabel_1.setFont(new Font("돋움", Font.BOLD, 15));
		lblNewLabel_1.setBounds(12, 140, 114, 28);
		frame.getContentPane().add(lblNewLabel_1);
		
		textUid = new JTextField();
		textUid.setBounds(102, 195, 156, 28);
		frame.getContentPane().add(textUid);
		textUid.setColumns(10);
		
		JLabel lbUid = new JLabel("결과:");
		lbUid.setBounds(376, 201, 186, 15);
		frame.getContentPane().add(lbUid);
		
		JLabel lblName = new JLabel("결과:");
		lblName.setBounds(376, 251, 186, 15);
		frame.getContentPane().add(lblName);
		
		JLabel lbHp = new JLabel("결과:");
		lbHp.setBounds(376, 296, 186, 15);
		frame.getContentPane().add(lbHp);
		
		JLabel lblNewLabel_2 = new JLabel("아이디");
		lblNewLabel_2.setFont(new Font("돋움", Font.PLAIN, 17));
		lblNewLabel_2.setBounds(22, 201, 68, 22);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("이름");
		lblNewLabel_2_1.setFont(new Font("돋움", Font.PLAIN, 17));
		lblNewLabel_2_1.setBounds(22, 251, 50, 15);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("휴대폰");
		lblNewLabel_2_2.setFont(new Font("돋움", Font.PLAIN, 17));
		lblNewLabel_2_2.setBounds(22, 295, 50, 15);
		frame.getContentPane().add(lblNewLabel_2_2);
		
		JButton btnUid = new JButton("확인");
		btnUid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 String uid = textUid.getText();
				 
				 lbUid.setText("결과 : " +uid);
				
			}
		});
		btnUid.setBounds(270, 197, 91, 23);
		frame.getContentPane().add(btnUid);
		
		JButton btnName = new JButton("확인");
		btnName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String name = textName.getText();
				
				lblName.setText("결과 : "+name);
			}
		});
		btnName.setBounds(270, 247, 91, 23);
		frame.getContentPane().add(btnName);
		
		JButton btnHp = new JButton("확인");
		btnHp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String hp = textHp.getText();
				
				lbHp.setText("결과 : "+hp);
			}
		});
		btnHp.setBounds(270, 292, 91, 23);
		frame.getContentPane().add(btnHp);
		

		
		textName = new JTextField();
		textName.setColumns(10);
		textName.setBounds(102, 245, 156, 28);
		frame.getContentPane().add(textName);
		
		textHp = new JTextField();
		textHp.setColumns(10);
		textHp.setBounds(102, 290, 156, 28);
		frame.getContentPane().add(textHp);
		
		JCheckBox chk1 = new JCheckBox("사과");
		chk1.setFont(new Font("굴림", Font.BOLD, 14));
		chk1.setBounds(22, 355, 68, 23);
		frame.getContentPane().add(chk1);
		
		JCheckBox chk2 = new JCheckBox("딸기");
		chk2.setFont(new Font("굴림", Font.BOLD, 14));
		chk2.setBounds(102, 355, 68, 23);
		frame.getContentPane().add(chk2);
		
		JCheckBox chk3 = new JCheckBox("포도");
		chk3.setFont(new Font("굴림", Font.BOLD, 14));
		chk3.setBounds(178, 355, 68, 23);
		frame.getContentPane().add(chk3);
		
		JCheckBox chk4 = new JCheckBox("수박");
		chk4.setFont(new Font("굴림", Font.BOLD, 14));
		chk4.setBounds(250, 355, 68, 23);
		frame.getContentPane().add(chk4);
		
		JCheckBox chk5 = new JCheckBox("참외");
		chk5.setFont(new Font("굴림", Font.BOLD, 14));
		chk5.setBounds(322, 355, 68, 23);
		frame.getContentPane().add(chk5);
		
		JLabel lbChkFruit = new JLabel("선택한 과일 :");
		lbChkFruit.setFont(new Font("굴림", Font.BOLD, 16));
		lbChkFruit.setBounds(22, 395, 339, 28);
		frame.getContentPane().add(lbChkFruit);
		
		JButton btnChkFruit = new JButton("확인");
		btnChkFruit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				List<String> fruits = new ArrayList<>();
				
				if(chk1.isSelected()) {
					
					fruits.add(chk1.getText());
				}

				if(chk2.isSelected()) {
					
					fruits.add(chk2.getText());
				}
				
				if(chk3.isSelected()) {
					
					fruits.add(chk3.getText());
				}
				
				if(chk4.isSelected()) {
					
					fruits.add(chk4.getText());
				}
				
				if(chk5.isSelected()) {
					
					fruits.add(chk5.getText());
				}
				lbChkFruit.setText("선택한 과일 : "+fruits);
				
				
			}
		});
		btnChkFruit.setBounds(398, 350, 82, 33);
		frame.getContentPane().add(btnChkFruit);
		
		JLabel lblNewLabel_3 = new JLabel("RadioButton 실습");
		lblNewLabel_3.setFont(new Font("굴림", Font.BOLD, 15));
		lblNewLabel_3.setBounds(23, 451, 136, 33);
		frame.getContentPane().add(lblNewLabel_3);
		
		JRadioButton rdMale = new JRadioButton("남자");
		rdMale.setFont(new Font("굴림", Font.BOLD, 12));
		rdMale.setBounds(17, 490, 55, 23);
		frame.getContentPane().add(rdMale);
		
		JRadioButton rdFemale = new JRadioButton("여자");
		rdFemale.setFont(new Font("굴림", Font.BOLD, 12));
		rdFemale.setBounds(93, 490, 55, 23);
		frame.getContentPane().add(rdFemale);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rdMale);
		bg.add(rdFemale);
		
		
		JLabel lbGender = new JLabel("선택결과 : ");
		lbGender.setFont(new Font("굴림", Font.BOLD, 16));
		lbGender.setBounds(22, 519, 224, 34);
		frame.getContentPane().add(lbGender);
		
		JButton btnGender = new JButton("확인");
		btnGender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(rdMale.isSelected()) {
					lbGender.setText("선택결과 : " + rdMale.getText());
				}else {
					lbGender.setText("선택결과 : " + rdFemale.getText());
				}
				
			}
		});
		btnGender.setBounds(167, 490, 82, 23);
		frame.getContentPane().add(btnGender);
		

	
		

	}
}
