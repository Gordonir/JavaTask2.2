public class Main {
    public static void main(String[] args) {
        int score = 100;
        int depositAmount = 1100;
        int minimumDepositForBonus = 1000;
        int rublesPerRuble = 100;
        int totalAmount;
        if (depositAmount >= minimumDepositForBonus) {
            totalAmount = score + depositAmount + (depositAmount / rublesPerRuble);
        } else {
            totalAmount = score + depositAmount;
        }
        System.out.println(totalAmount);
    }
}
