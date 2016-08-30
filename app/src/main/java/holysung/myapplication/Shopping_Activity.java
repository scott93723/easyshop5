package holysung.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Shopping_Activity extends AppCompatActivity {

    private Button btn_shopping;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping_);

        btn_shopping = (Button) findViewById(R.id.button_next);

        btn_shopping.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Shopping_Activity.this, Login_Activity.class);
                startActivity(intent);
            }
        });

    }
}
