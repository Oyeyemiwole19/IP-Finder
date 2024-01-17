import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.InetAddress;
import java.net.UnknownHostException;

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

        JButton findButton = getFindButton(urlTextField, jFrame);

        jFrame.add(urlTextField);
        jFrame.add(urlLabel);
        jFrame.add(findButton);
    }

    private static JButton getFindButton(JTextField urlTextField, JFrame jFrame) {
        JButton findButton = new JButton("Find");
        findButton.setBounds(30, 70, 50, 50);

        findButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String url = urlTextField.getText();

                try{
                    InetAddress inetAddress = InetAddress.getByName(url);
                    String ip = inetAddress.getHostAddress();
                    JOptionPane.showMessageDialog(jFrame,ip);
                } catch (UnknownHostException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        return findButton;
    }
}
