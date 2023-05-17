package ui;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;

import entites.KhachHang;
import service.KhachHangService;

public class UIKhachhang extends javax.swing.JFrame {
	private List<JButton> buttons = new ArrayList<>();
	private KhachHangService khachHangService = new KhachHangService();
	private  DefaultTableModel tableModel;
	private String[] columns = { "Mã khách hàng", "Tên khách hàng", "Số điện thoại", "Địa chỉ" };
	/**
	 * Creates new form UIKhachhang
	 */
	public UIKhachhang() {
		pnlmenu = new javax.swing.JPanel();
		pnlmenu.setBackground(new java.awt.Color(102, 102, 102));
		Menu();
		initComponents();
		FocusMenuButton();
		setResizable(false);
	}
	private void FocusMenuButton() {
		menukhachhang.setBackground(Color.red);
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
		
		menukhachhang.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				if (evt.getSource().equals(menukhachhang)) {
					UIKhachhang sanPham = new UIKhachhang();
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
        lblmakhachhang = new javax.swing.JLabel();
        txtmasanpham = new javax.swing.JTextField();
        txtdongia = new javax.swing.JTextField();
        lblsodienthoai = new javax.swing.JLabel();
        lbltenkhachhang = new javax.swing.JLabel();
        lbldiachikhachhang = new javax.swing.JLabel();
        txtsoluong = new javax.swing.JTextField();
        txttensanpham = new javax.swing.JTextField();
        btnxoatrang = new javax.swing.JButton();
        btnxoakhachhang = new javax.swing.JButton();
        btnsuakhachhang = new javax.swing.JButton();
        btntaokhachhang = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        txtsearch = new javax.swing.JTextField();
        btnsearch = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlmenu.setBackground(new java.awt.Color(102, 102, 102));
        pnlmenu.setPreferredSize(new java.awt.Dimension(1200, 56));

        javax.swing.GroupLayout pnlmenuLayout = new javax.swing.GroupLayout(pnlmenu);
        pnlmenu.setLayout(pnlmenuLayout);
        pnlmenuLayout.setHorizontalGroup(
            pnlmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1200, Short.MAX_VALUE)
        );
        pnlmenuLayout.setVerticalGroup(
            pnlmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 56, Short.MAX_VALUE)
        );

        pnlmain.setPreferredSize(new java.awt.Dimension(1200, 644));

        lblmakhachhang.setText("Mã khách hàng :");
        lblmakhachhang.setPreferredSize(new java.awt.Dimension(100, 25));

        txtmasanpham.setPreferredSize(new java.awt.Dimension(200, 25));
		txtmasanpham.setEnabled(false);

        txtdongia.setPreferredSize(new java.awt.Dimension(200, 25));

        lblsodienthoai.setText("Số điện thoại :");
        lblsodienthoai.setPreferredSize(new java.awt.Dimension(100, 25));

        lbltenkhachhang.setText("Tên khách hàng :");
        lbltenkhachhang.setPreferredSize(new java.awt.Dimension(100, 25));

        lbldiachikhachhang.setText("Địa chỉ :");
        lbldiachikhachhang.setPreferredSize(new java.awt.Dimension(100, 25));

        txtsoluong.setPreferredSize(new java.awt.Dimension(200, 25));

        txttensanpham.setPreferredSize(new java.awt.Dimension(200, 25));

