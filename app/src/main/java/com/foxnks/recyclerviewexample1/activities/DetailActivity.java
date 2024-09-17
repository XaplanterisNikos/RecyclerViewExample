package com.foxnks.recyclerviewexample1.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.foxnks.recyclerviewexample1.R;
import com.foxnks.recyclerviewexample1.adapter.PictureAdapter;
import com.foxnks.recyclerviewexample1.data.MovieData;
import com.foxnks.recyclerviewexample1.model.Movie;

import java.util.ArrayList;
import java.util.Objects;

public class DetailActivity extends AppCompatActivity {

    private TextView tvDetailMovie,tvTitleMovie,tvReleaseMovie;
    private Button btnBack;
    private String title,release,description;
    private RecyclerView recyclerView;
    private MovieData movieData ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_detail);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        movieData = new MovieData(this);
        // Initialize widgets
        initializeWidget();

        // pictures data
        ArrayList<Movie>  moviePicturesList = movieData.insertPicture();

        // Get data from intent
        Intent intent = getIntent();
        title = intent.getStringExtra("title");
        release = intent.getStringExtra("premiere");
        description = intent.getStringExtra("description");

        // Initialize recyclerView
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

        // initialize AdapterPictures
        bindPicturesAdapter(moviePicturesList,title);


        // Initialize variables
        initializeVariables(title,release,description);

        // Back button
        btnBack.setOnClickListener(v -> {
            Intent bckIntent = new Intent(this, MovieActivity.class);

            // Καθαρίζουμε όλες τις προηγούμενες δραστηριότητες από το stack
            bckIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);

            startActivity(bckIntent);

            // Κλείνουμε την τρέχουσα δραστηριότητα για να εξασφαλίσουμε ότι δεν παραμένει
            finish();
        });



        tvDetailMovie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

    @Override
    public void onBackPressed() {
        // Δημιουργούμε ένα intent για να πάμε στο μενού (π.χ., MainActivity)
        Intent intent = new Intent(DetailActivity.this, MovieActivity.class);

        // Καθαρίζουμε όλες τις προηγούμενες δραστηριότητες από το stack
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);

        // Ξεκινάμε τη δραστηριότητα του μενού
        startActivity(intent);

        // Κλείνουμε την τρέχουσα δραστηριότητα
        finish();

        // Καλούμε την υπερκλάση για την προεπιλεγμένη συμπεριφορά
        // Αν δεν θέλεις να καλέσεις την super, μην το κάνεις
        super.onBackPressed();

    }

    // bind picture adapter with pictures of the selected movie
    private void bindPicturesAdapter(ArrayList<Movie> moviePictureList,String title) {

        for(int i=0 ; i<moviePictureList.size(); i++){
            if(Objects.equals(moviePictureList.get(i).getTitle(), title)){
                        PictureAdapter adapter = new PictureAdapter(this, moviePictureList.get(i).getPictures());
                        recyclerView.setAdapter(adapter);
            }
        }

    }

    // Initialize variables
    private void initializeVariables(String title, String release, String description) {
        tvTitleMovie.setText(title);
        tvReleaseMovie.setText(release);
        tvDetailMovie.setText(description);


    }
    // Initialize widgets
    private void initializeWidget() {
        tvDetailMovie = findViewById(R.id.tv_description_detail);
        tvTitleMovie = findViewById(R.id.tv_title_detail);
        tvReleaseMovie = findViewById(R.id.day_release_detail);
        btnBack = findViewById(R.id.backButton);
        recyclerView = findViewById(R.id.recyclerViewPictures);
    }


}