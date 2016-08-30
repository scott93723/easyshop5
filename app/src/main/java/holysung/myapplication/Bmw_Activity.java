package holysung.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Bmw_Activity extends AppCompatActivity {

    private Button btn_chech;
    private Button btn_cart;
    private TextView bmw_txv_brand;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmw);

   //     Toast.makeText(this,"BMW",Toast.LENGTH_LONG).show();

        findview();



        btn_cart.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s=bmw_txv_brand.getText().toString();
                Intent intent=new Intent(Bmw_Activity.this,Cart_Activity.class);
                intent.putExtra("name",s);
                startActivity(intent);


            }
        });


        btn_chech.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Bmw_Activity.this,Shopping_Activity.class);
                startActivity(intent);

            }
        });


    }

    private void findview() {
        btn_chech = (Button) findViewById(R.id.btn_chech);
        btn_cart = (Button) findViewById(R.id.bmw_btn_cart);
        bmw_txv_brand = (TextView) findViewById(R.id.bmw_txv_brand);
    }
}
