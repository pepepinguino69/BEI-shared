import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class KidsTest {

    @Test
    @DisplayName("Testear Precio Kids")
    public void calcularPrecio() {
        //Given
        var precio=406.0;
        var kids=new Kids(2.0);

        //When
        var actual=kids.calcularPrecio();

        //Then
        assertEquals(precio,actual);
    }

    @Test
    @DisplayName("Testing Instrucciones kids")
    public void mostrarInstrucciones() {
        //given
        var kids=new Kids(2.0);
        var texto="Armar Menu Kids"+"-Trae: "+kids.getCantidadJuguetes();

        //when
        var actual = kids.mostrarInstrucciones();
        //then
        assertEquals(actual,texto);
    }
}
