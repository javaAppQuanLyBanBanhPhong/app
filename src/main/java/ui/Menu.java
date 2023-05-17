package ui;

import javax.swing.JFrame;

public class Menu extends JFrame {
	public Menu() {
		setResizable(false);
		initComponents();
	}

	private void initComponents() {

		pnlMenu = new javax.swing.JPanel();
		menuTrangchu = new javax.swing.JButton();
		menuSanpham = new javax.swing.JButton();
		menuHoadon = new javax.swing.JButton();
		menuThuchi = new javax.swing.JButton();
		menuKhachhang = new javax.swing.JButton();
		menuThongke = new javax.swing.JButton();
		lbltencssx = new javax.swing.JLabel();
		lbldiachi = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		pnlMenu.setBackground(new java.awt.Color(102, 102, 102));

		menuTrangchu.setText("Trang chủ");
		menuTrangchu.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
			}
		});

		menuSanpham.setText("Sản phẩm");

		menuHoadon.setText("Hóa đơn");

		menuThuchi.setText("Thu & Chi");

		menuKhachhang.setText("Khách hàng");

		menuThongke.setText("Thống kê");

		lbltencssx.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
		lbltencssx.setForeground(new java.awt.Color(255, 255, 255));
		lbltencssx.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
		lbltencssx.setText("Cơ sở sản xuất & Phân phối bánh Lê Giàu");

		lbldiachi.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
		lbldiachi.setForeground(new java.awt.Color(255, 255, 255));
		lbldiachi.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
		lbldiachi.setText("Địa chỉ: ấp 2, Long An Huyn,Cần Giuộc,Long An");

		javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
		pnlMenu.setLayout(pnlMenuLayout);
		pnlMenuLayout.setHorizontalGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(pnlMenuLayout.createSequentialGroup().addGap(50, 50, 50).addComponent(menuTrangchu)
						.addGap(10, 10, 10).addComponent(menuSanpham).addGap(10, 10, 10).addComponent(menuHoadon)
						.addGap(10, 10, 10).addComponent(menuThuchi).addGap(10, 10, 10).addComponent(menuKhachhang)
						.addGap(10, 10, 10).addComponent(menuThongke)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 276, Short.MAX_VALUE)
						.addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(lbldiachi, javax.swing.GroupLayout.Alignment.TRAILING,
										javax.swing.GroupLayout.PREFERRED_SIZE, 254,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(lbltencssx, javax.swing.GroupLayout.Alignment.TRAILING))
						.addGap(50, 50, 50)));
		pnlMenuLayout.setVerticalGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(pnlMenuLayout.createSequentialGroup().addGroup(pnlMenuLayout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(pnlMenuLayout.createSequentialGroup().addGap(15, 15, 15)
								.addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(menuTrangchu).addComponent(menuSanpham).addComponent(menuHoadon)
										.addComponent(menuThuchi).addComponent(menuKhachhang)
										.addComponent(menuThongke)))
						.addGroup(pnlMenuLayout.createSequentialGroup().addGap(10, 10, 10).addComponent(lbltencssx)
								.addGap(0, 0, 0).addComponent(lbldiachi)))
						.addContainerGap(10, Short.MAX_VALUE)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				pnlMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(pnlMenu, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(0, 0, Short.MAX_VALUE)));

		pack();
		setLocationRelativeTo(null);
	}

	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Menu().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify
	private javax.swing.JLabel lbldiachi;
	private javax.swing.JLabel lbltencssx;
	private javax.swing.JButton menuHoadon;
	private javax.swing.JButton menuKhachhang;
	private javax.swing.JButton menuSanpham;
	private javax.swing.JButton menuThongke;
	private javax.swing.JButton menuThuchi;
	private javax.swing.JButton menuTrangchu;
	private javax.swing.JPanel pnlMenu;
	// End of variables declaration
}
