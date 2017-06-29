package android_workshop.techyon.rockpaperscissors;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView computerHand;
    ImageView userHand;
    TextView scoreText;
    Button rockButton;
    Button paperButton;
    Button scissorsButton;

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
    }



}
