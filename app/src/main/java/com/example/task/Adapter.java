package com.example.task;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder>
{
    private List<Data> userList;
    public Adapter(List<Data> userList)
    {
        this.userList=userList;
    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_design,parent,false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position)
    {
        Data data=userList.get(position);
        holder.textView1.setText(data.getData());
        holder.textView2.setText(data.getDesc());


    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
    private ImageView imageView;
    private TextView textView1, textView2;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.img);
        textView1 = itemView.findViewById(R.id.tt1);
        textView2 = itemView.findViewById(R.id.tt2);
    }

        public void setData(int resource, String msg1, String msg2)
        {
            imageView.setImageResource(resource);
            textView1.setText(msg1);
            textView2.setText(msg2);

        }
    }
}
