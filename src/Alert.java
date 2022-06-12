import javax.swing.*;
import java.awt.*;
import java.util.concurrent.TimeUnit;

public class Alert extends JFrame {
    private JPanel panel1;
    private JLabel Base;
    private JLabel Alert;
    private JLabel CodeText;
    private JPanel CODEAlert;

    public Alert(){
        setTitle("Base Alert");
        setContentPane(panel1);
        setSize(Toolkit.getDefaultToolkit().getScreenSize());
        setUndecorated(true);
        setVisible(true);

        while (true) {
            Base.setVisible(false);
            Alert.setVisible(false);
            CODEAlert.setVisible(false);

            try {
                TimeUnit.MILLISECONDS.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            Base.setVisible(true);
            try {
                TimeUnit.MILLISECONDS.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            Alert.setVisible(true);
            try {
                TimeUnit.MILLISECONDS.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            CODEAlert.setVisible(true);
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
       Alert myAlert = new Alert();
    }
}
