/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package examen;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.applet.AudioClip;

public class Juego extends javax.swing.JFrame {

    /**
     * Creates new form Juego
     */
    public Juego() {
        initComponents();
        
    AudioClip sonido;
    sonido=java.applet.Applet.newAudioClip(getClass().getResource("/Examen/215048__godspine__sinkhole-sample.wav"));
    
        sonido.loop();
    }

    private static class n {

        public n() {
        }
    }
    public class progress implements ActionListener{
        public void actionPerformed(ActionEvent evt){
            
    int cont1=0;
    int cont2=0;
    int cont3=0;
    int cont4=0;
    muerte.setVisible(false);
    muerte1.setVisible(false);
    muerte2.setVisible(false);
    muerte3.setVisible(false);
    int vidad=Vidadragon.getValue();
    int vidaa=VidaArquero.getValue();
    int vidav=VidaValkiria.getValue();
    int vidam=VidaMago.getValue();

            int n=timedragon.getValue();
            int a=TimeArquero.getValue();
            int m=TimeMago.getValue();
            int v=TimeValkiria.getValue();
        
            if (vidad<=0){
                vidad=0;
                Vidadragon.setValue(vidad);
                muerte.setVisible(true);
                texto.setText("Has Ganado");
            }
            
            if(vidaa<=0 && vidav<=0 && vidam<=0){
                texto.setText("Has Perdido");
            }
            
                if(a<100){
                a++;
                TimeArquero.setValue(a);
                }else{
                timerarquero.stop();
                }
                
                if(v<100){
                v++;
                TimeValkiria.setValue(v);
                }else{
                timerarquero.stop();
                }
                
                if(m<100){
                m++;
                TimeMago.setValue(m);
                }else{
                timerarquero.stop();
                }
                
                if(n<100){
                n++;
                timedragon.setValue(n);
                }else{
                timerdragon.stop();    
                }     
            
        if(a==100){
            Arquero1.setVisible(true);
        }else{
            Arquero1.setVisible(false);
        }
        
        if(a==100){
            Arquero2.setVisible(true);
        }else{
            Arquero2.setVisible(false);
        }
        if(v==100){
            Valkiria1.setVisible(true);
        }else{
            Valkiria1.setVisible(false);
        }
        
        if(v==100){
            Valkiria2.setVisible(true);        
        }else{
            Valkiria2.setVisible(false);
        }
        
        if(m==100){
            Mago1.setVisible(true);        
        }else{
            Mago1.setVisible(false);
        }
        
        if(m==100){
            Mago2.setVisible(true);        
        }else{            
            Mago2.setVisible(false);
        }
        
        if(n==100){
           cont1=((int) (Math.random()*(2-1+1)+1));
        }
        if(cont1==1){
            int d=VidaArquero.getValue();
            int t=d-40;            
            int c=VidaMago.getValue();
            int x=c-40;
            int b=VidaValkiria.getValue();
            int y=b-40;
           
           VidaArquero.setValue(t);
            VidaMago.setValue(x);
            VidaValkiria.setValue(y);            
            timedragon.setValue(0);
            data1.setText("HP "+t+"/250");
            data2.setText("HP "+y+"/400");
            data3.setText("HP "+x+"/200");  
        }else if(cont1==2){
          cont3=3;
          cont4=((int) (Math.random()*(3-1+1)+1)); 
          for(int i=0;i<cont3;i++){                     
                     if(cont4==1){
                         int d=VidaArquero.getValue();
                          vidaa=vidaa-15;      
                          VidaArquero.setValue(vidaa);
                         data1.setText("HP "+vidaa+"/250");
                     }else if(cont4==2){
                          int c=VidaMago.getValue();
                          vidam=vidam-15;
                          VidaMago.setValue(vidam);        
                         data3.setText("HP "+vidam+"/400");  
                     }else if (cont4==3){
                         int b=VidaValkiria.getValue();
                         vidav=vidav-15;
                         VidaValkiria.setValue(vidav);
                         data2.setText("HP "+vidav+"/200");
                     }
                 }
            timedragon.setValue(0);
        }
        if(vidad==0){
            vidad=0;
            Vidadragon.setValue(vidad);
            timerdragon.stop();
            timerarquero.stop();
            timermago.stop();
            timervalkiria.stop();
        }
        if(vidaa==0){
            vidaa=0;
            VidaArquero.setValue(vidaa);
            timerarquero.stop();
            muerte3.setVisible(true);
        }
        if(vidam==0){
            vidam=0;
            VidaMago.setValue(vidam);
            timermago.stop();
            muerte2.setVisible(true);            
        }
        if(vidav==0){
            vidav=0;
            VidaValkiria.setValue(vidav);        
            timervalkiria.stop();
            muerte1.setVisible(true);
        }
        }
    }
   
