import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class Calculadora {
    ConsumoApi consumoApi = new ConsumoApi();
    private String url = "https://v6.exchangerate-api.com/v6/4f73fe0462d5ad51fbd4c8ad/latest/USD";
    private String respuesta =  consumoApi.leerApi(url);

    private JsonObject jsonObject = JsonParser.parseString(respuesta).getAsJsonObject();

    public double valorMoneda (String moneda){
        JsonObject conversionRates = jsonObject.getAsJsonObject("conversion_rates");
        double valorMoneda = conversionRates.get(moneda).getAsDouble();
        return valorMoneda;
    }

}
