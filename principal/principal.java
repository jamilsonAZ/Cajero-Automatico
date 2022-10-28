package principal;

import ingresarDinero.IngresarDinero;
import mostrarSaldo.MostrarSaldo;
import modelo.modelo;
import sacarDinero.SacarDinero;

import javax.swing.*;

public class principal {
    public static void main(String[] args) {

        modelo pedirInformacion = new modelo() {
            @Override
            public void tipoTransacion() {

            }
        };
        pedirInformacion.pedirDatos();
        pedirInformacion.getOpcion();
        while (pedirInformacion.getOpcion() != 4){
            switch (pedirInformacion.getOpcion()) {
                case 1:
                    MostrarSaldo consultarSaldo = new MostrarSaldo();
                    consultarSaldo.tipoTransacion();
                    pedirInformacion.pedirDatos();
                    break;
                case 2:
                    SacarDinero retirarDinero = new SacarDinero();
                        retirarDinero.tipoTransacion();
                        pedirInformacion.pedirDatos();
                    break;
                case 3:
                    IngresarDinero ingresarDinero = new IngresarDinero();
                    ingresarDinero.tipoTransacion();
                    pedirInformacion.pedirDatos();
                    break;
            }
        }
        JOptionPane.showMessageDialog(null, "Gracias por usar nuestros servicios!\n" +
                "Te esperamos de vuelta pronto.");


    }
}
