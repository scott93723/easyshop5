package holysung.myapplication;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.util.Log;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private ListView listView;
    private String[] list = {"TOMICA普通數字車", "TOMICA 絕版TEM", "TOMICA 幻走", "TOMICA DISNEY迪士尼", "TOMICA盒裝車"};
    private ArrayAdapter<String> listAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);


        //   ActionBar actionBar = getActionBar();
        //  actionBar.setDisplayHomeAsUpEnabled(true);
//        actionBar.setIcon(R.drawable.help)


        listView = (ListView) findViewById(R.id.listView2);
        listAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, list);
        listView.setAdapter(listAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent(MainActivity.this, SmallCar_Activity.class);
                    startActivity(intent);
                }

                if (position == 1) {
                    Toast.makeText(MainActivity.this, "尚未上架", Toast.LENGTH_SHORT).show();
//                    Intent intent=new Intent(MainActivity.this,Tomica_box_Activity.class);
//                    startActivity(intent);
                }

                if (position == 2) {
                    Toast.makeText(MainActivity.this, "尚未上架", Toast.LENGTH_SHORT).show();
//                    Intent intent=new Intent(MainActivity.this,Tomica_bingo_Activity.class);
//                    startActivity(intent);
                }

                if (position == 3) {

                    Toast.makeText(MainActivity.this, "尚未上架", Toast.LENGTH_SHORT).show();
//                    Intent intent=new Intent(MainActivity.this,Tomica_Fatasy_Activity.class);
//                    startActivity(intent);
                }

                if (position == 4) {
                    Toast.makeText(MainActivity.this, "尚未上架", Toast.LENGTH_SHORT).show();
//                    Intent intent=new Intent(MainActivity.this,Tomica_Fatasy_Activity.class);
//                    startActivity(intent);
                }

                if (position == 5) {
                    Toast.makeText(MainActivity.this, "尚未上架", Toast.LENGTH_SHORT).show();
//                    Intent intent=new Intent(MainActivity.this,Tomica_Fatasy_Activity.class);
//                    startActivity(intent);
                }

                //   Toast.makeText(getApplicationContext(), "你選擇的是" + list[position], Toast.LENGTH_SHORT).show();
            }
        });
        /////////////////////////////////////////////////////////
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        if (fab != null) fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "快速登入", Snackbar.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this, Login_Activity.class);
                startActivity(intent);

            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        if (id == R.id.action_shopping) {
            Intent intent = new Intent(MainActivity.this, Cart_Activity.class);
            startActivity(intent);

            return true;
            }

        if (id == R.id.action_search) {
            Intent intent=new Intent(MainActivity.this,SearchActivity.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
            Toast.makeText(this, "Tomica小汽車", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent();
            intent.setClass(this, SmallCar_Activity.class);
            startActivity(intent);


        } else if (id == R.id.nav_gallery) {

            Toast.makeText(this, "Tomica TEM 展場車 目前未上架", Toast.LENGTH_SHORT).show();
//            Intent intent=new Intent();
//            intent.setClass(this,Tomica_TEM_Activity.class);
//            startActivity(intent);
        } else if (id == R.id.nav_slideshow) {
            Toast.makeText(this, "Tomica Disney迪士尼小汽車 目前未上架", Toast.LENGTH_SHORT).show();
//            Intent intent=new Intent();
//            intent.setClass(this,Tomica_Disney_Activity.class);
//            startActivity(intent);

        } else if (id == R.id.nav_manage) {
            Toast.makeText(this, "Tomica 幻走系列 目前未上架", Toast.LENGTH_LONG).show();
//            Intent intent=new Intent();
//            intent.setClass(this,Tomica_Fatasy_Activity.class);
//            startActivity(intent);

        } else if (id == R.id.nav_share) {
            Toast.makeText(this, "Tomica 抽抽樂 目前未上架", Toast.LENGTH_SHORT).show();
//            Intent intent=new Intent();
//            intent.setClass(this,Tomica_bingo_Activity.class);
//            startActivity(intent);

        } else if (id == R.id.nav_send) {
            Toast.makeText(this, "Tomica 盒裝車 目前未上架", Toast.LENGTH_SHORT).show();
//            Intent intent=new Intent();
//            intent.setClass(this,Tomica_box_Activity.class);
//            startActivity(intent);

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
