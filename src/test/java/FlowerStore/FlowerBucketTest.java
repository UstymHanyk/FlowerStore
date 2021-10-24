package FlowerStore;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class FlowerBucketTest {
    private Flower flower;
    private FlowerPack flowerPack;
    private FlowerBucket flowerBucket;

    @BeforeEach
    void setUp() {
        flower = new Flower(FlowerType.TULIP);
        flowerPack = new FlowerPack(flower, 5);
        flowerBucket = new FlowerBucket();
        flower.setPrice(50);
        flowerBucket.addFlowerPack(flowerPack);
    }

    @Test
    void addPack() {
        flowerBucket.addFlowerPack(flowerPack);
    }

    @Test
    void getPrice() {
        assertEquals(flowerBucket.getPrice(), 250);
    }
}