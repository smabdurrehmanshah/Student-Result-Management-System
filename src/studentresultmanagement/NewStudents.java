/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package studentresultmanagement;


import javax.swing.JOptionPane;
import java.sql.* ;

/**
 *
 * @author Abdur Rehman Shah
 */

public class NewStudents extends javax.swing.JFrame {

    /**
     * Creates new form NewStudents
     */
    public NewStudents() {
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
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblFatherName = new javax.swing.JLabel();
        txtFatherName = new javax.swing.JTextField();
        lblGender = new javax.swing.JLabel();
        cmbGender = new javax.swing.JComboBox<>();
        lblProgram = new javax.swing.JLabel();
        cmbProgram = new javax.swing.JComboBox<>();
        lblDateOfBirth = new javax.swing.JLabel();
        txtDate = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        txtRollNo = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnNewStudentBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("New Students");
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(51, 102, 0));

        lblName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblName.setForeground(new java.awt.Color(153, 204, 0));
        lblName.setText("Name ");

        txtName.setPreferredSize(new java.awt.Dimension(200, 30));

        lblFatherName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblFatherName.setForeground(new java.awt.Color(153, 204, 0));
        lblFatherName.setText("Father Name ");

        txtFatherName.setPreferredSize(new java.awt.Dimension(220, 30));

        lblGender.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblGender.setForeground(new java.awt.Color(153, 204, 0));
        lblGender.setText("Gender");

        cmbGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Select>", "Male", "Female", "Others" }));
        cmbGender.setPreferredSize(new java.awt.Dimension(200, 30));

        lblProgram.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblProgram.setForeground(new java.awt.Color(153, 204, 0));
        lblProgram.setText("Program");

        cmbProgram.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Select>", "Computer Science", "Software Engineering", "Data Science", "BBA", "Bio Techonology" }));
        cmbProgram.setPreferredSize(new java.awt.Dimension(200, 30));

        lblDateOfBirth.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblDateOfBirth.setForeground(new java.awt.Color(153, 204, 0));
        lblDateOfBirth.setText("Date of Birth");

        txtDate.setPreferredSize(new java.awt.Dimension(200, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 204, 0));
        jLabel1.setText("Roll No");

        txtRollNo.setPreferredSize(new java.awt.Dimension(200, 30));

