package com.example.student;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.github.drjacky.imagepicker.ImagePicker;

import org.w3c.dom.Text;

import de.hdodenhof.circleimageview.CircleImageView;

public class ProfileActivity extends AppCompatActivity {

    //image picker
    ImageView change_image_in_profile;
    CircleImageView profile_image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Toolbar actionbar = findViewById(R.id.custom_toolbar_profile);
        setSupportActionBar(actionbar);
        setTitle("");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //image picker n change profile
        change_image_in_profile = findViewById(R.id.change_image_in_profile);
        profile_image = findViewById(R.id.profile_image);

        //Major, promotion, academic year
        TextView major_in_profile = findViewById(R.id.major_in_profile);
        TextView promotion_in_profile = findViewById(R.id.promotion_in_profile);
        TextView academic_year_profile = findViewById(R.id.academic_year_profile);
        //settext
        major_in_profile.setText("IT");
        promotion_in_profile.setText("13");
        academic_year_profile.setText("2018-2022");

        //shift, date of birth, phone number
        TextView shift_in_profile = findViewById(R.id.shift_in_profile);
        TextView date_of_birth_profile = findViewById(R.id.date_of_birth_profile);
        TextView phone_number_profile = findViewById(R.id.phone_number_profile);
        //settext
        shift_in_profile.setText("Evening");
        date_of_birth_profile.setText("11-07-2000");
        phone_number_profile.setText("093794815");

        //change password btn
        Button change_password_btn_profile = findViewById(R.id.change_password_btn_profile);
        change_password_btn_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ProfileActivity.this, "Sent", Toast.LENGTH_SHORT).show();
            }
        });

        change_image_in_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImagePicker.Companion.with(ProfileActivity.this)
                        .maxResultSize(1080, 1080)
                        .crop().cropOval().compress(1024)
                        .start(20);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
            Uri uri = data.getData();
            profile_image.setImageURI(uri);
    }

    //sign out
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId()==R.id.sign_out_in_menu){
            Intent intent = new Intent(ProfileActivity.this, LoginActivity.class);
            startActivity(intent);
            return true;
        }else if(item.getItemId()==R.id.change_profile_in_menu){
            ImagePicker.Companion.with(ProfileActivity.this)
                    .maxResultSize(1080, 1080)
                    .crop().cropOval().compress(1024)
                    .start();
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_profile,menu);
        return super.onCreateOptionsMenu(menu);
    }
}