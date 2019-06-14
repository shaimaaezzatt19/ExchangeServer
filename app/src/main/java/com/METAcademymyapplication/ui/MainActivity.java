package com.METAcademymyapplication.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.METAcademymyapplication.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.GOActivity_Logo)
    ImageView GOActivityLogo;
    @BindView(R.id.GoButton)
    Button GoButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    public void Go(View V) {

    }

    @OnClick({R.id.GOActivity_Logo, R.id.GoButton})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.GOActivity_Logo:
                break;
            case R.id.GoButton:
                Intent i = new Intent(MainActivity.this, GOActivity.class);
                startActivity(i);
                break;
        }
    }
}
