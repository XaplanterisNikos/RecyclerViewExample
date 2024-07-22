package com.foxnks.recyclerviewexample1.activities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.foxnks.recyclerviewexample1.R;

public class DetailActivity extends AppCompatActivity {

    private TextView tvDetailMovie,tvTitleMovie,tvReleaseMovie;
    private Button btnBack;
    private String title,release,description;

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

        // Initialize widgets
        initializeWidget();

        // Get data from intent
        Intent intent = getIntent();
        title = intent.getStringExtra("title");
        release = intent.getStringExtra("premiere");
        description = intent.getStringExtra("description");

        // Initialize variables
        initializeVariables(title,release,description);

        // Back button
        btnBack.setOnClickListener(v -> {
            Intent bckIntent = new Intent(this, MainActivity.class);;
            startActivity(bckIntent);
        });

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
    }
}