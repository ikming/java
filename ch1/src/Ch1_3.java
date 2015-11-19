import javax.swing.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class Ch1_3 extends Applet implements ActionListener
{
	int x,y;
	double a;int flag;
	Button bn2=new Button("Çå³ý");
	JComboBox list=new JComboBox();
	public void init()
	{
		add(list);
		list.addItem("Çå³ý");
		list.addItem("ÓàÏÒÇúÏß");
		list.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		flag=list.getSelectedIndex();
		Graphics g=getGraphics();
		for(x=0;x<=750;x+=1)
		{
			g.drawString("¡¤",x,200);
			if(x<=385) g.drawString("¡¤",360,x);
		}
		g.drawString("Y",330,20);
		for(x=360;x<=370;x+=1)
		{
			g.drawString("¡¤",x-10,375-x);
			g.drawString("¡¤",x,x-355);
		}
		g.drawString("X",735,230);
		for(x=740;x<=750;x+=1)
		{
			g.drawString("¡¤",x,x-550);
			g.drawString("¡¤",x,950-x);
		}

		if(flag==1)
		{
			for(x=0;x<=720;x+=1)
			{
				a=Math.cos(x*Math. PI/180+Math.PI);
				y=(int)(200+80*a);
				g.drawString("¡¤",x,y);
			}
		}
		if(flag==0)
			repaint();
	}
}