        btnAdd.setBackground(new java.awt.Color(153, 204, 0));
        btnAdd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(51, 102, 0));
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentresultmanagement/Add-2.png"))); // NOI18N
        btnAdd.setText("Add");
        btnAdd.setPreferredSize(new java.awt.Dimension(100, 30));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnNewStudentBack.setBackground(new java.awt.Color(153, 204, 0));
        btnNewStudentBack.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnNewStudentBack.setForeground(new java.awt.Color(51, 102, 0));
        btnNewStudentBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentresultmanagement/back.png"))); // NOI18N
        btnNewStudentBack.setText("Back");
        btnNewStudentBack.setPreferredSize(new java.awt.Dimension(100, 30));
        btnNewStudentBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewStudentBackActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 204, 0));
        jLabel2.setText("Student Result Management System");

        jButton1.setBackground(new java.awt.Color(153, 204, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 102, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentresultmanagement/update.png"))); // NOI18N
        jButton1.setText("Update");
        jButton1.setPreferredSize(new java.awt.Dimension(100, 30));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(153, 204, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 102, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentresultmanagement/delete.png"))); // NOI18N
        jButton2.setText("Delete");
        jButton2.setPreferredSize(new java.awt.Dimension(97, 30));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(159, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(btnNewStudentBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblFatherName)
                                .addComponent(lblName)
                                .addComponent(lblGender)
                                .addComponent(lblProgram)
                                .addComponent(lblDateOfBirth))
                            .addGap(60, 60, 60)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtRollNo, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtFatherName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cmbGender, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cmbProgram, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(128, 128, 128))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAdd, btnNewStudentBack, jButton1, jButton2});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFatherName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFatherName))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGender)
                    .addComponent(cmbGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbProgram, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProgram))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDateOfBirth))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtRollNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNewStudentBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
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

    private void btnNewStudentBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewStudentBackActionPerformed
        // TODO add your handling code here:
        this.toBack();
        setVisible(false);
        new AdminHome().toFront();
        new AdminHome().setState(java.awt.Frame.NORMAL);
    }//GEN-LAST:event_btnNewStudentBackActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        java.util.Date selectedDate = txtDate.getDate();
        java.sql.Date sqlDate = new java.sql.Date(selectedDate.getTime());
        if(validateFields())
        {
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentresultmanagementsystem","root","syed@1234");
                String sql = "insert into studentpersonalinfo values (?,?,?,?,?,?,?)";
                PreparedStatement pstmt = conn.prepareStatement(sql);
                pstmt.setInt(1, Integer.parseInt(txtRollNo.getText()));
                pstmt.setString(2, (String)cmbProgram.getSelectedItem());
                pstmt.setString(3, txtName.getText());
                pstmt.setString(4, (String)cmbGender.getSelectedItem());
                pstmt.setDate(5, sqlDate);
                pstmt.setString(6, txtFatherName.getText());
                pstmt.setBoolean(7, true);
                pstmt.executeUpdate();
                JOptionPane.showMessageDialog(this, "New Student added Successfully...");
                conn.close();
                resetFields();
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
           
            
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        java.util.Date selectedDate = txtDate.getDate();
        java.sql.Date sqlDate = new java.sql.Date(selectedDate.getTime());
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentresultmanagementsystem","root","syed@1234");
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from studentpersonalinfo where Roll_No = '"+Integer.parseInt(txtRollNo.getText())+"'");
            if(rs.next())
            {
                String sql = "update studentpersonalinfo set Program = ? , Name = ? , Gender = ? , Date_of_Birth = ? , Father_Name = ? where Roll_No = '"+Integer.parseInt(txtRollNo.getText())+"'";
                PreparedStatement pstmt = conn.prepareStatement(sql);
                pstmt.setString(1, (String)cmbProgram.getSelectedItem());
                pstmt.setString(2, txtName.getText());
                pstmt.setString(3, (String)cmbGender.getSelectedItem());
                pstmt.setDate(4, sqlDate);
                pstmt.setString(5, txtFatherName.getText());
                pstmt.executeUpdate();
                JOptionPane.showMessageDialog(this, "Record Updated Successfully...");
                conn.close();
                resetFields();
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Roll No does not exists...");
                resetFields();
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new DeleteStudent().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(NewStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewStudents().setVisible(true);
            }
        });
    }
    
    private boolean validateFields()
    {
        if(txtName.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Enter Name...");
            txtName.grabFocus();
            return false ;
        }
        if(txtFatherName.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Enter Father Name...");
            txtFatherName.grabFocus();
            return false ;
        }
        if(cmbGender.getSelectedIndex() == 0)
        {
            JOptionPane.showMessageDialog(this, "Select Gender...");
            cmbGender.grabFocus();
            return false ;
        }
        if(cmbProgram.getSelectedIndex() == 0)
        {
            JOptionPane.showMessageDialog(this, "Select any Program...");
            cmbProgram.grabFocus();
            return false ;
        }
        if(txtDate.getDate() == null)
        {
            JOptionPane.showMessageDialog(this, "Select Date...");
            txtDate.grabFocus();
            return false ;
        }
        if(txtRollNo.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Enter Roll No...");
            txtRollNo.grabFocus();
            return false;
        }
        
        return true ;
    }
    
    private void resetFields()
    {
        
        txtName.setText("");
        txtFatherName.setText("");
        txtRollNo.setText("");
        cmbProgram.setSelectedIndex(0);
        cmbGender.setSelectedIndex(0);
        txtDate.setDate(null);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnNewStudentBack;
    private javax.swing.JComboBox<String> cmbGender;
    private javax.swing.JComboBox<String> cmbProgram;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDateOfBirth;
    private javax.swing.JLabel lblFatherName;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblProgram;
    private com.toedter.calendar.JDateChooser txtDate;
    private javax.swing.JTextField txtFatherName;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtRollNo;
    // End of variables declaration//GEN-END:variables
}