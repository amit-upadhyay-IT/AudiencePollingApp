package com.aupadhyay.authentication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;

public class ContestantVoteActivity extends AppCompatActivity implements View.OnClickListener {

    private String userName;
    private TextView userNmaeDisplayTV;

    public void getName()
    {
        Bundle bundle = getIntent().getExtras();
        userName = bundle.getString("NAME");
        userNmaeDisplayTV = (TextView) findViewById(R.id.userNmaeDisplayTV);
        userNmaeDisplayTV.setText("Welcome "+userName);
    }


    private CardView cardView1, cardView2,cardView3,cardView4,cardView5,cardView6,cardView7,cardView8,cardView9,cardView10,cardView11,cardView12,cardView13,cardView14;

    public void initViews()
    {

        cardView1 = (CardView) findViewById(R.id.cardView1);
        cardView2 = (CardView) findViewById(R.id.cardView2);
        cardView3 = (CardView) findViewById(R.id.cardView3);
        cardView4 = (CardView) findViewById(R.id.cardView4);
        cardView5 = (CardView) findViewById(R.id.cardView5);
        cardView6 = (CardView) findViewById(R.id.cardView6);
        cardView7 = (CardView) findViewById(R.id.cardView7);
        cardView8 = (CardView) findViewById(R.id.cardView8);
        cardView9 = (CardView) findViewById(R.id.cardView9);
        cardView10 = (CardView) findViewById(R.id.cardView10);
        cardView11 = (CardView) findViewById(R.id.cardView11);
        cardView12 = (CardView) findViewById(R.id.cardView12);
        cardView13 = (CardView) findViewById(R.id.cardView13);
        cardView14 = (CardView) findViewById(R.id.cardView14);


        cardView1.setOnClickListener(this);
        cardView2.setOnClickListener(this);
        cardView3.setOnClickListener(this);
        cardView4.setOnClickListener(this);
        cardView5.setOnClickListener(this);
        cardView6.setOnClickListener(this);
        cardView7.setOnClickListener(this);
        cardView8.setOnClickListener(this);
        cardView9.setOnClickListener(this);
        cardView10.setOnClickListener(this);
        cardView11.setOnClickListener(this);
        cardView12.setOnClickListener(this);
        cardView13.setOnClickListener(this);
        cardView14.setOnClickListener(this);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contestant_vote);

        getName();

        initViews();
    }

    @Override
    public void onClick(View view) {

        switch (view.getId())
        {
            case R.id.cardView1:
            {

                Intent intent = new Intent(this, VotingActivity.class);
                Bundle bundle = new Bundle();
                bundle.putInt("NO", 1);
                bundle.putString("CONTESTANT_NO", "Contestant One");
                intent.putExtras(bundle);
                startActivity(intent);

            }
                break;
            case R.id.cardView2:

            {

                Intent intent = new Intent(this, VotingActivity.class);
                Bundle bundle = new Bundle();
                bundle.putInt("NO", 2);
                bundle.putString("CONTESTANT_NO", "Contestant Two");
                intent.putExtras(bundle);
                startActivity(intent);

            }

                break;
            case R.id.cardView3:

            {

                Intent intent = new Intent(this, VotingActivity.class);
                Bundle bundle = new Bundle();
                bundle.putInt("NO", 3);
                bundle.putString("CONTESTANT_NO", "Your are voting Contestant Three");
                intent.putExtras(bundle);
                startActivity(intent);

            }

                break;
            case R.id.cardView4:

            {

                Intent intent = new Intent(this, VotingActivity.class);
                Bundle bundle = new Bundle();
                bundle.putInt("NO", 4);
                bundle.putString("CONTESTANT_NO", "Your are voting Contestant Four");
                intent.putExtras(bundle);
                startActivity(intent);

            }

                break;
            case R.id.cardView5:

            {

                Intent intent = new Intent(this, VotingActivity.class);
                Bundle bundle = new Bundle();
                bundle.putInt("NO", 5);
                bundle.putString("CONTESTANT_NO", "Your are voting Contestant Five");
                intent.putExtras(bundle);
                startActivity(intent);

            }

                break;
            case R.id.cardView6:

            {

                Intent intent = new Intent(this, VotingActivity.class);
                Bundle bundle = new Bundle();
                bundle.putInt("NO", 6);
                bundle.putString("CONTESTANT_NO", "Your are voting Contestant Six");
                intent.putExtras(bundle);
                startActivity(intent);

            }

                break;
            case R.id.cardView7:

            {

                Intent intent = new Intent(this, VotingActivity.class);
                Bundle bundle = new Bundle();
                bundle.putInt("NO", 7);
                bundle.putString("CONTESTANT_NO", "Your are voting Contestant Seven");
                intent.putExtras(bundle);
                startActivity(intent);

            }

                break;
            case R.id.cardView8:

            {

                Intent intent = new Intent(this, VotingActivity.class);
                Bundle bundle = new Bundle();
                bundle.putInt("NO", 8);
                bundle.putString("CONTESTANT_NO", "Your are voting Contestant Eight");
                intent.putExtras(bundle);
                startActivity(intent);

            }

                break;
            case R.id.cardView9:

            {

                Intent intent = new Intent(this, VotingActivity.class);
                Bundle bundle = new Bundle();
                bundle.putInt("NO", 9);
                bundle.putString("CONTESTANT_NO", "Your are voting Contestant Nine");
                intent.putExtras(bundle);
                startActivity(intent);

            }

                break;
            case R.id.cardView10:

            {

                Intent intent = new Intent(this, VotingActivity.class);
                Bundle bundle = new Bundle();
                bundle.putInt("NO", 10);
                bundle.putString("CONTESTANT_NO", "Your are voting Contestant Ten");
                intent.putExtras(bundle);
                startActivity(intent);

            }

                break;
            case R.id.cardView11:

            {

                Intent intent = new Intent(this, VotingActivity.class);
                Bundle bundle = new Bundle();
                bundle.putInt("NO", 11);
                bundle.putString("CONTESTANT_NO", "Your are voting Contestant Eleven");
                intent.putExtras(bundle);
                startActivity(intent);

            }

                break;
            case R.id.cardView12:

            {

                Intent intent = new Intent(this, VotingActivity.class);
                Bundle bundle = new Bundle();
                bundle.putInt("NO", 12);
                bundle.putString("CONTESTANT_NO", "Your are voting Contestant Twelve");
                intent.putExtras(bundle);
                startActivity(intent);

            }

                break;
            case R.id.cardView13:

            {

                Intent intent = new Intent(this, VotingActivity.class);
                Bundle bundle = new Bundle();
                bundle.putInt("NO", 13);
                bundle.putString("CONTESTANT_NO", "Your are voting Contestant Thirteen");
                intent.putExtras(bundle);
                startActivity(intent);

            }

                break;
            case R.id.cardView14:

            {

                Intent intent = new Intent(this, VotingActivity.class);
                Bundle bundle = new Bundle();
                bundle.putInt("NO", 14);
                bundle.putString("CONTESTANT_NO", "Your are voting Contestant Fourteen");
                intent.putExtras(bundle);
                startActivity(intent);

            }

                break;
        }

    }
}
