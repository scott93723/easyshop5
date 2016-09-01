package holysung.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Cart_Activity extends AppCompatActivity {
    private EditText edit_cart;
    private Button btn_cart_submit;
    private TextView txv_count;
    private TextView cart_txv_count;
    private TextView cart_txv_brand;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart_);

        cart_txv_brand = (TextView) findViewById(R.id.cart_txv_brand);
        cart_txv_count = (TextView) findViewById(R.id.cart_txv_count);
        btn_cart_submit = (Button) findViewById(R.id.btn_cart_submit);





//        if (b != null) {
//            String j = (String) b.get("name");
//            cart_txv_brand.setText(j);
//
//        }
////////////////////////////////////////////////////////////////////////////////////////////
        //傳送資料 bundle
        //      Bundle bundle = this.getIntent().getExtras();
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        if (bundle!=null) {
            String brand=(String )bundle.get("name");
            cart_txv_brand.setText(brand);

            String count = bundle.getString("count");
//要接從第一頁接的字串
            //  int a =bundle.getInt("123");
//要接從第一頁接的數字
            cart_txv_count.setText(count + "台");
            //  cart_txv_count.setText(s+","+Integer.toString(a));

        }
        btn_cart_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Cart_Activity.this, Shopping_Activity.class);
                startActivity(intent);
            }
        });


    }


}
