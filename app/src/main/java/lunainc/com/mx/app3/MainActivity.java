package lunainc.com.mx.app3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private Button btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.btnClaseAnonima);
        btn2 = (Button) findViewById(R.id.btnImplements);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Desde la Anonima", Toast.LENGTH_SHORT).show();
                
            }
        });

        btn2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.btnImplements:
                Toast.makeText(this, "Desde el onclick del implements", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnOnClick:
                Toast.makeText(this, "Desde el onclick del metodo", Toast.LENGTH_SHORT).show();
                break;
        }

        /**
         if (v.getId() == R.id.btnImplements){
         Toast.makeText(this, "Desde el onclick del implements", Toast.LENGTH_SHORT).show();
         }else if(v.getId() == R.id.btnOnClick){
         Toast.makeText(this, "Desde el onclick del metodo", Toast.LENGTH_SHORT).show();

         }
         */
    }

    public void eventoBoton(View view) {
        Toast.makeText(this, "Desde el onclick del metodo", Toast.LENGTH_SHORT).show();
    }
}
