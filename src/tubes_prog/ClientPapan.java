/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ClientPapan.java
 *
 * Created on Dec 13, 2016, 11:17:08 AM
 */
package tubes_prog;

import java.applet.Applet;
import java.applet.AudioClip;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Windows 8.1 Pro
 */
public class ClientPapan extends javax.swing.JFrame {
    static boolean clientTurn = false;//penanda giliran
    static boolean selesai =false;//penanda giliran sudah selesai
    static boolean dadu = false;//penanda putaran dadu sudah distop
    static int daduEnemy=0; static String emot="null";
    static String car = null;
    static boolean iniClient = false;
//    static int langkahClient = 0;//
    static int indexServer = 1;
    static int indexClient=1;
    static JButton kocok,stop,selesaii,kembali;
    static JLabel kk,dadumusuh,em1,gambarDadu;
    static JTextField [] kotak = new JTextField[103];
   static JLabel [] jlser = new JLabel[103];
   static JLabel [] jlcl = new JLabel[103];
   static boolean clienwin = false;
   static AudioClip soundTrack2;
   static AudioClip suaraEmot;//lagu
    /** Creates new form ClientPapan */
    public ClientPapan() {
        initComponents();
        iniClient = true;
        soundTrack2 = Applet.newAudioClip(getClass().getResource("tuk.wav"));
        kocok=koc;stop=st;
        em1=emotM;em1.setVisible(false);gambarDadu=dad;
        dadumusuh = mshd;
        kk=ket;
        kocok.setEnabled(false);stop.setEnabled(false);
        kotak[102]=dice;
        indexServer = 1;indexClient=1;
        jlser[1]=jl1;
        jlser[2]=jl3;
        jlser[3]=jl5;
        jlser[4]=jl7;
        jlser[5]=jl9;
        jlser[6]=jl11;
        jlser[7]=jl13;
        jlser[8]=jl15;
        jlser[9]=jl17;
        jlser[10]=jl19;
        jlser[11]=jl21;
        jlser[12]=jl23;
        jlser[13]=jl25;
        jlser[14]=jl27;
        jlser[15]=jl29;
        jlser[16]=jl31;
        jlser[17]=jl33;
        jlser[18]=jl35;
        jlser[19]=jl37;
        jlser[20]=jl39;
        jlser[21]=ser21;
          jlser[22]=ser22;
        jlser[23]=ser23;jlser[24]=ser24;
jlser[25]=ser25;jlser[26]=ser26;jlser[27]=ser27;jlser[28]=ser28;jlser[29]=ser29;jlser[30]=ser30;jlser[31]=ser31;jlser[32]=ser32;jlser[33]=ser33;
jlser[34]=ser34;
jlser[35]=ser35;
jlser[36]=ser36;
jlser[37]=ser37;
jlser[38]=ser38;
jlser[39]=ser39;
jlser[40]=ser40;
jlser[41]=ser41;
jlser[42]=ser42;
jlser[43]=ser43;
jlser[44]=ser44;
jlser[45]=ser45;
jlser[46]=ser46;
jlser[47]=ser47;
jlser[48]=ser48;
jlser[49]=ser49;
jlser[50]=ser50;
jlser[51]=ser51;
jlser[52]=ser52;
jlser[53]=ser53;
jlser[54]=ser54;
jlser[55]=ser55;
jlser[56]=ser56;
jlser[57]=ser57;
jlser[58]=ser58;
jlser[59]=ser59;
jlser[60]=ser60;
jlser[61]=ser61;
jlser[62]=ser62;
jlser[63]=ser63;
jlser[64]=ser64;
jlser[65]=ser65;
jlser[66]=ser66;
jlser[67]=ser67;
jlser[68]=ser68;
jlser[69]=ser69;
jlser[70]=ser70;
jlser[71]=ser71;
jlser[72]=ser72;
jlser[73]=ser73;
jlser[74]=ser74;
jlser[75]=ser75;
jlser[76]=ser76;
jlser[77]=ser77;
jlser[78]=ser78;
jlser[79]=ser79;
jlser[80]=ser80;
jlser[81]=ser81;
jlser[82]=ser82;
jlser[83]=ser83;
jlser[84]=ser84;
jlser[85]=ser85;
jlser[86]=ser86;
jlser[87]=ser87;
jlser[88]=ser88;
jlser[89]=ser89;
jlser[90]=ser90;
jlser[91]=ser91;
jlser[92]=ser92;
jlser[93]=ser93;
jlser[94]=ser94;
jlser[95]=ser95;
jlser[96]=ser96;
jlser[97]=ser97;
jlser[98]=ser98;
jlser[99]=ser99;
jlser[100]=ser100;  
          
          
        jlcl[1]=jl2;
        jlcl[2]=jl4;
        jlcl[3]=jl6;
        jlcl[4]=jl8;
        jlcl[5]=jl10;
        jlcl[6]=jl12;
        jlcl[7]=jl14;
        jlcl[8]=jl16;
        jlcl[9]=jl18;
        jlcl[10]=jl20;
        jlcl[11]=jl22;
        jlcl[12]=jl24;
        jlcl[13]=jl26;
        jlcl[14]=jl28;
        jlcl[15]=jl30;
        jlcl[16]=jl32;
        jlcl[17]=jl34;
        jlcl[18]=jl36;
        jlcl[19]=jl38;
        jlcl[20]=jl40;
        jlcl[21]=cl21;jlcl[22]=cl22;
        jlcl[24]=cl24;jlcl[23]=cl23;
jlcl[25]=cl25;
jlcl[26]=cl26;
jlcl[27]=cl27;
jlcl[28]=cl28;
jlcl[29]=cl29;
jlcl[30]=cl30;
jlcl[31]=cl31;
jlcl[32]=cl32;
jlcl[33]=cl33;
jlcl[34]=cl34;
jlcl[35]=cl35;
jlcl[36]=cl36;
jlcl[37]=cl37;
jlcl[38]=cl38;
jlcl[39]=cl39;
jlcl[40]=cl40;
jlcl[41]=cl41;
jlcl[42]=cl42;
jlcl[43]=cl43;
jlcl[44]=cl44;
jlcl[45]=cl45;
jlcl[46]=cl46;
jlcl[47]=cl47;
jlcl[48]=cl48;
jlcl[49]=cl49;
jlcl[50]=cl50;
jlcl[51]=cl51;
jlcl[52]=cl52;
jlcl[53]=cl53;
jlcl[54]=cl54;
jlcl[55]=cl55;
jlcl[56]=cl56;
jlcl[57]=cl57;
jlcl[58]=cl58;
jlcl[59]=cl59;
jlcl[60]=cl60;
jlcl[61]=cl61;
jlcl[62]=cl62;
jlcl[63]=cl63;
jlcl[64]=cl64;
jlcl[65]=cl65;
jlcl[66]=cl66;
jlcl[67]=cl67;
jlcl[68]=cl68;
jlcl[69]=cl69;
jlcl[70]=cl70;
jlcl[71]=cl71;
jlcl[72]=cl72;
jlcl[73]=cl73;
jlcl[74]=cl74;
jlcl[75]=cl75;
jlcl[76]=cl76;
jlcl[77]=cl77;
jlcl[78]=cl78;
jlcl[79]=cl79;
jlcl[80]=cl80;
jlcl[81]=cl81;
jlcl[82]=cl82;
jlcl[83]=cl83;
jlcl[84]=cl84;
jlcl[85]=cl85;
jlcl[86]=cl86;
jlcl[87]=cl87;
jlcl[88]=cl88;
jlcl[89]=cl89;
jlcl[90]=cl90;
jlcl[91]=cl91;
jlcl[92]=cl92;
jlcl[93]=cl93;
jlcl[94]=cl94;
jlcl[95]=cl95;
jlcl[96]=cl96;
jlcl[97]=cl97;
jlcl[98]=cl98;
jlcl[99]=cl99;
jlcl[100]=cl100;
          ImageIcon en = new ImageIcon("karakter/dart.gif");  
        ImageIcon icon = new ImageIcon(car); 
                jlser[1].setIcon(en);
                jlser[1].setText("");
                jlcl[1].setIcon(icon);
                jlcl[1].setText("");
        for(int i=2;i<=100;i++)
            {
                jlser[i].setVisible(false);
                jlser[i].setIcon(en);
                jlser[i].setText("");
                jlcl[i].setVisible(false);
                jlcl[i].setIcon(icon);
                jlcl[i].setText("");
            }
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        koc = new javax.swing.JButton();
        dice = new javax.swing.JTextField();
        st = new javax.swing.JButton();
        ket = new javax.swing.JLabel();
        mshd = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ser71 = new javax.swing.JLabel();
        ser72 = new javax.swing.JLabel();
        ser73 = new javax.swing.JLabel();
        ser74 = new javax.swing.JLabel();
        ser75 = new javax.swing.JLabel();
        ser76 = new javax.swing.JLabel();
        ser77 = new javax.swing.JLabel();
        ser78 = new javax.swing.JLabel();
        ser79 = new javax.swing.JLabel();
        ser80 = new javax.swing.JLabel();
        ser81 = new javax.swing.JLabel();
        ser82 = new javax.swing.JLabel();
        ser83 = new javax.swing.JLabel();
        ser84 = new javax.swing.JLabel();
        ser85 = new javax.swing.JLabel();
        ser86 = new javax.swing.JLabel();
        ser87 = new javax.swing.JLabel();
        ser88 = new javax.swing.JLabel();
        ser89 = new javax.swing.JLabel();
        ser90 = new javax.swing.JLabel();
        cl71 = new javax.swing.JLabel();
        cl72 = new javax.swing.JLabel();
        cl73 = new javax.swing.JLabel();
        cl74 = new javax.swing.JLabel();
        cl75 = new javax.swing.JLabel();
        cl76 = new javax.swing.JLabel();
        cl77 = new javax.swing.JLabel();
        cl78 = new javax.swing.JLabel();
        cl79 = new javax.swing.JLabel();
        cl80 = new javax.swing.JLabel();
        cl81 = new javax.swing.JLabel();
        cl82 = new javax.swing.JLabel();
        cl83 = new javax.swing.JLabel();
        cl84 = new javax.swing.JLabel();
        cl85 = new javax.swing.JLabel();
        cl86 = new javax.swing.JLabel();
        cl87 = new javax.swing.JLabel();
        cl88 = new javax.swing.JLabel();
        cl89 = new javax.swing.JLabel();
        cl90 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        emotM = new javax.swing.JLabel();
        dad = new javax.swing.JLabel();
        ser100 = new javax.swing.JLabel();
        cl100 = new javax.swing.JLabel();
        ser99 = new javax.swing.JLabel();
        cl99 = new javax.swing.JLabel();
        ser98 = new javax.swing.JLabel();
        cl98 = new javax.swing.JLabel();
        ser97 = new javax.swing.JLabel();
        cl97 = new javax.swing.JLabel();
        ser96 = new javax.swing.JLabel();
        cl96 = new javax.swing.JLabel();
        ser95 = new javax.swing.JLabel();
        ser94 = new javax.swing.JLabel();
        cl94 = new javax.swing.JLabel();
        ser93 = new javax.swing.JLabel();
        ser92 = new javax.swing.JLabel();
        cl93 = new javax.swing.JLabel();
        cl92 = new javax.swing.JLabel();
        ser91 = new javax.swing.JLabel();
        cl91 = new javax.swing.JLabel();
        jl1 = new javax.swing.JLabel();
        jl2 = new javax.swing.JLabel();
        jl3 = new javax.swing.JLabel();
        jl4 = new javax.swing.JLabel();
        jl5 = new javax.swing.JLabel();
        jl6 = new javax.swing.JLabel();
        jl7 = new javax.swing.JLabel();
        jl8 = new javax.swing.JLabel();
        jl9 = new javax.swing.JLabel();
        jl10 = new javax.swing.JLabel();
        jl11 = new javax.swing.JLabel();
        jl12 = new javax.swing.JLabel();
        jl13 = new javax.swing.JLabel();
        jl14 = new javax.swing.JLabel();
        jl15 = new javax.swing.JLabel();
        jl16 = new javax.swing.JLabel();
        jl17 = new javax.swing.JLabel();
        jl18 = new javax.swing.JLabel();
        jl19 = new javax.swing.JLabel();
        jl20 = new javax.swing.JLabel();
        jl21 = new javax.swing.JLabel();
        jl22 = new javax.swing.JLabel();
        jl23 = new javax.swing.JLabel();
        jl24 = new javax.swing.JLabel();
        jl25 = new javax.swing.JLabel();
        jl26 = new javax.swing.JLabel();
        jl27 = new javax.swing.JLabel();
        jl28 = new javax.swing.JLabel();
        jl29 = new javax.swing.JLabel();
        jl30 = new javax.swing.JLabel();
        jl31 = new javax.swing.JLabel();
        jl32 = new javax.swing.JLabel();
        jl33 = new javax.swing.JLabel();
        jl34 = new javax.swing.JLabel();
        jl35 = new javax.swing.JLabel();
        jl36 = new javax.swing.JLabel();
        jl37 = new javax.swing.JLabel();
        jl38 = new javax.swing.JLabel();
        jl39 = new javax.swing.JLabel();
        jl40 = new javax.swing.JLabel();
        ser21 = new javax.swing.JLabel();
        cl21 = new javax.swing.JLabel();
        ser22 = new javax.swing.JLabel();
        cl22 = new javax.swing.JLabel();
        ser26 = new javax.swing.JLabel();
        ser24 = new javax.swing.JLabel();
        ser23 = new javax.swing.JLabel();
        ser27 = new javax.swing.JLabel();
        ser25 = new javax.swing.JLabel();
        ser28 = new javax.swing.JLabel();
        ser29 = new javax.swing.JLabel();
        ser30 = new javax.swing.JLabel();
        ser31 = new javax.swing.JLabel();
        ser32 = new javax.swing.JLabel();
        ser33 = new javax.swing.JLabel();
        ser34 = new javax.swing.JLabel();
        ser35 = new javax.swing.JLabel();
        ser36 = new javax.swing.JLabel();
        ser37 = new javax.swing.JLabel();
        ser38 = new javax.swing.JLabel();
        ser39 = new javax.swing.JLabel();
        ser40 = new javax.swing.JLabel();
        ser41 = new javax.swing.JLabel();
        ser42 = new javax.swing.JLabel();
        ser43 = new javax.swing.JLabel();
        ser44 = new javax.swing.JLabel();
        ser45 = new javax.swing.JLabel();
        ser46 = new javax.swing.JLabel();
        ser47 = new javax.swing.JLabel();
        ser48 = new javax.swing.JLabel();
        ser49 = new javax.swing.JLabel();
        ser50 = new javax.swing.JLabel();
        ser51 = new javax.swing.JLabel();
        ser52 = new javax.swing.JLabel();
        ser53 = new javax.swing.JLabel();
        ser54 = new javax.swing.JLabel();
        ser55 = new javax.swing.JLabel();
        ser56 = new javax.swing.JLabel();
        ser57 = new javax.swing.JLabel();
        ser58 = new javax.swing.JLabel();
        ser59 = new javax.swing.JLabel();
        ser60 = new javax.swing.JLabel();
        ser61 = new javax.swing.JLabel();
        ser62 = new javax.swing.JLabel();
        ser63 = new javax.swing.JLabel();
        ser64 = new javax.swing.JLabel();
        ser65 = new javax.swing.JLabel();
        ser66 = new javax.swing.JLabel();
        ser67 = new javax.swing.JLabel();
        ser68 = new javax.swing.JLabel();
        ser69 = new javax.swing.JLabel();
        ser70 = new javax.swing.JLabel();
        cl23 = new javax.swing.JLabel();
        cl24 = new javax.swing.JLabel();
        cl25 = new javax.swing.JLabel();
        cl26 = new javax.swing.JLabel();
        cl27 = new javax.swing.JLabel();
        cl28 = new javax.swing.JLabel();
        cl29 = new javax.swing.JLabel();
        cl30 = new javax.swing.JLabel();
        cl31 = new javax.swing.JLabel();
        cl32 = new javax.swing.JLabel();
        cl33 = new javax.swing.JLabel();
        cl34 = new javax.swing.JLabel();
        cl35 = new javax.swing.JLabel();
        cl36 = new javax.swing.JLabel();
        cl37 = new javax.swing.JLabel();
        cl38 = new javax.swing.JLabel();
        cl39 = new javax.swing.JLabel();
        cl40 = new javax.swing.JLabel();
        cl41 = new javax.swing.JLabel();
        cl42 = new javax.swing.JLabel();
        cl43 = new javax.swing.JLabel();
        cl44 = new javax.swing.JLabel();
        cl45 = new javax.swing.JLabel();
        cl46 = new javax.swing.JLabel();
        cl47 = new javax.swing.JLabel();
        cl48 = new javax.swing.JLabel();
        cl49 = new javax.swing.JLabel();
        cl50 = new javax.swing.JLabel();
        cl51 = new javax.swing.JLabel();
        cl52 = new javax.swing.JLabel();
        cl53 = new javax.swing.JLabel();
        cl54 = new javax.swing.JLabel();
        cl55 = new javax.swing.JLabel();
        cl56 = new javax.swing.JLabel();
        cl57 = new javax.swing.JLabel();
        cl58 = new javax.swing.JLabel();
        cl59 = new javax.swing.JLabel();
        cl60 = new javax.swing.JLabel();
        cl61 = new javax.swing.JLabel();
        cl62 = new javax.swing.JLabel();
        cl63 = new javax.swing.JLabel();
        cl64 = new javax.swing.JLabel();
        cl65 = new javax.swing.JLabel();
        cl66 = new javax.swing.JLabel();
        cl67 = new javax.swing.JLabel();
        cl68 = new javax.swing.JLabel();
        cl69 = new javax.swing.JLabel();
        cl70 = new javax.swing.JLabel();
        cl95 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        jTextField2.setText("jTextField2");

        jButton3.setText("jButton3");

        jTextField3.setText("jTextField3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        koc.setBackground(new java.awt.Color(51, 51, 51));
        koc.setForeground(new java.awt.Color(255, 255, 255));
        koc.setText("Kocok");
        koc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kocActionPerformed(evt);
            }
        });
        getContentPane().add(koc, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 250, -1, 30));

        dice.setText("0");
        getContentPane().add(dice, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 220, 150, 30));

        st.setBackground(new java.awt.Color(51, 51, 51));
        st.setForeground(new java.awt.Color(255, 255, 255));
        st.setText("stop");
        st.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stActionPerformed(evt);
            }
        });
        getContentPane().add(st, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 250, 90, 30));

        ket.setFont(new java.awt.Font("Dialog", 0, 18));
        ket.setText(".................................");
        getContentPane().add(ket, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 80, -1, 30));

        mshd.setFont(new java.awt.Font("Dialog", 1, 14));
        mshd.setText("0");
        getContentPane().add(mshd, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 100, -1, 30));

        jLabel2.setText("Dadu Musuh : ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 100, -1, 30));

        ser71.setForeground(new java.awt.Color(-65536,true));
        ser71.setText("jLabel3");
        getContentPane().add(ser71, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 160, -1, -1));

        ser72.setForeground(new java.awt.Color(-65536,true));
        ser72.setText("jLabel3");
        getContentPane().add(ser72, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 160, -1, -1));

        ser73.setText("jLabel3");
        getContentPane().add(ser73, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 160, -1, 20));

        ser74.setText("jLabel5");
        getContentPane().add(ser74, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 160, -1, 20));

        ser75.setText("jLabel8");
        getContentPane().add(ser75, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, -1, -1));

        ser76.setText("jLabel7");
        getContentPane().add(ser76, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, -1, -1));

        ser77.setText("jLabel3");
        getContentPane().add(ser77, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, -1, 20));

        ser78.setText("jLabel5");
        getContentPane().add(ser78, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, -1, 20));

        ser79.setText("jLabel8");
        getContentPane().add(ser79, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, -1, -1));

        ser80.setText("jLabel7");
        getContentPane().add(ser80, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        ser81.setForeground(new java.awt.Color(-65536,true));
        ser81.setText("jLabel3");
        getContentPane().add(ser81, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        ser82.setForeground(new java.awt.Color(-65536,true));
        ser82.setText("jLabel3");
        getContentPane().add(ser82, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, -1, -1));

        ser83.setText("jLabel3");
        getContentPane().add(ser83, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, -1, 20));

        ser84.setText("jLabel5");
        getContentPane().add(ser84, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, -1, 20));

        ser85.setText("jLabel8");
        getContentPane().add(ser85, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, -1, -1));

        ser86.setText("jLabel7");
        getContentPane().add(ser86, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, -1, -1));

        ser87.setText("jLabel3");
        getContentPane().add(ser87, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 90, -1, 20));

        ser88.setText("jLabel5");
        getContentPane().add(ser88, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 90, -1, 20));

        ser89.setText("jLabel8");
        getContentPane().add(ser89, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 100, -1, -1));

        ser90.setText("jLabel7");
        getContentPane().add(ser90, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 100, -1, -1));

        cl71.setText("jLabel3");
        getContentPane().add(cl71, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 160, -1, -1));

        cl72.setText("jLabel3");
        getContentPane().add(cl72, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 160, -1, -1));

        cl73.setText("jLabel3");
        getContentPane().add(cl73, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 160, -1, -1));

        cl74.setText("jLabel3");
        getContentPane().add(cl74, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 160, -1, -1));

        cl75.setText("jLabel3");
        getContentPane().add(cl75, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, -1, -1));

        cl76.setText("jLabel3");
        getContentPane().add(cl76, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, -1, -1));

        cl77.setText("jLabel3");
        getContentPane().add(cl77, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, -1, -1));

        cl78.setText("jLabel3");
        getContentPane().add(cl78, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, -1, -1));

        cl79.setText("jLabel3");
        getContentPane().add(cl79, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, -1, -1));

        cl80.setText("jLabel3");
        getContentPane().add(cl80, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, -1, -1));

        cl81.setText("jLabel3");
        getContentPane().add(cl81, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));

        cl82.setText("jLabel3");
        getContentPane().add(cl82, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, -1, -1));

        cl83.setText("jLabel3");
        getContentPane().add(cl83, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, -1, -1));

        cl84.setText("jLabel3");
        getContentPane().add(cl84, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, -1, -1));

        cl85.setText("jLabel3");
        getContentPane().add(cl85, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, -1, -1));

        cl86.setText("jLabel3");
        getContentPane().add(cl86, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, -1, 10));

        cl87.setText("jLabel3");
        getContentPane().add(cl87, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 100, -1, -1));

        cl88.setText("jLabel3");
        getContentPane().add(cl88, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 100, -1, -1));

        cl89.setText("jLabel3");
        getContentPane().add(cl89, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 100, -1, -1));

        cl90.setText("jLabel3");
        getContentPane().add(cl90, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 100, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tubes_prog/output_5p1VBw.gif"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 370, -1, 60));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 24));
        jLabel4.setText("EmotIcon : ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 340, -1, 20));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tubes_prog/output_D55vBT.gif"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 450, -1, 60));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tubes_prog/button noluck.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 370, -1, 60));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tubes_prog/emot3.gif"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 460, -1, -1));

        emotM.setForeground(new java.awt.Color(-65536,true));
        emotM.setText("emooooot");
        getContentPane().add(emotM, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, -1, -1));

        dad.setText("............................................");
        getContentPane().add(dad, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 150, -1, -1));

        ser100.setText("jLabel7");
        getContentPane().add(ser100, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        cl100.setText("jLabel3");
        getContentPane().add(cl100, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        ser99.setText("jLabel8");
        getContentPane().add(ser99, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, -1, 10));

        cl99.setText("jLabel3");
        getContentPane().add(cl99, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, -1, -1));

        ser98.setText("jLabel5");
        getContentPane().add(ser98, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, 20));

        cl98.setText("jLabel3");
        getContentPane().add(cl98, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, -1, -1));

        ser97.setText("jLabel3");
        getContentPane().add(ser97, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, -1, 20));

        cl97.setText("jLabel3");
        getContentPane().add(cl97, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, -1, -1));

        ser96.setText("jLabel7");
        getContentPane().add(ser96, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, -1, -1));

        cl96.setText("jLabel3");
        getContentPane().add(cl96, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, -1, -1));

        ser95.setText("jLabel8");
        getContentPane().add(ser95, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, -1, -1));

        ser94.setText("jLabel5");
        getContentPane().add(ser94, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, -1, 20));

        cl94.setText("jLabel3");
        getContentPane().add(cl94, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 30, -1, -1));

        ser93.setText("jLabel3");
        getContentPane().add(ser93, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, -1, 20));

        ser92.setForeground(new java.awt.Color(-65536,true));
        ser92.setText("jLabel3");
        getContentPane().add(ser92, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 30, -1, -1));

        cl93.setText("jLabel3");
        getContentPane().add(cl93, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 30, -1, -1));

        cl92.setText("jLabel3");
        getContentPane().add(cl92, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 30, -1, -1));

        ser91.setForeground(new java.awt.Color(-65536,true));
        ser91.setText("jLabel3");
        getContentPane().add(ser91, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 30, -1, -1));

        cl91.setText("jLabel3");
        getContentPane().add(cl91, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 30, -1, -1));

        jl1.setForeground(new java.awt.Color(-65536,true));
        jl1.setText("Server");
        getContentPane().add(jl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 590, -1, -1));

        jl2.setText("jLabel2");
        getContentPane().add(jl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 590, -1, -1));

        jl3.setForeground(new java.awt.Color(-65536,true));
        jl3.setText("jLabel4");
        getContentPane().add(jl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 580, -1, -1));

        jl4.setText("jLabel3");
        getContentPane().add(jl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 580, -1, -1));

        jl5.setForeground(new java.awt.Color(-20561,true));
        jl5.setText("jLabel5");
        getContentPane().add(jl5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 580, -1, -1));

        jl6.setText("jLabel6");
        getContentPane().add(jl6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 580, -1, -1));

        jl7.setForeground(new java.awt.Color(-16711936,true));
        jl7.setText("jLabel7");
        getContentPane().add(jl7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 580, -1, -1));

        jl8.setText("jLabel8");
        getContentPane().add(jl8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 580, -1, -1));

        jl9.setForeground(new java.awt.Color(-14336,true));
        jl9.setText("jLabel9");
        getContentPane().add(jl9, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 580, -1, -1));

        jl10.setText("jLabel10");
        getContentPane().add(jl10, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 580, -1, -1));

        jl11.setForeground(new java.awt.Color(-16711681,true));
        jl11.setText("jLabel1");
        getContentPane().add(jl11, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 580, -1, -1));

        jl12.setText("jLabel2");
        getContentPane().add(jl12, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 580, -1, -1));

        jl13.setForeground(new java.awt.Color(-256,true));
        jl13.setText("jLabel4");
        getContentPane().add(jl13, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 580, -1, -1));

        jl14.setText("jLabel3");
        getContentPane().add(jl14, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 580, -1, -1));

        jl15.setForeground(new java.awt.Color(-16711936,true));
        jl15.setText("jLabel5");
        getContentPane().add(jl15, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 580, -1, -1));

        jl16.setText("jLabel6");
        getContentPane().add(jl16, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 580, -1, -1));

        jl17.setForeground(new java.awt.Color(-65281,true));
        jl17.setText("jLabel7");
        getContentPane().add(jl17, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 580, -1, -1));

        jl18.setText("jLabel8");
        getContentPane().add(jl18, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 580, -1, -1));

        jl19.setForeground(new java.awt.Color(-65536,true));
        jl19.setText("jLabel9");
        getContentPane().add(jl19, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 580, -1, -1));

        jl20.setText("jLabel10");
        getContentPane().add(jl20, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 580, -1, -1));

        jl21.setForeground(new java.awt.Color(-20561,true));
        jl21.setText("jLabel1");
        getContentPane().add(jl21, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 520, -1, -1));

        jl22.setText("jLabel2");
        getContentPane().add(jl22, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 520, -1, -1));

        jl23.setForeground(new java.awt.Color(-65536,true));
        jl23.setText("jLabel3");
        getContentPane().add(jl23, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 520, -1, -1));

        jl24.setText("jLabel4");
        getContentPane().add(jl24, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 520, -1, -1));

        jl25.setForeground(new java.awt.Color(-20561,true));
        jl25.setText("jLabel5");
        getContentPane().add(jl25, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 520, -1, -1));

        jl26.setText("jLabel6");
        getContentPane().add(jl26, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 520, -1, -1));

        jl27.setForeground(new java.awt.Color(-16711936,true));
        jl27.setText("jLabel7");
        getContentPane().add(jl27, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 520, -1, -1));

        jl28.setText("jLabel8");
        getContentPane().add(jl28, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 520, -1, -1));

        jl29.setForeground(new java.awt.Color(-14336,true));
        jl29.setText("jLabel9");
        getContentPane().add(jl29, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 520, -1, -1));

        jl30.setText("jLabel10");
        getContentPane().add(jl30, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 520, -1, -1));

        jl31.setForeground(new java.awt.Color(-65281,true));
        jl31.setText("jLabel7");
        getContentPane().add(jl31, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 520, -1, -1));

        jl32.setText("jLabel8");
        getContentPane().add(jl32, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 520, -1, -1));

        jl33.setForeground(new java.awt.Color(-65536,true));
        jl33.setText("jLabel9");
        getContentPane().add(jl33, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 520, -1, -1));

        jl34.setText("jLabel10");
        getContentPane().add(jl34, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 520, -1, -1));

        jl35.setForeground(new java.awt.Color(-14336,true));
        jl35.setText("jLabel3");
        getContentPane().add(jl35, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 520, -1, -1));

        jl36.setText("jLabel4");
        getContentPane().add(jl36, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 520, -1, -1));

        jl37.setForeground(new java.awt.Color(-16711681,true));
        jl37.setText("jLabel1");
        getContentPane().add(jl37, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 520, -1, -1));

        jl38.setText("jLabel2");
        getContentPane().add(jl38, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 520, -1, -1));

        jl39.setForeground(new java.awt.Color(-16711936,true));
        jl39.setText("jLabel5");
        getContentPane().add(jl39, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 520, -1, -1));

        jl40.setText("jLabel6");
        getContentPane().add(jl40, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 520, -1, -1));

        ser21.setForeground(new java.awt.Color(-65536,true));
        ser21.setText("jLabel3");
        getContentPane().add(ser21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, -1, -1));

        cl21.setText("jLabel3");
        getContentPane().add(cl21, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 460, -1, -1));

        ser22.setForeground(new java.awt.Color(-65536,true));
        ser22.setText("jLabel3");
        getContentPane().add(ser22, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 460, -1, -1));

        cl22.setText("jLabel3");
        getContentPane().add(cl22, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 460, -1, -1));

        ser26.setText("jLabel3");
        getContentPane().add(ser26, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 460, -1, 20));

        ser24.setText("jLabel5");
        getContentPane().add(ser24, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 460, -1, 20));

        ser23.setText("jLabel8");
        getContentPane().add(ser23, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 460, -1, 10));

        ser27.setText("jLabel3");
        getContentPane().add(ser27, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 460, -1, 20));

        ser25.setText("jLabel7");
        getContentPane().add(ser25, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 460, -1, -1));

        ser28.setText("jLabel5");
        getContentPane().add(ser28, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 460, -1, 20));

        ser29.setText("jLabel8");
        getContentPane().add(ser29, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 460, -1, -1));

        ser30.setText("jLabel7");
        getContentPane().add(ser30, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 460, -1, -1));

        ser31.setForeground(new java.awt.Color(-65536,true));
        ser31.setText("jLabel3");
        getContentPane().add(ser31, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 400, -1, -1));

        ser32.setForeground(new java.awt.Color(-65536,true));
        ser32.setText("jLabel3");
        getContentPane().add(ser32, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 400, -1, -1));

        ser33.setText("jLabel3");
        getContentPane().add(ser33, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 400, -1, 20));

        ser34.setText("jLabel5");
        getContentPane().add(ser34, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 400, -1, 20));

        ser35.setText("jLabel8");
        getContentPane().add(ser35, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 400, -1, -1));

        ser36.setText("jLabel7");
        getContentPane().add(ser36, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 400, -1, -1));

        ser37.setText("jLabel3");
        getContentPane().add(ser37, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 400, -1, 20));

        ser38.setText("jLabel5");
        getContentPane().add(ser38, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, -1, 20));

        ser39.setText("jLabel8");
        getContentPane().add(ser39, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, -1, -1));

        ser40.setText("jLabel7");
        getContentPane().add(ser40, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, -1, -1));

        ser41.setForeground(new java.awt.Color(-65536,true));
        ser41.setText("jLabel3");
        getContentPane().add(ser41, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        ser42.setForeground(new java.awt.Color(-65536,true));
        ser42.setText("jLabel3");
        getContentPane().add(ser42, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, -1, -1));

        ser43.setText("jLabel3");
        getContentPane().add(ser43, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, -1, 20));

        ser44.setText("jLabel5");
        getContentPane().add(ser44, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, -1, 20));

        ser45.setText("jLabel8");
        getContentPane().add(ser45, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, -1, -1));

        ser46.setText("jLabel7");
        getContentPane().add(ser46, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, -1, -1));

        ser47.setText("jLabel3");
        getContentPane().add(ser47, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 340, -1, 20));

        ser48.setText("jLabel5");
        getContentPane().add(ser48, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 340, -1, 20));

        ser49.setText("jLabel8");
        getContentPane().add(ser49, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 340, -1, -1));

        ser50.setText("jLabel7");
        getContentPane().add(ser50, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 340, -1, -1));

        ser51.setForeground(new java.awt.Color(-65536,true));
        ser51.setText("jLabel3");
        getContentPane().add(ser51, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 280, -1, -1));

        ser52.setForeground(new java.awt.Color(-65536,true));
        ser52.setText("jLabel3");
        getContentPane().add(ser52, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 280, -1, -1));

        ser53.setText("jLabel3");
        getContentPane().add(ser53, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 270, -1, 20));

        ser54.setText("jLabel5");
        getContentPane().add(ser54, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 280, -1, 20));

        ser55.setText("jLabel8");
        getContentPane().add(ser55, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, -1, -1));

        ser56.setText("jLabel7");
        getContentPane().add(ser56, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, -1, -1));

        ser57.setText("jLabel3");
        getContentPane().add(ser57, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, -1, 20));

        ser58.setText("jLabel5");
        getContentPane().add(ser58, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, -1, 20));

        ser59.setText("jLabel8");
        getContentPane().add(ser59, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, -1, -1));

        ser60.setText("jLabel7");
        getContentPane().add(ser60, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        ser61.setForeground(new java.awt.Color(-65536,true));
        ser61.setText("jLabel3");
        getContentPane().add(ser61, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        ser62.setForeground(new java.awt.Color(-65536,true));
        ser62.setText("jLabel3");
        getContentPane().add(ser62, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, -1, -1));

        ser63.setText("jLabel3");
        getContentPane().add(ser63, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, -1, 20));

        ser64.setText("jLabel5");
        getContentPane().add(ser64, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, -1, 20));

        ser65.setText("jLabel8");
        getContentPane().add(ser65, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, -1, -1));

        ser66.setText("jLabel7");
        getContentPane().add(ser66, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, -1, 10));

        ser67.setText("jLabel3");
        getContentPane().add(ser67, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 210, -1, 20));

        ser68.setText("jLabel5");
        getContentPane().add(ser68, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 210, -1, 20));

        ser69.setText("jLabel8");
        getContentPane().add(ser69, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 210, -1, -1));

        ser70.setText("jLabel7");
        getContentPane().add(ser70, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 210, -1, -1));

        cl23.setText("jLabel3");
        getContentPane().add(cl23, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 460, -1, -1));

        cl24.setText("jLabel3");
        getContentPane().add(cl24, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 460, -1, -1));

        cl25.setText("jLabel3");
        getContentPane().add(cl25, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 460, -1, -1));

        cl26.setText("jLabel3");
        getContentPane().add(cl26, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 460, -1, -1));

        cl27.setText("jLabel3");
        getContentPane().add(cl27, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 460, -1, -1));

        cl28.setText("jLabel3");
        getContentPane().add(cl28, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 460, -1, -1));

        cl29.setText("jLabel3");
        getContentPane().add(cl29, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 460, -1, -1));

        cl30.setText("jLabel3");
        getContentPane().add(cl30, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 460, -1, -1));

        cl31.setText("jLabel3");
        getContentPane().add(cl31, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 400, -1, -1));

        cl32.setText("jLabel3");
        getContentPane().add(cl32, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 400, -1, -1));

        cl33.setText("jLabel3");
        getContentPane().add(cl33, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 400, -1, -1));

        cl34.setText("jLabel3");
        getContentPane().add(cl34, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 400, -1, -1));

        cl35.setText("jLabel3");
        getContentPane().add(cl35, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 400, -1, -1));

        cl36.setText("jLabel3");
        getContentPane().add(cl36, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 400, -1, -1));

        cl37.setText("jLabel3");
        getContentPane().add(cl37, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 400, -1, -1));

        cl38.setText("jLabel3");
        getContentPane().add(cl38, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, -1, -1));

        cl39.setText("jLabel3");
        getContentPane().add(cl39, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, -1, -1));

        cl40.setText("jLabel3");
        getContentPane().add(cl40, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, -1, -1));

        cl41.setText("jLabel3");
        getContentPane().add(cl41, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, -1, -1));

        cl42.setText("jLabel3");
        getContentPane().add(cl42, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, -1, -1));

        cl43.setText("jLabel3");
        getContentPane().add(cl43, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, -1, -1));

        cl44.setText("jLabel3");
        getContentPane().add(cl44, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, -1, -1));

        cl45.setText("jLabel3");
        getContentPane().add(cl45, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 340, -1, -1));

        cl46.setText("jLabel3");
        getContentPane().add(cl46, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 340, -1, -1));

        cl47.setText("jLabel3");
        getContentPane().add(cl47, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 340, -1, -1));

        cl48.setText("jLabel3");
        getContentPane().add(cl48, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 340, -1, -1));

        cl49.setText("jLabel3");
        getContentPane().add(cl49, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 340, -1, -1));

        cl50.setText("jLabel3");
        getContentPane().add(cl50, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 340, -1, -1));

        cl51.setText("jLabel3");
        getContentPane().add(cl51, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 280, -1, -1));

        cl52.setText("jLabel3");
        getContentPane().add(cl52, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 280, -1, -1));

        cl53.setText("jLabel3");
        getContentPane().add(cl53, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 270, -1, -1));

        cl54.setText("jLabel3");
        getContentPane().add(cl54, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 280, -1, -1));

        cl55.setText("jLabel3");
        getContentPane().add(cl55, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 280, -1, -1));

        cl56.setText("jLabel3");
        getContentPane().add(cl56, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, -1, -1));

        cl57.setText("jLabel3");
        getContentPane().add(cl57, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, -1, -1));

        cl58.setText("jLabel3");
        getContentPane().add(cl58, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, -1, -1));

        cl59.setText("jLabel3");
        getContentPane().add(cl59, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, -1, -1));

        cl60.setText("jLabel3");
        getContentPane().add(cl60, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, -1, -1));

        cl61.setText("jLabel3");
        getContentPane().add(cl61, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, -1));

        cl62.setText("jLabel3");
        getContentPane().add(cl62, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, -1, -1));

        cl63.setText("jLabel3");
        getContentPane().add(cl63, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, -1, -1));

        cl64.setText("jLabel3");
        getContentPane().add(cl64, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, -1, -1));

        cl65.setText("jLabel3");
        getContentPane().add(cl65, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, -1, -1));

        cl66.setText("jLabel3");
        getContentPane().add(cl66, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 210, -1, -1));

        cl67.setText("jLabel3");
        getContentPane().add(cl67, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 210, -1, -1));

        cl68.setText("jLabel3");
        getContentPane().add(cl68, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 210, -1, -1));

        cl69.setText("jLabel3");
        getContentPane().add(cl69, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 210, -1, -1));

        cl70.setText("jLabel3");
        getContentPane().add(cl70, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 210, -1, -1));

        cl95.setText("jLabel3");
        getContentPane().add(cl95, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tubes_prog/board1.jpg"))); // NOI18N
        jLabel1.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                jLabel1ComponentRemoved(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void kocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kocActionPerformed
    dadu=false;
    kocok.setEnabled(false);
    ClientPapan.stop.setEnabled(true);
    DaduClient dx = new DaduClient();
    dx.start();
    
}//GEN-LAST:event_kocActionPerformed
public static void setPosisiClient(int xx)
{
    indexClient = indexClient+xx;
}
public static int getPosisiClient()
{
    return indexClient;
}
public static void setPosisiServer(int xx)
{
    indexServer = indexServer+xx;
}
public static int getPosisiServer()
{
    return indexServer;
}
private void stActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stActionPerformed
    dadu = true;
    stop.setEnabled(false);
    em1.setVisible(false);
//    saa.setEnabled(true);
    if(ClientPapan.clienwin==false)
    {
        selesai=true;
    }
}//GEN-LAST:event_stActionPerformed

