package holysung.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Regist_Activity extends AppCompatActivity {

    private Button btn_submit;
    private EditText regist_id;
    private EditText regist_passwd;
    private EditText regist_address;
    private EditText regist_email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regist_);
        //////////////////////////////////////////
        findview();


        btn_submit.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                if ("".equals(regist_id.getText().toString().trim())) {
                    Toast.makeText(Regist_Activity.this, "帳號不能為空", Toast.LENGTH_SHORT).show();
                }

                if (regist_id.length()>6||regist_id.length()<4){
                    Toast.makeText(Regist_Activity.this,"帳號長度不足",Toast.LENGTH_SHORT).show();

                }
                if ("".equals(regist_passwd.getText().toString().trim())) {
                    Toast.makeText(Regist_Activity.this, "密碼不能為空", Toast.LENGTH_SHORT).show();
                }
                if (regist_passwd.length()>6||regist_passwd.length()<4){
                    Toast.makeText(Regist_Activity.this,"密碼長度不足",Toast.LENGTH_SHORT).show();
                }


                if ("".equals(regist_address.getText().toString().trim())) {
                    Toast.makeText(Regist_Activity.this, "地址不能為空", Toast.LENGTH_SHORT).show();
                }



                if ("".equals(regist_email.getText().toString().trim())){
                    Toast.makeText(Regist_Activity.this,"電子信箱不能為空",Toast.LENGTH_SHORT).show();
                }


//                if (regist_email.getText().toString().trim().indexOf("@")>=0){
//
//                    Toast.makeText(Regist_Activity.this,"電子信箱格式錯誤",Toast.LENGTH_SHORT).show();
//                }

            }
        });

    }

    private void findview() {
        btn_submit = (Button) findViewById(R.id.button_submit);
        regist_id = (EditText) findViewById(R.id.regist_id);
        regist_passwd = (EditText) findViewById(R.id.regist_passwd);
        regist_address = (EditText) findViewById(R.id.regist_address);
        regist_email = (EditText) findViewById(R.id.regist_email);

    }
}
