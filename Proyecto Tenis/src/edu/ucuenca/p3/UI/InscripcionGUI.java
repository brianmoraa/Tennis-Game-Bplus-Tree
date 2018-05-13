/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucuenca.p3.UI;

import edu.ucuenca.p3.Modulos.Inscripcion;
import edu.ucuenca.p3.Modulos.Jugador;
import edu.ucuenca.p3.Modulos.Participante;
import edu.ucuenca.p3.Modulos.Torneo;
import edu.ucuenca.p3.SRV.exceptions.InscripcionExcepcionEdad;
import edu.ucuenca.p3.SRV.exceptions.InscripicionExistenteException;
import edu.ucuenca.p3.SRV.ParticipantesSRV;
import edu.ucuenca.p3.SRV.TorneoSRV;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author andre
 */
public class InscripcionGUI extends javax.swing.JPanel {

    /**
     * Creates new form InscripcionGUI
     */
    List<Inscripcion> lista_inscripciones;

    public InscripcionGUI(String codigo_torneo) {
        initComponents();
        TorneoSRV torneoSrv = new TorneoSRV();
//        Torneo torneo = torneoSrv.obtenerTorneo(codigo_torneo);
        Torneo torneo = torneoSrv.obtenerTorneoArchivos(codigo_torneo);
        
        jLabel_Codigo_Torneo.setText(torneo.getCodigo());
        jLabel_Nombre_Categoria.setText(torneo.getTorneo_categorías().getCategoria().getNombre());
        jLabel_Nombre_Modalidad.setText(torneo.getTipo_juego());
        btnCrearTorneo.setEnabled(false);
        lista_inscripciones = new ArrayList<>();
        //tablaJugadores();
        tabla_jugadores_Archivos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnCrearTorneo = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel_Codigo_Torneo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel_Nombre_Categoria = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel_Nombre_Modalidad = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtable_Lista_Jugadores = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtabla_Inscritos = new javax.swing.JTable();
        btnAddDerecha = new javax.swing.JButton();
        btn_Eliminacion_Inscrito = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jComboBox_Limite_Inscripciones = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(976, 617));
        setMinimumSize(new java.awt.Dimension(976, 617));
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Inscripción de participantes");
        add(jLabel1);
        jLabel1.setBounds(590, 20, 226, 22);

