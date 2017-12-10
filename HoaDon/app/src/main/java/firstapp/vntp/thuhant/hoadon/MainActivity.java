package firstapp.vntp.thuhant.hoadon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private TextView texviewTongtien;
    private TextView textviewDongia;
    private TextView textviewQuantity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         texviewTongtien = (TextView) findViewById(R.id.txtviewTongtien);
         textviewDongia = (TextView) findViewById(R.id.txtDongia);
         textviewQuantity = (TextView) findViewById(R.id.txtviewSoluong);
    }

    public void onButtonSubtractClick(View view){
        //Button btnTru = (Button) findViewById(R.id.btn_Tru); // R là thư mục "res"
        //TextView textviewQuantity = (TextView) findViewById(R.id.txtviewSoluong);
        int quantity = Integer.parseInt(textviewQuantity.getText().toString());
        if(quantity > 0){
            quantity--;
        }
        textviewQuantity.setText("" + quantity);
        // Tính cột tổng tiền
        int tong ;
        String giaStr = textviewDongia.getText().toString();
        Log.i("gia", giaStr+"");
       // Log.i("gia1", giaStr.substring(1,giaStr.length())+"");
        int gia = Integer.parseInt(giaStr.substring(1,giaStr.length()));
        Log.i("gia2", gia+"");
        tong = gia*quantity;
        texviewTongtien.setText("$"+tong);
    }

    public void onButtonAddClick(View view){
        int quantity = Integer.parseInt(textviewQuantity.getText().toString());
        if (quantity > 0){
            quantity++;
        }
        textviewQuantity.setText("" + quantity);

        // Tính cột tổng tiền
        int tong;
        String giaStr = textviewDongia.getText().toString();
        int gia = Integer.parseInt(giaStr.substring(1,giaStr.length()));
        tong = gia*quantity;
        texviewTongtien.setText("$" + tong);

    }



}
