package ui;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Image;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import entites.SanPham;
import service.Sanphamservice;

public class UISanpham extends JFrame {
	private List<JButton> buttons = new ArrayList<>();
	private Sanphamservice sanphamservice = new Sanphamservice();

	/**
	 * Creates new form UISanpham
	 */
	public UISanpham() {
		pnlmenu = new javax.swing.JPanel();
		pnlmenu.setBackground(new java.awt.Color(102, 102, 102));
		Menu();
		initComponents();
		FocusMenuButton();
	}

	private void FocusMenuButton() {
		menusanpham.setBackground(Color.red);
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

	@SuppressWarnings("unchecked")
	private void initComponents() {
		pnlmenu = new javax.swing.JPanel();
		pnlmain = new javax.swing.JPanel();
		lblmasanpham = new javax.swing.JLabel();
		txtmasanpham = new javax.swing.JTextField();
		lbltensanpham = new javax.swing.JLabel();
		txttensanpham = new javax.swing.JTextField();
		btnxoatrang = new javax.swing.JButton();
		btntaosanpham = new javax.swing.JButton();
		lbldongia = new javax.swing.JLabel();
		txtdongia = new javax.swing.JTextField();
		lblsoluong = new javax.swing.JLabel();
		txtsoluong = new javax.swing.JTextField();
		btnxoasanpham = new javax.swing.JButton();
		btnsuasanpham = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		table = new javax.swing.JTable();
		txttimkiem = new javax.swing.JTextField();
		btntimkiem = new javax.swing.JButton();
		cmbsapxep = new javax.swing.JComboBox<>();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setResizable(false);

		pnlmenu.setBackground(new java.awt.Color(102, 102, 102));
		pnlmenu.setPreferredSize(new java.awt.Dimension(1200, 56));
		pnlmenu.setRequestFocusEnabled(false);
		pnlmenu.setVerifyInputWhenFocusTarget(false);

		javax.swing.GroupLayout pnlmenuLayout = new javax.swing.GroupLayout(pnlmenu);
		pnlmenu.setLayout(pnlmenuLayout);
		pnlmenuLayout.setHorizontalGroup(pnlmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 1200, Short.MAX_VALUE));
		pnlmenuLayout.setVerticalGroup(pnlmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 56, Short.MAX_VALUE));

		pnlmain.setPreferredSize(new java.awt.Dimension(1200, 644));

		lblmasanpham.setText("Mã sản phẩm :");
		lblmasanpham.setPreferredSize(new java.awt.Dimension(100, 25));

		txtmasanpham.setPreferredSize(new java.awt.Dimension(200, 25));

		lbltensanpham.setText("Tên sản phẩm :");
		lbltensanpham.setPreferredSize(new java.awt.Dimension(100, 25));

		txttensanpham.setPreferredSize(new java.awt.Dimension(200, 25));

