import java.awt.geom.Ellipse2D;
import java.applet.Applet;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Ch1_4_2 extends Applet //��ʵ��Ϊ��
{
	private Color clr[]={Color.blue,Color.black,Color.red,Color.yellow,Color.green};
//	private int r=20,x=120,y=80,d=40,j=141,k=109;//�����޸�
	private int r=20,x=120,y=80,d=40,j=138,k=111;//�����޸�

	public void paint(Graphics g)
	{ 
		//BasicStroke a=new BasicStroke(3.0f, BasicStroke.CAP_BUTT,BasicStroke.JOIN_BEVEL);
		BasicStroke a=new BasicStroke(3.0f);
		((Graphics2D)g).setStroke(a);


		g.setColor(clr[0]);//��һ��Բ
		//g.drawOval(x-r,y-r,d,d);
		Ellipse2D ellipse=new Ellipse2D.Double(x-r,y-r,d,d);
		((Graphics2D)g).draw(ellipse);
		//((Graphics2D)g).fill(ellipse);

		((Graphics2D)g).setColor(clr[1]);
//		((Graphics2D)g).drawOval((x+42)-r,y-r,d,d);
		((Graphics2D)g).drawOval((x+36)-r,y-r,d,d);

		g.setColor(clr[2]);
//		((Graphics2D)g).drawOval((x+84)-r,y-r,d,d);
		((Graphics2D)g).drawOval((x+72)-r,y-r,d,d);

		g.setColor(clr[3]);
		((Graphics2D)g).drawOval(j-r,k-r,d,d);

		g.setColor(clr[4]);//�����Բ
//		g.drawOval((j+42)-r,k-r,d,d);
		g.drawOval((j+36)-r,k-r,d,d);
		
	
	}//END PAINT

}//END CLASS


