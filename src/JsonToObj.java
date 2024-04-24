import com.google.gson.Gson;

public class JsonToObj {




    public static CurencyConversor convercionToObj(String jsonRes){

        Gson gson = new Gson();


        ConversionRateClass jsonToObjProcesed = gson.fromJson(jsonRes, ConversionRateClass.class);


        return new CurencyConversor(jsonToObjProcesed);
    }

}
