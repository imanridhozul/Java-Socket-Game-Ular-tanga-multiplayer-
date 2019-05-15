package tubes_prog;


import java.applet.Applet;
import java.io.*;
import java.net.*;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ClientCh extends Thread{
    private String t;
    private String ii;
    public void gogo(String s)
    {

                       System.out.print("\n data diterima dari server: "+s);
                       ClientPapan.kocok.setEnabled(true);
                       ClientPapan.kk.setText("Giliran Kamu"); 
                        try
                        {
                            ClientPapan.daduEnemy = Integer.valueOf(s);
                        }
                        catch(java.lang.NumberFormatException c)
                        {
                            System.out.println(c);
                        }
                         
                       ClientPapan.setPosisiServer(ClientPapan.daduEnemy);
                       System.out.print("ini posisi server baru   : "+ClientPapan.getPosisiServer());
                       PosisisEnemy getpos = new PosisisEnemy((ClientPapan.getPosisiServer()-ClientPapan.daduEnemy),ClientPapan.daduEnemy);
                       getpos.start();
    }
    public void suara(String emotMusuh)
    {
                       
                              if("emot1.gif".equals(emotMusuh))
                              {
                                  ClientPapan.suaraEmot = Applet.newAudioClip(getClass().getResource("sound/menang.wav"));
                                  ClientPapan.suaraEmot.play();
                              }
                              if("emot2.gif".equals(emotMusuh))
                              {
                                  ClientPapan.suaraEmot = Applet.newAudioClip(getClass().getResource("sound/bingung.wav"));
                                  ClientPapan.suaraEmot.play();
                              }
                              if("emot3.gif".equals(emotMusuh))
                              {
                                  ClientPapan.suaraEmot = Applet.newAudioClip(getClass().getResource("sound/marah.wav"));
                                  ClientPapan.suaraEmot.play();
                              }
                              if("emot4.gif".equals(emotMusuh))
                              {
                                  ClientPapan.suaraEmot = Applet.newAudioClip(getClass().getResource("sound/nangis.wav"));
                                  ClientPapan.suaraEmot.play();
                              }
                              
    }
    @Override
public void run() {
        try {
            Socket client = null;
            client = new Socket (ClientConfig.ipserver,8888);
            BufferedReader sin=new BufferedReader(new InputStreamReader(client.getInputStream()));
            PrintStream sout=new PrintStream(client.getOutputStream());
            BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));
            String s = null,emotMusuh="null";//menampung emot yang dikirim musuh
            int jj = 0,ttm=0;
            int max = 100;
            StringTokenizer defaultTokenizer = null;
            sout.println(ClientPapan.emot+",1");
            while (ClientPapan.clienwin==false||ClientPapan.indexServer<max){ 
                try {  
                    try
                    {
                         s=sin.readLine(); 
                         try{
                            defaultTokenizer = new StringTokenizer(s,",");
                         }
                         catch(java.lang.NullPointerException ee)
                         {
                             
                         }
                         System.out.println("Total number of tokens found : " + defaultTokenizer.countTokens());        
                         int jumlah=0;
                         try{
                             while (defaultTokenizer.hasMoreTokens())
                             {
                                 if(jumlah==0)
                                 {
                                     emotMusuh=defaultTokenizer.nextToken();
                                 }
                                 else
                                 {
                                    ttm=Integer.valueOf(defaultTokenizer.nextToken()); 
                                 }
                                 jumlah++;
                             }
                          } catch(NoSuchElementException ex){System.out.println("salah");}
                        if(!"null".equals(emotMusuh))
                          {
                              ImageIcon emott = new ImageIcon(emotMusuh);  //menset emot yg dikirim musuh dipapan client                              
                               int bc = 0;
                              while(bc!=1)
                                {
                                    try {
                                        ClientPapan.em1.setIcon(emott);
                                        ClientPapan.em1.setVisible(true);
                                        ClientPapan.em1.setText("");suara(emotMusuh);
                                        bc++;
                                        Thread.sleep(1300);
                                    } catch (InterruptedException ex) {
                                        System.err.println("Error: Thread Interrupted.");
                                    }
                                }
                              ClientPapan.em1.setVisible(false);
                              
                          }
                        jj = ClientPapan.getPosisiServer() + ttm;
                         System.out.println("ini posisi ENEMY sebelumnya : " + ClientPapan.getPosisiServer()+" Setelahnya "+jj);
                        ClientPapan.dadumusuh.setText(String.valueOf(ttm));
                    }
                    catch(java.lang.NumberFormatException c)
                    {
                        System.out.println(c);
                    }
                    if(ttm==6)
                      {
                        sout.println("null,0");  //mengirim posisi ke musuh
                        try
                        {
                            ClientPapan.daduEnemy = ttm;
                        }
                        catch(java.lang.NumberFormatException c)
                        {
                            System.out.println(c);
                        }
                         
                       ClientPapan.setPosisiServer(ClientPapan.daduEnemy);
                       System.out.print("ini posisi server baru   : "+ClientPapan.getPosisiServer());
                       PosisisEnemy getpos = new PosisisEnemy((ClientPapan.getPosisiServer()-ClientPapan.daduEnemy),ClientPapan.daduEnemy);
                       getpos.start();
                       continue;
                      }
                    if(jj==max)
                      {
                          break;
                      }
                    gogo(String.valueOf(ttm));
                    System.out.println("selesaClientPapani ?" );
                    while(ClientPapan.clienwin==false)
                    {
                       System.out.print("");
                       if(ClientPapan.selesai==true)
                       {
                           ClientPapan.kocok.setEnabled(false);ClientPapan.stop.setEnabled(false);
                           ClientPapan.kk.setText("Giliran Lawan");
                           System.out.print("ini yang dikirim "+ClientPapan.kotak[102].getText());
                           if(ClientPapan.clienwin==false)
                            {
                             sout.println(ClientPapan.emot+","+ClientPapan.kotak[102].getText()); 
                            }
                           ClientPapan.emot = "null";
                           ClientPapan.selesai=false;
                           break;
                       }
                    }
                    if(ClientPapan.clienwin==true)
                      {
                          System.out.print("You win di clieent");
                          ClientPapan.kk.setVisible(false);
                          ClientPapan.kocok.setEnabled(false);ClientPapan.stop.setEnabled(false);
                          ClientPapan.kembali.setVisible(true);
                          break;
                      }

                    Thread.sleep(30);
                } catch (InterruptedException ex) {
                    System.err.println("Error: Thread Interrupted.");
                }
                
            }//while
            if(ClientPapan.clienwin==false)
            {         
                System.out.print("you loooose");
                ClientPapan.kk.setText("Kamu Kalah!");
                ClientPapan.dadumusuh.setVisible(false);
                JOptionPane.showMessageDialog(null,"Kamu Kalah");
                ClientPapan.jlser[max].setVisible(true);
                ClientPapan.jlser[ClientPapan.getPosisiServer()].setVisible(false);
                ClientPapan.kembali.setVisible(true);
            }
        } catch (IOException ex) {
            Logger.getLogger(ClientCh.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.stop();
}//run

}