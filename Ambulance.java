
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;

public class Ambulance extends Frame
{
     public void paint(Graphics g)
    {
        Graphics2D g2d = (Graphics2D) g;
        BasicStroke bs = new BasicStroke(3.0f);
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
        RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setStroke(bs);
        g2d.setFont(new Font("Arial", Font.TYPE1_FONT,10));
                
         GeneralPath a = new GeneralPath();
         a.moveTo(157, 76);
         a.curveTo(146.2, 77.4, 131.2, 81.2, 116.4, 114.1);
         a.curveTo(112.8, 115.8, 96, 176, 88.6, 195);
         a.curveTo(43.5, 204.5, 37, 222, 34, 237);
         a.lineTo(44, 239);
         a.lineTo(36.5, 275);
         a.lineTo(24, 273);
         a.lineTo(30.5, 237);
         a.lineTo(34, 237);
         a.moveTo(26.1, 274.2);
         a.curveTo(21.5, 286.1, 21.5, 308.2, 21.4, 308.9);
         a.curveTo(1.9, 305.9, 1.8, 341.9, 22.9, 338.0);
         a.lineTo(63, 338.4);
         
         //likod ng wheel
         a.moveTo(482, 309);
         a.lineTo(520.5, 309.2);
         a.curveTo(533, 305, 538, 340, 520, 337.8);
         a.lineTo(485, 338);
         
         //red box
         a.moveTo(520.5, 308.8);
         a.lineTo(521, 264);
         a.lineTo(525.5, 264);
         a.lineTo(525.8, 219);
         a.lineTo(508, 218.8);
         a.lineTo(508.8, 264);
         a.lineTo(521, 264);
         
         
         //pataas ng ambulance, right
         a.moveTo(520.6, 219);
         a.lineTo(521, 101);
         a.curveTo(517.8, 83.9, 504.5, 79, 485.2, 75.6);
         a.lineTo(157, 76);
         
         g2d.draw(a);
         
         GeneralPath b = new GeneralPath(); //lines
         b.moveTo(21.4, 308.9);
         b.lineTo(66, 310);
         b.moveTo(190, 309);
         b.lineTo(358, 308.8);
         b.moveTo(194, 337.8);
         b.lineTo(354.2, 338);
         
         //top siren
         
         b.moveTo(277.5, 75.5);
         b.lineTo(278, 65);
         b.lineTo(321.5, 65);
         b.lineTo(321.5, 75.8);
         b.moveTo(283, 65.1);
         b.lineTo(282.9, 39);
         b.lineTo(316.6, 39);
         b.lineTo(316.8, 65);
         
         //driver's window
         
         b.moveTo(219.9, 93);
         b.lineTo(144, 93);
         b.curveTo(129.1, 104.2, 116.8, 158.6, 113.5, 167.5);
         b.moveTo(116.8, 191.9);
         b.lineTo(219.9, 191.9);
         b.lineTo(219.9, 93);
         
         //second window
         
         b.moveTo(257.9, 93.1);
         b.lineTo(349.8, 93);
         b.lineTo(349.8, 191.9);
         b.lineTo(257.9, 191.9);
         b.lineTo(257.9, 93.1);
         
         //Gray rectangle beside window
         b.moveTo(116.9, 167.9);
         b.lineTo(100.9, 168);
         b.lineTo(101, 219.9);
         b.lineTo(116.9, 219.9);
         b.lineTo(116.9, 167.9);
         
         b.moveTo(240, 77);
         b.lineTo(240, 308.9);
         
         //cross
         b.moveTo(408, 107.9);
         b.lineTo(439.9, 107.9);
         b.lineTo(439.9, 140);
         b.lineTo(470.9, 140);
         b.lineTo(470.9, 171);
         b.lineTo(439.9, 171);
         b.lineTo(439.9, 202);
         b.lineTo(407.9, 202);
         b.lineTo(407.9, 170.9);
         b.lineTo(376.9, 170.9);
         b.lineTo(377, 140);
         b.lineTo(407.9, 140);
         b.lineTo(408, 107.9);
         g2d.draw(b);
         //handle
         b.moveTo(183.1, 203.9);
         b.lineTo(217.8, 204.1);
         b.curveTo(227.5, 207.4, 223.9, 216, 219.6, 217.1);
         b.lineTo(181.9, 216.9);
         b.curveTo(178.6, 216.8, 173.8, 207.1, 183.1, 203.9);
         
         g2d.draw(b);
         
         GeneralPath c = new GeneralPath(); //blue
         c.moveTo(217.9, 95);
         c.lineTo(144, 95);
         c.curveTo(129.6, 109.2, 116.9, 161.5, 115.8, 168);
         c.lineTo(117, 168.1);
         c.lineTo(117, 189.9);
         c.lineTo(217.9, 190);
         c.lineTo(217.9, 95);
         
         c.moveTo(259, 95);
         c.lineTo(259, 189.9);
         c.lineTo(347.9, 190);
         c.lineTo(347.9, 95);
         c.lineTo(259.9, 95);
         
         g.setColor(new Color(106, 155,211));
         g2d.fill(c);
         
         GeneralPath d = new GeneralPath();
         d.moveTo(437.8, 109);
         d.lineTo(409.8, 109);
         d.lineTo(409, 141);
         d.lineTo(378.9, 140.9);
         d.lineTo(378, 168.9);
         d.lineTo(409, 168.9);
         d.lineTo(409, 201);
         d.lineTo(438, 201);
         d.lineTo(438, 170);
         d.lineTo(468.9, 170);
         d.lineTo(468.9, 141);
         d.lineTo(437.8, 141);
         d.lineTo(437.8, 141);
         
         
         d.moveTo(520, 263);
         d.lineTo(524, 263);
         d.lineTo(524, 220);
         d.lineTo(510, 220);
         d.lineTo(510, 263);
         d.lineTo(520, 263);
         g.setColor(new Color(234, 0,0));
         g2d.fill(d);
         
         GeneralPath e = new GeneralPath(); //dark gray
         
         e.moveTo(279.5, 66.2);
         e.lineTo(279.8, 75.5);
         e.lineTo(320, 75.5);
         e.lineTo(320, 66.2);
         e.lineTo(279.5, 66.2);
         
         e.moveTo(66.8, 310.5);
         e.lineTo(14.5, 310);
         e.curveTo(3, 319.8, 10, 335.9, 16, 337.1);
         e.lineTo(63.8, 336.9);
         e.curveTo(62.8, 326.8, 63, 318.8, 66.8, 311.5);
         
         e.moveTo(190, 309.9);
         e.curveTo(194, 315.4, 194.4, 331, 194.2, 337.1);
         e.lineTo(354.8, 337.4);
         e.curveTo(353.2, 325.4, 354.1, 318, 358.4, 310);
         e.lineTo(190, 309.9);
         
         e.moveTo(481.5, 311);
         e.curveTo(485.2, 318.9, 486, 331.1, 484.6, 337.1);
         e.lineTo(523.5, 337.1);
         e.curveTo(531.4, 334.5, 533.6, 316.1, 523.6, 310.9);
         e.lineTo(481.5, 311);
         
         e.moveTo(183, 204.2);
         e.curveTo(176.2, 208.2, 178.9, 214.8, 183, 216.1);
         e.lineTo(218.8, 216);
         e.curveTo(224.2, 214.1, 223.8, 207, 217.4, 204.8);
         e.lineTo(183, 204.2);
         
         e.moveTo(115, 169);
         e.lineTo(102, 169);
         e.lineTo(102, 219.1);
         e.lineTo(114.9, 218.9);
         e.lineTo(115, 169);
         g.setColor(new Color(88,88,88));
         g2d.fill(e);
         
         GeneralPath f = new GeneralPath();
         f.moveTo(41.9, 241);
         f.lineTo(32.1, 238.8);
         f.lineTo(25.6, 272);
         f.lineTo(35.8, 273.8);
         f.lineTo(41.9, 241);
         g.setColor(new Color(240, 199,0));
         g2d.fill(f);
         
         GeneralPath h = new GeneralPath();
         h.moveTo(314.8, 40.9);
         h.lineTo(283.9, 40.9);
         h.lineTo(283.9, 65);
         h.lineTo(314.8, 65);
         h.lineTo(314.8, 40.9);
         g.setColor(new Color(155,1,41));
         g2d.fill(h);
         
         
         g.setColor(Color.BLACK);
         
         Ellipse2D.Double wheel1 = new Ellipse2D.Double(63, 266, 132, 132);
         g2d.draw(wheel1);
         Ellipse2D.Double wheel1a = new Ellipse2D.Double(93, 296, 71,71);
         g2d.draw(wheel1a);
         Ellipse2D.Double wheel2 = new Ellipse2D.Double(354, 266, 132, 132);
         g2d.draw(wheel2);
         Ellipse2D.Double wheel2a = new Ellipse2D.Double(384, 296, 71,71);
         g2d.draw(wheel2a);
         //fill 
         
         Ellipse2D.Double wheel1b = new Ellipse2D.Double(64, 267, 131, 131);
         g.setColor(new Color(33, 28, 34));
         g2d.fill(wheel1b);
         Ellipse2D.Double wheel1c = new Ellipse2D.Double(94, 297, 70, 70);
         g.setColor(new Color(197, 197, 199));
         g2d.fill(wheel1c);
         Ellipse2D.Double wheel2b= new Ellipse2D.Double(355, 267,131, 131);
         g.setColor(new Color(33, 28, 34));
         g2d.fill(wheel2b);
         Ellipse2D.Double wheel2c = new Ellipse2D.Double(386, 298, 70,70);
        g.setColor(new Color(197, 197, 199));
         g2d.fill(wheel2c);
    }
     
      public static void main(String args[])
    {
        Ambulance b = new Ambulance();
        b.setTitle("Ambulance");
        b.setBackground(Color.WHITE);
        b.setSize(550, 420);
        b.setForeground(Color.BLACK);
        b.setVisible(true);
        
        b.addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent e) {
                // Terminate the program after the close button is clicked.
                System.exit(0);
        }});
    }
}
