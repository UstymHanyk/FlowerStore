package FlowerStore;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FlowerPackTest {
    private Flower flower;
    private FlowerPack flowerPack;

    @BeforeEach
    void setUp(){
        flower = new Flower(FlowerType.CHAMOMILE);
        flowerPack = new FlowerPack(flower, 5);
        flower.setPrice(50);
    }

    @Test
    void getPrice() {
        assertEquals(250, flowerPack.getPrice());
    }
}