import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

public class MyCalc extends JFrame implements ActionListener{
    private JTextField firstn,textfield;
    JPanel buttonPanel ,textpanel;
    JButton sin,cos,tan,log,ln,sin1,cos1,tan1,pow,fact,x2,mod,under,divby1,e,b7,b8,b9,del,ac,b4,b5,b6,mul,div,b1,b2,b3,add,sub,b0,bdot,pi,ansbutton,equal;
    String n1,n2,ans,operator;

    MyCalc()
    {
        setTitle("Scientific Calculator by Rohit Mittal \n 18103081");
        buttonPanel = new JPanel();
        textpanel=new JPanel();
        textpanel.setLayout(new GridLayout(2,1,0,0));
        buttonPanel.setLayout(new GridLayout(7, 5, 0, 0));

        sin=new JButton("sin");cos=new JButton("cos");tan=new JButton("tan");log=new JButton("log");ln=new JButton("ln");
        sin1=new JButton("sin-1");cos1=new JButton("cos-1");tan1=new JButton("tan-1");pow=new JButton("x^y");fact=new JButton("x!");
        x2=new JButton("x^2");mod=new JButton("mod");under=new JButton("root");divby1=new JButton("1/x");e=new JButton("e");
        b7=new JButton("7");b8=new JButton("8");b9=new JButton("9");del=new JButton("Del");ac=new JButton("AC");
        b4=new JButton("4");b5=new JButton("5");b6=new JButton("6");mul=new JButton("*");div=new JButton("/");
        b1=new JButton("1");b2=new JButton("2");b3=new JButton("3");add=new JButton("+");sub=new JButton("-");
        b0=new JButton("0");bdot=new JButton(".");pi=new JButton("pi");ansbutton=new JButton("Ans");equal=new JButton("=");

        sin.addActionListener(this);cos.addActionListener(this);tan.addActionListener(this);log.addActionListener(this);ln.addActionListener(this);
        sin1.addActionListener(this);cos1.addActionListener(this);tan1.addActionListener(this);pow.addActionListener(this);fact.addActionListener(this);
        x2.addActionListener(this);mod.addActionListener(this);under.addActionListener(this);divby1.addActionListener(this);e.addActionListener(this);
        b7.addActionListener(this);b8.addActionListener(this);b9.addActionListener(this);del.addActionListener(this);ac.addActionListener(this);
        b4.addActionListener(this);b5.addActionListener(this);b6.addActionListener(this);mul.addActionListener(this);div.addActionListener(this);
        b1.addActionListener(this);b2.addActionListener(this);b3.addActionListener(this);add.addActionListener(this);sub.addActionListener(this);
        b0.addActionListener(this);bdot.addActionListener(this);pi.addActionListener(this);ansbutton.addActionListener(this);equal.addActionListener(this);

        Font BIGGER_FONT = new Font("monspaced", Font.PLAIN, 20);
        sin.setFont(BIGGER_FONT);cos.setFont(BIGGER_FONT);tan.setFont(BIGGER_FONT);log.setFont(BIGGER_FONT);ln.setFont(BIGGER_FONT);
        sin1.setFont(BIGGER_FONT);cos1.setFont(BIGGER_FONT);tan1.setFont(BIGGER_FONT);pow.setFont(BIGGER_FONT);fact.setFont(BIGGER_FONT);
        x2.setFont(BIGGER_FONT);mod.setFont(BIGGER_FONT);under.setFont(BIGGER_FONT);divby1.setFont(BIGGER_FONT);e.setFont(BIGGER_FONT);
        b7.setFont(BIGGER_FONT);b8.setFont(BIGGER_FONT);b9.setFont(BIGGER_FONT);del.setFont(BIGGER_FONT);ac.setFont(BIGGER_FONT);
        b4.setFont(BIGGER_FONT);b5.setFont(BIGGER_FONT);b6.setFont(BIGGER_FONT);mul.setFont(BIGGER_FONT);div.setFont(BIGGER_FONT);
        b1.setFont(BIGGER_FONT);b2.setFont(BIGGER_FONT);b3.setFont(BIGGER_FONT);add.setFont(BIGGER_FONT);sub.setFont(BIGGER_FONT);
        b0.setFont(BIGGER_FONT);bdot.setFont(BIGGER_FONT);pi.setFont(BIGGER_FONT);ansbutton.setFont(BIGGER_FONT);equal.setFont(BIGGER_FONT);

        buttonPanel.add(sin);buttonPanel.add(cos);buttonPanel.add(tan);buttonPanel.add(log);buttonPanel.add(ln);
        buttonPanel.add(sin1);buttonPanel.add(cos1);buttonPanel.add(tan1);buttonPanel.add(pow);buttonPanel.add(fact);
        buttonPanel.add(x2);buttonPanel.add(mod);buttonPanel.add(under);buttonPanel.add(divby1);buttonPanel.add(e);
        buttonPanel.add(b7);buttonPanel.add(b8);buttonPanel.add(b9);buttonPanel.add(del);buttonPanel.add(ac);
        buttonPanel.add(b4);buttonPanel.add(b5);buttonPanel.add(b6);buttonPanel.add(mul);buttonPanel.add(div);
        buttonPanel.add(b1);buttonPanel.add(b2);buttonPanel.add(b3);buttonPanel.add(add);buttonPanel.add(sub);
        buttonPanel.add(b0);buttonPanel.add(bdot);buttonPanel.add(pi);buttonPanel.add(ansbutton);buttonPanel.add(equal);

        textfield= new JTextField("",25);
        firstn=new JTextField("",25);

        textfield.setHorizontalAlignment(JTextField.RIGHT);
        firstn.setHorizontalAlignment(JTextField.RIGHT);

        textfield.setFont(BIGGER_FONT);
        firstn.setFont(BIGGER_FONT);

        textpanel.add(firstn);
        textpanel.add(textfield);

        n1="";
        n2="";
        ans="";operator="";

        add(textpanel,BorderLayout.CENTER);
        add(buttonPanel,BorderLayout.SOUTH);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        try{
            if (    ae.getSource()==b0||ae.getSource()==b1||ae.getSource()==b2||
                    ae.getSource()==b3||ae.getSource()==b4||ae.getSource()==b5||
                    ae.getSource()==b6||ae.getSource()==b7||ae.getSource()==b8||ae.getSource()==b9||ae.getSource()==bdot
            )
            {
                ans="";
                String temp=textfield.getText();
                temp+=ae.getActionCommand();
                textfield.setText(temp);
            }
            else if(ae.getSource()==pi)
            {
                ans="";
                textfield.setText("3.141592653589793238");
            }
            else if(ae.getSource()==e)
            {
                ans="";
                textfield.setText("2.718281828459045235");
            }
            else if(ae.getSource()==ac)
            {
                ans="";
                textfield.setText("");
                firstn.setText("");
                n1="";n2="";ans="";operator="";
            }
            else if(ae.getSource()==del)
            {
                ans="";
                String temp=textfield.getText();
                if(!temp.equals(""))
                    temp =temp.substring(0, temp.length() - 1);
                textfield.setText(temp);
            }
            else if(ae.getSource()==ansbutton)
            {
                if(!ans.equals(""))
                {
                    firstn.setText(ans);
                    n1=ans;
                }
            }
            else if(ae.getSource()==mul||ae.getSource()==div||ae.getSource()==add||ae.getSource()==sub||ae.getSource()==mod)
            {
                ans="";
                if(!textfield.getText().equals(""))
                {
                    n1 = textfield.getText();
                    textfield.setText("");
                }
                firstn.setText(n1);
                operator=ae.getActionCommand();
            }
            else if(ae.getSource()==pow)
            {
                ans="";
                if(!textfield.getText().equals(""))
                {
                    n1 = textfield.getText();
                    textfield.setText("");
                }
                operator="^";
                firstn.setText(n1);
            }
            else if(ae.getSource()==equal){
                if(n1.equals("")||operator.equals("")||textfield.getText().equals("")||firstn.getText().equals(""))
                { }
                else{
                    n1=firstn.getText();
                    n2=textfield.getText();

                    Double d1=Double.valueOf(n1);
                    Double d2=Double.valueOf(n2);
                    String an="";
                    switch (operator){
                        case "+":
                            an=String.valueOf((d1+d2));
                            break;
                        case "-":
                            an=String.valueOf((d1-d2));
                            break;
                        case "*":
                            an=String.valueOf((d1*d2));
                            break;
                        case "/":
                            an=String.valueOf((d1/d2));
                            break;
                        case "^":
                            an=String.valueOf(Math.pow(d1,d2));
                            break;
                        case "mod":
                            an=String.valueOf(Math.floorMod(Math.round(d1),Math.round(d2)));
                            break;
                    }
                    firstn.setText(n1+" "+operator+" "+n2+" = "+an);
                    ans=an;

                }
                textfield.setText("");
            }
            else
            {
                if(!textfield.getText().equals(""))
                {
                    n1 = textfield.getText();
                }
                if(!n1.equals(""))
                {
                    textfield.setText("");
                    String an="";
                    double number= Double.parseDouble(n1);
                    String op=ae.getActionCommand();
                    switch (op){
                        case "sin":
                            an=String.valueOf(Math.sin(Math.PI*number/180));
                            break;
                        case "cos" :
                            an=String.valueOf(Math.cos(Math.PI*number/180));
                            break;
                        case "tan":
                            an=String.valueOf(Math.tan(Math.PI*number/180));
                            break;
                        case "sin-1":
                            an=String.valueOf(180*Math.asin(number)/Math.PI);
                            break;
                        case "cos-1":
                            an=String.valueOf(180*Math.acos(number)/Math.PI);
                            break;
                        case "tan-1":
                            an=String.valueOf(180*Math.atan(number)/Math.PI);
                            break;
                        case "log":
                            an=String.valueOf(Math.log10(number));
                            break;
                        case "ln":
                            an=String.valueOf(Math.log(number));
                            break;
                        case "x^2":
                            an=String.valueOf(Math.pow(number,2));
                            break;
                        case "1/x":
                            an=String.valueOf(Math.pow(number,-1));
                            break;
                        case "root":
                            an=String.valueOf(Math.pow(number,.5));
                            break;
                        case "x!":
                            BigInteger temp=BigInteger.ONE;
                            for(int i=1;i<=number;i++)
                                temp=temp.multiply(BigInteger.valueOf(i));
                            if(temp.compareTo(BigInteger.valueOf(1000000))>0){
                                NumberFormat formatter = new DecimalFormat("0000.######E0", DecimalFormatSymbols.getInstance(Locale.ROOT));
                                an = formatter.format(temp);
                            }
                            else {
                                an=String.valueOf(temp);
                            }
                            break;
                    }
                    firstn.setText(ae.getActionCommand()+"("+n1+")"+" = "+an);
                    ans=an;
                }

                operator="";
                n1="";n2="";
            }}
        catch (Exception e)
        {
            System.out.println("Exception due to "+e);
        }
    }
    @Override
    public void setVisible(boolean b) {
        super.setVisible(b);
    }
    public static void main(String[] args) {
        MyCalc myCalc=new MyCalc();
        myCalc.setVisible(true);
        myCalc.setSize(600,400);
        myCalc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}