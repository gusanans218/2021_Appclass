package com.example.asd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ImageSlide extends AppCompatActivity implements View.OnClickListener {
    ImageView image;

    int currentIndex = 0;
    int[] imageRes = {R.drawable.image1, R.drawable.image2,
            R.drawable.image3, R.drawable.image4, R.drawable.image5};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_slide);

        image = findViewById(R.id.image);
        Button prevButton = findViewById(R.id.prev);
        Button nextButton = findViewById(R.id.next);

        prevButton.setOnClickListener(this);
        nextButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.prev) {
            if (currentIndex == 0) {
                return;
            } else currentIndex--;
        } else if (v.getId() == R.id.next) {
            if (currentIndex == (imageRes.length - 1)) {
                return;
            }
        } else currentIndex++;



     setImage();
}
private void setImage(){
    image.setImageResource(imageRes[currentIndex]);
    }
}
