package tugfeivecek.com.recyclerviewcardview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ExampleViewHolder> {
   private ArrayList<ExampleItem> mexampleList;
    public static class ExampleViewHolder extends RecyclerView.ViewHolder{
        public ImageView imageView;
        public TextView baslik;
        public TextView aciklama;

        public ExampleViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.imageView);
            baslik=itemView.findViewById(R.id.baslik);
            aciklama=itemView.findViewById(R.id.aciklama);
        }
    }
    public Adapter(ArrayList<ExampleItem> exampleList){
        mexampleList=exampleList;
    }


    @NonNull
    @Override
    public ExampleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_tasarimi,parent,false);
        ExampleViewHolder evh= new ExampleViewHolder(v);
        return evh;
    }

    @Override
    public void onBindViewHolder(@NonNull ExampleViewHolder holder, int position) {
          ExampleItem currentItem=mexampleList.get(position);
          holder.imageView.setImageResource(currentItem.getImageResource());
          holder.baslik.setText(currentItem.getBaslik());
          holder.aciklama.setText(currentItem.getAciklama());
    }

    @Override
    public int getItemCount() {
        return mexampleList.size();
    }
}
