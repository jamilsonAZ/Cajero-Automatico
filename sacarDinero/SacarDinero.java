package sacarDinero;

import modelo.modelo;

import javax.swing.*;

public class SacarDinero extends modelo {
    @Override
    public void tipoTransacion() {
        /*
        Tratado de excepciones
         */
        try {
            setRetiro(Float.parseFloat(JOptionPane.showInputDialog("Cuanto dinero deseas retirar?")));

            if (getRetiro() < getSaldo() && getRetiro() != 0) {
                setTransaccion(getSaldo());
                setSaldo(getTransaccion() - getRetiro());
                JOptionPane.showMessageDialog(null, "Has realizado un retiro de " + getRetiro() + " y tu nuevo salde es: " + getSaldo());
            }
            else if (getRetiro() == 0){
                JOptionPane.showMessageDialog(null, "No se ha efectuado un retiro de tu cuenta, tu saldo es: " + getSaldo());
            }
            else {
                JOptionPane.showMessageDialog(null, "No tienes cupo suficiente  para realizar esta transaccion.");
                JOptionPane.showMessageDialog(null, "Tu saldo es de: " + getSaldo() + " pesos.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Has introducido un valor erroneo.  " + e);
        }
    }
}
