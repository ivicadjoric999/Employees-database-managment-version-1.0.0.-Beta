/**
 *
 * @author Ivica Djoric
 */
package Aplikacija;

import Kontroler.NewHibernateUtil;
import java.util.List;
import java.util.Vector;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import database.podaci;
import javax.swing.JOptionPane;

public class Zaposleni extends javax.swing.JFrame {

    public DefaultTableModel model;

    public Zaposleni() {
        initComponents();
        setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RadioButtonGroup = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_zaposlenih = new javax.swing.JTable();
        jToolBar1 = new javax.swing.JToolBar();
        rb_svi_zaposleni = new javax.swing.JRadioButton();
        rb_novi_zaposleni = new javax.swing.JRadioButton();
        rb_promena_podataka = new javax.swing.JRadioButton();
        rb_brisanje_zaposlenog = new javax.swing.JRadioButton();
        jPanel_svi_zaposleni = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tf_id = new javax.swing.JTextField();
        tf_year = new javax.swing.JTextField();
        tf_name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tf_address = new javax.swing.JTextField();
        tf_income = new javax.swing.JTextField();
        lab_ispis = new javax.swing.JLabel();
        obrisi_TF = new javax.swing.JButton();
        button_azuriraj = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Employee data");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 255, 255));
        setFont(new java.awt.Font("Agency FB", 1, 12)); // NOI18N
        setForeground(java.awt.Color.black);
        setLocation(new java.awt.Point(0, 0));

        tabela_zaposlenih.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tabela_zaposlenih.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "NAME AND SURNAME", "YEAR", "ADDRESS", "INCOME"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela_zaposlenih.setToolTipText("Tabela za prikaz informacija o zaposlenima .");
        tabela_zaposlenih.setName("tabela_zaposlenih"); // NOI18N
        tabela_zaposlenih.getTableHeader().setReorderingAllowed(false);
        tabela_zaposlenih.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabela_zaposlenihMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela_zaposlenih);
        if (tabela_zaposlenih.getColumnModel().getColumnCount() > 0) {
            tabela_zaposlenih.getColumnModel().getColumn(2).setResizable(false);
            tabela_zaposlenih.getColumnModel().getColumn(4).setResizable(false);
        }

