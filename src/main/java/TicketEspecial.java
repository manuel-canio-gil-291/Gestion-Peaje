package main.java;

public class TicketEspecial extends Ticket{

    private final int pasajeros;

    protected TicketEspecial(float kmEntrada, float kmSalida, float precio, int pasajeros) {
        super(kmEntrada, kmSalida, precio);
        this.pasajeros = pasajeros;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public float calculoTarifaEspecial(float kmRecorrido, float precio, float porcentaje, int pasajeros) {
        float tarifa = 0.00f;
        if(kmRecorrido >= 100.0) {
            porcentaje = (float)(10.00/100.0);
            tarifa = ((kmRecorrido*precio)*pasajeros)*porcentaje;
        }else{
            tarifa = (kmRecorrido*precio)*pasajeros;
        }
        return tarifa;
    }

    @Override
    public float registroFinal(float kmSalida) {
        return this.getKmSalida();
    }

    @Override
    public String toString() {
        return "TicketEspecial [pasajeros=" + pasajeros + "]";
    }

    
}
