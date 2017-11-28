import javax.swing.*;
import java.awt.*;
public class MainFrame extends JFrame{
    private Container cp;
    private JLabel jlb1 = new JLabel("Sever IP:");
    private JLabel jlb2 =  new JLabel("105.51.3.69");
    private JLabel jlb3 =  new JLabel("Port");
    private JTextArea jta = new JTextArea();
    private JButton jbtn1=new JButton("Start");
    private JButton jbtn2=new JButton("Stop");
    private JButton jbtn3=new JButton("Exit");
    private JButton jbtn4=new JButton("Send");
    private JTextArea jtaL = new JTextArea();
    private JScrollPane jspL=new JScrollPane(jtaL);
    private JPanel jpn1= new JPanel(new GridLayout(8,1,3,3));
    public MainFrame() {
        initComp();
    }
    private void initComp() {
        this.setBounds(100,100,500,400);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        cp=this.getContentPane();
        cp.setLayout(new BorderLayout());
        cp.add(jspL,BorderLayout.WEST);
        jtaL.setPreferredSize(new Dimension(200,400));
        jtaL.setLineWrap(true);
        cp.add(jpn1,BorderLayout.EAST);

    }

}