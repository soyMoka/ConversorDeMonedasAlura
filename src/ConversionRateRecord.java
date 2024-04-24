//public record ResponseExchangerate(String base_code, String target_code, float conversion_rate, float conversion_result  ) {
public record ConversionRateRecord(
                                   float USD,
                                   float ARS,
                                   float BOB,
                                   float BRL,
                                   float CLP,
                                   float COP
) {

}

//ARS - Peso argentino
//BOB - Boliviano boliviano
//BRL - Real brasileño
//CLP - Peso chileno
//COP - Peso colombiano
//USD - Dólar estadounidense
