package com.example.tugasbesar1;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{
    private ArrayList<String> fotoBudaya = new ArrayList<>();
    private ArrayList<String> namaBudaya = new ArrayList<>();
    private ArrayList<String> infoBudaya = new ArrayList<>();
    private Context context;

    public RecyclerViewAdapter(ArrayList<String> fotoBudaya, ArrayList<String> namaBudaya, ArrayList<String> infoBudaya, Context context) {
        this.fotoBudaya = fotoBudaya;
        this.namaBudaya = namaBudaya;
        this.infoBudaya = infoBudaya;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.desain_layout_adapter, parent, false);
        ViewHolder holder = new ViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Glide.with(context).asBitmap().load(fotoBudaya.get(position)).into(holder.imageViewfotoBudaya);
        holder.textViewNamaBudaya.setText(namaBudaya.get(position));

        holder.constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, namaBudaya.get(position), Toast.LENGTH_SHORT).show();

                // Membuat class baru agar bisa berpindah ke activity yang lain (Agar bisa menampilkan ketika list di klik)
                Intent intent = new Intent(context, DetailActivity.class);

                intent.putExtra("foto_budaya", fotoBudaya.get(position));
                intent.putExtra("nama_budaya", namaBudaya.get(position));
                intent.putExtra("info_budaya", infoBudaya.get(position));

                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return namaBudaya.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder{
        CircleImageView imageViewfotoBudaya;
        TextView textViewNamaBudaya;
        ConstraintLayout constraintLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageViewfotoBudaya = itemView.findViewById(R.id.imageViewFotoBudaya);
            textViewNamaBudaya = itemView.findViewById(R.id.textViewNamaBudaya);
            constraintLayout = itemView.findViewById(R.id.constrainLayout);
        }
    }
}
