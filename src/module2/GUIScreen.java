/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package module2;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author nishit
 */
public class GUIScreen extends javax.swing.JFrame {
    
    /**
     * Creates new form NewJFrame
     */
    int i;
    int flag=0;
    Directory D;
    Buckets b_initial1;
    Buckets b_initial2;
     JLabel[] labels;
     int bfr;
     String gd;
     
    public GUIScreen() {
        D = new Directory();
        bfr=D.bfr;
        b_initial1=new Buckets();
        b_initial2=new Buckets();
        for(int i=0;i<(1<<D.global_depth);i++)
        {
            if(i%2==0)
            {
                D.buckets.add(b_initial1); 
            }
            else
            {
                D.buckets.add(b_initial2);
            }
        }
        String gd=Integer.toString(D.global_depth);
        System.out.println(gd);
        initComponents();
        searchOutput.setVisible(false);
        heading();
        labels=createLabels();
        
        
    }
    public Directory clear()
    {
        Directory Dnew= new Directory();
        Buckets b_initial1=new Buckets();
        Buckets b_initial2=new Buckets();
        for(int i=0;i<(1<<Dnew.global_depth);i++)
        {
            if(i%2==0)
            {
                Dnew.buckets.add(b_initial1); 
            }
            else
            {
                Dnew.buckets.add(b_initial2);
            }
        }
        return Dnew;
    }
    private JLabel[] createLabels(){
        int h=jScrollPane1.getHeight()/(bfr+2);
        int w=jScrollPane1.getWidth()/(bfr+2);
        System.out.println(w);
        System.out.println(h);
        
        JLabel[] labels=new JLabel[2000000];
        for (int i=0;i<200000;i++){
            labels[i]=new JLabel("");
            labels[i].setPreferredSize(new Dimension(w-10,h/4));
            labels[i].setForeground(Color.white);
        }
        return labels;
    }
    public void heading()
    {   int h=jScrollPane1.getHeight()/(bfr+2);
        int w=jScrollPane1.getWidth()/(bfr+2);
        System.out.println(w);
        System.out.println(h);
        
        JLabel Dir=new JLabel("Dir");
            Dir.setPreferredSize(new Dimension(w-10,h/5));
            Dir.setForeground(Color.white);
            Dir.setVisible(true);
          JLabel[] head =createLabels();
          outputPane.add(Dir,new FlowLayout());
        for(int i=0;i<bfr;i++)
        {
            head[i].setText("El "+(i+1));
                head[i].setVisible(true);
                head[i].setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                outputPane.add(head[i],new FlowLayout());
        }   
          JLabel LD=new JLabel("LD");
            LD.setPreferredSize(new Dimension(w-10,h/5));
            LD.setForeground(Color.white); 
            LD.setVisible(true);
            LD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            outputPane.add(LD,new FlowLayout());
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        clearButton = new javax.swing.JButton();
        searchOutput = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        outputPane = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        insert = new javax.swing.JButton();
        search = new javax.swing.JButton();
        gdLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        inputKey = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tempL = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Extendible Hashing");
        setAlwaysOnTop(true);
        setBounds(new java.awt.Rectangle(0, 0, 886, 510));
        setMinimumSize(new java.awt.Dimension(886, 510));
        setResizable(false);
        setSize(new java.awt.Dimension(886, 510));
        getContentPane().setLayout(null);

        clearButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/module2/button_clear.png"))); // NOI18N
        clearButton.setText("jButton1");
        clearButton.setBorder(new javax.swing.border.MatteBorder(null));
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });
        getContentPane().add(clearButton);
        clearButton.setBounds(70, 360, 150, 50);

        searchOutput.setEditable(false);
        searchOutput.setColumns(20);
        searchOutput.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        searchOutput.setForeground(new java.awt.Color(255, 255, 255));
        searchOutput.setLineWrap(true);
        searchOutput.setRows(5);
        searchOutput.setWrapStyleWord(true);
        searchOutput.setCaretColor(new java.awt.Color(255, 255, 255));
        searchOutput.setMinimumSize(new java.awt.Dimension(100, 100));
        searchOutput.setOpaque(false);
        searchOutput.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        searchOutput.setSelectionColor(new java.awt.Color(255, 255, 255));
        getContentPane().add(searchOutput);
        searchOutput.setBounds(660, 260, 150, 170);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("EXTENDIBLE HASHING");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(170, 0, 570, 90);

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setHorizontalScrollBar(null);
        jScrollPane1.setMaximumSize(new java.awt.Dimension(270, 32767));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(270, 7));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(270, 100));

        outputPane.setBackground(new java.awt.Color(0, 62, 174));
        outputPane.setForeground(new java.awt.Color(0, 62, 174));
        outputPane.setToolTipText("");
        outputPane.setAutoscrolls(true);
        outputPane.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        outputPane.setMaximumSize(new java.awt.Dimension(270, 32767));
        outputPane.setMinimumSize(new java.awt.Dimension(270, 210));
        outputPane.setPreferredSize(new java.awt.Dimension(270, 3000));
        jScrollPane1.setViewportView(outputPane);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(300, 180, 290, 300);

        jLabel3.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Enter Key :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(300, 120, 140, 29);

        insert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/module2/button_insert.png"))); // NOI18N
        insert.setBorder(new javax.swing.border.MatteBorder(null));
        insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertActionPerformed(evt);
            }
        });
        getContentPane().add(insert);
        insert.setBounds(70, 200, 150, 50);

        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/module2/button_search.png"))); // NOI18N
        search.setBorder(new javax.swing.border.MatteBorder(null));
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        getContentPane().add(search);
        search.setBounds(660, 200, 150, 50);

        gdLabel.setFont(new java.awt.Font("Droid Serif", 1, 24)); // NOI18N
        gdLabel.setForeground(new java.awt.Color(255, 255, 255));
        gdLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(gdLabel);
        gdLabel.setBounds(170, 275, 40, 60);
        gdLabel.setText("2");

        jLabel7.setFont(new java.awt.Font("Droid Serif", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText(":");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(160, 280, 20, 50);

        jLabel6.setFont(new java.awt.Font("Droid Serif", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Depth");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(70, 290, 110, 50);

        jLabel8.setFont(new java.awt.Font("Droid Serif", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Global");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(70, 260, 110, 50);

        inputKey.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputKey.setText("Primary Key");
        inputKey.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        inputKey.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputKeyFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputKeyFocusLost(evt);
            }
        });
        inputKey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputKeyActionPerformed(evt);
            }
        });
        getContentPane().add(inputKey);
        inputKey.setBounds(440, 120, 140, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/module2/nackg.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 890, 510);
        jLabel2.getAccessibleContext().setAccessibleDescription("");

        tempL.setText("jLabel4");
        getContentPane().add(tempL);
        tempL.setBounds(160, 430, 51, 15);

        setSize(new java.awt.Dimension(885, 535));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertActionPerformed
       
        inputKey.setText("Primary Key");
        
      
        System.out.println(i);
        
        Test.insert(i,D);
        if(D.global_depth>10)
        {
        String[] args = new String[0]; // Or String[] args = {};
        Main.main(args);
            JOptionPane.showMessageDialog(this,
    "Exceptional case Encountered",
    "Inane error",
    JOptionPane.ERROR_MESSAGE);
        
        
        this.dispose();
        }
        display(D);
        outputPane.revalidate();
        String gd=Integer.toString(D.global_depth);
        gdLabel.setText(gd);

        jScrollPane1.revalidate();
        
       
    }//GEN-LAST:event_insertActionPerformed

    private void inputKeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputKeyActionPerformed
        i = Integer.parseInt(inputKey.getText());
        System.out.println(i);
    }//GEN-LAST:event_inputKeyActionPerformed

    private void inputKeyFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputKeyFocusGained
        inputKey.setText("");
        
    }//GEN-LAST:event_inputKeyFocusGained

    private void inputKeyFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputKeyFocusLost
        i = Integer.parseInt(inputKey.getText());
    }//GEN-LAST:event_inputKeyFocusLost

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        inputKey.setText("Primary Key");
        System.out.println(i);
        String gd=Integer.toString(D.global_depth);
        gdLabel.setText(gd);

        boolean B=Test.search(i,D);
        if(B)
        {      
            searchOutput.setVisible(true);
            searchOutput.setOpaque(false);
            
            searchOutput.setText(i+" exists in the Hash table");
            
        }
        else
        {
             searchOutput.setVisible(true);
            searchOutput.setText(i+" does not exists in the Hash table");
            
        }
    }//GEN-LAST:event_searchActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        int el=0,len=0;
        for(int i=0;i<(1<<D.global_depth);i++)
        {   
            Buckets b_dis=D.buckets.get(i);
            int n_ele=b_dis.no_elements;
            //System.out.println(n_ele);
                String temp=Integer.toBinaryString(i);
                labels[len].setText(temp);
                labels[len].setVisible(false);
                outputPane.add(labels[len],new FlowLayout());
                   
                 len+=1;
                
                
            for(int j=0;j<n_ele;j++)
            {
                System.out.print(b_dis.values[j]+" ");
                temp=Integer.toString(b_dis.values[j]);
                labels[len].setText(temp);
                labels[len].setBackground(new java.awt.Color(46, 196, 255));
                labels[len].setOpaque(true);
                labels[len].setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
                labels[len].setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                labels[len].setVisible(false);
                
                outputPane.add(labels[len],new FlowLayout());
                el+=1;
                   
                 len+=1;
                
            }
            for(int j=el;j<bfr;j++)
            {                   labels[len].setText("");

                labels[len].setVisible(false);
                labels[len].setOpaque(true);
                labels[len].setBackground(new java.awt.Color(46, 196, 255));
                labels[len].setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,255, 255), 2));
                labels[len].setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                outputPane.add(labels[len],new FlowLayout());
                   
                 len+=1;
                
            }
            el=0;
            temp=Integer.toString(b_dis.local_depth);
                labels[len].setText(temp);
                labels[len].setVisible(false);
                labels[len].setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                outputPane.add(labels[len],new FlowLayout());
                len+=1;
            System.out.println();
            
                
        }
        D=clear();
        searchOutput.setText("");
        gdLabel.setText("2");
        
        
        
    }//GEN-LAST:event_clearButtonActionPerformed
    public void display(Directory dir)
    {   int el=0,len=0;
        for(int i=0;i<(1<<dir.global_depth);i++)
        {   
            Buckets b_dis=dir.buckets.get(i);
            int n_ele=b_dis.no_elements;
            //System.out.println(n_ele);
                String temp=Integer.toBinaryString(i);
                labels[len].setText(temp);
                labels[len].setVisible(true);
                outputPane.add(labels[len],new FlowLayout());
                len+=1;                
            for(int j=0;j<n_ele;j++)
            {
                System.out.print(b_dis.values[j]+" ");
                temp=Integer.toString(b_dis.values[j]);
                labels[len].setText(temp);
                labels[len].setBackground(new java.awt.Color(46, 196, 255));
                labels[len].setOpaque(true);
                labels[len].setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
                labels[len].setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                labels[len].setVisible(true);
                
                outputPane.add(labels[len],new FlowLayout());
                el+=1;
                len+=1;
            }
            for(int j=el;j<bfr;j++)
            {                   labels[len].setText("");

                labels[len].setVisible(true);
                labels[len].setOpaque(true);
                labels[len].setBackground(new java.awt.Color(46, 196, 255));
                labels[len].setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,255, 255), 2));
                labels[len].setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                outputPane.add(labels[len],new FlowLayout());
                len+=1;
            }
            el=0;
            temp=Integer.toString(b_dis.local_depth);
                labels[len].setText(temp);
                labels[len].setVisible(true);
                labels[len].setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                outputPane.add(labels[len],new FlowLayout());
                len+=1;
            System.out.println();
        }    
    }
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
            java.util.logging.Logger.getLogger(GUIScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        System.out.println("GUI Java");
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIScreen().setVisible(true);
                 
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearButton;
    private javax.swing.JLabel gdLabel;
    private javax.swing.JTextField inputKey;
    private javax.swing.JButton insert;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel outputPane;
    private javax.swing.JButton search;
    private javax.swing.JTextArea searchOutput;
    private javax.swing.JLabel tempL;
    // End of variables declaration//GEN-END:variables
}

