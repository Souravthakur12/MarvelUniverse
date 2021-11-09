package com.oyelabs.marvel.universe.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.oyelabs.marvel.universe.ItemClickListener;
import com.oyelabs.marvel.universe.R;
import com.oyelabs.marvel.universe.Model.ResultsItem;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.myViewHolder>{

    List<ResultsItem> mdata;
    Context context;
    ItemClickListener itemClickListener;

    public RecyclerViewAdapter(List<ResultsItem> mdata, Context context) {
        this.mdata = mdata;
        this.context = context;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_characters,parent,false);
        return new myViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {
        holder.textView.setText(mdata.get(position).getName());


        try {
            Glide.with(holder.textView.getContext()).load(mdata.get(position).getThumbnail());
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    @Override
    public int getItemCount() {
        return mdata.size();
    }

    class myViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView textView;
        CardView cardView;

        public myViewHolder(@NonNull View itemView) {
            super(itemView);

        imageView = itemView.findViewById(R.id.character_Image);
        textView = itemView.findViewById(R.id.characterName);
        cardView = itemView.findViewById(R.id.cardView);


        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                itemClickListener.onClick(view,getAdapterPosition(),false);
            }
        });

        }
    }
}
