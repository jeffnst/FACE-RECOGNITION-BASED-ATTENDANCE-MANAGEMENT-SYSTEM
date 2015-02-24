/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Pre_FRAMS;

import business_logic.*;
import java.awt.Color;
import java.awt.Frame;
import static java.awt.Frame.getFrames;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
/**
 *
 * @author Ray24
 */
public class Schedual_dtls extends javax.swing.JPanel {

    /**
     * Creates new form Schedual_dtls
     */
    schedule sch=null;
    department dept=null;
    faculty fac=null;
    subject sub=null;
    sub_dept subdept=null;
    faculty_sub facsub=null;
    
    public Schedual_dtls() {
        initComponents();
        sch=new schedule();
        dept=new department();
        fac=new faculty();
        subdept=new sub_dept();
        facsub=new faculty_sub();
        sub=new subject();
        
        this.setBackground(Color.WHITE);
        panel_button.setBackground(Color.decode("#838EDE"));
        panel_main.setBackground(Color.decode("#838EDE"));
        panel_monday.setBackground(Color.decode("#838EDE"));
        
        String dep[]=dept.getAllDept();
        cmb_dept.removeAllItems();
        cmb_dept.addItem("Select Department");
        if(dep.length!=0)
        {
            for(int i=0;i<dep.length;i++)
            {
                cmb_dept.addItem(dep[i]);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_main = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cmb_dept = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        cmb_sem = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        txt_div = new javax.swing.JTextField();
        panel_button = new javax.swing.JPanel();
        btn_view = new javax.swing.JButton();
        btn_save = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_reset = new javax.swing.JButton();
        panel_monday = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        cmb_sub = new javax.swing.JComboBox();
        cmb_facid = new javax.swing.JComboBox();
        cmb_faculty = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_classroom = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_periodno = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cmb_day = new javax.swing.JComboBox();

        panel_main.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("Department :");

        cmb_dept.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Department" }));
        cmb_dept.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb_deptItemStateChanged(evt);
            }
        });

        jLabel2.setText("Semester :");

