public abstract class Menu {

    private final Double costoBase;

    public Menu() {
        this.costoBase = 400.0;
    }

    public Double getCostoBase() {
        return costoBase;
    }

    public abstract Double calcularPrecio();
    public abstract String mostrarInstrucciones();

}
