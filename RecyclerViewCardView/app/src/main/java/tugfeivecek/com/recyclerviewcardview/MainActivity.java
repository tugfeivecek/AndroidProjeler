package tugfeivecek.com.recyclerviewcardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
 private RecyclerView rc;
 private RecyclerView.Adapter adapter;
 private RecyclerView.LayoutManager layoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<ExampleItem> exampleList= new ArrayList<>();
        exampleList.add(new ExampleItem(R.drawable.ic_launcher_background,"Başlık 1 ","Açıklama 1"));
        exampleList.add(new ExampleItem(R.drawable.resim2,"Başlık 2","Açıklama 2"));
        exampleList.add(new ExampleItem(R.drawable.resim3,"Başlık 3 ","Açıklama 3"));
        exampleList.add(new ExampleItem(R.drawable.ic_launcher_background,"Başlık 1 ","Açıklama 1"));
        exampleList.add(new ExampleItem(R.drawable.resim2,"Başlık 2","Açıklama 2"));
        exampleList.add(new ExampleItem(R.drawable.resim3,"Başlık 3 ","Açıklama 3"));
        exampleList.add(new ExampleItem(R.drawable.ic_launcher_background,"Başlık 1 ","Açıklama 1"));
        exampleList.add(new ExampleItem(R.drawable.resim2,"Başlık 2","Açıklama 2"));
        exampleList.add(new ExampleItem(R.drawable.resim3,"Başlık 3 ","Açıklama 3"));
        exampleList.add(new ExampleItem(R.drawable.ic_launcher_background,"Başlık 1 ","Açıklama 1"));
        exampleList.add(new ExampleItem(R.drawable.resim2,"Başlık 2","Açıklama 2"));
        exampleList.add(new ExampleItem(R.drawable.resim3,"Başlık 3 ","Açıklama 3"));
        exampleList.add(new ExampleItem(R.drawable.ic_launcher_background,"Başlık 1 ","Açıklama 1"));
        exampleList.add(new ExampleItem(R.drawable.resim2,"Başlık 2","Açıklama 2"));
        exampleList.add(new ExampleItem(R.drawable.resim3,"Başlık 3 ","Açıklama 3"));


        rc=findViewById(R.id.rc);
        rc.setHasFixedSize(true);
        layoutManager=new LinearLayoutManager(this);
        adapter=new Adapter(exampleList);
        rc.setLayoutManager(layoutManager);
        rc.setAdapter(adapter);
    }
}
