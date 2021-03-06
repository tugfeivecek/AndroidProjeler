package tugfeivecek.com.mailgonderme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
       private EditText editTextKonu,editTextMail,editTextIleti;
       private Button buttonGonder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextKonu=findViewById(R.id.editTextKonu);
        editTextMail=findViewById(R.id.editTextMail);
        editTextIleti=findViewById(R.id.editTextIleti);
        buttonGonder=findViewById(R.id.buttonGonder);

        buttonGonder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String konu= editTextKonu.getText().toString();
                String mail= editTextMail.getText().toString();
                String icerik= editTextIleti.getText().toString();

                Intent mailIntent=new Intent(Intent.ACTION_SEND);
                mailIntent.setType("plain/text");
                mailIntent.putExtra(Intent.EXTRA_SUBJECT,konu);
                mailIntent.putExtra(Intent.EXTRA_TEXT,mail );
                startActivity(Intent.createChooser(mailIntent,"E-mail göndermek içi seçiniz"));

                String mailList[]={icerik};
                mailIntent.putExtra(Intent.EXTRA_EMAIL,mailList);
                startActivity(mailIntent);
            }
        });
    }
}
