package es.eduardsanz.ejercicio3.POJO;

import java.util.ArrayList;

import es.eduardsanz.ejercicio3.ResponseUsers;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface APIConexion {

    // Call<OBJETO> -> llamada a una API que recibe un Objeto -> Genera PARSE del String al Objeto

    // Get de todos los users en la api
    @GET("/users")
    Call<ArrayList<Usuario>> doGetUsers();

    // GET de users/id
    @GET("/users?")
    Call<Usuario> doGetUsersPage(@Query("page") String page);
}
