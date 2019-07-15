package e.pc.challenge1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button A,B;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        A=findViewById(R.id.buttonA);
        B=findViewById(R.id.buttonB);
        A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent clickA=new Intent(MainActivity.this,ActivityA.class);
                startActivity(clickA);
            }
        });
        B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent clickB=new Intent(MainActivity.this,ActivityB.class);
                startActivity(clickB);
            }
        });
    }
}
