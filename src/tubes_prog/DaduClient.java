package tubes_prog;


import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

  public class DaduClient extends Thread {
         int angka,max=100;
        static int passDadu;
        Random r;
        public DaduClient()
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
            while (ClientPapan.dadu==false){
                try {
                    angka = r.nextInt(6);
                    ClientPapan.kotak[102].setText(String.valueOf(angka+1));
                     ImageIcon dadus = new ImageIcon("dadu/dadu"+(angka+1)+".png");
                     ClientPapan.gambarDadu.setIcon(dadus);ClientPapan.gambarDadu.setText("");
                    Thread.sleep(20);
                } catch (InterruptedException ex) {
                    System.err.println("Error: Thread Interrupted.");
                }
            }
            angka=angka+1;
            int i=ClientPapan.getPosisiClient();
            passDadu=angka;
            ClientPapan.setPosisiClient(passDadu);
            int ps = ClientPapan.getPosisiClient();
            int tmp=0;
            if(ps==max)
            {
                ClientPapan.clienwin = true;
                 ClientPapan.kk.setText("you win");
                 JOptionPane.showMessageDialog(null,"Kamu Menang!");
                 ClientPapan.dadumusuh.setVisible(false);
                 ClientPapan.kembali.setVisible(true);
                while(i!=max)
                {
                    try {

                              ClientPapan.jlcl[i+1].setVisible(true);
                              ClientPapan.soundTrack2.play();
                              if(i!=0)
                              {
                                 ClientPapan.jlcl[i].setVisible(false); 
                              }
                          i++;
                        Thread.sleep(250);
                    } catch (InterruptedException ex) {
                        System.err.println("Error: Thread Interrupted.");
                    }
                }
                this.stop();
            }
            if(ps>max)
            {
                tmp = ps - max;//misal 17 maka tmp nilainya 2 dan posisi akan ke 13
//                System.out.println("ini lebih besar dari 15 maka akan mundur ini ps "+ps +" ini tmp "+ tmp + " langkah ini pos awal " + i);               
                while(i!=max)
                {
                    try {

                              ClientPapan.jlcl[i+1].setVisible(true);
                              ClientPapan.soundTrack2.play();
                              if(i!=0)
                              {
                                 ClientPapan.jlcl[i].setVisible(false); 
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

                              ClientPapan.jlcl[i-1].setVisible(true);
                              ClientPapan.soundTrack2.play();
                              if(i!=0)
                              {
                                 ClientPapan.jlcl[i].setVisible(false); 
                              }
                          i--;
                        Thread.sleep(250);
                    } catch (InterruptedException ex) {
                        System.err.println("Error: Thread Interrupted.");
                    }
                }
                ClientPapan.indexClient=pm;     
                System.out.println("ini pm  :  "+pm);
            }
            else
            {
                while (i!=ClientPapan.indexClient){
                try {
                            
                          ClientPapan.jlcl[i+1].setVisible(true);
                          ClientPapan.soundTrack2.play();
                          if(i!=0)
                          {
                            ClientPapan.jlcl[i].setVisible(false);  
                          }                          
                      i++;
                    Thread.sleep(250);
                    } catch (InterruptedException ex) {
                        System.err.println("Error: Thread Interrupted.");
                    }
                }
            }
            
            if(cekTangga(ClientPapan.getPosisiClient()))
            {
                int smt = ClientPapan.getPosisiClient();
                System.out.println("\t \t anda Naik  " + smt);                
                ClientPapan.jlcl[ClientPapan.getPosisiClient()].setVisible(false);//ini menghilangkan sebelum naik ke tangga
                ClientPapan.indexClient = naik(ClientPapan.getPosisiClient());//kalau dadunya 2 maka posisi aslinya 3
                System.out.println("\t \t ini posisi baru anda " + ClientPapan.getPosisiClient());
                ClientPapan.jlcl[ClientPapan.getPosisiClient()].setVisible(true);
//                ClientPapan.jlcl[ClientPapan.getPosisiClient()].setText("client");
            }
            if(cekUlar(ClientPapan.getPosisiClient()))
            {
                int smt = ClientPapan.getPosisiClient();
                System.out.println("\t \t anda turun  " + smt);                
                ClientPapan.jlcl[ClientPapan.getPosisiClient()].setVisible(false);//ini menghilangkan sebelum naik ke tangga
                ClientPapan.indexClient = turun(ClientPapan.getPosisiClient());//kalau dadunya 2 maka posisi aslinya 3
                System.out.println("\t \t ini posisi baru anda " + ClientPapan.getPosisiClient());
                ClientPapan.jlcl[ClientPapan.getPosisiClient()].setVisible(true);
//                ClientPapan.jlcl[ClientPapan.getPosisiClient()].setText("client");
            }
        }
    }//t