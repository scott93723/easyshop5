package holysung.myapplication;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login_Activity extends AppCompatActivity {

    private Button btn_regist;
    private Button button_login;
    private EditText edit_userid;
    private EditText edit_pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_);

        btn_regist = (Button) findViewById(R.id.button_regist);
        button_login = (Button) findViewById(R.id.button_login);
        edit_userid = (EditText) findViewById(R.id.edit_userid);
        edit_pass = (EditText) findViewById(R.id.edit_pass);

//        SharedPreferences prefs = this.getSharedPreferences(
//                "myapplication", Context.MODE_PRIVATE);
//       // SharedPreferences setting = getPreferences("myapplication", MODE_PRIVATE);
//        edit_userid.setText(prefs.getString("PREF_USERID", ""));


        button_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                String uid = edit_userid.getText().toString();
//                String pw = edit_pass.getText().toString();

//                if (uid.equals("scot") && pw.equals("1234")) {
//                    SharedPreferences prefs = this.getSharedPreferences(
//                            "myapplication", Context.MODE_PRIVATE);
//                    prefs.edit()
//                            .putString("PREF_USERID", uid)
//                            .commit();
//                    Toast.makeText(Login_Activity.this, "success", Toast.LENGTH_SHORT).show();
//                }


                if ("".equals(edit_userid.getText().toString().trim())) {
                    Toast.makeText(Login_Activity.this, "帳號欄位不能為空白", Toast.LENGTH_SHORT).show();
                }
                if (edit_userid.length() < 4 || edit_userid.length() > 6) {
                    Toast.makeText(Login_Activity.this, "使用者長度不足", Toast.LENGTH_SHORT).show();
                }
                if ("".equals(edit_pass.getText().toString().trim())) {
                    Toast.makeText(Login_Activity.this, "密碼欄位不能為空白", Toast.LENGTH_SHORT).show();
                }
                if (edit_pass.length() < 4 || edit_pass.length() > 6) {
                    Toast.makeText(Login_Activity.this, "密碼長度不足", Toast.LENGTH_SHORT).show();
                }


                if (edit_userid.getText().toString().equals("scot") && edit_pass.getText().toString().equals("1234")) {


                    Intent intent = new Intent(Login_Activity.this, Vip_Activity.class);
                    startActivity(intent);

                } else {

                    Toast.makeText(Login_Activity.this, "帳號密碼輸入錯誤", Toast.LENGTH_SHORT).show();


                }


            }


        });

        //註冊鈕的事件
        btn_regist.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(Login_Activity.this, Regist_Activity.class);
                startActivity(intent);

            }
        });

    }

    private void getPreferences(String myapplication, int modePrivate) {

    }


}
