package com.foxnks.recyclerviewexample1.activities;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
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
import java.util.Collections;
import java.util.Comparator;

public class MainActivity extends AppCompatActivity {

    // widgets
    private RecyclerView recyclerView;
    private ArrayList<Movie> movieList;
    private MyAdapter myAdapter;
    private TextView titletv;
    private Button btn_sort;
    private MovieData movieData = new MovieData();
    private String TAG = "Check Array";
    private int[] years;
    private boolean isSortedAscending = true;
    private String[] cast;


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
        btn_sort = findViewById(R.id.btn_short);

        // set title
        titletv.setText("007 Movies");

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

        // getCast
        getCast();

//        // get array of years
//        years = getYears(movieList);
//        Log.i(TAG,"Array "+ years[0]);

// button sort movies
        btn_sort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isSortedAscending) {
                    btn_sort.setText("Ascending");
                    Collections.sort(movieList, new Comparator<Movie>() {
                        @Override
                        public int compare(Movie o1, Movie o2) {
                            return Integer.compare(o1.getYear(), o2.getYear());
                        }
                    });
                } else {
                    btn_sort.setText("Descending");
                    Collections.sort(movieList, new Comparator<Movie>() {
                        @Override
                        public int compare(Movie o1, Movie o2) {
                            return Integer.compare(o2.getYear(), o1.getYear());
                        }
                    });

                }
                isSortedAscending = !isSortedAscending;

                myAdapter = new MyAdapter(movieList);
                recyclerView.setAdapter(myAdapter);
                myAdapter.notifyDataSetChanged();
            }
        });
    }


    // get cast array
    private void getCast() {
        cast = new String[movieList.size()];
        for(int i =0;i< cast.length; i++){
            cast[i]= movieList.get(i).getCast();
        }
    }
    // method to return array of release years
//    private int[] getYears(ArrayList<Movie> movieList) {
//        int[] yearMovie = new int[movieList.size()];
//        for(int i = 0; i < movieList.size(); i ++){
//            yearMovie[i] = movieList.get(i).getYear();
//        }
//        return yearMovie;
//    }

// Search Menu
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_item, menu);

        MenuItem menuItem = menu.findItem(R.id.search_item);
        SearchView searchView = (SearchView) menuItem.getActionView();
        searchView.setMaxWidth(Integer.MAX_VALUE);
        searchView.setQueryHint("Search JB movie...");

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
