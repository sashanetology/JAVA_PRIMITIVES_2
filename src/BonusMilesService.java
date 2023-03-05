public class BonusMilesService {
    public int calculate(int price) {
        int cost;
        if (price > 1000) {
            cost = price / 100;
        } else {
            cost = 0;
        }
        return cost;
    }
}
