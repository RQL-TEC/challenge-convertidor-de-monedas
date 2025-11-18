import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultaApi consulta = new ConsultaApi();
        int opcion = 0;

        System.out.println("*****************************************************");
        System.out.println("Sea bienvenido/a al Conversor de Moneda =]");

        while (opcion != 7) {
            mostrarMenu();
            try {
                opcion = lectura.nextInt();

                if (opcion == 7) {
                    System.out.println("Saliendo del programa. ¡Gracias por usar nuestro conversor!");
                    continue; // Salta al final y el bucle termina
                }

                if (opcion < 1 || opcion > 6) {
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
                    continue; // Vuelve al inicio del bucle
                }

                // Definimos las monedas según la opción elegida
                String monedaBase = "";
                String monedaDestino = "";
                String nombreMonedaBase = "";
                String nombreMonedaDestino = "";

                switch (opcion) {
                    case 1:
                        monedaBase = "USD"; nombreMonedaBase = "Dólar";
                        monedaDestino = "ARS"; nombreMonedaDestino = "Peso argentino";
                        break;
                    case 2:
                        monedaBase = "ARS"; nombreMonedaBase = "Peso argentino";
                        monedaDestino = "USD"; nombreMonedaDestino = "Dólar";
                        break;
                    case 3:
                        monedaBase = "USD"; nombreMonedaBase = "Dólar";
                        monedaDestino = "BRL"; nombreMonedaDestino = "Real brasileño";
                        break;
                    case 4:
                        monedaBase = "BRL"; nombreMonedaBase = "Real brasileño";
                        monedaDestino = "USD"; nombreMonedaDestino = "Dólar";
                        break;
                    case 5:
                        monedaBase = "USD"; nombreMonedaBase = "Dólar";
                        monedaDestino = "COP"; nombreMonedaDestino = "Peso colombiano";
                        break;
                    case 6:
                        monedaBase = "COP"; nombreMonedaBase = "Peso colombiano";
                        monedaDestino = "USD"; nombreMonedaDestino = "Dólar";
                        break;
                }

                System.out.print("Ingrese el valor que deseas convertir: ");
                double cantidad = lectura.nextDouble();

                // Realizamos la consulta a la API
                Moneda tasas = consulta.obtenerTasasDeCambio(monedaBase);
                double tasaDeConversion = tasas.conversion_rates().get(monedaDestino);
                double resultado = cantidad * tasaDeConversion;

                System.out.printf("El valor de %.2f %s corresponde al valor final de %.2f %s%n%n",
                        cantidad, nombreMonedaBase, resultado, nombreMonedaDestino);

            } catch (Exception e) {
                System.out.println("Ocurrió un error: " + e.getMessage());
                System.out.println("Asegúrese de ingresar un número válido.");
                lectura.nextLine(); // Limpia el buffer del scanner en caso de error
                opcion = 0; // Resetea la opción para evitar un bucle infinito
            }
        }
        lectura.close();
    }

    public static void mostrarMenu() {
        System.out.println("1) Dólar =>> Peso argentino");
        System.out.println("2) Peso argentino =>> Dólar");
        System.out.println("3) Dólar =>> Real brasileño");
        System.out.println("4) Real brasileño =>> Dólar");
        System.out.println("5) Dólar =>> Peso colombiano");
        System.out.println("6) Peso colombiano =>> Dólar");
        System.out.println("7) Salir");
        System.out.print("Elija una opción válida: ");
        System.out.println("\n*****************************************************");
    }
}