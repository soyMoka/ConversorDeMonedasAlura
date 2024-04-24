import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        Api api1 = new Api();
        String data = api1.getData();
        CurencyConversor conversion = JsonToObj.convercionToObj(data);
        System.out.println(conversion);
        Scanner lectura = new Scanner(System.in);
        int userChoice = 0;

        while (userChoice !=9){
            printMenu();
            userChoice = lectura.nextInt();

            if (userChoice == 9){
                System.out.println("Fin del programa.");
            }

            System.out.println("Ingrese el monto que desea convertir: ");
            float amount = lectura.nextFloat();

            switch(userChoice) {
                case 1:
                    System.out.println(amount + " dolares Estadounidenses es igual a "+conversion.convert(conversion.usd, conversion.ars, amount) + "  pesos Argentinos");
                    break;
                case 2:
                    System.out.println(amount + " pesos Argentinos es igual a "+conversion.convert(conversion.ars, conversion.usd, amount) + " dolares Estadounidenses");
                    break;
                case 3:
                    System.out.println(amount + " dolares Estadounidenses es igual a "+conversion.convert(conversion.usd, conversion.brl, amount) + "  reales Brasileños");
                    break;
                case 4:
                    System.out.println(amount + " reales Brasileños es igual a "+conversion.convert(conversion.brl, conversion.usd, amount) + " dolares Estadounidenses");
                    break;
                case 5:
                    System.out.println(amount + " dolares Estadounidenses es igual a "+conversion.convert(conversion.usd, conversion.cop, amount) + "  pesos Colombianos");

                    break;
                case 6:
                    System.out.println(amount + " pesos Colombianos es igual a "+conversion.convert(conversion.cop, conversion.usd, amount) + " dolares Estadounidenses");

                    break;
                case 7:
                    System.out.println(amount + " dolares Estadounidenses es igual a "+conversion.convert(conversion.usd, conversion.bob, amount) + "  bolivianos Bolivianos");
                    break;
                case 8:
                    System.out.println(amount + " bolivianos Bolivianos es igual a "+conversion.convert(conversion.bob, conversion.usd, amount) + " dolares Estadounidenses");
                    break;
                default:
                    System.out.println("Ingrese un valor válido");
            }
        }


    }

    public static void printMenu(){
        System.out.println("""
                +++++++++++++++++++++++++++++++++++++++++++++++++
                Conversor de monedas:
                \s
                1) - Dolar => Peso Argentino
                2) - Peso Argentino => Dolar
                3) - Dolar => Real Brasileño
                4) - Real brasileño => Dolar
                5) - Dolar -> Peso Colombiano
                6) - Peso Colombiano -> Dolar
                7) - Dolar -> Boliviano Boliviano
                8) - Boliviano Boliviano -> Dolar
                9) - Salir
                \s
                Elija una opción válida:\s
                +++++++++++++++++++++++++++++++++++++++++++++++++
                """
        );


    }
    }