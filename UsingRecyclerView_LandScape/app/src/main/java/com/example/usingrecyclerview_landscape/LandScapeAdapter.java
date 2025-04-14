package com.example.usingrecyclerview_landscape;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class LandScapeAdapter extends RecyclerView.Adapter<LandScapeAdapter.ItemLandHolder> {
    Context context;
    ArrayList<LandScape> listData;

    public LandScapeAdapter(Context context, ArrayList<LandScape> listData) {
        this.context = context;
        this.listData = listData;
    }

    @NonNull
    @Override
    public ItemLandHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater cai_bom = LayoutInflater.from(context);
        View vItem = cai_bom.inflate(R.layout.item_land, parent, false);
        ItemLandHolder viewHolderCreated = new ItemLandHolder(vItem);
        return viewHolderCreated; //Hàm tạo 1 view holder
    }

    @Override
    public void onBindViewHolder(@NonNull ItemLandHolder holder, int position) {
        //Lấy đối tượng hiển thị
        LandScape landsCapeHienThi = listData.get(position);
        //Trích thông tin
        String caption = landsCapeHienThi.getLandCaption();
        String tenFileAnh = landsCapeHienThi.getLandImageFileName();
        //Đặt vào các trường thông tin của Holder
        holder.tvCaption.setText(caption);
        // đặt ảnh
            String packageName = holder.itemView.getContext().getPackageName();
            int imageID = holder.itemView.getResources().getIdentifier(tenFileAnh, "mipmap", packageName);
        holder.ivLandscape.setImageResource(imageID);
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    class ItemLandHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView tvCaption;
        ImageView ivLandscape;

        public ItemLandHolder(@NonNull View itemView) {
            super(itemView);
            tvCaption = itemView.findViewById(R.id.textViewCaption);
            ivLandscape = itemView.findViewById(R.id.imageViewLand);

            itemView.setOnClickListener(this);

        }
        public void onClick(View v) {
            int vitriDuocLick = getAdapterPosition();
            if (vitriDuocLick != RecyclerView.NO_POSITION) {
                LandScape ptDuocChon = listData.get(vitriDuocLick);

                // Chuyển sang ItemActivity
                Intent intent = new Intent(v.getContext(), ItemActivity.class);
                intent.putExtra("title", ptDuocChon.getLandCaption());

                // Lấy ID ảnh
                String packageName = v.getContext().getPackageName();
                int imagesID = v.getContext().getResources().getIdentifier(ptDuocChon.getLandImageFileName(), "mipmap", packageName);
                intent.putExtra("imageResId", imagesID);

                v.getContext().startActivity(intent);
            }
        }

    }
}
