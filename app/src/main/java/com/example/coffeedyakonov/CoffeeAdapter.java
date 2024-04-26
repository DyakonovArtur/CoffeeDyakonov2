package com.example.coffeedyakonov;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

class CoffeeAdapter extends RecyclerView.Adapter<CoffeeAdapter.ViewHolder> {

    private List<Coffee> mCoffee;
    private Context mContext;

    CoffeeAdapter(List<Coffee> coffees) {
        this.mCoffee = coffees;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        mContext = parent.getContext();
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        Coffee coffee = mCoffee.get(position);
        holder.nameTextView.setText(coffee.getTitle());
        holder.nameTextView2.setText("with " + String.join(" ", coffee.getIngredients()));

        Picasso.with(mContext)
                .load(coffee.getImage())
                .resize(520, 420)
                .into(holder.flowerImageView);
    }

    @Override
    public int getItemCount() {
        if (mCoffee == null) {
            return 0;
        }
        return mCoffee.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView nameTextView;
        TextView nameTextView2;
        ImageView flowerImageView;

        public ViewHolder(View itemView) {
            super(itemView);
            nameTextView = (TextView) itemView.findViewById(R.id.nameTextView);
            nameTextView2 = (TextView) itemView.findViewById(R.id.nameTextView2);
            flowerImageView = (ImageView) itemView.findViewById(R.id.itemImageView);
        }
    }
}