private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
emot="emot/emot2.gif";
}//GEN-LAST:event_jLabel6MouseClicked

private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
emot="emot/emot3.gif";
}//GEN-LAST:event_jLabel7MouseClicked

private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
emot="emot/emot4.gif";
}//GEN-LAST:event_jLabel5MouseClicked

private void jLabel1ComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jLabel1ComponentRemoved
// TODO add your handling code here:
}//GEN-LAST:event_jLabel1ComponentRemoved

private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
    emot="emot/emot1.gif";
}//GEN-LAST:event_jLabel3MouseClicked

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
            java.util.logging.Logger.getLogger(ClientPapan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientPapan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientPapan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientPapan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new ClientPapan().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cl100;
    private javax.swing.JLabel cl21;
    private javax.swing.JLabel cl22;
    private javax.swing.JLabel cl23;
    private javax.swing.JLabel cl24;
    private javax.swing.JLabel cl25;
    private javax.swing.JLabel cl26;
    private javax.swing.JLabel cl27;
    private javax.swing.JLabel cl28;
    private javax.swing.JLabel cl29;
    private javax.swing.JLabel cl30;
    private javax.swing.JLabel cl31;
    private javax.swing.JLabel cl32;
    private javax.swing.JLabel cl33;
    private javax.swing.JLabel cl34;
    private javax.swing.JLabel cl35;
    private javax.swing.JLabel cl36;
    private javax.swing.JLabel cl37;
    private javax.swing.JLabel cl38;
    private javax.swing.JLabel cl39;
    private javax.swing.JLabel cl40;
    private javax.swing.JLabel cl41;
    private javax.swing.JLabel cl42;
    private javax.swing.JLabel cl43;
    private javax.swing.JLabel cl44;
    private javax.swing.JLabel cl45;
    private javax.swing.JLabel cl46;
    private javax.swing.JLabel cl47;
    private javax.swing.JLabel cl48;
    private javax.swing.JLabel cl49;
    private javax.swing.JLabel cl50;
    private javax.swing.JLabel cl51;
    private javax.swing.JLabel cl52;
    private javax.swing.JLabel cl53;
    private javax.swing.JLabel cl54;
    private javax.swing.JLabel cl55;
    private javax.swing.JLabel cl56;
    private javax.swing.JLabel cl57;
    private javax.swing.JLabel cl58;
    private javax.swing.JLabel cl59;
    private javax.swing.JLabel cl60;
    private javax.swing.JLabel cl61;
    private javax.swing.JLabel cl62;
    private javax.swing.JLabel cl63;
    private javax.swing.JLabel cl64;
    private javax.swing.JLabel cl65;
    private javax.swing.JLabel cl66;
    private javax.swing.JLabel cl67;
    private javax.swing.JLabel cl68;
    private javax.swing.JLabel cl69;
    private javax.swing.JLabel cl70;
    private javax.swing.JLabel cl71;
    private javax.swing.JLabel cl72;
    private javax.swing.JLabel cl73;
    private javax.swing.JLabel cl74;
    private javax.swing.JLabel cl75;
    private javax.swing.JLabel cl76;
    private javax.swing.JLabel cl77;
    private javax.swing.JLabel cl78;
    private javax.swing.JLabel cl79;
    private javax.swing.JLabel cl80;
    private javax.swing.JLabel cl81;
    private javax.swing.JLabel cl82;
    private javax.swing.JLabel cl83;
    private javax.swing.JLabel cl84;
    private javax.swing.JLabel cl85;
    private javax.swing.JLabel cl86;
    private javax.swing.JLabel cl87;
    private javax.swing.JLabel cl88;
    private javax.swing.JLabel cl89;
    private javax.swing.JLabel cl90;
    private javax.swing.JLabel cl91;
    private javax.swing.JLabel cl92;
    private javax.swing.JLabel cl93;
    private javax.swing.JLabel cl94;
    private javax.swing.JLabel cl95;
    private javax.swing.JLabel cl96;
    private javax.swing.JLabel cl97;
    private javax.swing.JLabel cl98;
    private javax.swing.JLabel cl99;
    private javax.swing.JLabel dad;
    private javax.swing.JTextField dice;
    private javax.swing.JLabel emotM;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel jl1;
    private javax.swing.JLabel jl10;
    private javax.swing.JLabel jl11;
    private javax.swing.JLabel jl12;
    private javax.swing.JLabel jl13;
    private javax.swing.JLabel jl14;
    private javax.swing.JLabel jl15;
    private javax.swing.JLabel jl16;
    private javax.swing.JLabel jl17;
    private javax.swing.JLabel jl18;
    private javax.swing.JLabel jl19;
    private javax.swing.JLabel jl2;
    private javax.swing.JLabel jl20;
    private javax.swing.JLabel jl21;
    private javax.swing.JLabel jl22;
    private javax.swing.JLabel jl23;
    private javax.swing.JLabel jl24;
    private javax.swing.JLabel jl25;
    private javax.swing.JLabel jl26;
    private javax.swing.JLabel jl27;
    private javax.swing.JLabel jl28;
    private javax.swing.JLabel jl29;
    private javax.swing.JLabel jl3;
    private javax.swing.JLabel jl30;
    private javax.swing.JLabel jl31;
    private javax.swing.JLabel jl32;
    private javax.swing.JLabel jl33;
    private javax.swing.JLabel jl34;
    private javax.swing.JLabel jl35;
    private javax.swing.JLabel jl36;
    private javax.swing.JLabel jl37;
    private javax.swing.JLabel jl38;
    private javax.swing.JLabel jl39;
    private javax.swing.JLabel jl4;
    private javax.swing.JLabel jl40;
    private javax.swing.JLabel jl5;
    private javax.swing.JLabel jl6;
    private javax.swing.JLabel jl7;
    private javax.swing.JLabel jl8;
    private javax.swing.JLabel jl9;
    private javax.swing.JLabel ket;
    private javax.swing.JButton koc;
    private javax.swing.JLabel mshd;
    private javax.swing.JLabel ser100;
    private javax.swing.JLabel ser21;
    private javax.swing.JLabel ser22;
    private javax.swing.JLabel ser23;
    private javax.swing.JLabel ser24;
    private javax.swing.JLabel ser25;
    private javax.swing.JLabel ser26;
    private javax.swing.JLabel ser27;
    private javax.swing.JLabel ser28;
    private javax.swing.JLabel ser29;
    private javax.swing.JLabel ser30;
    private javax.swing.JLabel ser31;
    private javax.swing.JLabel ser32;
    private javax.swing.JLabel ser33;
    private javax.swing.JLabel ser34;
    private javax.swing.JLabel ser35;
    private javax.swing.JLabel ser36;
    private javax.swing.JLabel ser37;
    private javax.swing.JLabel ser38;
    private javax.swing.JLabel ser39;
    private javax.swing.JLabel ser40;
    private javax.swing.JLabel ser41;
    private javax.swing.JLabel ser42;
    private javax.swing.JLabel ser43;
    private javax.swing.JLabel ser44;
    private javax.swing.JLabel ser45;
    private javax.swing.JLabel ser46;
    private javax.swing.JLabel ser47;
    private javax.swing.JLabel ser48;
    private javax.swing.JLabel ser49;
    private javax.swing.JLabel ser50;
    private javax.swing.JLabel ser51;
    private javax.swing.JLabel ser52;
    private javax.swing.JLabel ser53;
    private javax.swing.JLabel ser54;
    private javax.swing.JLabel ser55;
    private javax.swing.JLabel ser56;
    private javax.swing.JLabel ser57;
    private javax.swing.JLabel ser58;
    private javax.swing.JLabel ser59;
    private javax.swing.JLabel ser60;
    private javax.swing.JLabel ser61;
    private javax.swing.JLabel ser62;
    private javax.swing.JLabel ser63;
    private javax.swing.JLabel ser64;
    private javax.swing.JLabel ser65;
    private javax.swing.JLabel ser66;
    private javax.swing.JLabel ser67;
    private javax.swing.JLabel ser68;
    private javax.swing.JLabel ser69;
    private javax.swing.JLabel ser70;
    private javax.swing.JLabel ser71;
    private javax.swing.JLabel ser72;
    private javax.swing.JLabel ser73;
    private javax.swing.JLabel ser74;
    private javax.swing.JLabel ser75;
    private javax.swing.JLabel ser76;
    private javax.swing.JLabel ser77;
    private javax.swing.JLabel ser78;
    private javax.swing.JLabel ser79;
    private javax.swing.JLabel ser80;
    private javax.swing.JLabel ser81;
    private javax.swing.JLabel ser82;
    private javax.swing.JLabel ser83;
    private javax.swing.JLabel ser84;
    private javax.swing.JLabel ser85;
    private javax.swing.JLabel ser86;
    private javax.swing.JLabel ser87;
    private javax.swing.JLabel ser88;
    private javax.swing.JLabel ser89;
    private javax.swing.JLabel ser90;
    private javax.swing.JLabel ser91;
    private javax.swing.JLabel ser92;
    private javax.swing.JLabel ser93;
    private javax.swing.JLabel ser94;
    private javax.swing.JLabel ser95;
    private javax.swing.JLabel ser96;
    private javax.swing.JLabel ser97;
    private javax.swing.JLabel ser98;
    private javax.swing.JLabel ser99;
    private javax.swing.JButton st;
    // End of variables declaration//GEN-END:variables
 
}
