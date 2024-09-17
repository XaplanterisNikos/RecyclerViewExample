package com.foxnks.recyclerviewexample1.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.splashscreen.SplashScreen;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.foxnks.recyclerviewexample1.R;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Install the system splash screen
//        SplashScreen splashScreen = SplashScreen.installSplashScreen(this);

        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_menu);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        // Keep the splash screen visible longer if needed
//        splashScreen.setKeepOnScreenCondition(() -> {
//            // Add any conditions here if you need to keep the splash screen
//            return false; // Return 'true' to keep the splash screen, 'false' to dismiss it
//        });


        // Find buttons
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);

        // Load animations
        Animation slideInLeft = AnimationUtils.loadAnimation(this, R.anim.slide_in_left);
        Animation slideInRight = AnimationUtils.loadAnimation(this, R.anim.slide_in_right);

        // Apply animations
        button1.startAnimation(slideInLeft);
        button2.startAnimation(slideInLeft);
        button3.startAnimation(slideInRight);
        button4.startAnimation(slideInRight);

        button2.setOnClickListener(v -> {
            Intent openMovies = new Intent(MenuActivity.this, MovieActivity.class);
            startActivity(openMovies);
        });



    }
}