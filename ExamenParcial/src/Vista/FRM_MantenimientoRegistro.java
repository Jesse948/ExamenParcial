/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Controlador_FRM_MantenimientoRegistro;

/**
 *
 * @author Jesse Fabian
 */
public class FRM_MantenimientoRegistro extends javax.swing.JFrame {

    /**
     * Creates new form FRM_MantenimientoEstudiantes
     */
    Controlador_FRM_MantenimientoRegistro controlador;
    public FRM_MantenimientoRegistro() {
        initComponents();
        controlador=new Controlador_FRM_MantenimientoRegistro(this);
        gUI_Botones1.agregarEventos(controlador);
      
    }

    public String[] devolverInformacion()
    {
        return this.gUI_Informacion1.devolverInformacion();
    }
    
    public String devolverNumeroregistro()
    {
       return this.gUI_Informacion1.devolverNumeroRegistro();
    }
    
    public void setNumeroRegistro(String numero)
    {
        this.gUI_Informacion1.setNumeroRegistro(numero);
    }
    public void posicionModificar()
    {
        this.gUI_Informacion1.posicionModificar();
    }
    
    public void estadoInicial()
    {
        this.gUI_Botones1.estadoInical();
    }
    
    public void deshabilitarBuscar()
    {
        this.gUI_Botones1.deshabilitarBuscar();
    }
    
    public void habilitarBuscar()
    {
        this.gUI_Botones1.habilitarBuscar();
    }
    
    public void posicicionNueva()
    {
        this.gUI_Informacion1.posicionNueva();
    }
    
    public void habilitarBotones()
    {
        this.gUI_Botones1.habilitarBotones();
    }
    
    public void resetearInterfaz()
    {
        this.gUI_Informacion1.resetearInterfaz();
    }
    
    public void mostrarInformacion(String arreglo[])
    {
        this.gUI_Informacion1.mostrarInformacion(arreglo);
    }
    
    public void habilitarAgregar()
    {
        this.gUI_Botones1.habilitarAgregar();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gUI_Botones1 = new Vista.GUI_Botones();
        gUI_Informacion1 = new Vista.GUI_Informacion();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(gUI_Botones1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(gUI_Informacion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(gUI_Informacion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(gUI_Botones1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

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
            java.util.logging.Logger.getLogger(FRM_MantenimientoRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRM_MantenimientoRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRM_MantenimientoRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRM_MantenimientoRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRM_MantenimientoRegistro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Vista.GUI_Botones gUI_Botones1;
    private Vista.GUI_Informacion gUI_Informacion1;
    // End of variables declaration//GEN-END:variables
}
