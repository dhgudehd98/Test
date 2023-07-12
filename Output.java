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

public class Output extends JFrame 
{	
	int money= 10000;
	int input;
	
	public  Output()
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
        
	    //출금 판넬
	    JPanel op_panel = new JPanel();
	    op_panel.setLayout(new FlowLayout(FlowLayout.LEFT));
	    JLabel op_Label = new JLabel("출금 금액 : " );
	    JTextField op_area = new JTextField(10);
	    op_area.setBackground(Color.white);
	    op_panel.add(op_Label);
	    op_panel.add(op_area);
	    main_panel.add(op_panel);
	    
	    //버튼 판넬
	    JPanel bt_panel = new JPanel();
	    bt_panel.setLayout(new FlowLayout(FlowLayout.LEFT));
	    JButton output_but = new JButton("출금하기");
	    JButton cancel_but = new JButton("취소하기");
	    output_but.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id1 = op_area.getText(); //  입력 값 가져오기
                int outputAmount = Integer.parseInt(id1);
                if(outputAmount > money)
                {
                	JOptionPane.showMessageDialog(null, "잔액이 부족합니다. ");
                }
                else
                {
                	money -= outputAmount;// 비밀번호 입력 값 가져오기
                    JOptionPane.showMessageDialog(null, "출금완료, 현재 잔액 : " + money);
                }
                

                
            }
        });
	    cancel_but.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e)
	    	{
	    		 JOptionPane.showMessageDialog(null, "입금취소 ");
                 LogFrame logFrame = new LogFrame();
                 logFrame.setVisible(true);
                 dispose();
	    	}
	    	
	    });
	    
	    bt_panel.add(output_but);
	    bt_panel.add(cancel_but);
	    
	    main_panel.add(bt_panel);
	    
	    
        //
        Container ct = getContentPane();
        ct.setLayout(new BorderLayout());
        ct.add(main_panel,BorderLayout.NORTH);
        
        
       
	}
	 
	
}
