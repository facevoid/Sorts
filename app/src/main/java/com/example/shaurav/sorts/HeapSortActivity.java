package com.example.shaurav.sorts;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Shaurav on 9/19/2015.
 */
public class HeapSortActivity extends Activity{
    private  AnimatedGifImageView animatedGifImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.heap_sort);
        animatedGifImageView = ((AnimatedGifImageView)findViewById(R.id.animatedGifImageView));
        animatedGifImageView.setAnimatedGif(R.drawable.heap_sort, AnimatedGifImageView.TYPE.STREACH_TO_FIT);
        //animatedGifImageView.setImageResource(R.drawable.buble_sort);



    }

    public void backToMain(View view)
    {
        Intent main = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(main);
        finish();
    }

}
