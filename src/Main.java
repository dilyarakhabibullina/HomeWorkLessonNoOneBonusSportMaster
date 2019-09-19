public class Main {
    public static void main(String[] args) {
        int currentPurchase = 2400;
        int purchaseAmount = 149200;
        int totalPurchases = currentPurchase + purchaseAmount;
        int bonusBase = currentPurchase / 1000;
        int bonusRateBlue = 50;
        int bonusRateSilver = 70;
        int bonusRateGold = 100;
        if (totalPurchases <= 15000) {
            int bonusSum = bonusBase * bonusRateBlue;
            System.out.println("Сумма бонусов к начислению: " + bonusSum);
        }
        if (15000 < totalPurchases && totalPurchases <= 150000) {
            int bonusSum = bonusBase * bonusRateSilver;
            System.out.println("Сумма бонусов к начислению: " + bonusSum);
        }
        if (totalPurchases > 150000) {
            int bonusSum = bonusBase * bonusRateGold;
            System.out.println("Сумма бонусов к начислению: " + bonusSum);
        }
    }
}

