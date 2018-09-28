package com.example.lenovo.school;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class User extends AppCompatActivity {
    private Button mReturnButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user);
        mReturnButton = (Button)findViewById(R.id.returnback);
        ImageView image = (ImageView) findViewById(R.id.logo);             //使用ImageView显示logo
        image.setImageResource(R.drawable.logo);
        ImageView image1 = (ImageView) findViewById(R.id.bike);             //使用ImageView显示logo
        image.setImageResource(R.drawable.bike);
        ImageView image2 = (ImageView) findViewById(R.id.tiyu);             //使用ImageView显示logo
        image.setImageResource(R.drawable.tiyu);
        ImageView image3 = (ImageView) findViewById(R.id.life);             //使用ImageView显示logo
        image.setImageResource(R.drawable.life);
        ImageView image4 = (ImageView) findViewById(R.id.electric);             //使用ImageView显示logo
        image.setImageResource(R.drawable.electric);
        ImageView image5 = (ImageView) findViewById(R.id.work);             //使用ImageView显示logo
        image.setImageResource(R.drawable.work);
        ImageView image6 = (ImageView) findViewById(R.id.computer);             //使用ImageView显示logo
        image.setImageResource(R.drawable.computer);
        ImageView image7 = (ImageView) findViewById(R.id.book);             //使用ImageView显示logo
        image.setImageResource(R.drawable.book);
        ImageView image8 = (ImageView) findViewById(R.id.person);             //使用ImageView显示logo
        image.setImageResource(R.drawable.person);
        ImageView image9 = (ImageView) findViewById(R.id.contect);             //使用ImageView显示logo
        image.setImageResource(R.drawable.contect);
    }
    public void back_to_login(View view) {
        //setContentView(R.layout.login);
        Intent intent3 = new Intent(User.this,Login.class) ;
        startActivity(intent3);
        finish();

    }
}

