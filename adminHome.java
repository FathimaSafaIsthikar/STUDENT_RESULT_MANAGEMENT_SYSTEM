
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class adminHome extends javax.swing.JFrame {
    /**
     * Creates new form adminHome
     */
    public adminHome() {
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

        btn_std = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btn_stdmanage = new javax.swing.JButton();
        btn_resultmanage = new javax.swing.JButton();
        btn_rgstdview = new javax.swing.JButton();
        btn_stdresult = new javax.swing.JButton();
        btn_logout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cmb_course = new javax.swing.JComboBox<>();
        lbl_name = new javax.swing.JLabel();
        lbl_name1 = new javax.swing.JLabel();
        lbl_name2 = new javax.swing.JLabel();
        lbl_name3 = new javax.swing.JLabel();
        lbl_name4 = new javax.swing.JLabel();
        cmb_branch = new javax.swing.JComboBox<>();
        lbl_name5 = new javax.swing.JLabel();
        lbl_name6 = new javax.swing.JLabel();
        cmb_gender = new javax.swing.JComboBox<>();
        txt_rollnum = new javax.swing.JTextField();
        txt_name = new javax.swing.JTextField();
        txt_fname = new javax.swing.JTextField();
        btn_add = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_reset = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_view = new javax.swing.JTable();

        btn_std.setBackground(new java.awt.Color(102, 102, 102));
        btn_std.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_std.setText("Student");
        btn_std.setBorder(new javax.swing.border.MatteBorder(null));
        btn_std.setBorderPainted(false);
        btn_std.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_stdActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        btn_stdmanage.setBackground(new java.awt.Color(153, 153, 153));
        btn_stdmanage.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_stdmanage.setForeground(new java.awt.Color(153, 0, 0));
        btn_stdmanage.setText("Manage Students");
        btn_stdmanage.setBorderPainted(false);
        btn_stdmanage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_stdmanageActionPerformed(evt);
            }
        });

        btn_resultmanage.setBackground(new java.awt.Color(153, 153, 153));
        btn_resultmanage.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_resultmanage.setForeground(new java.awt.Color(255, 102, 102));
        btn_resultmanage.setText("Manage Results");
        btn_resultmanage.setMaximumSize(new java.awt.Dimension(147, 29));
        btn_resultmanage.setMinimumSize(new java.awt.Dimension(147, 29));
        btn_resultmanage.setPreferredSize(new java.awt.Dimension(147, 29));
        btn_resultmanage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resultmanageActionPerformed(evt);
            }
        });

        btn_rgstdview.setBackground(new java.awt.Color(153, 153, 153));
        btn_rgstdview.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_rgstdview.setForeground(new java.awt.Color(255, 102, 102));
        btn_rgstdview.setText(" Registered Students");
        btn_rgstdview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_rgstdviewActionPerformed(evt);
            }
        });

        btn_stdresult.setBackground(new java.awt.Color(153, 153, 153));
        btn_stdresult.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_stdresult.setForeground(new java.awt.Color(255, 102, 102));
        btn_stdresult.setText("Students Result");
        btn_stdresult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_stdresultActionPerformed(evt);
            }
        });

        btn_logout.setBackground(new java.awt.Color(153, 153, 153));
        btn_logout.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_logout.setForeground(new java.awt.Color(255, 102, 102));
        btn_logout.setText("Log Out");
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("Admin Panel");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_stdmanage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_resultmanage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_rgstdview, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_stdresult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btn_stdmanage, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(btn_resultmanage, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_rgstdview, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_stdresult, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                .addComponent(btn_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        cmb_course.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cmb_course.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "B.tech", " " }));
        cmb_course.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(0, 0, 0)));

        lbl_name.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_name.setText("Course Name");

        lbl_name1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_name1.setText("Branch Name");

        lbl_name2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_name2.setText("Roll Number");

        lbl_name3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_name3.setText("Gender");

        lbl_name4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_name4.setText("Name");

        cmb_branch.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cmb_branch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CSE", "IT", "Mechanics", "Electrical" }));
        cmb_branch.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(0, 0, 0)));

        lbl_name5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_name5.setText("Father's Name");

        lbl_name6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_name6.setForeground(new java.awt.Color(255, 102, 102));
        lbl_name6.setText("Manage Students");

        cmb_gender.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cmb_gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", " " }));
        cmb_gender.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(0, 0, 0)));

        txt_rollnum.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_rollnum.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(102, 102, 102)));

        txt_name.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_name.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(102, 102, 102)));

        txt_fname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_fname.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(102, 102, 102)));
        txt_fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_fnameActionPerformed(evt);
            }
        });

        btn_add.setBackground(new java.awt.Color(102, 102, 102));
        btn_add.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_add.setForeground(new java.awt.Color(153, 0, 0));
        btn_add.setText("Add");
        btn_add.setBorder(new javax.swing.border.MatteBorder(null));
        btn_add.setBorderPainted(false);
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        btn_update.setBackground(new java.awt.Color(102, 102, 102));
        btn_update.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_update.setForeground(new java.awt.Color(153, 0, 0));
        btn_update.setText("Update");
        btn_update.setBorder(new javax.swing.border.MatteBorder(null));
        btn_update.setBorderPainted(false);
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        btn_delete.setBackground(new java.awt.Color(102, 102, 102));
        btn_delete.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_delete.setForeground(new java.awt.Color(153, 0, 0));
        btn_delete.setText("Delete");
        btn_delete.setBorder(new javax.swing.border.MatteBorder(null));
        btn_delete.setBorderPainted(false);
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        btn_reset.setBackground(new java.awt.Color(102, 102, 102));
        btn_reset.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_reset.setForeground(new java.awt.Color(153, 0, 0));
        btn_reset.setText("Reset");
        btn_reset.setBorder(new javax.swing.border.MatteBorder(null));
        btn_reset.setBorderPainted(false);
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });

        tbl_view.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tbl_view.setForeground(new java.awt.Color(255, 102, 102));
        tbl_view.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Roll Number", "Course Name", "Branch Name", "Name", "Gender", "Father's Name"
            }
        ));
        tbl_view.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_viewMouseClicked(evt);
            }
        });
        tbl_view.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                tbl_viewComponentShown(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_view);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(lbl_name6)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_name3)
                            .addComponent(lbl_name5)
                            .addComponent(lbl_name4)
                            .addComponent(lbl_name)
                            .addComponent(lbl_name1)
                            .addComponent(lbl_name2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmb_course, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_rollnum, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmb_branch, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_fname, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmb_gender, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_update, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_add, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_delete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_reset, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(97, 97, 97))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lbl_name6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_rollnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_name2)
                    .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmb_course, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_name))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(51, 51, 51)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbl_name4)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lbl_name1)
                                        .addGap(86, 86, 86)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(lbl_name3)
                                            .addComponent(cmb_gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbl_name5)
                                    .addComponent(txt_fname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(cmb_branch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(btn_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_stdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_stdActionPerformed

    }//GEN-LAST:event_btn_stdActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        // TODO add your handling code here
        
        
        String rollNo=txt_rollnum.getText();
        String course=(String)cmb_course.getSelectedItem();
        String branch=(String)cmb_branch.getSelectedItem();
        String name=txt_name.getText();
        String gender=(String)cmb_gender.getSelectedItem();
        String fatherName=txt_fname.getText();
        
        if(rollNo.equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null,"Roll Number field is empty");
        }
        else if(name.equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null,"Name field is empty");
        }
        else if(fatherName.equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null,"Father Name field is empty");
        }
        else{
             try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/srm","root","");
            Statement st=con.createStatement();
            st.executeUpdate("insert into student(rollNo,course,branch,name,gender,fatherName) values ('"+rollNo+"','"+course+"','"+branch+"','"+name+"','"+gender+"','"+fatherName+"')");
//            JOptionPane.showMessageDialog(null,"Successfully Added");
           
            String data[]={rollNo,course,branch,name,gender,fatherName};
            DefaultTableModel model=(DefaultTableModel)tbl_view.getModel();
            model.addRow(data);
            JOptionPane.showMessageDialog(null,"Successfully Added");
            
            
            
            st.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
            setVisible(false);
            new adminHome().setVisible(true);
        }
        }
        

       
