package com.misoft.listadeusuarios;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;  // Importa ViewModelProvider

public class MainActivity extends AppCompatActivity {
    private UserViewModel userViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inicialización del ViewModel usando ViewModelProvider
        userViewModel = new ViewModelProvider(this).get(UserViewModel.class);

        EditText etNombre = findViewById(R.id.etNombre);
        EditText etEdad = findViewById(R.id.etEdad);
        Button btnGuardar = findViewById(R.id.btnGuardar);
        Button btnMostrar = findViewById(R.id.btnMostrar);
        TextView tvListaUsuarios = findViewById(R.id.tvListaUsuarios);

        btnGuardar.setOnClickListener(v -> {
            String nombre = etNombre.getText().toString();
            int edad = Integer.parseInt(etEdad.getText().toString());
            Usuario usuario = new Usuario(nombre, edad);
            userViewModel.addUser(usuario);
        });

        btnMostrar.setOnClickListener(v -> {
            StringBuilder userList = new StringBuilder();
            for (Usuario usuario : userViewModel.getUserList()) {
                userList.append(usuario.getNombre()).append(" - ").append(usuario.getEdad()).append(" años\n");
            }
            tvListaUsuarios.setText(userList.toString());
        });
    }
}
