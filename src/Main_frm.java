import javax.swing.*;
import java.awt.*;

public class Main_frm extends JFrame {
    private int screenW = Toolkit.getDefaultToolkit().getScreenSize().width;
    private int screenH = Toolkit.getDefaultToolkit().getScreenSize().height;
    private JMenuBar jmb = new JMenuBar();
    private JMenu jmF = new JMenu("File");
    private JMenu jmS = new JMenu("Set");
    private JMenu jmG = new JMenu("Game");
    private JMenu jmA = new JMenu("About");
    private int frmW = 500, frmH = 450;
    public Main_frm(){
        initComp();
    }
    private void initComp(){
        this.setBounds(screenW/2-frmW/2,screenH/2-frmH/2,frmW,frmH);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setJMenuBar(jmb);
        jmb.add(jmF);
        jmb.add(jmS);
        jmb.add(jmG);
        jmb.add(jmA);
    }

}