		btnxoatrang.setText("Xóa trắng");
		btnxoatrang.setPreferredSize(new java.awt.Dimension(100, 25));
		btnxoatrang.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnxoatrangActionPerformed(evt);
			}
		});

		btntaosanpham.setText("Tạo hóa đơn");
		btntaosanpham.setPreferredSize(new java.awt.Dimension(100, 25));
		btntaosanpham.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btntaosanphamActionPerformed(evt);
			}
		});

		lbldongia.setText("Đơn giá :");
		lbldongia.setPreferredSize(new java.awt.Dimension(100, 25));

		txtdongia.setPreferredSize(new java.awt.Dimension(200, 25));

		lblsoluong.setText("Số lượng :");
		lblsoluong.setPreferredSize(new java.awt.Dimension(100, 25));

		txtsoluong.setPreferredSize(new java.awt.Dimension(200, 25));

		btnxoasanpham.setText("Xóa hóa đơn");
		btnxoasanpham.setPreferredSize(new java.awt.Dimension(100, 25));

		btnsuasanpham.setText("Xuất hóa đơn");
		btnsuasanpham.setPreferredSize(new java.awt.Dimension(100, 25));

		table.setModel(
				new javax.swing.table.DefaultTableModel(
						new Object[][] { { null, null, null, null }, { null, null, null, null },
								{ null, null, null, null }, { null, null, null, null } },
						new String[] { "ID", "TÊN SẢN PHẨM", "ĐƠN GIÁ", "SỐ LƯỢNG" }) {
					boolean[] canEdit = new boolean[] { false, false, true, true };

					public boolean isCellEditable(int rowIndex, int columnIndex) {
						return canEdit[columnIndex];
					}
				});
		table.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
			}
		});
		jScrollPane1.setViewportView(table);
		// load data
		loadData();
		// click row table
		table.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				int row = table.getSelectedRow();
				txtmasanpham.setText(table.getValueAt(row, 0).toString());
				txttensanpham.setText(table.getValueAt(row, 1).toString());
				txtdongia.setText(formatMonney(formatStringToMonney(table.getValueAt(row, 2).toString())));
				txtsoluong.setText(table.getValueAt(row, 3).toString());
			}
		});

		txttimkiem.setPreferredSize(new java.awt.Dimension(64, 25));

		btntimkiem.setText("Tìm");
		btntimkiem.setPreferredSize(new java.awt.Dimension(100, 25));

		cmbsapxep.setModel(new javax.swing.DefaultComboBoxModel<>(
				new String[] { "Sắp xếp theo tên sản phẩm", "Sắp xếp theo đơn giá", "Sắp xếp theo số lượng" }));
		cmbsapxep.setPreferredSize(new java.awt.Dimension(178, 25));

		javax.swing.GroupLayout pnlmainLayout = new javax.swing.GroupLayout(pnlmain);
		pnlmain.setLayout(pnlmainLayout);
		pnlmainLayout.setHorizontalGroup(pnlmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(pnlmainLayout.createSequentialGroup().addGap(53, 53, 53).addGroup(pnlmainLayout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
						.addGroup(pnlmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(cmbsapxep, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGroup(pnlmainLayout.createSequentialGroup()
										.addGroup(pnlmainLayout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
												.addComponent(lbldongia, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(lblmasanpham, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(pnlmainLayout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
												.addComponent(txtmasanpham, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(txtdongia, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
										.addGap(135, 135, 135)
										.addGroup(pnlmainLayout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
												.addComponent(lbltensanpham, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(lblsoluong, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(pnlmainLayout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
												.addComponent(txttensanpham, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(txtsoluong, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
										.addGap(135, 135, 135)
										.addGroup(pnlmainLayout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
												.addComponent(btnxoatrang, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(btnxoasanpham, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(pnlmainLayout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
												.addComponent(btntaosanpham, javax.swing.GroupLayout.DEFAULT_SIZE, 101,
														Short.MAX_VALUE)
												.addComponent(btnsuasanpham, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
						.addGroup(pnlmainLayout.createSequentialGroup()
								.addComponent(txttimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 176,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(btntimkiem, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addComponent(jScrollPane1))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		pnlmainLayout.setVerticalGroup(pnlmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(pnlmainLayout.createSequentialGroup().addGap(20, 20, 20)
						.addGroup(pnlmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(lblmasanpham, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(txtmasanpham, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(lbltensanpham, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(txttensanpham, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(btnxoatrang, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(btntaosanpham, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(pnlmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(lbldongia, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(txtdongia, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(lblsoluong, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(txtsoluong, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(btnxoasanpham, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(btnsuasanpham, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(44, 44, 44)
						.addGroup(pnlmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(txttimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(btntimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(cmbsapxep, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jScrollPane1,
								javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(36, Short.MAX_VALUE)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(pnlmenu, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(0, 0, Short.MAX_VALUE))
				.addComponent(pnlmain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(pnlmenu, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(pnlmain,
								javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.PREFERRED_SIZE)));

		pack();
		setLocationRelativeTo(null);
	}// </editor-fold>

	private void btnxoatrangActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		txtmasanpham.setText("");
		txttensanpham.setText("");
		txtdongia.setText("");
		txtsoluong.setText("");
		txttensanpham.requestFocus();
	}

	private void btntaosanphamActionPerformed(java.awt.event.ActionEvent evt) {
		String tensanpham = txttensanpham.getText();
		String dongia = txtdongia.getText();
		String soluong = txtsoluong.getText();
		if (tensanpham.equals("") || dongia.equals("") || soluong.equals("")) {
			JOptionPane.showMessageDialog(null, "Vui lòng nhập đầy đủ thông tin");
		} else {
			try {
				sanphamservice.add(new SanPham(tensanpham, Integer.parseInt(dongia), Integer.parseInt(soluong)));
				JOptionPane.showMessageDialog(null, "Thêm thành công");
				loadData();
				txtmasanpham.setText("");
				txttensanpham.setText("");
				txtdongia.setText("");
				txtsoluong.setText("");
				txttensanpham.requestFocus();
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Thêm thất bại");
			}
		}
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(UISanpham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(UISanpham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(UISanpham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(UISanpham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new UISanpham().setVisible(true);
			}
		});
	}

	private void loadData() {
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.setRowCount(0);
		for (SanPham sanPham : sanphamservice.getDanhsach()) {
			// fortmat string to mon
			model.addRow(new Object[] { sanPham.getMasanpham(), sanPham.getTensanpham(), formatMonney(sanPham.getGia()),
					sanPham.getSoluong() });
		}
		table.setModel(model);
	}

	public String formatMonney(double money) {
		DecimalFormat df = new DecimalFormat("###,###,###");
		return df.format(money);
	}

	// format string to monney
	public double formatStringToMonney(String money) {
		String[] arr = money.split(",");
		String result = "";
		for (String string : arr) {
			result += string;
		}
		return Double.parseDouble(result);
	}

	// Variables declaration - do not modify
	private javax.swing.JButton btntaosanpham;
	private javax.swing.JButton btntimkiem;
	private javax.swing.JButton btnxoasanpham;
	private javax.swing.JButton btnxoatrang;
	private javax.swing.JButton btnsuasanpham;
	private javax.swing.JComboBox<String> cmbsapxep;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JLabel lbldongia;
	private javax.swing.JLabel lblmasanpham;
	private javax.swing.JLabel lblsoluong;
	private javax.swing.JLabel lbltensanpham;
	private javax.swing.JPanel pnlmain;
	private javax.swing.JTable table;
	private javax.swing.JTextField txtdongia;
	private javax.swing.JTextField txtmasanpham;
	private javax.swing.JTextField txtsoluong;
	private javax.swing.JTextField txttensanpham;
	private javax.swing.JTextField txttimkiem;
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
