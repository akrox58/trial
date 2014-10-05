
package quiz.portal;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.List;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.awt.event.*;
import java.util.Date;
import static quiz.portal.login.getuser;
import java.awt.event.*;
import javax.swing.Timer;




public class tamil extends javax.swing.JFrame implements ActionListener{

   int points=0;
   static int counter=60;
     Timer timer=null;
   String q1,q2,q3,q4,q5;
    public tamil() {
        initComponents();
         timer=new Timer(1000, (ActionListener) this);
        getContentPane().setBackground(Color.WHITE);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    }
    public void actionPerformed(ActionEvent e){
if(counter==0)
{
timer.stop();
JOptionPane.showMessageDialog(null, "Sorry! your time is over! :(");
calc();
dispose();
}
javax.swing.SwingUtilities.invokeLater(new updateCount());
}
public class updateCount implements Runnable{
@Override
public void run(){
counter=counter-1;//update the counter value
//label.setText("the time is "+counter+" seconds");
label.setText("YOUR COUNTDOWN:"+counter+"" );
//your JProgressBar code can go here
//or any other code that you may like
}
}
     public void close()
    {
        WindowEvent win=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(win);
        
    }
     
public static Connection connect()
{Connection con=null;
    try{
        
    Class<?> forName = Class.forName("com.mysql.jdbc.Driver");
            con=  DriverManager.getConnection( "jdbc:mysql://localhost/quiz", "root", "roshini");
    
           
  
    }
    catch(Exception e)
    {
        System.out.println(e);
        
    }
    return con;
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt2 = new javax.swing.JTextField();
        txt4 = new javax.swing.JTextField();
        txt1 = new javax.swing.JTextField();
        txt3 = new javax.swing.JTextField();
        txt5 = new javax.swing.JTextField();
        c1 = new javax.swing.JRadioButton();
        a3 = new javax.swing.JRadioButton();
        a2 = new javax.swing.JRadioButton();
        a1 = new javax.swing.JRadioButton();
        b3 = new javax.swing.JRadioButton();
        b2 = new javax.swing.JRadioButton();
        b4 = new javax.swing.JRadioButton();
        a4 = new javax.swing.JRadioButton();
        d1 = new javax.swing.JRadioButton();
        e1 = new javax.swing.JRadioButton();
        c3 = new javax.swing.JRadioButton();
        d3 = new javax.swing.JRadioButton();
        e3 = new javax.swing.JRadioButton();
        c4 = new javax.swing.JRadioButton();
        d4 = new javax.swing.JRadioButton();
        e4 = new javax.swing.JRadioButton();
        c2 = new javax.swing.JRadioButton();
        d2 = new javax.swing.JRadioButton();
        e2 = new javax.swing.JRadioButton();
        b1 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jPanel1.setLayout(null);
        jPanel1.add(txt2);
        txt2.setBounds(30, 180, 830, 30);
        jPanel1.add(txt4);
        txt4.setBounds(30, 390, 820, 30);

        txt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt1ActionPerformed(evt);
            }
        });
        jPanel1.add(txt1);
        txt1.setBounds(30, 70, 830, 30);
        jPanel1.add(txt3);
        txt3.setBounds(30, 290, 830, 30);
        jPanel1.add(txt5);
        txt5.setBounds(30, 500, 820, 30);
        jPanel1.add(c1);
        c1.setBounds(40, 330, 310, 21);
        jPanel1.add(a3);
        a3.setBounds(40, 150, 310, 21);
        jPanel1.add(a2);
        a2.setBounds(470, 120, 280, 21);
        jPanel1.add(a1);
        a1.setBounds(40, 120, 310, 23);
        jPanel1.add(b3);
        b3.setBounds(40, 260, 310, 21);
        jPanel1.add(b2);
        b2.setBounds(470, 230, 280, 21);
        jPanel1.add(b4);
        b4.setBounds(470, 260, 280, 21);
        jPanel1.add(a4);
        a4.setBounds(470, 150, 280, 21);
        jPanel1.add(d1);
        d1.setBounds(40, 430, 310, 21);

        e1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e1ActionPerformed(evt);
            }
        });
        jPanel1.add(e1);
        e1.setBounds(40, 540, 310, 21);
        jPanel1.add(c3);
        c3.setBounds(40, 360, 310, 21);
        jPanel1.add(d3);
        d3.setBounds(40, 460, 310, 21);
        jPanel1.add(e3);
        e3.setBounds(40, 570, 310, 21);
        jPanel1.add(c4);
        c4.setBounds(470, 360, 280, 21);
        jPanel1.add(d4);
        d4.setBounds(470, 470, 280, 21);
        jPanel1.add(e4);
        e4.setBounds(470, 570, 280, 20);
        jPanel1.add(c2);
        c2.setBounds(470, 330, 280, 21);

        d2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d2ActionPerformed(evt);
            }
        });
        jPanel1.add(d2);
        d2.setBounds(470, 440, 280, 21);
        jPanel1.add(e2);
        e2.setBounds(470, 540, 280, 21);
        jPanel1.add(b1);
        b1.setBounds(40, 230, 310, 21);

        jButton1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(153, 0, 153));
        jButton1.setText("SUBMIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(360, 610, 190, 20);

        jButton3.setFont(new java.awt.Font("Tempus Sans ITC", 3, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(153, 0, 153));
        jButton3.setText("READY SET GO!!!! :D");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(100, 20, 170, 23);

        jButton4.setFont(new java.awt.Font("Tempus Sans ITC", 3, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(153, 0, 153));
        jButton4.setText("NEXT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(550, 20, 230, 30);
        jPanel1.add(label);
        label.setBounds(334, 24, 150, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1015, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void calc()
{
     try
        {
            Connection con=null;
            con=connect();
            if(a1.isSelected())
            {
            PreparedStatement st1=null;
            ResultSet rs1;
   String sql1="select points from bpoints where anstype='A01' and bansid=? ";
   st1=con.prepareStatement(sql1);
   st1.setString(1,q1);
   rs1=st1.executeQuery();
   while(rs1.next())
   {
  int c=rs1.getInt(1);
  points+=c;
  }
            }
             if(a2.isSelected())
            {
            PreparedStatement st2=null;
            ResultSet rs2;
   String sql2="select points from bpoints where anstype='A02' and bansid=? ";
   st2=con.prepareStatement(sql2);
   st2.setString(1,q1);
   rs2=st2.executeQuery();
   while(rs2.next())
   {
  int c=rs2.getInt(1);
  points+=c;
  }
            }
if(a3.isSelected())
            {
            PreparedStatement st3=null;
            ResultSet rs3;
   String sql3="select points from bpoints where anstype='A03' and bansid=? ";
   st3=con.prepareStatement(sql3);
   st3.setString(1,q1);
   rs3=st3.executeQuery();
   while(rs3.next())
   {
  int c=rs3.getInt(1);
  points+=c;
  }
            }
if(a4.isSelected())
            {
            PreparedStatement st4=null;
            ResultSet rs4;
   String sql4="select points from bpoints where anstype='A04' and bansid=? ";
   st4=con.prepareStatement(sql4);
   st4.setString(1,q1);
   rs4=st4.executeQuery();
   while(rs4.next())
   {
  int c=rs4.getInt(1);
  points+=c;
  }
            }

if(b1.isSelected())
            {
            PreparedStatement st1=null;
            ResultSet rs1;
   String sql1="select points from bpoints where anstype='A01' and bansid=? ";
   st1=con.prepareStatement(sql1);
   st1.setString(1,q2);
   rs1=st1.executeQuery();
   while(rs1.next())
   {
  int c=rs1.getInt(1);
  points+=c;
  }
            }
if(b2.isSelected())
            {
            PreparedStatement st2=null;
            ResultSet rs2;
   String sql2="select points from bpoints where anstype='A02' and bansid=? ";
   st2=con.prepareStatement(sql2);
   st2.setString(1,q2);
   rs2=st2.executeQuery();
   while(rs2.next())
   {
  int c=rs2.getInt(1);
  points+=c;
  }
            }
if(b3.isSelected())
            {
            PreparedStatement st3=null;
            ResultSet rs3;
   String sql3="select points from bpoints where anstype='A03' and bansid=? ";
   st3=con.prepareStatement(sql3);
   st3.setString(1,q2);
   rs3=st3.executeQuery();
   while(rs3.next())
   {
  int c=rs3.getInt(1);
  points+=c;
  }
            }
if(b4.isSelected())
            {
            PreparedStatement st4=null;
            ResultSet rs4;
   String sql4="select points from bpoints where anstype='A04' and bansid=? ";
   st4=con.prepareStatement(sql4);
   st4.setString(1,q2);
   rs4=st4.executeQuery();
   while(rs4.next())
   {
  int c=rs4.getInt(1);
  points+=c;
  }
            }

if(c1.isSelected())
            {
            PreparedStatement st1=null;
            ResultSet rs1;
   String sql1="select points from bpoints where anstype='A01' and bansid=? ";
   st1=con.prepareStatement(sql1);
   st1.setString(1,q3);
   rs1=st1.executeQuery();
   while(rs1.next())
   {
  int c=rs1.getInt(1);
  points+=c;
  }
            }
if(c2.isSelected())
            {
            PreparedStatement st2=null;
            ResultSet rs2;
   String sql2="select points from bpoints where anstype='A02' and bansid=? ";
   st2=con.prepareStatement(sql2);
   st2.setString(1,q3);
   rs2=st2.executeQuery();
   while(rs2.next())
   {
  int c=rs2.getInt(1);
  points+=c;
  }
            }
if(c3.isSelected())
            {
            PreparedStatement st3=null;
            ResultSet rs3;
   String sql3="select points from bpoints where anstype='A03' and bansid=? ";
   st3=con.prepareStatement(sql3);
   st3.setString(1,q3);
   rs3=st3.executeQuery();
   while(rs3.next())
   {
  int c=rs3.getInt(1);
  points+=c;
  }
            }
if(c4.isSelected())
            {
            PreparedStatement st4=null;
            ResultSet rs4;
   String sql4="select points from bpoints where anstype='A04' and bansid=? ";
   st4=con.prepareStatement(sql4);
   st4.setString(1,q3);
   rs4=st4.executeQuery();
   while(rs4.next())
   {
  int c=rs4.getInt(1);
  points+=c;
  }
            }
if(d1.isSelected())
            {
            PreparedStatement st1=null;
            ResultSet rs1;
   String sql1="select points from bpoints where anstype='A01' and bansid=? ";
   st1=con.prepareStatement(sql1);
   st1.setString(1,q4);
   rs1=st1.executeQuery();
   while(rs1.next())
   {
  int c=rs1.getInt(1);
  points+=c;
  }
            }
if(d2.isSelected())
            {
            PreparedStatement st2=null;
            ResultSet rs2;
   String sql2="select points from bpoints where anstype='A02' and bansid=? ";
   st2=con.prepareStatement(sql2);
   st2.setString(1,q4);
   rs2=st2.executeQuery();
   while(rs2.next())
   {
  int c=rs2.getInt(1);
  points+=c;
  }
            }
if(d3.isSelected())
            {
            PreparedStatement st3=null;
            ResultSet rs3;
   String sql3="select points from bpoints where anstype='A03' and bansid=? ";
   st3=con.prepareStatement(sql3);
   st3.setString(1,q4);
   rs3=st3.executeQuery();
   while(rs3.next())
   {
  int c=rs3.getInt(1);
  points+=c;
  }
            }
if(d4.isSelected())
            {
            PreparedStatement st4=null;
            ResultSet rs4;
   String sql4="select points from bpoints where anstype='A04' and bansid=? ";
   st4=con.prepareStatement(sql4);
   st4.setString(1,q4);
   rs4=st4.executeQuery();
   while(rs4.next())
   {
  int c=rs4.getInt(1);
  points+=c;
  }
            }
if(e1.isSelected())
            {
            PreparedStatement st1=null;
            ResultSet rs1;
   String sql1="select points from bpoints where anstype='A01' and bansid=? ";
   st1=con.prepareStatement(sql1);
   st1.setString(1,q5);
   rs1=st1.executeQuery();
   while(rs1.next())
   {
  int c=rs1.getInt(1);
  points+=c;
  }
            }
if(e2.isSelected())
            {
            PreparedStatement st2=null;
            ResultSet rs2;
   String sql2="select points from bpoints where anstype='A02' and bansid=? ";
   st2=con.prepareStatement(sql2);
   st2.setString(1,q5);
   rs2=st2.executeQuery();
   while(rs2.next())
   {
  int c=rs2.getInt(1);
  points+=c;
  }
            }
if(e3.isSelected())
            {
            PreparedStatement st3=null;
            ResultSet rs3;
   String sql3="select points from bpoints where anstype='A03' and bansid=? ";
   st3=con.prepareStatement(sql3);
   st3.setString(1,q5);
   rs3=st3.executeQuery();
   while(rs3.next())
   {
  int c=rs3.getInt(1);
  points+=c;
  }
            }
if(e4.isSelected())
            {
            PreparedStatement st4=null;
            ResultSet rs4;
   String sql4="select points from bpoints where anstype='A04' and bansid=? ";
   st4=con.prepareStatement(sql4);
   st4.setString(1,q5);
   rs4=st4.executeQuery();
   while(rs4.next())
   {
  int c=rs4.getInt(1);
  points+=c;
  }
            }
JOptionPane.showMessageDialog(null,"Thank you for playing!You have scored....."+points+"points");
 Connection co=null;  
        int p=0;
            co=connect();
            String user=getuser();
            ResultSet rt=null;
            PreparedStatement st=null;
            PreparedStatement s2=null;
            String q="select bpoints from user where username=?";
            s2=co.prepareStatement(q);
            s2.setString(1,user);
            rt=s2.executeQuery();
            if(rt.next())
             p=rt.getInt(1);
  p=p+points;
   String sql="update user set bpoints=? where username=?";
   st=con.prepareStatement(sql);
    st.setInt(1,p);
    st.setString(2, user);
    st.executeUpdate();
       
        }
        catch(Exception e)
                {
                    System.out.println(e);
                }
}
    private void txt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt1ActionPerformed
   
    }//GEN-LAST:event_txt1ActionPerformed

    private void e1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_e1ActionPerformed

    private void d2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_d2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try
        {
            Connection con=null;
            con=connect();
            if(a1.isSelected())
            {
            PreparedStatement st1=null;
            ResultSet rs1;
   String sql1="select points from mpoints where anstype='A01' and mansid=? ";
   st1=con.prepareStatement(sql1);
   st1.setString(1,q1);
   rs1=st1.executeQuery();
   while(rs1.next())
   {
  int c=rs1.getInt(1);
  points+=c;
  }
            }
             if(a2.isSelected())
            {
            PreparedStatement st2=null;
            ResultSet rs2;
   String sql2="select points from mpoints where anstype='A02' and mansid=? ";
   st2=con.prepareStatement(sql2);
   st2.setString(1,q1);
   rs2=st2.executeQuery();
   while(rs2.next())
   {
  int c=rs2.getInt(1);
  points+=c;
  }
            }
if(a3.isSelected())
            {
            PreparedStatement st3=null;
            ResultSet rs3;
   String sql3="select points from mpoints where anstype='A03' and mansid=? ";
   st3=con.prepareStatement(sql3);
   st3.setString(1,q1);
   rs3=st3.executeQuery();
   while(rs3.next())
   {
  int c=rs3.getInt(1);
  points+=c;
  }
            }
if(a4.isSelected())
            {
            PreparedStatement st4=null;
            ResultSet rs4;
   String sql4="select points from mpoints where anstype='A04' and mansid=? ";
   st4=con.prepareStatement(sql4);
   st4.setString(1,q1);
   rs4=st4.executeQuery();
   while(rs4.next())
   {
  int c=rs4.getInt(1);
  points+=c;
  }
            }

if(b1.isSelected())
            {
            PreparedStatement st1=null;
            ResultSet rs1;
   String sql1="select points from mpoints where anstype='A01' and mansid=? ";
   st1=con.prepareStatement(sql1);
   st1.setString(1,q2);
   rs1=st1.executeQuery();
   while(rs1.next())
   {
  int c=rs1.getInt(1);
  points+=c;
  }
            }
if(b2.isSelected())
            {
            PreparedStatement st2=null;
            ResultSet rs2;
   String sql2="select points from mpoints where anstype='A02' and mansid=? ";
   st2=con.prepareStatement(sql2);
   st2.setString(1,q2);
   rs2=st2.executeQuery();
   while(rs2.next())
   {
  int c=rs2.getInt(1);
  points+=c;
  }
            }
if(b3.isSelected())
            {
            PreparedStatement st3=null;
            ResultSet rs3;
   String sql3="select points from mpoints where anstype='A03' and mansid=? ";
   st3=con.prepareStatement(sql3);
   st3.setString(1,q2);
   rs3=st3.executeQuery();
   while(rs3.next())
   {
  int c=rs3.getInt(1);
  points+=c;
  }
            }
if(b4.isSelected())
            {
            PreparedStatement st4=null;
            ResultSet rs4;
   String sql4="select points from mpoints where anstype='A04' and mansid=? ";
   st4=con.prepareStatement(sql4);
   st4.setString(1,q2);
   rs4=st4.executeQuery();
   while(rs4.next())
   {
  int c=rs4.getInt(1);
  points+=c;
  }
            }

if(c1.isSelected())
            {
            PreparedStatement st1=null;
            ResultSet rs1;
   String sql1="select points from mpoints where anstype='A01' and mansid=? ";
   st1=con.prepareStatement(sql1);
   st1.setString(1,q3);
   rs1=st1.executeQuery();
   while(rs1.next())
   {
  int c=rs1.getInt(1);
  points+=c;
  }
            }
if(c2.isSelected())
            {
            PreparedStatement st2=null;
            ResultSet rs2;
   String sql2="select points from mpoints where anstype='A02' and mansid=? ";
   st2=con.prepareStatement(sql2);
   st2.setString(1,q3);
   rs2=st2.executeQuery();
   while(rs2.next())
   {
  int c=rs2.getInt(1);
  points+=c;
  }
            }
if(c3.isSelected())
            {
            PreparedStatement st3=null;
            ResultSet rs3;
   String sql3="select points from mpoints where anstype='A03' and mansid=? ";
   st3=con.prepareStatement(sql3);
   st3.setString(1,q3);
   rs3=st3.executeQuery();
   while(rs3.next())
   {
  int c=rs3.getInt(1);
  points+=c;
  }
            }
if(c4.isSelected())
            {
            PreparedStatement st4=null;
            ResultSet rs4;
   String sql4="select points from mpoints where anstype='A04' and mansid=? ";
   st4=con.prepareStatement(sql4);
   st4.setString(1,q3);
   rs4=st4.executeQuery();
   while(rs4.next())
   {
  int c=rs4.getInt(1);
  points+=c;
  }
            }
if(d1.isSelected())
            {
            PreparedStatement st1=null;
            ResultSet rs1;
   String sql1="select points from mpoints where anstype='A01' and mansid=? ";
   st1=con.prepareStatement(sql1);
   st1.setString(1,q4);
   rs1=st1.executeQuery();
   while(rs1.next())
   {
  int c=rs1.getInt(1);
  points+=c;
  }
            }
if(d2.isSelected())
            {
            PreparedStatement st2=null;
            ResultSet rs2;
   String sql2="select points from mpoints where anstype='A02' and mansid=? ";
   st2=con.prepareStatement(sql2);
   st2.setString(1,q4);
   rs2=st2.executeQuery();
   while(rs2.next())
   {
  int c=rs2.getInt(1);
  points+=c;
  }
            }
if(d3.isSelected())
            {
            PreparedStatement st3=null;
            ResultSet rs3;
   String sql3="select points from mpoints where anstype='A03' and mansid=? ";
   st3=con.prepareStatement(sql3);
   st3.setString(1,q4);
   rs3=st3.executeQuery();
   while(rs3.next())
   {
  int c=rs3.getInt(1);
  points+=c;
  }
            }
if(d4.isSelected())
            {
            PreparedStatement st4=null;
            ResultSet rs4;
   String sql4="select points from mpoints where anstype='A04' and mansid=? ";
   st4=con.prepareStatement(sql4);
   st4.setString(1,q4);
   rs4=st4.executeQuery();
   while(rs4.next())
   {
  int c=rs4.getInt(1);
  points+=c;
  }
            }
if(e1.isSelected())
            {
            PreparedStatement st1=null;
            ResultSet rs1;
   String sql1="select points from mpoints where anstype='A01' and mansid=? ";
   st1=con.prepareStatement(sql1);
   st1.setString(1,q5);
   rs1=st1.executeQuery();
   while(rs1.next())
   {
  int c=rs1.getInt(1);
  points+=c;
  }
            }
if(e2.isSelected())
            {
            PreparedStatement st2=null;
            ResultSet rs2;
   String sql2="select points from mpoints where anstype='A02' and mansid=? ";
   st2=con.prepareStatement(sql2);
   st2.setString(1,q5);
   rs2=st2.executeQuery();
   while(rs2.next())
   {
  int c=rs2.getInt(1);
  points+=c;
  }
            }
if(e3.isSelected())
            {
            PreparedStatement st3=null;
            ResultSet rs3;
   String sql3="select points from mpoints where anstype='A03' and mansid=? ";
   st3=con.prepareStatement(sql3);
   st3.setString(1,q5);
   rs3=st3.executeQuery();
   while(rs3.next())
   {
  int c=rs3.getInt(1);
  points+=c;
  }
            }
if(e4.isSelected())
            {
            PreparedStatement st4=null;
            ResultSet rs4;
   String sql4="select points from mpoints where anstype='A04' and mansid=? ";
   st4=con.prepareStatement(sql4);
   st4.setString(1,q5);
   rs4=st4.executeQuery();
   while(rs4.next())
   {
  int c=rs4.getInt(1);
  points+=c;
  }
            }
JOptionPane.showMessageDialog(null,"Thank you for playing!You have scored....."+points+"points");
        Connection co=null;  
        int p=0;
            co=connect();
            String user=getuser();
            ResultSet rt=null;
            PreparedStatement st=null;
            PreparedStatement s2=null;
            String q="select mpoints from user where username=?";
            s2=co.prepareStatement(q);
            s2.setString(1,user);
            rt=s2.executeQuery();
            if(rt.next())
             p=rt.getInt(1);
  p=p+points;
   String sql="update user set mpoints=? where username=?";
   st=con.prepareStatement(sql);
    st.setInt(1,p);
    st.setString(2, user);
    st.executeUpdate();
       timer.stop();
     counter=60;
        }
        catch(Exception e)
                {
                    System.out.println(e);
                }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      timer.start();
        try{
         Connection con=null;
         String aa1,aa2,aa3,aa4,aa5;
            con=connect();
            ResultSet rs1;
            PreparedStatement st1=null;
            aa1=aa2=aa3=aa4=aa5=null;
            
   String sql1="select mquestion,MANSID from moviequiz where typeid='M01' order by rand() limit 1";
   st1=con.prepareStatement(sql1);
   rs1=st1.executeQuery();
   while(rs1.next())
   {
   txt1.setText(rs1.getString(1));
   aa1=rs1.getString(2);
   }
   q1=aa1;
   ResultSet rs2;
            PreparedStatement st2=null;
            
   String sql2="select mquestion,MANSID from moviequiz where typeid='M01' order by rand() limit 1";
   st2=con.prepareStatement(sql2);
   rs2=st2.executeQuery();
   while(rs2.next())
   {
   txt2.setText(rs2.getString(1));
   aa2=rs2.getString(2);
   }
   q2=aa2;
   ResultSet rs3;
            PreparedStatement st3=null;
            
   String sql3="select mquestion,MANSID from moviequiz where typeid='M01' order by rand() limit 1";
   st3=con.prepareStatement(sql3);
   rs3=st3.executeQuery();
   while(rs3.next())
   {
   txt3.setText(rs3.getString(1));
   aa3=rs3.getString(2);
   }
   q3=aa3;
   ResultSet rs4;
            PreparedStatement st4=null;
            
   String sql4="select mquestion,MANSID from moviequiz where typeid='M01' order by rand() limit 1";
   st4=con.prepareStatement(sql4);
   rs4=st4.executeQuery();
   while(rs4.next())
   {
   txt4.setText(rs4.getString(1));
   aa4=rs4.getString(2);
   }
   q4=aa4;
   ResultSet rs5;
            PreparedStatement st5=null;
            
   String sql5="select mquestion,MANSID from moviequiz where typeid='M01' order by rand() limit 1";
   st5=con.prepareStatement(sql5);
   rs5=st5.executeQuery();
   while(rs5.next())
   {
   txt5.setText(rs5.getString(1));
   aa5=rs5.getString(2);
   }
   
  q5=aa5;
   
   ResultSet r1;  
   PreparedStatement s1=null;
            int i=0;
String sq1="select MOPT from MANSWER where mansid=? and optid='O1'";
   s1=con.prepareStatement(sq1);
   s1.setString(1,aa1);
   r1=s1.executeQuery();
   while(r1.next())
   {
a1.setText(r1.getString(1));
    
   }
   
   ResultSet r2;  
PreparedStatement s2=null;
String sq2="select MOPT from MANSWER where mansid=? and optid='O2'";
s2=con.prepareStatement(sq2);
s2.setString(1,aa1);
r2=s2.executeQuery();
while(r2.next())
{
	a2.setText(r2.getString(1));
}


ResultSet r3;  
PreparedStatement s3=null;
String sq3="select MOPT from MANSWER where mansid=? and optid='O3'";
s3=con.prepareStatement(sq3);
s3.setString(1,aa1);
r3=s3.executeQuery();
while(r3.next())
{
	a3.setText(r3.getString(1));
}

ResultSet r4;  
PreparedStatement s4=null;
String sq4="select MOPT from MANSWER where mansid=? and optid='O4'";
s4=con.prepareStatement(sq4);
s4.setString(1,aa1);
r4=s4.executeQuery();
while(r4.next())
{
	a4.setText(r4.getString(1));
}


s1=null;
sq1="select MOPT from MANSWER where mansid=? and optid='O1'";
s1=con.prepareStatement(sq1);
s1.setString(1,aa2);
r1=s1.executeQuery();
while(r1.next())
{
	b1.setText(r1.getString(1));
}


s2=null;
sq2="select MOPT from MANSWER where mansid=? and optid='O2'";
s2=con.prepareStatement(sq2);
s2.setString(1,aa2);
r2=s2.executeQuery();
while(r2.next())
{
	b2.setText(r2.getString(1));
}


s3=null;
sq3="select MOPT from MANSWER where mansid=? and optid='O3'";
s3=con.prepareStatement(sq3);
s3.setString(1,aa2);
r3=s3.executeQuery();
while(r3.next())
{
	b3.setText(r3.getString(1));
}
 
s4=null;
sq4="select MOPT from MANSWER where mansid=? and optid='O4'";
s4=con.prepareStatement(sq4);
s4.setString(1,aa2);
r4=s4.executeQuery();
while(r4.next())
{
	b4.setText(r4.getString(1));
}





s1=null;
sq1="select MOPT from MANSWER where mansid=? and optid='O1'";
s1=con.prepareStatement(sq1);
s1.setString(1,aa3);
r1=s1.executeQuery();
while(r1.next())
{
	c1.setText(r1.getString(1));
}


s2=null;
sq2="select MOPT from MANSWER where mansid=? and optid='O2'";
s2=con.prepareStatement(sq2);
s2.setString(1,aa3);
r2=s2.executeQuery();
while(r2.next())
{
	c2.setText(r2.getString(1));
}


s3=null;
sq3="select MOPT from MANSWER where mansid=? and optid='O3'";
s3=con.prepareStatement(sq3);
s3.setString(1,aa3);
r3=s3.executeQuery();
while(r3.next())
{
	c3.setText(r3.getString(1));
}
 
s4=null;
sq4="select MOPT from MANSWER where mansid=? and optid='O4'";
s4=con.prepareStatement(sq4);
s4.setString(1,aa3);
r4=s4.executeQuery();
while(r4.next())
{
	c4.setText(r4.getString(1));
}




s1=null;
sq1="select MOPT from MANSWER where mansid=? and optid='O1'";
s1=con.prepareStatement(sq1);
s1.setString(1,aa4);
r1=s1.executeQuery();
while(r1.next())
{
	d1.setText(r1.getString(1));
}


s2=null;
sq2="select MOPT from MANSWER where mansid=? and optid='O2'";
s2=con.prepareStatement(sq2);
s2.setString(1,aa4);
r2=s2.executeQuery();
while(r2.next())
{
	d2.setText(r2.getString(1));
}


s3=null;
sq3="select MOPT from MANSWER where mansid=? and optid='O3'";
s3=con.prepareStatement(sq3);
s3.setString(1,aa4);
r3=s3.executeQuery();
while(r3.next())
{
	d3.setText(r3.getString(1));
}
 
s4=null;
sq4="select MOPT from MANSWER where mansid=? and optid='O4'";
s4=con.prepareStatement(sq4);
s4.setString(1,aa4);
r4=s4.executeQuery();
while(r4.next())
{
	d4.setText(r4.getString(1));
}




s1=null;
sq1="select MOPT from MANSWER where mansid=? and optid='O1'";
s1=con.prepareStatement(sq1);
s1.setString(1,aa5);
r1=s1.executeQuery();
while(r1.next())
{
	e1.setText(r1.getString(1));
}


s2=null;
sq2="select MOPT from MANSWER where mansid=? and optid='O2'";
s2=con.prepareStatement(sq2);
s2.setString(1,aa5);
r2=s2.executeQuery();
while(r2.next())
{
	e2.setText(r2.getString(1));
}


s3=null;
sq3="select MOPT from MANSWER where mansid=? and optid='O3'";
s3=con.prepareStatement(sq3);
s3.setString(1,aa5);
r3=s3.executeQuery();
while(r3.next())
{
	e3.setText(r3.getString(1));
}
 
s4=null;
sq4="select MOPT from MANSWER where mansid=? and optid='O4'";
s4=con.prepareStatement(sq4);
s4.setString(1,aa5);
r4=s4.executeQuery();
while(r4.next())
{
	e4.setText(r4.getString(1));
}
 

  }




       catch(Exception e)
       {
           System.out.println(e);
           
       }       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
timer.stop();
counter=60;
        
        dispose();
        last l=new last();
        l.setVisible(true);
        
    }//GEN-LAST:event_jButton4ActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tamil().setVisible(true);
                
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton a1;
    private javax.swing.JRadioButton a2;
    private javax.swing.JRadioButton a3;
    private javax.swing.JRadioButton a4;
    private javax.swing.JRadioButton b1;
    private javax.swing.JRadioButton b2;
    private javax.swing.JRadioButton b3;
    private javax.swing.JRadioButton b4;
    private javax.swing.JRadioButton c1;
    private javax.swing.JRadioButton c2;
    private javax.swing.JRadioButton c3;
    private javax.swing.JRadioButton c4;
    private javax.swing.JRadioButton d1;
    private javax.swing.JRadioButton d2;
    private javax.swing.JRadioButton d3;
    private javax.swing.JRadioButton d4;
    private javax.swing.JRadioButton e1;
    private javax.swing.JRadioButton e2;
    private javax.swing.JRadioButton e3;
    private javax.swing.JRadioButton e4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt3;
    private javax.swing.JTextField txt4;
    private javax.swing.JTextField txt5;
    // End of variables declaration//GEN-END:variables
}
