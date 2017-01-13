import java.awt.CardLayout;
import java.awt.Container;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static oracle.net.aso.C11.h;
public class NewJFrame extends javax.swing.JFrame {
    
    Container c;
    CardLayout cd;
    public NewJFrame() {
        initComponents();
        c = getContentPane();
        cd = (CardLayout)c.getLayout();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        p1ba = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        p1t = new javax.swing.JTextField();
        p1bg = new javax.swing.JButton();
        p2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        p2b = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        p2l1 = new javax.swing.JLabel();
        p2l2 = new javax.swing.JLabel();
        p2l3 = new javax.swing.JLabel();
        p2l4 = new javax.swing.JLabel();
        p2l5 = new javax.swing.JLabel();
        p2l6 = new javax.swing.JLabel();
        p2l7 = new javax.swing.JLabel();
        p2l8 = new javax.swing.JLabel();
        p2l9 = new javax.swing.JLabel();
        p2l10 = new javax.swing.JLabel();
        p2l11 = new javax.swing.JLabel();
        p3 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        p3b = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        p3tf = new javax.swing.JTextField();
        p3bl = new javax.swing.JButton();
        p3bc = new javax.swing.JButton();
        p3p = new javax.swing.JPasswordField();
        p3lf = new javax.swing.JLabel();
        p4 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        p4bh = new javax.swing.JButton();
        p4bl = new javax.swing.JButton();
        p4ba = new javax.swing.JButton();
        p4bm = new javax.swing.JButton();
        p4bd = new javax.swing.JButton();
        p4bp = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        p4ln = new javax.swing.JLabel();
        p5 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        p5ba = new javax.swing.JButton();
        p5bl = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        p5ln = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        p5bad = new javax.swing.JButton();
        p5t1 = new javax.swing.JTextField();
        p5t2 = new javax.swing.JTextField();
        p5t3 = new javax.swing.JTextField();
        p5t4 = new javax.swing.JTextField();
        p5t5 = new javax.swing.JTextField();
        p5t6 = new javax.swing.JTextField();
        p5t7 = new javax.swing.JTextField();
        p5t8 = new javax.swing.JTextField();
        p6 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        p6ba = new javax.swing.JButton();
        p6bl = new javax.swing.JButton();
        jLabel44 = new javax.swing.JLabel();
        p6ln = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        p6t = new javax.swing.JTextField();
        p6bg = new javax.swing.JButton();
        p61 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        p61bd = new javax.swing.JButton();
        p61l1 = new javax.swing.JLabel();
        p61l2 = new javax.swing.JLabel();
        p61l3 = new javax.swing.JLabel();
        p61l4 = new javax.swing.JLabel();
        p61l5 = new javax.swing.JLabel();
        p61l6 = new javax.swing.JLabel();
        p61l7 = new javax.swing.JLabel();
        p61l8 = new javax.swing.JLabel();
        p7 = new javax.swing.JPanel();
        jLabel62 = new javax.swing.JLabel();
        p7ba = new javax.swing.JButton();
        p7bl = new javax.swing.JButton();
        jLabel63 = new javax.swing.JLabel();
        p7ln = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        p7bo = new javax.swing.JButton();
        p7bc = new javax.swing.JButton();
        p7t1 = new javax.swing.JTextField();
        p7t2 = new javax.swing.JTextField();
        p7t3 = new javax.swing.JTextField();
        p8 = new javax.swing.JPanel();
        jLabel68 = new javax.swing.JLabel();
        p8ba = new javax.swing.JButton();
        p8bl = new javax.swing.JButton();
        jLabel69 = new javax.swing.JLabel();
        p8ln = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        p8t = new javax.swing.JTextField();
        jButton24 = new javax.swing.JButton();
        p81 = new javax.swing.JPanel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        p81bu = new javax.swing.JButton();
        p81t = new javax.swing.JTextField();
        p81t2 = new javax.swing.JTextField();
        p81t3 = new javax.swing.JTextField();
        p81t4 = new javax.swing.JTextField();
        p81t5 = new javax.swing.JTextField();
        p81t6 = new javax.swing.JTextField();
        p81t7 = new javax.swing.JTextField();
        p81t8 = new javax.swing.JTextField();
        p9 = new javax.swing.JPanel();
        jLabel80 = new javax.swing.JLabel();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SRS");
        getContentPane().setLayout(new java.awt.CardLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 0));
        jLabel1.setText("SRS");

