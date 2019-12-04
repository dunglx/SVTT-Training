private JButton btn;
    private Jpanel panelcalculator;
    private String btnName[] = {"C", "CE", "<-", "(", ")",
                                "7", "8", "9", "/", "pi",
                                "4", "5", "6", "*", "x^2",
                                "1", "2", "3", "-", "V",
                                "0", ".", "Ans", "+", "="};
/*Khởi tạo jbutton */

private jButton myButton(String btnname)
{
    btn = new JButton(btnname);
    btn.setBackground(Color.white);
    btn.setForeground(Color.red);
    btn.addActionListener(this);\
    return btn;
}
/* Add các jbutton vao panel*/

public JPanel createButtonofCaculator()
{
    panelcaculator = new JPanel(new GridLayout(5, 4));
    for(int i=0;i<btnName.length; i++)
    {
        panelcaculator.add(myButton(btnName[i]));

    }
    panelcalculator.setBackground(Color.White);
    return panelcaculator;
}
    
private JPanel paneOUTPUT;
private JTextArea textarea;
/* Khởi tạo jtextarea */
private JPanel createTextArea(){
    panelOUTPUT = new JPanel(new GridLayout(1, 1));
    textarea = new JTextArea(3, 3);
    textarea.setBackground(Color.WHITE);
    panelOUTPUT.add(textarea);
    textarea.setEditable(false);
    return pane1OUTPUT;
}

private double a = 0;
    private int casenumber = 0;
    private double result = 0;
    private double result = 0;
    private double b = 0;
public void actionPerformed(ActionEvent e){
// chức năng cho từng nút//
    if(e.getActionCommand() == "1")
        textarea.append("1");
    if(e.getActionCommand() == "2")
        textarea.append("2");
    if(e.getActionCommand() == "3")
        textarea.append("3");
    if(e.getActionCommand() == "4")
        textarea.append("4");
    if(e.getActionCommand() == "5")
        textarea.append("5");
    if(e.getActionCommand() == "6")
        textarea.append("6");
    if(e.getActionCommand() == "7")
        textarea.append("7");
    if(e.getActionCommand()== "8")
        textarea.append("8");
    if(e.getActionCommand() == "9")
        textarea.append("9");
    if(e.getActionCommand() == "0")
        textarea.append("0");
    if(e.getActionCommand() == ".")
        textarea.append(".");
}
/* Các toán tử gán biến casenumber để thực hiện câu lệnh switch case */
    if(e.getActionCommand()=="+")
    {
        a = Double.parseDouble(textarea.getText());
        casenumber = 1;
        textarea.setText("");
    }  
    if(e.getActionCommand()=="-")
    {
        a = Double.parseDouble(textarea.getText());
        casenumber = 2;
        textarea.setText("");
    }
    if(e.getActionCommand()=="*")
{
        a = Double.parseDouble(textarea.getText())
        casenumber = 3;
        textarea.setText("");
}
    if(e.getActionCommand()=="/")
{
        b= Double.parseDouble(textarea.getText());
        casenumber = 4;
        textarea.setText("");
}
    if(e.getActionCommand()=="=")
{
        b= Double.parseDouble(textarea.getText());
        switch(casenumber)
{
case 1: result = a+b;
break;

case 2: result = a-b;
break;

case 3: result = a*b;
break;

case 4: result = a/b;
break;

default: result = 0;
}
textarea.setText(new Double(result).toString());
}
public class C {
    
}
