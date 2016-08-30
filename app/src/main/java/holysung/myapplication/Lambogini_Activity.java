package holysung.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Lambogini_Activity extends AppCompatActivity {

    private Button la_btn_cart;
    private Button la_btn_shop;
    private TextView labo_txv_brand;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lambogini_);

        findview();


        la_btn_cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s=labo_txv_brand.getText().toString();
                Intent intent=new Intent(Lambogini_Activity.this,Cart_Activity.class);
                intent.putExtra("name",s);
                startActivity(intent);
            }
        });

        la_btn_shop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Lambogini_Activity.this,Shopping_Activity.class);
                startActivity(intent);
            }
        });

    }

    private void findview() {
        la_btn_cart = (Button) findViewById(R.id.la_btn_cart);
        la_btn_shop = (Button) findViewById(R.id.la_btn_shop);
        labo_txv_brand = (TextView) findViewById(R.id.labo_txv_brand);
    }
}
