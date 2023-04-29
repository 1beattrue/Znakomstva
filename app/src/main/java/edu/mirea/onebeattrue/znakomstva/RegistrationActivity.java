package edu.mirea.onebeattrue.znakomstva;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import edu.mirea.onebeattrue.znakomstva.databinding.ActivityLoginBinding;
import edu.mirea.onebeattrue.znakomstva.databinding.ActivityRegistrationBinding;

public class RegistrationActivity extends AppCompatActivity {

    private ActivityRegistrationBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRegistrationBinding.inflate(getLayoutInflater());
        View root = binding.getRoot();
        setContentView(root);

        binding.registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO: handle registration logic here

                // finish registration activity and return to login activity
                finish();
            }
        });
    }
}
