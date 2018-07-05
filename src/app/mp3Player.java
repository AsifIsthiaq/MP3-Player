/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.io.File;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author ASUS
 */
public class mp3Player extends javax.swing.JFrame {

    MainClass MC = new MainClass();
    int phg =0;
    String shg,name; 
    
    
    public mp3Player() {
        initComponents();
    }

   
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollBar1 = new javax.swing.JScrollBar();
        jSpinner1 = new javax.swing.JSpinner();
        jSplitPane1 = new javax.swing.JSplitPane();
        popupMenu1 = new java.awt.PopupMenu();
        jFileChooser1 = new javax.swing.JFileChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        play = new javax.swing.JButton();
        pause = new javax.swing.JButton();
        stop = new javax.swing.JButton();
        browse = new javax.swing.JButton();
        display = new javax.swing.JTextField();
        Slider1 = new javax.swing.JSlider();
        forward = new javax.swing.JButton();
        backward = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList();
        MenuBar = new javax.swing.JMenuBar();
        Browse = new javax.swing.JMenu();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();

        jLabel1.setText("jLabel1");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/black_texture 380 280.png"))); // NOI18N

        popupMenu1.setLabel("popupMenu1");

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(380, 300));
        setSize(new java.awt.Dimension(300, 280));
        getContentPane().setLayout(null);

        play.setText("►");
        play.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playActionPerformed(evt);
            }
        });
        getContentPane().add(play);
        play.setBounds(120, 60, 43, 30);

        pause.setText("||");
        pause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pauseActionPerformed(evt);
            }
        });
        getContentPane().add(pause);
        pause.setBounds(190, 60, 50, 23);

        stop.setText("⬛");
        stop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopActionPerformed(evt);
            }
        });
        getContentPane().add(stop);
        stop.setBounds(50, 60, 50, 23);

        browse.setText("\t♫");
        browse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseActionPerformed(evt);
            }
        });
        getContentPane().add(browse);
        browse.setBounds(110, 140, 70, 23);

        display.setBackground(new java.awt.Color(204, 204, 255));
        display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayActionPerformed(evt);
            }
        });
        getContentPane().add(display);
        display.setBounds(10, 10, 270, 40);

        Slider1.setMajorTickSpacing(20);
        Slider1.setMinorTickSpacing(5);
        getContentPane().add(Slider1);
        Slider1.setBounds(60, 180, 170, 50);

        forward.setText(">>");
        forward.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forwardActionPerformed(evt);
            }
        });
        getContentPane().add(forward);
        forward.setBounds(170, 100, 49, 23);

        backward.setText("<<");
        backward.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backwardActionPerformed(evt);
            }
        });
        getContentPane().add(backward);
        backward.setBounds(80, 100, 49, 23);

        jScrollPane2.setViewportView(jList2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(400, 40, 258, 130);

        Browse.setText("File");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("Browse");
        jRadioButtonMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem1ActionPerformed(evt);
            }
        });
        Browse.add(jRadioButtonMenuItem1);

        MenuBar.add(Browse);

        setJMenuBar(MenuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void browseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseActionPerformed
        
        FileNameExtensionFilter filter = new FileNameExtensionFilter("mp3 Files", "mp3", "mpeg3");
        
        JFileChooser chooser = new JFileChooser("D:Downloads//");
        
         chooser.addChoosableFileFilter(filter);
        
        int returnVal = chooser.showOpenDialog(null);
        
        if(returnVal == JFileChooser.APPROVE_OPTION){
            MC.Stop();
            
            File myFile = chooser.getSelectedFile();
            
            String song = myFile + "";
              shg = song;
              
             name = chooser.getSelectedFile().getName();
            
            display.setText(name);
            
            MC.Play(song);
            
            
        }
    }//GEN-LAST:event_browseActionPerformed

    private void playActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playActionPerformed
        // TODO add your handling code here:
        
        if(phg == 1){
            //Slider1.setValue(0);
            MC.Stop();
            //SliderPlay();
            MC.Play(shg);
           // SliderPlay();
            
            
            phg = 0;
        }
        else{
            //Slider1.setValue(MC.pauselocation2);
            MC.Stop();
            MC.Resume();
           // SliderPlay();
           
        }
              
        
    }//GEN-LAST:event_playActionPerformed

     public void SliderPlay()
    {
        
        for(int i=0;i<100;i=i+10){
            Slider1.setValue(i);
        }
    }
     /*
     public void SliderResume()
    {
        long int n = MC.pauselocation/1000 ;
        
        for(int i=;i<MC.songTotalLength;i++){
            Slider1.setValue(i);
        }
    }*/
     
     
    
    private void stopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopActionPerformed
        // TODO add your handling code here:
       // MC.Stop();
        //phg = 1;
        
        
        /*
        for(int i=0;i<5;i++){
            dlm.addElement("Item : "+ i);
        }
        jList1.setModel(dlm); */
        DefaultListModel dlm = new DefaultListModel();
        
        dlm.addElement("Leave the Night On");
        dlm.addElement("out of the woods");
        
        jList2.setModel(dlm);
    }//GEN-LAST:event_stopActionPerformed

    private void pauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pauseActionPerformed
        // TODO add your handling code here:
        //MC.Pause();
        
           String pathstr = (String) jList2.getSelectedValue();
        
        System.out.println(pathstr);
        
        if(pathstr == "Leave the Night On"){
            MC.Play("D:\\Leave the Night On.mp3");
        }
    }//GEN-LAST:event_pauseActionPerformed

    private void displayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_displayActionPerformed

    private void forwardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forwardActionPerformed
        // TODO add your handling code here:
        
        MC.Pause();
        MC.ForwardPlay();
    }//GEN-LAST:event_forwardActionPerformed

    private void backwardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backwardActionPerformed
        // TODO add your handling code here:
        MC.Pause();
        MC.BackwardPlay();
    }//GEN-LAST:event_backwardActionPerformed

    private void jRadioButtonMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem1ActionPerformed
        // TODO add your handling code here:
        
         FileNameExtensionFilter filter = new FileNameExtensionFilter("mp3 Files", "mp3", "mpeg3");
        
        JFileChooser chooser = new JFileChooser("D:Downloads//");
        
         chooser.addChoosableFileFilter(filter);
        
        int returnVal = chooser.showOpenDialog(null);
        
        if(returnVal == JFileChooser.APPROVE_OPTION){
            MC.Stop();
            
            File myFile = chooser.getSelectedFile();
            
            String song = myFile + "";
              shg = song;
              
             name = chooser.getSelectedFile().getName();
            
            display.setText(name);
            
            MC.Play(song);
            
    }//GEN-LAST:event_jRadioButtonMenuItem1ActionPerformed
  
    }   
    
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
            java.util.logging.Logger.getLogger(mp3Player.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mp3Player.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mp3Player.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mp3Player.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                mp3Player dialog = new mp3Player();
                
                //new mp3Player().setVisible(true);
                
                dialog.setLocationRelativeTo(null);
               // dialog.setResizable(false);
                dialog.setVisible(true);
                
                
                 dialog.addWindowListener(new java.awt.event.WindowAdapter() 
                {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) 
                    {
                        System.exit(0);
                    }
                });
            }
        });
    }
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Browse;
    private javax.swing.JMenuBar MenuBar;
    public static javax.swing.JSlider Slider1;
    private javax.swing.JButton backward;
    private javax.swing.JButton browse;
    public static javax.swing.JTextField display;
    private javax.swing.JButton forward;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList jList1;
    private javax.swing.JList jList2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton pause;
    private javax.swing.JButton play;
    private java.awt.PopupMenu popupMenu1;
    private javax.swing.JButton stop;
    // End of variables declaration//GEN-END:variables

   
}
