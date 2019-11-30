public class Main {
    public static void main(String[] args) {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expectedResult = 0;
        int actualResult = service.remain(amount);
        System.out.println(actualResult);
        System.out.println(expectedResult == actualResult);
    }
}
