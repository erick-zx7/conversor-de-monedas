import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConsultaConversion consulta = new ConsultaConversion();
        int opcion;

        String menu = """
                \n*******************************
                Muenú de opciones de conversión
                *******************************
                \t1) Dolar [USD] => Euro [EUR]
                \t2) Euro [EUR] => Dolar [USD]
                \t3) Dolar [USD] => Libra Esterlina [GBP]
                \t4) Libra Esterlina [GBP] => Dolar [USD]
                \t5) Dolar [USD] => Yen Japones [JPY]
                \t6) Yen Japones [JPY] => Dolar [USD]
                \t7) Dolar [USD] => Real Brasileño [BRL]
                \t8) Real Brasileño [USD] => Dolar [BRL]
                \t9) Euro [EUR] => Libra Esterlina [GBP]
                \t10) Libra Esterlina [GBP] => Euro [EUR]
                \t11) Salir
                Elija una opcion valida""";

        while (true) {
            System.out.println(menu);
            opcion = scanner.nextInt();

            if (opcion == 11) {
                System.out.println("Saliendo de la aplicacion...");
                break;
            }

            System.out.println("\nIngresa el valor que deseas convertir");
            double cantidad = scanner.nextDouble();

            String base = "", target = "";

            switch (opcion) {
                case 1 -> { base = "USD"; target = "EUR"; }
                case 2 -> { base = "EUR"; target = "USD"; }
                case 3 -> { base = "USD"; target = "GBP"; }
                case 4 -> { base = "GBP"; target = "USD"; }
                case 5 -> { base = "USD"; target = "JPY"; }
                case 6 -> { base = "JPY"; target = "USD"; }
                case 7 -> { base = "USD"; target = "BRL"; }
                case 8 -> { base = "BRL"; target = "USD"; }
                case 9 -> { base = "EUR"; target = "GBP"; }
                case 10 -> { base = "GBP"; target = "EUR"; }
                default -> System.out.println("Opcion no valida, intente de nuevo...");
            }

            if (!base.isEmpty()) {
                //Agregar los valores obtenidos a la URI
                Moneda resultado = consulta.buscaMoneda(base, target, cantidad);

                System.out.println("\nEl valor "+cantidad+" ["+base+"] equivale a "+resultado.conversion_result()+" ["+target+"]");
            }
        }
    }
}
