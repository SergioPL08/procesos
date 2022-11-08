package InterfazV2;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import zoo.*;
import util.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author sergio
 */
public class addCuidados extends javax.swing.JFrame {
    ArrayList<Cuidados> cuidados;
    Conexion miConexion;
    DefaultTableModel modelo;
    
    /**
     * Creates new form addCuid
     */
    public addCuidados() {
        try {
            initComponents();
            //TextPrompt sirve para poner un placeholder en un textfield
            TextPrompt name = new TextPrompt("Cortar uñas pandas", jTFNombreCuidado);
            TextPrompt descripcion = new TextPrompt("Cortarle y limarle las uñas a los pandas", jTADesc);
            
            cuidados = new ArrayList<Cuidados>();
            miConexion = new Conexion("localhost","3306","zoologico","zoo","pepe");
            //Rellenamos la tabla de cuidados con los datos de la base de datos
            modelo = (DefaultTableModel) jTablaCuidados.getModel();
            
            String consulta = "SELECT * FROM cuidado";
            ResultSet rsTabla = miConexion.getSelect(consulta);
            while(rsTabla.next()){
                modelo.addRow(new Object[] {rsTabla.getInt(1),rsTabla.getString(2),rsTabla.getString(3),rsTabla.getTimestamp(4)});
            }
        } catch (SQLException ex) {
            Logger.getLogger(addCuidados.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        LDesc = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        LNombre = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTADesc = new javax.swing.JTextArea();
        jTFNombreCuidado = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablaCuidados = new javax.swing.JTable();
        jToolBar1 = new javax.swing.JToolBar();
        jButtonAdd = new javax.swing.JButton();
        JButtonEditAnimal = new javax.swing.JToggleButton();
        JButtonRemoveAnimal = new javax.swing.JToggleButton();
        JButtonErase = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));
        java.awt.GridBagLayout jPanel1Layout = new java.awt.GridBagLayout();
        jPanel1Layout.columnWidths = new int[] {0, 6, 0};
        jPanel1Layout.rowHeights = new int[] {0, 8, 0, 8, 0, 8, 0, 8, 0};
        jPanel1.setLayout(jPanel1Layout);

        LDesc.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        LDesc.setForeground(new java.awt.Color(0, 153, 51));
        LDesc.setText("Descripcion");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        jPanel1.add(LDesc, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Añadir cuidado");
        jLabel1.setPreferredSize(new java.awt.Dimension(50, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel1.add(jLabel1, gridBagConstraints);

        LNombre.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        LNombre.setForeground(new java.awt.Color(0, 153, 51));
        LNombre.setText("Nombre");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        jPanel1.add(LNombre, gridBagConstraints);

        jTADesc.setBackground(new java.awt.Color(255, 255, 255));
        jTADesc.setColumns(20);
        jTADesc.setForeground(new java.awt.Color(51, 51, 51));
        jTADesc.setRows(5);
        jScrollPane2.setViewportView(jTADesc);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 3;
        jPanel1.add(jScrollPane2, gridBagConstraints);

        jTFNombreCuidado.setBackground(new java.awt.Color(255, 255, 255));
        jTFNombreCuidado.setForeground(new java.awt.Color(0, 0, 0));
        jTFNombreCuidado.setPreferredSize(new java.awt.Dimension(100, 24));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        jPanel1.add(jTFNombreCuidado, gridBagConstraints);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jTablaCuidados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Descripcion", "Última Modificación"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTablaCuidados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                click(evt);
            }
        });
        jScrollPane1.setViewportView(jTablaCuidados);
        if (jTablaCuidados.getColumnModel().getColumnCount() > 0) {
            jTablaCuidados.getColumnModel().getColumn(0).setPreferredWidth(30);
            jTablaCuidados.getColumnModel().getColumn(1).setPreferredWidth(100);
            jTablaCuidados.getColumnModel().getColumn(2).setPreferredWidth(200);
            jTablaCuidados.getColumnModel().getColumn(3).setPreferredWidth(200);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jToolBar1.setBackground(new java.awt.Color(204, 204, 204));
        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        jButtonAdd.setForeground(new java.awt.Color(0, 0, 0));
        jButtonAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add.png"))); // NOI18N
        jButtonAdd.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonAdd);

        JButtonEditAnimal.setBackground(new java.awt.Color(51, 51, 51));
        JButtonEditAnimal.setForeground(new java.awt.Color(0, 0, 0));
        JButtonEditAnimal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/edit.png"))); // NOI18N
        JButtonEditAnimal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JButtonEditAnimal.setPreferredSize(new java.awt.Dimension(70, 22));
        JButtonEditAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonEditAnimalActionPerformed(evt);
            }
        });
        jToolBar1.add(JButtonEditAnimal);

        JButtonRemoveAnimal.setBackground(new java.awt.Color(51, 51, 51));
        JButtonRemoveAnimal.setForeground(new java.awt.Color(0, 0, 0));
        JButtonRemoveAnimal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete.png"))); // NOI18N
        JButtonRemoveAnimal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JButtonRemoveAnimal.setPreferredSize(new java.awt.Dimension(70, 22));
        JButtonRemoveAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonRemoveAnimalActionPerformed(evt);
            }
        });
        jToolBar1.add(JButtonRemoveAnimal);

        JButtonErase.setBackground(new java.awt.Color(51, 51, 51));
        JButtonErase.setForeground(new java.awt.Color(0, 0, 0));
        JButtonErase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/erase.png"))); // NOI18N
        JButtonErase.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JButtonErase.setFocusable(false);
        JButtonErase.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JButtonErase.setPreferredSize(new java.awt.Dimension(70, 22));
        JButtonErase.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        JButtonErase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonEraseActionPerformed(evt);
            }
        });
        jToolBar1.add(JButtonErase);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        String nombre = jTFNombreCuidado.getText();
        String desc = jTADesc.getText();
        if(nombre.equals("")){
            JOptionPane.showMessageDialog(null, "Introduce el nombre");
        }
        else{
            Cuidados cuid = new Cuidados (nombre,desc);
            cuidados.add(cuid);
            try{
                String consulta = "SELECT * FROM cuidado WHERE nombre_cuidado='"+nombre+"' AND descripcion='"+desc+"'";
                ResultSet rs1 = miConexion.comprobarDatos(consulta);
                LocalDateTime dateTime = LocalDateTime.now();
                String currentTimeStamp = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.0").format(dateTime);
                if(rs1==null){
                    ResultSet rs = miConexion.getSelect("Select * from cuidado");
                    //Irse a la ultima linea de la tabla
                    rs.moveToInsertRow();
                    //
                    rs.updateString("nombre_cuidado",nombre);
                    rs.updateString("descripcion",desc);
                    rs.insertRow();
                    //users.add(user);
                    JOptionPane.showMessageDialog(null, "Cuidado añadida correctamente");
                    ResultSet getId=miConexion.comprobarDatos("SELECT AUTO_INCREMENT FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_SCHEMA='ZOO' AND TABLE_NAME='cuidado'");
                    modelo.addRow(new Object[] {getId.getInt("AUTO_INCREMENT")-1,nombre,desc,currentTimeStamp});
                    jTFNombreCuidado.setText("");
                    jTADesc.setText("");
                }
                else{
                    JOptionPane.showMessageDialog(null, "El cuidado ya existe");
                }   
            } catch (SQLException ex) {
                Logger.getLogger(addEspecialidad.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
            
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void JButtonEditAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonEditAnimalActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "¿Estás seguro? No podrás recuperar los datos anteriores","Editar especie",JOptionPane.YES_OPTION);
        if(resp==0){
            String nombre = jTFNombreCuidado.getText();
            String desc = jTADesc.getText();
            int fila = jTablaCuidados.getSelectedRow();
            int id=(int)jTablaCuidados.getValueAt(fila, 0);
            String sentencia = "UPDATE CUIDADO SET NOMBRE_CUIDADO='"+nombre+"',DESCRIPCION='"+desc+"' WHERE ID_CUIDADO="+id;
            System.out.println(sentencia);
            if(miConexion.editTable(sentencia)==1){
                modelo.setValueAt(jTFNombreCuidado.getText(), fila, 1);
                modelo.setValueAt(jTADesc.getText(), fila, 2);
                JOptionPane.showMessageDialog(null, "Especialidad editada correctamente");
                jTFNombreCuidado.setText("");
            }
            else{
                JOptionPane.showMessageDialog(null, "Error al editar la especialidad");
            }
        }
    }//GEN-LAST:event_JButtonEditAnimalActionPerformed

    private void JButtonRemoveAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonRemoveAnimalActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "¿Estás seguro, manín? No vas a poder recuperar los datos eliminados","Eliminar especie",JOptionPane.YES_OPTION);
        if(resp==0){
            int id=(int)jTablaCuidados.getValueAt(jTablaCuidados.getSelectedRow(), 0);
            int fila = jTablaCuidados.getSelectedRow();
            String sentencia = "DELETE FROM CUIDADO WHERE ID_CUIDADO="+id;
            if(miConexion.editTable(sentencia)==1){
                modelo.removeRow(fila);
                JOptionPane.showMessageDialog(null, "Especialidad elimado correctamente");
                jTFNombreCuidado.setText("");
                jTADesc.setText("");
            }
        }
    }//GEN-LAST:event_JButtonRemoveAnimalActionPerformed

    private void click(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_click
        int fila = jTablaCuidados.getSelectedRow();
        jTFNombreCuidado.setText((String)jTablaCuidados.getValueAt(fila,1));
        jTADesc.setText((String)jTablaCuidados.getValueAt(fila,2));
    }//GEN-LAST:event_click

    private void JButtonEraseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonEraseActionPerformed
        jTFNombreCuidado.setText("");
        jTADesc.setText("");
    }//GEN-LAST:event_JButtonEraseActionPerformed

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
            java.util.logging.Logger.getLogger(addCuidados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addCuidados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addCuidados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addCuidados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addCuidados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton JButtonEditAnimal;
    private javax.swing.JToggleButton JButtonErase;
    private javax.swing.JToggleButton JButtonRemoveAnimal;
    private javax.swing.JLabel LDesc;
    private javax.swing.JLabel LNombre;
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTADesc;
    private javax.swing.JTextField jTFNombreCuidado;
    private javax.swing.JTable jTablaCuidados;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
