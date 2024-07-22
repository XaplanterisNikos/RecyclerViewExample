package com.foxnks.recyclerviewexample1.activities;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.SearchView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.foxnks.recyclerviewexample1.R;
import com.foxnks.recyclerviewexample1.adapter.MyAdapter;
import com.foxnks.recyclerviewexample1.data.MovieData;
import com.foxnks.recyclerviewexample1.model.Movie;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    // widgets
    private RecyclerView recyclerView;
    private ArrayList<Movie> movieList;
    private MyAdapter myAdapter;
    private TextView titletv;
    private MovieData movieData = new MovieData();
    private String TAG = "Check Array";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // create a list of movies
        movieList = new ArrayList<>();

        // add data to the list
        movieList = movieData.insertData();
        Log.i(TAG, "Size Of Array: " + movieList.size());

        // initialize the widget
        recyclerView = findViewById(R.id.recyclerview);
        titletv = findViewById(R.id.tvtitle);

        // set title
        titletv.setText("JamesBond Movies");

        // create an adapter
        myAdapter = new MyAdapter(movieList);
        myAdapter.notifyDataSetChanged();

        // set layout manager
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);

        // Animator
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        // set adapter
        recyclerView.setAdapter(myAdapter);


    }
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_item, menu);

        MenuItem menuItem = menu.findItem(R.id.search_item);
        SearchView searchView = (SearchView) menuItem.getActionView();
        searchView.setMaxWidth(Integer.MAX_VALUE);
        searchView.setQueryHint("Search here...");

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                myAdapter.getFilter().filter(newText);
                return false;
            }
        });

        return super.onCreateOptionsMenu(menu);
    }

}