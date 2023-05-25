
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class SeachIdPwFrame extends javax.swing.JFrame {
    DB_conn DBM = new DB_conn();

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
    
    public SeachIdPwFrame() {
        initComponents();
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

        lbl_Title = new javax.swing.JTextField();
        txt_birth = new javax.swing.JTextField();
        lbl_birth = new javax.swing.JLabel();
        lbl_name2 = new javax.swing.JLabel();
        txt_Id = new javax.swing.JTextField();
        txt_name2 = new javax.swing.JTextField();
        lbl_Id = new javax.swing.JLabel();
        lbl_Name1 = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        btn_Searchid = new javax.swing.JButton();
        txt_Totalprice = new javax.swing.JTextField();
        txt_Totalprice1 = new javax.swing.JTextField();
        btn_Searchpw = new javax.swing.JButton();
        btn_Exit = new javax.swing.JButton();
        txt_Totalprice2 = new javax.swing.JTextField();
        btn_pwChange = new javax.swing.JButton();
        lbl_pw = new javax.swing.JLabel();
        txt_Id1 = new javax.swing.JTextField();
        lbl_Id1 = new javax.swing.JLabel();
        lbl_pw1 = new javax.swing.JLabel();
        txt_pwChange = new javax.swing.JPasswordField();
        txt_pw = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_Title.setBackground(new java.awt.Color(102, 102, 102));
        lbl_Title.setFont(new java.awt.Font("한컴 고딕", 1, 18)); // NOI18N
        lbl_Title.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Title.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lbl_Title.setText("아이디 / 비밀번호 찾기");

        lbl_birth.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N
        lbl_birth.setText("생년월일(yyyymmdd)");

        lbl_name2.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N
        lbl_name2.setText("이름");

        lbl_Id.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N
        lbl_Id.setText("아이디");

        lbl_Name1.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N
        lbl_Name1.setText("이름");

        btn_Searchid.setBackground(new java.awt.Color(153, 204, 255));
        btn_Searchid.setFont(new java.awt.Font("한컴 고딕", 1, 18)); // NOI18N
        btn_Searchid.setForeground(new java.awt.Color(255, 255, 255));
        btn_Searchid.setText("아이디 찾기");
        btn_Searchid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SearchidActionPerformed(evt);
            }
        });

        txt_Totalprice.setBackground(new java.awt.Color(153, 153, 153));
        txt_Totalprice.setFont(new java.awt.Font("한컴 고딕", 1, 14)); // NOI18N
        txt_Totalprice.setForeground(new java.awt.Color(255, 255, 255));
        txt_Totalprice.setText("비밀번호 찾기");

        txt_Totalprice1.setBackground(new java.awt.Color(153, 153, 153));
        txt_Totalprice1.setFont(new java.awt.Font("한컴 고딕", 1, 14)); // NOI18N
        txt_Totalprice1.setForeground(new java.awt.Color(255, 255, 255));
        txt_Totalprice1.setText("아이디 찾기");

        btn_Searchpw.setBackground(new java.awt.Color(153, 204, 255));
        btn_Searchpw.setFont(new java.awt.Font("한컴 고딕", 1, 18)); // NOI18N
        btn_Searchpw.setForeground(new java.awt.Color(255, 255, 255));
        btn_Searchpw.setText("비밀번호 초기화");
        btn_Searchpw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SearchpwActionPerformed(evt);
            }
        });

        btn_Exit.setBackground(new java.awt.Color(241, 241, 241));
        btn_Exit.setFont(new java.awt.Font("한컴 고딕", 1, 14)); // NOI18N
        btn_Exit.setText("종료");
        btn_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ExitActionPerformed(evt);
            }
        });

        txt_Totalprice2.setBackground(new java.awt.Color(153, 153, 153));
        txt_Totalprice2.setFont(new java.awt.Font("한컴 고딕", 1, 14)); // NOI18N
        txt_Totalprice2.setForeground(new java.awt.Color(255, 255, 255));
        txt_Totalprice2.setText("비밀번호 찾기");

        btn_pwChange.setBackground(new java.awt.Color(153, 204, 255));
        btn_pwChange.setFont(new java.awt.Font("한컴 고딕", 1, 18)); // NOI18N
        btn_pwChange.setForeground(new java.awt.Color(255, 255, 255));
        btn_pwChange.setText("비밀번호 변경");
        btn_pwChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pwChangeActionPerformed(evt);
            }
        });

        lbl_pw.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N
        lbl_pw.setText("비밀번호");

        lbl_Id1.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N
        lbl_Id1.setText("아이디");

        lbl_pw1.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N
        lbl_pw1.setText("변경할 비밀번호");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_Title)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_Exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_Totalprice1)
                            .addComponent(lbl_Name1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_name)
                            .addComponent(txt_birth)
                            .addComponent(lbl_birth)
                            .addComponent(btn_Searchid, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbl_name2)
                                    .addComponent(lbl_Id)
                                    .addComponent(txt_name2)
                                    .addComponent(btn_Searchpw, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_Id, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_Totalprice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 2, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_Id1)
                                    .addComponent(btn_pwChange, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_Totalprice2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_pwChange, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_Id1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_pw)
                                    .addComponent(lbl_pw1))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txt_pw))))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbl_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Totalprice1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Totalprice, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_Name1)
                            .addComponent(lbl_Id))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_name2)
                            .addComponent(lbl_birth, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_birth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_name2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_pw1)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_Totalprice2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_Id1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Id1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_pw)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_pw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_pwChange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_Searchid, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_Searchpw, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_pwChange, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_SearchidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SearchidActionPerformed
        String name = txt_name.getText().trim();
        String birth = txt_birth.getText().trim();
        String sql = "select ID from MEMBER where name='" + name + "' and birthday= str_to_date('" + birth + "', '%Y%m%d' )";
        
        Pattern p = Pattern.compile("(^[0-9]*$)"); //생년월일 숫자만 입력했는지 확인
        Matcher m = p.matcher(birth);
        
        if(name.length() ==  0){ // name = null
           JOptionPane.showMessageDialog(null, "이름을 입력해 주세요.", "아이디 찾기 실패", JOptionPane.WARNING_MESSAGE);
           txt_name.grabFocus();
        }
        else if(birth.length() == 0){ // birth = null
           JOptionPane.showMessageDialog(null, "생년월일을 입력해 주세요.", "아이디 찾기 실패", JOptionPane.WARNING_MESSAGE);
           txt_birth.grabFocus();
        }
        else if(!(birth.length() == 8)){ 
           JOptionPane.showMessageDialog(null, "생년월일 8자리를 입력해 주세요.", "아이디 찾기 실패", JOptionPane.WARNING_MESSAGE);
           txt_birth.grabFocus();
        }
        else if(!(m.find())){
           JOptionPane.showMessageDialog(null, "생년월일에 숫자를 입력해 주세요.", "아이디 찾기 실패", JOptionPane.WARNING_MESSAGE);
           txt_birth.grabFocus();
        }
        else{
            try{
                DBM.dbOpen();
                DBM.DB_rs = DBM.DB_stmt.executeQuery(sql);
                  
                if(DBM.DB_rs.next()){ //db에 찾는 id가 있으면
                      String id_db = DBM.DB_rs.getString("ID");
                      JOptionPane.showMessageDialog(null, id_db, "아이디 찾기 성공", JOptionPane.WARNING_MESSAGE);
                      this.dispose();    
                }
                else{
                    JOptionPane.showMessageDialog(null, "회원정보를 찾을 수 없습니다.", "아이디 찾기 실패", JOptionPane.WARNING_MESSAGE);
                }
            }
            catch(Exception ex){
                System.out.println(ex.getMessage());
                }
        }
    }//GEN-LAST:event_btn_SearchidActionPerformed

    private void btn_SearchpwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SearchpwActionPerformed
        String id = txt_Id.getText().trim();
        String name = txt_name2.getText().trim();
        String sql = "select * from MEMBER where ID='" + id + "' and name='" + name + "'";
        
        if(id.length() ==  0){ //id = null
           JOptionPane.showMessageDialog(null, "아이디를 입력해 주세요.", "비밀번호 초기화 실패", JOptionPane.WARNING_MESSAGE);
           txt_Id.grabFocus();
        }
        else if(name.length() == 0){ // name = null
           JOptionPane.showMessageDialog(null, "이름을 입력해 주세요.", "비밀번호 초기화 실패", JOptionPane.WARNING_MESSAGE);
           txt_name2.grabFocus();
        }
        else{
               try{
                    DBM.dbOpen();
                    DBM.DB_rs = DBM.DB_stmt.executeQuery(sql);
                  
                  if(DBM.DB_rs.next()){ //db에 찾는 pw가 있으면
                      String pw_sha512 = getSHA512("1234");
                      String sql_Update = "update member set pw='" + pw_sha512 + "' where id='" + id + "'";
                      int result = DBM.DB_stmt.executeUpdate(sql_Update);
                      //String pw_db = DBM.DB_rs.getString("PW");
                      if(result == 1){
                        JOptionPane.showMessageDialog(null, "비밀번호 1234로 변경되었습니다.", "비밀번호 초기화 성공.", JOptionPane.WARNING_MESSAGE);
                        DBM.dbClose();
                        this.dispose();
                      } else {
                         JOptionPane.showMessageDialog(null, "문제가 발생했습니다", "비밀번호 초기화 실패.", JOptionPane.WARNING_MESSAGE);
                    }
                      
                    }
                  else{
                      JOptionPane.showMessageDialog(null, "회원정보를 찾을 수 없습니다.", "비밀번호 초기화 실패", JOptionPane.WARNING_MESSAGE);
                  }
               }
            catch(Exception ex){
                System.out.println(ex.getMessage());
                }
        }
    }//GEN-LAST:event_btn_SearchpwActionPerformed

    private void btn_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ExitActionPerformed
       this.dispose();
    }//GEN-LAST:event_btn_ExitActionPerformed

    private void btn_pwChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pwChangeActionPerformed
        String id = txt_Id1.getText().trim();
        String pw = new String(txt_pw.getPassword());
        String pw_sha512 = getSHA512(pw.trim());
        String pw_change = new String(txt_pwChange.getPassword());
        String pw_chage_sha512 = getSHA512(pw_change.trim());
        String sql = "select * from MEMBER where ID='" + id + "' and pw='" + pw_sha512 + "'";
        
        if(id.length() ==  0){ //id = null
           JOptionPane.showMessageDialog(null, "아이디를 입력해 주세요.", "비밀번호 변경 실패", JOptionPane.WARNING_MESSAGE);
           txt_Id1.grabFocus();
        }
        else if(pw.trim().length() == 0){ // name = null
           JOptionPane.showMessageDialog(null, "비밀번호를 입력해 주세요.", "비밀번호 변경 실패", JOptionPane.WARNING_MESSAGE);
           txt_pw.grabFocus();
        }
        else if(pw_change.trim().length() == 0){ // pw_change = null
           JOptionPane.showMessageDialog(null, "변경할 비밀번호를 입력해 주세요.", "비밀번호 변경 실패", JOptionPane.WARNING_MESSAGE);
           txt_pwChange.grabFocus();
        }
        else{
            try{
                DBM.dbOpen();
                DBM.DB_rs = DBM.DB_stmt.executeQuery(sql);
                
                if(DBM.DB_rs.next()){
                    String sql_Update = "update member set pw='"  +  pw_chage_sha512 + "' where id='" + id + "'";
                    int result = DBM.DB_stmt.executeUpdate(sql_Update);
                    if(result == 1){
                        JOptionPane.showMessageDialog(null, "비밀번호 변경되었습니다.", "비밀번호 변경 성공.", JOptionPane.WARNING_MESSAGE);
                        DBM.dbClose();
                        this.dispose();
                    } else{
                        JOptionPane.showMessageDialog(null, "문제가 발생했습니다", "비밀번호 변경 실패.", JOptionPane.WARNING_MESSAGE);
                    }
                } else{
                    JOptionPane.showMessageDialog(null, "회원정보를 찾을 수 없습니다.", "비밀번호 변경 실패", JOptionPane.WARNING_MESSAGE);
                }
            } catch(Exception ex){
                 System.out.println(ex.getMessage());
            }
        }
    }//GEN-LAST:event_btn_pwChangeActionPerformed

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
            java.util.logging.Logger.getLogger(SeachIdPwFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SeachIdPwFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SeachIdPwFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SeachIdPwFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SeachIdPwFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Exit;
    private javax.swing.JButton btn_Searchid;
    private javax.swing.JButton btn_Searchpw;
    private javax.swing.JButton btn_pwChange;
    private javax.swing.JLabel lbl_Id;
    private javax.swing.JLabel lbl_Id1;
    private javax.swing.JLabel lbl_Name1;
    private javax.swing.JTextField lbl_Title;
    private javax.swing.JLabel lbl_birth;
    private javax.swing.JLabel lbl_name2;
    private javax.swing.JLabel lbl_pw;
    private javax.swing.JLabel lbl_pw1;
    private javax.swing.JTextField txt_Id;
    private javax.swing.JTextField txt_Id1;
    private javax.swing.JTextField txt_Totalprice;
    private javax.swing.JTextField txt_Totalprice1;
    private javax.swing.JTextField txt_Totalprice2;
    private javax.swing.JTextField txt_birth;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_name2;
    private javax.swing.JPasswordField txt_pw;
    private javax.swing.JPasswordField txt_pwChange;
    // End of variables declaration//GEN-END:variables
}
