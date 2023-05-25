import java.awt.Font;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Random;
import javax.swing.JOptionPane;

public class MainFrame extends javax.swing.JFrame {
            boolean captcha_chk = false; //캡챠 성공 여부
    
            DB_conn DBM = new DB_conn();
            
            class Choice{ //난수 생성
                public int getRandom(int min, int max) {
                Random random = new Random();
                return random.nextInt(max - min) + min;
            }
}
            class RText{ //문자 생성
                public char randomChar(){
		char c; 
		Choice index = new Choice();
		String selection = ("abcdefghijklmnopqrstuvwxyz" + "1234567890" + "ABCDEFGHIJKLMNOPQRSTUVWXYZ"); 
		c= selection.charAt(index.getRandom(4,62)); 
		return c; 
                }
            }
            
        public boolean reset(){
            //캡챠 문자 리셋
            return true;
	}
	
	public boolean check(String q, String p){ //캡챠 문자 확인
		if (q.equals(p)){ 
			return true;
		}
		else{
			return false;
		}
	}
        
        public void click_reset(){ //캡챠, 버튼 리셋
            captcha_chk = false;
            reset.setEnabled(true);
            Submit.setEnabled(true);
            answer.setText("");
            new Captcha();
        }
        
        public static String getSHA512(String input){

	String toReturn = null;
	try {
	    MessageDigest digest = MessageDigest.getInstance("SHA-512");
	    digest.reset();
	    digest.update(input.getBytes("utf8"));
	    toReturn = String.format("%0128x", new BigInteger(1, digest.digest()));
	} catch (Exception e) {
	    e.printStackTrace();
	}
	
	return toReturn;
    } //암호화 부분

