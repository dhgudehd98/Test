import java.awt.BorderLayout;
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

public class LogFrame extends JFrame
{	
	public int total=10000;
	
	public LogFrame()
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
        
	    //이름 판넬 
        JPanel name_panel = new JPanel();
        name_panel.setLayout(new FlowLayout(FlowLayout.LEFT));
        
        JLabel n1 = new JLabel("이름:");
        n1.setBorder(BorderFactory.createEmptyBorder(0, 70, 0, 0));
        JLabel name = new JLabel("오형동 ");
        
        name_panel.add(n1);
        name_panel.add(name);
        main_panel.add(name_panel);
        
        
        //은행 판넬 
        JPanel bank_panel = new JPanel();
        bank_panel.setLayout(new FlowLayout(FlowLayout.LEFT));
      
        JLabel b1 = new JLabel("은행명:");
        b1.setBorder(BorderFactory.createEmptyBorder(0, 70, 0, 0));
        JLabel bank = new JLabel("국민은행 ");
        
        bank_panel.add(b1);
        bank_panel.add(bank);
        
        main_panel.add(bank_panel);
        
        //계좌 판넬 
        JPanel account_panel = new JPanel();
        account_panel.setLayout(new FlowLayout(FlowLayout.LEFT));
      
        JLabel a1 = new JLabel("계좌명:");
        a1.setBorder(BorderFactory.createEmptyBorder(0, 70, 0, 0));
        JLabel account = new JLabel("1234-521");
        
        account_panel.add(a1);
        account_panel.add(account);
        
        main_panel.add(account_panel);
        
        //잔액 판넬
        JPanel money_panel = new JPanel();
        money_panel.setLayout(new FlowLayout(FlowLayout.LEFT));
      
        JLabel m1 = new JLabel("잔액:");
        m1.setBorder(BorderFactory.createEmptyBorder(0, 70, 0, 0));
        JLabel money = new JLabel(total +"원");
        
        money_panel.add(m1);
        money_panel.add(money);
        
        main_panel.add(money_panel);
        
        //버튼 판넬
        JPanel but_panel = new JPanel();
        but_panel.setLayout(new GridLayout(2,2));
        
        JButton input = new JButton("입금 ");
        input.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
        
                    Input inputFrame = new Input();
                    inputFrame.setVisible(true);
                    dispose();
                
            }
        });
        JButton output = new JButton("출금 ");
        output.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
        
                    Output outputFrame = new Output();
                    outputFrame.setVisible(true);
                    dispose();
                
            }
        });
        
        but_panel.add(input);
        but_panel.add(output);
        main_panel.add(but_panel);
        
       
        //
        Container ct = getContentPane();
        ct.setLayout(new BorderLayout());
        ct.add(main_panel,BorderLayout.NORTH);

        
   
     
     }
	
}
