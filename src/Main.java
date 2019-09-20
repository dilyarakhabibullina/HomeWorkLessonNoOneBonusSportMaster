public class Main {
    public static void main(String[] args) {
        int currentPurchase = 2400;
        int purchaseAmount = 149200;
        int totalPurchases = currentPurchase + purchaseAmount;
        int roublesForBonusBase = 1000;
        int bonusBase = currentPurchase / roublesForBonusBase;
        int bonusRateBlue = 50;
        int bonusRateSilver = 70;
        int bonusRateGold = 100;
        int blueRateUpperBound = 15000;
        int silverRateUpperBound = 150000;
        if (totalPurchases <= blueRateUpperBound) {
            int bonusSum = bonusBase * bonusRateBlue;
            System.out.println("Сумма бонусов к начислению: " + bonusSum);
        }
        if (blueRateUpperBound < totalPurchases && totalPurchases <= silverRateUpperBound) {
            int bonusSum = bonusBase * bonusRateSilver;
            System.out.println("Сумма бонусов к начислению: " + bonusSum);
        }
        if (totalPurchases > silverRateUpperBound) {
            int bonusSum = bonusBase * bonusRateGold;
            System.out.println("Сумма бонусов к начислению: " + bonusSum);
        }
    }
}

