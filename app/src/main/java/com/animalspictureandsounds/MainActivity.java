package com.animalspictureandsounds;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private MediaPlayer mPlayer = null;

    private LinearLayout layout;
    private TextView animalTV;
    private ImageView image;
    private ImageButton dog;
    private ImageButton cat;
    private ImageButton tiger;
    private ImageButton cow;
    private ImageButton horse;
    private ImageButton sheep;
    private ImageButton gorilla;
    private ImageButton duck;
    private ImageButton panda;
    private ImageButton bird;
    private ImageButton pig;
    private ImageButton elephant;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout = (LinearLayout) findViewById(R.id.image_Text_Layout);
        animalTV = (TextView) findViewById(R.id.imageDescription);
        image = (ImageView) findViewById(R.id.mainPicture);
        dog = (ImageButton) findViewById(R.id.dogBtn);
        cat = (ImageButton) findViewById(R.id.catBtn);
        tiger = (ImageButton) findViewById(R.id.tigerBtn);
        cow = (ImageButton) findViewById(R.id.cowBtn);
        horse = (ImageButton) findViewById(R.id.horseBtn);
        sheep = (ImageButton) findViewById(R.id.sheepBtn);
        gorilla = (ImageButton) findViewById(R.id.gorillaBtn);
        duck = (ImageButton) findViewById(R.id.duckBtn);
        panda = (ImageButton) findViewById(R.id.pandaBtn);
        bird = (ImageButton) findViewById((R.id.birdBtn));
        pig = (ImageButton) findViewById(R.id.pigBtn);
        elephant = (ImageButton) findViewById(R.id.elephantBtn);

        dog.setOnClickListener(this);
        cat.setOnClickListener(this);
        tiger.setOnClickListener(this);
        cow.setOnClickListener(this);
        horse.setOnClickListener(this);
        sheep.setOnClickListener(this);
        gorilla.setOnClickListener(this);
        duck.setOnClickListener(this);
        panda.setOnClickListener(this);
        bird.setOnClickListener(this);
        pig.setOnClickListener(this);
        elephant.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.dogBtn:
                layout.setBackgroundColor(Color.CYAN);
                image.setImageResource(R.drawable.dog);
                animalTV.setText(R.string.dog);
                animalTV.setTextColor(Color.parseColor("#573B08"));
                playSound(R.raw.dog_sound);
                break;
            case R.id.catBtn:
                layout.setBackgroundColor(Color.GRAY);
                image.setImageResource(R.drawable.cat);
                animalTV.setText(R.string.cat);
                animalTV.setTextColor(Color.parseColor("#056334"));
                playSound(R.raw.cat_sound);
                break;
            case R.id.tigerBtn:
                layout.setBackgroundColor(Color.WHITE);
                image.setImageResource(R.drawable.tiger);
                animalTV.setText(R.string.tiger);
                animalTV.setTextColor(Color.parseColor("#000000"));
                playSound(R.raw.tigre);
                break;
            case R.id.duckBtn:
                layout.setBackgroundColor(Color.parseColor("#8A085A"));
                image.setImageResource(R.drawable.duck);
                animalTV.setText(R.string.duck);
                animalTV.setTextColor(Color.parseColor("#4FADC9"));
                playSound(R.raw.duck_sound);
                break;
            case R.id.sheepBtn:
                layout.setBackgroundColor(Color.BLUE);
                image.setImageResource(R.drawable.sheep);
                animalTV.setText(R.string.sheep);
                animalTV.setTextColor(Color.WHITE);
                playSound(R.raw.sheep_sound);
                break;
            case R.id.gorillaBtn:
                layout.setBackgroundColor(Color.parseColor("#A0D979"));
                image.setImageResource(R.drawable.gorilla);
                animalTV.setText(R.string.gorilla);
                animalTV.setTextColor(Color.BLUE);
                playSound(R.raw.gorilla_sound);
                break;
            case R.id.cowBtn:
                layout.setBackgroundColor(Color.BLACK);
                image.setImageResource(R.drawable.cow);
                animalTV.setText(R.string.cow);
                animalTV.setTextColor(Color.RED);
                playSound(R.raw.cow_sound);
                break;
            case R.id.pandaBtn:
                layout.setBackgroundColor(Color.parseColor("#ffffbb33"));
                image.setImageResource(R.drawable.panda);
                animalTV.setText(R.string.panda);
                animalTV.setTextColor(Color.parseColor("#651582"));
                playSound(R.raw.panda);
                break;
            case R.id.horseBtn:
                layout.setBackgroundColor(Color.parseColor("#F5D0E7"));
                image.setImageResource(R.drawable.horse);
                animalTV.setText(R.string.horse);
                animalTV.setTextColor(Color.parseColor("#844FC9"));
                playSound(R.raw.horse_sound);
                break;
            case R.id.birdBtn:
                layout.setBackgroundColor(Color.parseColor("#CCED72"));
                image.setImageResource(R.drawable.bird);
                animalTV.setText(R.string.bird);
                animalTV.setTextColor(Color.parseColor("#F01381"));
                playSound(R.raw.bird);
                break;
            case R.id.pigBtn:
                layout.setBackgroundColor(Color.parseColor("#a3a3c2"));
                image.setImageResource(R.drawable.pig);
                animalTV.setText(R.string.pig);
                animalTV.setTextColor(Color.parseColor("#ff99ff"));
                playSound(R.raw.pig);
                break;
            case R.id.elephantBtn:
                layout.setBackgroundColor(Color.parseColor("#b3b300"));
                image.setImageResource(R.drawable.elephant);
                animalTV.setText(R.string.elephant);
                animalTV.setTextColor(Color.parseColor("#000000"));
                playSound(R.raw.elephant);
                break;

        }

    }

    private void playSound(int resId) {
        if(mPlayer != null) {
            mPlayer.stop();
            mPlayer.release();
        }
        mPlayer = MediaPlayer.create(this, resId);
        mPlayer.start();
    }

    @Override
    public void onPause() {
        super.onPause();
        if(mPlayer != null) {
            mPlayer.stop();
            mPlayer.release();
        }
    }
}
