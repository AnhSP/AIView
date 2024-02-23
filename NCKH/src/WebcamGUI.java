import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import com.github.sarxos.webcam.WebcamResolution;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class WebcamGUI extends JFrame {
    private JPanel camPanel;

    public WebcamGUI(){
        this.init();
    }

    private void init(){
        this.setTitle("Test");
        this.setSize(1080,720);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setContentPane(camPanel);
        this.turnCam();
        this.pack();
        this.setVisible(true);
    }

    private void turnCam(){
        final Webcam webcam= Webcam.getDefault();
        webcam.setViewSize(new Dimension(640,480));

        WebcamPanel panel1= new WebcamPanel(webcam);
        panel1.setFPSDisplayed(true);
        panel1.setImageSizeDisplayed(true);
        panel1.setMirrored(true);
//        webcam.open();
        this.add(panel1);
//        VideoFeed video= new VideoFeed(webcam, imageHolder);
//        video.start();
    }
}
