package es.eduardsanz.ejercicio3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import es.eduardsanz.ejercicio3.POJO.APIConexion;
import es.eduardsanz.ejercicio3.POJO.RetrofitObjeto;
import es.eduardsanz.ejercicio3.POJO.Usuario;
import es.eduardsanz.ejercicio3.databinding.ActivityMainBinding;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private ArrayList<Usuario> listaUsers;
    private Retrofit retrofit;
    APIConexion conexion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        listaUsers = new ArrayList<>();

        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        retrofit = RetrofitObjeto.getConexion();
        conexion = retrofit.create(APIConexion.class);

        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int usuarioMostrar = Integer.parseInt(binding.editTextNumber.getText().toString()) -1;
                if (usuarioMostrar >= 0 && usuarioMostrar < listaUsers.size()){
                    binding.txtNombre.setText(listaUsers.get(usuarioMostrar).getName());
                    binding.txtUsername.setText(listaUsers.get(usuarioMostrar).getUsername());
                    binding.txtEmail.setText(listaUsers.get(usuarioMostrar).getEmail());
                }else {
                    Toast.makeText(MainActivity.this, "Usuario inexistente", Toast.LENGTH_SHORT).show();
                }
            }
        });

        // Preparar la llamada
        Call<ArrayList<Usuario>> responseUsersCall = conexion.doGetUsers();

        // Llamar
        // 1. Poner en cola la petición
        responseUsersCall.enqueue(new Callback<ArrayList<Usuario>>() {
            @Override
            public void onResponse(Call<ArrayList<Usuario>> call, Response<ArrayList<Usuario>> response) {
                // Si tod0 ha ido bien (código 200 http)
                if (response.code() == 200) {
                    ArrayList<Usuario> listaUsarios = response.body();
                    listaUsers.addAll(listaUsarios);    // Paso la lista al ArrayList
                    binding.button.setEnabled(true);
                }
            }

            @Override
            public void onFailure(Call<ArrayList<Usuario>> call, Throwable t) {

            }
        });
    }
}
