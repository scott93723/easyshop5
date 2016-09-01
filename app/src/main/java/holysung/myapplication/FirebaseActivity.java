package holysung.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.firebase.client.ChildEventListener;
import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;

public class FirebaseActivity extends AppCompatActivity {

    private ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firebase);


        list = (ListView) findViewById(R.id.listView);

        final ArrayAdapter<String> adapter=
                new ArrayAdapter<String>(this,
                        android.R.layout.simple_list_item_1,
                        android.R.id.text1);

        list.setAdapter(adapter);

        Firebase.setAndroidContext(this);
        String url="https://firechat-ab977.firebaseio.com/contacts";

        new Firebase(url).addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {

                adapter.add(
                        (String)dataSnapshot.child("name").getValue()
                );

            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {
                adapter.remove(
                        (String)dataSnapshot.child("name").getValue()
                );

            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });








    }
}
