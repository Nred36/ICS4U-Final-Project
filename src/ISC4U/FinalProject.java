/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ISC4U;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.Timer;

/**
 *
 * @author naree1878
 */
public class FinalProject extends JApplet implements ActionListener, KeyListener, MouseListener, MouseMotionListener {

    Graphics2D myPic;
    Image dbImage, master;
    private Graphics dbg;
    Timer timer;
    int x, y;
    String[] picz = new String[5];
    Image[] img = new Image[5];

    public FinalProject() {//program name

        timer = new Timer(60, this);
        timer.setInitialDelay(100);     //starts timer
        timer.start();
        /**
         * @param args the command line arguments
         */

        addMouseListener(this);
        addMouseMotionListener(this);
        addKeyListener(this);

        Timer run = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        }
        );
        run.setRepeats(true);
        run.start();
    }

    public static void main(String[] args) {
        JFrame f = new JFrame(""); //name on program
        JApplet applet = new FinalProject();        //sets up the window
        f.getContentPane().add("Center", applet);
        applet.init();
        f.pack();

        f.setVisible(true); //makes it visible
        f.setResizable(false);//makes in unsizable
        f.setBounds(25, 25, 1185, 649);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //stops program if you x out the window
    }
// <editor-fold defaultstate="collapsed" desc="paint">

    public void paint(Graphics g) {
        dbImage = createImage(getWidth(), getHeight());      //creats and image the size of the screen
        dbg = dbImage.getGraphics();        //double buffers the panel
        paintComponent(dbg);
        g.drawImage(dbImage, 0, 0, this);
    }
// </editor-fold>

    public void paintComponent(Graphics g) {
        myPic = (Graphics2D) g;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
        requestFocus();
        setFocusTraversalKeysEnabled(false);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
// <editor-fold defaultstate="collapsed" desc="mouse Exit">

    @Override
    public void mouseExited(MouseEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
//</editor-fold>

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
