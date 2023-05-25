
import java.sql.Date;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class AddTimeFrame extends javax.swing.JFrame {
    DB_conn DBM = new DB_conn();
    String strSQL = "Select * From time";
    public String name;
    public String Id;
    public int money; // db에는 cost
    public int r_time; // 남은시간
    public int u_time=0; // 사용시간
    

    public AddTimeFrame(String id, String name) {
        initComponents();   
        //TimeFrame에서 id값 받아오기
        Id=id;
        String strNameQuery;
        strNameQuery = "select name from member where id";
        
        try {
                DBM.dbOpen();
                DBM.DB_rs = DBM.DB_stmt.executeQuery(strNameQuery);
                
                /*
                if(DBM.DB_rs.next()){
                    lbl_Id.setText(name + "님" + "(id : " + id + ")");
                } else{
                    JOptionPane.showMessageDialog(null, id + "는 존재하지 않는 회원입니다.");
                }
                */
                DBM.dbClose();
            } catch (Exception e){
                System.out.println("SQLException : " + e.getMessage());
            }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_Title = new javax.swing.JTextField();
        lbl_Id = new javax.swing.JLabel();
        btn_30m = new javax.swing.JButton();
        btn_1h = new javax.swing.JButton();
        btn_4h = new javax.swing.JButton();
        btn_2h = new javax.swing.JButton();
        btn_8h = new javax.swing.JButton();
        txt_Pay = new javax.swing.JTextField();
        lbl_paytext = new javax.swing.JLabel();
        lbl_Money = new javax.swing.JLabel();
        lbl_pay = new javax.swing.JLabel();
        btn_Pay = new javax.swing.JButton();
        btn_Close = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_Title.setBackground(new java.awt.Color(102, 102, 102));
        lbl_Title.setFont(new java.awt.Font("한컴 고딕", 1, 18)); // NOI18N
        lbl_Title.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Title.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        lbl_Title.setText("  시간추가");
        lbl_Title.setPreferredSize(new java.awt.Dimension(140, 30));
        lbl_Title.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbl_TitleActionPerformed(evt);
            }
        });

        lbl_Id.setFont(new java.awt.Font("한컴 고딕", 1, 18)); // NOI18N

        btn_30m.setText("30분     1,000원");
        btn_30m.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_30mActionPerformed(evt);
            }
        });

        btn_1h.setText("1시간    2000원");
        btn_1h.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1hActionPerformed(evt);
            }
        });

        btn_4h.setText("4시간    8000원");
        btn_4h.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4hActionPerformed(evt);
            }
        });

        btn_2h.setText(" 2시간    4000원");
        btn_2h.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2hActionPerformed(evt);
            }
        });

        btn_8h.setText("8시간    15000원");
        btn_8h.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_8hActionPerformed(evt);
            }
        });

        txt_Pay.setBackground(new java.awt.Color(153, 153, 153));
        txt_Pay.setFont(new java.awt.Font("한컴 고딕", 1, 14)); // NOI18N
        txt_Pay.setForeground(new java.awt.Color(255, 255, 255));
        txt_Pay.setText("결제정보");

        lbl_paytext.setText("결제금액");

        lbl_Money.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N

        lbl_pay.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_pay.setText("0");

        btn_Pay.setBackground(new java.awt.Color(153, 204, 255));
        btn_Pay.setFont(new java.awt.Font("한컴 고딕", 1, 18)); // NOI18N
        btn_Pay.setForeground(new java.awt.Color(255, 255, 255));
        btn_Pay.setText("결   제");
        btn_Pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PayActionPerformed(evt);
            }
        });

        btn_Close.setBackground(new java.awt.Color(102, 102, 102));
        btn_Close.setFont(new java.awt.Font("한컴 고딕", 1, 18)); // NOI18N
        btn_Close.setForeground(new java.awt.Color(255, 255, 255));
        btn_Close.setText("취   소");
        btn_Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_Title, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_Id)
                    .addComponent(btn_30m, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_1h, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_2h, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_8h, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                    .addComponent(btn_4h, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_Pay, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lbl_paytext)
                            .addGap(1, 1, 1)
                            .addComponent(lbl_Money)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lbl_pay, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(btn_Pay, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_Close, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbl_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_Id)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_30m)
                    .addComponent(txt_Pay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_1h)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_paytext)
                        .addComponent(lbl_Money)
                        .addComponent(lbl_pay)))
                .addGap(18, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_2h)
                        .addGap(18, 18, 18)
                        .addComponent(btn_4h)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_Pay, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_Close, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_8h))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_TitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbl_TitleActionPerformed
    }//GEN-LAST:event_lbl_TitleActionPerformed

    private void btn_30mActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_30mActionPerformed
        r_time += 30;
        money += 1000;
        lbl_pay.setText(String.valueOf(money));
    }//GEN-LAST:event_btn_30mActionPerformed

    private void btn_1hActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1hActionPerformed
        r_time += 60;
        money += 2000;
        lbl_pay.setText(String.valueOf(money));
        
        
    }//GEN-LAST:event_btn_1hActionPerformed

    private void btn_2hActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2hActionPerformed
        r_time += 120;
        money += 4000;
        lbl_pay.setText(String.valueOf(money));
    }//GEN-LAST:event_btn_2hActionPerformed

    private void btn_4hActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4hActionPerformed
        r_time += 240;
        money += 8000;
        lbl_pay.setText(String.valueOf(money));
    }//GEN-LAST:event_btn_4hActionPerformed

    private void btn_8hActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_8hActionPerformed
        r_time += 480;
        money += 15000;
        lbl_pay.setText(String.valueOf(money));
    }//GEN-LAST:event_btn_8hActionPerformed

    private void btn_PayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PayActionPerformed
        
        new PayFrame(Id, r_time, money).setVisible(true);
        //여기에서 db저장 lbl_pay insert / order테이블에다가
            try {
                DBM.dbOpen();
                DBM.DB_stmt.executeUpdate(strSQL);
//                strSQL = "Select * From Member";
                DBM.dbClose();
                } catch (Exception e){
                System.out.println("SQLException : " + e.getMessage());
}
    }//GEN-LAST:event_btn_PayActionPerformed

    private void btn_CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CloseActionPerformed
       new TimeFrame().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btn_CloseActionPerformed


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddTimeFrame(null, null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_1h;
    private javax.swing.JButton btn_2h;
    private javax.swing.JButton btn_30m;
    private javax.swing.JButton btn_4h;
    private javax.swing.JButton btn_8h;
    private javax.swing.JButton btn_Close;
    private javax.swing.JButton btn_Pay;
    private javax.swing.JLabel lbl_Id;
    private javax.swing.JLabel lbl_Money;
    private javax.swing.JTextField lbl_Title;
    private javax.swing.JLabel lbl_pay;
    private javax.swing.JLabel lbl_paytext;
    private javax.swing.JTextField txt_Pay;
    // End of variables declaration//GEN-END:variables
}
