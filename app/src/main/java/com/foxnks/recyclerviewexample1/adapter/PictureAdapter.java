package com.foxnks.recyclerviewexample1.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.foxnks.recyclerviewexample1.R;
import com.foxnks.recyclerviewexample1.activities.FullscreenPhotoActivity;
import com.squareup.picasso.Picasso;

import java.util.List;

public class PictureAdapter extends RecyclerView.Adapter<PictureAdapter.ViewHolder>{

    private List<Integer> picturesUrls;
    private Context context;

    public PictureAdapter(Context context, List<Integer> picturesUrls) {
        this.picturesUrls = picturesUrls;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_picture,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        int url = picturesUrls.get(position);
        Picasso.get().load(url).into(holder.imageViewPicture);

        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(context, FullscreenPhotoActivity.class);
            intent.putExtra("image_res_id", url);
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return picturesUrls.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        ImageView imageViewPicture;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageViewPicture = itemView.findViewById(R.id.imageViewPictures);
        }
    }
}
