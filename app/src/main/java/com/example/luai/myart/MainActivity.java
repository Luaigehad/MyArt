package com.example.luai.myart;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ListView listView;
    String mTitle[]={"الكرسي","إبني لي","القلم","الكرسي 2" , "الحكمة","قل هو","الصمد"          };
    String mdes []={ "قياس: 75x75","قياس: 75x75","قياس: 75x75","قياس: 75x75" , "قياس: 75x75","قياس: 75x75","قياس: 75x75"         };
    int image[]={ R.drawable.a,R.drawable.b,R.drawable.d,R.drawable.f,R.drawable.g,R.drawable.h,R.drawable.m,};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        listView =findViewById(R.id.listview);

        myadapter adapter =new myadapter(this,mTitle,mdes,image);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position==0){
                    Toast.makeText(MainActivity.this, "1", Toast.LENGTH_SHORT).show();
                }  if (position==0){
                    Toast.makeText(MainActivity.this, "2", Toast.LENGTH_SHORT).show();
                }  if (position==0){
                    Toast.makeText(MainActivity.this, "3", Toast.LENGTH_SHORT).show();
                }  if (position==0){
                    Toast.makeText(MainActivity.this, "4", Toast.LENGTH_SHORT).show();
                }  if (position==0){
                    Toast.makeText(MainActivity.this, "5", Toast.LENGTH_SHORT).show();
                }  if (position==0){
                    Toast.makeText(MainActivity.this, "6", Toast.LENGTH_SHORT).show();
                }  if (position==0){
                    Toast.makeText(MainActivity.this, "7", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }

    class myadapter extends ArrayAdapter<String>{

        Context context;
        String rTitle[];
        String rdes[];
        int rImage[];

        myadapter(Context c, String title[] , String sub[],int img[]){
            super(c,R.layout.row, R.id.listview,title);
            this.context=c;
            this.rTitle=title;
            this.rdes=sub;
            this.rImage=img;




        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater=(LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row=layoutInflater.inflate(R.layout.row,parent,false);
            ImageView imageView =row.findViewById(R.id.image);
            TextView mytitle =row.findViewById(R.id.Text1);
            TextView mydec =row.findViewById(R.id.Text2);


            imageView.setImageResource(rImage[position]);
            mytitle.setText(rTitle[position]);
            mydec.setText(rdes[position]);

            return row;
        }
    }
    }

