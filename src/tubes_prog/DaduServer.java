package tubes_prog;


import java.applet.Applet;
import java.awt.Color;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

  public class DaduServer extends Thread {
         int angka,max=100;
        static int passDadu;
        Random r;
        public DaduServer()
        {
            r = new Random();
        }
         public boolean cekTangga(int pos)
        {
            boolean x = false;
            if(pos==3||pos==8||pos==28||pos==58||pos==75||pos==80||pos==90)
            {
                x=true;
            }
            
            return x;
            
        }
        public int naik(int pos)
        {
            if(pos==3){pos=21;}
            if(pos==8){pos=30;}
            if(pos==28){pos=84;}
            if(pos==58){pos=77;}
            if(pos==75){pos=86;}
            if(pos==80){pos=99;}
            if(pos==90){pos=91;}
            return pos;
        }
        
        public int turun(int pos)
        {
            if(pos==17){pos=13;}
            if(pos==52){pos=29;}
            if(pos==57){pos=40;}
            if(pos==62){pos=22;}
            if(pos==88){pos=18;}
            if(pos==97){pos=79;}
            if(pos==95){pos=70;}
            return pos;
        }
        public boolean cekUlar(int pos)
        {
            boolean x = false;
            if(pos==17||pos==52||pos==57||pos==62||pos==88||pos==95||pos==97)
            {
                x=true;
            }
            return x;
            
        }
        public void run()
        {
            while (PapanMain.dadu==false){
                try {
                    angka = r.nextInt(6);
                    PapanMain.kotak[102].setText(String.valueOf(angka+1));
                     ImageIcon dadus = new ImageIcon("dadu/dadu"+(angka+1)+".png");
                     PapanMain.gambarDadu.setIcon(dadus);PapanMain.gambarDadu.setText("");
                    Thread.sleep(20);
                } catch (InterruptedException ex) {
                    System.err.println("Error: Thread Interrupted.");
                }
            }
            angka=angka+1;
            passDadu=angka;
            System.out.print("ini dadu"+passDadu);
            int i=PapanMain.getPosisiServ();
            PapanMain.setPosisiServer(passDadu); //ini menambahkan posisi sebelumnya dengan dadunya 
            int ps = PapanMain.getPosisiServ();
            int tmp=0;
            if(ps==max)//kondisi kalau sudah 100
            {
                PapanMain.win = true;
                PapanMain.ww.setText("you win dadu");
                 JOptionPane.showMessageDialog(null,"Kamu Menang!");
                 PapanMain.wx.setVisible(false);
                 PapanMain.kembali.setVisible(true);
                
                while(i!=max)
                {
                    try {

                              PapanMain.jlser[i+1].setVisible(true);
                              PapanMain.soundTrack2.play();
                              if(i!=0)
                              {
                                 PapanMain.jlser[i].setVisible(false); 
                              }
                          i++;
                        Thread.sleep(250);
                    } catch (InterruptedException ex) {
                        System.err.println("Error: Thread Interrupted.");
                    }
                }//ini bergerak sampai finish
               this.stop();               
            } //akhir if kondisi kalau 100               
            if(ps>max)//kondisi kalau lebih dari 100 agar mundur
            {
                tmp = ps - max;//misal 17 maka tmp nilainya 2 dan posisi akan ke 13
//                System.out.println("ini lebih besar dari 15 maka akan mundur ini ps "+ps +" ini tmp "+ tmp + " langkah ini pos awal " + i);               
                while(i!=max)
                {
                    try {

                              PapanMain.jlser[i+1].setVisible(true);                              
                              PapanMain.soundTrack2.play();
                              if(i!=0)
                              {
                                 PapanMain.jlser[i].setVisible(false); 
                              }
                          i++;
                        Thread.sleep(250);
                    } catch (InterruptedException ex) {
                        System.err.println("Error: Thread Interrupted.");
                    }
                }//ini bergerak sampai finish
                int pm=max-tmp;//15 - 2 = 13
                while(i!=pm) //ini memundurkan sampai berapa kotak kebelakang kalau tidak tepat 15
                {
                    try {

                              PapanMain.jlser[i-1].setVisible(true);                             
                              PapanMain.soundTrack2.play();
                              if(i!=0)
                              {
                                 PapanMain.jlser[i].setVisible(false); 
                              }
                          i--;
                        Thread.sleep(250);
                    } catch (InterruptedException ex) {
                        System.err.println("Error: Thread Interrupted.");
                    }
                }
                PapanMain.indexServer=pm;     
                System.out.println("ini pm  :  "+pm);
            }
            else
            {
                while (i!=PapanMain.getPosisiServ()){
                    try {

                              PapanMain.jlser[i+1].setVisible(true);                              
                              PapanMain.soundTrack2.play();
                              if(i!=0)
                              {
                                 PapanMain.jlser[i].setVisible(false); 
                              }
                          i++;
                        Thread.sleep(140);
                    } catch (InterruptedException ex) {
                        System.err.println("Error: Thread Interrupted.");
                    }
                }
            }
            if(cekTangga(PapanMain.getPosisiServ()))
            {
                int smt = PapanMain.getPosisiServ();
                System.out.println("\t \t anda Naik  " + smt);                
                PapanMain.jlser[PapanMain.getPosisiServ()].setVisible(false);//ini menghilangkan sebelum naik ke tangga
                PapanMain.indexServer = naik(PapanMain.getPosisiServ());//kalau dadunya 2 maka posisi aslinya 3
                System.out.println("\t \t ini posisi baru anda " + PapanMain.getPosisiServ());
                PapanMain.jlser[PapanMain.getPosisiServ()].setVisible(true);
//                PapanMain.jlser[PapanMain.getPosisiServ()].setText("Server");
            }
            if(cekUlar(PapanMain.getPosisiServ()))
            {
                int smt = PapanMain.getPosisiServ();
                System.out.println("\t \t anda turun  " + smt);                
                PapanMain.jlser[PapanMain.getPosisiServ()].setVisible(false);//ini menghilangkan sebelum naik ke tangga
                PapanMain.indexServer = turun(PapanMain.getPosisiServ());//kalau dadunya 2 maka posisi aslinya 3
                System.out.println("\t \t ini posisi baru anda " + PapanMain.getPosisiServ());
                PapanMain.jlser[PapanMain.getPosisiServ()].setVisible(true);
//                PapanMain.jlser[PapanMain.getPosisiServ()].setText("Server");
            }
//            PapanMain.setLangkahServer(angka);
//            System.out.print(angka+"  :: "+PapanMain.langkahServer);
            this.stop();
        }//runt
    }//t