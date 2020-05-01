package com.roy.seachit;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    String inp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //google btn
        Button googlebtn= (Button)findViewById(R.id.googlebtn);
        googlebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // INPUT STRING & MODIFY
                EditText sview= (EditText)findViewById(R.id.sview);
                inp = sview.getText().toString();

                //word extract
                String t="",srch="";
                int l,i;

                inp+=" ";
                l= inp.length();

                for(i=0;i<l;i++)
                {
                    if(inp.charAt(i)!=' ')
                        t+= inp.charAt(i);

                    else{
                        srch+= t + "+";
                        t = "";
                    }
                }
                srch=srch.substring(0,srch.length()-1);

                String google ="https://www.google.com/search?q="+srch;
                Uri web = Uri.parse(google);


                Intent gotogooggle = new Intent(Intent.ACTION_VIEW,web);

                if(gotogooggle.resolveActivity(getPackageManager())!=null){
                    startActivity(gotogooggle);
                }
            }
        });

        //youtube btn
        Button youtubebtn= (Button)findViewById(R.id.youtubebtn);
        youtubebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                // INPUT STRING & MODIFY
                EditText sview= (EditText)findViewById(R.id.sview);
                inp = sview.getText().toString();

                //word extract
                String t="",srch="";
                int l,i;

                inp+=" ";
                l= inp.length();

                for(i=0;i<l;i++)
                {
                    if(inp.charAt(i)!=' ')
                        t+= inp.charAt(i);

                    else{
                        srch+= t + "+";
                        t = "";
                    }
                }
                srch=srch.substring(0,srch.length()-1);

                String utube ="https://www.youtube.com/results?search_query="+srch;
                Uri weba = Uri.parse(utube);


                Intent gotoutube = new Intent(Intent.ACTION_VIEW,weba);

                if(gotoutube.resolveActivity(getPackageManager())!=null){
                    startActivity(gotoutube);
                }
            }
        });

        //Amazon btn
        Button amazonbtn= (Button)findViewById(R.id.amazonbtn);
        amazonbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                // INPUT STRING & MODIFY
                EditText sview= (EditText)findViewById(R.id.sview);
                inp = sview.getText().toString();

                //word extract
                String t="",srch="";
                int l,i;

                inp+=" ";
                l= inp.length();

                for(i=0;i<l;i++)
                {
                    if(inp.charAt(i)!=' ')
                        t+= inp.charAt(i);

                    else{
                        srch+= t + "+";
                        t = "";
                    }
                }
                srch=srch.substring(0,srch.length()-1);

                String amaz ="https://www.amazon.in/s/ref=nb_sb_noss_2?url=search-alias%3Daps&field-keywords="+srch;
                Uri webad = Uri.parse(amaz);


                Intent gotoama = new Intent(Intent.ACTION_VIEW,webad);

                if(gotoama.resolveActivity(getPackageManager())!=null){
                    startActivity(gotoama);
                }
            }
        });


    }
}
