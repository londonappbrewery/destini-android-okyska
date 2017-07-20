package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:

    Button mAns1;
    Button mAns2;
    TextView mStory;
    int mStoryIndex = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mAns1 = (Button)findViewById(R.id.buttonTop);
        mAns2 = (Button) findViewById(R.id.buttonBottom);
        mStory = (TextView)findViewById(R.id.storyTextView);

        mStory.setText(R.string.T1_Story);
        mAns1.setText(R.string.T1_Ans1);
        mAns2.setText(R.string.T1_Ans2);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mAns1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mStoryIndex == 1 || mStoryIndex == 2){
                    mStory.setText(R.string.T3_Story);
                    mAns1.setText(R.string.T3_Ans1);
                    mAns2.setText(R.string.T3_Ans2);

                    mStoryIndex++;
                } else if (mStoryIndex == 3){
                    mStory.setText(R.string.T6_End);
                    mAns1.setVisibility(View.GONE);
                    mAns2.setVisibility(View.GONE);
                }
            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

        mAns2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mStoryIndex == 1){
                    mStory.setText(R.string.T2_Story);
                    mAns1.setText(R.string.T2_Ans1);
                    mAns2.setText(R.string.T2_Ans2);

                    mStoryIndex++;

                } else if (mStoryIndex == 2){
                    mStory.setText(R.string.T4_End);
                    mAns1.setVisibility(View.GONE);
                    mAns2.setVisibility(View.GONE);
                } else if (mStoryIndex == 3){
                    mStory.setText(R.string.T5_End);
                    mAns1.setVisibility(View.GONE);
                    mAns2.setVisibility(View.GONE);
                }
            }
        });
    }
}
