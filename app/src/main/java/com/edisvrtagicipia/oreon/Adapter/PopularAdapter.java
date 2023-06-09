package com.edisvrtagicipia.oreon.Adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.edisvrtagicipia.oreon.Activity.Domain.FoodDomain;
import com.edisvrtagicipia.oreon.Activity.Domain.ShowDetailActivity;
import com.edisvrtagicipia.oreon.Activity.MainActivity;
import com.edisvrtagicipia.oreon.Activity.StartActivity;
import com.edisvrtagicipia.oreon.R;

import java.util.ArrayList;

public class PopularAdapter extends RecyclerView.Adapter<PopularAdapter.ViewHolder>
{
    ArrayList<FoodDomain> foodDomains;

    public PopularAdapter(ArrayList<FoodDomain> foodDomains) {
        this.foodDomains = foodDomains;
    }

    @Override
    @NonNull
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_popular, parent, false);

        return new ViewHolder(inflate);
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.title.setText(foodDomains.get(holder.getAdapterPosition()).getTitle());
        int drawableResourceId = holder.itemView.getContext().getResources().getIdentifier(foodDomains.get(holder.getAdapterPosition()).getPic(),"drawable",holder.itemView.getContext().getPackageName());
        Glide.with(holder.itemView.getContext()).load(drawableResourceId).into(holder.pic);

        holder.addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(holder.itemView.getContext(),ShowDetailActivity.class);
                intent.putExtra("object",foodDomains.get(holder.getAdapterPosition()));
                holder.itemView.getContext().startActivity(intent);
            }
        });
    }
    @Override
    public int getItemCount()
    {
        return foodDomains.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder
    {
        TextView title;
        ImageView pic;
        ImageView addBtn;
        public ViewHolder(@NonNull View itemView)
        {
            super(itemView);
            title = itemView.findViewById(R.id.title);
            pic = itemView.findViewById(R.id.pic);
            addBtn = itemView.findViewById(R.id.addBtn);
        }
    }
}
