/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodbankmangment;

/**
 *
 * @author HP
 */
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

public class CommunicationSystem extends Frame implements ActionListener {
    private TextField tfRadius, tfWidth, tfHeight;
    private Label lbArea;
    private Button btnCircle, btnTriangle, btnRectangle;

    public CommunicationSystem() {
        setLayout(new FlowLayout());
        add(new Label("Radius: "));
        tfRadius = new TextField(10);
        add(tfRadius);
        btnCircle = new Button("Calculate Circle Area");
        add(btnCircle);
        btnCircle.addActionListener(this);

        add(new Label("Width: "));
        tfWidth = new TextField(10);
        add(tfWidth);
        add(new Label("Height: "));
        tfHeight = new TextField(10);
        add(tfHeight);
        btnTriangle = new Button("Calculate Triangle Area");
        add(btnTriangle);
        btnTriangle.addActionListener(this);

        btnRectangle = new Button("Calculate Rectangle Area");
        add(btnRectangle);
        btnRectangle.addActionListener(this);

        lbArea = new Label("Area is: ");
        add(lbArea);

        setTitle("Communication System");
        setSize(400, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent evt) {
        try {
            Socket socket = new Socket("192.168.8.199", 8000);
            DataOutputStream toServer = new DataOutputStream(socket.getOutputStream());
            DataInputStream fromServer = new DataInputStream(socket.getInputStream());

            if (evt.getSource() == btnCircle) {
                double radius = Double.parseDouble(tfRadius.getText().trim());
                toServer.writeDouble(radius);
                toServer.writeInt(0); // 0 indicates circle
                toServer.flush();

                double area = fromServer.readDouble();
                lbArea.setText("Area is: " + area);
            } else if (evt.getSource() == btnTriangle) {
                double width = Double.parseDouble(tfWidth.getText().trim());
                double height = Double.parseDouble(tfHeight.getText().trim());
                toServer.writeDouble(width);
                toServer.writeDouble(height);
                toServer.writeInt(1); // 1 indicates triangle
                toServer.flush();

                double area = fromServer.readDouble();
                lbArea.setText("Area is: " + area);
            } else if (evt.getSource() == btnRectangle) {
                double width = Double.parseDouble(tfWidth.getText().trim());
                double height = Double.parseDouble(tfHeight.getText().trim());
                toServer.writeDouble(width);
                toServer.writeDouble(height);
                toServer.writeInt(2); // 2 indicates rectangle
                toServer.flush();

                double area = fromServer.readDouble();
                lbArea.setText("Area is: " + area);
            }
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }

    public static void main(String[] args) {
        new CommunicationSystem();
    }
}

