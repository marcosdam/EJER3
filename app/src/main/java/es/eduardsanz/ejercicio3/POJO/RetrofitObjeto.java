package es.eduardsanz.ejercicio3.POJO;

import es.eduardsanz.ejercicio3.Configuracion;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitObjeto {

    // 1. URL BASE DEL SERVIDOR: https://jsonplaceholder.typicode.com
    // 2. CONVERTER -> converter-gson

    public static Retrofit getConexion(){
        return new Retrofit.Builder()
                .baseUrl(Configuracion.URL_TODOS_USERS)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
}
