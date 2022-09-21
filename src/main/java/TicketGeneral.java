package main.java;

public class TicketGeneral extends Ticket{

    protected TicketGeneral(float kmEntrada, float kmSalida, float precio) {
        super(kmEntrada, kmSalida, precio);
        
    }
    
    public float calculoTarifaGeneral(float kmRecorrido, float precio, float porcentaje) {
        float tarifa=0.00f;
        if(kmRecorrido >= 500.0) {
            porcentaje = (float)(5.00/100.0);
            tarifa = (kmRecorrido*precio)*porcentaje;
        }else{
            tarifa = kmRecorrido*precio;
        }
        return tarifa;
    }

    @Override
    public float registroFinal(float kmSalida) {
        return this.getKmSalida();
    }

    @Override
    public String toString() {
        return "TicketGeneral []";
    }

    
}
