    /*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
     */
    package Modelo;

    import java.util.ArrayList;
    import javax.swing.JOptionPane;

    /**
     *
     * @author Jesse Fabian
     */
    public class MetodosRegistro {

    /**
     *
     */
    public ArrayList <Automovil> arrayRegistro;
        String arregloInformacion[]=new String[4];

    /**
     *
     */
    public MetodosRegistro()
        {
            arrayRegistro=new ArrayList <Automovil>();
        }

    /**
     *
     * @param informacion
     */
    public void agregarAutomovil(String informacion[])
        {
            Automovil temporal=new Automovil(informacion[0], informacion[1], informacion[2], informacion[3]);
            arrayRegistro.add(temporal);

        }

    /**
     *
     */
    public void mostrarInformacion()
        {
            for(int contador=0;contador<arrayRegistro.size();contador++)
            {
                System.out.println(arrayRegistro.get(contador).getInformacion());

            }

        }

    /**
     *
     * @param numeroRegistro
     * @return
     */
    public boolean consultarAutomovil(String numeroRegistro)
        {
            boolean existe=false;        
            for(int contador=0;contador<arrayRegistro.size();contador++)
            {
                if(arrayRegistro.get(contador).getNumeroRegistro().equals(numeroRegistro))
                {
                    arregloInformacion[1]=arrayRegistro.get(contador).getNombre();
                    arregloInformacion[2]=arrayRegistro.get(contador).getCedula();
                    arregloInformacion[3]=arrayRegistro.get(contador).getPlaca();
                    existe=true;
                }        
            }
            return existe;

        }

    /**
     *
     * @return
     */
    public String crearNumeroRegistro()
        {
            String numeroRegistro="";

            if(arrayRegistro.size()==0)
            {
                numeroRegistro="1";
            }
            else
            {
                for(int contador=0;contador<arrayRegistro.size();contador++)
                {
                    if(arrayRegistro.get(contador)!=null)
                    {
                        numeroRegistro=arrayRegistro.get(contador).getNumeroRegistro();
                    }
                }

                int numero=Integer.parseInt(numeroRegistro);
                numero++;
                numeroRegistro=""+numero;
            }

            return numeroRegistro; 
        }

    /**
     *
     * @param arreglo
     */
    public void modificarAutomovil(String arreglo[])
        {
            for(int contador=0;contador<arrayRegistro.size();contador++)
            {
                if(arrayRegistro.get(contador).getCedula().equals(arreglo[0]))
                {
                    arrayRegistro.get(contador).setNombre(arreglo[1]);
                    arrayRegistro.get(contador).setCedula(arreglo[2]);
                    arrayRegistro.get(contador).setPlaca(arreglo[3]);
                }
            }
        }

    /**
     *
     * @param arreglo
     */
    public void eliminarAutomovil(String arreglo[])
        {
            for(int contador=0;contador<arrayRegistro.size();contador++)
            {
                if(arrayRegistro.get(contador).getNumeroRegistro().equals(arreglo[0]))
                {
                    arrayRegistro.remove(contador);
                }
            }
        }

    /**
     *
     * @return
     */
    public String[] getArregloInformacion()
        {
            return this.arregloInformacion;
        } 

    /**
     *
     * @param mensaje
     */
    public void mostrarMensaje(String mensaje)
       {
           JOptionPane.showMessageDialog(null,mensaje);
       }



    }
