import com.google.gson.Gson;

public class JsonToObj {




    public static CurencyConversor convercionToObj(String jsonRes){

        Gson gson = new Gson();

        System.out.println("gson: " + gson);

        ConversionRateClass jsonToObjProcesed = gson.fromJson(jsonRes, ConversionRateClass.class);

        System.out.println("JsonToObj: " + jsonToObjProcesed);

        return new CurencyConversor(jsonToObjProcesed);
    }

}
