public class Kids  extends Menu{


    private Double cantidadJuguetes;

    public Kids(Double cantidadJuguetes) {
        this.cantidadJuguetes = cantidadJuguetes;
    }

    public Double getCantidadJuguetes() {
        return cantidadJuguetes;
    }

    @Override
    public Double calcularPrecio() {
        return (getCostoBase()+cantidadJuguetes*3.0);
    }

    @Override
    public String mostrarInstrucciones() {
        String leyenda= "Armar Menu Kids"+"-Trae: "+cantidadJuguetes;
      //  System.out.println(leyenda);
        return leyenda;
    }
}

