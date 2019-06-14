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

public class SendActivity extends AppCompatActivity {

    @BindView(R.id.Send_To)
    TextView SendTo;
    @BindView(R.id.Send_To_TV)
    EditText SendToTV;
    @BindView(R.id.Address)
    TextView Address;
    @BindView(R.id.Address_TV)
    EditText AddressTV;
    @BindView(R.id.MessageDeatils)
    EditText MessageDeatils;
    @BindView(R.id.Send_Button)
    Button SendButton;
    @BindView(R.id.SendActivity_back_Button)
    Button SendActivityBackButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.Send_To, R.id.Send_To_TV, R.id.Address, R.id.Address_TV, R.id.MessageDeatils, R.id.Send_Button, R.id.SendActivity_back_Button})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.Send_To:
                break;
            case R.id.Send_To_TV:
                break;
            case R.id.Address:
                break;
            case R.id.Address_TV:
                break;
            case R.id.MessageDeatils:
                break;
            case R.id.Send_Button:

                // عرفنا متغيرات سترنج لاحتوائها على النصوص التي يكتبها المستخدم
                String sendto = SendToTV.getText().toString();
                String subject = Address.getText().toString();
                String message = MessageDeatils.getText().toString();

                // انتنت جديد لارسال السترنج الذي عرفناه في الاعلى
                Intent email = new Intent(Intent.ACTION_SEND);

                // سترنج المستلم وتستطيع وضع اكثر من خانة لايميل المستلم إذا اردت
                email.putExtra(Intent.EXTRA_EMAIL, new String[]{});
                email.putExtra(Intent.EXTRA_SUBJECT, subject);
                email.putExtra(Intent.EXTRA_TEXT, message);

                //هذا الأمر تحتاجه فقط مع التعامل مع تطبيقات الايميل .. البريد الإلكتروني وهي اساسية لنظام اندرويد
                email.setType("message/rfc822");

                // وهذا الأمر الذي يفعله الزر .. قم بإرسال الانتنت الذي صنعناه قبل قليل
                startActivity(Intent.createChooser(email, "اختر التطبيق الذي تريد ارسال الرسالة عن طريقه :"));
                break;
                 case R.id.SendActivity_back_Button:
                Intent i = new Intent(SendActivity.this, GOActivity.class);
                startActivity(i);
                break;
        }
    }


}
