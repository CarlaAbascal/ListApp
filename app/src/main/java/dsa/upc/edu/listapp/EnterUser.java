package dsa.upc.edu.listapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class EnterUser extends AppCompatActivity {
    Button btn_Enviar;
    String user;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.enter_user);
        btn_Enviar = findViewById(R.id.buttonEnviar);

    }
    public void enviarUserCLick(android.view.View v){
        Intent intent = new Intent(this, ReposActivity.class);
        intent.putExtra("user", user.toString()); // Aquí pasas los datos
        startActivity(intent);
    }
}