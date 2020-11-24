import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class App {
    JPanel myPanel=new JPanel();
    JLabel label_txt=new JLabel();
    JTextArea t1=new JTextArea();
    JTextArea t2=new JTextArea();
    //构造方法
    public App() {
    t1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.getKeyCode()==KeyEvent.VK_ENTER){
                    if(t1.getText().equals("靓仔")){
                        t2.append("你是靓仔\n");
                    }else{
                        t2.append("你是傻逼\n");
                    }
                }
                if(e.getKeyCode()==KeyEvent.VK_DOWN){
                    t2.setText("");
                }
            }
        });
    }
    //显示窗体方法
    void go(){
        myPanel.add(t1);
        myPanel.add(t2);
        t1.setBounds(100,100,300,150);
        t1.setBackground(Color.cyan);
        t2.setBounds(100,300,300,150);
        t2.setBackground(Color.GREEN);
        JFrame frame = new JFrame("TestGUI");
        myPanel.setLayout(null);
        myPanel.add(label_txt);
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,512,720);
        //frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new App().go();
    }
}
