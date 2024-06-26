package co.edu.uniquindio.poo;

import java.time.Duration;
import java.time.LocalDateTime;

public class Registro {
     private final LocalDateTime fechaEntrada;
    private  LocalDateTime fechaSalida;
    private final Vehiculo vehiculo;
    /**
     * Método constructor de la clase Registro
     * @param fechaEntrada valor de la fecha de entrada de un vehiculo al parqueadero
     * @param fechaSalida valor de la fecha de salida de un vehiculo del parqueadero
     * @param vehiculo valor del vehiculo al registro
     */
    public Registro(LocalDateTime fechaEntrada, LocalDateTime fechaSalida, Vehiculo vehiculo) {
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.vehiculo = vehiculo;

    }
    /**
     * Método para calcular el tiempo que un vehiculo lleva estacionado en el parqueadero según su hora de entrada y su hora de salida y convertirlo en un entero de horas que el vehiculo lleva estacionado
    * 
    * @return horas que el vehiculo lleva estacionado
    */
    public int calcularTiempo (LocalDateTime fechaEntrada,LocalDateTime fechaSalida){
        Duration tiempo = Duration.between(fechaEntrada, fechaSalida);
        long horas = tiempo.toHours();
        return (int) horas;
    }
    /**
     * Método para calcular la tarifa que un vehiculo debe pagar según su instancia de vehiculo y cantidad de horas estacionado
     * 
     * @return tarifa final que se debe pagar 
     */
    public double calcularTarifa(){
        int horasEstacionado = calcularTiempo(fechaEntrada, fechaSalida);
        double tarifaPorHora = vehiculo.getTarifa();
        return horasEstacionado * tarifaPorHora;
    }
    /**
     * Método para obtener la fecha de entrada de un vehiculo
     * @return fecha de entrada de un vehiculo
     */
    public LocalDateTime getFechaEntrada() {
        return fechaEntrada;
    }
    /**
     * Método para obtener la fecha de salida de un vehiculo
     * @return fecha de salida de un vehiculo
     */
    public LocalDateTime getFechaSalida() {
        return fechaSalida;
    }
    /**
     * Método para obtener el vehiculo estacionado
     * @return vehiculo estacionado
     */
    public Vehiculo getVehiculo() {
        return vehiculo;
    }
    /**
     * Método para cambiar la fecha de salida de un vehiculo
     * @param fechaSalida fecha de salida cambiada  de un vehiculo
     */
    public void setFechaSalida(LocalDateTime fechaSalida) {
        this.fechaSalida = fechaSalida;
    }
    
}
