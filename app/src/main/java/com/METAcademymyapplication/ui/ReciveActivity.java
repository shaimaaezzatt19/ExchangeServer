package com.METAcademymyapplication.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.METAcademymyapplication.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ReciveActivity extends AppCompatActivity {

    @BindView(R.id.Recive_From)
    TextView ReciveFrom;
    @BindView(R.id.Recive_From_TV)
    TextView ReciveFromTV;
    @BindView(R.id.ReciveActivity_Message)
    TextView ReciveActivityMessage;
    @BindView(R.id.RecivieActivityMessgae_Tv)
    TextView RecivieActivityMessgaeTv;
    @BindView(R.id.Recivie_Button)
    Button RecivieButton;
    @BindView(R.id.Back_Button)
    Button BackButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recive);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.Recive_From, R.id.Recive_From_TV, R.id.ReciveActivity_Message, R.id.RecivieActivityMessgae_Tv, R.id.Recivie_Button})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.Recive_From:
                break;
            case R.id.Recive_From_TV:
                break;
            case R.id.ReciveActivity_Message:
                break;
            case R.id.RecivieActivityMessgae_Tv:
                break;
            case R.id.Recivie_Button:

               break;
        }
    }

    @OnClick(R.id.Back_Button)
    public void onViewClicked() {
        Intent i = new Intent(ReciveActivity.this, MainActivity.class);
        startActivity(i);
    }
}
