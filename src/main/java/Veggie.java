public class Veggie extends Menu{

    public Veggie(Double cantidadSalsas, Double cantidadEspecias) {
        this.cantidadSalsas = cantidadSalsas;
        this.cantidadEspecias = cantidadEspecias;
    }

    private Double cantidadSalsas;
    private Double cantidadEspecias;

    @Override
    public Double calcularPrecio() {
        return (getCostoBase()+cantidadSalsas*2.0)*(1.0+(cantidadEspecias*.01));
    }

    @Override
    public String mostrarInstrucciones() {
        String leyenda= "Armar Menu Veggie";
     //   System.out.println(leyenda);
        return leyenda;
    }
}

