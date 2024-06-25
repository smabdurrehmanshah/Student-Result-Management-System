/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package studentresultmanagement;

import javax.swing.JOptionPane;
import java.sql.*;
/**
 *
 * @author Abdur Rehman Shah
 */
public class NewResult extends javax.swing.JFrame {

    /**
     * Creates new form NewResult
     */
    double sum = 0.0 ;
    
    public NewResult() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblSubject1 = new javax.swing.JLabel();
        lblSubject2 = new javax.swing.JLabel();
        lblSubject3 = new javax.swing.JLabel();
        lblSubject4 = new javax.swing.JLabel();
        lblSubject5 = new javax.swing.JLabel();
        lblSubject6 = new javax.swing.JLabel();
        txtSubject1 = new javax.swing.JTextField();
        txtSubject2 = new javax.swing.JTextField();
        txtSubject3 = new javax.swing.JTextField();
        txtSubject4 = new javax.swing.JTextField();
        txtSubject5 = new javax.swing.JTextField();
        txtSubject6 = new javax.swing.JTextField();
        txtSubject1Marks = new javax.swing.JTextField();
        txtSubject2Marks = new javax.swing.JTextField();
        txtSubject3Marks = new javax.swing.JTextField();
        txtSubject4Marks = new javax.swing.JTextField();
        txtSubject5Marks = new javax.swing.JTextField();
        txtSubject6Marks = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnSaveMarks = new javax.swing.JButton();
        btnBackResult = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtRollNoResult = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtSemesterNo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("New Result");
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(51, 102, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 204, 0));
        jLabel1.setText("Student Result Management System");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 204, 0));
        jLabel2.setText("Enter Subjects Name");

        lblSubject1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblSubject1.setForeground(new java.awt.Color(153, 204, 0));
        lblSubject1.setText("Subject-1");

        lblSubject2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblSubject2.setForeground(new java.awt.Color(153, 204, 0));
        lblSubject2.setText("Subject-2");

        lblSubject3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblSubject3.setForeground(new java.awt.Color(153, 204, 0));
        lblSubject3.setText("Subject-3");

        lblSubject4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblSubject4.setForeground(new java.awt.Color(153, 204, 0));
        lblSubject4.setText("Subject-4");

        lblSubject5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblSubject5.setForeground(new java.awt.Color(153, 204, 0));
        lblSubject5.setText("Subject-5");

        lblSubject6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblSubject6.setForeground(new java.awt.Color(153, 204, 0));
        lblSubject6.setText("Subject-6");

        txtSubject1.setPreferredSize(new java.awt.Dimension(200, 30));

        txtSubject2.setPreferredSize(new java.awt.Dimension(200, 30));

        txtSubject3.setPreferredSize(new java.awt.Dimension(200, 30));

        txtSubject4.setPreferredSize(new java.awt.Dimension(200, 30));

        txtSubject5.setPreferredSize(new java.awt.Dimension(200, 30));

        txtSubject6.setPreferredSize(new java.awt.Dimension(200, 30));

        txtSubject1Marks.setPreferredSize(new java.awt.Dimension(100, 30));

        txtSubject2Marks.setPreferredSize(new java.awt.Dimension(100, 30));

        txtSubject3Marks.setPreferredSize(new java.awt.Dimension(100, 30));

        txtSubject4Marks.setPreferredSize(new java.awt.Dimension(100, 30));

        txtSubject5Marks.setPreferredSize(new java.awt.Dimension(100, 30));

        txtSubject6Marks.setPreferredSize(new java.awt.Dimension(100, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 204, 0));
        jLabel3.setText("Enter Marks");

        btnSaveMarks.setBackground(new java.awt.Color(153, 204, 0));
        btnSaveMarks.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSaveMarks.setForeground(new java.awt.Color(51, 102, 0));
        btnSaveMarks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentresultmanagement/save.png"))); // NOI18N
        btnSaveMarks.setText("Save");
        btnSaveMarks.setPreferredSize(new java.awt.Dimension(100, 30));
        btnSaveMarks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveMarksActionPerformed(evt);
            }
        });

        btnBackResult.setBackground(new java.awt.Color(153, 204, 0));
        btnBackResult.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBackResult.setForeground(new java.awt.Color(51, 102, 0));
        btnBackResult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentresultmanagement/back.png"))); // NOI18N
        btnBackResult.setText("Back");
        btnBackResult.setPreferredSize(new java.awt.Dimension(100, 30));
        btnBackResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackResultActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 204, 0));
        jLabel4.setText("Enter Roll No");

        txtRollNoResult.setPreferredSize(new java.awt.Dimension(100, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 204, 0));
        jLabel5.setText("Semester No");

        txtSemesterNo.setPreferredSize(new java.awt.Dimension(115, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(38, 38, 38))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(134, 134, 134)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtSubject1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtSubject2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtSubject3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSubject1Marks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSubject2Marks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSubject3Marks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSubject1)
                                    .addComponent(lblSubject2)
                                    .addComponent(lblSubject3)
                                    .addComponent(lblSubject4)
                                    .addComponent(lblSubject5)
                                    .addComponent(lblSubject6))
                                .addGap(54, 54, 54)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtSubject4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtSubject4Marks, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(txtSubject6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtSubject6Marks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(txtSubject5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtSubject5Marks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(btnSaveMarks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(btnBackResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addContainerGap(132, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txtRollNoResult, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txtSemesterNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(132, 132, 132))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnBackResult, btnSaveMarks});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtRollNoResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtSemesterNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSubject1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtSubject1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtSubject1Marks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(33, 33, 33)
                                .addComponent(lblSubject2))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtSubject2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtSubject2Marks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30)
                        .addComponent(lblSubject3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSubject3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtSubject3Marks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblSubject4)
                        .addGap(33, 33, 33)
                        .addComponent(lblSubject5)
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtSubject6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtSubject6Marks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblSubject6)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtSubject4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtSubject4Marks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(58, 58, 58))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSubject5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSubject5Marks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSaveMarks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBackResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackResultActionPerformed
        // TODO add your handling code here:
        this.dispose();           
    }//GEN-LAST:event_btnBackResultActionPerformed

    private void btnSaveMarksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveMarksActionPerformed
        // TODO add your handling code here:
        int rollNo = Integer.parseInt(txtRollNoResult.getText());
        int semesterNo = Integer.parseInt(txtSemesterNo.getText());
        int sem ;
        if(semesterNo >= 1 && semesterNo <=8)
        {
            sem = semesterNo ;
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Invalid Semester No...");
            return ;
        }
        if(validateFields())
        {
            
            
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentresultmanagementsystem","root","syed@1234");
                Statement st = conn.createStatement();
                Statement st2 = conn.createStatement();
                ResultSet rs = st.executeQuery("select * from studentpersonalinfo where Roll_No='"+rollNo+"'");
                ResultSet rs2 = st2.executeQuery("select * from results where Semester_No = '"+sem+"' AND Roll_No = '"+rollNo+"'");
                if(rs.next())
                {
                    if(!rs2.next())
                    {
                        String sql = "insert into results values (?,?,?,?,?,?)";
                        PreparedStatement pstmt = conn.prepareStatement(sql);
                        pstmt.setInt(1, Integer.parseInt(txtRollNoResult.getText()));
                        pstmt.setInt(2,sem);
                        pstmt.setString(3, txtSubject1.getText());
                        pstmt.setInt(4, 100);
                        pstmt.setInt(5, Integer.parseInt(txtSubject1Marks.getText()));
                        pstmt.setDouble(6, getGPA(txtSubject1Marks.getText()));
                        pstmt.addBatch();
                        pstmt.setInt(1, Integer.parseInt(txtRollNoResult.getText()));
                        pstmt.setInt(2, sem);
                        pstmt.setString(3, txtSubject2.getText());
                        pstmt.setInt(4, 100);
                        pstmt.setInt(5, Integer.parseInt(txtSubject2Marks.getText()));
                        pstmt.setDouble(6, getGPA(txtSubject2Marks.getText()));
                        pstmt.addBatch();
                        pstmt.setInt(1, Integer.parseInt(txtRollNoResult.getText()));
                        pstmt.setInt(2,sem);
                        pstmt.setString(3, txtSubject3.getText());
                        pstmt.setInt(4, 100);
                        pstmt.setInt(5, Integer.parseInt(txtSubject3Marks.getText()));
                        pstmt.setDouble(6, getGPA(txtSubject3Marks.getText()));
                        pstmt.addBatch();
                        pstmt.setInt(1, Integer.parseInt(txtRollNoResult.getText()));
                        pstmt.setInt(2, sem);
                        pstmt.setString(3, txtSubject4.getText());
                        pstmt.setInt(4, 100);
                        pstmt.setInt(5, Integer.parseInt(txtSubject4Marks.getText()));
                        pstmt.setDouble(6, getGPA(txtSubject4Marks.getText()));
                        pstmt.addBatch();
                        pstmt.setInt(1, Integer.parseInt(txtRollNoResult.getText()));
                        pstmt.setInt(2, sem);
                        pstmt.setString(3, txtSubject5.getText());
                        pstmt.setInt(4, 100);
                        pstmt.setInt(5, Integer.parseInt(txtSubject5Marks.getText()));
                        pstmt.setDouble(6, getGPA(txtSubject5Marks.getText()));
                        pstmt.addBatch();
                        pstmt.setInt(1, Integer.parseInt(txtRollNoResult.getText()));
                        pstmt.setInt(2, sem);
                        pstmt.setString(3, txtSubject6.getText());
                        pstmt.setInt(4, 100);
                        pstmt.setInt(5, Integer.parseInt(txtSubject6Marks.getText()));
                        pstmt.setDouble(6, getGPA(txtSubject6Marks.getText()));
                        pstmt.addBatch();
                        pstmt.executeBatch();
                        insertStudentsResultRecord();
                        JOptionPane.showMessageDialog(this, "Updated Successfully...");
                        conn.close(); 
                        resetFields();
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(this, "Roll No : "+rollNo+". Semester : "+sem+" result is already exist in our Database...");
                    }
                   
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "Roll No does not exist in our Database...");
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
            
            
        }
    }//GEN-LAST:event_btnSaveMarksActionPerformed

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
            java.util.logging.Logger.getLogger(NewResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewResult().setVisible(true);
            }
        });
    }
    
    private boolean validateFields()
    {
        if(txtRollNoResult.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Enter Roll No...");
            txtRollNoResult.grabFocus();
            return false ;
        }
        if(txtSemesterNo.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Enter Semester No...");
            txtSemesterNo.grabFocus();
            return false ;
        }
        if(txtSubject1.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Enter subject-1 Name...");
            txtSubject1.grabFocus();
            return false ;
        }
        if(txtSubject1Marks.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Enter subject-1 Marks...");
            txtSubject1Marks.grabFocus();
            return false ;
        }
        if(txtSubject2.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Enter subject-2 Name...");
            txtSubject2.grabFocus();
            return false ;
        }
        if(txtSubject2Marks.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Enter subject-2 Marks...");
            txtSubject2Marks.grabFocus();
            return false ;
        }
        if(txtSubject3.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Enter subject-3 Name...");
            txtSubject3.grabFocus();
            return false ;
        }
        if(txtSubject3Marks.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Enter subject-3 Marks...");
            txtSubject3Marks.grabFocus();
            return false ;
        }
        if(txtSubject4.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Enter subject-4 Name...");
            txtSubject4.grabFocus();
            return false ;
        }
        if(txtSubject4Marks.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Enter subject-4 Marks...");
            txtSubject4Marks.grabFocus();
            return false ;
        }
        if(txtSubject5.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Enter subject-5 Name...");
            txtSubject5.grabFocus();
            return false ;
        }
        if(txtSubject5Marks.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Enter subject-5 Marks...");
            txtSubject5Marks.grabFocus();
            return false ;
        }
        if(txtSubject6.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Enter subject-6 Name...");
            txtSubject6.grabFocus();
            return false ;
        }
        if(txtSubject6Marks.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Enter subject-6 Marks...");
            txtSubject6Marks.grabFocus();
            return false ;
        }
        
        return true ;
    }
    
    private void resetFields()
    {
        txtRollNoResult.setText("");
        txtSemesterNo.setText("");
        txtSubject1.setText("");
        txtSubject1Marks.setText("");
        txtSubject2.setText("");
        txtSubject2Marks.setText("");
        txtSubject3.setText("");
        txtSubject3Marks.setText("");
        txtSubject4.setText("");
        txtSubject4Marks.setText("");
        txtSubject5.setText("");
        txtSubject5Marks.setText("");
        txtSubject6.setText("");
        txtSubject6Marks.setText("");
    }
    
    private double getGPA(String marks)
    {
        double Marks = Double.parseDouble(marks);
        if(Marks < 60)
        {
            sum += 0 ;
            return 0 ;
        }
        else if(Marks >= 60 && Marks <=65 )
        {
            sum += 2.0 ;
            return 2.0 ;
        }
        else if(Marks >=66 && Marks <= 71 )
        {
            sum += 2.5 ;
            return 2.5 ;
        }
        else if(Marks >=72 && Marks <=79)
        {
            sum += 3.0 ;
            return 3.0 ;
        }
        else if(Marks >= 80 && Marks <= 86)
        {
            sum += 3.5 ;
            return 3.5 ;
        }
        else
        {
            sum += 4.0 ;
            return 4.0 ;
        }
        
    }
    
    private void insertStudentsResultRecord()
    {
        double avg = sum/6 ;
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentresultmanagementsystem","root","syed@1234");
            String sql = "insert into studentsresultrecord values (?,?,?,?,?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, Integer.parseInt(txtRollNoResult.getText()));
            pstmt.setInt(2, Integer.parseInt(txtRollNoResult.getText()));
            pstmt.setInt(3, Integer.parseInt(txtSemesterNo.getText()));
            pstmt.setInt(4, Integer.parseInt(txtRollNoResult.getText()));
            pstmt.setDouble(5, avg);
            pstmt.executeUpdate();
            conn.close();     
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }   
    }
    
    
   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackResult;
    private javax.swing.JButton btnSaveMarks;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblSubject1;
    private javax.swing.JLabel lblSubject2;
    private javax.swing.JLabel lblSubject3;
    private javax.swing.JLabel lblSubject4;
    private javax.swing.JLabel lblSubject5;
    private javax.swing.JLabel lblSubject6;
    private javax.swing.JTextField txtRollNoResult;
    private javax.swing.JTextField txtSemesterNo;
    private javax.swing.JTextField txtSubject1;
    private javax.swing.JTextField txtSubject1Marks;
    private javax.swing.JTextField txtSubject2;
    private javax.swing.JTextField txtSubject2Marks;
    private javax.swing.JTextField txtSubject3;
    private javax.swing.JTextField txtSubject3Marks;
    private javax.swing.JTextField txtSubject4;
    private javax.swing.JTextField txtSubject4Marks;
    private javax.swing.JTextField txtSubject5;
    private javax.swing.JTextField txtSubject5Marks;
    private javax.swing.JTextField txtSubject6;
    private javax.swing.JTextField txtSubject6Marks;
    // End of variables declaration//GEN-END:variables
}
