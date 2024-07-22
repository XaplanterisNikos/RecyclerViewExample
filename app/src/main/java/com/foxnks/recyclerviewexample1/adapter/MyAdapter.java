package com.foxnks.recyclerviewexample1.adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.foxnks.recyclerviewexample1.R;
import com.foxnks.recyclerviewexample1.activities.DetailActivity;
import com.foxnks.recyclerviewexample1.model.Movie;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> implements Filterable {

    // variables
    private ArrayList<Movie> moviesList;
    private ArrayList<Movie> moviesListFull;

    // constructor
    public MyAdapter(ArrayList<Movie> moviesList) {
        this.moviesListFull = moviesList;
        this.moviesList = new ArrayList<>(moviesListFull);
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // inflate layout
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.movie_row, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        // get movie
        Movie movie = moviesList.get(position);
        // set title
        holder.title.setText(movie.getTitle());
        // set image
        holder.image.setImageResource(movie.getImage());


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // show toast
                Toast.makeText(v.getContext(), "Chosen Movie: "+ movie.getTitle(), Toast.LENGTH_SHORT).show();

                // go to detail activity
                Intent intent = new Intent(v.getContext(), DetailActivity.class);
                intent.putExtra("title", movie.getTitle());
                intent.putExtra("description", movie.getDescription());
                intent.putExtra("premiere", movie.getWorldPremiere());
                v.getContext().startActivity(intent);
            }
    });


    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }


    @Override
    public Filter getFilter() {
        return movieFilter;
    }

    public final Filter movieFilter = new Filter() {
        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            ArrayList<Movie> filteredMovieList = new ArrayList<>();
            if(constraint == null || constraint.length()== 0){
                filteredMovieList.addAll(moviesListFull);
            }else{
                String filterPattern = constraint.toString().toLowerCase().trim();

                for(Movie movie : moviesListFull){
                    if(movie.getTitle().toLowerCase().contains((filterPattern))){
                        filteredMovieList.add(movie);
                    }
                }
            }
            FilterResults results = new FilterResults();
            results.values = filteredMovieList;
            results.count = filteredMovieList.size();

            return results;
        }

        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
            moviesList.clear();
            moviesList.addAll((ArrayList) results.values);
            notifyDataSetChanged();
        }
    };

    public class MyViewHolder extends RecyclerView.ViewHolder {

        // views
        public TextView title;
        public ImageView image;

        // constructor
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.tvMovieTitle);
            image = itemView.findViewById(R.id.ivMovieView);
        }
    }
}