        cmb_sem.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Semester", "1", "2", "3", "4", "5", "6", "7", "8" }));
        cmb_sem.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb_semItemStateChanged(evt);
            }
        });

        jLabel3.setText("Division :");

        javax.swing.GroupLayout panel_mainLayout = new javax.swing.GroupLayout(panel_main);
        panel_main.setLayout(panel_mainLayout);
        panel_mainLayout.setHorizontalGroup(
            panel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_mainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmb_dept, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panel_mainLayout.createSequentialGroup()
                        .addGroup(panel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmb_sem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_div, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panel_mainLayout.setVerticalGroup(
            panel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_mainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmb_dept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmb_sem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_div, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btn_view.setBackground(new java.awt.Color(131, 142, 222));
        btn_view.setText("View");
        btn_view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_viewActionPerformed(evt);
            }
        });

        btn_save.setBackground(new java.awt.Color(131, 142, 222));
        btn_save.setText("Save");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        btn_update.setBackground(new java.awt.Color(131, 142, 222));
        btn_update.setText("Update");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        btn_delete.setBackground(new java.awt.Color(131, 142, 222));
        btn_delete.setText("Delete");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        btn_reset.setBackground(new java.awt.Color(131, 142, 222));
        btn_reset.setText("Reset");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_buttonLayout = new javax.swing.GroupLayout(panel_button);
        panel_button.setLayout(panel_buttonLayout);
        panel_buttonLayout.setHorizontalGroup(
            panel_buttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_buttonLayout.createSequentialGroup()
                .addGroup(panel_buttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_buttonLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(btn_delete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_reset))
                    .addGroup(panel_buttonLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btn_view)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_save)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_update)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        panel_buttonLayout.setVerticalGroup(
            panel_buttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_buttonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_buttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_view)
                    .addComponent(btn_save)
                    .addComponent(btn_update))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_buttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_delete)
                    .addComponent(btn_reset))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_monday.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setText("Subject :");

        cmb_sub.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Subject" }));
        cmb_sub.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb_subItemStateChanged(evt);
            }
        });

        cmb_facid.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select FacultyID" }));
        cmb_facid.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb_facidItemStateChanged(evt);
            }
        });

        cmb_faculty.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Faculty" }));
        cmb_faculty.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb_facultyItemStateChanged(evt);
            }
        });

        jLabel6.setText("Faculty :");

        jLabel7.setText("ClassRoom No. :");

        jLabel8.setText("Period No. :");

        jLabel5.setText("Faculty ID :");

        jLabel9.setText("Day :");

        cmb_day.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Day", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" }));

        javax.swing.GroupLayout panel_mondayLayout = new javax.swing.GroupLayout(panel_monday);
        panel_monday.setLayout(panel_mondayLayout);
        panel_mondayLayout.setHorizontalGroup(
            panel_mondayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_mondayLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_mondayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_mondayLayout.createSequentialGroup()
                        .addGroup(panel_mondayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panel_mondayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmb_facid, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmb_faculty, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel_mondayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(cmb_sub, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_mondayLayout.createSequentialGroup()
                            .addGroup(panel_mondayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel9)
                                .addComponent(jLabel8))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(panel_mondayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_periodno, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_classroom, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cmb_day, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        panel_mondayLayout.setVerticalGroup(
            panel_mondayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_mondayLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_mondayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cmb_day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_mondayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_classroom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_mondayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_periodno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_mondayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmb_sub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_mondayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cmb_faculty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_mondayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmb_facid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panel_monday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panel_monday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panel_main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panel_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmb_deptItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_deptItemStateChanged
        // TODO add your handling code here:
        if(evt.getStateChange()==java.awt.event.ItemEvent.SELECTED)
        {
        if(cmb_dept.getSelectedIndex()!=0)
        {
            String deptid=dept.getDeptID(cmb_dept.getSelectedItem().toString());
            String facid[]=fac.getFacultyIDbyDept(deptid);
            cmb_facid.removeAllItems();
            cmb_facid.addItem("Select FacultyID");
            cmb_faculty.removeAllItems();
            cmb_faculty.addItem("Select FacultyName");
            if(facid.length!=0)
            {
                user us=new user();
                for(int i=0;i<facid.length;i++)
                {
                    String facname=us.getFName(facid[i])+" "+us.getLName(facid[i]);
                    if(facid[i]!=null)
                    {
                        cmb_facid.addItem(facid[i]);
                        if(facname!=null)
                           {cmb_faculty.addItem(facname);}
                    }
                    
                }
            }
        }
        }
    }//GEN-LAST:event_cmb_deptItemStateChanged

    private void cmb_semItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_semItemStateChanged
        // TODO add your handling code here:
//        if(evt.getStateChange()==java.awt.event.ItemEvent.SELECTED)
//        {
        if(cmb_dept.getSelectedIndex()!=0 && cmb_sem.getSelectedIndex()!=0)
        {
            String subid[]=subdept.getSubIDbyDeptandSem(dept.getDeptID((String) cmb_dept.getSelectedItem()),Integer.parseInt((String) cmb_sem.getSelectedItem()));
            
            //System.out.println(subid.length);
            if(subid.length!=0)
            {
                cmb_sub.removeAllItems();
                cmb_sub.addItem("Select Subject");
                
                for(int i=0;i<subid.length;i++)
                {
                    String su=this.sub.getSub(subid[i]);
                    if(su!=null)
                    {
                        //System.out.println(su);
                        cmb_sub.addItem(su);
                    }
                    
                }
            }
        }
        SwingUtilities.updateComponentTreeUI(cmb_sub);
        //}
    }//GEN-LAST:event_cmb_semItemStateChanged

    private void cmb_subItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_subItemStateChanged
        // TODO add your handling code here:
        if(evt.getStateChange()==java.awt.event.ItemEvent.SELECTED)
        {
        if(cmb_sub.getSelectedIndex()!=0)
        {
            String facid[]=facsub.getFacultyIDbySubID(sub.getSubID(cmb_sub.getSelectedItem().toString()));
            if(facid.length!=0)
            {
                cmb_facid.removeAllItems();
            cmb_facid.addItem("Select FacultyID");
            cmb_faculty.removeAllItems();
            cmb_faculty.addItem("Select FacultyName");
                user us=new user();
                for(int i=0;i<facid.length;i++)
                {
                    String facname=us.getFName(facid[i])+" "+us.getLName(facid[i]);
                    if(facid[i]!=null)
                    {
                        cmb_facid.addItem(facid[i]);
                        if(facname!=null)
                           {cmb_faculty.addItem(facname);}
                    }
                }
            }
        }
        }
    }//GEN-LAST:event_cmb_subItemStateChanged

    private void cmb_facidItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_facidItemStateChanged
        // TODO add your handling code here:
        if(evt.getStateChange()==java.awt.event.ItemEvent.SELECTED)
        {
        if(cmb_facid.getSelectedIndex()!=0)
        {
            user us=new user();
            String facname=us.getFName(cmb_facid.getSelectedItem().toString())+" "+us.getLName(cmb_facid.getSelectedItem().toString());
            if(facname!=null)
            {cmb_faculty.setSelectedItem(facname);}
        }
        }
    }//GEN-LAST:event_cmb_facidItemStateChanged

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        // TODO add your handling code here:
        cmb_day.setSelectedIndex(0);
        cmb_dept.setSelectedIndex(0);
        cmb_facid.setSelectedIndex(0);
        cmb_faculty.setSelectedIndex(0);
        cmb_sem.setSelectedIndex(0);
        cmb_sub.setSelectedIndex(0);
        txt_classroom.setText("");
        txt_div.setText("");
        txt_periodno.setText("");
    }//GEN-LAST:event_btn_resetActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        // TODO add your handling code here:
        if(!txt_div.getText().equals("") && cmb_dept.getSelectedIndex()!=0 && cmb_sem.getSelectedIndex()!=0)
        {
        int v=JOptionPane.showConfirmDialog(panel_monday,"Are you sure?"+" The whole Schedule for"+cmb_dept.getSelectedItem()+" department "+cmb_sem.getSelectedItem()+" sem "+txt_div.getText()+" division");
        if(v==1)
        {
            boolean delete = sch.delete((String) cmb_dept.getSelectedItem(),Integer.parseInt((String)cmb_sem.getSelectedItem()),txt_div.getText());
            if(delete==true)
            {
                JOptionPane.showMessageDialog(panel_monday,"Deleted...");
            }
            else
            {
                JOptionPane.showMessageDialog(panel_monday,"Enter correct details ...");
            }
        }
        }
        else
        {
            JOptionPane.showMessageDialog(panel_monday,"Enter all the details...");
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        // TODO add your handling code here:
        if(cmb_day.getSelectedIndex()!=0&&cmb_dept.getSelectedIndex()!=0&&cmb_facid.getSelectedIndex()!=0&&cmb_sem.getSelectedIndex()!=0&&cmb_sub.getSelectedIndex()!=0&&!txt_classroom.getText().equals("")&&!txt_div.getText().equals("")&&!txt_periodno.getText().equals(""))
        {
            boolean update = sch.update(dept.getDeptID((String)cmb_dept.getSelectedItem()),Integer.parseInt((String)cmb_sem.getSelectedItem()),txt_div.getText(),(String)cmb_day.getSelectedItem(),Integer.parseInt(txt_classroom.getText()),Integer.parseInt(txt_periodno.getText()),sub.getSubID((String)cmb_sub.getSelectedItem()),(String)cmb_facid.getSelectedItem(),cmb_day.getSelectedIndex());
            if(update==true)
            {
                JOptionPane.showMessageDialog(panel_monday,"Updated...");
            }
            else
            {
                JOptionPane.showMessageDialog(panel_monday,"Enter correct details ...");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(panel_monday,"Enter all the details...");
        }
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        // TODO add your handling code here:
        if(cmb_day.getSelectedIndex()!=0&&cmb_dept.getSelectedIndex()!=0&&cmb_facid.getSelectedIndex()!=0&&cmb_sem.getSelectedIndex()!=0&&cmb_sub.getSelectedIndex()!=0&&!txt_classroom.getText().equals("")&&!txt_div.getText().equals("")&&!txt_periodno.getText().equals(""))
        {
            boolean update = sch.insert(dept.getDeptID((String)cmb_dept.getSelectedItem()),Integer.parseInt((String)cmb_sem.getSelectedItem()),txt_div.getText(),(String)cmb_day.getSelectedItem(),Integer.parseInt(txt_classroom.getText()),Integer.parseInt(txt_periodno.getText()),sub.getSubID((String)cmb_sub.getSelectedItem()),(String)cmb_facid.getSelectedItem(),cmb_day.getSelectedIndex());
            if(update==true)
            {
                JOptionPane.showMessageDialog(panel_monday,"Inserted...");
            }
            else
            {
                JOptionPane.showMessageDialog(panel_monday,"Enter correct details ...");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(panel_monday,"Enter all the details...");
        }
    }//GEN-LAST:event_btn_saveActionPerformed

    private void cmb_facultyItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_facultyItemStateChanged
        // TODO add your handling code here:
        if(evt.getStateChange()==java.awt.event.ItemEvent.SELECTED)
        {
        if(cmb_faculty.getSelectedIndex()!=0)
        {
            //user us=new user();
            //String facname=us.getFName(cmb_facid.getSelectedItem().toString())+" "+us.getLName(cmb_facid.getSelectedItem().toString());
            //if(facname!=null)
            cmb_facid.setSelectedIndex(cmb_faculty.getSelectedIndex());
        }
        }
    }//GEN-LAST:event_cmb_facultyItemStateChanged

    private void btn_viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_viewActionPerformed
        // TODO add your handling code here:
        if(cmb_dept.getSelectedIndex()!=0&&cmb_sem.getSelectedIndex()!=0&&txt_div.getText().equals(""))
        {
            String name="timetable";
            Map param=new HashMap();
            param.put("dept",dept.getDeptID((String)cmb_dept.getSelectedItem()));
            param.put("div",txt_div.getText());
            param.put("sem",Integer.parseInt((String)cmb_sem.getSelectedItem()));
            param.put("dept_name",(String)cmb_dept.getSelectedItem());
            sample_report sm=new sample_report();
            sm.showReport(name, param);
            Frame[] f=getFrames();
        for(int i=0;i<f.length;i++)
        {
            String sd=f[i].getName();
            if(sd.equals("Admin_main"))
            {
                f[i].setEnabled(false);
            }
        }
        }
        else
        {
            JOptionPane.showMessageDialog(panel_monday,"Enter Department,Semester and Division...");
        }
    }//GEN-LAST:event_btn_viewActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_reset;
    private javax.swing.JButton btn_save;
    private javax.swing.JButton btn_update;
    private javax.swing.JButton btn_view;
    private javax.swing.JComboBox cmb_day;
    private javax.swing.JComboBox cmb_dept;
    private javax.swing.JComboBox cmb_facid;
    private javax.swing.JComboBox cmb_faculty;
    private javax.swing.JComboBox cmb_sem;
    private javax.swing.JComboBox cmb_sub;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel panel_button;
    private javax.swing.JPanel panel_main;
    private javax.swing.JPanel panel_monday;
    private javax.swing.JTextField txt_classroom;
    private javax.swing.JTextField txt_div;
    private javax.swing.JTextField txt_periodno;
    // End of variables declaration//GEN-END:variables
}