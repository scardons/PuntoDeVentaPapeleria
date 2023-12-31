/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sistema.empleadosGUI;
import Menu.frmMenu;
import sistema.empleadosDAL.conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import sistema.empleadosBL.empleadosBL;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Santiago
 */
public class frmEmpleados extends javax.swing.JFrame {
    DefaultTableModel modelo;


    public frmEmpleados() {
        initComponents();
        //creamos la tabla que vamos a ver 
        String[] titulos ={"ID", "Nombre", "Correo"};
        
        modelo = new DefaultTableModel(null,titulos);
        tblEmpleados.setModel(modelo);
        
        this.mostrarDatos();// la llamamos para que muestre los datos
        this.limpiar();//LIMPIAR BOTONES
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmpleados = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        btnEdtar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEmpleadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEmpleados);

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEdtar.setText("Editar");
        btnEdtar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEdtarActionPerformed(evt);
            }
        });

        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btncancelar.setText("Cancelar");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });

        txtID.setEditable(false);

        jLabel1.setText("ID:");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Correo:");

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegresar))
                    .addComponent(txtCorreo)
                    .addComponent(txtNombre)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnAgregar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEdtar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addComponent(btnBorrar)
                        .addGap(18, 18, 18)
                        .addComponent(btncancelar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegresar))
                .addGap(1, 1, 1)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnEdtar)
                    .addComponent(btnBorrar)
                    .addComponent(btncancelar))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEdtarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEdtarActionPerformed
        // TODO add your handling code here:
       conexion objConexion= new conexion();
        
        empleadosBL oEmpleados= recuperarDatosGUI();
        
        String strSentenciaInsert= String.format("UPDATE empleados SET='%S', "
                + "Correo='%s' WHERE ID =%d ",oEmpleados.getNombre(),oEmpleados.getCorreo(),oEmpleados.getID());
        
        
        objConexion.ejecturSentenciaSQL(strSentenciaInsert);
           
        this.mostrarDatos(); 
        this.limpiar();
    }//GEN-LAST:event_btnEdtarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here: este metodo nos sirve para ingresar informacion a la base de datos
        conexion objConexion= new conexion();
        
        empleadosBL oEmpleados= recuperarDatosGUI();
        
        String strSentenciaInsert= String.format("insert into empleados (id,nombre,correo) "
                + "values (null,'%s','%s')",oEmpleados.getNombre(),oEmpleados.getCorreo());
        
        
        objConexion.ejecturSentenciaSQL(strSentenciaInsert);
           
        this.mostrarDatos();
        this.limpiar();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        // TODO add your handling code here:
        conexion objConexion= new conexion();//NOS CONECTAMOS A LA BASE DE DATOS
        
        empleadosBL oEmpleados= recuperarDatosGUI();//OBTENEMOS TODA LA INFORMACION QUE ESTA EN LA INTERFAZ GRAFICA
        
        String strSentenciaInsert= String.format("DELETE FROM Empleados WHERE ID=%d",oEmpleados.getID());//HACEMOS LA SENTENCIA DE EMPLEADOS
        
        
        objConexion.ejecturSentenciaSQL(strSentenciaInsert);
        
        this.mostrarDatos();
        this.limpiar();
        
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void tblEmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmpleadosMouseClicked
        // TODO add your handling code here:
        // ESTO ES PARA QUE CUANDO LE DEMOS CLICK A LA TABLA ME APAREZCA ARRIBA Y PODER MODIFICARLA
        if(evt.getClickCount()==1){ // evt son la ubicaciones de los registros y lo encontramos en event de propiedades
            JTable receptor = (JTable)evt.getSource();//castear el evt
            
            
            txtID.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(),0).toString());//a lo ultimo lo convierte en texto
            txtNombre.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(),1).toString());//numero son las pocisiones
            txtCorreo.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(),2).toString());
        
        }//AQUI LOS PONEMOS A LA INVERSA PARA QUE FUNCIONEN
            btnAgregar.setEnabled(false);
            btnEdtar.setEnabled(true);
            btnBorrar.setEnabled(true);
    }//GEN-LAST:event_tblEmpleadosMouseClicked

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        // TODO add your handling code here:
        
        this.limpiar();
        
    }//GEN-LAST:event_btncancelarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        frmMenu fm = new frmMenu();
        fm.setVisible(true);
        fm.setTitle("iniciar");
        fm.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed
    public void mostrarDatos(){
        //WHILE PARA LIMPIAR LAS TABLAS CUANDO SE BORRE UN CAMPO DEL INTERFAZ
        while(modelo.getRowCount()>0){// GETROWCOUNR PARA QUE LLEVE LA CUENTA
                modelo.removeRow(0);
        }
    conexion objConexion= new conexion();
        try {
            ResultSet resultado= objConexion.consultarRegistos("SELECT*FROM Empleados");
            
            while (resultado.next()) {//metodo next para recuperar toda la info y ponerla una por una 

                
                System.out.println(resultado.getString("ID"));
                System.out.println(resultado.getString("Nombre"));
                System.out.println(resultado.getString("Correo"));
                
                Object[] oUsuario={resultado.getString("ID"),resultado.getString("Nombre"),resultado.getString("Correo")};
                
                modelo.addRow(oUsuario);
            }
            
        } catch (SQLException e) {
            System.out.println(e);
        }
        
    }
    
    public empleadosBL recuperarDatosGUI(){//CREAMOS UN OBJETO A PATRIR DE LA CLASE EMPLEADOS BL
       empleadosBL oEmpleados=new empleadosBL();
       
       int ID = (txtID.getText().isEmpty())?0: Integer.parseInt(txtID.getText());
       
       oEmpleados.setID(ID);
       oEmpleados.setNombre(txtNombre.getText());
       oEmpleados.setCorreo(txtCorreo.getText());
       
       return oEmpleados; // retornar el mismo tipo de dato que es empleados BL
   }
    public void limpiar(){
    
    txtID.setText("");
    txtNombre.setText("");
    txtCorreo.setText("");
    
    btnAgregar.setEnabled(true);
    btnEdtar.setEnabled(false);
    btnBorrar.setEnabled(false);
    }
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
            java.util.logging.Logger.getLogger(frmEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmEmpleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnEdtar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btncancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEmpleados;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
