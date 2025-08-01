package View;

import Controller.FacturaController;
import Controller.UsuarioController;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ProcesoDeFactura extends javax.swing.JFrame {

    UsuarioController controller = new UsuarioController("", 0, 0);
    FacturaController controller2 = new FacturaController(0, 0 ,0);

    public int horasConsumoIngresadas;
    public String nombreIngresado;
    public int edadIngresada;
    public int identificacionIngresada;
    public int estratoIngresado;

    public ProcesoDeFactura() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButtonTipsDeAhorro = new javax.swing.JButton();
        jButtonDocumento = new javax.swing.JButton();
        jButtonCerrar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldEdad = new javax.swing.JTextField();
        jTextFieldIdentificacion = new javax.swing.JTextField();
        jTextFieldEstrato = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldHorasConsumo = new javax.swing.JTextField();
        jButtonGuardarInfo = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabelInfoConsumo = new javax.swing.JLabel();
        jLabelError = new javax.swing.JLabel();
        jLabelMensajeHoras = new javax.swing.JLabel();
        jLabelUbicacionArchivo1 = new javax.swing.JLabel();
        jLabelArchivoCreado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(196, 218, 250));
        jPanel1.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(77, 130, 188));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel3.setBackground(new java.awt.Color(196, 218, 250));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Monocraft", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("PROCESO DE FACTURA");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addComponent(jLabel1)
                .addContainerGap(240, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 80));

        jPanel4.setBackground(new java.awt.Color(196, 218, 250));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setForeground(new java.awt.Color(204, 204, 204));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonTipsDeAhorro.setBackground(new java.awt.Color(77, 130, 188));
        jButtonTipsDeAhorro.setFont(new java.awt.Font("Monocraft", 1, 12)); // NOI18N
        jButtonTipsDeAhorro.setForeground(new java.awt.Color(0, 0, 0));
        jButtonTipsDeAhorro.setText("TIPS DE AHORRO");
        jButtonTipsDeAhorro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTipsDeAhorroActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonTipsDeAhorro, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 270, 150, -1));

        jButtonDocumento.setBackground(new java.awt.Color(77, 130, 188));
        jButtonDocumento.setFont(new java.awt.Font("Monocraft", 1, 12)); // NOI18N
        jButtonDocumento.setForeground(new java.awt.Color(0, 0, 0));
        jButtonDocumento.setText("CREAR DOCUMENTO.TXT");
        jButtonDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDocumentoActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 190, 20));

        jButtonCerrar.setBackground(new java.awt.Color(77, 130, 188));
        jButtonCerrar.setFont(new java.awt.Font("Monocraft", 1, 12)); // NOI18N
        jButtonCerrar.setForeground(new java.awt.Color(0, 0, 0));
        jButtonCerrar.setText("CERRAR");
        jButtonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCerrarActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 300, 150, -1));

        jLabel6.setFont(new java.awt.Font("Monocraft", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("ingrese sus datos nuevamente ");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 20));

        jPanel10.setBackground(new java.awt.Color(196, 218, 250));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.setForeground(new java.awt.Color(196, 218, 250));

        jTextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreActionPerformed(evt);
            }
        });

        jTextFieldEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEdadActionPerformed(evt);
            }
        });

        jTextFieldIdentificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdentificacionActionPerformed(evt);
            }
        });

        jTextFieldEstrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEstratoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Monocraft", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("HORAS CONSUMO:");

        jTextFieldHorasConsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldHorasConsumoActionPerformed(evt);
            }
        });

        jButtonGuardarInfo.setBackground(new java.awt.Color(77, 130, 188));
        jButtonGuardarInfo.setFont(new java.awt.Font("Monocraft", 1, 12)); // NOI18N
        jButtonGuardarInfo.setForeground(new java.awt.Color(0, 0, 0));
        jButtonGuardarInfo.setText("GUARDAR");
        jButtonGuardarInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarInfoActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(102, 153, 255));
        jLabel7.setFont(new java.awt.Font("Monocraft", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("ESTRATO:");

        jLabel10.setBackground(new java.awt.Color(77, 130, 188));
        jLabel10.setFont(new java.awt.Font("Monocraft", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("IDENTIFICACION:");

        jLabel11.setBackground(new java.awt.Color(102, 153, 255));
        jLabel11.setFont(new java.awt.Font("Monocraft", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("EDAD:");

        jLabel9.setBackground(new java.awt.Color(102, 153, 255));
        jLabel9.setFont(new java.awt.Font("Monocraft", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("NOMBRE:");

        jLabelInfoConsumo.setFont(new java.awt.Font("Monocraft", 0, 12)); // NOI18N
        jLabelInfoConsumo.setForeground(new java.awt.Color(0, 0, 0));

        jLabelError.setFont(new java.awt.Font("Monocraft", 0, 12)); // NOI18N
        jLabelError.setForeground(new java.awt.Color(0, 0, 0));

        jLabelMensajeHoras.setFont(new java.awt.Font("Monocraft", 0, 12)); // NOI18N
        jLabelMensajeHoras.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonGuardarInfo)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelError, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(120, 120, 120))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addGap(106, 106, 106)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldEdad, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                                    .addComponent(jTextFieldNombre)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldHorasConsumo, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                                    .addComponent(jTextFieldEstrato)
                                    .addComponent(jTextFieldIdentificacion))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelInfoConsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelMensajeHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)))
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(jTextFieldEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jTextFieldIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldEstrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldHorasConsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelInfoConsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelMensajeHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonGuardarInfo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelError, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel4.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 360, 280));

        jLabelUbicacionArchivo1.setFont(new java.awt.Font("Monocraft", 0, 12)); // NOI18N
        jLabelUbicacionArchivo1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel4.add(jLabelUbicacionArchivo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 360, 20));

        jLabelArchivoCreado.setFont(new java.awt.Font("Monocraft", 0, 12)); // NOI18N
        jLabelArchivoCreado.setForeground(new java.awt.Color(0, 0, 0));
        jPanel4.add(jLabelArchivoCreado, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 180, 20));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 750, 330));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 774, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldHorasConsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldHorasConsumoActionPerformed
        // TODO add your handling code here:
        try {
            int horasConsumoIngresadas = Integer.parseInt(jTextFieldHorasConsumo.getText().trim());
            controller2.setHorasConsumo(horasConsumoIngresadas);
            controller2.getHorasConsumo();
        } catch (NumberFormatException e) {
            jLabelMensajeHoras.setText("Por favor ingrese un número válido de horas.");
        }
    }//GEN-LAST:event_jTextFieldHorasConsumoActionPerformed

    private void jButtonTipsDeAhorroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTipsDeAhorroActionPerformed
        // TODO add your handling code here:
        TipsDeAhorro mensaje = new TipsDeAhorro();
        mensaje.setVisible(true);
    }//GEN-LAST:event_jButtonTipsDeAhorroActionPerformed

    private void jButtonDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDocumentoActionPerformed
        // TODO add your handling code here:
        try {
            controller2.procesoFactura(controller2.getEstrato());

//            if (controller2.getValorKWH() <= 0) {
//                jLabelError.setText("Error en el cálculo del valor de la factura.");
//                return;
//            }

            File archivo = new File("factura_usuario.txt");
            File archivoCreado = new File(
                    "C://Users//isaac//OneDrive//Documentos//.codigos//JAVA//Vacacional//Vacacional//ProyectoVacacional");
            FileWriter escritorArchivo = new FileWriter(archivo);
            PrintWriter escritor = new PrintWriter(escritorArchivo);
//            if (controller2.getHorasConsumo() == 0 || controller2.getValorKWH() == 0.0) {
//                jLabelUbicacionArchivo.setText("Debe guardar la información primero.");
//                return;
//            }
            controller.setNombre(nombreIngresado);
            controller.setEdad(edadIngresada);
            controller2.setEstrato(estratoIngresado);
            controller.setIdentificacion(identificacionIngresada);
            controller2.setHorasConsumo(horasConsumoIngresadas);

            escritor.println("NOMBRE: " + controller.getNombre());
            escritor.println("EDAD: " + controller.getEdad());
            escritor.println("IDENTIFICACION: " + controller.getIdentificacion());
            escritor.println("ESTRATO: " + controller2.getEstrato());
            escritor.println("HORAS DE CONSUMO: " + controller2.getHorasConsumo());
            escritor.println("VALOR TOTAL FACTURA: $" + controller2.getValorKWH());
            escritor.close();

            jLabelUbicacionArchivo1.setText("Archivo creado: " + archivo.getAbsolutePath());

        } catch (IOException e) {
            jLabelUbicacionArchivo1.setText("Error al crear el archivo.");
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButtonDocumentoActionPerformed

    private void jButtonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCerrarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButtonCerrarActionPerformed

    private void jButtonGuardarInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarInfoActionPerformed
        // TODO add your handling code here:
        try {
            horasConsumoIngresadas = Integer.parseInt(jTextFieldHorasConsumo.getText().trim());

            controller.setNombre(nombreIngresado);
            controller.setEdad(edadIngresada);
            controller2.setEstrato(estratoIngresado);
            controller.setIdentificacion(identificacionIngresada);
            controller2.setHorasConsumo(horasConsumoIngresadas);

            if (controller2.getEstrato() <= 0) {
                jLabelError.setText("Estrato no válido. Configúrelo antes de continuar.");
                return;
            }

            controller2.procesoFactura(controller2.getEstrato());

            if (controller2.getValorKWH() <= 0) {
                jLabelError.setText("Error en el cálculo del valor de la factura.");
                return;
            }
            jLabelArchivoCreado.setText("Información guardada correctamente.");
            jLabelInfoConsumo.setText("El valor total de las horas consumidas es: $" + controller2.getValorKWH());
        } catch (NumberFormatException e) {
            jLabelMensajeHoras.setText("Por favor ingrese un número válido de horas.");
        }

    }//GEN-LAST:event_jButtonGuardarInfoActionPerformed

    private void jTextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreActionPerformed
        // TODO add your handling code here:
        nombreIngresado = jTextFieldNombre.getText().trim();
    }//GEN-LAST:event_jTextFieldNombreActionPerformed

    private void jTextFieldEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEdadActionPerformed
        // TODO add your handling code here:
        edadIngresada = Integer.parseInt(jTextFieldEdad.getText().trim());
    }//GEN-LAST:event_jTextFieldEdadActionPerformed

    private void jTextFieldIdentificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdentificacionActionPerformed
        // TODO add your handling code here:
        identificacionIngresada = Integer.parseInt(jTextFieldIdentificacion.getText().trim());
    }//GEN-LAST:event_jTextFieldIdentificacionActionPerformed

    private void jTextFieldEstratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEstratoActionPerformed
        // TODO add your handling code here:
        estratoIngresado = Integer.parseInt(jTextFieldEstrato.getText().trim());
    }//GEN-LAST:event_jTextFieldEstratoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCerrar;
    private javax.swing.JButton jButtonDocumento;
    private javax.swing.JButton jButtonGuardarInfo;
    private javax.swing.JButton jButtonTipsDeAhorro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelArchivoCreado;
    private javax.swing.JLabel jLabelError;
    private javax.swing.JLabel jLabelInfoConsumo;
    private javax.swing.JLabel jLabelMensajeHoras;
    private javax.swing.JLabel jLabelUbicacionArchivo1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextFieldEdad;
    private javax.swing.JTextField jTextFieldEstrato;
    private javax.swing.JTextField jTextFieldHorasConsumo;
    private javax.swing.JTextField jTextFieldIdentificacion;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables
}
