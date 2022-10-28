package mostrarSaldo;

import modelo.modelo;

import javax.swing.*;

public class MostrarSaldo extends modelo {

    //Sobreescritura de metodo (polimorfismo)
    @Override
    public void tipoTransacion(){
        JOptionPane.showMessageDialog(null, "Tu saldo actual es de: " + getSaldo() + " pesos.");
    }
}
