import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class VeggieTest {

    @Test
    @DisplayName("Testear Precio veggie")
    public void calcularPrecio() {
        //Given
        var precio=412.08;
        var veggie=new Veggie(2.0,2.0);

        //When
        var actual=veggie.calcularPrecio();

        //Then
        assertEquals(precio,actual);
    }

    @Test
    @DisplayName("Testing Instrucciones veggie")
    public void mostrarInstrucciones() {
        //given
        var texto="Armar Menu Veggie";
        var veggie=new Veggie(2.0,2.0);
        //when
        var actual = veggie.mostrarInstrucciones();
        //then
        assertEquals(actual,texto);
    }
}