        btnxoatrang.setText("Xóa trắng");
        btnxoatrang.setPreferredSize(new java.awt.Dimension(100, 25));
        btnxoatrang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoatrangActionPerformed(evt);
            }
        });

        btnxoakhachhang.setText("Xóa khách hàng");
        btnxoakhachhang.setPreferredSize(new java.awt.Dimension(100, 25));

        btnsuakhachhang.setText("Sửa khách hàng");
        btnsuakhachhang.setPreferredSize(new java.awt.Dimension(100, 25));

        btntaokhachhang.setText("Thêm khách hàng");
        btntaokhachhang.setPreferredSize(new java.awt.Dimension(100, 25));

		tableModel = new javax.swing.table.DefaultTableModel(
          columns,0
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        };

        table.setModel(tableModel);
        jScrollPane1.setViewportView(table);
		// load data from
		loadDataTable();
		
		// click row table
		table.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				int row = table.getSelectedRow();
				txtmasanpham.setText(table.getValueAt(row, 0).toString());
				txttensanpham.setText(table.getValueAt(row, 1).toString());
				txtdongia.setText(table.getValueAt(row, 2).toString());
				txtsoluong.setText(table.getValueAt(row, 3).toString());
			}
		});

        txtsearch.setPreferredSize(new java.awt.Dimension(64, 25));

        btnsearch.setText("Tìm");
        btnsearch.setPreferredSize(new java.awt.Dimension(75, 25));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sắp xếp theo tên khách hàng" }));

        javax.swing.GroupLayout pnlmainLayout = new javax.swing.GroupLayout(pnlmain);
        pnlmain.setLayout(pnlmainLayout);
        pnlmainLayout.setHorizontalGroup(
            pnlmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlmainLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(pnlmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(pnlmainLayout.createSequentialGroup()
                        .addGroup(pnlmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(pnlmainLayout.createSequentialGroup()
                                .addComponent(txtsearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlmainLayout.createSequentialGroup()
                                .addGroup(pnlmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblsodienthoai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblmakhachhang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtmasanpham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtdongia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(117, 117, 117)
                        .addGroup(pnlmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbltenkhachhang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbldiachikhachhang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txttensanpham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtsoluong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(117, 117, 117)
                        .addGroup(pnlmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlmainLayout.createSequentialGroup()
                                .addGroup(pnlmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnxoakhachhang, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                                    .addComponent(btnxoatrang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btntaokhachhang, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                                    .addComponent(btnsuakhachhang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlmainLayout.setVerticalGroup(
            pnlmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlmainLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnlmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblmakhachhang, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(txtmasanpham, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(lbltenkhachhang, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(txttensanpham, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(btnxoatrang, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(btntaokhachhang, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblsodienthoai, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(txtdongia, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(lbldiachikhachhang, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(txtsoluong, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(btnxoakhachhang, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(btnsuakhachhang, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(44, 44, 44)
                .addGroup(pnlmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlmenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(pnlmain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlmenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlmain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
	}// </editor-fold>

	private void btnxoatrangActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void loadDataTable() {
		// TODO add your handling code here:
		for(KhachHang kh : khachHangService.getDanhsach()) {
			tableModel.addRow(new Object[] {kh.getMakhachhang(), kh.getTenkhachhang(), kh.getSodienthoai(), kh.getDiachi()});
		}
		table.setModel(tableModel);
		table.updateUI();

	}
	/**
	 * @param args the command line arguments
	 */
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
			java.util.logging.Logger.getLogger(UIKhachhang.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(UIKhachhang.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(UIKhachhang.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(UIKhachhang.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new UIKhachhang().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify
	private javax.swing.JButton btnsearch;
	private javax.swing.JButton btnsuakhachhang;
	private javax.swing.JButton btntaokhachhang;
	private javax.swing.JButton btnxoakhachhang;
	private javax.swing.JButton btnxoatrang;
	private javax.swing.JComboBox<String> jComboBox1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JLabel lbldiachikhachhang;
	private javax.swing.JLabel lblmakhachhang;
	private javax.swing.JLabel lblsodienthoai;
	private javax.swing.JLabel lbltenkhachhang;
	private javax.swing.JPanel pnlmain;
	private javax.swing.JTable table;
	private javax.swing.JTextField txtdongia;
	private javax.swing.JTextField txtmasanpham;
	private javax.swing.JTextField txtsearch;
	private javax.swing.JTextField txtsoluong;
	private javax.swing.JTextField txttensanpham;
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
