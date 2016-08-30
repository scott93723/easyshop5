package holysung.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class SmallCar_Activity extends AppCompatActivity {
    private ListView listView;
    private String[] list = {"BMW","BENZ","TOYOTA","LAMBOGINNI"};
    private ArrayAdapter<String> listAdapter;
    private Toolbar toolbar2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView)findViewById(R.id.listView2);
        listAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,list);
        listView.setAdapter(listAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position==0){
                    Intent intent=new Intent(SmallCar_Activity.this,Bmw_Activity.class);
                    startActivity(intent);
                }

                if (position==1){
                    Intent intent=new Intent(SmallCar_Activity.this,Benz_Activity.class);
                    startActivity(intent);
                }

                if (position==2){
                    Intent intent=new Intent(SmallCar_Activity.this,Toyota_Activity.class);
                    startActivity(intent);

                }


                if(position==3){
                    Intent intent=new Intent(SmallCar_Activity.this,Lambogini_Activity.class);
                    startActivity(intent);

                }


                Toast.makeText(getApplicationContext(), "你選擇的是" + list[position], Toast.LENGTH_SHORT).show();
            }
        });
    }
}