package ui;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Image;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import entites.HoaDon;
import entites.KhachHang;
import ravenTable.TableActionCellEditor;
import ravenTable.TableActionCellRender;
import ravenTable.TableActionEvent;
import service.ChiTietHoaDonService;
import service.HoaDonService;
import service.KhachHangService;

public class UIHoadon extends JFrame {
	private List<JButton> buttons = new ArrayList<>();
	private HoaDonService hoaDonService = new HoaDonService();
	private ChiTietHoaDonService chiTietHoaDonService = new ChiTietHoaDonService();
	private KhachHangService khachHangService = new KhachHangService();
	private DefaultTableModel tableModel;
	private String[] columns = { "Mã hóa đơn", "Tên khách hàng", "Ngày lập", "Tổng tiền", "Trạng thái", "Action" };

	/**
	 * Creates new form UIHoadon
	 */
	public UIHoadon() {
		pnlmenu = new javax.swing.JPanel();
		pnlmenu.setBackground(new java.awt.Color(102, 102, 102));
		Menu();
		initComponents();
		FocusMenuButton();
		TableActionEvent event = new TableActionEvent() {
			@Override
			public void onEdit(int row) {
				System.out.println("Edit" + row);
			}

			@Override
			public void onDelere(int row) {
				if (table.isEditing()) {
					table.getCellEditor().stopCellEditing();
				}
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.removeRow(row);
			}

			@Override
			public void onView(int row) {
				System.out.println("view" + row);
			}
		};
		table.getColumnModel().getColumn(5).setCellRenderer(new TableActionCellRender());
		table.getColumnModel().getColumn(5).setCellEditor(new TableActionCellEditor(event));
	}

