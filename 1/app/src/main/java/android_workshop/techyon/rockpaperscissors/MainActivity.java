package android_workshop.techyon.rockpaperscissors;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

import static android_workshop.techyon.rockpaperscissors.MainActivity.Hand.PAPER;
import static android_workshop.techyon.rockpaperscissors.MainActivity.Hand.ROCK;
import static android_workshop.techyon.rockpaperscissors.MainActivity.Hand.SCISSORS;

public class MainActivity extends AppCompatActivity {
    enum Hand {ROCK, PAPER, SCISSORS};

    ImageView computerHand;
    ImageView userHand;
    TextView scoreText;
    Button rockButton;
    Button paperButton;
    Button scissorsButton;
    Hand computer;
    Hand user;
    int computerScore = 0;
    int userScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        computerHand = (ImageView) findViewById(R.id.computer_hand);
        userHand = (ImageView) findViewById(R.id.user_hand);
        scoreText = (TextView) findViewById(R.id.score);
        rockButton = (Button) findViewById(R.id.rock_button);
        paperButton = (Button) findViewById(R.id.paper_button);
        scissorsButton = (Button) findViewById(R.id.scissors_button);

        computerHand.setImageResource(R.drawable.rock);
        userHand.setImageResource(R.drawable.paper);
        scoreText.setText("Score:");
        rockButton.setText("rock");
        paperButton.setText("paper");
        scissorsButton.setText("scissors");

        rockButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userHand.setImageResource(R.drawable.rock);
                user = ROCK;
                getComputerHand();
                updateScore();
            }
        });

        paperButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userHand.setImageResource(R.drawable.paper);
                user = PAPER;
                getComputerHand();
                updateScore();
            }
        });

        scissorsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userHand.setImageResource(R.drawable.scissors);
                user = SCISSORS;
                getComputerHand();
                updateScore();
            }
        });
    }

    private void getComputerHand() {
        Random rand = new Random();
        int n = rand.nextInt(3);
        switch (n) {
            case 0:
                computerHand.setImageResource(R.drawable.rock);
                computer = ROCK;
                break;
            case 1:
                computerHand.setImageResource(R.drawable.paper);
                computer = PAPER;
                break;
            case 2:
                computerHand.setImageResource(R.drawable.scissors);
                computer = SCISSORS;
                break;
        }
    }

    private void updateScore() {
        switch (user) {
            case ROCK:
                if (computer == PAPER) {
                    computerScore++;
                } else if (computer == SCISSORS) {
                    userScore++;
                }
                break;
            case PAPER:
                if (computer == SCISSORS) {
                    computerScore++;
                } else if (computer == ROCK) {
                    userScore++;
                }
                break;
            case SCISSORS:
                if (computer == ROCK) {
                    computerScore++;
                } else if (computer == PAPER) {
                    userScore++;
                }
                break;
        }
        scoreText.setText("You: " + userScore + " Computer: " + computerScore);
    }

}
