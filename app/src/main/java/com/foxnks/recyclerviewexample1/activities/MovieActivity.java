package com.foxnks.recyclerviewexample1.activities;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.SearchView;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.foxnks.recyclerviewexample1.R;
import com.foxnks.recyclerviewexample1.adapter.MyAdapter;
import com.foxnks.recyclerviewexample1.data.MovieData;
import com.foxnks.recyclerviewexample1.model.Movie;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MovieActivity extends AppCompatActivity implements NavigationView

        .OnNavigationItemSelectedListener{

    // widgets
    private RecyclerView recyclerView;
    private ArrayList<Movie> movieList;
    private MyAdapter myAdapter;
    private TextView titletv;
    private Button btn_sort, btn_menu;
    private MovieData movieData;
    private String TAG = "Check Array";
    private int[] years;
    private boolean isSortedAscending = true;
    private String[] cast;

    public static final int NAV_FEEDBACK_ID = R.id.nav_feedback;
    public static final int NAV_HELP_ID = R.id.nav_help;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        //EdgeToEdge.enable(this);
        setContentView(R.layout.activity_movie);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.main);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawer,toolbar,R.string.nav_open_drawer,R.string.nav_close_drawer);
        drawer.addDrawerListener((toggle));
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        movieData = new MovieData(this);

        // Set the ActionBar title to a translator strings
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(R.string.title_app_menu);
        }

        // create a list of movies
        movieList = new ArrayList<>();

        // add data to the list
        movieList = movieData.insertData();
        Log.i(TAG, "Size Of Array: " + movieList.size());

        // initialize the widget
        recyclerView = findViewById(R.id.recyclerview);
        titletv = findViewById(R.id.tvtitle);
        btn_sort = findViewById(R.id.btn_short);
        btn_menu = findViewById(R.id.btn_menu);

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


        // button menu
        btn_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Δημιουργούμε ένα intent για να πάμε στο μενού (π.χ., MainActivity)
                Intent intent = new Intent(MovieActivity.this, MenuActivity.class);

                // Καθαρίζουμε όλες τις προηγούμενες δραστηριότητες από το stack
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);

                // Ξεκινάμε τη δραστηριότητα του μενού
                startActivity(intent);

                // Κλείνουμε την τρέχουσα δραστηριότητα για να εξασφαλίσουμε ότι δεν παραμένει
                finish();
            }
        });

    }

    // get cast array
    private void getCast() {
        cast = new String[movieList.size()];
        for (int i = 0; i < cast.length; i++) {
            cast[i] = movieList.get(i).getCast();
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

    // Save the RecyclerView state in SharedPreferences
    @Override
    protected void onPause() {
        super.onPause();
        SharedPreferences preferences = getSharedPreferences("RecyclerViewPrefs", MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        int position = ((LinearLayoutManager) recyclerView.getLayoutManager()).findFirstVisibleItemPosition();
        editor.putInt("scroll_position", position);
        editor.apply();
    }

    @Override
    protected void onResume() {
        super.onResume();

        SharedPreferences preferences = getSharedPreferences("RecyclerViewPrefs", MODE_PRIVATE);
        int position = preferences.getInt("scroll_position", 0);

        recyclerView.scrollToPosition(position);

        // Clear the saved position
        SharedPreferences.Editor editor = preferences.edit();
        editor.remove("scroll_position");
        editor.apply();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        Intent intent = null;

        if(id == NAV_FEEDBACK_ID){
            intent = new Intent(this, FeedBackActivity.class);
        }
        if(id == NAV_HELP_ID){
            intent = new Intent(this, HelpActivity.class);
        }
        if(intent != null){
            startActivity(intent);
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.main);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.main);
        if(drawer.isDrawerOpen(GravityCompat.START)){
            drawer.closeDrawer(GravityCompat.START);
        }else{
            super.onBackPressed();
        }
    }
}
