public class Clasico extends Menu{

    @Override
    public Double calcularPrecio() {
        return getCostoBase();
    }

    @Override
    public String mostrarInstrucciones() {
        String leyenda= "Armar Menu Clasico";
        System.out.println(leyenda);
        return leyenda;
    }
}
