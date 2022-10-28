package ingresarDinero;

import modelo.modelo;

import javax.swing.*;

public class IngresarDinero extends modelo {
    @Override
    public void tipoTransacion(){
        /*
        Tratado de excepciones
         */
        try {
            setDeposito(Float.parseFloat(JOptionPane.showInputDialog("Cuanto dinero deseas ingresar?")));
            setTransaccion(getSaldo());
            setSaldo(getDeposito()+getTransaccion());


            JOptionPane.showMessageDialog(null, "Has hecho un deposito de " + getDeposito() +" y tu nuevo saldo es de: " + getSaldo() + " pesos.");
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Has introducido un valor erroneo.  " + e);
        }

    }
}
