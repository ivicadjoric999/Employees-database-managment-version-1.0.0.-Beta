/**
 *
 * @author Ivica Djoric
 */

package Aplikacija;

public class Aplikacija extends javax.swing.JFrame {

    public Aplikacija() {
        initComponents();
        setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Employees = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        About_the_program = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Employees.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Employees.setText("Employees");
        Employees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmployeesActionPerformed(evt);
            }
        });

        jPanel1.setLayout(new java.awt.BorderLayout());

        About_the_program.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        About_the_program.setText("About the program");
        About_the_program.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                About_the_programActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Employees)
                    .addComponent(About_the_program)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {About_the_program, Employees});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(Employees)
                .addGap(41, 41, 41)
                .addComponent(About_the_program)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {About_the_program, Employees});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void About_the_programActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_About_the_programActionPerformed
        O_Programu1 op = new O_Programu1();
        op.setVisible(true);
    }//GEN-LAST:event_About_the_programActionPerformed

    private void EmployeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmployeesActionPerformed
        Zaposleni k = new Zaposleni();
        this.dispose();
        k.setVisible(true);
    }//GEN-LAST:event_EmployeesActionPerformed
 public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Aplikacija().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton About_the_program;
    private javax.swing.JButton Employees;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
