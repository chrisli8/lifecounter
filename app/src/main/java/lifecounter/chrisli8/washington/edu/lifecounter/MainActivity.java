package lifecounter.chrisli8.washington.edu.lifecounter;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.util.Log;

import org.w3c.dom.Text;

public class MainActivity extends Activity {

    public static final String TAG = "MainActivity";

    public TextView loser;

    public TextView player1;
    public TextView player2;
    public TextView player3;
    public TextView player4;

    public TextView p1Points;
    public Button p1MinusOne;
    public Button p1PlusOne;
    public Button p1MinusFive;
    public Button p1PlusFive;

    public TextView p2Points;
    public Button p2MinusOne;
    public Button p2PlusOne;
    public Button p2MinusFive;
    public Button p2PlusFive;

    public TextView p3Points;
    public Button p3MinusOne;
    public Button p3PlusOne;
    public Button p3MinusFive;
    public Button p3PlusFive;

    public TextView p4Points;
    public Button p4MinusOne;
    public Button p4PlusOne;
    public Button p4MinusFive;
    public Button p4PlusFive;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loser = (TextView) findViewById(R.id.loserView);

        player1 = (TextView) findViewById(R.id.textView);
        player2 = (TextView) findViewById(R.id.textView2);
        player3 = (TextView) findViewById(R.id.textView3);
        player4 = (TextView) findViewById(R.id.textView4);

        p1MinusOne = (Button) findViewById(R.id.button);
        p1PlusOne = (Button) findViewById(R.id.button2);
        p1MinusFive = (Button) findViewById(R.id.button3);
        p1PlusFive = (Button) findViewById(R.id.button4);
        p1Points = (TextView) findViewById(R.id.textViewPoints);

        p2MinusOne = (Button) findViewById(R.id.buttonP2);
        p2PlusOne = (Button) findViewById(R.id.button2P2);
        p2MinusFive = (Button) findViewById(R.id.button3P2);
        p2PlusFive = (Button) findViewById(R.id.button4P2);
        p2Points = (TextView) findViewById(R.id.textViewPointsP2);

        p3MinusOne = (Button) findViewById(R.id.buttonP3);
        p3PlusOne = (Button) findViewById(R.id.button2P3);
        p3MinusFive = (Button) findViewById(R.id.button3P3);
        p3PlusFive = (Button) findViewById(R.id.button4P3);
        p3Points = (TextView) findViewById(R.id.textViewPointsP3);

        p4MinusOne = (Button) findViewById(R.id.buttonP4);
        p4PlusOne = (Button) findViewById(R.id.button2P4);
        p4MinusFive = (Button) findViewById(R.id.button3P4);
        p4PlusFive = (Button) findViewById(R.id.button4P4);
        p4Points = (TextView) findViewById(R.id.textViewPointsP4);

        p1MinusOne.setOnClickListener(new MyListener(-1, p1Points, player1));
        p1PlusOne.setOnClickListener(new MyListener(1, p1Points, player1));
        p1MinusFive.setOnClickListener(new MyListener(-5, p1Points, player1));
        p1PlusFive.setOnClickListener(new MyListener(5, p1Points, player1));

        p2MinusOne.setOnClickListener(new MyListener(-1, p2Points, player2));
        p2PlusOne.setOnClickListener(new MyListener(1, p2Points, player2));
        p2MinusFive.setOnClickListener(new MyListener(-5, p2Points, player2));
        p2PlusFive.setOnClickListener(new MyListener(5, p2Points, player2));

        p3MinusOne.setOnClickListener(new MyListener(-1, p3Points, player3));
        p3PlusOne.setOnClickListener(new MyListener(1, p3Points, player3));
        p3MinusFive.setOnClickListener(new MyListener(-5, p3Points, player3));
        p3PlusFive.setOnClickListener(new MyListener(5, p3Points, player3));

        p4MinusOne.setOnClickListener(new MyListener(-1, p4Points, player4));
        p4PlusOne.setOnClickListener(new MyListener(1, p4Points, player4));
        p4MinusFive.setOnClickListener(new MyListener(-5, p4Points, player4));
        p4PlusFive.setOnClickListener(new MyListener(5, p4Points, player4));

    }

    private class MyListener implements View.OnClickListener {
        public int value;
        public TextView view;
        public TextView player;

        public MyListener(int value, TextView view, TextView player) {
            this.value = value;
            this.view = view;
            this.player = player;
        }

        @Override
        public void onClick(View view) {
            int num = Integer.parseInt(this.view.getText().toString());
            this.view.setText(num + value + "");
            if(num + value <= 0) {
               loser.setText(this.player.getText() + " Loses");
            }
        }
    }
}
