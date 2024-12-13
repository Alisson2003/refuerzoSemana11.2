import javax.swing.*;
import java.awt.*;
import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setContentPane(new form1().mainpanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setPreferredSize(new Dimension(800, 600));
        // empaqueta todos lo documentos
        frame.pack();
        frame.setVisible(true);
        // para poner el color a nuestro gusto
        frame.setBackground(Color.WHITE);




    }
}

