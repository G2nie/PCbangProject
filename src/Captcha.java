import java.util.*;
import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.border.Border;
import javax.swing.BorderFactory;

class Choice{ //random numbers in a range
	public int getRandom(int min, int max) {
    Random random = new Random();
    return random.nextInt(max - min) + min;
	}
}

class RText{ //characters to label
	public char randomChar(){
		char c; 
		Choice index = new Choice();
		String selection = ("abcdefghijklmnopqrstuvwxyz" + "1234567890" + "ABCDEFGHIJKLMNOPQRSTUVWXYZ"); 
		c= selection.charAt(index.getRandom(0,62)); 
		return c; 
	}
}

class Captcha implements ActionListener{
	JFrame f = new JFrame();
	JButton reset = new JButton("Reset");
    JButton  Submit= new JButton("Submit");
	JTextField answer = new JTextField("");
	JLabel label =  new JLabel("");
	JLabel label2 = new JLabel("");
	Border border = BorderFactory.createLineBorder(Color.BLUE, 5);

	
	Captcha(){
		label.setBorder(border);
		label.setOpaque(true);
		label.setBackground(Color.WHITE);
		int i; 
		Choice Index = new Choice(); 
		RText rtext= new RText();
		for(i=0;i<6;i++){
			label.setText(label.getText() + rtext.randomChar());
		}
		int y;
		i= Index.getRandom(0,25); 
		if (i==0){
			y= Index.getRandom(20,30);
			label.setFont(new Font("Bauhaus 93", Font.PLAIN, y));
		}
		else if (i==1){
			y= Index.getRandom(20,35);
			label.setFont(new Font("Bodoni MT Poster Compressed", Font.PLAIN, y));
		}
		else if (i==2){
			y= Index.getRandom(20,35);
			label.setFont(new Font("Bodoni MT Black", Font.PLAIN, y));
		} 
		else if (i == 3){
			y= Index.getRandom(20,35);
			label.setFont(new Font("Bradley Hand ITC", Font.PLAIN, y));
		}
		else if (i == 4){
			y= Index.getRandom(20,35);
			label.setFont(new Font("KG Broken Vessels SketchKG Broken Vessels Sketch", Font.PLAIN, y));
		}
		else if (i == 5){
			y= Index.getRandom(20,35);
			label.setFont(new Font("Jokerman", Font.PLAIN, y));
		}
		else if (i == 6){
			y= Index.getRandom(20,35);
			label.setFont(new Font("Harlow Solid Italic", Font.PLAIN, y));
		}
		else if (i == 7){
			y= Index.getRandom(20,35);
			label.setFont(new Font("Mistral", Font.PLAIN, y));
		}
		else if (i == 8){
			y= Index.getRandom(20,35);
			label.setFont(new Font("Informal Roman", Font.PLAIN, y));
		}
		else if (i == 9){
			y= Index.getRandom(20,35);
			label.setFont(new Font("Old English Text MT", Font.PLAIN, y));
		}
		else if (i == 10){
			y= Index.getRandom(20,35);
			label.setFont(new Font("French Script MT", Font.PLAIN, y));
		}
		else if (i == 11){
			y= Index.getRandom(20,35);
			label.setFont(new Font("Chiller", Font.PLAIN, y));
		}
		else if (i == 12){
			y= Index.getRandom(20,35);
			label.setFont(new Font("Gigi", Font.PLAIN, y));
		}
		else if (i == 13){
			y= Index.getRandom(20,35);
			label.setFont(new Font("Palace Script MT", Font.PLAIN, y));
		}
		else if (i == 14){
			y= Index.getRandom(20,35);
			label.setFont(new Font("Gabriola", Font.PLAIN, y));
		}
		else if (i == 15){
			y= Index.getRandom(20,35);
			label.setFont(new Font("Magneto", Font.PLAIN, y));
		}
		else if (i == 16){
			y= Index.getRandom(20,35);
			label.setFont(new Font("Gill Sans MT Ext Condensed Bold", Font.PLAIN, y));
		}
		else if (i == 17){
			y= Index.getRandom(20,35);
			label.setFont(new Font("Juice ITC", Font.PLAIN, y));
		}
		else if (i == 18){
			y= Index.getRandom(20,35);
			label.setFont(new Font("Onyx", Font.PLAIN, y));
		}
		else if (i == 19){
			y= Index.getRandom(20,35);
			label.setFont(new Font("Playbill", Font.PLAIN, y));
		}
		else if (i == 20){
			y= Index.getRandom(20,35);
			label.setFont(new Font("Parchment", Font.PLAIN, y));
		}
		else if (i == 21){
			y= Index.getRandom(20,35);
			label.setFont(new Font("Snap ITC", Font.PLAIN, y));
		}
		else if (i == 22){
			y= Index.getRandom(20,35);
			label.setFont(new Font("Blackadder ITC", Font.PLAIN, y));
		}
		else if (i == 23){
			y= Index.getRandom(20,35);
			label.setFont(new Font("Edwardian Script ITC", Font.PLAIN, y));
		}
		else {
			y= Index.getRandom(20,35);
			label.setFont(new Font("Niagara Engraved", Font.PLAIN, y));
		
}
		label.setBounds(10, 50, 150, 80);
		reset.setBounds(175, 70, 70, 30);
		answer.setBounds(10, 150, 150, 50); //text box
		Submit.setBounds(175, 155, 80, 30);
		label2.setBounds(50, 200, 150, 80);
		answer.setEditable(true);
		f.add(label);
		f.add(reset);
		f.add(answer);
		f.add(Submit);
		f.add(label2);
		reset.addActionListener(this);
		Submit.addActionListener(this);
		f.setSize(400,450);
        f.setTitle("Captcha");
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
		
		int x = Index.getRandom(0,7);
		if (x==0){
			label.setAlignmentX(1f);
			label.setAlignmentY(0.75f);
		}
		else if (x==1){
			label.setAlignmentX(4f);
			label.setAlignmentY(2f);
		}
		else if (x==2){
			label.setAlignmentX(1.7f);
			label.setAlignmentY(2f);
		}
		else if (x==3){
			label.setAlignmentX(2f);
			label.setAlignmentY(0.5f);
		}
		else if (x==4){
			label.setAlignmentX(2.5f);
			label.setAlignmentY(2f);
		}
		else if (x==5){
			label.setAlignmentX(3f);
			label.setAlignmentY(1.7f);
		}
		else if (x==6){
			label.setAlignmentX(1f);
			label.setAlignmentY(1f);
		}
	}
    
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== reset){
			if (reset()){
				new Captcha();
			}
		}
		if(e.getSource()== Submit){
			String x = answer.getText();
			String y = label.getText();
			//System.out.println ( x + "" + y);
			if (check(y, x)){
				label2.setText("You can continue");
				label2.setFont(new Font ("Calibri", Font.BOLD, 16));
			}
			else {
				JOptionPane.showMessageDialog(f, "캡챠를 입력해주세요.",
				"Error", JOptionPane.ERROR_MESSAGE); 
			}
		}
	}
	public boolean reset(){
		//captcha();
		return true;
	}
	
	public boolean check(String q, String p){
		if (q.equals(p)){
			return true;
		}
		else{
			return false;
		}
	}
	
	public static void main(String[] args){
		new Captcha(); 
	}
}
