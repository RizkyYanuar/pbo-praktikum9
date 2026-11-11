package id.ac.polban.pbo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;

@DisplayName("Pengujian Shape")
class ShapeTest {

    @Test
    void area_menggunakanReferenceShape() {

        Shape circle = new Circle(7);

        assertEquals(
                Math.PI * 49,
                circle.area(),
                0.001);
    }
}