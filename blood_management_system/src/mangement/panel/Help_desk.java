
package mangement.panel;

import com.sun.glass.events.KeyEvent;
import java.awt.Color;
import java.awt.Cursor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import mangement.MySqlConnect;

public class Help_desk extends javax.swing.JPanel {
    
    private Cursor cursor;

    /**
     * Creates new form Help_desk
     */
    public Help_desk() {
        initComponents();
        
        help_textarea.setWrapStyleWord(true);
        help_textarea.setLineWrap(true);
        
        cursor = new Cursor(Cursor.HAND_CURSOR);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        phoneNumber = new javax.swing.JTextField();
        jSeparator14 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        help_textarea = new javax.swing.JTextArea();
        help_button = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();

        setForeground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(0, 51, 102));
        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("What do you need ?");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 147, 50));

        name.setBackground(new java.awt.Color(0, 51, 102));
        name.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setBorder(null);
        jPanel2.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 370, 30));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 370, 10));

        jLabel4.setBackground(new java.awt.Color(0, 51, 102));
        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Your email or contact number");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 210, 50));

        phoneNumber.setBackground(new java.awt.Color(0, 51, 102));
        phoneNumber.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        phoneNumber.setForeground(new java.awt.Color(255, 255, 255));
        phoneNumber.setBorder(null);
        jPanel2.add(phoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 370, 30));
        jPanel2.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 370, 10));

        jLabel3.setBackground(new java.awt.Color(0, 51, 102));
        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Your Name");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 147, 50));

        help_textarea.setBackground(new java.awt.Color(0, 51, 102));
        help_textarea.setColumns(20);
        help_textarea.setFont(new java.awt.Font("Monospaced", 0, 17)); // NOI18N
        help_textarea.setForeground(new java.awt.Color(255, 255, 255));
        help_textarea.setRows(5);
        help_textarea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 3));
        help_textarea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                help_textareaKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(help_textarea);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 410, 200));

        help_button.setBackground(new java.awt.Color(255, 255, 255));
        help_button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        help_button.setForeground(new java.awt.Color(255, 153, 51));
        help_button.setText("Help ");
        help_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                help_buttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                help_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                help_buttonMouseExited(evt);
            }
        });
        jPanel2.add(help_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 100, 40));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 550, 560));

        jPanel3.setBackground(new java.awt.Color(51, 0, 51));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Donate Blood Save Life");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, -1, 60));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Donate Blood_1.png"))); // NOI18N
        jLabel13.setToolTipText("");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 110, 72));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/help-desk.png"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 240, 260));
        jPanel3.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 300, 10));
        jPanel3.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, 230, 10));
        jPanel3.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 460, 120, 10));

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 560));
    }// </editor-fold>//GEN-END:initComponents

    private void help_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_help_buttonMouseEntered
       
        help_button.setBackground(Color.CYAN);
        help_button.setForeground(Color.BLACK);
        help_button.setCursor(cursor);
        
    }//GEN-LAST:event_help_buttonMouseEntered

    private void help_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_help_buttonMouseExited
        
        help_button.setBackground(Color.WHITE);
        help_button.setForeground(new Color(255,153,51));
    }//GEN-LAST:event_help_buttonMouseExited

     private boolean validateField(){
        
        
        if (name.getText().isEmpty() || phoneNumber.getText().isEmpty() || help_textarea.getText().isEmpty()){
            
            JOptionPane.showMessageDialog(null, "Please Fill up all Requirements Correctly","Warning",JOptionPane.PLAIN_MESSAGE);
            
            return false;
        }
        
        return true;
    }
    
    private void help_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_help_buttonMouseClicked
        
        if(validateField()){
        
        try
            {
                Connection conn= MySqlConnect.ConnectDB();
                String sql="INSERT into blood_management_system.help_desk(name,email_contactNumber,question) value (?,?,?)";
                PreparedStatement  pst=conn.prepareStatement(sql);
                pst.setString(1,name.getText());
                pst.setString(2, phoneNumber.getText());
                pst.setString(3,help_textarea.getText());
                
                pst.execute();
                 
                 JOptionPane.showMessageDialog(null, "Thanks. We wil notify you soon","Notification",JOptionPane.PLAIN_MESSAGE);
                 conn.close();
       
       }
       catch(Exception e)
       {
         
            JOptionPane.showMessageDialog(null, "something wrong","ERROR",JOptionPane.PLAIN_MESSAGE);
           
            }
        }
    }//GEN-LAST:event_help_buttonMouseClicked

    private void help_textareaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_help_textareaKeyPressed
        
        if (evt.getKeyChar()==KeyEvent.VK_ENTER){
            
            try
            {
                Connection conn= MySqlConnect.ConnectDB();
                String sql="Insert into blood_management_system.help_desk(name,email_contactNumber,question) value (?,?,?)";
                PreparedStatement  pst=conn.prepareStatement(sql);
                pst.setString(1,name.getText());
                pst.setString(2, phoneNumber.getText());
                pst.setString(3,help_textarea.getText());
                
                pst.execute();
                 
                 JOptionPane.showMessageDialog(null, "Thanks. We wil notify you soon","Notification",JOptionPane.PLAIN_MESSAGE);
                 conn.close();
       
       }
       catch(Exception e)
       {
         
            JOptionPane.showMessageDialog(null, "something wrong","ERROR",JOptionPane.PLAIN_MESSAGE);
           
            }
        }
    }//GEN-LAST:event_help_textareaKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton help_button;
    private javax.swing.JTextArea help_textarea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField name;
    private javax.swing.JTextField phoneNumber;
    // End of variables declaration//GEN-END:variables
}
