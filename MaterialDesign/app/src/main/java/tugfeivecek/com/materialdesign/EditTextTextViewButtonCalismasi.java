package tugfeivecek.com.materialdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class EditTextTextViewButtonCalismasi extends AppCompatActivity {
    private EditText kullaniciAdi,kullaniciSifre;
    private Button buttonGoster;
    private TextView textViewGirilenAd,textViewGirilenSifre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text_text_view_button_calismasi);
        kullaniciAdi=findViewById(R.id.kullaniciAdi);
        kullaniciSifre=findViewById(R.id.kullaniciSifre);
        buttonGoster=findViewById(R.id.buttonGoster);
        textViewGirilenAd=findViewById(R.id.textViewGirilenAd);
        textViewGirilenSifre=findViewById(R.id.textViewGirilenSifre);
        buttonGoster.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String ad=kullaniciAdi.getText().toString();
               String sifre=kullaniciSifre.getText().toString();
               textViewGirilenAd.setText("Girilen Ad: " + ad);
               textViewGirilenSifre.setText("Girilen Şifre: " + sifre);
            }
        });
    }
}