        btnCrearTorneo.setText("Crear Torneo");
        btnCrearTorneo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearTorneoActionPerformed(evt);
            }
        });
        add(btnCrearTorneo);
        btnCrearTorneo.setBounds(730, 560, 183, 42);
        add(jSeparator1);
        jSeparator1.setBounds(230, 70, 929, 10);

        jLabel2.setText("Torneo:");
        add(jLabel2);
        jLabel2.setBounds(230, 90, 128, 24);

        jLabel_Codigo_Torneo.setText("Código");
        add(jLabel_Codigo_Torneo);
        jLabel_Codigo_Torneo.setBounds(370, 90, 94, 24);

        jLabel3.setText("Categoría:");
        add(jLabel3);
        jLabel3.setBounds(500, 90, 89, 24);

        jLabel_Nombre_Categoria.setText("Nombre Categoria");
        add(jLabel_Nombre_Categoria);
        jLabel_Nombre_Categoria.setBounds(630, 90, 96, 24);

        jLabel5.setText("Modalidad: ");
        add(jLabel5);
        jLabel5.setBounds(800, 90, 94, 24);

        jLabel_Nombre_Modalidad.setText("Nombre de modalidad");
        add(jLabel_Nombre_Modalidad);
        jLabel_Nombre_Modalidad.setBounds(970, 90, 198, 24);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Inscripciones"));

        jtable_Lista_Jugadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código /Cédula", "Nombre", "Apellido", "Edad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtable_Lista_Jugadores);

        jtabla_Inscritos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código/ Cédula", "Nombre", "Apellido", "Edad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jtabla_Inscritos);

        btnAddDerecha.setText(">>");
        btnAddDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDerechaActionPerformed(evt);
            }
        });

        btn_Eliminacion_Inscrito.setText("<<");
        btn_Eliminacion_Inscrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Eliminacion_InscritoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddDerecha)
                    .addComponent(btn_Eliminacion_Inscrito))
                .addGap(13, 13, 13)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(btnAddDerecha, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(btn_Eliminacion_Inscrito, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        add(jPanel1);
        jPanel1.setBounds(230, 180, 917, 361);

        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(970, 560, 175, 42);

        jLabel4.setText("Cantidad de jugadores:");
        add(jLabel4);
        jLabel4.setBounds(230, 120, 135, 30);

        jComboBox_Limite_Inscripciones.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "8", "16", "32" }));
        add(jComboBox_Limite_Inscripciones);
        jComboBox_Limite_Inscripciones.setBounds(400, 120, 95, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ucuenca/p3/Iconos/fondo7.jpg"))); // NOI18N
        add(jLabel6);
        jLabel6.setBounds(0, 0, 1190, 660);
    }// </editor-fold>//GEN-END:initComponents

    private void tablaJugadores() {
        DefaultTableModel modeloJugadores = (DefaultTableModel) jtable_Lista_Jugadores.getModel();
        ParticipantesSRV participanteSrv = new ParticipantesSRV();
        List<Participante> lista_participante = participanteSrv.listaParticipantes();

        Object[] fila = new Object[modeloJugadores.getColumnCount()];

        for (int i = 0; i < lista_participante.size(); i++) {
            Jugador jugador = (Jugador) lista_participante.get(i);
            fila[0] = jugador.getCodigo();
            fila[1] = jugador.getNombre().toUpperCase();
            fila[2] = jugador.getApellido().toUpperCase();
            fila[3] = String.valueOf(jugador.getEdad());
            modeloJugadores.addRow(fila);
        }

    }

    private void btnAddDerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDerechaActionPerformed
        TorneoSRV torneoSrv = new TorneoSRV();
        try {
            String nombre_categoria = jLabel_Nombre_Categoria.getText();
            String codigo_participante = (String) jtable_Lista_Jugadores.getValueAt(jtable_Lista_Jugadores.getSelectedRow(), 0);
            float costo = 100;      //la inscripción es de 100 dólares
            int cantidad_inscritos = Integer.parseInt((String) jComboBox_Limite_Inscripciones.getSelectedItem());
            String modalidad = jLabel_Nombre_Modalidad.getText().trim();

            if (jtable_Lista_Jugadores.getSelectedRow() > -1) {
                if (torneoSrv.cantidad_inscritos(lista_inscripciones, modalidad, cantidad_inscritos)) {
                    Inscripcion inscripcion = torneoSrv.inscribirJugadores(nombre_categoria, codigo_participante, costo);
                    torneoSrv.validarInscripcion(inscripcion, lista_inscripciones);
                    torneoSrv.ingresarInscripcion_Lista(inscripcion, lista_inscripciones);
                    limpiar_Tabla(jtabla_Inscritos);
                    tabla_Inscritos(lista_inscripciones);
                    System.out.println("tamanio de lista: " + lista_inscripciones.size());
                    System.out.println("modalidad: " + modalidad);
                    if (torneoSrv.validarCantidadInscritos(lista_inscripciones, cantidad_inscritos, modalidad)) {
                        btnCrearTorneo.setEnabled(true);
                        btnAddDerecha.setEnabled(false);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Debe seleccionar un participante.");
            }

        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        } catch (InscripcionExcepcionEdad ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        } catch (InscripicionExistenteException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnAddDerechaActionPerformed

    private void tabla_Inscritos(List<Inscripcion> lista_inscripciones) {
        DefaultTableModel modeloJugadores = (DefaultTableModel) jtabla_Inscritos.getModel();
        Object[] fila = new Object[modeloJugadores.getColumnCount()];

        for (int i = 0; i < lista_inscripciones.size(); i++) {
            Participante participante = lista_inscripciones.get(i).getParticipante();
            Jugador jugador = (Jugador) participante;
            fila[0] = jugador.getCodigo();
            fila[1] = jugador.getNombre().toUpperCase();
            fila[2] = jugador.getApellido().toUpperCase();
            fila[3] = String.valueOf(jugador.getEdad());
            modeloJugadores.addRow(fila);
        }
    }

    private void limpiar_Tabla(JTable jtableTorneos) {
        DefaultTableModel modeloInscritos = (DefaultTableModel) jtableTorneos.getModel();
        for (int i = 0; i < jtableTorneos.getRowCount(); i++) {
            modeloInscritos.removeRow(i);
            i -= 1;
        }
    }

    private void btn_Eliminacion_InscritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Eliminacion_InscritoActionPerformed
        int cantidad_inscritos = Integer.parseInt((String) jComboBox_Limite_Inscripciones.getSelectedItem());
        String modalidad = jLabel_Nombre_Modalidad.getText().trim();
        int fsel = jtabla_Inscritos.getSelectedRow();
        try {
            TorneoSRV torneoSrv = new TorneoSRV();
            String codigo_participante = (String) jtabla_Inscritos.getValueAt(jtabla_Inscritos.getSelectedRow(), 0);
            torneoSrv.eliminarInscripcion_List(lista_inscripciones, codigo_participante);
            if (fsel == -1) {
                JOptionPane.showMessageDialog(null, "Debe seleccionar un participante.");
            }
            if (!torneoSrv.validarCantidadInscritos(lista_inscripciones, cantidad_inscritos, modalidad)) {
                btnCrearTorneo.setEnabled(false);
                btnAddDerecha.setEnabled(true);
            }

            limpiar_Tabla(jtabla_Inscritos);
            tabla_Inscritos(lista_inscripciones);
            btnAddDerecha.setEnabled(true);
        } catch (Exception e) {

        }
    }//GEN-LAST:event_btn_Eliminacion_InscritoActionPerformed

    private void btnCrearTorneoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearTorneoActionPerformed
        TorneoSRV torneoSrv = new TorneoSRV();
        String codigo_torneo = jLabel_Codigo_Torneo.getText();

        torneoSrv.crearCategoria(codigo_torneo, lista_inscripciones);
        JOptionPane.showMessageDialog(null, "Lista de inscritos ingresada correctamente !", "Información de torneo", JOptionPane.INFORMATION_MESSAGE);

        lista_inscripciones = new ArrayList<>();
        this.hide();
    }//GEN-LAST:event_btnCrearTorneoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.hide();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tabla_jugadores_Archivos() {
        DefaultTableModel modeloVigia = (DefaultTableModel) jtable_Lista_Jugadores.getModel();
        ParticipantesSRV participantesrv = new ParticipantesSRV();
//        List<Participante> listaParticipantes = participantesrv.listaParticipantes();

        ArrayList<Participante> listaParticipantes = participantesrv.listarParticpantesArchivos();
        Object[] fila = new Object[modeloVigia.getColumnCount()];
        for (int i = 0; i < listaParticipantes.size(); i++) {
            Jugador jugador = (Jugador) listaParticipantes.get(i);

            fila[0] = jugador.getCodigo();
            fila[1] = jugador.getNombre().toUpperCase();
            fila[2] = jugador.getApellido().toUpperCase();
            fila[3] = jugador.getEdad();

            modeloVigia.addRow(fila);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddDerecha;
    private javax.swing.JButton btnCrearTorneo;
    private javax.swing.JButton btn_Eliminacion_Inscrito;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox_Limite_Inscripciones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel_Codigo_Torneo;
    private javax.swing.JLabel jLabel_Nombre_Categoria;
    private javax.swing.JLabel jLabel_Nombre_Modalidad;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jtabla_Inscritos;
    private javax.swing.JTable jtable_Lista_Jugadores;
    // End of variables declaration//GEN-END:variables
}