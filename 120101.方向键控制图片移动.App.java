import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class App {
    JPanel myPanel=new JPanel();
    JLabel label_bg=new JLabel();
    JLabel fj=new JLabel();
    int CELL=240;
    int x = 130, y = 480;
    int i = 88;
    //构造方法
    public App() {
        myPanel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.getKeyCode() == KeyEvent.VK_UP) {
                    y=y-i ;
                    fj.setBounds(x, y, CELL, CELL);
                }
                if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    y=y+i;
                    fj.setBounds(x, y, CELL, CELL);
                }
                if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    x=x-i;
                    fj.setBounds(x, y, CELL, CELL);
                }
                if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    x=x+i;
                    fj.setBounds(x, y, CELL, CELL);
                }

            }
        });

    }
    //显示窗体方法
    void go(){
        JFrame frame = new JFrame("飞机大战");

        java.net.URL imgURL1= App.class.getResource("img/2.gif");
        fj.setIcon(new ImageIcon(imgURL1));
        fj.setBounds(130,480,240,240);

        java.net.URL imgURL2= App.class.getResource("img/1.jpg");
        label_bg.setIcon(new ImageIcon(imgURL2));
        label_bg.setBounds(0,0,512,720);


        myPanel.add(fj);
        myPanel.add(label_bg);
        myPanel.setLayout(null);//显示布局为空


        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,512,720);
        //frame.pack();
        frame.setVisible(true);
        myPanel.setFocusable(true);
    }



    public static void main(String[] args)
    {
        new App().go();
    }
}
