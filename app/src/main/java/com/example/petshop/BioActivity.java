package com.example.petshop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class BioActivity extends AppCompatActivity {

    private ImageView petImage;
    private TextView petName, petBio;
    private Bundle extras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bio);

        petImage = (ImageView) findViewById(R.id.PetImage);
        petName = (TextView) findViewById(R.id.Name);
        petBio = (TextView) findViewById(R.id.Bio);

        extras = getIntent().getExtras();

        if(extras != null){
            String name = extras.getString("name");
            String bio = extras.getString("bio");

            setUp(name, bio);
        }


    }

    public void setUp(String name, String bio){
        
        if(name.equals("Jack")) {
            petImage.setImageDrawable(getResources().getDrawable(R.drawable.cat_img));
            petName.setText(name);
            petBio.setText(bio);
        }else if(name.equals("Max")) {
            petImage.setImageDrawable(getResources().getDrawable(R.drawable.dog_img));
            petName.setText(name);
            petBio.setText(bio);
        }else if(name.equals("Flippy")) {
            petImage.setImageDrawable(getResources().getDrawable(R.drawable.turtle_img));
            petName.setText(name);
            petBio.setText(bio);
        }else if(name.equals("Ziggy")){
                petImage.setImageDrawable(getResources().getDrawable(R.drawable.chameleon_img));
                petName.setText(name);
                petBio.setText(bio);
        }else if(name.equals("Einstein")) {
            petImage.setImageDrawable(getResources().getDrawable(R.drawable.hamster_img));
            petName.setText(name);
            petBio.setText(bio);
        }else if(name.equals("Oreo")) {
            petImage.setImageDrawable(getResources().getDrawable(R.drawable.rabbit_img));
            petName.setText(name);
            petBio.setText(bio);
        }else if(name.equals("Noodles")) {
            petImage.setImageDrawable(getResources().getDrawable(R.drawable.snake_img));
            petName.setText(name);
            petBio.setText(bio);
        }else if(name.equals("Lucas")) {
            petImage.setImageDrawable(getResources().getDrawable(R.drawable.tarantula_img));
            petName.setText(name);
            petBio.setText(bio);
        }



    }

}