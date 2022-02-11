/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import com.sun.media.sound.ModelOscillator;
import java.awt.Panel;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pedra
 */
public class conexion extends javax.swing.JFrame {

    public static final String URL = "jdbc:mysql://localhost:3306/konecta";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "";

    /**
     * Creates new form conexion
     */
    public conexion() throws SQLException {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        panelConecta = new javax.swing.JPanel();
        btnConectar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        PanelEjecucion = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtRef = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPeso1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCategoria = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        panelBotones = new javax.swing.JPanel();
        btnIngresa = new javax.swing.JButton();
        btnCrear = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnConsStock = new javax.swing.JButton();
        btnVenta = new javax.swing.JButton();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelConecta.setBackground(new java.awt.Color(204, 204, 204));
        panelConecta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnConectar.setBackground(new java.awt.Color(0, 51, 102));
        btnConectar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnConectar.setForeground(new java.awt.Color(255, 255, 255));
        btnConectar.setText("Conectar a base de datos");
        btnConectar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConectarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setText("KONECTA");

        PanelEjecucion.setBackground(new java.awt.Color(204, 204, 204));

        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Referencia", "Precio", "Peso", "Categoria", "Stock", "Fecha creacion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, true, true, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaProductos);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 696, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Productos", jPanel7);

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Producto"));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("Precio:");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("Nombre:");

        txtRef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRefActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setText("Referencia:");

        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setText("Peso(gr):");

        txtStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStockActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setText("Categoria:");

        txtPeso1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPeso1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setText("Stock:");

        txtCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCategoriaActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel8.setText("Fecha(aaaa-mm-dd):");

        txtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel9.setText("ID");

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre)
                    .addComponent(txtRef)
                    .addComponent(txtPrecio)
                    .addComponent(txtStock)
                    .addComponent(txtPeso1)
                    .addComponent(txtCategoria)
                    .addComponent(txtFecha)
                    .addComponent(txtId))
                .addContainerGap())
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel9))
                .addContainerGap(202, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(1, 1, 1)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(1, 1, 1)
                .addComponent(txtPeso1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
        );

        btnIngresa.setBackground(new java.awt.Color(0, 51, 102));
        btnIngresa.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresa.setText("INGRESAR A LA BASE");
        btnIngresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresaActionPerformed(evt);
            }
        });

        btnCrear.setBackground(new java.awt.Color(0, 51, 102));
        btnCrear.setForeground(new java.awt.Color(255, 255, 255));
        btnCrear.setText("CREAR");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(0, 51, 102));
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(0, 51, 102));
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("EDITAR");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnConsStock.setBackground(new java.awt.Color(0, 51, 102));
        btnConsStock.setForeground(new java.awt.Color(255, 255, 255));
        btnConsStock.setText("CONSULTA STOCK");
        btnConsStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsStockActionPerformed(evt);
            }
        });

        btnVenta.setBackground(new java.awt.Color(0, 51, 102));
        btnVenta.setForeground(new java.awt.Color(255, 255, 255));
        btnVenta.setText("VENTA");
        btnVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBotonesLayout = new javax.swing.GroupLayout(panelBotones);
        panelBotones.setLayout(panelBotonesLayout);
        panelBotonesLayout.setHorizontalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBotonesLayout.createSequentialGroup()
                        .addComponent(btnConsStock, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBotonesLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBotonesLayout.createSequentialGroup()
                                .addComponent(btnIngresa, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(241, 241, 241))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBotonesLayout.createSequentialGroup()
                                .addComponent(btnVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(288, 288, 288))))))
        );
        panelBotonesLayout.setVerticalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnIngresa, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCrear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnConsStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(47, 47, 47))
        );

        javax.swing.GroupLayout PanelEjecucionLayout = new javax.swing.GroupLayout(PanelEjecucion);
        PanelEjecucion.setLayout(PanelEjecucionLayout);
        PanelEjecucionLayout.setHorizontalGroup(
            PanelEjecucionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEjecucionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelEjecucionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane2)
                    .addComponent(panelBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PanelEjecucionLayout.setVerticalGroup(
            PanelEjecucionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEjecucionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PanelEjecucionLayout.createSequentialGroup()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelConectaLayout = new javax.swing.GroupLayout(panelConecta);
        panelConecta.setLayout(panelConectaLayout);
        panelConectaLayout.setHorizontalGroup(
            panelConectaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelEjecucion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelConectaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelConectaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnConectar)
                    .addComponent(jLabel1))
                .addGap(428, 428, 428))
        );
        panelConectaLayout.setVerticalGroup(
            panelConectaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelConectaLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConectar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(PanelEjecucion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(8, 8, 8))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelConecta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelConecta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConectarActionPerformed
        // TODO add your handling code here:
        try {
            Connection con = null;
            con = getConnection();

            PreparedStatement ps;
            ResultSet res;

            ps = con.prepareStatement("SELECT * FROM producto");
            res = ps.executeQuery();

            if (res.next()) {
                JOptionPane.showMessageDialog(null, "Conexion exitosa");

            } else {
                JOptionPane.showMessageDialog(null, "No hay productos");
            }
            con.close();

        } catch (Exception e) {
            System.out.println(e);

        }

    }//GEN-LAST:event_btnConectarActionPerformed

    public void actualizarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) tablaProductos.getModel();

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }

        try {
            Connection con = null;
            con = getConnection();

            PreparedStatement ps;
            ResultSet res;

            ps = con.prepareStatement("SELECT * FROM producto");
            res = ps.executeQuery();

            String[] fila = new String[8];

            while (res.next()) {
                fila[0] = res.getInt("idproducto") + "";
                fila[1] = res.getString("nombreProducto");
                fila[2] = res.getInt("referencia") + "";
                fila[3] = res.getInt("precio") + "";
                fila[4] = res.getDouble("peso") + "";
                fila[5] = res.getString("Categoria");
                fila[6] = res.getInt("stock") + "";
                fila[7] = res.getDate("fechaCreacion") + "";
                modelo.addRow(fila);
            }

        } catch (Exception e) {
            System.out.println(e);

        }

    }

    public void consultaStock() {
       DefaultTableModel modelo = (DefaultTableModel) tablaProductos.getModel();

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }

        try {
            Connection con = null;
            con = getConnection();

            PreparedStatement ps;
            ResultSet res;

            ps = con.prepareStatement("SELECT * FROM producto Order by stock desc");
            res = ps.executeQuery();

            String[] fila = new String[8];

            while (res.next()) {
                fila[0] = res.getInt("idproducto") + "";
                fila[1] = res.getString("nombreProducto");
                fila[2] = res.getInt("referencia") + "";
                fila[3] = res.getInt("precio") + "";
                fila[4] = res.getDouble("peso") + "";
                fila[5] = res.getString("Categoria");
                fila[6] = res.getInt("stock") + "";
                fila[7] = res.getDate("fechaCreacion") + "";
                modelo.addRow(fila);
                
            }

        } catch (Exception e) {
            System.out.println(e);

        }
    }

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtRefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRefActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRefActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void txtStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStockActionPerformed

    private void txtPeso1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPeso1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPeso1ActionPerformed

    private void btnIngresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresaActionPerformed
        // TODO add your handling code here:
        this.actualizarTabla();

    }//GEN-LAST:event_btnIngresaActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        // TODO add your handling code here:
        this.crearProducto();

    }//GEN-LAST:event_btnCrearActionPerformed

    public void crearProducto() {
        try {
            Connection con = null;
            con = getConnection();

            PreparedStatement ps;

            ps = con.prepareStatement("INSERT INTO  producto(idproducto,nombreProducto,referencia,precio,peso,Categoria,stock,fechaCreacion)VALUES(?,?,?,?,?,?,?,?)");

            ps.setInt(1, Integer.parseInt(txtId.getText()));
            ps.setString(2, txtNombre.getText());
            ps.setString(3, (txtRef.getText()));
            ps.setInt(4, Integer.parseInt(txtPrecio.getText()));
            ps.setDouble(5, Double.parseDouble(txtPeso1.getText()));
            ps.setString(6, txtCategoria.getText());
            ps.setInt(7, Integer.parseInt(txtStock.getText()));
            ps.setDate(8, Date.valueOf(txtFecha.getText()));
            int filas = ps.executeUpdate();
            if (filas > 0) {
                JOptionPane.showMessageDialog(null, "Producto guardado");
                this.limpiarCampos();
                this.actualizarTabla();
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo guardar");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    

    public void limpiarCampos() {
        txtId.setText("");
        txtNombre.setText("");
        txtRef.setText("");
        txtPrecio.setText("");
        txtPeso1.setText("");
        txtCategoria.setText("");
        txtStock.setText("");
        txtFecha.setText("");
    }


    private void txtCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCategoriaActionPerformed

    private void txtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        this.modificar();

    }//GEN-LAST:event_btnEditarActionPerformed

    public void modificar() {
        try {
            Connection con = null;
            con = getConnection();

            PreparedStatement ps;

            ps = con.prepareStatement("UPDATE  producto SET nombreProducto='" + txtNombre.getText() + "',referencia='" + txtRef.getText() + "',precio='" + txtPrecio.getText() + "',peso='" + txtPeso1.getText() + "',Categoria='" + txtCategoria.getText() + "',stock='" + txtStock.getText() + "',fechaCreacion='" + txtFecha.getText() + "' WHERE idproducto='" + txtId.getText() + "'");

            int filas = ps.executeUpdate();
            if (filas > 0) {
                JOptionPane.showMessageDialog(null, "Datos modificados");
                this.limpiarCampos();
                this.actualizarTabla();
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo guardar");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void borrarProductos() {
        int fila = tablaProductos.getSelectedRow();
        txtId.setText(tablaProductos.getValueAt(fila, 0).toString());
        int n = JOptionPane.showConfirmDialog(null, "Desea eliminar registro?", "Registro", JOptionPane.YES_OPTION, JOptionPane.YES_NO_OPTION);
        if (n == JOptionPane.YES_OPTION) {
            try {
                Connection con = null;
                con = getConnection();

                PreparedStatement ps;

                ps = con.prepareStatement("DELETE FROM  producto WHERE  nombreProducto='" + txtNombre.getText() + "'");

                int filas = ps.executeUpdate();
                if (filas > 0) {
                    JOptionPane.showMessageDialog(null, "Producto eliminado");
                    this.limpiarCampos();
                    this.actualizarTabla();
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo eliminar");
                }

            } catch (Exception e) {
                System.out.println(e);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se elimino el producto");
        }

    }

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        this.borrarProductos();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tablaProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProductosMouseClicked
        // TODO add your handling code here:
        int row = tablaProductos.getSelectedRow();
        txtId.setText(tablaProductos.getValueAt(row, 0).toString());
        txtNombre.setText(tablaProductos.getValueAt(row, 1).toString());
        txtRef.setText(tablaProductos.getValueAt(row, 2).toString());
        txtPrecio.setText(tablaProductos.getValueAt(row, 3).toString());
        txtPeso1.setText(tablaProductos.getValueAt(row, 4).toString());
        txtCategoria.setText(tablaProductos.getValueAt(row, 5).toString());
        txtStock.setText(tablaProductos.getValueAt(row, 6).toString());
        txtFecha.setText(tablaProductos.getValueAt(row, 7).toString());
    }//GEN-LAST:event_tablaProductosMouseClicked

    private void btnConsStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsStockActionPerformed
        // TODO add your handling code here:
        this.consultaStock();
    }//GEN-LAST:event_btnConsStockActionPerformed

    private void btnVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVentaActionPerformed

    public static Connection getConnection() {
        Connection con = null;
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(URL, USERNAME, PASSWORD);

        } catch (Exception e) {
            System.out.println(e);
        }
        return con;

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
            java.util.logging.Logger.getLogger(conexion.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(conexion.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(conexion.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(conexion.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new conexion().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelEjecucion;
    private javax.swing.JButton btnConectar;
    private javax.swing.JButton btnConsStock;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnIngresa;
    private javax.swing.JButton btnVenta;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel panelConecta;
    private javax.swing.JTable tablaProductos;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPeso1;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtRef;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables
}
