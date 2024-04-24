public class CurencyConversor {
    float usd;
    float ars;
    float bob;
    float brl;
    float clp;
    float cop;


    public CurencyConversor(ConversionRateClass resExchangerate){
       this.usd = resExchangerate.conversion_rates.USD;
       this.ars = resExchangerate.conversion_rates.ARS;
       this.bob = resExchangerate.conversion_rates.BOB;
       this.brl = resExchangerate.conversion_rates.BRL;
       this.clp = resExchangerate.conversion_rates.CLP;
       this.cop = resExchangerate.conversion_rates.COP;

    }

    @Override
    public String toString() {
        return "CurencyConversor{" +
                "usd=" + usd +
                ", ars=" + ars +
                ", bob=" + bob +
                ", brl=" + brl +
                ", clp=" + clp +
                ", cop=" + cop +
                '}';


        }
    public float convert(float base, float target, float amount){
            return (amount * target)/base;

    }
}
// "base_code": "USD",
//         "conversion_rates": {
//         "USD": 1,
//         "AED": 3.6725,
//         "AFN": 72.1000,
//         "ALL": 94.6546,
//ARS - Peso argentino
//BOB - Boliviano boliviano
//BRL - Real brasileño
//CLP - Peso chileno
//COP - Peso colombiano
//USD - Dólar estadounidense

