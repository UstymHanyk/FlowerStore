package FlowerStore;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class FlowerTest {
    private Flower testFlower;

    @BeforeEach
    void setUp() {
        testFlower = new Flower(FlowerType.ROSE);
        testFlower.setFlowerType(FlowerType.TULIP);
        testFlower.setPrice(50);
        testFlower.setSepalLength(5);
        testFlower.setColor(new int[] {1, 2, 30});

    }

    @Test
    void getFlowerType() {
        assertEquals(testFlower.getFlowerType(), FlowerType.TULIP);
    }

    @Test
    void getColor() {
        assertArrayEquals(testFlower.getColor(), new int[]{1, 2, 30});
    }


    @Test
    void getPrice() {
        assertEquals(testFlower.getPrice(), 50);
    }

    @Test
    void getSepalLength() {
        assertEquals(testFlower.getSepalLength(), 5);
    }



}