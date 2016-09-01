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

    private Button benz_btn_cart;
    private TextView benz_txv_brand;
    private EditText benz_edit_count;
    private Button benz_btn_shop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_benz_);

        benz_btn_cart = (Button) findViewById(R.id.benz_btn_cart);
        benz_txv_brand = (TextView) findViewById(R.id.benz_txv_brand);
        benz_edit_count = (EditText) findViewById(R.id.benz_edit_count);
        benz_btn_shop = (Button) findViewById(R.id.benz_btn_shop);

        benz_btn_cart.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                String brand = benz_txv_brand.getText().toString();
                Intent intent = new Intent(Benz_Activity.this, Cart_Activity.class);
                intent.putExtra("name", brand);
                intent.putExtra("count", benz_edit_count.getText().toString());
                startActivity(intent);
            }
        });


        benz_btn_shop.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Benz_Activity.this, Shopping_Activity.class);
                startActivity(intent);
            }
        });


    }

}