        jToolBar1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 255)));
        jToolBar1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jToolBar1.setToolTipText("Izaberite operaciju ");
        jToolBar1.setMargin(new java.awt.Insets(55, 25, 25, 5550));

        RadioButtonGroup.add(rb_svi_zaposleni);
        rb_svi_zaposleni.setText("All employees - search");
        rb_svi_zaposleni.setMargin(new java.awt.Insets(15, 2, 2, 2));
        rb_svi_zaposleni.setNextFocusableComponent(rb_novi_zaposleni);
        rb_svi_zaposleni.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rb_svi_zaposleniStateChanged(evt);
            }
        });
        jToolBar1.add(rb_svi_zaposleni);

        RadioButtonGroup.add(rb_novi_zaposleni);
        rb_novi_zaposleni.setText("New employees");
        rb_novi_zaposleni.setMargin(new java.awt.Insets(15, 2, 2, 2));
        rb_novi_zaposleni.setNextFocusableComponent(rb_promena_podataka);
        rb_novi_zaposleni.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rb_novi_zaposleniStateChanged(evt);
            }
        });
        jToolBar1.add(rb_novi_zaposleni);

        RadioButtonGroup.add(rb_promena_podataka);
        rb_promena_podataka.setText("Data change");
        rb_promena_podataka.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        rb_promena_podataka.setFocusable(false);
        rb_promena_podataka.setMargin(new java.awt.Insets(15, 2, 2, 2));
        rb_promena_podataka.setNextFocusableComponent(rb_brisanje_zaposlenog);
        rb_promena_podataka.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rb_promena_podatakaStateChanged(evt);
            }
        });
        rb_promena_podataka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_promena_podatakaActionPerformed(evt);
            }
        });
        jToolBar1.add(rb_promena_podataka);

        RadioButtonGroup.add(rb_brisanje_zaposlenog);
        rb_brisanje_zaposlenog.setText("Deleting an employee");
        rb_brisanje_zaposlenog.setFocusable(false);
        rb_brisanje_zaposlenog.setMargin(new java.awt.Insets(15, 2, 15, 2));
        rb_brisanje_zaposlenog.setNextFocusableComponent(tf_id);
        rb_brisanje_zaposlenog.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        rb_brisanje_zaposlenog.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rb_brisanje_zaposlenogStateChanged(evt);
            }
        });
        rb_brisanje_zaposlenog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_brisanje_zaposlenogActionPerformed(evt);
            }
        });
        jToolBar1.add(rb_brisanje_zaposlenog);

        jPanel_svi_zaposleni.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 51)));
        jPanel_svi_zaposleni.setToolTipText("Unesite potrebne podatke .");

        jLabel1.setText("ID:");

        jLabel2.setText("Name and surname:");

        jLabel3.setText("Year:");

        tf_id.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tf_id.setNextFocusableComponent(tf_name);
        tf_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_idKeyReleased(evt);
            }
        });

        tf_year.setToolTipText("Unesite broj godina");
        tf_year.setNextFocusableComponent(tf_address);
        tf_year.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_yearKeyReleased(evt);
            }
        });

        tf_name.setToolTipText("Unesite ime i prezime");
        tf_name.setNextFocusableComponent(tf_year);
        tf_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_nameKeyReleased(evt);
            }
        });

        jLabel4.setText("Address:");

        jLabel5.setText("Income:");

        tf_address.setToolTipText("Unesite adresu korisinka");
        tf_address.setNextFocusableComponent(tf_income);
        tf_address.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_addressKeyReleased(evt);
            }
        });

        tf_income.setToolTipText("Unesite dohodak");
        tf_income.setNextFocusableComponent(button_azuriraj);
        tf_income.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_incomeKeyReleased(evt);
            }
        });

        lab_ispis.setFont(new java.awt.Font("YuTimes", 0, 18)); // NOI18N

        obrisi_TF.setText("Delete the entered fields");
        obrisi_TF.setToolTipText("Klikom na ovo dugme brisete sva polja");
        obrisi_TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                obrisi_TFActionPerformed(evt);
            }
        });

        button_azuriraj.setText("Update");
        button_azuriraj.setToolTipText("Klikom na ovo dugme azurirate polja u tabeli");
        button_azuriraj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_azurirajActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_svi_zaposleniLayout = new javax.swing.GroupLayout(jPanel_svi_zaposleni);
        jPanel_svi_zaposleni.setLayout(jPanel_svi_zaposleniLayout);
        jPanel_svi_zaposleniLayout.setHorizontalGroup(
            jPanel_svi_zaposleniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_svi_zaposleniLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_svi_zaposleniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel_svi_zaposleniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel_svi_zaposleniLayout.createSequentialGroup()
                        .addComponent(tf_id, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_address, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel_svi_zaposleniLayout.createSequentialGroup()
                        .addComponent(tf_year, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(button_azuriraj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel_svi_zaposleniLayout.createSequentialGroup()
                        .addComponent(tf_name, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_income, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel_svi_zaposleniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lab_ispis, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(obrisi_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );
        jPanel_svi_zaposleniLayout.setVerticalGroup(
            jPanel_svi_zaposleniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_svi_zaposleniLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_svi_zaposleniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_svi_zaposleniLayout.createSequentialGroup()
                        .addGroup(jPanel_svi_zaposleniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(tf_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(tf_address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addGroup(jPanel_svi_zaposleniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(tf_income, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(tf_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lab_ispis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_svi_zaposleniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_azuriraj)
                    .addComponent(obrisi_TF))
                .addContainerGap())
        );

        jLabel6.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        jLabel6.setText("                                                                    EMPLOYEE DATABASE MANAGEMENT ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel_svi_zaposleni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 794, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jPanel_svi_zaposleni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void obrisiSve() {
        tf_id.setText("");
        tf_name.setText("");
        tf_year.setText("");
        tf_address.setText("");
        tf_income.setText("");

    }

    private void filter(String query, int row) {

        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>((DefaultTableModel) tabela_zaposlenih.getModel());
        tabela_zaposlenih.setRowSorter(tr);

        if (rb_svi_zaposleni.isSelected()) {

            tr.setRowFilter(RowFilter.regexFilter("(?i)" + query, row));

        } else {
            tr.setRowFilter(null);
        }

    }

    private void button_azurirajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_azurirajActionPerformed

        if (rb_novi_zaposleni.isSelected()) {

            String name = tf_name.getText();
            int year = Integer.parseInt(tf_year.getText());
            String address = tf_address.getText();
            int income = Integer.parseInt(tf_income.getText());

            Insert(name, year, address, income);

        } else if (rb_brisanje_zaposlenog.isSelected()) {

            Delete();

        } else if (rb_promena_podataka.isSelected()) {

            Update();

        }
    }//GEN-LAST:event_button_azurirajActionPerformed

    private void rb_svi_zaposleniStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rb_svi_zaposleniStateChanged
        if (rb_svi_zaposleni.isSelected()) {

            lab_ispis.setText("The search is performed by filling in any TextField ");

            ocitajPonovoBazu();

            tf_id.setEditable(true);
            tf_name.setEditable(true);
            tf_year.setEditable(true);
            tf_address.setEditable(true);
            tf_income.setEditable(true);

        }
    }//GEN-LAST:event_rb_svi_zaposleniStateChanged

    private void rb_novi_zaposleniStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rb_novi_zaposleniStateChanged
        if (rb_novi_zaposleni.isSelected()) {

            obrisiSve();
            lab_ispis.setText("Enter the details of the new employee");
            tf_id.setEditable(false);
            tf_name.setEditable(true);
            tf_year.setEditable(true);
            tf_address.setEditable(true);
            tf_income.setEditable(true);

        }
    }//GEN-LAST:event_rb_novi_zaposleniStateChanged

    private void rb_promena_podatakaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rb_promena_podatakaStateChanged

        if (rb_promena_podataka.isSelected()) {
            ocitajPonovoBazu();
            lab_ispis.setText("Updating Worker Data");
            tf_id.setEditable(true);
            tf_name.setEditable(true);
            tf_year.setEditable(true);
            tf_address.setEditable(true);
            tf_income.setEditable(true);

        }
    }//GEN-LAST:event_rb_promena_podatakaStateChanged

    private void rb_brisanje_zaposlenogStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rb_brisanje_zaposlenogStateChanged
        if (rb_brisanje_zaposlenog.isSelected()) {
            ocitajPonovoBazu();
            lab_ispis.setText("Enter the id of the worker or click on his data in the table");
            tf_id.setEditable(true);
            tf_name.setEditable(false);
            tf_year.setEditable(false);
            tf_address.setEditable(false);
            tf_income.setEditable(false);

        }
    }//GEN-LAST:event_rb_brisanje_zaposlenogStateChanged

    private void tabela_zaposlenihMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabela_zaposlenihMouseClicked

        int row = tabela_zaposlenih.getSelectedRow();

        String Selected_ID = (tabela_zaposlenih.getModel().getValueAt(row, 0)).toString();

        try {
            Session s = NewHibernateUtil.getSessionFactory().openSession();
            s.beginTransaction();
            Query q = s.createQuery("from podaci where id='" + Selected_ID + "' ");

            List<?> list = q.list();
            podaci podaci = (podaci) list.get(0);

            tf_id.setText(Integer.toString(podaci.getId()));
            tf_name.setText(podaci.getName());
            tf_year.setText(Integer.toString(podaci.getYear()));
            tf_address.setText(podaci.getAddress());
            tf_income.setText(Integer.toString(podaci.getIncome()));

            s.getTransaction().commit();
        } catch (HibernateException e) {
            System.out.println("ERROR! :" + e.getMessage());
        }


    }//GEN-LAST:event_tabela_zaposlenihMouseClicked

    private void prikaziRezultat(List listaRezultata) {
        Vector<String> columnheadings = new Vector<>();
        Vector podaci = new Vector();

        columnheadings.add("ID");
        columnheadings.add("Name and Surname");
        columnheadings.add("Year");
        columnheadings.add("Address");
        columnheadings.add("Income");

        for (Object o : listaRezultata) {

            podaci employees = (podaci) o;
            Vector<Object> red = new Vector<>();
            red.add(employees.getId());
            red.add(employees.getName());
            red.add(employees.getYear());
            red.add(employees.getAddress());
            red.add(employees.getIncome());
            podaci.add(red);
        }

        tabela_zaposlenih.setModel(new DefaultTableModel(podaci, columnheadings));
    }

    public void Insert(String name, int year, String address, int income) {
        try {
            Session s = NewHibernateUtil.getSessionFactory().openSession();
            s.beginTransaction();
            podaci newUser = new podaci();
            newUser.setName(tf_name.getText());
            newUser.setYear(Integer.valueOf(tf_year.getText()));
            newUser.setAddress(tf_address.getText());
            newUser.setIncome(Integer.valueOf(tf_income.getText()));
            s.save(newUser);
            Query q = s.createQuery("from podaci pod where pod.id='" + newUser.getId() + "'");

            List<?> list = q.list();
            podaci podaci = (podaci) list.get(0);

            tf_id.setText(Integer.toString(podaci.getId()));
            tf_name.setText(podaci.getName());
            tf_year.setText(Integer.toString(podaci.getYear()));
            tf_address.setText(podaci.getAddress());
            tf_income.setText(Integer.toString(podaci.getIncome()));

            s.getTransaction().commit();
            obrisiSve();
            prikaziRezultat(list);
        } catch (HibernateException e) {
            System.out.println("ERROR! :" + e.getMessage());
        }

    }

    public void Delete() {
        Session s;
        Query q;
        int p = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete the data?", "Confirmation required", JOptionPane.YES_NO_OPTION);
        if (p == 0) {

            if (tf_id.equals("")) {

                JOptionPane.showMessageDialog(null, "Check the field with the data of the employee you want to delete !!! Or enter the employee ID.");
            } else {
                try {
                    s = NewHibernateUtil.getSessionFactory().openSession();
                    s.beginTransaction();

                    q = s.createQuery("delete from podaci pod where pod.id='" + tf_id.getText() + "'");
                    q.executeUpdate();

                    s.getTransaction().commit();

                    JOptionPane.showMessageDialog(null, "Employee with ID: " + tf_id.getText() + " has been successfully deleted from the database!");
                    obrisiSve();
                } catch (HibernateException e) {
                    System.out.println("ERROR! :" + e.getMessage());
                }

                ocitajPonovoBazu();

            }
        }
    }

    public void Update() {
        try {
            Session s = NewHibernateUtil.getSessionFactory().openSession();
            s.beginTransaction();

            Query q = s.createQuery("update podaci set name_and_surname='" + tf_name.getText() + "' , year='" + tf_year.getText() + "' , address='" + tf_address.getText() + "' , personal_income='" + tf_income.getText() + "' where id='" + tf_id.getText() + "'");

            q.executeUpdate();
            s.getTransaction().commit();
            ocitajPonovoBazu();
            obrisiSve();

        } catch (HibernateException e) {
            System.out.println("ERROR! :" + e.getMessage());
        }

    }

    public void ocitajPonovoBazu() {

        try {
            Session s = NewHibernateUtil.getSessionFactory().openSession();
            s.beginTransaction();
            Query q = s.createQuery("from podaci");
            List listaRezultata = q.list();
            prikaziRezultat(listaRezultata);

            prikaziRezultat(listaRezultata);
        } catch (HibernateException e) {
            System.out.println("ERROR! :" + e.getMessage());
        }

    }


    private void obrisi_TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_obrisi_TFActionPerformed
        obrisiSve();
    }//GEN-LAST:event_obrisi_TFActionPerformed

    private void tf_idKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_idKeyReleased
        if (rb_svi_zaposleni.isSelected()) {
            String query = tf_id.getText();
            int row = 0;
            filter(query, row);
        }

    }//GEN-LAST:event_tf_idKeyReleased

    private void tf_nameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_nameKeyReleased
        if (rb_svi_zaposleni.isSelected()) {
            String query = tf_name.getText();
            int row = 1;
            filter(query, row);
        }
    }//GEN-LAST:event_tf_nameKeyReleased

    private void tf_yearKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_yearKeyReleased
        if (rb_svi_zaposleni.isSelected()) {
            String query = tf_year.getText();
            int row = 2;
            filter(query, row);
        }
    }//GEN-LAST:event_tf_yearKeyReleased

    private void tf_addressKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_addressKeyReleased
        if (rb_svi_zaposleni.isSelected()) {
            String query = tf_address.getText();
            int row = 3;
            filter(query, row);
        }
    }//GEN-LAST:event_tf_addressKeyReleased

    private void tf_incomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_incomeKeyReleased
        if (rb_svi_zaposleni.isSelected()) {
            String query = tf_income.getText();
            int row = 4;
            filter(query, row);
        }
    }//GEN-LAST:event_tf_incomeKeyReleased

    private void rb_promena_podatakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_promena_podatakaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_promena_podatakaActionPerformed

    private void rb_brisanje_zaposlenogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_brisanje_zaposlenogActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_brisanje_zaposlenogActionPerformed

    public static void main(String args[]) {

        // It creates and displays the table
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
            java.util.logging.Logger.getLogger(Zaposleni.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Zaposleni.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Zaposleni.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Zaposleni.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new Zaposleni().setVisible(true);
            }
        }
        );
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup RadioButtonGroup;
    public javax.swing.JButton button_azuriraj;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    public javax.swing.JPanel jPanel_svi_zaposleni;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    public javax.swing.JLabel lab_ispis;
    private javax.swing.JButton obrisi_TF;
    public javax.swing.JRadioButton rb_brisanje_zaposlenog;
    public javax.swing.JRadioButton rb_novi_zaposleni;
    public javax.swing.JRadioButton rb_promena_podataka;
    public javax.swing.JRadioButton rb_svi_zaposleni;
    public javax.swing.JTable tabela_zaposlenih;
    public javax.swing.JTextField tf_address;
    public javax.swing.JTextField tf_id;
    public javax.swing.JTextField tf_income;
    public javax.swing.JTextField tf_name;
    public javax.swing.JTextField tf_year;
    // End of variables declaration//GEN-END:variables
}
