package ui;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import dao.TaiKhoanDao;
import dao.impl.TaiKhoanDaoImpl;
import entites.TaiKhoan;

public class Login extends JFrame {
	public Login() {

		setTitle("Đăng nhập");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		initComponents();
	}

	private void xoaRong() {
		txtusername.setText("");
		txtpassword.setText("");
		txtusername.requestFocus();
	}

	private void fun_Login() {
		String usernameval = txtusername.getText().trim();
		String passwordval = txtpassword.getText().trim();
		TaiKhoan taiKhoan = taiKhoanDao.findByUsername(usernameval);
		if (taiKhoan != null) {
			if (taiKhoan.getPassword().equals(passwordval)) {
				JOptionPane.showMessageDialog(null, "Login success", "Success", JOptionPane.INFORMATION_MESSAGE);
				this.dispose();
				new UITrangchu().setVisible(true);
			} else {
				JOptionPane.showMessageDialog(null, "Password is not correct", "Error", JOptionPane.ERROR_MESSAGE);
				xoaRong();
			}
		} else {
			JOptionPane.showMessageDialog(null, "Account is not exist", "Error", JOptionPane.ERROR_MESSAGE);
			xoaRong();
		}
	}

	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		txtusername = new javax.swing.JTextField();
		txtpassword = new javax.swing.JPasswordField();
		btnlogin = new javax.swing.JButton();
		btncencel = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
		jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel1.setText("Đăng nhập");

		jLabel2.setText("Username:");

		jLabel3.setText("Password:");

		txtpassword.setToolTipText("");

		btnlogin.setBackground(new java.awt.Color(102, 255, 0));
		btnlogin.setText("Login");
		btnlogin.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				fun_Login();
			}
		});

		btncencel.setBackground(new java.awt.Color(255, 102, 51));
		btncencel.setText("Cencel");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		txtpassword.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					fun_Login();
				}
			}
		});

		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup()
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup().addGap(140, 140, 140).addComponent(jLabel1,
								javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(layout.createSequentialGroup().addGap(50, 50, 50)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(layout.createSequentialGroup()
												.addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(
														txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, 150,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(layout.createSequentialGroup().addComponent(
												jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
												javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addGroup(layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(layout.createSequentialGroup().addComponent(
																btncencel, javax.swing.GroupLayout.PREFERRED_SIZE, 68,
																javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																.addComponent(btnlogin,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 70,
																		javax.swing.GroupLayout.PREFERRED_SIZE))
														.addComponent(txtpassword,
																javax.swing.GroupLayout.PREFERRED_SIZE, 150,
																javax.swing.GroupLayout.PREFERRED_SIZE))))))
				.addContainerGap(50, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(20, 20, 20)
						.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(btncencel, javax.swing.GroupLayout.PREFERRED_SIZE, 25,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(btnlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 25,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap(20, Short.MAX_VALUE)));

		pack();
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Login().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify
	private javax.swing.JButton btncencel;
	private javax.swing.JButton btnlogin;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JPasswordField txtpassword;
	private javax.swing.JTextField txtusername;
	private TaiKhoanDao taiKhoanDao = new TaiKhoanDaoImpl();
	// End of variables declaration
}
