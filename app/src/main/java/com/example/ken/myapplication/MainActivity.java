package com.example.ken.myapplication;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button)findViewById(R.id.button12);

        Button nextpagebtn = (Button)findViewById(R.id.button12);
        nextpagebtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this , Main2Activity.class);
                startActivity(intent);
            }
        });

        Button text = (Button)findViewById(R.id.button);
        text.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                AlertDialog.Builder A = new AlertDialog.Builder(MainActivity.this);
                A.setTitle("測試用框框")
                 .setMessage("我的鑽頭 是可以突破天際的鑽頭")
                  .setNegativeButton("不是",new DialogInterface.OnClickListener() {
                      @Override
                      public void onClick(DialogInterface arg0, int arg1) {

                          Toast.makeText(MainActivity.this, "不 你的鑽頭才不是",Toast.LENGTH_SHORT).show();
                      }

                  });
                A.setPositiveButton("是",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {

                        Toast.makeText(MainActivity.this, "是 我承認你的鑽頭",Toast.LENGTH_SHORT).show();
                    }

                });
                A.setNeutralButton("取消",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {

                        Toast.makeText(MainActivity.this, "關我屁事",Toast.LENGTH_SHORT).show();
                    }

                });
                A.show();

            }
        });
    }
    public void OHO(View view)
    {

    }

}
