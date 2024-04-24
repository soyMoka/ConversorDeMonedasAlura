import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
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
                break;
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





//        System.out.println("API_response: " + data);








//        System.out.println("text");
//        String userInput = lectura.nextLine();

    }

    public static void printMenu(){
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++\n"
                        + "Conversor de monedas:\n"
                        + " \n"
                        + "1) - Dolar => Peso Argentino\n"
                        + "2) - Peso Argentino => Dolar\n"
                        + "3) - Dolar => Real Brasileño\n"
                        + "4) - Real brasileño => Dolar\n"
                        + "5) - Dolar -> Peso Colombiano\n"
                        + "6) - Peso Colombiano -> Dolar\n"
                        + "7) - Dolar -> Boliviano Boliviano\n"
                        + "8) - Boliviano Boliviano -> Dolar\n"
                        + "9) - Salir\n"
                        + " \n"
                        + "Elija una opción válida: \n"
                +"+++++++++++++++++++++++++++++++++++++++++++++++++\n"
        );


    }



    }
// "Dolar -> Peso argentino"
// alr
// "Dolar -> Real brasileño"
// "alr"
// "Dolar -> Peso Colombiano"
// "alr"
// "Dolar -> Boliviano boliviano
// "alr"
//

//ARS - Peso argentino
//BOB - Boliviano boliviano
//BRL - Real brasileño
//CLP - Peso chileno
//COP - Peso colombiano
//USD - Dólar estadounidense