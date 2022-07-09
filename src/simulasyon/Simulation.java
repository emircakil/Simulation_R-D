package simulasyon;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Simulation extends JPanel implements ActionListener {

    int xGroupALeader;
    int yGroupALeader;
    int xGroupBLeader;
    int yGroupBLeader;
    int xGroupCLeader;
    int yGroupCLeader;

    int xGroupAmember1;
    int yGroupAmember1;
    int xGroupAmember2;
    int yGroupAmember2;
    int xGroupBmember1;
    int yGroupBmember1;
    int xGroupBmember2;
    int yGroupBmember2;
    int xGroupCmember1;
    int yGroupCmember1;
    int xGroupCmember2;
    int yGroupCmember2;

    int xFinalA;
    int yFinalA;
    int xFinalB;
    int yFinalB;
    int xFinalC;
    int yFinalC;

    int xWall1;
    int yWall1;

    int xWall2;
    int yWall2;

    int xWall3;
    int yWall3;

    int xWall4;
    int yWall4;

    int xWall5;
    int yWall5;

    boolean wall1GroupA;
    boolean wall4GroupB;
    boolean wall4GroupC;
    boolean succesA;

    Timer timer;

    public Simulation() {

        xGroupALeader = 50;
        yGroupALeader = 120;
        xGroupBLeader = 50;
        yGroupBLeader = 250;
        xGroupCLeader = 50;
        yGroupCLeader = 420;

        xFinalA = 740;
        yFinalA = 270;
        xFinalB = 740;
        yFinalB = 420;
        xFinalC = 740;
        yFinalC = 120;

        xWall1 = 220;
        yWall1 = 140;

        xWall2 = 400;
        yWall2 = 190;

        xWall3 = 300;
        yWall3 = 340;

        xWall4 = 450;
        yWall4 = 430;

        xWall5 = 550;
        yWall5 = 110;

        timer = new Timer(100, this);
        timer.start();
    }

    public void paint(Graphics g) {

        super.paint(g);

        Graphics2D g2 = (Graphics2D) g;

        g2.setColor(Color.PINK);
        g2.fillOval(xFinalA - 10, yFinalA - 10, 50, 50);
        g2.fillOval(xFinalB - 10, yFinalB - 10, 50, 50);
        g2.fillOval(xFinalC - 10, yFinalC - 10, 50, 50);

        g2.setColor(Color.WHITE);
        g2.fillOval(xFinalA, yFinalA, 30, 30);
        g2.fillOval(xFinalB, yFinalB, 30, 30);
        g2.fillOval(xFinalC, yFinalC, 30, 30);

        g2.setColor(Color.BLACK);
        g2.drawLine(0, 600, 800, 600);

        g2.setFont(new Font("Serif", Font.BOLD, 25));
        g2.drawString("A", xFinalA + 5, yFinalA + 22);
        g2.drawString("B", xFinalB + 5, yFinalB + 22);
        g2.drawString("C", xFinalC + 5, yFinalC + 22);

        g2.setColor(Color.CYAN);
        g2.fillOval(xGroupALeader, yGroupALeader, 15, 15);
        g2.setColor(Color.GREEN);
        g2.fillOval(xGroupBLeader, yGroupBLeader, 15, 15);
        g2.setColor(Color.YELLOW);
        g2.fillOval(xGroupCLeader, yGroupCLeader, 15, 15);

        g2.setColor(Color.GRAY);
        g2.fillOval(xGroupAmember1, yGroupAmember1, 10, 10);
        g2.fillOval(xGroupAmember2, yGroupAmember2, 10, 10);
        g2.fillOval(xGroupBmember1, yGroupBmember1, 10, 10);
        g2.fillOval(xGroupBmember2, yGroupBmember2, 10, 10);
        g2.fillOval(xGroupCmember1, yGroupCmember1, 10, 10);
        g2.fillOval(xGroupCmember2, yGroupCmember2, 10, 10);

        g2.setColor(Color.RED);
        g2.fillRect(xWall1, yWall1, 30, 60);
        g2.fillRect(xWall2, yWall2, 30, 60);
        g2.fillRect(xWall3, yWall3, 30, 80);
        g2.fillRect(xWall4, yWall4, 30, 130);
        g2.fillRect(xWall5, yWall5, 50, 50);

        g2.setColor(Color.CYAN);
        g2.fillRect(20, 620, 20, 20);
        g2.setColor(Color.GREEN);
        g2.fillRect(160, 620, 20, 20);
        g2.setColor(Color.YELLOW);
        g2.fillRect(300, 620, 20, 20);
        g2.setColor(Color.RED);
        g2.fillRect(440, 620, 20, 20);
        g2.setColor(Color.PINK);
        g2.fillRect(570, 620, 20, 20);

        g2.setColor(Color.BLACK);
        g2.setFont(new Font("Serif", Font.BOLD, 20));
        g2.drawString(": A Grubu", 45, 636);
        g2.drawString(": B Grubu", 185, 636);
        g2.drawString(": C Grubu", 325, 636);
        g2.drawString(": Engeller", 465, 636);
        g2.drawString(": Varış Koordinatları", 595, 636);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        xGroupAmember1 = xGroupALeader - 20;
        yGroupAmember1 = yGroupALeader + 10;

        xGroupAmember2 = xGroupALeader - 20;
        yGroupAmember2 = yGroupALeader - 7;

        xGroupBmember1 = xGroupBLeader - 20;
        yGroupBmember1 = yGroupBLeader + 10;

        xGroupBmember2 = xGroupBLeader - 20;
        yGroupBmember2 = yGroupBLeader - 7;

        xGroupCmember1 = xGroupCLeader - 20;
        yGroupCmember1 = yGroupCLeader + 10;

        xGroupCmember2 = xGroupCLeader - 20;
        yGroupCmember2 = yGroupCLeader - 7;

        xGroupALeader += 10;
        xGroupBLeader += 10;
        xGroupCLeader += 10;

        if (xGroupALeader + 50 >= xWall1 && xGroupALeader <= xWall1 + 30) {

            if (yGroupALeader >= yWall1) {

                yGroupALeader += 5;

            } else {

                yGroupALeader -= 5;
            }

        }
        if (xGroupALeader >= 400) {

            if (yGroupALeader >= yFinalA &&  yGroupALeader < yFinalA+20){
            
              
            }else if (yGroupALeader <= yFinalA){
            
                yGroupALeader += 7;
            }else if (yGroupALeader >= yFinalA){
            
                yGroupALeader -= 7;
            }
            
            succesA = true;

        } else if (succesA == true) {

            if (yGroupALeader > yFinalA) {
                yGroupALeader -= 10;
            } else if (yGroupALeader < yFinalA) {
                yGroupALeader += 10;
            }

        }

        if (xGroupBLeader + 50 >= xWall2 && xGroupBLeader <= xWall2 + 60) {

            if (yGroupBLeader < yWall2) {

                yGroupBLeader -= 5;
            } else {

                yGroupBLeader += 5;

                wall4GroupB = true;
            }
        }

        if (wall4GroupB) {

            if (yGroupBLeader >= yFinalB && yGroupBLeader <= yFinalB + 10) {

            } else if (yGroupBLeader > yFinalB) {

                yGroupBLeader -= 3;
            } else {

                yGroupBLeader += 3;
            }
        }

        if (xGroupCLeader + 20 >= xWall3 && xGroupBLeader <= xWall3 + 80) {

            if (yGroupCLeader < yWall3) {

                yGroupCLeader -= 5;
            } else {

                yGroupCLeader += 5;
            }
        }

        if (xGroupCLeader + 100 >= xWall4 && xGroupCLeader <= xWall4 + 130) {

            if (yGroupCLeader > yWall5) {

                yGroupCLeader -= 10;

            } else {

                yGroupCLeader += 10;
            }
            if (xGroupCLeader > xWall4) {
                wall4GroupC = true;
            }
        }

        if (wall4GroupC) {

            if (yGroupCLeader >= yFinalC && yGroupCLeader <= yFinalC + 10) {

            } else if (yGroupCLeader <= yFinalC + 10) {

                yGroupCLeader += 4;
            } else if (yGroupCLeader > yFinalC) {

                yGroupCLeader -= 4;
            }
        }
        if (xGroupALeader > 760) {

        } else {
            repaint();
        }
    }

}
