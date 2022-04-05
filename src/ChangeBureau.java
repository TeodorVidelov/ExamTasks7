import java.util.Scanner;
public class ChangeBureau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfBitcoins = Integer.parseInt(scanner.nextLine());
        double countOfChineseYuan = Double.parseDouble(scanner.nextLine());
        double commission = Double.parseDouble(scanner.nextLine());

        double bitcoinPriceInBGN = 1168;
        double chineseYuanToUSD = 0.15;
        double oneUSDToBGN = 1.76;
        double oneEuroToBGN = 1.95;

        double sumBitcoin = bitcoinPriceInBGN * countOfBitcoins;
        double yuanToUSD = countOfChineseYuan * chineseYuanToUSD;
        double USDToBGN = yuanToUSD * oneUSDToBGN;
        double totalInBGN = sumBitcoin + USDToBGN;
        double totalInEuro = totalInBGN / oneEuroToBGN;
        double commissionInEuro = totalInEuro * commission / 100;
        double totalPrice = totalInEuro - commissionInEuro;
        System.out.printf("%.2f",totalPrice);
    }
}