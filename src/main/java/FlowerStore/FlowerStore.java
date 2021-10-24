package FlowerStore;

import java.util.ArrayList;
import java.util.List;

public class FlowerStore {
    public List<FlowerBucket> flowerBuckets = new ArrayList<>();

    public boolean search(FlowerType flowerType) {  // search a flower of the desired type
        for (FlowerBucket flowerBucket : flowerBuckets) {
            for (int i = 0; i < flowerBucket.flowerPacks.size(); i++) {
                if (flowerBucket.flowerPacks.get(i).getFlower().getFlowerType() == flowerType) {
                    return true;
                }
            }
        }
        return false;
    }

    public void addBucket(FlowerBucket flowerBucket) {
        flowerBuckets.add(flowerBucket);
    }
}
