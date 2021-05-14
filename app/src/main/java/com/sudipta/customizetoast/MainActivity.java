package com.sudipta.customizetoast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void SimpleToast(View view){
//        Toast.makeText(this, "Hi,this is basic Toast", Toast.LENGTH_SHORT).show();
        Context context =getApplicationContext();
        LayoutInflater inflater = getLayoutInflater();

        View customToastRoot = inflater.inflate(R.layout.my_toast,null);
        Toast customToast = new Toast(context);

        customToast.setView(customToastRoot);
        customToast.setDuration(Toast.LENGTH_LONG);
        customToast.show();

    }
}