//        public void showTableData(){
//
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        // TODO add your handling code here:
        frame=new JFrame("Exit");

        if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to logout","MySQL Connector",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
        {
            System.exit(0);
        }

    }//GEN-LAST:event_btn_logoutActionPerformed

    private void btn_stdresultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_stdresultActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new studentsResult().setVisible(true);
    }//GEN-LAST:event_btn_stdresultActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        // TODO add your handling code here:
         String rollNo=txt_rollnum.getText();
        String course=(String)cmb_course.getSelectedItem();
        String branch=(String)cmb_branch.getSelectedItem();
        String name=txt_name.getText();
        String gender=(String)cmb_gender.getSelectedItem();
        String fatherName=txt_fname.getText();

        
        if(rollNo.equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null,"Roll Number field is empty");
        }
        else if(name.equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null,"Name field is empty");
        }
        else if(fatherName.equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null,"Father Name field is empty");
        }
        else{
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/srm","root","");
            Statement st=con.createStatement();
            st.executeUpdate("update student set course='"+course+"',branch='"+branch+"',name='"+name+"',gender='"+gender+"',fatherName='"+fatherName+"' where rollNo='"+rollNo+"'");
            
             DefaultTableModel model=(DefaultTableModel)tbl_view.getModel();
            
            
             if(tbl_view.getSelectedRowCount()==1){
                
                model.setValueAt(rollNo,tbl_view.getSelectedRow(),0);
                model.setValueAt(course,tbl_view.getSelectedRow(),1);
                model.setValueAt(branch,tbl_view.getSelectedRow(),2);
                model.setValueAt(name,tbl_view.getSelectedRow(),3);
                model.setValueAt(gender,tbl_view.getSelectedRow(),4);
                model.setValueAt(fatherName,tbl_view.getSelectedRow(),5);
                
                JOptionPane.showMessageDialog(null,"Successfully Updated");
            }
             else{
                 if(tbl_view.getSelectedRowCount()==0){
                     JOptionPane.showMessageDialog(null,"Table is Empty");
                 }
                 else{
                     JOptionPane.showMessageDialog(null,"Please select single row for update..");
                 }
             }
            
            st.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
            setVisible(false);
            new adminHome().setVisible(true);
        }
        
        
        }
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        // TODO add your handling code here:
         String rollNo=txt_rollnum.getText();
        String course=(String)cmb_course.getSelectedItem();
        String branch=(String)cmb_branch.getSelectedItem();
        String name=txt_name.getText();
        String gender=(String)cmb_gender.getSelectedItem();
        String fatherName=txt_fname.getText();
        
         if(rollNo.equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null,"Roll Number field is empty");
        }
       
        else{
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/srm","root","");
            Statement st=con.createStatement();
            st.executeUpdate("delete  from student where rollNo='"+rollNo+"'");
            
            DefaultTableModel model=(DefaultTableModel)tbl_view.getModel();
            
            if(tbl_view.getSelectedRowCount()==1){
                
                model.removeRow(tbl_view.getSelectedRow());
                JOptionPane.showMessageDialog(null,"Successfully Deleted");
                
            }
             else{
                 if(tbl_view.getRowCount()==0){
                     JOptionPane.showMessageDialog(null,"Table is Empty");
                 }
                 else{
                     JOptionPane.showMessageDialog(null,"Please select single row for delete..");
                 }
             }
           
            st.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
            setVisible(false);
            new adminHome().setVisible(true);
        }
         }
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        // TODO add your handling code here:
         txt_rollnum.setText("");
        
        txt_name.setText("");
      
        txt_fname.setText("");
        

       
    }//GEN-LAST:event_btn_resetActionPerformed

    private void tbl_viewComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_tbl_viewComponentShown
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tbl_viewComponentShown

    private void btn_stdmanageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_stdmanageActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new adminHome().setVisible(true);
        
    }//GEN-LAST:event_btn_stdmanageActionPerformed

    private void btn_resultmanageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resultmanageActionPerformed
        // TODO add your handling code here:
         setVisible(false);
        new insertNewResult().setVisible(true);
    }//GEN-LAST:event_btn_resultmanageActionPerformed

    private void txt_fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_fnameActionPerformed

    private void tbl_viewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_viewMouseClicked
        // TODO add your handling code here:
