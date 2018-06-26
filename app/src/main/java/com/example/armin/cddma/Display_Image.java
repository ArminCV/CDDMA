package com.example.armin.cddma;

//import android.content.Intent;
import android.content.Intent;
import android.graphics.Bitmap;
//import android.media.Image;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class Display_Image extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display__image);

            Intent intent = getIntent();
//        Bitmap bitmap = (Bitmap) intent.getParcelableExtra("BitmapImage");
//        imageView.setImageBitmap(bitmap);

        imageView = (ImageView) findViewById(R.id.image_display);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
                Bitmap bitmap = (Bitmap) intent.getParcelableExtra ("BitmapImage");
                int ng = (int) (bitmap.getHeight() * (512.0 / bitmap.getWidth()));
                Bitmap scaled = Bitmap.createScaledBitmap(bitmap, 512, ng, true);
//            Bitmap bitmap = (Bitmap) extras.get("image");
            if (bitmap != null) {
                imageView.setImageBitmap(scaled);
            }
        }
    }//onCreate end

}
