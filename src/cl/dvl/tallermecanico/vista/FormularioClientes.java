package cl.dvl.tallermecanico.vista;

import cl.dvl.tallermecanico.interfaz.Cliente;
import cl.dvl.tallermecanico.interfaz.Comuna;
import cl.dvl.tallermecanico.interfaz.Region;
import cl.dvl.tallermecanico.modelo.ClienteDAO;
import cl.dvl.tallermecanico.modelo.LocacionDAO;
import cl.dvl.tallermecanico.utils.Conexion;
import cl.dvl.tallermecanico.utils.Constantes;
import java.sql.*;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class FormularioClientes extends javax.swing.JInternalFrame {

    private List<Region> regionGlobal = new LinkedList<>();
    private List<Comuna> comunaGlobal = new LinkedList<>();
    private int idComunaSelect;

    public FormularioClientes() {
        initComponents();

        LocacionDAO dao = new LocacionDAO();
        List<Region> listaRegiones = dao.getRegion();
        cbxRegiones.addItem(Constantes.MSJ_SELECCIONE_REGION);
        for (Region region : listaRegiones) {
            System.out.println(region.getRegion());
            cbxRegiones.addItem(region.getRegion());
        }
        regionGlobal = listaRegiones;
        

    }

    void limpiar() {
        txtNombre.setText("");
        txtApPaterno.setText("");
        txtApMaterno.setText("");
        txtCelular.setText("");
        txtTelefono.setText("");
        txtDireccion.setText("");
        txtCorreo.setText("");
        txtRut.setText("");
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        formularioClientes = new javax.swing.JPanel();
        lblFormularioClientes = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblApellidoPaterno = new javax.swing.JLabel();
        txtApPaterno = new javax.swing.JTextField();
        lblApellidoMaterno = new javax.swing.JLabel();
        txtApMaterno = new javax.swing.JTextField();
        lblRut = new javax.swing.JLabel();
        txtRut = new javax.swing.JTextField();
        correo = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        lblCelular = new javax.swing.JLabel();
        txtCelular = new javax.swing.JTextField();
        BtnIngresarCliente = new javax.swing.JButton();
        BtnLimpiarCliente = new javax.swing.JButton();
        lblTelefono = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        lblDireccion = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        lblComuna = new javax.swing.JLabel();
        cbxComuna = new javax.swing.JComboBox<>();
        lblRegion = new javax.swing.JLabel();
        cbxRegiones = new javax.swing.JComboBox<>();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setMaximumSize(new java.awt.Dimension(745, 316));
        setPreferredSize(new java.awt.Dimension(745, 316));

        formularioClientes.setEnabled(false);
        formularioClientes.setPreferredSize(new java.awt.Dimension(800, 500));

        lblFormularioClientes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblFormularioClientes.setText("Formulario Clientes");

        lblNombre.setText("Nombre: ");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        lblApellidoPaterno.setText("Apellido Paterno:");

        txtApPaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApPaternoActionPerformed(evt);
            }
        });

        lblApellidoMaterno.setText("Apellido Materno: ");

        txtApMaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApMaternoActionPerformed(evt);
            }
        });

        lblRut.setText("Rut:");

        txtRut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRutActionPerformed(evt);
            }
        });

        correo.setText("Correo: ");

        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });

        lblCelular.setText("Celular:");

        txtCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCelularActionPerformed(evt);
            }
        });

        BtnIngresarCliente.setText("Ingresar");
        BtnIngresarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIngresarClienteActionPerformed(evt);
            }
        });

        BtnLimpiarCliente.setText("Limpiar");
        BtnLimpiarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimpiarClienteActionPerformed(evt);
            }
        });

        lblTelefono.setText("Telefono:");

        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });

        lblDireccion.setText("Dirección:");

        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });

        lblComuna.setText("Comuna:");

        cbxComuna.setEnabled(false);
        cbxComuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxComunaActionPerformed(evt);
            }
        });

        lblRegion.setText("Región:");

        cbxRegiones.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxRegionesItemStateChanged(evt);
            }
        });
        cbxRegiones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxRegionesActionPerformed(evt);
            }
        });
        cbxRegiones.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                cbxRegionesPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout formularioClientesLayout = new javax.swing.GroupLayout(formularioClientes);
        formularioClientes.setLayout(formularioClientesLayout);
        formularioClientesLayout.setHorizontalGroup(
            formularioClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formularioClientesLayout.createSequentialGroup()
                .addGap(301, 301, 301)
                .addComponent(lblFormularioClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(formularioClientesLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(formularioClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formularioClientesLayout.createSequentialGroup()
                        .addGroup(formularioClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(formularioClientesLayout.createSequentialGroup()
                                .addComponent(lblRut)
                                .addGap(70, 70, 70)
                                .addComponent(txtRut, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(formularioClientesLayout.createSequentialGroup()
                                .addGroup(formularioClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(formularioClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(formularioClientesLayout.createSequentialGroup()
                                            .addGroup(formularioClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lblApellidoPaterno)
                                                .addComponent(lblNombre))
                                            .addGap(9, 9, 9))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formularioClientesLayout.createSequentialGroup()
                                            .addComponent(lblApellidoMaterno)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                    .addGroup(formularioClientesLayout.createSequentialGroup()
                                        .addGroup(formularioClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblCelular)
                                            .addComponent(lblTelefono))
                                        .addGap(45, 45, 45)))
                                .addGroup(formularioClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(formularioClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtApMaterno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                                        .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtApPaterno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(formularioClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(formularioClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(BtnIngresarCliente)
                                        .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(30, 30, 30)
                        .addGroup(formularioClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(formularioClientesLayout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addComponent(BtnLimpiarCliente))
                            .addGroup(formularioClientesLayout.createSequentialGroup()
                                .addGroup(formularioClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblRegion)
                                    .addComponent(lblComuna)
                                    .addComponent(lblDireccion))
                                .addGap(39, 39, 39)
                                .addGroup(formularioClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                                    .addComponent(cbxComuna, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbxRegiones, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addComponent(correo))
                .addGap(0, 102, Short.MAX_VALUE))
        );
        formularioClientesLayout.setVerticalGroup(
            formularioClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formularioClientesLayout.createSequentialGroup()
                .addGroup(formularioClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formularioClientesLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(lblFormularioClientes)
                        .addGap(58, 58, 58)
                        .addGroup(formularioClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRut)
                            .addComponent(txtRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRegion)
                            .addComponent(cbxRegiones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(formularioClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombre)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formularioClientesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(formularioClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblComuna)
                            .addComponent(cbxComuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(formularioClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellidoPaterno)
                    .addComponent(txtApPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDireccion)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(formularioClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formularioClientesLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(formularioClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblApellidoMaterno)
                            .addComponent(txtApMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(formularioClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCelular)
                            .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(formularioClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTelefono)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(formularioClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(correo)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(formularioClientesLayout.createSequentialGroup()
                        .addGap(18, 199, Short.MAX_VALUE)
                        .addGroup(formularioClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnIngresarCliente)
                            .addComponent(BtnLimpiarCliente))
                        .addGap(76, 76, 76))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(formularioClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 818, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(formularioClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxRegionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxRegionesActionPerformed
        if (cbxRegiones.getSelectedItem() != Constantes.MSJ_SELECCIONE_REGION) {
            System.out.println(cbxRegiones.getSelectedItem());
            String nomReg = cbxRegiones.getSelectedItem().toString();

            int idReg = 0;
            for (Region region : this.regionGlobal) {
                if (region.getRegion().equals(nomReg)) {
                    idReg = region.getIdRegion();
                    System.out.println("id Reg " + idReg);
                }
            }

            System.out.println(idReg);
            LocacionDAO dao = new LocacionDAO();
            List<Comuna> listaComunas = dao.getComunaByIdRegion(idReg);
            cbxComuna.removeAllItems();
            
            if (!listaComunas.isEmpty()) {

                cbxComuna.addItem("Seleccione una Comuna");
                cbxComuna.setEnabled(true);
                for (Comuna comuna : listaComunas) {
                    cbxComuna.addItem(comuna.getComuna());
                    
                }
                String comunaSel = cbxComuna.getSelectedItem().toString();
                comunaGlobal = listaComunas;
                System.out.println("comuna seleccionada" + comunaSel);

                for (Comuna comun : this.comunaGlobal) {
                    if (comun.getComuna().equals(comunaSel)) {
                        idComunaSelect = comun.getIdComuna();
                        System.out.println("id comuna selected "+idComunaSelect);
                    }
                }
            }
        }


    }//GEN-LAST:event_cbxRegionesActionPerformed

    private void BtnLimpiarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpiarClienteActionPerformed
        limpiar();
        
    }//GEN-LAST:event_BtnLimpiarClienteActionPerformed

    private void txtRutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRutActionPerformed
        txtRut.transferFocus();
    }//GEN-LAST:event_txtRutActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        txtNombre.transferFocus();
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtApPaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApPaternoActionPerformed
        txtApPaterno.transferFocus();
    }//GEN-LAST:event_txtApPaternoActionPerformed

    private void txtApMaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApMaternoActionPerformed
        txtApMaterno.transferFocus();
    }//GEN-LAST:event_txtApMaternoActionPerformed

    private void txtCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCelularActionPerformed
        txtCelular.transferFocus();
    }//GEN-LAST:event_txtCelularActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        txtTelefono.transferFocus();
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        txtCorreo.transferFocus();
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void BtnIngresarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIngresarClienteActionPerformed
        Conexion con = new Conexion();
        Connection cn = con.getCon();
        String rut = "", nom = "", apP = "", apM = "", corr = "", dir = "";
        int tel = 0, cel = 0, idCom = 0;
        boolean campoVacio = true;

        if (!txtRut.getText().equals("")) {
            rut = txtRut.getText();
            campoVacio = false;
        }
        if (!txtNombre.getText().equals("")) {
            nom = txtNombre.getText();
            campoVacio = false;
        }
        if (txtApPaterno.getText().equals("")) {
            apP = txtApPaterno.getText();
            campoVacio = false;
        }
        if (!txtApMaterno.getText().equals("")) {
            apM = txtApMaterno.getText();
            campoVacio = false;
        }
        if (!txtCorreo.getText().equals("")) {
            corr = txtCorreo.getText();
            campoVacio = false;
        }
        if (!txtDireccion.getText().equals("")) {
            dir = txtDireccion.getText();
            campoVacio = false;
        }
        if (!txtCelular.getText().equals("")) {
            cel = Integer.parseInt(txtCelular.getText());
            campoVacio = false;
        }
        if (txtTelefono.getText().equals("")) {
            tel = Integer.parseInt(txtTelefono.getText());
            campoVacio = false;
        }
        idCom = idComunaSelect;
        if (idCom != 0) {
            campoVacio = false;
        }

        if (campoVacio) {
            JOptionPane.showMessageDialog(this, "LLene todos los campos antes de guardar");
        } else {
            System.out.println("idComunaSelected = " + idCom);
            ClienteDAO clienteDao = new ClienteDAO();
            clienteDao.insertCliente(idCom, nom, apP, apM, rut, dir, tel, cel, corr);
        }


    }//GEN-LAST:event_BtnIngresarClienteActionPerformed

    private void cbxRegionesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxRegionesItemStateChanged

    }//GEN-LAST:event_cbxRegionesItemStateChanged

    private void cbxRegionesPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_cbxRegionesPropertyChange
        // TODO add your handling code here:

    }//GEN-LAST:event_cbxRegionesPropertyChange

    private void cbxComunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxComunaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxComunaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnIngresarCliente;
    private javax.swing.JButton BtnLimpiarCliente;
    private javax.swing.JComboBox<String> cbxComuna;
    private javax.swing.JComboBox<String> cbxRegiones;
    private javax.swing.JLabel correo;
    private javax.swing.JPanel formularioClientes;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JLabel lblApellidoMaterno;
    private javax.swing.JLabel lblApellidoPaterno;
    private javax.swing.JLabel lblCelular;
    private javax.swing.JLabel lblComuna;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblFormularioClientes;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblRegion;
    private javax.swing.JLabel lblRut;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JTextField txtApMaterno;
    private javax.swing.JTextField txtApPaterno;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRut;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
