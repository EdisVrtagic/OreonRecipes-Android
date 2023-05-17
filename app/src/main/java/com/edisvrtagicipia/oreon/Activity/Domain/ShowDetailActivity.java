package com.edisvrtagicipia.oreon.Activity.Domain;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.edisvrtagicipia.oreon.R;

public class ShowDetailActivity extends AppCompatActivity {
    private TextView titleTxt, descTxt, timeTxt;
    private ImageView foodPic;
    private FoodDomain object;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_detail);

        foodView();
        getBundle();
    }
    private void getBundle()
    {
       object=(FoodDomain) getIntent().getSerializableExtra("object");
       int drawableResourceId = this.getResources().getIdentifier(object.getPic(),"drawable",this.getPackageName());
        Glide.with(this)
                .load(drawableResourceId)
                .into(foodPic);

        titleTxt.setText(object.getTitle());
        descTxt.setText(object.getDesc());
        timeTxt.setText(object.getPreparetime());
    }
    private void foodView()
    {
        titleTxt=findViewById(R.id.titleTxt);
        descTxt=findViewById(R.id.descTxt);
        timeTxt=findViewById(R.id.timeTxt);
        foodPic=findViewById(R.id.foodPic);
    }
}
