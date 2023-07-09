package dsa;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class ProfitAndLoss {
    static void profitLoss(double costPrice, double sellingPrice) {
        double profit = 0;
        double loss = 0;
        if (costPrice > sellingPrice) {
            loss = costPrice - sellingPrice;
            out.println("Loss of Rs." + loss);
        } else if (sellingPrice > costPrice) {
            profit = sellingPrice - costPrice;
            out.println("Profit of Rs." + profit);
        }
    }

    public static void main(String[] args) {
        double costPrice = 0;
        double sellingPrice = 0;
        Scanner sc = new Scanner(in);
        out.print("Enter Cost Price:");
        costPrice = sc.nextDouble();
        out.print("Enter Selling Price:");
        sellingPrice = sc.nextDouble();
        profitLoss(costPrice, sellingPrice);
    }
}
