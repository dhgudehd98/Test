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

public class Input extends JFrame 
{	
	
	private int money = 10000;

    
	int input;
	
	public  Input()
	{
		setTitle("오형동ATM");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(300, 400);
        
        JPanel main_panel = new JPanel();
	    main_panel.setLayout(new GridLayout(6, 1)); // 3행 1열의 그리드 레이아웃

	    JLabel title = new JLabel("오형동 ATM 기기 ");
	    main_panel.add(title);
	    title.setBorder(BorderFactory.createEmptyBorder(0, 110, 0, 0));
        
	    //입금 판넬
	    JPanel ip_panel = new JPanel();
	    ip_panel.setLayout(new FlowLayout(FlowLayout.LEFT));
	    JLabel ip_Label = new JLabel("입금 금액 : " );
	    JTextField ip_area = new JTextField(10);
	    ip_area.setBackground(Color.white);
	    ip_panel.add(ip_Label);
	    ip_panel.add(ip_area);
	    main_panel.add(ip_panel);
	    
	    //버튼 판넬
	    JPanel bt_panel = new JPanel();
	    bt_panel.setLayout(new FlowLayout(FlowLayout.LEFT));
	    JButton input_but = new JButton("입금하기");
	    JButton cancel_but = new JButton("취소하기");
	    input_but.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id1 = ip_area.getText(); // 아이디 입력 값 가져오기
                int inputAmount = Integer.parseInt(id1);
                money += inputAmount;// 비밀번호 입력 값 가져오기
                JOptionPane.showMessageDialog(null, "입금완료, 현재 잔액 : " + money);

                
            }
        });
	    cancel_but.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e)
	    	{
	    		 JOptionPane.showMessageDialog(null, "입금취소");
                 LogFrame logFrame = new LogFrame();
                 logFrame.setVisible(true);
                 dispose();
	    	}
	    	
	    });
	    
	    bt_panel.add(input_but);
	    bt_panel.add(cancel_but);
	    
	    main_panel.add(bt_panel);
	    
	    
        //
        Container ct = getContentPane();
        ct.setLayout(new BorderLayout());
        ct.add(main_panel,BorderLayout.NORTH);
        
        
       
	}
	 
	
}