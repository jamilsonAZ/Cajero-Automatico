package modelo;

import javax.swing.*;

public abstract class modelo {
    protected float saldo, deposito, transaccion, retiro;
    protected int opcion;

    //Metodo para solicitar informacion
    public void pedirDatos(){
        /*
        Tratado de excepciones
        try{
        }catch{
        }finally{
        }
         */
        try {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Por favor selecciona una opcion.\n   1. Consultar saldo\n" +
                    "   2. Retiro de efectivo\n   3. Depositar dinero\n   4. Salir"));

            while ((opcion <1 || opcion > 4)){
                JOptionPane.showMessageDialog(null, "Has introducido un valor erroneo.\nIntentalo nuevamente.");
                opcion = Integer.parseInt(JOptionPane.showInputDialog("Por favor selecciona una opcion.\n   1. Consultar saldo\n" +
                        "   2. Retiro de efectivo\n   3. Depositar dinero\n   4. Salir"));
            }
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Has introducido un valor erroneo.  " + e);
        }
    }
    //Metodo polimorfico para transaciones
    public abstract void tipoTransacion();


    //setter y getter ingreso
    public void setDeposito(float deposito){
        this.deposito = deposito;
    }
    public float getDeposito() {
        return deposito;
    }

    public void setRetiro(float retiro){
       this.retiro = retiro;
    }
    public float getRetiro(){
        return retiro;
    }

    //setter y getter saldo
    public void setSaldo(float saldo){
        this.saldo = saldo;
    }
    public float getSaldo(){
        return saldo;
    }

    //setter y getter
    public void setTransaccion(float transaccion){
        this.transaccion = transaccion;
    }
    public float getTransaccion(){
        return transaccion;
    }

    //getter opcion
    public int getOpcion(){
        return opcion;
    }

}
