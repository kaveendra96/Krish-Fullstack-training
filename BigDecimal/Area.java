import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Radius of the circle  :\t");
        BigDecimal radius = scanner.nextBigDecimal();

        BigDecimal radiusPow = radius.pow(2);
        BigDecimal area = radiusPow.multiply(BigDecimal.valueOf(Math.PI));
        System.out.println("Area is : " +area.setScale(2, RoundingMode.HALF_UP));
    }
}

