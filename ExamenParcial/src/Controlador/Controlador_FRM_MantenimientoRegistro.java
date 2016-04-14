    /*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
     */
    package Controlador;

    import Modelo.MetodosRegistro;
    import Vista.FRM_MantenimientoRegistro;
    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;

    /**
     *
     * @author Jesse Fabian
     */
    public class Controlador_FRM_MantenimientoRegistro implements ActionListener {


        FRM_MantenimientoRegistro mantenimientoRegistro;
        MetodosRegistro metodos;
        public Controlador_FRM_MantenimientoRegistro(FRM_MantenimientoRegistro mantenimientoRegistro)
        {
          this.mantenimientoRegistro=mantenimientoRegistro;
            metodos = new MetodosRegistro();  
            mantenimientoRegistro.setNumeroRegistro(metodos.crearNumeroRegistro());
            mantenimientoRegistro.estadoInicial();
        }

        public void actionPerformed(ActionEvent e) {

            if(e.getActionCommand().equals("Buscar"))
            {
                if(metodos.consultarAutomovil(mantenimientoRegistro.devolverNumeroregistro()))
                {
                    mantenimientoRegistro.mostrarInformacion(metodos.getArregloInformacion());
                    mantenimientoRegistro.habilitarBotones();
                    mantenimientoRegistro.posicionModificar();
                    mantenimientoRegistro.deshabilitarBuscar();

                }
                else
                {
                    metodos.mostrarMensaje("El registro consultado no se encontró");
                    mantenimientoRegistro.habilitarAgregar();
                }
                }


            if(e.getActionCommand().equals("Agregar"))
            {
                metodos.agregarAutomovil(mantenimientoRegistro.devolverInformacion());
                metodos.mostrarMensaje("El vehiculo y sus datos han sido registrados exitosamente");
                mantenimientoRegistro.resetearInterfaz();
                mantenimientoRegistro.estadoInicial();
                mantenimientoRegistro.setNumeroRegistro(metodos.crearNumeroRegistro());
            }
            if(e.getActionCommand().equals("Modificar"))
            {
                metodos.modificarAutomovil(mantenimientoRegistro.devolverInformacion());
                metodos.mostrarMensaje("Los datos han sido modificados y guardados exitosamente");  
                mantenimientoRegistro.resetearInterfaz();
                mantenimientoRegistro.setNumeroRegistro(metodos.crearNumeroRegistro());
                mantenimientoRegistro.estadoInicial();
                mantenimientoRegistro.habilitarBuscar();
                mantenimientoRegistro.posicicionNueva();

            }
            if(e.getActionCommand().equals("Eliminar"))
            {
                metodos.eliminarAutomovil(mantenimientoRegistro.devolverInformacion());
                metodos.mostrarMensaje("Los datos regitrados han sido eliminados exitosamente");
                mantenimientoRegistro.resetearInterfaz();
                mantenimientoRegistro.estadoInicial();
                mantenimientoRegistro.setNumeroRegistro(metodos.crearNumeroRegistro());
                mantenimientoRegistro.habilitarBuscar();
                mantenimientoRegistro.posicicionNueva();
            }
        }

    }
