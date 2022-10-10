package c212.src.Lab9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class PollTracking {
    static JButton option1;
    static JButton option2;
    static JButton otherEnter;
    static JButton createGraph;
    static JLabel pollOption1Label = new JLabel();
    static JLabel pollOption2Label = new JLabel();
    static JLabel pollOtherLabel = new JLabel();
    static JTextField other;
    static ArrayList<String> names = new ArrayList<String>();
    static ArrayList<Integer> votes = new ArrayList<Integer>();

    public static void main(String[] args) {
        //Create a JFrame
        JFrame frame = new JFrame("Ice Cream Tracking");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(Color.WHITE);
        mainPanel.setPreferredSize(new Dimension(300, 300));

        JPanel createGraphPanel = new JPanel();
        createGraphPanel.setBackground(Color.WHITE);
        createGraphPanel.setPreferredSize(new Dimension(300, 100));
        
        JPanel votingPanel = new JPanel();
        votingPanel.setBackground(Color.WHITE);
        votingPanel.setPreferredSize(new Dimension(300, 100));
        
        JPanel labelPanel = new JPanel();
        labelPanel.setBackground(Color.WHITE);
        labelPanel.setPreferredSize(new Dimension(300, 100));

        mainPanel.add(labelPanel);
        mainPanel.add(votingPanel);
        mainPanel.add(createGraphPanel);
        
        option1 = new JButton("Chocolate");
        option1.addActionListener(new Option1ButtonListener());
        votingPanel.add(option1);

        option2 = new JButton("Vanilla");
        option2.addActionListener(new Option2ButtonListener());
        votingPanel.add(option2);

        other = new JTextField("Enter Text here please");
        votingPanel.add(other);

        otherEnter = new JButton("Enter");
        otherEnter.addActionListener(new OptionOtherButtonListener());
        votingPanel.add(otherEnter);

        createGraph = new JButton("Create Graph");
        createGraph.addActionListener(new CreateGraphButtonListener());
        createGraphPanel.add(createGraph);

        labelPanel.add(pollOption1Label);
        labelPanel.add(pollOption2Label);
        labelPanel.add(pollOtherLabel);

        names.add("Chocolate");
        votes.add(0);
        names.add("Vanilla");
        votes.add(0);

        // add the panel to the frame
        frame.getContentPane().add(mainPanel);
        frame.pack();
        frame.setVisible(true);
    }

    private static class Option1ButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            votes.set(0, votes.get(0) + 1);
            pollOption1Label.setText("Chocolate: " + votes.get(0));
        }
    }

    private static class Option2ButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            votes.set(1, votes.get(1) + 1);
            pollOption2Label.setText("Vanilla: " + votes.get(1));
        }
    }

    private static class OptionOtherButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            String vote = other.getText();
            if(names.contains(vote)){
                int index = names.indexOf(vote);
                votes.set(index, votes.get(index) + 1);
            }
            else{
                names.add(vote);
                votes.add(1);
            }
            String str = "";
            for(int i = 2; i<votes.size(); i++){
                str += names.get(i) + ": " + votes.get(i) + ", ";
            }
            pollOtherLabel.setText(str.substring(0, str.length() - 2));
        }
    }

    private static class CreateGraphButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            StackedChartDisplay.display(names, votes);
        }
    }

}

