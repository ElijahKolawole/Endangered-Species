package com.adefemikolawole.endangeredspecies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListAdapter;

public class MainActivity extends AppCompatActivity {
    final String TAG = MainActivity.class.getSimpleName().toString();
    Integer[] animals = {R.drawable.eagle, R.drawable.elephant, R.drawable.gorilla , R.drawable.panda, R.drawable.panther, R.drawable.polar};
    ImageView pic;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.e(TAG, "Application begins here...");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView grid = findViewById(R.id.gridView);
        final ImageView pic = findViewById(R.id.imgLarge);
        grid.setAdapter(new ImageAdapter(this));

    }

    public class ImageAdapter extends BaseAdapter {
        public ImageAdapter(MainActivity mainActivity) {
        }

        @Override
        public int getCount() {
            return 0;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            return null;
        }
    }
}
