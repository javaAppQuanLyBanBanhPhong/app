package ui;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class UITrangchu extends JFrame {
	private List<JButton> buttons = new ArrayList<>();
    /**
     * Creates new form UITrangchu
     */
    public UITrangchu() {
    	pnlmenu = new javax.swing.JPanel();
		pnlmenu.setBackground(new java.awt.Color(102, 102, 102));
		Menu();
		initComponents();
		FocusMenuButton();
    }
    private void FocusMenuButton() {
		menutrangchu.setBackground(Color.red);
		for (JButton button : buttons) {
			button.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent evt) {
					for (JButton jButton : buttons) {
						if (jButton.equals(button)) {
							button.setBackground(Color.red);
						} else {
							jButton.setBackground(pnlmain.getBackground());

						}
					}
				}
			});
		}

	}

	private void Menu() {
		menutrangchu = new javax.swing.JButton();
		menusanpham = new javax.swing.JButton();
		menuhanghoa = new javax.swing.JButton();
		menukhachhang = new javax.swing.JButton();
		menuhoadon = new javax.swing.JButton();
		menuthuchi = new javax.swing.JButton();
		menuthongke = new javax.swing.JButton();
		lbltencssx = new javax.swing.JLabel();
		lbldiachi = new javax.swing.JLabel();

		buttons = new ArrayList<>();
		buttons.add(menutrangchu);
		buttons.add(menusanpham);
		buttons.add(menuhanghoa);
		buttons.add(menuhoadon);
		buttons.add(menukhachhang);
		buttons.add(menuthongke);
		buttons.add(menuthuchi);

		menutrangchu.setText("Trang chủ");
		menutrangchu.setCursor(new Cursor(HAND_CURSOR));
		menutrangchu.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				if (evt.getSource().equals(menutrangchu)) {
					UITrangchu trangchu = new UITrangchu();
					trangchu.setVisible(true);
					dispose();
				}
			}
		});
		menuhoadon.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				if (evt.getSource().equals(menuhoadon)) {
					UIHoadon hoadon = new UIHoadon();
					hoadon.setVisible(true);
					dispose();
				}
			}
		});

		menusanpham.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				if (evt.getSource().equals(menusanpham)) {
					UISanpham sanPham = new UISanpham();
					sanPham.setVisible(true);
					dispose();
				}
			}
		});

		menusanpham.setText("Sản phẩm");
		menusanpham.setCursor(new Cursor(HAND_CURSOR));

		menuhanghoa.setText("Hàng hóa");
		menuhanghoa.setCursor(new Cursor(HAND_CURSOR));

		menukhachhang.setText("Khách hàng");
		menukhachhang.setCursor(new Cursor(HAND_CURSOR));

		menuhoadon.setText("Hóa đơn");
		menuhoadon.setCursor(new Cursor(HAND_CURSOR));

		menuthuchi.setText("Thu & Chi");
		menuthuchi.setCursor(new Cursor(HAND_CURSOR));

		menuthongke.setText("Thống kê");
		menuthongke.setCursor(new Cursor(HAND_CURSOR));

		menutrangchu.setIcon(new ImageIcon(new ImageIcon("public/icon/icons8-home-30.png").getImage()
				.getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
		menusanpham.setIcon(new ImageIcon(new ImageIcon("public/icon/icons8-food-receiver-50.png").getImage()
				.getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
		menuhanghoa.setIcon(new ImageIcon(new ImageIcon("public/icon/icons8-package-58.png").getImage()
				.getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
		menuhoadon.setIcon(new ImageIcon(new ImageIcon("public/icon/icons8-tips-50.png").getImage()
				.getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
		menukhachhang.setIcon(new ImageIcon(new ImageIcon("public/icon/icons8-customer-64.png").getImage()
				.getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
		menuthuchi.setIcon(new ImageIcon(new ImageIcon("public/icon/icons8-cut-spending-64.png").getImage()
				.getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
		menuthongke.setIcon(new ImageIcon(new ImageIcon("public/icon/icons8-analytics-30.png").getImage()
				.getScaledInstance(20, 20, Image.SCALE_SMOOTH)));

		lbltencssx.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
		lbltencssx.setText("Cơ sở sản xuất & phân phối bánh Lê Giàu");

		lbldiachi.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
		lbldiachi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		lbldiachi.setText("Đ/c: ấp 2,Long An Huynh, Cần Giuộc, Long An");

		javax.swing.GroupLayout pnlmenuLayout = new javax.swing.GroupLayout(pnlmenu);
		pnlmenu.setLayout(pnlmenuLayout);
		pnlmenuLayout.setHorizontalGroup(pnlmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(pnlmenuLayout.createSequentialGroup().addGap(20, 20, 20).addComponent(menutrangchu)
						.addGap(10, 10, 10).addComponent(menusanpham).addGap(10, 10, 10).addComponent(menuhanghoa)
						.addGap(10, 10, 10).addComponent(menukhachhang).addGap(10, 10, 10).addComponent(menuhoadon)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(menuthuchi)
						.addGap(10, 10, 10).addComponent(menuthongke)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
						.addGroup(pnlmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(lbltencssx).addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
										pnlmenuLayout.createSequentialGroup()
												.addComponent(lbldiachi, javax.swing.GroupLayout.PREFERRED_SIZE, 242,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(12, 12, 12)))
						.addGap(20, 20, 20)));
		pnlmenuLayout.setVerticalGroup(pnlmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(pnlmenuLayout.createSequentialGroup().addContainerGap(18, Short.MAX_VALUE)
						.addGroup(pnlmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(menutrangchu).addComponent(menusanpham).addComponent(menuhanghoa)
								.addComponent(menukhachhang).addComponent(menuhoadon).addComponent(menuthuchi)
								.addComponent(menuthongke))
						.addGap(15, 15, 15))
				.addGroup(pnlmenuLayout.createSequentialGroup().addContainerGap().addComponent(lbltencssx)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(lbldiachi)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(pnlmenu, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
						.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(pnlmenu, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(0, 0, Short.MAX_VALUE)));

		pack();
		setLocationRelativeTo(null);
	}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        pnlmenu = new javax.swing.JPanel();
        pnlmain = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        pnlmenu.setBackground(new java.awt.Color(102, 102, 102));
        pnlmenu.setPreferredSize(new java.awt.Dimension(1200, 56));

        javax.swing.GroupLayout pnlmenuLayout = new javax.swing.GroupLayout(pnlmenu);
        pnlmenu.setLayout(pnlmenuLayout);
        pnlmenuLayout.setHorizontalGroup(
            pnlmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlmenuLayout.setVerticalGroup(
            pnlmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 56, Short.MAX_VALUE)
        );

        pnlmain.setBackground(new java.awt.Color(204, 204, 204));
        pnlmain.setPreferredSize(new java.awt.Dimension(1200, 644));

        jLabel1.setText("jLabel1");
        jLabel1.setPreferredSize(new java.awt.Dimension(50, 50));

        jButton1.setText("Thêm sản phẩm");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlmainLayout = new javax.swing.GroupLayout(pnlmain);
        pnlmain.setLayout(pnlmainLayout);
        pnlmainLayout.setHorizontalGroup(
            pnlmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlmainLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );
        pnlmainLayout.setVerticalGroup(
            pnlmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlmainLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnlmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(524, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pnlmain, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlmenu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlmenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlmain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

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
            java.util.logging.Logger.getLogger(UITrangchu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UITrangchu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UITrangchu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UITrangchu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UITrangchu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel pnlmain;
    // End of variables declaration  
	// MENU
	private javax.swing.JLabel lbldiachi;
	private javax.swing.JLabel lbltencssx;
	private javax.swing.JButton menuhanghoa;
	private javax.swing.JButton menuhoadon;
	private javax.swing.JButton menukhachhang;
	private javax.swing.JButton menusanpham;
	private javax.swing.JButton menuthongke;
	private javax.swing.JButton menuthuchi;
	private javax.swing.JButton menutrangchu;
	private javax.swing.JPanel pnlmenu;
}
