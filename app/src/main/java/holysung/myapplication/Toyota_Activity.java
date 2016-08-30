package holysung.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Toyota_Activity extends AppCompatActivity {

    private Button toyota_btn_cart;
    private Button toyota_btn_shop;
    private TextView toyota_txv_86;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toyota_);

        findview();


        toyota_btn_cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s=toyota_txv_86.getText().toString();
                Intent intent=new Intent(Toyota_Activity.this,Cart_Activity.class);
                intent.putExtra("name",s);
                startActivity(intent);
            }
        });

        toyota_btn_shop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Toyota_Activity.this,Shopping_Activity.class);
                startActivity(intent);

            }
        });

    }

    private void findview() {
        toyota_btn_cart = (Button) findViewById(R.id.toyota_btn_cart);
        toyota_btn_shop = (Button) findViewById(R.id.toyota_btn_shop);
        toyota_txv_86 = (TextView) findViewById(R.id.toyota_txv_86);
    }
}
