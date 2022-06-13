import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
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
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setUndecorated(true);
        CodeText.setText("CODE 9");
        setVisible(true);
        while (true) {
            Base.setVisible(false);
            Alert.setVisible(false);
            CODEAlert.setVisible(false);

            try {
                TimeUnit.MILLISECONDS.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Base.setVisible(true);
            try {
                TimeUnit.MILLISECONDS.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Alert.setVisible(true);
            try {
                TimeUnit.MILLISECONDS.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            CODEAlert.setVisible(true);
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        File file = new File("src/SGC_Code9.wav");
        AudioInputStream AIS = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(AIS);
        clip.start();
        clip.loop(10000);
       Alert myAlert = new Alert();


    }
}
