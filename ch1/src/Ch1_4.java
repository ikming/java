import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
public class Ch1_4 extends Applet //��ʵ��Ϊ��
{
	private Color clr[]={Color.blue,Color.black,Color.red,Color.yellow,Color.green};
	private int r=20,x=120,y=80,d=40,j=138,k=111;//�����޸�

	public void paint(Graphics g)
	{ 
		Font font = new Font("����",Font.PLAIN,20);//�������壬��С
		g.setFont(font);
		g.setColor(clr[0]);//��һ��Բ
		g.drawOval(x-r,y-r,d,d);

		g.setColor(clr[1]);
		g.drawOval((x+36)-r,y-r,d,d);
	

		g.setColor(clr[2]);
		g.drawOval((x+72)-r,y-r,d,d);

		g.setColor(clr[3]);
		g.drawOval(j-r,k-r,d,d);

		g.setColor(clr[4]);//�����Բ
		g.drawOval((j+36)-r,k-r,d,d);

		g.setColor(Color.blue);
		g.setFont(font);

		g.drawString("�����廷��",120,169);
	}//END PAINT

}//END CLASS


