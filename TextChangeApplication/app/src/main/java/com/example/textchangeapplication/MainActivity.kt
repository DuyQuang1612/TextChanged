package com.example.textchangeapplication

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.textchangeapplication.ui.theme.TextChangeApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Lấy tham chiếu đến TextView và Button
        val textView = findViewById<TextView>(R.id.textView)
        val button = findViewById<Button>(R.id.button)

        // Thiết lập sự kiện cho nút bấm
        button.setOnClickListener {
            // Thay đổi nội dung của TextView
            textView.text = "Bạn đã nhấn nút!"

            // Hiển thị thông báo
            Toast.makeText(this, "Nút đã được nhấn!", Toast.LENGTH_SHORT).show()
        }
    }
}