	private void FocusMenuButton() {
		menuhoadon.setBackground(Color.red);
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
		// pnlmain = new javax.swing.JPanel();
		// cmbtimkiem = new javax.swing.JComboBox<>();
		// txttimkiem = new javax.swing.JTextField();
		// jButton1 = new javax.swing.JButton();
		// btntaohoadon = new javax.swing.JButton();
		// btnxemhoadon = new javax.swing.JButton();
		// btnxuathoadon = new javax.swing.JButton();
		// jScrollPane1 = new javax.swing.JScrollPane();
		// table = new javax.swing.JTable();
		// cmbsapxep = new javax.swing.JComboBox<>();

		// setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		// setResizable(false);

		// pnlmenu.setBackground(new java.awt.Color(102, 102, 102));

		// pnlmain.setPreferredSize(new java.awt.Dimension(1200, 644));
		// pnlmain.setRequestFocusEnabled(false);
		// pnlmain.setVerifyInputWhenFocusTarget(false);

		// cmbtimkiem.setModel(new javax.swing.DefaultComboBoxModel<>(
		// new String[] { "Tìm kiếm theo tên khách hàng", "Tìm kiếm theo ngày bán" }));
		// cmbtimkiem.addActionListener(new java.awt.event.ActionListener() {
		// public void actionPerformed(java.awt.event.ActionEvent evt) {
		// cmbtimkiemActionPerformed(evt);
		// }
		// });

		// btntaohoadon.addActionListener(new java.awt.event.ActionListener() {
		// public void actionPerformed(java.awt.event.ActionEvent evt) {
		// ModelCreateHoaDon modelCreateHoaDon = new ModelCreateHoaDon(null);
		// modelCreateHoaDon.setVisible(true);
		// }
		// });

		// jButton1.setText("Tìm");

		// btntaohoadon.setText("Tạo hóa đơn");

		// btnxemhoadon.setText("Xem hóa đơn");

		// btnxuathoadon.setText("Xuất hóa đơn");
		// tableModel = new javax.swing.table.DefaultTableModel(
		// new String[] { "MÃ HÓA ĐƠN", "KHÁCH HÀNG", "NGÀY LẬP HÓA ĐƠN", "TỔNG TIỀN",
		// "THANH TOÁN", "ACTION" },0) {
		// Class[] types = new Class[] { java.lang.Object.class, java.lang.Object.class,
		// java.lang.Object.class,
		// java.lang.Object.class, java.lang.Boolean.class, java.lang.Object.class };
		// boolean[] canEdit = new boolean[] { false, false, false, false, false, true
		// };

		// public Class getColumnClass(int columnIndex) {
		// return types[columnIndex];
		// }

		// public boolean isCellEditable(int rowIndex, int columnIndex) {
		// return canEdit[columnIndex];
		// }
		// };

		// table.setModel(tableModel);
		// loadDataTable();
		// table.setRowHeight(40);
		// jScrollPane1.setViewportView(table);

		// cmbsapxep.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sắp
		// xếp theo tên khách hàng",
		// "Sắp xếp theo ngày bán ", "Sắp xếp theo tổng tiền", "Sắp xếp theo trạng thái
		// thanh toán" }));

		// javax.swing.GroupLayout pnlmainLayout = new javax.swing.GroupLayout(pnlmain);
		// pnlmain.setLayout(pnlmainLayout);
		// pnlmainLayout.setHorizontalGroup(pnlmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		// .addGroup(pnlmainLayout.createSequentialGroup().addGap(20, 20,
		// 20).addGroup(pnlmainLayout
		// .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
		// .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1160,
		// javax.swing.GroupLayout.PREFERRED_SIZE)
		// .addGroup(pnlmainLayout.createSequentialGroup()
		// .addComponent(cmbtimkiem, javax.swing.GroupLayout.PREFERRED_SIZE,
		// javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		// .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		// .addComponent(txttimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 250,
		// javax.swing.GroupLayout.PREFERRED_SIZE)
		// .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		// .addComponent(jButton1).addGap(68, 68, 68).addComponent(btntaohoadon)
		// .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		// .addComponent(btnxemhoadon)
		// .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		// .addComponent(btnxuathoadon)
		// .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
		// javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		// .addComponent(cmbsapxep, javax.swing.GroupLayout.PREFERRED_SIZE,
		// javax.swing.GroupLayout.DEFAULT_SIZE,
		// javax.swing.GroupLayout.PREFERRED_SIZE)))
		// .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		// pnlmainLayout.setVerticalGroup(pnlmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		// .addGroup(pnlmainLayout.createSequentialGroup().addGap(14, 14, 14)
		// .addGroup(pnlmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
		// .addComponent(cmbtimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 25,
		// javax.swing.GroupLayout.PREFERRED_SIZE)
		// .addComponent(txttimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 25,
		// javax.swing.GroupLayout.PREFERRED_SIZE)
		// .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 25,
		// javax.swing.GroupLayout.PREFERRED_SIZE)
		// .addComponent(btntaohoadon, javax.swing.GroupLayout.PREFERRED_SIZE, 25,
		// javax.swing.GroupLayout.PREFERRED_SIZE)
		// .addComponent(btnxemhoadon, javax.swing.GroupLayout.PREFERRED_SIZE, 25,
		// javax.swing.GroupLayout.PREFERRED_SIZE)
		// .addComponent(btnxuathoadon, javax.swing.GroupLayout.PREFERRED_SIZE, 25,
		// javax.swing.GroupLayout.PREFERRED_SIZE)
		// .addComponent(cmbsapxep, javax.swing.GroupLayout.PREFERRED_SIZE,
		// javax.swing.GroupLayout.DEFAULT_SIZE,
		// javax.swing.GroupLayout.PREFERRED_SIZE))
		// .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jScrollPane1,
		// javax.swing.GroupLayout.PREFERRED_SIZE, 579,
		// javax.swing.GroupLayout.PREFERRED_SIZE)
		// .addContainerGap(20, Short.MAX_VALUE)));

		// javax.swing.GroupLayout layout = new
		// javax.swing.GroupLayout(getContentPane());
		// getContentPane().setLayout(layout);
		// layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		// .addComponent(pnlmenu, javax.swing.GroupLayout.DEFAULT_SIZE,
		// javax.swing.GroupLayout.DEFAULT_SIZE,
		// javax.swing.GroupLayout.PREFERRED_SIZE)
		// .addComponent(pnlmain, javax.swing.GroupLayout.DEFAULT_SIZE,
		// javax.swing.GroupLayout.DEFAULT_SIZE,
		// javax.swing.GroupLayout.PREFERRED_SIZE));
		// layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		// .addGroup(layout.createSequentialGroup()
		// .addComponent(pnlmenu, javax.swing.GroupLayout.PREFERRED_SIZE,
		// javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		// .addGap(0, 0, 0).addComponent(pnlmain, javax.swing.GroupLayout.DEFAULT_SIZE,
		// javax.swing.GroupLayout.DEFAULT_SIZE,
		// javax.swing.GroupLayout.PREFERRED_SIZE)));

		// pack();
		// setLocationRelativeTo(null);
		pnlmenu = new javax.swing.JPanel();
		pnlmain = new javax.swing.JPanel();
		cmbtimkiem = new javax.swing.JComboBox<>();
		txttimkiem = new javax.swing.JTextField();
		jButton1 = new javax.swing.JButton();
		btntaohoadon = new javax.swing.JButton();
		btnxemhoadon = new javax.swing.JButton();
		btnxuathoadon = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		table = new javax.swing.JTable();
		cmbsapxep = new javax.swing.JComboBox<>();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setResizable(false);

		pnlmenu.setBackground(new java.awt.Color(102, 102, 102));
		pnlmenu.setPreferredSize(new java.awt.Dimension(1200, 56));

		javax.swing.GroupLayout pnlmenuLayout = new javax.swing.GroupLayout(pnlmenu);
		pnlmenu.setLayout(pnlmenuLayout);
		pnlmenuLayout.setHorizontalGroup(pnlmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 1200, Short.MAX_VALUE));
		pnlmenuLayout.setVerticalGroup(pnlmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 56, Short.MAX_VALUE));

		pnlmain.setPreferredSize(new java.awt.Dimension(1200, 644));
		pnlmain.setRequestFocusEnabled(false);
		pnlmain.setVerifyInputWhenFocusTarget(false);

		cmbtimkiem.setModel(new javax.swing.DefaultComboBoxModel<>(
				new String[] { "Tìm kiếm theo tên khách hàng", "Tìm kiếm theo ngày bán" }));
		cmbtimkiem.setPreferredSize(new java.awt.Dimension(193, 25));
		cmbtimkiem.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				cmbtimkiemActionPerformed(evt);
			}
		});

		txttimkiem.setPreferredSize(new java.awt.Dimension(64, 25));

		jButton1.setText("Tìm");

		btntaohoadon.setText("Tạo hóa đơn");
		btntaohoadon.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btntaohoadonActionPerformed(evt);
			}
		});

		btnxemhoadon.setText("Xem hóa đơn");

		btnxuathoadon.setText("Xuất hóa đơn");

		tableModel = new javax.swing.table.DefaultTableModel(columns, 0) {
			Class[] types = new Class[] { java.lang.Object.class, java.lang.Object.class, java.lang.Object.class,
					java.lang.Object.class, java.lang.Boolean.class, java.lang.Object.class };
			boolean[] canEdit = new boolean[] { false, false, false, false, false, true };

			public Class getColumnClass(int columnIndex) {
				return types[columnIndex];
			}

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		};

		table.setModel(tableModel);
		table.setRowHeight(35);
		// canh giua cac cot
		DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
		centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
		table.getColumnModel().getColumn(4).setHeaderRenderer(centerRenderer);
		table.getColumnModel().getColumn(5).setHeaderRenderer(centerRenderer);

		loadDataTable();
		jScrollPane1.setViewportView(table);

		cmbsapxep.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sắp xếp theo tên khách hàng",
				"Sắp xếp theo ngày bán ", "Sắp xếp theo tổng tiền", "Sắp xếp theo trạng thái thanh toán" }));

		javax.swing.GroupLayout pnlmainLayout = new javax.swing.GroupLayout(pnlmain);
		pnlmain.setLayout(pnlmainLayout);
		pnlmainLayout.setHorizontalGroup(pnlmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(pnlmainLayout.createSequentialGroup().addGap(20, 20, 20).addGroup(pnlmainLayout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
						.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1160,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGroup(pnlmainLayout.createSequentialGroup()
								.addComponent(cmbtimkiem, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(txttimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 250,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jButton1).addGap(68, 68, 68).addComponent(btntaohoadon)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(btnxemhoadon)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(btnxuathoadon)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(cmbsapxep, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(20, Short.MAX_VALUE)));
		pnlmainLayout.setVerticalGroup(pnlmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(pnlmainLayout.createSequentialGroup().addGap(33, 33, 33)
						.addGroup(pnlmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(cmbtimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(txttimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(btntaohoadon, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(btnxemhoadon, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(btnxuathoadon, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(cmbsapxep, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jScrollPane1,
								javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(20, Short.MAX_VALUE)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(pnlmenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.PREFERRED_SIZE)
				.addComponent(pnlmain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.PREFERRED_SIZE));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(pnlmenu, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(pnlmain,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)));

		pack();
		setLocationRelativeTo(null);
	}// </editor-fold>

	private void cmbtimkiemActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void btntaohoadonActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		ModelCreateHoaDon modelCreateHoaDon = new ModelCreateHoaDon(null);
		modelCreateHoaDon.setVisible(true);
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
			java.util.logging.Logger.getLogger(UIHoadon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(UIHoadon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(UIHoadon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(UIHoadon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new UIHoadon().setVisible(true);
			}
		});
	}

	private void loadDataTable() {
		for (HoaDon hd : hoaDonService.getDanhsach()) {
			String mahoadon = String.valueOf(hd.getMahoadon());
			String tenkhachhang = "";
			for (KhachHang kh : khachHangService.getDanhsach()) {
				if (hd.getKhachHang().getMakhachhang() == kh.getMakhachhang()) {
					tenkhachhang = kh.getTenkhachhang();
				}
			}
			String ngaylap = hd.getNgaylaphoadon().toString();
			double tongtien = hd.tongTien();
			boolean trangthai = hd.isTrangthaithanhtoan();

			Object[] row = { mahoadon, tenkhachhang, ngaylap, formatMonney(tongtien), trangthai };
			tableModel.addRow(row);
		}
		table.setModel(tableModel);
		table.updateUI();
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
	private javax.swing.JButton btntaohoadon;
	private javax.swing.JButton btnxemhoadon;
	private javax.swing.JButton btnxuathoadon;
	private javax.swing.JComboBox<String> cmbsapxep;
	private javax.swing.JComboBox<String> cmbtimkiem;
	private javax.swing.JButton jButton1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JPanel pnlmain;
	private javax.swing.JTable table;
	private javax.swing.JTextField txttimkiem;
	private JProgressBar progressBar;
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
