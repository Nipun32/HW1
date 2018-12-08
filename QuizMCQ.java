import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;


public class QuizMCQ extends JFrame {
	
	private JLabel q1,q2,q3,q4,q5;
	private JButton ok;
	private JRadioButton a1,a2,a3,a4,b1,b2,b3,b4,c1,c2,c3,c4,d1,d2,d3,d4,e1,e2,e3,e4;
	private JPanel pnl1,pnl2,pnl3,pnl4,pnl5,pnlchoices1,pnlchoices2,pnlchoices3,pnlchoices4,pnlchoices5;
	private ButtonGroup grp1,grp2,grp3,grp4,grp5;
	private int score=0;
	
	
	public QuizMCQ ()
	{
		super("Quiz");
		Container container = getContentPane();
		container.setLayout(new GridLayout(11,1));
		
		pnl1 = new JPanel();
		pnl1.setLayout(new GridLayout(1,1));
		q1 = new JLabel(" 1. Who killed Bahubali?");
		pnl1.add(q1);
		
		pnlchoices1 = new JPanel();
		pnlchoices1.setLayout(new GridLayout(4,1));		
		a1 = new JRadioButton(" Bahubali's Son");
		a2 = new JRadioButton(" Kattappa");
		a3 = new JRadioButton(" Shivgami");
		a4 = new JRadioButton(" Bhallaldev");
		pnlchoices1.add(a1);
		pnlchoices1.add(a2);
		pnlchoices1.add(a3);
		pnlchoices1.add(a4);
		
		container.add(pnl1);
		container.add(pnlchoices1);
		
		pnl2 = new JPanel();
		pnl2.setLayout(new GridLayout(1,1));
		q2 = new JLabel(" 2. What is king of Bollywood	?");
		pnl2.add(q2);
		
		pnlchoices2 = new JPanel();
		pnlchoices2.setLayout(new GridLayout(4,1));		
		b1 = new JRadioButton(" Rakesh Roshan");
		b2 = new JRadioButton(" Hritik Roshan");
		b3 = new JRadioButton(" Salman Khan");
		b4 = new JRadioButton(" Shahrukh Khan");
		pnlchoices2.add(b1);
		pnlchoices2.add(b2);
		pnlchoices2.add(b3);
		pnlchoices2.add(b4);
		
		container.add(pnl2);
		container.add(pnlchoices2);
		
		pnl3 = new JPanel();
		pnl3.setLayout(new GridLayout(1,1));
		q3 = new JLabel(" 3. How many days are there in 3 weeks?");
		pnl3.add(q3);
		
		pnlchoices3 = new JPanel();
		pnlchoices3.setLayout(new GridLayout(4,1));		
		c1 = new JRadioButton(" 10");
		c2 = new JRadioButton(" 17");
		c3 = new JRadioButton(" 21");
		c4 = new JRadioButton(" 25");
		pnlchoices3.add(c1);
		pnlchoices3.add(c2);
		pnlchoices3.add(c3);
		pnlchoices3.add(c4);
		
		container.add(pnl3);
		container.add(pnlchoices3);
		
		pnl4 = new JPanel();
		pnl4.setLayout(new GridLayout(1,1));
		q4 = new JLabel(" 4. Which one is an adjective?");
		pnl4.add(q4);
		
		pnlchoices4 = new JPanel();
		pnlchoices4.setLayout(new GridLayout(4,1));		
		d1 = new JRadioButton(" Dog");
		d2 = new JRadioButton(" Brown");
		d3 = new JRadioButton(" Jump");
		d4 = new JRadioButton(" Bark");
		pnlchoices4.add(d1);
		pnlchoices4.add(d2);
		pnlchoices4.add(d3);
		pnlchoices4.add(d4);
		
		container.add(pnl4);
		container.add(pnlchoices4);
		
		pnl5 = new JPanel();
		pnl5.setLayout(new GridLayout(1,1));
		q5 = new JLabel(" 5. Where is MSK?");
		pnl5.add(q5);
		
		pnlchoices5 = new JPanel();
		pnlchoices5.setLayout(new GridLayout(4,1));		
		e1 = new JRadioButton(" Vlogger");
		e2 = new JRadioButton(" Army");
		e3 = new JRadioButton(" Musician");
		e4 = new JRadioButton(" Engineer");
		pnlchoices5.add(e1);
		pnlchoices5.add(e2);
		pnlchoices5.add(e3);
		pnlchoices5.add(e4);
		
		container.add(pnl5);
		container.add(pnlchoices5);
		
		ok = new JButton("Submit");
		ok.setBackground(Color.white);
		container.add(ok);
		setSize(100,500);
		setVisible(true);
		
		RadioButtonHandler handler = new RadioButtonHandler();
		a1.addItemListener(handler);
		a2.addItemListener(handler);
		a3.addItemListener(handler);
		a4.addItemListener(handler);
		
		
		b1.addItemListener(handler);
		b2.addItemListener(handler);
		b3.addItemListener(handler);
		b4.addItemListener(handler);
		
		
		c1.addItemListener(handler);
		c2.addItemListener(handler);
		c3.addItemListener(handler);
		c4.addItemListener(handler);
		
		
		d1.addItemListener(handler);
		d2.addItemListener(handler);
		d3.addItemListener(handler);
		d4.addItemListener(handler);

	
		e1.addItemListener(handler);
		e2.addItemListener(handler);
		e3.addItemListener(handler);
		e4.addItemListener(handler);
		
		grp1 = new ButtonGroup();
		grp1.add(a1);
		grp1.add(a2);
		grp1.add(a3);
		grp1.add(a4);
		
		grp2 = new ButtonGroup();
		grp2.add(b1);
		grp2.add(b2);
		grp2.add(b3);
		grp2.add(b4);
		
		grp3 = new ButtonGroup();
		grp3.add(c1);
		grp3.add(c2);
		grp3.add(c3);
		grp3.add(c4);
		
		grp4 = new ButtonGroup();
		grp4.add(d1);
		grp4.add(d2);
		grp4.add(d3);
		grp4.add(d4);
		
		grp5 = new ButtonGroup();
		grp5.add(e1);
		grp5.add(e2);
		grp5.add(e3);
		grp5.add(e4);
		
		ButtonHandler btnHandler = new ButtonHandler();
		ok.addActionListener(btnHandler);
	}
	
		public static void main(String[]args)
	{
		QuizMCQ application = new QuizMCQ();
		application.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public class RadioButtonHandler implements ItemListener {
		public void itemStateChanged(ItemEvent event)
		{
			if (event.getSource()==a1)
				score++;
			else if (event.getSource()==b4)
				score++;
			else if (event.getSource()==c3)
				score++;
			else if (event.getSource()==d2)
				score++;
			else if (event.getSource()==e1)
				score++;
				
		}
	}
	private class ButtonHandler implements ActionListener{
      public void actionPerformed(ActionEvent event){
         
         if (event.getSource()==ok)
         {
         	JOptionPane.showMessageDialog(null,"Your score is: " +score,"",JOptionPane.INFORMATION_MESSAGE);
         	dispose();
         }

      }

   }

}