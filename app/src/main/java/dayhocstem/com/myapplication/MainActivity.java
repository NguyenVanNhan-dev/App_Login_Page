package dayhocstem.com.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Tìm nút login từ layout
        Button loginButton = findViewById(R.id.login_button);

        // Đặt sự kiện OnClickListener cho nút login
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Tạo intent để chuyển sang activity_main
                Intent intent = new Intent(MainActivity.this, MainScreenActivity.class);
                startActivity(intent);
            }
        });
    }
}
