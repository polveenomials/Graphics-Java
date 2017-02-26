import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.geom.CubicCurve2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.QuadCurve2D;
import javafx.scene.shape.QuadCurve;

public class ButtercupVersion1 extends Frame{
    public void paint(Graphics g)
    {
        Graphics2D g2d = (Graphics2D) g;
        BasicStroke bs = new BasicStroke(4.0f);
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
        RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setStroke(bs);
        g2d.setFont(new Font("Arial", Font.TYPE1_FONT,10));
        
        
        Line2D.Double body = new Line2D.Double(48.4, 345, 273.9, 349);
        g2d.draw(body);
         Line2D.Double body1 = new Line2D.Double(59.6, 333, 242.6, 336.4);
        g2d.draw(body1);
        
        Ellipse2D.Double arm1 = new Ellipse2D.Double(272.8, 285.2, 93.3, 133);
        g2d.draw(arm1);
        Ellipse2D.Double arm1a = new Ellipse2D.Double(284.9,295.6,70.1, 111.4);
        g2d.draw(arm1a);
        CubicCurve2D.Double arm2= new CubicCurve2D.Double(538, 268.5, 641.2, 257.6, 519, 433.1, 397.5, 347.6);
        g2d.draw(arm2);
        CubicCurve2D.Double arm2a = new CubicCurve2D.Double(525, 281.2, 628.1, 254.6, 513.8, 406.5, 413.6, 342.8);
        
        g2d.draw(arm2a);
        CubicCurve2D.Double leftFoot = new CubicCurve2D.Double(47.2, 342.8, -45, 96, 107.2, 22.5, 96, 245.2);
        g2d.draw(leftFoot);
        CubicCurve2D.Double leftToe = new CubicCurve2D.Double(28.5, 187.1, 41.6, 172.9, 63, 165.4, 80.6, 167.6);
        g2d.draw(leftToe);
        CubicCurve2D.Double leftToe1 = new CubicCurve2D.Double(28.5, 187.1,27, 184.5, 42, 298.9, 51, 318);
        g2d.draw(leftToe1);
        CubicCurve2D.Double leftToe2 = new CubicCurve2D.Double(80.2, 167.6, 85.1, 168, 90.4, 256.5, 87.8, 257.2);
        g2d.draw(leftToe2);
        CubicCurve2D.Double rightFoot = new CubicCurve2D.Double(76, 126, 93.8, 40.5, 159, 84, 157.5, 162);
        g2d.draw(rightFoot);
        CubicCurve2D.Double rightToe = new CubicCurve2D.Double(89.2, 147.8, 98.6, 137.2, 115.5, 121.1, 143.6, 135.8);
        g2d.draw(rightToe);
        CubicCurve2D.Double rightToe1 = new CubicCurve2D.Double(142.5, 136.5, 145.9, 135, 150., 182.2, 144.8, 182.2);
        
        g2d.draw(rightToe1);
        CubicCurve2D.Double skirt1 = new CubicCurve2D.Double(47.2, 342.8, 58.5, 280.9, 88.5, 253.9, 116.6, 232.5);
        g2d.draw(skirt1);
        CubicCurve2D.Double skirt2 = new CubicCurve2D.Double(122.6, 242.2, 83.6, 265.5,  65.6, 315, 60, 332.6);
        g2d.draw(skirt2);
        CubicCurve2D.Double skirt3 = new CubicCurve2D.Double(148.5, 272.6, 139.9, 280.9, 120.4, 309, 109.1, 333.4);
        g2d.draw(skirt3);
        Line2D.Double skirt4 = new Line2D.Double(194.6, 311.6, 190.1, 335.6);
        g2d.draw(skirt4);
   
        //left eyes 
        CubicCurve2D.Double eye1 = new CubicCurve2D.Double(342, 132, 366, 170, 374.2, 241.5, 345.8, 273.8);
        g2d.draw(eye1);
        CubicCurve2D.Double underLeftEye1 = new CubicCurve2D.Double(219.8,  300, 230.2, 295.1, 270.8, 273.8, 360.4, 275.2);
        g2d.draw(underLeftEye1);
        CubicCurve2D.Double greenLeftEye = new CubicCurve2D.Double(336, 135.8, 373.5, 192.8, 330, 267, 295.5, 274.5);
        g2d.draw(greenLeftEye);
        CubicCurve2D.Double blackLeftEye = new CubicCurve2D.Double(284.2, 128.2, 352.5, 183, 276, 324.8, 174.8, 242.2);
        g2d.draw(blackLeftEye);
   
        CubicCurve2D.Double mouth = new CubicCurve2D.Double(388.9, 296.6, 398.6, 279.4, 413.2, 258.4, 428.6, 275.2); 
        g2d.draw(mouth); 
        
        Line2D.Double eye6 = new Line2D.Double(483.8, 66.8, 506.2, 69.8); 
        g2d.draw(eye6);
        
        //bangs
        
        Line2D.Double bangs1 = new Line2D.Double(385.1, 74.6, 364.1, 79.1); 
        g2d.draw(bangs1);
        Line2D.Double bangs2 = new Line2D.Double(364.1, 79.1, 327, 51.8); 
        g2d.draw(bangs2);
        Line2D.Double bangs3 = new Line2D.Double(327, 51.8, 334.1, 86.2); 
        g2d.draw(bangs3);
        Line2D.Double bangs4= new Line2D.Double(334.1, 86.2, 240.8, 125.6); 
        g2d.draw(bangs4);
        
        Line2D.Double kilay= new Line2D.Double(362.6, 134.2, 240.8, 125.6); 
        g2d.draw(kilay);
            Line2D.Double kilay1= new Line2D.Double(362.6, 134.2, 355.9, 124.1); 
        g2d.draw(kilay1);
        
        //tabi ng bangs 
        CubicCurve2D.Double rightEye1 = new CubicCurve2D.Double(506.2, 69.8, 613.5, 156, 538.5, 317.2, 365.2, 337.5); 
        g2d.draw(rightEye1); 
        CubicCurve2D.Double rightEyeBlack= new CubicCurve2D.Double(483.8, 66.8,  558.8, 112.5, 506.2, 247.5, 403.5, 205.5); 
        g2d.draw(rightEyeBlack); 
        CubicCurve2D.Double rightEyeGreen = new CubicCurve2D.Double(551.2, 188.2, 513, 255.8, 438.8, 242.2, 418.5, 229.5); 
        g2d.draw(rightEyeGreen); 
        CubicCurve2D.Double rightEyeLine = new CubicCurve2D.Double(387, 74.2, 378, 236.2, 434.2, 294.0, 528.8, 245.2); 
        g2d.draw(rightEyeLine); 
        CubicCurve2D.Double face = new CubicCurve2D.Double(174.8, 243, 188.6, 289.9, 240.8, 322.1, 273.8, 329.6); 
        g2d.draw(face);
        
        CubicCurve2D.Double leftHair = new CubicCurve2D.Double(97.5, 201, 106.1, 216, 146.6, 306.8, 273, 348.8);
        g2d.draw(leftHair);
        Ellipse2D.Double rightEye = new Ellipse2D.Double(194, 159, 48, 48);
        g2d.draw(rightEye);
        
        Ellipse2D.Double leftEye = new Ellipse2D.Double(402,87.9, 49, 49);
        g2d.draw(leftEye);
        
        CubicCurve2D.Double eye2 = new CubicCurve2D.Double(196.5, 280.5, 210, 286.0, 220.2, 290.2, 234.2, 291);
        g2d.draw(eye2);
        
        CubicCurve2D.Double head = new CubicCurve2D.Double(150.8, 179.2, 177.8, 78.0, 350.2, -38.2 , 510.8, 53.2);
        g2d.draw(head);
        
        CubicCurve2D.Double leftHairBangs = new CubicCurve2D.Double(97.3, 200.8, 133.7, 202.5,146.1, 188.4, 157.7, 165.2);
        g2d.draw(leftHairBangs);
        CubicCurve2D.Double rightHair = new CubicCurve2D.Double(510.4, 54.4,  530.2, 73.5, 556.7, 88.1, 591.2, 49.3);
        g2d.draw(rightHair);
        
        CubicCurve2D.Double rightFace = new CubicCurve2D.Double(591, 48.8, 638.2, 297.8, 405.8, 348.8, 366, 353.2);
        g2d.draw(rightFace);
    }
    
    public static void main(String args[])
    {
        ButtercupVersion1 b = new ButtercupVersion1();
        b.setTitle("Buttercup");
        b.setBackground(Color.WHITE);
        b.setSize(600, 450);
        b.setForeground(Color.BLACK);
        b.setVisible(true);
        
        b.addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent e) {
                // Terminate the program after the close button is clicked.
                System.exit(0);
        }
});
    }
}
