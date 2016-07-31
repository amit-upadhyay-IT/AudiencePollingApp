package com.aupadhyay.authentication;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class VotingActivity extends AppCompatActivity implements View.OnClickListener {

    private String CONTESTANT_NO;
    private int i;
    private TextView contestantNumberTV;

    DatabaseReference myRootRef;
    DatabaseReference myChildRootRef;
    DatabaseReference myGrandChildRootRef;
    SharedPreferences userNameF;
    String name;

    SharedPreferences votedFile;


    public void getContestantDetails()
    {
        Bundle bundle = getIntent().getExtras();

        CONTESTANT_NO = bundle.getString("CONTESTANT_NO");
        i = bundle.getInt("NO");

        contestantNumberTV = (TextView) findViewById(R.id.contestantNumberTV);
        contestantNumberTV.setText(CONTESTANT_NO);


    }

    private ImageView imageView;

    public void initViews()
    {
        imageView = (ImageView) findViewById(R.id.imageView);

        imageView.setOnClickListener(this);
    }


    public void setDatabase()
    {
        myRootRef = FirebaseDatabase.getInstance().getReference();
        myChildRootRef = myRootRef.child(String.valueOf(i));
        myGrandChildRootRef = myChildRootRef.child(name);
        myGrandChildRootRef.setValue(name);


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voting);

        Toast.makeText(this, "Toast", Toast.LENGTH_SHORT).show();

        userNameF = getSharedPreferences("user_name", Context.MODE_PRIVATE);

        name =  userNameF.getString("USER_NAME","");

        getContestantDetails();
        initViews();
    }

    @Override
    public void onClick(View view) {

        setDatabase();
        votedFile = getSharedPreferences("v_file", Context.MODE_PRIVATE);
        votedFile.edit().putString("VOTED", "true").apply();
        Toast.makeText(this, "Thanks For your Vote", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onPause() {
        super.onPause();
        finishAffinity();

    }
}
