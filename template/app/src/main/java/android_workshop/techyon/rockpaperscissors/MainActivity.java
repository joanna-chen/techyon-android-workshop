package android_workshop.techyon.rockpaperscissors;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    // [1] declare variables for all the different views we created in the XML
    ImageView computerHand;
    Button rockButton;

    // [3] declare enum for the possible moves
    // [3] declare variables for the computer and user's move
    // [3] declare and initiate computer and user's score

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // [1] connect the views' variables to the actual view in the XML using the id
        computerHand = (ImageView) findViewById(R.id.computer_hand);
        rockButton = (Button) findViewById(R.id.rock_button);

        // [1] set some default images and text for the views and run the app!
        rockButton.setText("rock");

        // [2] attach the buttons using `setOnClickListener(...`
        // [2] inside the handler, set the user's hand image
        // [2] also in the handler, the computer's hand needs to be assigned (new method!)
        rockButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // [2] set the user's image to rock

                // [2] get the computer's image to change at random
                getComputerHand();

                // [3] set the Hand enum value that the user chose
                // [3] update the score based on who won the round
                updateScore();
            }
        });
    }

    // [2] create a method to get the computer's move
    private void getComputerHand() {
        Random rand = new Random();
        int n = rand.nextInt(3);        // [*] get a random integer (either 0, 1, or 2)

        switch (n) {
            case 0:
                // [2] set the image for the first case
                // [3] set computer's Hand enum value
                break;        // [*] make sure you have a break at the end of each case!
            case 1:
                // [2] set image for this case
                // [3] set computer's Hand enum value
                break;
            case 2:
                // [2] set image for last case
                // [3] set computer's Hand enum value
                break;
        }
    }

    private void updateScore() {
        // [3] switch through user's move
        // [3] use if statements to check if the user or the computer won
        // [3] update the correct player's score accordingly
        // [3] update score text
    }

}
