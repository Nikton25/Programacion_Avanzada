package Model;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import Model.Auto;

class AutoTest {

    @org.junit.jupiter.api.Test
    void calcularTarifa() {
        //given
        Auto nuevo = new Auto("Ford","Focus","iob471", 5);

        //when
        double tarifa = nuevo.calcularTarifa();

        //then
        assertEquals(2000, tarifa, "El costo para 2 horas de auto debería ser 2000");
    }
}