//        DefaultTableModel tblModel=(DefaultTableModel)tbl_view.getModel();
//        String tblrollNum=tblModel.getValueAt(tbl_view.getSelectedRow(),0).toString();
//        txt_rollnum.setText(tblrollNum);
    }//GEN-LAST:event_tbl_viewMouseClicked

    private void btn_rgstdviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_rgstdviewActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new registeredStudents().setVisible(true);
    }//GEN-LAST:event_btn_rgstdviewActionPerformed
private JFrame frame;
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
            java.util.logging.Logger.getLogger(adminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_logout;
    private javax.swing.JButton btn_reset;
    private javax.swing.JButton btn_resultmanage;
    private javax.swing.JButton btn_rgstdview;
    private javax.swing.JButton btn_std;
    private javax.swing.JButton btn_stdmanage;
    private javax.swing.JButton btn_stdresult;
    private javax.swing.JButton btn_update;
    private javax.swing.JComboBox<String> cmb_branch;
    private javax.swing.JComboBox<String> cmb_course;
    private javax.swing.JComboBox<String> cmb_gender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_name;
    private javax.swing.JLabel lbl_name1;
    private javax.swing.JLabel lbl_name2;
    private javax.swing.JLabel lbl_name3;
    private javax.swing.JLabel lbl_name4;
    private javax.swing.JLabel lbl_name5;
    private javax.swing.JLabel lbl_name6;
    private javax.swing.JTable tbl_view;
    private javax.swing.JTextField txt_fname;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_rollnum;
    // End of variables declaration//GEN-END:variables
}
