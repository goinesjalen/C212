package c212.src.Lab9;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class StackedChartDisplay{
    
    public static void display(ArrayList<String> names, ArrayList<Integer> votes){
        JFrame frame = new JFrame("Ice Cream Tracking Display");
        frame.setSize(700, 700);
        JComponent StackedChart = new StackedChart(names, votes);

        frame.getContentPane().add(StackedChart);
        frame.pack();
        frame.setVisible(true);
    }
    static class StackedChart extends JComponent{

        private ArrayList<String> names;
        private ArrayList<Integer> votes;
        private int modifierheight;
        private ArrayList<Color> colors = new ArrayList<Color>();
        private int actualSum;

        StackedChart(ArrayList<String> names, ArrayList<Integer> votes){
            this.names = names;
            this.votes = votes;
            this.actualSum = 0;
            for(Integer n : votes)
                this.actualSum += n;
            this.modifierheight = 500 / actualSum;
            colors.add(Color.green);
            colors.add(Color.red);
            colors.add(Color.blue);
            colors.add(Color.gray);
            colors.add(Color.yellow);
            colors.add(Color.magenta);
        }
        protected void paintComponent(Graphics g){
            Graphics2D g2 = (Graphics2D) g;
            int size = votes.size();
            int runningSum = 0;
            g2.setColor(Color.black);
            g2.fillRect(0, 0, 550, 1);
            g2.drawString("0%", 0, actualSum * this.modifierheight);
            g2.fillRect(0, (int)(.25 * (actualSum * this.modifierheight)), 550, 1);
            g2.drawString("25%", 0, (int)(.75 * (actualSum * this.modifierheight)));
            g2.fillRect(0, (int)(.5 * (actualSum * this.modifierheight)), 550, 1);
            g2.drawString("50%", 0, (int)(.5 * (actualSum * this.modifierheight)));
            g2.fillRect(0, (int)(.75 * (actualSum * this.modifierheight)), 550, 1);
            g2.drawString("75%", 0, (int)(.25 * (actualSum * this.modifierheight)));
            g2.fillRect(0, actualSum * this.modifierheight, 550, 1);
            g2.drawString("100", 0 , 0);
            while(size > 0){
                g2.setColor(this.colors.get(size-1));
                g2.fillRect(50, runningSum * this.modifierheight, 500, this.modifierheight * this.votes.get(size-1));
                runningSum += this.votes.get(size-1);
                g2.fillRect(600, 100 + (25 * (this.votes.size() - size)), 25, 25);
                g2.setColor(Color.black);
                g2.drawString(this.names.get(size-1), 625, 125 + (25 * (this.votes.size() - size)));
                size--;
            }


            //g2.setColor(Color.green);
            //g2.fillRect(0, 0, this.modifierwidth, this.votes.get(0) * this.modifierheight);
            //g2.setColor(Color.red);
            //g2.fillRect(modifierwidth, 0, this.modifierwidth, this.votes.get(1) * this.modifierheight);
            //g2.setColor(Color.green);
            //g2.fillRect(modifierwidth * 2, 0, this.modifierwidth, this.votes.get(2) * this.modifierheight);
        }
    }

}
