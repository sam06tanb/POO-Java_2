import entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Triangle x,y;
        x = new Triangle();
        y = new Triangle();

        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva as medidas do triangulo X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Escreva as medidas do triangulo Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();


        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Area do triangulo X: %.4f%n", areaX);
        System.out.printf("Area do triangulo Y: %.4f%n", areaY);

        if(areaX > areaY) {
            System.out.println("Area maior: X");
        }
        else {
            System.out.println("Area maior: Y");
        }

                sc.close();

        
        }
    }
