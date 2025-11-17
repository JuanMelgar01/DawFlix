package model;

import java.time.LocalDate;

public class Suscripcion {
    // Tipo de suscripción
    public enum tipoSuscripcion {
        BASICO, PREMIUM
    }

    // Atributos
    private tipoSuscripcion miSuscripcion;
    private LocalDate fechaAlta;
    private LocalDate validez;
    private boolean renovacionAuto;
    // Constructor
    public Suscripcion(tipoSuscripcion miSuscripcion, boolean renovacionAuto) {
        this.miSuscripcion = miSuscripcion;
        this.renovacionAuto = renovacionAuto;
        fechaAlta = LocalDate.now();
        validez = fechaAlta.plusYears(1);
        System.out.println("Suscripción iniciada");
    }
    public tipoSuscripcion getMiSuscripcion() {
        return miSuscripcion;
    }
    public LocalDate getFechaAlta() {
        return fechaAlta;
    }
    public LocalDate getValidez() {
        return validez;
    }
    public boolean isRenovacionAuto() {
        return renovacionAuto;
    }
    @Override
    public String toString() {
        return "Suscripcion [miSuscripcion=" + miSuscripcion + ", fechaAlta=" + fechaAlta + ", validez=" + validez
                + ", renovacionAuto=" + renovacionAuto + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((miSuscripcion == null) ? 0 : miSuscripcion.hashCode());
        result = prime * result + ((fechaAlta == null) ? 0 : fechaAlta.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Suscripcion other = (Suscripcion) obj;
        if (miSuscripcion != other.miSuscripcion)
            return false;
        if (fechaAlta == null) {
            if (other.fechaAlta != null)
                return false;
        } else if (!fechaAlta.equals(other.fechaAlta))
            return false;
        return true;
    }

    

}
