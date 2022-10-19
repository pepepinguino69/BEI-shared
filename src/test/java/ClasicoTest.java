import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class ClasicoTest {

    @Test
    @DisplayName("Testear Precio clasico")
    public void calcularPrecio() {
        //Given
        var precio=400.0;
        var clasico=new Clasico();

        //When
        var actual=clasico.calcularPrecio();

        //Then
        assertEquals(precio,actual);
    }

   @Test
   @DisplayName("Testing Instrucciones Clasico")
   public void mostrarInstrucciones() {
        //given
       var texto="Armar Menu Clasico";
       var clasico=new Clasico();
       //when
       var actual = clasico.mostrarInstrucciones();
       //then
       assertEquals(actual,texto);
   }
}
