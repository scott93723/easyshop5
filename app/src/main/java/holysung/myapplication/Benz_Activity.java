package holysung.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Objects;
public class Benz_Activity extends AppCompatActivity {
    private Button btn_check;
    private Button benz_btn_cart;
    private Button benz_btn_shop;
    private EditText benz_edit_count;
    private TextView txv_brand;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_benz_);
        findview();
        benz_btn_cart.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = txv_brand.getText().toString();
                Intent intent = new Intent(Benz_Activity.this, Cart_Activity.class);
                intent.putExtra("name", s);
                startActivity(intent);
            }

        });


        benz_btn_shop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Benz_Activity.this, Shopping_Activity.class);
                startActivity(intent);
            }
        });

    }


    private void findview() {
        txv_brand = (TextView) findViewById(R.id.txv_brand);
        benz_btn_cart = (Button) findViewById(R.id.benz_btn_cart);
        benz_btn_shop = (Button) findViewById(R.id.benz_btn_shop);
    }
}
