import java.util.Scanner;

public class ProductDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double originalPrice, discountRate, discountedPrice;
        
        //  input the price of the product
        System.out.print("Enter the price of the product: ");
        originalPrice = sc.nextDouble();
        
        //  input the discount on the product
        System.out.print("Enter the discount on the product: ");
        discountRate = sc.nextDouble();
        
        //  calculating discount
        discountedPrice = originalPrice - (originalPrice * (discountRate / 100));
        
        //  printing the discounted amount
        System.out.println("The discounted price: " + discountedPrice);
    }
}
