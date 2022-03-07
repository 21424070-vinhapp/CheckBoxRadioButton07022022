 package com.example.checkboxradiobutton07022022;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

 public class MainActivity extends AppCompatActivity {
    CheckBox mChkCSharp, mChkAndroid, mChkSwift;
    Button mBtnXacNhan,mBtnBinhChon;
    TextView mTxtSoThich,mTxtQuyenLuc;
    RadioButton mRadBiden,mRadPutin,mRadKimJongUn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //CheckBox
        mChkAndroid=findViewById(R.id.chkAndroid);
        mChkCSharp=findViewById(R.id.chkCSharp);
        mChkSwift=findViewById(R.id.chkSwift);
        mBtnXacNhan=findViewById(R.id.btnXacNhan);
        mTxtSoThich=findViewById(R.id.txtSoThich);
        //RadioButton
        mRadBiden=findViewById(R.id.radBiden);
        mRadPutin=findViewById(R.id.radPutin);
        mRadKimJongUn=findViewById(R.id.radKimJongUn);
        mTxtQuyenLuc=findViewById(R.id.txtQuyenLuc);
        mBtnBinhChon=findViewById(R.id.btnBinhChon);

        mBtnXacNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg="";

                if(mChkAndroid.isChecked())
                {
                    msg+=mChkAndroid.getText().toString()+"\n";
                }
                if(mChkCSharp.isChecked())
                {
                    msg+=mChkCSharp.getText().toString()+"\n";
                }
                if(mChkSwift.isChecked())
                {
                    msg+=mChkSwift.getText().toString()+"\n";
                }

                mTxtSoThich.setText(msg);
            }
        });

        mBtnBinhChon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mRadBiden.isChecked())
                {
                    mTxtQuyenLuc.setText(mRadBiden.getText());
                }
                else if(mRadPutin.isChecked())
                {
                    mTxtQuyenLuc.setText(mRadPutin.getText());
                }
                else if(mRadKimJongUn.isChecked())
                {
                    mTxtQuyenLuc.setText(mRadKimJongUn.getText());
                }
            }
        });
    }
}