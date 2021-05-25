package com.example.petshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageView cat, dog, turtle, chameleon, hamster, rabbit, snake, tarantula;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cat = (ImageView) findViewById(R.id.Cat);
        dog = (ImageView) findViewById(R.id.Dog);
        turtle = (ImageView) findViewById(R.id.Turtle);
        chameleon = (ImageView) findViewById(R.id.Chameleon);
        hamster = (ImageView) findViewById(R.id.Hamster);
        rabbit = (ImageView) findViewById(R.id.Rabbit);
        snake = (ImageView) findViewById(R.id.Snake);
        tarantula = (ImageView) findViewById(R.id.Tarantula);

        cat.setOnClickListener(this);
        dog.setOnClickListener(this);
        turtle.setOnClickListener(this);
        chameleon.setOnClickListener(this);
        hamster.setOnClickListener(this);
        rabbit.setOnClickListener(this);
        snake.setOnClickListener(this);
        tarantula.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.Cat:
                Toast.makeText(MainActivity.this,"Cat", Toast.LENGTH_SHORT).show();
                Intent catIntent = new Intent(MainActivity.this, BioActivity.class);
                catIntent.putExtra("name","Jack");
                catIntent.putExtra("bio","Jack is a 6 months old black cat. He has patches of white fur here are there. Around his face, there is a shadow-like patch of white fur, in the middle of which you can see Jack’s big, bright, and round blue eyes. Through the patch, you can also see his black whiskers in a sticking out fashion. He loves to get affection and attention and playing with everyone who wants to.");
                startActivity(catIntent);
                break;

            case R.id.Dog:
                Toast.makeText(MainActivity.this,"Dog", Toast.LENGTH_SHORT).show();
                Intent dogIntent = new Intent(MainActivity.this, BioActivity.class);
                dogIntent.putExtra("name","Max");
                dogIntent.putExtra("bio","Max is three years old brown-coloured Korgy. He is family friendly but agressive to strangers. Apart from being loyal, he is very obedient and intelligent. He used to be a sniffer dog. Physical activities like running, playing, jumping etc. make him happier, and he doesn’t like sitting idle.");
                startActivity(dogIntent);
                break;

            case R.id.Turtle:
                Toast.makeText(MainActivity.this,"Turtle", Toast.LENGTH_SHORT).show();
                Intent turtleIntent = new Intent(MainActivity.this, BioActivity.class);
                turtleIntent.putExtra("name","Flippy");
                turtleIntent.putExtra("bio","Flippy is a small Reeve's turtle. It's one of the most sociable of all the turtles. His shell is dark green and brown, he has black beady eyes, and little holes for his ears. Behind both ears he has bright red spots about the size of inkspot. Flippy likes to eat cheese and likes to play with a marbles.");
                startActivity(turtleIntent);
                break;

            case R.id.Chameleon:
                Toast.makeText(MainActivity.this,"Chameleon", Toast.LENGTH_SHORT).show();
                Intent chameleonIntent = new Intent(MainActivity.this, BioActivity.class);
                chameleonIntent.putExtra("name","Ziggy");
                chameleonIntent.putExtra("bio","Ziggy is an amazing creature. She is a true chameleon, also known as ''old world chameleon''. This spicies is well known for their ability to change color which makes them fascinating pet. She likes to climb on trees, seeking a perfect spot for hiding and daydreaming, or hunting insects for food. She is a great choice for those who are up to the challenge.");
                startActivity(chameleonIntent);
                break;

            case R.id.Hamster:
                Toast.makeText(MainActivity.this,"Hamster", Toast.LENGTH_SHORT).show();
                Intent hamsterIntent = new Intent(MainActivity.this, BioActivity.class);
                hamsterIntent.putExtra("name","Einstein");
                hamsterIntent.putExtra("bio","Einstein is two months old. He is an adorable hamster and with completely white furs over his body. Einstein likes to run around the room when he's taken out from his cage. He is so full of energy and really likes to be held in hands. He likes to eat a lot of nuts. Sometimes, he'll make some squeak noises to indicate his prostest of holding him for too long and when released on the floor he'll start running again.");
                startActivity(hamsterIntent);
                break;

            case R.id.Rabbit:
                Toast.makeText(MainActivity.this,"Rabbit", Toast.LENGTH_SHORT).show();
                Intent rabbitIntent = new Intent(MainActivity.this, BioActivity.class);
                rabbitIntent.putExtra("name","Oreo");
                rabbitIntent.putExtra("bio","Oreo is five months old rabbit and she has white fur. She has cute red eyes and her paws have brown colour on the edges. She is intelligent and full of energy. She likes to eat carrots and coriander leaves. Racing whit other rabbits is her favourite thing to do.");
                startActivity(rabbitIntent);
                break;

            case R.id.Snake:
                Toast.makeText(MainActivity.this,"Snake", Toast.LENGTH_SHORT).show();
                Intent snakeIntent = new Intent(MainActivity.this, BioActivity.class);
                snakeIntent.putExtra("name","Noodles");
                snakeIntent.putExtra("bio","Noodles is a corn snake, one of the most popular snakes to keep as pets. Noodles isn't venomous and is only 4 inches long. She is hyperactive and loves to move around. She likes to move around while being held in hand. She can bite if she feels thretened but her bite is not very painful.");
                startActivity(snakeIntent);
                break;

            case R.id.Tarantula:
                Toast.makeText(MainActivity.this,"Tarantula", Toast.LENGTH_SHORT).show();
                Intent tarantulaIntent = new Intent(MainActivity.this, BioActivity.class);
                tarantulaIntent.putExtra("name","Lucas");
                tarantulaIntent.putExtra("bio","Lucas is a tarantula spider, extremely fun to observe. However, he is not quite suitable for handling and may cause itchning or allergy if not handled properly. He likes to be in his small enclosure and requires to be fed only once a week. He eats worms, crickets and roaches. Having him is more like a collection than like having a pet.");
                startActivity(tarantulaIntent);
                break;
        }
    }
}