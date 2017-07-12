package com.example.shaurav.sorts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private  AnimatedGifImageView animatedGifImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        animatedGifImageView = ((AnimatedGifImageView)findViewById(R.id.animatedGifImageView));
//        animatedGifImageView.setAnimatedGif(R.drawable.buble_sort, AnimatedGifImageView.TYPE.STREACH_TO_FIT);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void showGifBuble(View view)
    {
//         animatedGifImageView.setImageResource(R.drawable.buble_sort);
//        animatedGifImageView.setAnimatedGif(R.drawable.buble_sort,
//                AnimatedGifImageView.TYPE.STREACH_TO_FIT);
        Intent sort = new Intent(getApplicationContext(),BubleSortActivity.class);
        startActivity(sort);


    }
    public void showGifMerge(View view)
    {
        Intent sort = new Intent(getApplicationContext(),MergeSortActivity.class);
        startActivity(sort);

    }
    public void showGifQuick(View view)
    {
        Intent sort = new Intent(getApplicationContext(),QuickSortActivity.class);
        startActivity(sort);
    }
    public void showGifHeap(View view)
    {
        Intent sort = new Intent(getApplicationContext(),HeapSortActivity.class);
        startActivity(sort);
    }
    public void showGifInsert(View view)
    {
        Intent sort = new Intent(getApplicationContext(),InsertionSortActivity.class);
        startActivity(sort);
    }


}
