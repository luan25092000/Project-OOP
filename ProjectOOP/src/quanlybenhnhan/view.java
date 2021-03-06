package quanlybenhnhan;

//Import libraries
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


import javax.swing.table.DefaultTableModel;



import java.awt.event.ActionEvent;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.GroupLayout;
import javax.swing.JOptionPane;
import javax.swing.JTable;

import java.awt.BorderLayout;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
@SuppressWarnings("serial")
public class view extends javax.swing.JFrame {

    /**
     * Creates new form view
     */
    public view() {
        initComponents();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings({ })
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
    	final DefaultTableModel model;
        buttonGroup1 = new javax.swing.ButtonGroup();
        new javax.swing.JSplitPane();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaGuess = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtNote = new javax.swing.JTextArea();
        dateEntry = new com.toedter.calendar.JDateChooser();
        dateExit = new com.toedter.calendar.JDateChooser();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        txtfullName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        txtBHYT = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        birthday = new com.toedter.calendar.JDateChooser();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jTable1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane(jTable1);
        
        jTable1.setBackground(SystemColor.activeCaption);
        jTable1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        
        jPanel8.add(jScrollPane3, BorderLayout.CENTER);
        jButton6 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        model = new DefaultTableModel();
        setResizable(false);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        ImageIcon image = new ImageIcon("favicon.png");
        setIconImage(image.getImage());
        setTitle("QUẢN LÝ THÔNG TIN NGƯỜI BỆNH");
        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        jLabel12.setBackground(new java.awt.Color(204, 204, 204));
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 102, 255));
        jLabel12.setText("Thông tin điều trị");

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel3.setPreferredSize(new java.awt.Dimension(630, 179));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel4.setText("Ngày vào viện");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel7.setText("Chẩn đoán");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel6.setText("Ghi chú");

        txtAreaGuess.setColumns(20);
        txtAreaGuess.setRows(5);
        jScrollPane1.setViewportView(txtAreaGuess);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel5.setText("Ngày ra viện");

        txtNote.setColumns(20);
        txtNote.setRows(5);
        jScrollPane2.setViewportView(txtNote);

        dateEntry.setDateFormatString("dd/MM/yyyy");

        dateExit.setDateFormatString("dd/MM/yyyy");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE)
                            .addComponent(jScrollPane2)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateEntry, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateExit, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(dateEntry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 102, 255));
        jLabel11.setText("Hồ sơ");

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel1.setText("Mã bệnh nhân");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel2.setText("Họ và tên");


        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel8.setText("Giới tính");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel9.setText("Ngày sinh");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel3.setText("Địa chỉ");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel10.setText("Mã BHYT");

        birthday.setDateFormatString("dd/MM/yyyy");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2Layout.setHorizontalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jLabel3)
        				.addComponent(jLabel10)
        				.addComponent(jLabel1)
        				.addComponent(jLabel2))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addComponent(txtfullName, GroupLayout.PREFERRED_SIZE, 255, GroupLayout.PREFERRED_SIZE)
        					.addGap(33)
        					.addComponent(jLabel9)
        					.addGap(18)
        					.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(jPanel2Layout.createSequentialGroup()
        							.addComponent(male)
        							.addGap(18)
        							.addComponent(female))
        						.addComponent(birthday, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)))
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addComponent(txtId, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
        					.addGap(195)
        					.addComponent(jLabel8))
        				.addComponent(txtAddress, GroupLayout.PREFERRED_SIZE, 375, GroupLayout.PREFERRED_SIZE)
        				.addComponent(txtBHYT, GroupLayout.PREFERRED_SIZE, 255, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addContainerGap(13, Short.MAX_VALUE)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jLabel1)
        						.addComponent(txtId, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel8)
        						.addComponent(male)
        						.addComponent(female))
        					.addGap(9)
        					.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(txtfullName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel2)
        						.addComponent(jLabel9)))
        				.addComponent(birthday, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(13)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel3)
        				.addComponent(txtAddress, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(14)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jLabel10)
        				.addComponent(txtBHYT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(25))
        );
        jPanel2.setLayout(jPanel2Layout);

        txtId.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        
        JButton jButton5 = new JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        		.addComponent(jPanel5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        		.addComponent(jPanel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap(429, Short.MAX_VALUE)
        			.addComponent(jButton5)
        			.addGap(18)
        			.addComponent(jButton4)
        			.addGap(18)
        			.addComponent(jButton3)
        			.addGap(17))
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGap(11)
        			.addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jPanel5, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.CENTER)
        				.addComponent(jButton5)
        				.addComponent(jButton4)
        				.addComponent(jButton3))
        			.addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel1.setLayout(jPanel1Layout);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Bệnh án", jPanel7);
        Object[] column = {"Mã bệnh nhân", "Mã BHYT", "Họ và tên", "Giới tính", "Ngày sinh", "Địa chỉ", "Ngày vào viện", "Ngày ra viện", "Chẩn đoán", "Ghi chú"};
        final Object[] row = new Object[10];
        model.setColumnIdentifiers(column);
        jTable1.setModel(model);
        jTable1.setPreferredSize(new java.awt.Dimension(825, 176));
        jScrollPane3.setViewportView(jTable1);
        
        //Sex
        buttonGroup1.add(male);
        male.setText("Nam");
       

        buttonGroup1.add(female);
        female.setText("Nữ");
        
        //Save
        jButton3.setText("Save");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	SimpleDateFormat dFormat = new SimpleDateFormat("dd-MM-yyyy");
            	if(txtId.getText().equals("")||txtBHYT.getText().equals("")||txtfullName.getText().equals("")||male.getText().equals("")||female.getText().equals("")) {
            		JOptionPane.showMessageDialog(null, "Please fill out information of patient !");
            	}
            	else {
                	row[0] = txtId.getText();
                	row[1] = txtBHYT.getText();
                	row[2] = txtfullName.getText();
                	row[3] = male.isSelected() ? male.getText():female.getText();
                	row[4] = dFormat.format(birthday.getDate());
                	row[5] = txtAddress.getText();
                	row[6] = dFormat.format(dateEntry.getDate());
                	row[7] = dFormat.format(dateExit.getDate());
                	row[8] = txtAreaGuess.getText();
                	row[9] = txtNote.getText();
                    model.addRow(row);
                    JOptionPane.showMessageDialog(null, "Add patient successfully !");
                    txtId.setText("");
                	txtBHYT.setText("");
                	txtfullName.setText("");
                	birthday.setDate(null);
                	txtAddress.setText("");
                	dateEntry.setDate(null);
                	dateExit.setDate(null);
                	txtAreaGuess.setText("");
                	txtNote.setText("");
            	}
     
            }
        });
        
        //Clear
        jButton4.setText("Clear");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	int isConfirm = JOptionPane.showConfirmDialog(null, "Do you want to reset ?");
            	if(isConfirm==0) {
            		txtId.setText("");
                	txtBHYT.setText("");
                	txtfullName.setText("");
                	birthday.setDate(null);
                	txtAddress.setText("");
                	dateEntry.setDate(null);
                	dateExit.setDate(null);
                	txtAreaGuess.setText("");
                	txtNote.setText("");
            	}
            }
        });
        jTable1.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		int index = jTable1.getSelectedRow();
        		Date txtBirthday;
        		Date txtDateEntry;
        		Date txtDateExit;
				try {
					txtBirthday = new SimpleDateFormat("dd-MM-yyyy").parse((String)model.getValueAt(index, 4).toString());
					birthday.setDate(txtBirthday);
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					txtDateEntry = new SimpleDateFormat("dd-MM-yyyy").parse((String)model.getValueAt(index, 6).toString());
					dateEntry.setDate(txtDateEntry);
				} catch (ParseException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				try {
					txtDateExit = new SimpleDateFormat("dd-MM-yyyy").parse((String)model.getValueAt(index, 7).toString());
					dateExit.setDate(txtDateExit);
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
        		txtId.setText(model.getValueAt(index, 0).toString());
        		txtBHYT.setText(model.getValueAt(index, 1).toString());
        		txtfullName.setText(model.getValueAt(index, 2).toString());
        		txtAddress.setText(model.getValueAt(index, 5).toString());
        		txtAreaGuess.setText(model.getValueAt(index, 8).toString());
        		txtNote.setText(model.getValueAt(index, 9).toString());
        	}
        });
        //Delete
        jButton6.setText("Delete");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	int isConfirm = JOptionPane.showConfirmDialog(null, "Do you want to delete this patient ?");
            	int index = jTable1.getSelectedRow();
            	if(isConfirm==0) {
            		if(index >= 0) {
                		model.removeRow(jTable1.getSelectedRow());
                    	JOptionPane.showMessageDialog(null, "Deleted successfully");
                	}else {
                		JOptionPane.showMessageDialog(null, "Please select row to delete");
                	}
            	}
            }
        });
        //Update
        jButton5.setText("Update");
        jButton5.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		SimpleDateFormat dFormat = new SimpleDateFormat("dd-MM-yyyy");
        		int index = jTable1.getSelectedRow();
        		model.setValueAt(txtId.getText(), index, 0);
        		model.setValueAt(txtBHYT.getText(), index, 1);
        		model.setValueAt(txtfullName.getText(), index, 2);
        		model.setValueAt(male.isSelected() ? male.getText():female.getText(), index, 3);
        		model.setValueAt(dFormat.format(birthday.getDate()), index, 4);
        		model.setValueAt(txtAddress.getText(), index, 5);
        		model.setValueAt(dFormat.format(dateEntry.getDate()), index, 6);
        		model.setValueAt(dFormat.format(dateExit.getDate()), index, 7);
        		model.setValueAt(txtAreaGuess.getText(), index, 8);
        		model.setValueAt(txtNote.getText(), index, 9);
        		JOptionPane.showMessageDialog(null, "Updated successfully !");
        	}
        });
        //Import
        JButton btnNewButton = new JButton("Import");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		  String filePath = "D:\\file.txt";
        	      File file = new File(filePath);
        	      if(file.exists() && !file.isDirectory()) { 
        	    	  int isConfirm = JOptionPane.showConfirmDialog(null, "Do you want to import file ?");
            	      try {
            	    	if(isConfirm==0) {
            	    		BufferedReader br = new BufferedReader(new FileReader(file));
            	            
            	            // get lines from txt file
            	            Object[] tableLines = br.lines().toArray();
            	            
            	            // extratct data from lines
            	            // set data to jtable model
            	            for(int i = 0; i < tableLines.length; i++)
            	            {
            	                String line = tableLines[i].toString().trim();
            	                String[] dataRow = line.split(" ");
            	                model.addRow(dataRow);
            	            }
            	            JOptionPane.showMessageDialog(null, "Import file successfully!");
            	    	}
    				}catch (IOException e1) {
    					// TODO Auto-generated catch block
    					e1.printStackTrace();
    				}
      			  }else {
      				  JOptionPane.showMessageDialog(null, "File does not exist !");
      			  }
        	}
        });
        //Export
        btnNewButton_1 = new JButton("Export");
        btnNewButton_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		String filePath = "D:\\file.txt";
        		File file = new File(filePath);
        		try {
					FileWriter fw = new FileWriter(file);
					BufferedWriter bw = new BufferedWriter(fw);
					int index = jTable1.getSelectedRow();
					if(index != -1) {
						for(int j = 0; j < jTable1.getColumnCount(); j++) //collumns
	    	            {
	    	                bw.write(jTable1.getValueAt(index, j).toString()+" ");
	    	            }
						JOptionPane.showMessageDialog(null, "Export file successfully!");
						bw.close();
						fw.close();
					}else {
						JOptionPane.showMessageDialog(null, "You must choose patient to export file!");
					}
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
        	}
        });
        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8Layout.setHorizontalGroup(
        	jPanel8Layout.createParallelGroup(Alignment.TRAILING)
        		.addComponent(jScrollPane3, GroupLayout.DEFAULT_SIZE, 663, Short.MAX_VALUE)
        		.addGroup(jPanel8Layout.createSequentialGroup()
        			.addContainerGap(182, Short.MAX_VALUE)
        			.addComponent(jButton6)
        			.addGap(18)
        			.addComponent(btnNewButton)
        			.addGap(18)
        			.addComponent(btnNewButton_1)
        			.addGap(228))
        );
        jPanel8Layout.setVerticalGroup(
        	jPanel8Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel8Layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jScrollPane3, GroupLayout.PREFERRED_SIZE, 431, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(jPanel8Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jButton6)
        				.addComponent(btnNewButton)
        				.addComponent(btnNewButton_1))
        			.addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel8.setLayout(jPanel8Layout);

        jTabbedPane2.addTab("Danh sách", jPanel8);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText(" THÔNG TIN NGƯỜI BỆNH ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(219, 219, 219))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel13.getAccessibleContext().setAccessibleDescription("");

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    

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
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new view().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private com.toedter.calendar.JDateChooser birthday;
    private com.toedter.calendar.JDateChooser dateEntry;
    private com.toedter.calendar.JDateChooser dateExit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JRadioButton male;
    private javax.swing.JRadioButton female;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea txtAreaGuess;
    private javax.swing.JTextArea txtNote;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtBHYT;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtfullName;
    private JButton btnNewButton_1;
}
