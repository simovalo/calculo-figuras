package app;

import model.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Figura> figuras = new ArrayList<>();
        figuras.add(new Circulo(5.0));
        figuras.add(new Cuadrado(4.0));
        figuras.add(new TrianguloEquilatero(6.0));

        for (Figura figura : figuras) {
            System.out.println("Figura: " + figura.getClass().getSimpleName());
            System.out.println("Área: " + String.format("%.2f", figura.calcularArea()) + "m²");
            System.out.println("Perímetro: " + String.format("%.2f", figura.calcularPerimetro())+ "m");
            System.out.println();
        }
    }
}
