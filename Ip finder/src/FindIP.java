import javax.swing.*;
import java.awt.*;

public class FindIP {
    public static void main(String[] args){

        JFrame jFrame = new JFrame("IP Finder");
        jFrame.setBounds(50, 50, 800, 100);
        jFrame.setLayout(new GridLayout(1, 1));
        jFrame.setVisible(true);

      //Creating label
        JLabel urlLabel = new JLabel("Enter URL");
        urlLabel.setBounds(50, 25, 800, 200);


        //Creating textFiled to allow users input url
        JTextField urlTextField = new JTextField();
        urlTextField.setBounds(50,70, 200, 20 );


        //
        JButton findButton = new JButton("Find");
        findButton.setBounds(30, 70, 50, 50);

        jFrame.add(urlTextField);
        jFrame.add(urlLabel);
        jFrame.add(findButton);
    }
}
