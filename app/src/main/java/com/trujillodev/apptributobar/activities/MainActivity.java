package com.trujillodev.apptributobar.activities;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.trujillodev.apptributobar.R;
import com.trujillodev.apptributobar.utils.FirebaseStatic;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private FirebaseDatabase database;
    private DatabaseReference mRoot;
    private DatabaseReference mRef;

    private ProgressDialog progressDialog;

    private String keyId = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle(R.string.welcome);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        progressDialog = new ProgressDialog(this);

        database = FirebaseDatabase.getInstance();
        mRoot = database.getReference();

        //demoHelloWord();
    }

    @Override
    protected void onStart() {
        super.onStart();
        mRef = mRoot.child(FirebaseStatic.HelloWord);

        progressDialog.setMessage("Conectando...");
        progressDialog.show();

    }

    private void demoHelloWord() {
        keyId = mRef.push().getKey();

        mRef.child(keyId).setValue("Hola mundo !");

        mRef.keepSynced(true);
        mRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for (DataSnapshot child : dataSnapshot.getChildren()){
                    Log.i(TAG, "show all entities data -> " + child);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }
}
