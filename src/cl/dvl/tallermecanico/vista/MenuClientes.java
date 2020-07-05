/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.dvl.tallermecanico.vista;

import cl.dvl.tallermecanico.interfaz.Cliente;
import cl.dvl.tallermecanico.interfaz.Comuna;
import cl.dvl.tallermecanico.interfaz.Region;
import cl.dvl.tallermecanico.interfaz.Taller;
import cl.dvl.tallermecanico.modelo.ClienteDAO;
import cl.dvl.tallermecanico.modelo.LocacionDAO;
import cl.dvl.tallermecanico.modelo.TallerDAO;
import cl.dvl.tallermecanico.utils.Conexion;
import cl.dvl.tallermecanico.utils.Constantes;
import java.awt.Component;
import java.sql.Connection;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MenuClientes extends javax.swing.JInternalFrame {

    private List<Region> regionGlobal = new LinkedList<>();
    private List<Comuna> comunaGlobal = new LinkedList<>();
    private List<Taller> listaSucursales = new LinkedList<>();
    private List<ClienteDAO> listadoClientes = new LinkedList<>();

    private int idComunaSelect;
    private Component confirmacion;

    public MenuClientes() {
        initComponents();

        LocacionDAO dao = new LocacionDAO();
        ClienteDAO cliente = new ClienteDAO();
        List<Region> listaRegiones = dao.getRegion();

        cbxRegiones.addItem(Constantes.MSJ_SELECCIONE_REGION);
        for (Region region : listaRegiones) {
            cbxRegiones.addItem(region.getRegion());
        }
        regionGlobal = listaRegiones;
    }

    void limpiar() {
        txtNombre.setText("");
        txtApPaterno.setText("");
        txtApMaterno.setText("");
        txtTelefono.setText("");
        txtDireccion.setText("");
        txtCorreo.setText("");
        txtRut.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupRbtnBusca = new javax.swing.ButtonGroup();
        grupFiltros = new javax.swing.ButtonGroup();
        tabbedListar = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        MenuIngresar = new javax.swing.JPanel();
        lblRut = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblApPaterno = new javax.swing.JLabel();
        lblApMaterno = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        txtRut = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApPaterno = new javax.swing.JTextField();
        txtApMaterno = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        cbxRegiones = new javax.swing.JComboBox<>();
        cbxComunas = new javax.swing.JComboBox<>();
        txtDireccion = new javax.swing.JTextField();
        lblRegion = new javax.swing.JLabel();
        lblComuna = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        txtBusquedaClienteRut = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        lvlRutBuscar = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtRutt = new javax.swing.JTextField();
        txtNom = new javax.swing.JTextField();
        txtApPat = new javax.swing.JTextField();
        txtApMat = new javax.swing.JTextField();
        txtTel = new javax.swing.JTextField();
        txtCorr = new javax.swing.JTextField();
        txtDir = new javax.swing.JTextField();
        cmbRegiones2 = new javax.swing.JComboBox<>();
        cbxComunas2 = new javax.swing.JComboBox<>();
        btnGuardar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        rbtnComuna = new javax.swing.JRadioButton();
        rbtnRegion = new javax.swing.JRadioButton();
        rbtnTodos = new javax.swing.JRadioButton();
        btnListar = new javax.swing.JButton();
        rbtnTaller = new javax.swing.JRadioButton();
        cmbFiltrar = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaListaCientes = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();

        setBorder(null);
        setTitle("Clientes");
        setToolTipText("");
        setFocusable(false);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/twotone_perm_identity_black_18dp.png"))); // NOI18N

        lblRut.setText("Rut:");

        lblNombre.setText("Nombre:");

        lblApPaterno.setText("Apelllido Paterno:");

        lblApMaterno.setText("Apellido Materno:");

        lblTelefono.setText("Telefono:");

        lblCorreo.setText("Correo:");

        txtRut.setToolTipText("");
        txtRut.setSelectionColor(new java.awt.Color(204, 204, 255));
        txtRut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRutActionPerformed(evt);
            }
        });

        txtNombre.setSelectionColor(new java.awt.Color(0, 0, 0));
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        txtApPaterno.setSelectionColor(new java.awt.Color(0, 0, 0));
        txtApPaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApPaternoActionPerformed(evt);
            }
        });

        txtApMaterno.setSelectionColor(new java.awt.Color(0, 0, 0));
        txtApMaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApMaternoActionPerformed(evt);
            }
        });

        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });

        txtCorreo.setSelectionColor(new java.awt.Color(0, 0, 0));

        cbxRegiones.setEditable(true);
        cbxRegiones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxRegionesActionPerformed(evt);
            }
        });

        cbxComunas.setEditable(true);
        cbxComunas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxComunasActionPerformed(evt);
            }
        });

        txtDireccion.setSelectionColor(new java.awt.Color(0, 0, 0));

        lblRegion.setText("Región:");

        lblComuna.setText("Comuna:");

        lblDireccion.setText("Dirección:");

        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Datos Personales");

        javax.swing.GroupLayout MenuIngresarLayout = new javax.swing.GroupLayout(MenuIngresar);
        MenuIngresar.setLayout(MenuIngresarLayout);
        MenuIngresarLayout.setHorizontalGroup(
            MenuIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuIngresarLayout.createSequentialGroup()
                .addGroup(MenuIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(MenuIngresarLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(MenuIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MenuIngresarLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(57, 57, 57))
                            .addGroup(MenuIngresarLayout.createSequentialGroup()
                                .addGroup(MenuIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(MenuIngresarLayout.createSequentialGroup()
                                        .addGroup(MenuIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblApMaterno)
                                            .addComponent(lblTelefono))
                                        .addGroup(MenuIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(MenuIngresarLayout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(MenuIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(txtApPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtRut, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtApMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuIngresarLayout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(lblApPaterno)
                                    .addComponent(lblNombre)
                                    .addComponent(lblRut))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                                .addGroup(MenuIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblRegion)
                                    .addComponent(lblDireccion)
                                    .addComponent(lblComuna)
                                    .addComponent(lblCorreo))
                                .addGap(402, 402, 402))))
                    .addGroup(MenuIngresarLayout.createSequentialGroup()
                        .addGap(359, 359, 359)
                        .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(242, 242, 242)
                        .addGroup(MenuIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDireccion)
                            .addComponent(cbxRegiones, 0, 384, Short.MAX_VALUE)
                            .addComponent(cbxComunas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCorreo))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        MenuIngresarLayout.setVerticalGroup(
            MenuIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuIngresarLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(MenuIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRut)
                    .addComponent(txtRut, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(MenuIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuIngresarLayout.createSequentialGroup()
                        .addGroup(MenuIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombre)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDireccion))
                        .addGap(27, 27, 27)
                        .addGroup(MenuIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblApPaterno)
                            .addComponent(cbxRegiones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRegion))
                        .addGap(27, 27, 27)
                        .addGroup(MenuIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblApMaterno)
                            .addComponent(txtApMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxComunas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(MenuIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTelefono)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCorreo)))
                    .addGroup(MenuIngresarLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(lblComuna)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 197, Short.MAX_VALUE)
                .addGroup(MenuIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIngresar)
                    .addComponent(btnLimpiar))
                .addGap(117, 117, 117))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(MenuIngresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MenuIngresar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tabbedListar.addTab("Ingresar", jPanel1);

        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtBusquedaClienteRut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBusquedaClienteRutActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        lvlRutBuscar.setText("Rut:");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(lvlRutBuscar)
                .addGap(40, 40, 40)
                .addComponent(txtBusquedaClienteRut, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(btnBuscar)
                .addContainerGap(729, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(lvlRutBuscar)
                    .addComponent(txtBusquedaClienteRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        btnCancelar.setText("Cancelar");
        btnCancelar.setFocusable(false);

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel2.setText("Rut:");

        jLabel3.setText("Nombre:");

        jLabel4.setText("Apellido Paterno:");

        jLabel5.setText("Apellido Materno:");

        jLabel6.setText("Teléfono:");

        jLabel7.setText("Correo:");

        jLabel8.setText("Dirección:");

        jLabel9.setText("Región:");

        jLabel10.setText("Comuna:");

        txtRutt.setEditable(false);
        txtRutt.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        txtRutt.setEnabled(false);
        txtRutt.setSelectedTextColor(new java.awt.Color(0, 204, 51));
        txtRutt.setSelectionColor(new java.awt.Color(204, 204, 255));
        txtRutt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRuttActionPerformed(evt);
            }
        });

        txtNom.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        txtNom.setEnabled(false);
        txtNom.setSelectedTextColor(new java.awt.Color(0, 204, 51));
        txtNom.setSelectionColor(new java.awt.Color(204, 204, 255));

        txtApPat.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        txtApPat.setEnabled(false);
        txtApPat.setSelectedTextColor(new java.awt.Color(0, 204, 51));
        txtApPat.setSelectionColor(new java.awt.Color(204, 204, 255));

        txtApMat.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        txtApMat.setEnabled(false);
        txtApMat.setSelectedTextColor(new java.awt.Color(0, 204, 51));
        txtApMat.setSelectionColor(new java.awt.Color(204, 204, 255));

        txtTel.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        txtTel.setEnabled(false);
        txtTel.setSelectedTextColor(new java.awt.Color(0, 204, 51));
        txtTel.setSelectionColor(new java.awt.Color(204, 204, 255));
        txtTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelActionPerformed(evt);
            }
        });

        txtCorr.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        txtCorr.setEnabled(false);
        txtCorr.setSelectedTextColor(new java.awt.Color(0, 204, 51));
        txtCorr.setSelectionColor(new java.awt.Color(204, 204, 255));

        txtDir.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        txtDir.setEnabled(false);
        txtDir.setSelectedTextColor(new java.awt.Color(0, 204, 51));
        txtDir.setSelectionColor(new java.awt.Color(204, 204, 255));

        cmbRegiones2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbRegiones2ActionPerformed(evt);
            }
        });

        cbxComunas2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxComunas2ActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(jLabel4)))
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel6))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtApPat)
                            .addComponent(txtNom)
                            .addComponent(txtApMat)
                            .addComponent(txtTel)
                            .addComponent(txtRutt, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(88, 88, 88)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addGap(13, 13, 13)))
                            .addComponent(jLabel10))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cmbRegiones2, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtDir, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCorr, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxComunas2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(btnModificar)
                        .addGap(114, 114, 114)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(124, 124, 124)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(30, 30, 30)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(txtDir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtApPat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(cmbRegiones2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtRutt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(txtCorr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(cbxComunas2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(24, 24, 24)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(82, 82, 82)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnModificar)
                    .addComponent(btnGuardar)
                    .addComponent(btnEliminar))
                .addGap(56, 56, 56))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 97, Short.MAX_VALUE))
        );

        tabbedListar.addTab("Buscar", jPanel2);

        jPanel11.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        grupFiltros.add(rbtnComuna);
        rbtnComuna.setText("Comuna");
        rbtnComuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnComunaActionPerformed(evt);
            }
        });

        grupFiltros.add(rbtnRegion);
        rbtnRegion.setText("Región");
        rbtnRegion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnRegionActionPerformed(evt);
            }
        });

        grupFiltros.add(rbtnTodos);
        rbtnTodos.setText("Todos");
        rbtnTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnTodosActionPerformed(evt);
            }
        });

        btnListar.setText("Filtrar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        grupFiltros.add(rbtnTaller);
        rbtnTaller.setText("Taller");
        rbtnTaller.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnTallerActionPerformed(evt);
            }
        });

        cmbFiltrar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cmbFiltrar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbtnTodos)
                                    .addComponent(rbtnTaller)
                                    .addComponent(rbtnComuna)
                                    .addComponent(rbtnRegion)))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(btnListar)))
                        .addGap(0, 20, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(rbtnComuna)
                .addGap(18, 18, 18)
                .addComponent(rbtnRegion)
                .addGap(18, 18, 18)
                .addComponent(rbtnTaller)
                .addGap(18, 18, 18)
                .addComponent(rbtnTodos)
                .addGap(31, 31, 31)
                .addComponent(cmbFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btnListar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tablaListaCientes.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tablaListaCientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Rut", "Nombre", "Apellido Paterno", "Apellido Materno", "Dirección", "Comuna", "Región", "Telefono", "Correo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaListaCientes.setColumnSelectionAllowed(true);
        jScrollPane3.setViewportView(tablaListaCientes);
        tablaListaCientes.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (tablaListaCientes.getColumnModel().getColumnCount() > 0) {
            tablaListaCientes.getColumnModel().getColumn(0).setMaxWidth(80);
            tablaListaCientes.getColumnModel().getColumn(1).setMaxWidth(100);
            tablaListaCientes.getColumnModel().getColumn(2).setMaxWidth(120);
            tablaListaCientes.getColumnModel().getColumn(3).setMaxWidth(120);
            tablaListaCientes.getColumnModel().getColumn(4).setMaxWidth(200);
            tablaListaCientes.getColumnModel().getColumn(5).setMaxWidth(90);
            tablaListaCientes.getColumnModel().getColumn(6).setMaxWidth(100);
            tablaListaCientes.getColumnModel().getColumn(7).setMaxWidth(75);
            tablaListaCientes.getColumnModel().getColumn(8).setMaxWidth(200);
        }

        jButton7.setText("Exportar");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 964, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton7)
                .addGap(460, 460, 460))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE))
                .addGap(35, 35, 35)
                .addComponent(jButton7)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        tabbedListar.addTab("Listar", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedListar)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tabbedListar, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtnTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnTodosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnTodosActionPerformed

    private void rbtnComunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnComunaActionPerformed
        cmbFiltrar.removeAllItems();
        LocacionDAO dao = new LocacionDAO();
        List<Comuna> listaComunas = dao.getComuna();
        for (Comuna comuna : listaComunas) {
            cmbFiltrar.addItem(comuna.getComuna());
        }
    }//GEN-LAST:event_rbtnComunaActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed

    }//GEN-LAST:event_btnListarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        Conexion con = new Conexion();
        Connection cn = con.getCon();
        String rut = "", nom = "", apP = "", apM = "", corr = "", dir = "";
        int idCom = 0;
        Integer tel = 0;
        boolean campoVacio = true;

        if (campoVacio) {

        }
        if (idComunaSelect > 0) {
            idCom = idComunaSelect;
        }
        if (!txtRut.getText().equals("")) {
            rut = txtRut.getText();
            campoVacio = false;
        }
        if (!txtNombre.getText().equals("")) {
            nom = txtNombre.getText();
            campoVacio = false;
        }
        if (!txtApPaterno.getText().equals("")) {
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
        if (!txtTelefono.getText().equals("")) {
            tel = Integer.parseInt(txtTelefono.getText());
            campoVacio = false;
        }

        ClienteDAO clienteDao = new ClienteDAO();
        boolean respuestaMetodo = clienteDao.insertCliente(idCom, nom, apP, apM, rut, dir, tel, corr);

        if (!respuestaMetodo) {
            JOptionPane.showMessageDialog(confirmacion, "Cliente agregado exitosamente");
            limpiar();
        } else {
            JOptionPane.showMessageDialog(this, "LLene todos los campos antes de guardar");
        }

    }//GEN-LAST:event_btnIngresarActionPerformed

    private void cbxComunasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxComunasActionPerformed
        String comunaSel = cbxComunas.getSelectedItem().toString();
        for (Comuna comun : this.comunaGlobal) {
            if (comun.getComuna().equals(comunaSel)) {
                idComunaSelect = comun.getIdComuna();
            }
        }
    }//GEN-LAST:event_cbxComunasActionPerformed
    private void cbxRegionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxRegionesActionPerformed
        if (cbxRegiones.getSelectedItem() != Constantes.MSJ_SELECCIONE_REGION) {
            String nomReg = cbxRegiones.getSelectedItem().toString();

            int idReg = 0;
            for (Region region : this.regionGlobal) {
                if (region.getRegion().equals(nomReg)) {
                    idReg = region.getIdRegion();
                }
            }
            System.out.println(idReg);
            LocacionDAO dao = new LocacionDAO();
            List<Comuna> listaComunas = dao.getComunaByIdRegion(idReg);
            this.comunaGlobal = listaComunas;
            cbxComunas.removeAllItems();

            if (!listaComunas.isEmpty()) {
                cbxComunas.addItem("Seleccione una Comuna");
                cbxComunas.setEnabled(true);
                for (Comuna comuna : listaComunas) {
                    cbxComunas.addItem(comuna.getComuna());
                }
            }
        }
    }//GEN-LAST:event_cbxRegionesActionPerformed

    private void txtApMaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApMaternoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApMaternoActionPerformed

    private void txtRutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRutActionPerformed

    }//GEN-LAST:event_txtRutActionPerformed
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        ClienteDAO clienteDao = new ClienteDAO();
        Cliente cliente = clienteDao.buscarCliente(txtBusquedaClienteRut.getText());
        System.out.println(cliente);
        txtRutt.setText(txtBusquedaClienteRut.getText());
        txtNom.setText(cliente.getNombre());
        txtApPat.setText(cliente.getApellidoP());
        txtApMat.setText(cliente.getApellidoM());
        txtTel.setText(new Integer(cliente.getTelefono()).toString());
        txtCorr.setText(cliente.getCorreo());
        txtDir.setText(cliente.getDireccion());
        cmbRegiones2.addItem(cliente.getRegion());
        cbxComunas2.addItem(cliente.getComuna());

    }//GEN-LAST:event_btnBuscarActionPerformed
    public void eliminarCliente() {

    }
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        Object[] opciones = {"Aceptar", "Cancelar"};
        int election = JOptionPane.showOptionDialog(null, "¿Desea eliminar Cliente?", "Confirmar",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, opciones, "aceptar");
        if (election == JOptionPane.YES_OPTION) {

        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void rbtnTallerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnTallerActionPerformed
        cmbFiltrar.removeAllItems();
        TallerDAO tall = new TallerDAO();
        List<Taller> listaTalleres = tall.getTaller();
        for (Taller taller : listaTalleres) {
            cmbFiltrar.addItem(taller.getTaller());
        }
    }//GEN-LAST:event_rbtnTallerActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void cmbRegiones2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbRegiones2ActionPerformed

    }//GEN-LAST:event_cmbRegiones2ActionPerformed

    private void cbxComunas2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxComunas2ActionPerformed

    }//GEN-LAST:event_cbxComunas2ActionPerformed

    private void txtBusquedaClienteRutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBusquedaClienteRutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBusquedaClienteRutActionPerformed

    private void txtRuttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRuttActionPerformed

    }//GEN-LAST:event_txtRuttActionPerformed

    private void txtApPaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApPaternoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApPaternoActionPerformed

    private void txtTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        txtRutt.enable(true);
        txtNom.enable(true);
        txtApPat.enable(true);
        txtApMat.enable(true);
        txtTel.enable(true);
        txtCorr.enable(true);
        txtDir.enable(true);
        LocacionDAO dao = new LocacionDAO();
        List<Region> listaRegiones = dao.getRegion();

        for (Region region : listaRegiones) {
            cmbRegiones2.addItem(region.getRegion());
        }
        regionGlobal = listaRegiones;


    }//GEN-LAST:event_btnModificarActionPerformed

    private void rbtnRegionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnRegionActionPerformed
        cmbFiltrar.removeAllItems();
        LocacionDAO dao = new LocacionDAO();
        List<Region> listaRegiones = dao.getRegion();
        for (Region region : listaRegiones) {
            cmbFiltrar.addItem(region.getRegion());
        }
    }//GEN-LAST:event_rbtnRegionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MenuIngresar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox<String> cbxComunas;
    private javax.swing.JComboBox<String> cbxComunas2;
    private javax.swing.JComboBox<String> cbxRegiones;
    private javax.swing.JComboBox<String> cmbFiltrar;
    private javax.swing.JComboBox<String> cmbRegiones2;
    private javax.swing.ButtonGroup grupFiltros;
    private javax.swing.ButtonGroup grupRbtnBusca;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblApMaterno;
    private javax.swing.JLabel lblApPaterno;
    private javax.swing.JLabel lblComuna;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblRegion;
    private javax.swing.JLabel lblRut;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lvlRutBuscar;
    private javax.swing.JRadioButton rbtnComuna;
    private javax.swing.JRadioButton rbtnRegion;
    private javax.swing.JRadioButton rbtnTaller;
    private javax.swing.JRadioButton rbtnTodos;
    private javax.swing.JTabbedPane tabbedListar;
    private javax.swing.JTable tablaListaCientes;
    private javax.swing.JTextField txtApMat;
    private javax.swing.JTextField txtApMaterno;
    private javax.swing.JTextField txtApPat;
    private javax.swing.JTextField txtApPaterno;
    private javax.swing.JTextField txtBusquedaClienteRut;
    private javax.swing.JTextField txtCorr;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDir;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRut;
    private javax.swing.JTextField txtRutt;
    private javax.swing.JTextField txtTel;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
