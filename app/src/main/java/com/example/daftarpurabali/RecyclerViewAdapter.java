package com.example.daftarpurabali;

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

import javax.xml.namespace.QName;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{

    private ArrayList<String> Foto = new ArrayList<>();
    private ArrayList<String> namaPura = new ArrayList<>();
    private ArrayList<String> infoPura = new ArrayList<>();
    private Context context;

    public RecyclerViewAdapter(ArrayList<String> foto, ArrayList<String> namaPura, ArrayList<String> infoPura, Context context) {
        this.Foto = foto;
        this.namaPura = namaPura;
        this.infoPura = infoPura;
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

        Glide.with(context).asBitmap().load(Foto.get(position)).into(holder.imageViewFoto);

        holder.textViewNamaPura.setText(namaPura.get(position));

        holder.constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                //Toast.makeText(context, namaPura.get(position), Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(context, DetailActivity.class);

                intent.putExtra("foto_pura", Foto.get(position));
                intent.putExtra("nama_pura", namaPura.get(position));
                intent.putExtra("info_pura", infoPura.get(position));

                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return namaPura.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        CircleImageView imageViewFoto;
        TextView textViewNamaPura;
        ConstraintLayout constraintLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageViewFoto = itemView.findViewById(R.id.imageViewFoto);
            textViewNamaPura = itemView.findViewById(R.id.textViewNamaPura);
            constraintLayout = itemView.findViewById(R.id.constraintLayout);
        }
    }
}
