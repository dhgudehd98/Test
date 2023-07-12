import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainFrame extends JFrame{

	
	public MainFrame() {
		
		String ID = "ohd";
		String pw = "1234";
		
	    setTitle("오형동ATM");
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setVisible(true);
	    setSize(300, 300);

	    // 메인 화면 판넬
	    JPanel main_panel = new JPanel();
	    main_panel.setLayout(new GridLayout(4, 1)); // 3행 1열의 그리드 레이아웃

	    JLabel title = new JLabel("오형동 ATM 기기 ");
	    main_panel.add(title);
	    title.setBorder(BorderFactory.createEmptyBorder(0, 110, 0, 0));

	    // 아이디 입력 판넬
	    JPanel id_panel = new JPanel();
	    id_panel.setLayout(new FlowLayout(FlowLayout.LEFT));
	    JLabel id = new JLabel("이름 ");
	    JTextField id_area = new JTextField(10);
	    id_area.setBackground(Color.white);
	    id_panel.add(id);
	    id_panel.add(id_area);
	    main_panel.add(id_panel);
	    
	    
	    
	    
	    // 비밀번호 입력 판넬
	    JPanel password_panel = new JPanel();
	    password_panel.setLayout(new FlowLayout(FlowLayout.LEFT));
	    JLabel password = new JLabel("비밀번호 ");
	    JTextField password_area = new JTextField(10);
	    password_area.setBackground(Color.white);
	    password_panel.add(password);
	    password_panel.add(password_area);
	    main_panel.add(password_panel);
	    
	    
       
	    
	    JButton jb = new JButton("로그인 ");
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id1 = id_area.getText(); // 아이디 입력 값 가져오기
                String pw1 = password_area.getText(); // 비밀번호 입력 값 가져오기

                // 로그인 처리 코드 작성
                if (id1.equals(ID) && pw1.equals(pw)) {
                    // 로그인 성공
                    JOptionPane.showMessageDialog(null, "로그인 성공!");
                    LogFrame logFrame = new LogFrame();
                    logFrame.setVisible(true);
                    dispose();
                } else {
                    // 로그인 실패
                    JOptionPane.showMessageDialog(null, "로그인 실패!");
                }
            }
        });
	   main_panel.add(jb,BorderLayout.SOUTH);
	   

	    Container ct = getContentPane();
	    ct.setLayout(new BorderLayout());
	    ct.add(main_panel, BorderLayout.NORTH);
	    
	    
	    
	    
	}

	public static void main(String[] args)
	{
		new MainFrame();
		
	}
}