    public MainFrame() {
        initComponents();
         new Captcha(); 
         try{ //db 연결확인
            DBM.dbOpen();
            DBM.dbClose();
        } catch (Exception e){
            System.out.println("SQLException : " + e.getMessage());
        }
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_Login = new javax.swing.JLabel();
        lbl_Id = new javax.swing.JLabel();
        lbl_Pw = new javax.swing.JLabel();
        btn_Login = new javax.swing.JButton();
        txt_Id = new javax.swing.JTextField();
        btn_Signup = new javax.swing.JButton();
        btn_idpwsearch = new javax.swing.JButton();
        txtarea_Notice = new java.awt.TextArea();
        lbl_Notice = new javax.swing.JLabel();
        btn_Exit = new javax.swing.JButton();
        lbl_Title = new javax.swing.JTextField();
        pw_pw = new javax.swing.JPasswordField();
        reset = new javax.swing.JButton();
        Submit = new javax.swing.JButton();
        lable = new javax.swing.JLabel();
        answer = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PC방 시간 관리 프로그램");
        setBackground(new java.awt.Color(204, 204, 204));

        lbl_Login.setFont(new java.awt.Font("한컴 고딕", 1, 18)); // NOI18N
        lbl_Login.setText("로그인");

        lbl_Id.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N
        lbl_Id.setText("아이디");

        lbl_Pw.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N
        lbl_Pw.setText("비밀번호");

        btn_Login.setBackground(new java.awt.Color(153, 204, 255));
        btn_Login.setFont(new java.awt.Font("한컴 고딕", 1, 18)); // NOI18N
        btn_Login.setForeground(new java.awt.Color(255, 255, 255));
        btn_Login.setText("로그인");
        btn_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LoginActionPerformed(evt);
            }
        });

        btn_Signup.setBackground(new java.awt.Color(204, 204, 255));
        btn_Signup.setFont(new java.awt.Font("한컴 고딕", 1, 18)); // NOI18N
        btn_Signup.setForeground(new java.awt.Color(255, 255, 255));
        btn_Signup.setText("회원가입");
        btn_Signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SignupActionPerformed(evt);
            }
        });

        btn_idpwsearch.setBackground(new java.awt.Color(241, 241, 241));
        btn_idpwsearch.setFont(new java.awt.Font("한컴 고딕", 1, 12)); // NOI18N
        btn_idpwsearch.setText("아이디/비밀번호 찾기");
        btn_idpwsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_idpwsearchActionPerformed(evt);
            }
        });

        txtarea_Notice.setFont(new java.awt.Font("한컴 고딕", 1, 12)); // NOI18N
        txtarea_Notice.setText("※ 안녕하세요. 저희 PC방을 찾아주셔서 감사합니다.\n     즐거운 시간 되세요.\n");

        lbl_Notice.setFont(new java.awt.Font("한컴 고딕", 1, 18)); // NOI18N
        lbl_Notice.setText("공지사항");

        btn_Exit.setBackground(new java.awt.Color(241, 241, 241));
        btn_Exit.setFont(new java.awt.Font("한컴 고딕", 1, 14)); // NOI18N
        btn_Exit.setText("종료");
        btn_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ExitActionPerformed(evt);
            }
        });

        lbl_Title.setBackground(new java.awt.Color(102, 102, 102));
        lbl_Title.setFont(new java.awt.Font("한컴 고딕", 1, 18)); // NOI18N
        lbl_Title.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Title.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lbl_Title.setText("PC방 시간 관리 프로그램");

        reset.setText("reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        Submit.setText("Submit");
        Submit.setToolTipText("");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });

        lable.setBackground(new java.awt.Color(255, 255, 255));
        lable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lable.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_Login)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtarea_Notice, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbl_Notice, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(btn_Signup, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btn_idpwsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btn_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_Pw)
                            .addComponent(lbl_Id))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(answer)
                            .addComponent(lable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_Id, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                            .addComponent(pw_pw))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_Login)
                            .addComponent(Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))))
            .addComponent(lbl_Title)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbl_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_Notice)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtarea_Notice, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(lbl_Login)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_Id))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_Pw)
                            .addComponent(pw_pw, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(btn_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(reset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lable, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(answer, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Signup, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_idpwsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

        class Captcha{
                Captcha(){
                int i; 
		Choice Index = new Choice(); 
		RText rtext= new RText();
		for(i=0;i<6;i++){ //lable 에 문자 셋팅
                    if(lable.getText().length() > 10){
                          lable.setText("");
                        }
			lable.setText(lable.getText() + rtext.randomChar());
                        
		}
		int y;
		i= Index.getRandom(0,25); // 문자 크기, 폰트 설정
                    switch (i) {
                        case 0:
                            y= Index.getRandom(20,30);
                            lable.setFont(new Font("Bauhaus 93", Font.PLAIN, y));
                            break;
                        case 1:
                            y= Index.getRandom(20,35);
                            lable.setFont(new Font("Bodoni MT Poster Compressed", Font.PLAIN, y));
                            break;
                        case 2:
                            y= Index.getRandom(20,35);
                            lable.setFont(new Font("Bodoni MT Black", Font.PLAIN, y));
                            break;
                        case 3:
                            y= Index.getRandom(20,35);
                            lable.setFont(new Font("Bradley Hand ITC", Font.PLAIN, y));
                            break;
                        case 4:
                            y= Index.getRandom(20,35);
                            lable.setFont(new Font("KG Broken Vessels SketchKG Broken Vessels Sketch", Font.PLAIN, y));
                            break;
                        case 5:
                            y= Index.getRandom(20,35);
                            lable.setFont(new Font("Jokerman", Font.PLAIN, y));
                            break;
                        case 6:
                            y= Index.getRandom(20,35);
                            lable.setFont(new Font("Harlow Solid Italic", Font.PLAIN, y));
                            break;
                        case 7:
                            y= Index.getRandom(20,35);
                            lable.setFont(new Font("Mistral", Font.PLAIN, y));
                            break;
                        case 8:
                            y= Index.getRandom(20,35);
                            lable.setFont(new Font("Informal Roman", Font.PLAIN, y));
                            break;
                        case 9:
                            y= Index.getRandom(20,35);
                            lable.setFont(new Font("Old English Text MT", Font.PLAIN, y));
                            break;
                        case 10:
                            y= Index.getRandom(20,35);
                            lable.setFont(new Font("French Script MT", Font.PLAIN, y));
                            break;
                        case 11:
                            y= Index.getRandom(20,35);
                            lable.setFont(new Font("Chiller", Font.PLAIN, y));
                            break;
                        case 12:
                            y= Index.getRandom(20,35);
                            lable.setFont(new Font("Gigi", Font.PLAIN, y));
                            break;
                        case 13:
                            y= Index.getRandom(20,35);
                            lable.setFont(new Font("Palace Script MT", Font.PLAIN, y));
                            break;
                        case 14:
                            y= Index.getRandom(20,35);
                            lable.setFont(new Font("Gabriola", Font.PLAIN, y));
                            break;
                        case 15:
                            y= Index.getRandom(20,35);
                            lable.setFont(new Font("Magneto", Font.PLAIN, y));
                            break;
                        case 16:
                            y= Index.getRandom(20,35);
                            lable.setFont(new Font("Gill Sans MT Ext Condensed Bold", Font.PLAIN, y));
                            break;
                        case 17:
                            y= Index.getRandom(20,35);
                            lable.setFont(new Font("Juice ITC", Font.PLAIN, y));
                            break;
                        case 18:
                            y= Index.getRandom(20,35);
                            lable.setFont(new Font("Onyx", Font.PLAIN, y));
                            break;
                        case 19:
                            y= Index.getRandom(20,35);
                            lable.setFont(new Font("Playbill", Font.PLAIN, y));
                            break;
                        case 20:
                            y= Index.getRandom(20,35);
                            lable.setFont(new Font("Parchment", Font.PLAIN, y));
                            break;
                        case 21:
                            y= Index.getRandom(20,35);
                            lable.setFont(new Font("Snap ITC", Font.PLAIN, y));
                            break;
                        case 22:
                            y= Index.getRandom(20,35);
                            lable.setFont(new Font("Blackadder ITC", Font.PLAIN, y));
                            break;
                        case 23:
                            y= Index.getRandom(20,35);
                            lable.setFont(new Font("Edwardian Script ITC", Font.PLAIN, y));
                            break;
                        default:
                            y= Index.getRandom(20,35);
                            lable.setFont(new Font("Niagara Engraved", Font.PLAIN, y));
                            break;
                    }
		
		
		int x = Index.getRandom(0,7); //문자 위치 설정
                    switch (x) {
                        case 0:
                            lable.setAlignmentX(1f);
                            lable.setAlignmentY(0.75f);
                            break;
                        case 1:
                            lable.setAlignmentX(4f);
                            lable.setAlignmentY(2f);
                            break;
                        case 2:
                            lable.setAlignmentX(1.7f);
                            lable.setAlignmentY(2f);
                            break;
                        case 3:
                            lable.setAlignmentX(2f);
                            lable.setAlignmentY(0.5f);
                            break;
                        case 4:
                            lable.setAlignmentX(2.5f);
                            lable.setAlignmentY(2f);
                            break;
                        case 5:
                            lable.setAlignmentX(3f);
                            lable.setAlignmentY(1.7f);
                            break;
                        case 6:
                            lable.setAlignmentX(1f);
                            lable.setAlignmentY(1f);
                            break;
                        default:
                            break;
                    }
	}
    }
    
    
    
    private void btn_SignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SignupActionPerformed
        new SignUpFrame().setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_btn_SignupActionPerformed

    private void btn_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ExitActionPerformed
       System.exit(0);
    }//GEN-LAST:event_btn_ExitActionPerformed

    private void btn_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LoginActionPerformed
        String id = txt_Id.getText().trim();
        String pw = new String(pw_pw.getPassword());
        String pw_sha512 = getSHA512(pw);
        //pw = getSHA512(pw); 암호화
        String sql = "SELECT ID, PW FROM MEMBER where ID='" + id + "' and PW='" + pw_sha512 + "'";

        if(id.length() ==  0){
           JOptionPane.showMessageDialog(null, "아이디를 입력해 주세요.", "아이디 입력", JOptionPane.WARNING_MESSAGE);
           txt_Id.grabFocus();
           click_reset();
        }
        else if(pw.trim().length() == 0){
           JOptionPane.showMessageDialog(null, "비밀번호를 입력해 주세요.", "비밀번호 입력", JOptionPane.WARNING_MESSAGE);
           pw_pw.grabFocus();
           click_reset();
        }
        else if(captcha_chk == false){
           JOptionPane.showMessageDialog(null, "캡챠를 입력해주세요", "캡챠 실패", JOptionPane.WARNING_MESSAGE);
           answer.grabFocus();
           click_reset();
        }
        else{
            try{
                DBM.dbOpen();
                DBM.DB_rs = DBM.DB_stmt.executeQuery(sql);
                
                if(DBM.DB_rs.next()){
                    JOptionPane.showMessageDialog(null,"로그인 성공","로그인 성공", JOptionPane.INFORMATION_MESSAGE);
                    new TimeFrame(id).setVisible(true);
                    this.dispose();
                }
                else{
                    sql = "SELECT ID, PW FROM MEMBER ID='" + id +"'";
                    DBM.DB_rs = DBM.DB_stmt.executeQuery(sql);
                    if(DBM.DB_rs.next()){
                        JOptionPane.showMessageDialog(null,"비밀번호가 일치하지 않습니다.","로그인 실패", JOptionPane.WARNING_MESSAGE);	
                        click_reset();
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"아이디 정보가 없습니다.","로그인 실패", JOptionPane.WARNING_MESSAGE);
                        click_reset();
                    }
                }
               }
            catch(Exception ex){
                click_reset();
                System.out.println(ex.getMessage());
                }
            }
            
    }//GEN-LAST:event_btn_LoginActionPerformed

    private void btn_idpwsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_idpwsearchActionPerformed
        new SeachIdPwFrame().setVisible(true);
    }//GEN-LAST:event_btn_idpwsearchActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
	if (reset()){
                    new Captcha();
		}
    }//GEN-LAST:event_resetActionPerformed

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
        String x = answer.getText();
	String y = lable.getText();
	if (check(y, x)){ //lable 문자, answer 문자 비교
            answer.setText("Success");
            captcha_chk = true;
            reset.setEnabled(false);
            Submit.setEnabled(false);
	}
	else {
            JOptionPane.showMessageDialog(null, "Please try again.",
                                    "Error", JOptionPane.ERROR_MESSAGE); 
			}
    }//GEN-LAST:event_SubmitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Submit;
    private javax.swing.JTextField answer;
    private javax.swing.JButton btn_Exit;
    private javax.swing.JButton btn_Login;
    private javax.swing.JButton btn_Signup;
    private javax.swing.JButton btn_idpwsearch;
    private javax.swing.JLabel lable;
    private javax.swing.JLabel lbl_Id;
    private javax.swing.JLabel lbl_Login;
    private javax.swing.JLabel lbl_Notice;
    private javax.swing.JLabel lbl_Pw;
    private javax.swing.JTextField lbl_Title;
    private javax.swing.JPasswordField pw_pw;
    private javax.swing.JButton reset;
    private javax.swing.JTextField txt_Id;
    private java.awt.TextArea txtarea_Notice;
    // End of variables declaration//GEN-END:variables
}