        p1ba.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        p1ba.setText("admin login");
        p1ba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1baActionPerformed(evt);
            }
        });

        jLabel2.setText("Reg. number : ");

        p1bg.setText("GO");
        p1bg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1bgActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p1Layout = new javax.swing.GroupLayout(p1);
        p1.setLayout(p1Layout);
        p1Layout.setHorizontalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(p1Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(p1t, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(p1bg))
                    .addGroup(p1Layout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(p1ba)))
                .addContainerGap(143, Short.MAX_VALUE))
        );
        p1Layout.setVerticalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(15, 15, 15)
                .addComponent(p1ba)
                .addGap(68, 68, 68)
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(p1t, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p1bg))
                .addContainerGap(197, Short.MAX_VALUE))
        );

        getContentPane().add(p1, "card2");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 255, 0));
        jLabel3.setText("SRS");

        p2b.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        p2b.setText("HOME");
        p2b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2bActionPerformed(evt);
            }
        });

        jLabel4.setText("Roll no. : ");

        jLabel5.setText("Name : ");

        jLabel6.setText("Father Name : ");

        jLabel7.setText("Math : ");

        jLabel8.setText("English : ");

        jLabel9.setText("Computer : ");

        jLabel10.setText("SST : ");

        jLabel11.setText("Science : ");

        jLabel12.setText("Total : ");

        jLabel13.setText("Persentage : ");

        jLabel14.setText("Result : ");

        p2l1.setText("jLabel15");

        p2l2.setText("jLabel16");

        p2l3.setText("jLabel17");

        p2l4.setText("jLabel18");

        p2l5.setText("jLabel19");

        p2l6.setText("jLabel20");

        p2l7.setText("jLabel21");

        p2l8.setText("jLabel22");

        p2l9.setText("jLabel23");

        p2l10.setText("jLabel24");

        p2l11.setText("jLabel25");

        javax.swing.GroupLayout p2Layout = new javax.swing.GroupLayout(p2);
        p2.setLayout(p2Layout);
        p2Layout.setHorizontalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p2Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 214, Short.MAX_VALUE)
                        .addComponent(p2b)
                        .addGap(215, 215, 215))
                    .addGroup(p2Layout.createSequentialGroup()
                        .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel14)
                            .addComponent(jLabel12)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(jLabel13)
                            .addComponent(jLabel11))
                        .addGap(60, 60, 60)
                        .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(p2l11, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                            .addComponent(p2l10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(p2l9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(p2l8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(p2l7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(p2l6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(p2l5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(p2l4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(p2l3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(p2l2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(p2l1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        p2Layout.setVerticalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(p2b))
                .addGap(27, 27, 27)
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(p2l1))
                .addGap(13, 13, 13)
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(p2l2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(p2l3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(p2l4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(p2l5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(p2l6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(p2l7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(p2l8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(p2l9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(p2l10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(p2l11))
                .addGap(36, 36, 36))
        );

        getContentPane().add(p2, "card3");

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 255, 0));
        jLabel26.setText("SRS");

        p3b.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        p3b.setText("HOME");
        p3b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p3bActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel27.setText("USER ID : ");

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel28.setText("Password : ");

        p3bl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        p3bl.setText("Login");
        p3bl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p3blActionPerformed(evt);
            }
        });

        p3bc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        p3bc.setText("Cancel");
        p3bc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p3bcActionPerformed(evt);
            }
        });

        p3lf.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        javax.swing.GroupLayout p3Layout = new javax.swing.GroupLayout(p3);
        p3.setLayout(p3Layout);
        p3Layout.setHorizontalGroup(
            p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p3Layout.createSequentialGroup()
                .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p3Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel28)
                            .addGroup(p3Layout.createSequentialGroup()
                                .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel27)
                                    .addComponent(jLabel26))
                                .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(p3Layout.createSequentialGroup()
                                        .addGap(181, 181, 181)
                                        .addComponent(p3b))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p3Layout.createSequentialGroup()
                                        .addGap(60, 60, 60)
                                        .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(p3p, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                                            .addComponent(p3tf)))))))
                    .addGroup(p3Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(p3lf, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(p3Layout.createSequentialGroup()
                                .addComponent(p3bl)
                                .addGap(58, 58, 58)
                                .addComponent(p3bc)))))
                .addContainerGap(166, Short.MAX_VALUE))
        );
        p3Layout.setVerticalGroup(
            p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(p3b))
                .addGap(64, 64, 64)
                .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(p3Layout.createSequentialGroup()
                        .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel27)
                            .addComponent(p3tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addComponent(jLabel28))
                    .addComponent(p3p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82)
                .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p3bl)
                    .addComponent(p3bc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(p3lf)
                .addGap(36, 36, 36))
        );

        getContentPane().add(p3, "card4");

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(51, 204, 0));
        jLabel29.setText("SRS");

        p4bh.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        p4bh.setText("HOME");
        p4bh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p4bhActionPerformed(evt);
            }
        });

        p4bl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        p4bl.setText("Logout");
        p4bl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p4blActionPerformed(evt);
            }
        });

        p4ba.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        p4ba.setText("add Result");
        p4ba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p4baActionPerformed(evt);
            }
        });

        p4bm.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        p4bm.setText("Modify Result");
        p4bm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p4bmActionPerformed(evt);
            }
        });

        p4bd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        p4bd.setText("Delete Result");
        p4bd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p4bdActionPerformed(evt);
            }
        });

        p4bp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        p4bp.setText("Change Password");
        p4bp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p4bpActionPerformed(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(51, 51, 255));
        jLabel30.setText("WELCOME ");

        p4ln.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        p4ln.setForeground(new java.awt.Color(51, 51, 255));
        p4ln.setText("Name");

        javax.swing.GroupLayout p4Layout = new javax.swing.GroupLayout(p4);
        p4.setLayout(p4Layout);
        p4Layout.setHorizontalGroup(
            p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p4Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29)
                    .addGroup(p4Layout.createSequentialGroup()
                        .addComponent(p4bh)
                        .addGap(85, 85, 85)
                        .addComponent(p4bl)
                        .addGap(113, 113, 113)
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(p4ln, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(p4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(p4bd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(p4bp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(p4ba, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(p4bm, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        p4Layout.setVerticalGroup(
            p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p4Layout.createSequentialGroup()
                .addComponent(jLabel29)
                .addGap(17, 17, 17)
                .addGroup(p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p4bh)
                    .addComponent(p4bl)
                    .addComponent(jLabel30)
                    .addComponent(p4ln))
                .addGap(46, 46, 46)
                .addComponent(p4ba)
                .addGap(29, 29, 29)
                .addComponent(p4bm)
                .addGap(28, 28, 28)
                .addComponent(p4bd)
                .addGap(27, 27, 27)
                .addComponent(p4bp)
                .addGap(0, 101, Short.MAX_VALUE))
        );

        getContentPane().add(p4, "card5");

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(0, 255, 0));
        jLabel32.setText("SRS");

        p5ba.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        p5ba.setText("admin home");
        p5ba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p5baActionPerformed(evt);
            }
        });

        p5bl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        p5bl.setText("Logout");
        p5bl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p5blActionPerformed(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(51, 51, 255));
        jLabel33.setText("WELCOME  ");

        p5ln.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        p5ln.setForeground(new java.awt.Color(51, 51, 255));
        p5ln.setText("Name");

        jLabel35.setText("Roll no. : ");

        jLabel36.setText("Name :  ");

        jLabel37.setText("Father Name : ");

        jLabel38.setText("Math :  ");

        jLabel39.setText("English : ");

        jLabel40.setText("Computer : ");

        jLabel41.setText("SST : ");

        jLabel42.setText("Science : ");

        p5bad.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        p5bad.setText("add");
        p5bad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p5badActionPerformed(evt);
            }
        });

        p5t8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p5t8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p5Layout = new javax.swing.GroupLayout(p5);
        p5.setLayout(p5Layout);
        p5Layout.setHorizontalGroup(
            p5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p5Layout.createSequentialGroup()
                .addGroup(p5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p5Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(p5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(p5Layout.createSequentialGroup()
                                .addComponent(p5ba)
                                .addGap(36, 36, 36)
                                .addComponent(p5bl)
                                .addGap(34, 34, 34)
                                .addComponent(jLabel33)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(p5ln, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(p5Layout.createSequentialGroup()
                                .addGroup(p5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel35)
                                    .addComponent(jLabel36)
                                    .addComponent(jLabel37)
                                    .addComponent(jLabel38)
                                    .addComponent(jLabel39)
                                    .addComponent(jLabel40)
                                    .addComponent(jLabel41)
                                    .addComponent(jLabel42))
                                .addGap(29, 29, 29)
                                .addGroup(p5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(p5t1)
                                    .addComponent(p5t2)
                                    .addComponent(p5t3)
                                    .addComponent(p5t4)
                                    .addComponent(p5t5)
                                    .addComponent(p5t6)
                                    .addComponent(p5t7)
                                    .addComponent(p5t8, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)))))
                    .addGroup(p5Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel32))
                    .addGroup(p5Layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(p5bad)))
                .addContainerGap(162, Short.MAX_VALUE))
        );
        p5Layout.setVerticalGroup(
            p5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p5Layout.createSequentialGroup()
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(p5Layout.createSequentialGroup()
                        .addGroup(p5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(p5Layout.createSequentialGroup()
                                .addGroup(p5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(p5Layout.createSequentialGroup()
                                        .addGroup(p5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(p5Layout.createSequentialGroup()
                                                .addGroup(p5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(p5Layout.createSequentialGroup()
                                                        .addGroup(p5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addGroup(p5Layout.createSequentialGroup()
                                                                .addGroup(p5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                    .addGroup(p5Layout.createSequentialGroup()
                                                                        .addGroup(p5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                            .addComponent(p5ba)
                                                                            .addComponent(p5bl)
                                                                            .addComponent(jLabel33)
                                                                            .addComponent(p5ln))
                                                                        .addGap(36, 36, 36)
                                                                        .addComponent(jLabel35))
                                                                    .addComponent(p5t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jLabel36))
                                                            .addComponent(p5t2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jLabel37))
                                                    .addComponent(p5t3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel38))
                                            .addComponent(p5t4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel39))
                                    .addComponent(p5t5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel40))
                            .addComponent(p5t6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel41))
                    .addComponent(p5t7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(p5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(p5t8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(p5bad)
                .addGap(53, 53, 53))
        );

        getContentPane().add(p5, "card6");

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(0, 255, 0));
        jLabel43.setText("SRS");

        p6ba.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        p6ba.setText("admin home ");
        p6ba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p6baActionPerformed(evt);
            }
        });

        p6bl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        p6bl.setText("Logout");
        p6bl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p6blActionPerformed(evt);
            }
        });

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(51, 51, 255));
        jLabel44.setText("WELCOME  ");

        p6ln.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        p6ln.setForeground(new java.awt.Color(51, 51, 255));
        p6ln.setText("Name");

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel46.setText("Enter Roll No.");

        p6bg.setText("GO");
        p6bg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p6bgActionPerformed(evt);
            }
        });

        p61.setBackground(new java.awt.Color(153, 255, 255));

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel47.setText("Roll No.");

        jLabel48.setText("Father Name : ");

        jLabel49.setText("Name : ");

        jLabel50.setText("English : ");

        jLabel51.setText("Math : ");

        jLabel52.setText("SST : ");

        jLabel53.setText("Science : ");

        jLabel54.setText("Computer : ");

        p61bd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        p61bd.setText("Delete ");
        p61bd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p61bdActionPerformed(evt);
            }
        });

        p61l1.setText("fn");

        p61l2.setText("n");

        p61l3.setText("e");

        p61l4.setText("m");

        p61l5.setText("st");

        p61l6.setText("s");

        p61l7.setText("c");

        p61l8.setText("r");

        javax.swing.GroupLayout p61Layout = new javax.swing.GroupLayout(p61);
        p61.setLayout(p61Layout);
        p61Layout.setHorizontalGroup(
            p61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p61Layout.createSequentialGroup()
                .addGroup(p61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p61Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(p61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel48)
                            .addComponent(jLabel49)
                            .addComponent(jLabel50)
                            .addComponent(jLabel51)
                            .addComponent(jLabel52)
                            .addComponent(jLabel53)
                            .addComponent(jLabel54)
                            .addComponent(jLabel47))
                        .addGap(18, 18, 18)
                        .addGroup(p61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(p61l1, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                            .addComponent(p61l2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(p61l3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(p61l4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(p61l5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(p61l6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(p61l7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(p61l8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(p61Layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(p61bd)))
                .addContainerGap(260, Short.MAX_VALUE))
        );
        p61Layout.setVerticalGroup(
            p61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p61Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(p61l8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(p61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(p61l1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(p61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49)
                    .addComponent(p61l2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(p61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50)
                    .addComponent(p61l3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(p61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51)
                    .addComponent(p61l4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(p61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52)
                    .addComponent(p61l5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53)
                    .addComponent(p61l6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(p61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54)
                    .addComponent(p61l7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(p61bd)
                .addContainerGap())
        );

        javax.swing.GroupLayout p6Layout = new javax.swing.GroupLayout(p6);
        p6.setLayout(p6Layout);
        p6Layout.setHorizontalGroup(
            p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p6Layout.createSequentialGroup()
                .addGroup(p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel43)
                            .addGroup(p6Layout.createSequentialGroup()
                                .addComponent(p6ba)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(p6bl)
                                .addGap(29, 29, 29)
                                .addComponent(jLabel44)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(p6ln, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(p6Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(p61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(p6Layout.createSequentialGroup()
                                .addComponent(jLabel46)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(p6t, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(p6bg)))))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        p6Layout.setVerticalGroup(
            p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p6Layout.createSequentialGroup()
                .addGroup(p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(p6t, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(p6bg))
                    .addGroup(p6Layout.createSequentialGroup()
                        .addComponent(jLabel43)
                        .addGap(18, 18, 18)
                        .addGroup(p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(p6ba)
                            .addComponent(p6bl)
                            .addComponent(jLabel44)
                            .addComponent(p6ln))
                        .addGap(26, 26, 26)
                        .addComponent(jLabel46)))
                .addGap(18, 18, 18)
                .addComponent(p61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );

        getContentPane().add(p6, "card7");

        jLabel62.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(0, 255, 0));
        jLabel62.setText("SRS");

        p7ba.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        p7ba.setText("admin home ");
        p7ba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p7baActionPerformed(evt);
            }
        });

        p7bl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        p7bl.setText("Logout ");
        p7bl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p7blActionPerformed(evt);
            }
        });

        jLabel63.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(51, 51, 255));
        jLabel63.setText("WELCOME  ");

        p7ln.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        p7ln.setForeground(new java.awt.Color(51, 51, 255));
        p7ln.setText("Name");

        jLabel65.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel65.setText("Old Password  : ");

        jLabel66.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel66.setText("New Password : ");

        jLabel67.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel67.setText("Confirm Password : ");

        p7bo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        p7bo.setText("OK");
        p7bo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p7boActionPerformed(evt);
            }
        });

        p7bc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        p7bc.setText("Cancel");
        p7bc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p7bcActionPerformed(evt);
            }
        });

        p7t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p7t1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p7Layout = new javax.swing.GroupLayout(p7);
        p7.setLayout(p7Layout);
        p7Layout.setHorizontalGroup(
            p7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p7Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(p7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel62)
                    .addGroup(p7Layout.createSequentialGroup()
                        .addGroup(p7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(p7Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(p7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel67)
                                    .addComponent(jLabel66)
                                    .addComponent(jLabel65))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(p7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(p7t1, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                                    .addComponent(p7t2)
                                    .addComponent(p7t3)))
                            .addGroup(p7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(p7Layout.createSequentialGroup()
                                    .addGap(47, 47, 47)
                                    .addComponent(p7bo)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(p7bc))
                                .addGroup(p7Layout.createSequentialGroup()
                                    .addComponent(p7ba)
                                    .addGap(18, 18, 18)
                                    .addComponent(p7bl))))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel63)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(p7ln, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50))
        );
        p7Layout.setVerticalGroup(
            p7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p7Layout.createSequentialGroup()
                .addComponent(jLabel62)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(p7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p7ba)
                    .addComponent(p7bl)
                    .addComponent(jLabel63)
                    .addComponent(p7ln))
                .addGap(31, 31, 31)
                .addGroup(p7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel65)
                    .addComponent(p7t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(p7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel66)
                    .addComponent(p7t2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(p7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel67)
                    .addComponent(p7t3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(p7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p7bo)
                    .addComponent(p7bc))
                .addGap(0, 137, Short.MAX_VALUE))
        );

        getContentPane().add(p7, "card8");

        jLabel68.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(0, 255, 0));
        jLabel68.setText("SRS");

        p8ba.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        p8ba.setText("admin home");
        p8ba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p8baActionPerformed(evt);
            }
        });

        p8bl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        p8bl.setText("Logout");
        p8bl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p8blActionPerformed(evt);
            }
        });

        jLabel69.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(0, 51, 255));
        jLabel69.setText("WELCOME  ");

        p8ln.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        p8ln.setForeground(new java.awt.Color(0, 0, 204));
        p8ln.setText("Name");

        jLabel71.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel71.setText("Enter Roll No.");

        jButton24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton24.setText("GO");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        p81.setBackground(new java.awt.Color(153, 255, 255));

        jLabel72.setText("Roll No. : ");

        jLabel73.setText("Name : ");

        jLabel74.setText("Father Name : ");

        jLabel75.setText("Math : ");

        jLabel76.setText("Computer : ");

        jLabel77.setText("English : ");

        jLabel78.setText("SST : ");

        jLabel79.setText("Science : ");

        p81bu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        p81bu.setText("Update");
        p81bu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p81buActionPerformed(evt);
            }
        });

        p81t4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p81t4ActionPerformed(evt);
            }
        });

        p81t8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p81t8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p81Layout = new javax.swing.GroupLayout(p81);
        p81.setLayout(p81Layout);
        p81Layout.setHorizontalGroup(
            p81Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p81Layout.createSequentialGroup()
                .addGroup(p81Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p81Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(p81Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel72)
                            .addComponent(jLabel73)
                            .addComponent(jLabel74)
                            .addComponent(jLabel75)
                            .addComponent(jLabel76)
                            .addComponent(jLabel77)
                            .addComponent(jLabel78)
                            .addComponent(jLabel79))
                        .addGap(38, 38, 38)
                        .addGroup(p81Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(p81t)
                            .addComponent(p81t2)
                            .addComponent(p81t3)
                            .addComponent(p81t4)
                            .addComponent(p81t5)
                            .addComponent(p81t6)
                            .addComponent(p81t7)
                            .addComponent(p81t8, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)))
                    .addGroup(p81Layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(p81bu)))
                .addContainerGap(315, Short.MAX_VALUE))
        );
        p81Layout.setVerticalGroup(
            p81Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p81Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(p81Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(p81Layout.createSequentialGroup()
                        .addGroup(p81Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(p81Layout.createSequentialGroup()
                                .addGroup(p81Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel72)
                                    .addComponent(p81t, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(p81Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel73)
                                    .addComponent(p81t2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(p81Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel74)
                                    .addComponent(p81t3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel75))
                            .addComponent(p81t4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel76))
                    .addComponent(p81t5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(p81Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel77)
                    .addComponent(p81t6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(p81Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel78)
                    .addComponent(p81t7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(p81Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel79)
                    .addComponent(p81t8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p81bu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout p8Layout = new javax.swing.GroupLayout(p8);
        p8.setLayout(p8Layout);
        p8Layout.setHorizontalGroup(
            p8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p81, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel68)
                    .addGroup(p8Layout.createSequentialGroup()
                        .addGroup(p8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(p8ba)
                            .addComponent(jLabel71))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(p8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(p8Layout.createSequentialGroup()
                                .addComponent(p8bl)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel69)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(p8ln, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(p8Layout.createSequentialGroup()
                                .addComponent(p8t, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jButton24)))))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        p8Layout.setVerticalGroup(
            p8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p8Layout.createSequentialGroup()
                .addComponent(jLabel68)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p8ba)
                    .addComponent(p8bl)
                    .addComponent(jLabel69)
                    .addComponent(p8ln))
                .addGap(18, 18, 18)
                .addGroup(p8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel71)
                    .addComponent(p8t, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(p81, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(p8, "card9");

        jLabel80.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel80.setText("SRS");

        jButton26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton26.setText("admin home ");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        jButton27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton27.setText("Logout");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        jLabel81.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel81.setText("WELCOME  ");

        jLabel82.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel82.setText("Name");

        javax.swing.GroupLayout p9Layout = new javax.swing.GroupLayout(p9);
        p9.setLayout(p9Layout);
        p9Layout.setHorizontalGroup(
            p9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p9Layout.createSequentialGroup()
                .addGroup(p9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel80))
                    .addGroup(p9Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jButton26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton27)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel81)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel82)))
                .addContainerGap(285, Short.MAX_VALUE))
        );
        p9Layout.setVerticalGroup(
            p9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p9Layout.createSequentialGroup()
                .addComponent(jLabel80)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(p9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton26)
                    .addComponent(jButton27)
                    .addComponent(jLabel81)
                    .addComponent(jLabel82))
                .addGap(0, 331, Short.MAX_VALUE))
        );

        getContentPane().add(p9, "card10");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void p4bmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p4bmActionPerformed
        cd.show(c,"card9");
    }//GEN-LAST:event_p4bmActionPerformed

    private void p5t8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p5t8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p5t8ActionPerformed

    private void p7t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p7t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p7t1ActionPerformed

    private void p81t4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p81t4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p81t4ActionPerformed

    private void p81t8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p81t8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p81t8ActionPerformed

    private void p1baActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1baActionPerformed
        cd.show(c,"card4");
    }//GEN-LAST:event_p1baActionPerformed

    private void p1bgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1bgActionPerformed

        int n = Integer.parseInt(p1t.getText());
        try
   {
         Class.forName("oracle.jdbc.driver.OracleDriver");
	 Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","fdb","grvsrk");
	 Statement st = (Statement) con.createStatement();
	 ResultSet rs;
            rs = st.executeQuery("select * from result where roll_no="+n);
            rs.next();
         String s=String.valueOf(rs.getInt(1));
         if(n==rs.getInt(1)){
          p2l1.setText(s);
          p2l2.setText(rs.getString(2));
          p2l3.setText(rs.getString(3));
          p2l4.setText(String.valueOf(rs.getInt(4)));
          p2l5.setText(String.valueOf(rs.getInt(5)));
          p2l6.setText(String.valueOf(rs.getInt(6)));
          p2l7.setText(String.valueOf(rs.getInt(7)));
          p2l8.setText(String.valueOf(rs.getInt(8)));
          int t = rs.getInt(4)+rs.getInt(5)+rs.getInt(6)+rs.getInt(7)+rs.getInt(8);
          p2l9.setText(String.valueOf(t));
          float p = (t/5);
          p2l10.setText(String.valueOf(p)+"%");
          if(t<150)
              p2l11.setText("fail");
          else
              p2l11.setText("pass");
          cd.show(c,"card3");
         }
         else{
             p2l1.setText("");
          p2l2.setText("");
          p2l3.setText("");
          p2l4.setText("");
          p2l5.setText("");
          p2l6.setText("");
          p2l7.setText("");
          p2l8.setText("");
          p2l9.setText("");
          p2l10.setText("");
              p2l11.setText("");
              p2l11.setText("");
         }
	 con.close();
	 }
	 catch(Exception e)
	 {
	   JOptionPane.showMessageDialog(null,"Invailid Roll no.");
	 }
        p1t.setText("");
    }//GEN-LAST:event_p1bgActionPerformed

    private void p2bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2bActionPerformed
        cd.show(c,"card2");
    }//GEN-LAST:event_p2bActionPerformed

    private void p3bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p3bActionPerformed
       p3tf.setText("");
       p3p.setText("");
        cd.show(c,"card2");
    }//GEN-LAST:event_p3bActionPerformed

    private void p3blActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p3blActionPerformed
        p3lf.setText("");
        String u=p3tf.getText();
        String pas=String.copyValueOf(p3p.getPassword());
        try
   {
     Class.forName("oracle.jdbc.driver.OracleDriver");
	 Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","fdb","grvsrk");
	 Statement st = con.createStatement();
	 ResultSet rs = st.executeQuery("select * from admin_info where user_id='"+u+"'");
         rs.next();
         if(rs.getString(2).equals(pas))
         {
             cd.show(c,"card5");
             p4ln.setText(rs.getString(4));
             p5ln.setText(rs.getString(4));
             p6ln.setText(rs.getString(4));
             p7ln.setText(rs.getString(4));
             p8ln.setText(rs.getString(4));
         }
         else
             p3lf.setText("incorrect password ");
         p3p.setText("");
         p3tf.setText("");
	 con.close();
	 }
	 catch(Exception e)
	 {
	   JOptionPane.showMessageDialog(null,e);
           p3p.setText("");
         p3tf.setText("");
	 }
    }//GEN-LAST:event_p3blActionPerformed

    private void p3bcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p3bcActionPerformed
      p3tf.setText("");
      p3p.setText("");
        cd.show(c,"card2");
        
    }//GEN-LAST:event_p3bcActionPerformed

    private void p4bhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p4bhActionPerformed
        cd.show(c,"card2");
    }//GEN-LAST:event_p4bhActionPerformed

    private void p4blActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p4blActionPerformed
        cd.show(c,"card4");
    }//GEN-LAST:event_p4blActionPerformed

    private void p4baActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p4baActionPerformed
        p5t1.setText("");
         p5t2.setText("");
          p5t3.setText("");
           p5t4.setText("");
            p5t5.setText("");
             p5t6.setText("");
              p5t7.setText("");
               p5t8.setText("");
        cd.show(c,"card6");
    }//GEN-LAST:event_p4baActionPerformed

    private void p4bdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p4bdActionPerformed
        cd.show(c,"card7");
    }//GEN-LAST:event_p4bdActionPerformed

    private void p4bpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p4bpActionPerformed
        cd.show(c,"card8");
    }//GEN-LAST:event_p4bpActionPerformed

    private void p5baActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p5baActionPerformed
        cd.show(c,"card5");
    }//GEN-LAST:event_p5baActionPerformed

    private void p5blActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p5blActionPerformed
        cd.show(c,"card4");
    }//GEN-LAST:event_p5blActionPerformed

    private void p5badActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p5badActionPerformed
       try
   {
     Class.forName("oracle.jdbc.driver.OracleDriver");
	 Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","fdb","grvsrk");
	 Statement st = con.createStatement();
	 st.executeUpdate("insert into result values("+Integer.parseInt(p5t1.getText())+",'"+p5t2.getText()+"','"+p5t3.getText()+"',"+Integer.parseInt(p5t4.getText())+","+Integer.parseInt(p5t5.getText())+","+Integer.parseInt(p5t6.getText())+","+Integer.parseInt(p5t7.getText())+","+Integer.parseInt(p5t8.getText())+")");
	 JOptionPane.showMessageDialog(null,"inserted successfully");
         con.close();
	 }
	 catch(Exception e)
	 {
	   JOptionPane.showMessageDialog(null,e);
	 }
    }//GEN-LAST:event_p5badActionPerformed

    private void p6baActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p6baActionPerformed
        cd.show(c,"card5");
    }//GEN-LAST:event_p6baActionPerformed

    private void p6blActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p6blActionPerformed
        cd.show(c,"card4");
    }//GEN-LAST:event_p6blActionPerformed

    private void p7baActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p7baActionPerformed
        cd.show(c,"card5");
    }//GEN-LAST:event_p7baActionPerformed

    private void p7blActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p7blActionPerformed
        cd.show(c,"card4");
    }//GEN-LAST:event_p7blActionPerformed

    private void p8baActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p8baActionPerformed
        cd.show(c,"card5");
    }//GEN-LAST:event_p8baActionPerformed

    private void p8blActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p8blActionPerformed
        cd.show(c,"card4");
    }//GEN-LAST:event_p8blActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
       cd.show(c,"card5");
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        cd.show(c,"card4");
    }//GEN-LAST:event_jButton27ActionPerformed

    private void p7bcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p7bcActionPerformed
        cd.show(c,"card5");
    }//GEN-LAST:event_p7bcActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        int h = Integer.parseInt(p8t.getText());
        try
   {
     Class.forName("oracle.jdbc.driver.OracleDriver");
	 Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","fdb","grvsrk");
	 Statement st = con.createStatement();
	 ResultSet rs = st.executeQuery("select * from result where roll_no="+h);
         rs.next();
         p81t.setText(String.valueOf(h));
         p81t2.setText(rs.getString(2));
         p81t3.setText(rs.getString(3));
         p81t4.setText(String.valueOf(rs.getInt(4)));
         p81t5.setText(String.valueOf(rs.getInt(6)));
         p81t6.setText(String.valueOf(rs.getInt(5)));
         p81t7.setText(String.valueOf(rs.getInt(7)));
         p81t8.setText(String.valueOf(rs.getInt(8)));
	 con.close();
	 }
	 catch(Exception e)
	 {
	   JOptionPane.showMessageDialog(null,e);
	 }
    }//GEN-LAST:event_jButton24ActionPerformed

    private void p81buActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p81buActionPerformed
        try
   {
     Class.forName("oracle.jdbc.driver.OracleDriver");
	 Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","fdb","grvsrk");
	 Statement st = con.createStatement();
	 st.executeUpdate("update result set roll_no="+Integer.parseInt(p81t.getText())+",name='"+p81t2.getText()+"',fname='"+p81t3.getText()+"',math="+Integer.parseInt(p81t4.getText())+",english="+Integer.parseInt(p81t6.getText())+",computer="+Integer.parseInt(p81t5.getText())+",sst="+Integer.parseInt(p81t7.getText())+",science="+Integer.parseInt(p81t8.getText())+" where roll_no="+Integer.parseInt(p8t.getText())+"");
	 p8t.setText("");
         p81t.setText("");
         p81t2.setText("");
         p81t3.setText("");
         p81t4.setText("");
         p81t5.setText("");
         p81t6.setText("");
         p81t7.setText("");
         p81t8.setText("");
         JOptionPane.showMessageDialog(null,"updation succesfull");
         con.close();
	 }
	 catch(Exception e)
	 {
	   JOptionPane.showMessageDialog(null,e);
	 }
    }//GEN-LAST:event_p81buActionPerformed

    private void p6bgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p6bgActionPerformed
           int h = Integer.parseInt(p6t.getText());
        try
   {
     Class.forName("oracle.jdbc.driver.OracleDriver");
	 Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","fdb","grvsrk");
	 Statement st = con.createStatement();
	 ResultSet rs = st.executeQuery("select * from result where roll_no="+h);
         rs.next();
         p61l8.setText(String.valueOf(rs.getInt(1)));
         p61l1.setText(rs.getString(2));
         p61l2.setText(rs.getString(3));
         p61l3.setText(String.valueOf(rs.getInt(4)));
         p61l4.setText(String.valueOf(rs.getInt(6)));
         p61l5.setText(String.valueOf(rs.getInt(5)));
         p61l6.setText(String.valueOf(rs.getInt(7)));
         p61l7.setText(String.valueOf(rs.getInt(8)));
	 con.close();
	 }
	 catch(Exception e)
	 {
	   JOptionPane.showMessageDialog(null,e);
	 }
    }//GEN-LAST:event_p6bgActionPerformed

    private void p61bdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p61bdActionPerformed
            try
   {
     Class.forName("oracle.jdbc.driver.OracleDriver");
	 Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","fdb","grvsrk");
	 Statement st = con.createStatement();
	 st.executeUpdate("delete result where roll_no="+Integer.parseInt(p6t.getText())+"");
	 p6t.setText("");
         p61l1.setText("");
         p61l2.setText("");
         p61l3.setText("");
         p61l4.setText("");
         p61l5.setText("");
         p61l6.setText("");
         p61l7.setText("");
         p61l8.setText("");
         JOptionPane.showMessageDialog(null,"deletion succesfull");
         con.close();
	 }
	 catch(Exception e)
	 {
	   JOptionPane.showMessageDialog(null,e);
	 }
    }//GEN-LAST:event_p61bdActionPerformed

    private void p7boActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p7boActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p7boActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel p1;
    private javax.swing.JButton p1ba;
    private javax.swing.JButton p1bg;
    private javax.swing.JTextField p1t;
    private javax.swing.JPanel p2;
    private javax.swing.JButton p2b;
    private javax.swing.JLabel p2l1;
    private javax.swing.JLabel p2l10;
    private javax.swing.JLabel p2l11;
    private javax.swing.JLabel p2l2;
    private javax.swing.JLabel p2l3;
    private javax.swing.JLabel p2l4;
    private javax.swing.JLabel p2l5;
    private javax.swing.JLabel p2l6;
    private javax.swing.JLabel p2l7;
    private javax.swing.JLabel p2l8;
    private javax.swing.JLabel p2l9;
    private javax.swing.JPanel p3;
    private javax.swing.JButton p3b;
    private javax.swing.JButton p3bc;
    private javax.swing.JButton p3bl;
    private javax.swing.JLabel p3lf;
    private javax.swing.JPasswordField p3p;
    private javax.swing.JTextField p3tf;
    private javax.swing.JPanel p4;
    private javax.swing.JButton p4ba;
    private javax.swing.JButton p4bd;
    private javax.swing.JButton p4bh;
    private javax.swing.JButton p4bl;
    private javax.swing.JButton p4bm;
    private javax.swing.JButton p4bp;
    private javax.swing.JLabel p4ln;
    private javax.swing.JPanel p5;
    private javax.swing.JButton p5ba;
    private javax.swing.JButton p5bad;
    private javax.swing.JButton p5bl;
    private javax.swing.JLabel p5ln;
    private javax.swing.JTextField p5t1;
    private javax.swing.JTextField p5t2;
    private javax.swing.JTextField p5t3;
    private javax.swing.JTextField p5t4;
    private javax.swing.JTextField p5t5;
    private javax.swing.JTextField p5t6;
    private javax.swing.JTextField p5t7;
    private javax.swing.JTextField p5t8;
    private javax.swing.JPanel p6;
    private javax.swing.JPanel p61;
    private javax.swing.JButton p61bd;
    private javax.swing.JLabel p61l1;
    private javax.swing.JLabel p61l2;
    private javax.swing.JLabel p61l3;
    private javax.swing.JLabel p61l4;
    private javax.swing.JLabel p61l5;
    private javax.swing.JLabel p61l6;
    private javax.swing.JLabel p61l7;
    private javax.swing.JLabel p61l8;
    private javax.swing.JButton p6ba;
    private javax.swing.JButton p6bg;
    private javax.swing.JButton p6bl;
    private javax.swing.JLabel p6ln;
    private javax.swing.JTextField p6t;
    private javax.swing.JPanel p7;
    private javax.swing.JButton p7ba;
    private javax.swing.JButton p7bc;
    private javax.swing.JButton p7bl;
    private javax.swing.JButton p7bo;
    private javax.swing.JLabel p7ln;
    private javax.swing.JTextField p7t1;
    private javax.swing.JTextField p7t2;
    private javax.swing.JTextField p7t3;
    private javax.swing.JPanel p8;
    private javax.swing.JPanel p81;
    private javax.swing.JButton p81bu;
    private javax.swing.JTextField p81t;
    private javax.swing.JTextField p81t2;
    private javax.swing.JTextField p81t3;
    private javax.swing.JTextField p81t4;
    private javax.swing.JTextField p81t5;
    private javax.swing.JTextField p81t6;
    private javax.swing.JTextField p81t7;
    private javax.swing.JTextField p81t8;
    private javax.swing.JButton p8ba;
    private javax.swing.JButton p8bl;
    private javax.swing.JLabel p8ln;
    private javax.swing.JTextField p8t;
    private javax.swing.JPanel p9;
    // End of variables declaration//GEN-END:variables
}
