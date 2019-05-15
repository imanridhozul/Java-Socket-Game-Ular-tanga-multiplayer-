package tubes_prog;

import java.applet.Applet;
import java.io.*;
import java.net.*;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class SerCh extends Thread{
    private String t;
    private String ii;
   
    static int flag =0;
    public void gogo(String s)
    {
                     PapanMain.kocokk.setEnabled(true);
                     PapanMain.ww.setText("Giliran Kamu");                     
                     try
                    {
                          PapanMain.daduEnemy = Integer.valueOf(s);  
                    }
                    catch(java.lang.NumberFormatException c)
                    {
                        System.out.println(c);
                    }
                                        
                     PapanMain.setPosisiEnemy(PapanMain.daduEnemy);
                     System.out.print("Hasl    :  "+(PapanMain.getPosisiEnemy()-PapanMain.daduEnemy));
                     PosisisEnemy getpos = new PosisisEnemy((PapanMain.getPosisiEnemy()-PapanMain.daduEnemy),PapanMain.daduEnemy);
                     getpos.start();
    }
    public void suara(String emot)
    {
                              if("emot1.gif".equals(emot))
                              {
                                  PapanMain.suaraEmot = Applet.newAudioClip(getClass().getResource("sound/menang.wav"));
                                     PapanMain.suaraEmot.play();
                              }
                              else if("emot2.gif".equals(emot))
                              {
                                  PapanMain.suaraEmot = Applet.newAudioClip(getClass().getResource("sound/bingung.wav"));
                                     PapanMain.suaraEmot.play();
                              }
                              if("emot3.gif".equals(emot))
                              {
                                  PapanMain.suaraEmot = Applet.newAudioClip(getClass().getResource("sound/marah.wav"));
                                     PapanMain.suaraEmot.play();
                              }
                              if("emot4.gif".equals(emot))
                              {
                                  PapanMain.suaraEmot = Applet.newAudioClip(getClass().getResource("sound/nangis.wav"));
                                     PapanMain.suaraEmot.play();
                              }
                           
     }
    @Override
 public void run() {
        BufferedReader in = null;
        try {
            ServerSocket server = null;
            Socket client = null;
            try {
                server = new ServerSocket(8888);
                System.out.println("Server telah online");
                PapanMain.waiting.setText("Waiting For Client.......");
                client = server.accept();
                 PapanMain.waiting.setVisible(false);
                System.out.println("Client telah masuk dan bisa online");
            } 
            catch (IOException e) {
                System.out.println(e.getMessage());
                System.exit(-1);
            }   
            int ttm=0;
            in = new BufferedReader(new InputStreamReader(client.getInputStream()));
            PrintStream out = new PrintStream(client.getOutputStream());
            BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));
            String pesan = null;
            int jj = 0,max=100;String emot = "null";//untuk nampung emot yang dikirim
            while (PapanMain.win==false||PapanMain.indexClient<max) {
                 try {//try untuk thread
                     try
                      {//try untuk number
                         pesan = in.readLine();
                        
                         StringTokenizer defaultTokenizer = new StringTokenizer(pesan,",");
                         System.out.println("Total number of tokens found : " + defaultTokenizer.countTokens());        
                         int jumlah=0;
                         try{//try untuk tokenizer
                             while (defaultTokenizer.hasMoreTokens())
                             {
                                 if(jumlah==0)
                                 {
                                     emot=defaultTokenizer.nextToken();
                                 }
                                 else
                                 {
                                    ttm=Integer.valueOf(defaultTokenizer.nextToken()); 
                                 }
                                 jumlah++;
                             }
                          } catch(NoSuchElementException ex){System.out.println("salah");}
                         
                          if(!"null".equals(emot))
                          {
                              ImageIcon emott = new ImageIcon(emot);  //ini menset icon untuk emot yg dikirim (menampilkannya di papan main)                              
                              suara(emot);
                              int bc = 0;
                              while(bc!=1)
                                {
                                    try {
                                        PapanMain.em1.setIcon(emott);PapanMain.em1.setVisible(true);PapanMain.em1.setText("");
                                        bc++;
                                        Thread.sleep(1300);
                                    } catch (InterruptedException ex) {
                                        System.err.println("Error: Thread Interrupted.");
                                    }
                                }
                              PapanMain.em1.setVisible(false);

                          }                         
                          jj = PapanMain.getPosisiEnemy() + ttm;
                          System.out.println("ini posisi ENEMY sebelumnya : " + PapanMain.getPosisiEnemy()+" Setelahnya "+jj+"   :: "+emot);
                          PapanMain.wx.setText(String.valueOf(ttm));
                      }
                      catch(java.lang.NumberFormatException c)
                      {System.out.println(c);}  
                      if(ttm==6)//mekanisme perulangan
                      {
                           out.println("null,0");  //mengirim posisi ke musuh
                           try
                            {
                                  PapanMain.daduEnemy = ttm;  
                            }
                            catch(java.lang.NumberFormatException c)
                            {
                                System.out.println(c);
                            }

                             PapanMain.setPosisiEnemy(PapanMain.daduEnemy);
                             System.out.print("Hasl    :  "+(PapanMain.getPosisiEnemy()-PapanMain.daduEnemy));
                             PosisisEnemy getpos = new PosisisEnemy((PapanMain.getPosisiEnemy()-PapanMain.daduEnemy),PapanMain.daduEnemy);
                             getpos.start();
                             continue;
                      }
                      if(jj==max)
                      {break;}
                      gogo(String.valueOf(ttm));                    
                      System.out.println("Selesai ? ");
                      while(PapanMain.selesai==false)
                      {                           
                          System.out.print("");
                          if(PapanMain.selesai==true){                                                      
                            PapanMain.kocokk.setEnabled(false);PapanMain.stops.setEnabled(false);                            
                            PapanMain.ww.setText("Giliran Lawan");
                            PapanMain.selesai=false;
                            System.out.println("index server yang dikirim = "+PapanMain.getPosisiServ());
                            System.out.print("xxx"+PapanMain.kotak[102].getText());
                            out.println(PapanMain.emotKirim+","+PapanMain.kotak[102].getText());  //mengirim posisi ke musuh
                            PapanMain.emotKirim ="null";
                            break;
                            }
                      } //while papan main                     
                      if(PapanMain.win==true)
                      {
                         System.out.print("You winnnnnn serv");
                         PapanMain.ww.setVisible(false);
                         JOptionPane.showMessageDialog(null,"Kamu Menang!");
                         server.close();
                         PapanMain.kembali.setVisible(true);
                         break;
                      }    
                      Thread.sleep(30);
                } catch (InterruptedException ex) {
                    System.err.println("Error: Thread Interrupted.");
                }
                 
            }//while utama
            if(PapanMain.win==false)
            {       
               System.out.print("you losesesssss");
               PapanMain.ww.setVisible(false);
               PapanMain.jlcl[max].setVisible(true);
               PapanMain.jlcl[PapanMain.getPosisiEnemy()].setVisible(false);
               JOptionPane.showMessageDialog(null,"Kamu Kalah!!!!");
               PapanMain.kembali.setVisible(true);
               server.close();
            }
        } catch (IOException ex) {
            Logger.getLogger(SerCh.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                in.close();
            } catch (IOException ex) {
                Logger.getLogger(SerCh.class.getName()).log(Level.SEVERE, null, ex);
            }//cat
        }//finaly
        this.stop();
    }//run

}