    /*
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        muerte = new javax.swing.JLabel();
        muerte1 = new javax.swing.JLabel();
        muerte2 = new javax.swing.JLabel();
        muerte3 = new javax.swing.JLabel();
        dragon = new javax.swing.JLabel();
        Vidadragon = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        VidaArquero = new javax.swing.JProgressBar();
        VidaValkiria = new javax.swing.JProgressBar();
        VidaMago = new javax.swing.JProgressBar();
        TimeArquero = new javax.swing.JProgressBar();
        TimeValkiria = new javax.swing.JProgressBar();
        TimeMago = new javax.swing.JProgressBar();
        data1 = new javax.swing.JLabel();
        data2 = new javax.swing.JLabel();
        data3 = new javax.swing.JLabel();
        Arquero1 = new javax.swing.JButton();
        Arquero2 = new javax.swing.JButton();
        Valkiria1 = new javax.swing.JButton();
        Valkiria2 = new javax.swing.JButton();
        Mago1 = new javax.swing.JButton();
        Mago2 = new javax.swing.JButton();
        dato4 = new javax.swing.JLabel();
        dato5 = new javax.swing.JLabel();
        dato6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        flechas = new javax.swing.JLabel();
        texto = new javax.swing.JLabel();
        background = new javax.swing.JLabel();
        timedragon = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        muerte.setIcon(new javax.swing.ImageIcon("C:\\Users\\Diaz\\Desktop\\Progra 2\\Assets\\Attacks 400x400\\Y todos murieron 400x400.png")); // NOI18N
        muerte.setText("jLabel1");
        getContentPane().add(muerte, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 200, -1, -1));

        muerte1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Diaz\\Desktop\\Progra 2\\Attacks 400x400\\Y todos murieron 400x400 - copia.png")); // NOI18N
        getContentPane().add(muerte1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 490, -1, -1));

        muerte2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Diaz\\Desktop\\Progra 2\\Attacks 400x400\\Y todos murieron 400x400 - copia.png")); // NOI18N
        getContentPane().add(muerte2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 600, -1, -1));

        muerte3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Diaz\\Desktop\\Progra 2\\Attacks 400x400\\Y todos murieron 400x400 - copia.png")); // NOI18N
        getContentPane().add(muerte3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, -1, -1));

        dragon.setIcon(new javax.swing.ImageIcon("C:\\Users\\Diaz\\Desktop\\Progra 2\\Pieces 400x400\\PieceDragonbltG.png")); // NOI18N
        getContentPane().add(dragon, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 160, 400, 400));

        Vidadragon.setMaximum(1000);
        Vidadragon.setValue(10000);
        Vidadragon.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Vidadragon.setName(""); // NOI18N
        Vidadragon.setStringPainted(true);
        getContentPane().add(Vidadragon, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 560, 270, 30));
        Vidadragon.getAccessibleContext().setAccessibleName("");

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Diaz\\Desktop\\Progra 2\\Assets\\Pieces 100x100\\valkyrie100x100.png")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 490, -1, -1));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Diaz\\Desktop\\Progra 2\\Assets\\Pieces 100x100\\wizard100x100.png")); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 600, -1, -1));

        VidaArquero.setMaximum(250);
        VidaArquero.setToolTipText("");
        VidaArquero.setValue(250);
        getContentPane().add(VidaArquero, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 650, 120, -1));

        VidaValkiria.setMaximum(400);
        VidaValkiria.setValue(400);
        getContentPane().add(VidaValkiria, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 670, 120, -1));

        VidaMago.setMaximum(200);
        VidaMago.setValue(200);
        getContentPane().add(VidaMago, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 690, 120, -1));
        getContentPane().add(TimeArquero, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 650, -1, -1));
        getContentPane().add(TimeValkiria, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 670, -1, -1));
        getContentPane().add(TimeMago, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 690, -1, -1));

        data1.setText("HP 250/250");
        getContentPane().add(data1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 650, -1, -1));

        data2.setText("HP 400/400");
        getContentPane().add(data2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 670, -1, -1));

        data3.setText("HP 200/200");
        getContentPane().add(data3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 690, -1, -1));

        Arquero1.setText("Atacar");
        Arquero1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Arquero1MouseClicked(evt);
            }
        });
        Arquero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Arquero1ActionPerformed(evt);
            }
        });
        getContentPane().add(Arquero1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, -1, -1));

        Arquero2.setText("Recargar");
        Arquero2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Arquero2MouseClicked(evt);
            }
        });
        getContentPane().add(Arquero2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, -1, -1));

        Valkiria1.setText("Ataque");
        Valkiria1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Valkiria1MouseClicked(evt);
            }
        });
        getContentPane().add(Valkiria1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 530, -1, -1));

        Valkiria2.setText("Modo Berserk");
        Valkiria2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Valkiria2MouseClicked(evt);
            }
        });
        getContentPane().add(Valkiria2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 500, -1, -1));

        Mago1.setText("Ataque");
        Mago1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Mago1MouseClicked(evt);
            }
        });
        Mago1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mago1ActionPerformed(evt);
            }
        });
        getContentPane().add(Mago1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 640, -1, -1));

        Mago2.setText("Sanacion");
        Mago2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Mago2MouseClicked(evt);
            }
        });
        getContentPane().add(Mago2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 610, -1, -1));

        dato4.setText("Arquero");
        getContentPane().add(dato4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 650, -1, -1));

        dato5.setText("Valkiria");
        getContentPane().add(dato5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 670, -1, -1));

        dato6.setText("Mago");
        getContentPane().add(dato6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 690, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Diaz\\Desktop\\Progra 2\\Assets\\Pieces 100x100\\archer100x100.png")); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, -1, -1));

        flechas.setText("Flechas : 1");
        getContentPane().add(flechas, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 480, -1, -1));
        getContentPane().add(texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 360, 70));

        background.setIcon(new javax.swing.ImageIcon("C:\\Users\\Diaz\\Desktop\\Progra 2\\PopUp Battle Background.png")); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 730));
        getContentPane().add(timedragon, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 600, 270, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents
int ataque1=5;
int  ataque2=20;
int ataque3=10;
int cont = 1;
int vida1=25;
int vida2=40;
int vida3=20;
     
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    timedragon.setValue(0);
    timerdragon=new Timer(100,new Juego.progress());    
    timerdragon.start();
    TimeArquero.setValue(0);
    timerarquero=new Timer(100,new Juego.progress());    
    timerarquero.start();
    TimeValkiria.setValue(0);
    timervalkiria=new Timer(100,new Juego.progress());    
    timervalkiria.start();
    TimeMago.setValue(0);
    timermago=new Timer(100,new Juego.progress());    
    timermago.start();
// TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void Mago1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mago1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Mago1ActionPerformed

    private void Arquero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Arquero1ActionPerformed
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_Arquero1ActionPerformed

    private void Arquero1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Arquero1MouseClicked
        int vda1=VidaArquero.getValue();
        int d=Vidadragon.getValue();
        int aa=ataque1;
        int dt=d-aa;
        Vidadragon.setValue(dt);
        TimeArquero.setValue(0);
        if(cont>1){            
        
            ataque1=ataque1+(cont*5);
            ataque1=0;
            cont=0;
        }
        flechas.setText("Flechas : "+cont);
        if (vda1<=0){
            vda1=0;
        VidaArquero.setValue(vda1);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_Arquero1MouseClicked

    private void Valkiria1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Valkiria1MouseClicked
        int vda1=VidaValkiria.getValue();
        int d=Vidadragon.getValue();
        int aa=ataque2;
        int dt=d-aa;
        Vidadragon.setValue(dt);
        TimeValkiria.setValue(0);        
        if (vda1<=0){
        vda1=0;
        VidaValkiria.setValue(vda1);
        }
// TODO add your handling code here:
    }//GEN-LAST:event_Valkiria1MouseClicked

    private void Mago1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Mago1MouseClicked
        int vda1=VidaMago.getValue();
        int d=Vidadragon.getValue();
        int aa=ataque3;
        int dt=d-aa;
        Vidadragon.setValue(dt);
        TimeMago.setValue(0);
        if (vda1<=0){
        vda1=0;
        VidaMago.setValue(vda1);
        }
        sonido.loop();
// TODO add your handling code here:
    }//GEN-LAST:event_Mago1MouseClicked

    private void Arquero2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Arquero2MouseClicked
      int vda1=VidaArquero.getValue();
      ataque1+=5;
      cont++;
      TimeArquero.setValue(0);
      flechas.setText("Flechas : "+cont);
       if (vda1<=0){
        vda1=0;
        VidaArquero.setValue(vda1); 
       }
// TODO add your handling code here:   
    }//GEN-LAST:event_Arquero2MouseClicked

    private void Valkiria2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Valkiria2MouseClicked
        int vda1=VidaValkiria.getValue();
        ataque2*=2;
        int vida=VidaValkiria.getValue();
        VidaValkiria.setValue(vida/2);
        TimeValkiria.setValue(0);
        data2.setText("HP "+(vida/2)+"/400");
        if (vda1<=0){
        vda1=0;
        VidaValkiria.setValue(vda1);
        }   
// TODO add your handling code here:
    }//GEN-LAST:event_Valkiria2MouseClicked

    private void Mago2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Mago2MouseClicked
        int vda1=VidaMago.getValue();
        if (vda1<=0){
        vda1=0;
        VidaMago.setValue(vda1);
        }
         int vidaa=VidaArquero.getValue();
        int vidav=VidaValkiria.getValue();
        int vidam=VidaMago.getValue();
       
        int vidaj=vidaa+vida1;
        int vidak=vidav+vida2;
        int vidal=vidam+vida3;
       
        if(vidaj>=250){
            vidaj=250;
        }
        if(vidak>=400){
            vidak=400;
        }
        if(vidal>=200){
            vidal=200;
        }
        
       VidaArquero.setValue(vidaj);
       VidaValkiria.setValue(vidak);
       VidaMago.setValue(vidal);
        
       TimeMago.setValue(0);
       data1.setText("HP "+vidaj+"/250");
       data2.setText("HP "+vidak+"/400");
       data3.setText("HP "+vidal+"/200");
// TODO add your handling code here:
    }//GEN-LAST:event_Mago2MouseClicked

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
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Juego().setVisible(true);
            }
        });
    }
    private AudioClip sonido; 
    private Timer timermago;
    private Timer timerarquero;
    private Timer timervalkiria;
    private Timer timerdragon;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Arquero1;
    private javax.swing.JButton Arquero2;
    private javax.swing.JButton Mago1;
    private javax.swing.JButton Mago2;
    private javax.swing.JProgressBar TimeArquero;
    private javax.swing.JProgressBar TimeMago;
    private javax.swing.JProgressBar TimeValkiria;
    private javax.swing.JButton Valkiria1;
    private javax.swing.JButton Valkiria2;
    private javax.swing.JProgressBar VidaArquero;
    private javax.swing.JProgressBar VidaMago;
    private javax.swing.JProgressBar VidaValkiria;
    private javax.swing.JProgressBar Vidadragon;
    private javax.swing.JLabel background;
    private javax.swing.JLabel data1;
    private javax.swing.JLabel data2;
    private javax.swing.JLabel data3;
    private javax.swing.JLabel dato4;
    private javax.swing.JLabel dato5;
    private javax.swing.JLabel dato6;
    private javax.swing.JLabel dragon;
    private javax.swing.JLabel flechas;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel muerte;
    private javax.swing.JLabel muerte1;
    private javax.swing.JLabel muerte2;
    private javax.swing.JLabel muerte3;
    private javax.swing.JLabel texto;
    private javax.swing.JProgressBar timedragon;
    // End of variables declaration//GEN-END:variables
}
