/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes_prog;

/**
 *
 * @author Windows 8.1 Pro
 */
public class PosisisEnemy extends Thread{
    int awal,akhir,max=100;
    public PosisisEnemy(int awal,int akhir)
    {
        this.awal = awal;this.akhir=akhir;
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
        int tmp=0;
        if(PapanMain.iniserver==true)
        {
            int i=0;
            if(PapanMain.getPosisiEnemy() >max )
            {
                    tmp = PapanMain.getPosisiEnemy() - max;//awal 12 ,akhir 5 , posisi server 17 tmp = 2 jadinya
                    while(awal!=max)
                    {
                        try {

                              PapanMain.jlcl[awal+1].setVisible(true);
                              PapanMain.soundTrack2.play();
                              if(awal!=0)
                              {
                                 PapanMain.jlcl[awal].setVisible(false); 
                              }
                          awal++;
                        Thread.sleep(250);
                        } catch (InterruptedException ex) {
                            System.err.println("Error: Thread Interrupted.");
                        }
                    }//ini bergerak sampai 15
                    //ini code dibawah untuk mundrukan
                    
                    int pm = max - tmp;//menghasilkan 13 sehingga dia akan ke 13
                    while(awal!=pm)
                    {
                        try {

                             PapanMain.jlcl[awal-1].setVisible(true);
                             PapanMain.soundTrack2.play();
                              if(awal!=0)
                              {
                                PapanMain.jlcl[awal].setVisible(false); 
                              }
                          awal--;
                        Thread.sleep(250);
                        } catch (InterruptedException ex) {
                            System.err.println("Error: Thread Interrupted.");
                        }
                    }
                    PapanMain.indexClient = pm;
            }
            else //kalau dia tidak max
            {
                while (i!=akhir){
                    try {

                              PapanMain.jlcl[awal+1].setVisible(true);
                              PapanMain.soundTrack2.play();
                              if(awal!=0)
                              {
                                 PapanMain.jlcl[awal].setVisible(false); 
                              }
                          i++;awal++;
                        Thread.sleep(250);
                    } catch (InterruptedException ex) {
                        System.err.println("Error: Thread Interrupted.");
                    }
                }
            }
            //ini sudah sampai diakhir
            if(cekTangga(PapanMain.getPosisiEnemy()))
            {
                
                int smt = PapanMain.getPosisiEnemy();
                System.out.println("\t \t musuh Naik  " + smt);                
                PapanMain.jlcl[PapanMain.getPosisiEnemy()].setVisible(false);//ini menghilangkan sebelum naik ke tangga
                PapanMain.indexClient = naik(PapanMain.getPosisiEnemy());//kalau dadunya 2 maka posisi aslinya 3
                System.out.println("\t \t ini posisi musuh baru  " + PapanMain.getPosisiEnemy());
                PapanMain.jlcl[PapanMain.getPosisiEnemy()].setVisible(true);
//                PapanMain.jlcl[PapanMain.getPosisiEnemy()].setText("CLient");
            }
            if(cekUlar(PapanMain.getPosisiEnemy()))
            {
               int smt = PapanMain.getPosisiEnemy();
                System.out.println("\t \t musuh turun  " + smt);                
                PapanMain.jlcl[PapanMain.getPosisiEnemy()].setVisible(false);//ini menghilangkan sebelum naik ke tangga
                PapanMain.indexClient = turun(PapanMain.getPosisiEnemy());//kalau dadunya 2 maka posisi aslinya 3
                System.out.println("\t \t ini posisi musuh baru stlh turin " + PapanMain.getPosisiEnemy());
                PapanMain.jlcl[PapanMain.getPosisiEnemy()].setVisible(true);
//                PapanMain.jlcl[PapanMain.getPosisiEnemy()].setText("musuh");
            }
        }
        if(ClientPapan.iniClient==true && ClientPapan.clienwin==false)
        {
            int i=0;   
            if(ClientPapan.getPosisiServer() >max )
            {
                    tmp = ClientPapan.getPosisiServer() - max;//awal 12 ,akhir 5 , posisi server 17 tmp = 2 jadinya
                    while(awal!=max)
                    {
                        try {

                              ClientPapan.jlser[awal+1].setVisible(true);
                              ClientPapan.soundTrack2.play();
                              if(awal!=0)
                              {
                                 ClientPapan.jlser[awal].setVisible(false); 
                              }
                          awal++;
                        Thread.sleep(250);
                        } catch (InterruptedException ex) {
                            System.err.println("Error: Thread Interrupted.");
                        }
                    }//ini bergerak sampai 15
                    //ini code dibawah untuk mundrukan
                    
                    int pm = max - tmp;//menghasilkan 13 sehingga dia akan ke 13
                    while(awal!=pm)
                    {
                        try {

                              ClientPapan.jlser[awal-1].setVisible(true);
                              ClientPapan.soundTrack2.play();
                              if(awal!=0)
                              {
                                 ClientPapan.jlser[awal].setVisible(false); 
                              }
                          awal--;
                        Thread.sleep(250);
                        } catch (InterruptedException ex) {
                            System.err.println("Error: Thread Interrupted.");
                        }
                    }
                    ClientPapan.indexServer = pm;
            }
            else
            {
                while (i!=akhir){
                     try {
                           
                          ClientPapan.jlser[awal+1].setVisible(true);
                          ClientPapan.soundTrack2.play();
                          if(awal!=0)
                          {
                             ClientPapan.jlser[awal].setVisible(false); 
                          }
                      i++;awal++;
                    Thread.sleep(250);
                    } catch (InterruptedException ex) {
                        System.err.println("Error: Thread Interrupted.");
                    }
                }//ini while
            }//ini else
           
             if(cekTangga(ClientPapan.getPosisiServer()))
            {
                
                int smt = ClientPapan.getPosisiServer();
                System.out.println("\t \t musuh Naik  " + smt);                
                ClientPapan.jlser[ClientPapan.getPosisiServer()].setVisible(false);//ini menghilangkan sebelum naik ke tangga
                ClientPapan.indexServer= naik(ClientPapan.getPosisiServer());//kalau dadunya 2 maka posisi aslinya 3
                System.out.println("\t \t ini posisi musuh baru  " + ClientPapan.getPosisiServer());
                ClientPapan.jlser[ClientPapan.getPosisiServer()].setVisible(true);//nyalain posisi baru
//                ClientPapan.jlser[ClientPapan.getPosisiServer()].setText("INI Server");
            }
            if(cekUlar(ClientPapan.getPosisiServer()))
            {
                
                int smt = ClientPapan.getPosisiServer();
                System.out.println("\t \t musuh Turun  " + smt);                
                ClientPapan.jlser[ClientPapan.getPosisiServer()].setVisible(false);//ini menghilangkan sebelum naik ke tangga
                ClientPapan.indexServer= turun(ClientPapan.getPosisiServer());//kalau dadunya 2 maka posisi aslinya 3
                System.out.println("\t \t ini posisi musuh turun yang baru  " + ClientPapan.getPosisiServer());
                ClientPapan.jlser[ClientPapan.getPosisiServer()].setVisible(true);//nyalain posisi baru
//                ClientPapan.jlser[ClientPapan.getPosisiServer()].setText("INI Server");
            }
        }
        this.stop();
    }
}
