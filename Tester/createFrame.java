package Tester;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.Frame;
import java.awt.TextArea;

import javax.swing.JFrame;

public class createFrame {
    public static void main(String[] args) {
        // Create frame with specific title

        JFrame frame = new JFrame("Example Frame");

        // Create a component to add to the frame; in this case a text area with sample
        // text

        // Component textArea = new TextArea("Sample text...");

        // Create a component to add to the frame; in this case a button

        // Component button = new Button("Click Me!!");

        // Add the components to the frame; by default, the frame has a border layout

        // frame.add(textArea, BorderLayout.NORTH);

        // frame.add(button, BorderLayout.SOUTH);

        // Show the frame

        int width = 500;
        int height = 500;

        frame.setSize(width, height);
        // frame.setSize(400, 500);
        // frame.setTitle("FZ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBackground(Color.GREEN);
        // frame.setBounds(10, 20, 300, 300);
        frame.setVisible(true);
    }
}
