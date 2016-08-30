package holysung.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Vip_Activity extends AppCompatActivity {

    private Button btn_vip_backtop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vip_);


        btn_vip_backtop = (Button) findViewById(R.id.btn_vip_backtop);


        Toast.makeText(Vip_Activity.this,"歡迎你，高級會員成功登入",Toast.LENGTH_SHORT).show();

        btn_vip_backtop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent=new Intent(Vip_Activity.this,MainActivity.class);
                startActivity(intent);
            }
        });


    }
}
