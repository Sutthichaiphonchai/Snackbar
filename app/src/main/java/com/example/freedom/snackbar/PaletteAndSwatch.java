package com.example.freedom.snackbar;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.graphics.Palette;
import android.widget.FrameLayout;
import android.widget.TextView;

public class PaletteAndSwatch extends AppCompatActivity {

    private FrameLayout layoutLightMuted1;
    private FrameLayout layoutLightMuted2;
    private FrameLayout layoutLightMuted3;
    private FrameLayout layoutLightMuted4;

    private FrameLayout layoutMuted1;
    private FrameLayout layoutMuted2;
    private FrameLayout layoutMuted3;
    private FrameLayout layoutMuted4;

    private FrameLayout layoutDarkMuted1;
    private FrameLayout layoutDarkMuted2;
    private FrameLayout layoutDarkMuted3;
    private FrameLayout layoutDarkMuted4;

    private FrameLayout layoutLightVibrant1;
    private FrameLayout layoutLightVibrant2;
    private FrameLayout layoutLightVibrant3;
    private FrameLayout layoutLightVibrant4;

    private FrameLayout layoutVibrant1;
    private FrameLayout layoutVibrant2;
    private FrameLayout layoutVibrant3;
    private FrameLayout layoutVibrant4;

    private FrameLayout layoutDarkVibrant1;
    private FrameLayout layoutDarkVibrant2;
    private FrameLayout layoutDarkVibrant3;
    private FrameLayout layoutDarkVibrant4;

    private TextView tvHeader1;
    private TextView tvHeader2;
    private TextView tvHeader3;
    private TextView tvHeader4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palette_and_swatch);

        initialWidget();
        generatePalette();
    }
    private void initialWidget() {
        layoutLightVibrant1 = (FrameLayout) findViewById(R.id.layout_light_vibrant1);
        layoutLightVibrant2 = (FrameLayout) findViewById(R.id.layout_light_vibrant2);
        layoutLightVibrant3 = (FrameLayout) findViewById(R.id.layout_light_vibrant3);
        layoutLightVibrant4 = (FrameLayout) findViewById(R.id.layout_light_vibrant4);

        layoutVibrant1 = (FrameLayout) findViewById(R.id.layout_vibrant1);
        layoutVibrant2 = (FrameLayout) findViewById(R.id.layout_vibrant2);
        layoutVibrant3 = (FrameLayout) findViewById(R.id.layout_vibrant3);
        layoutVibrant4 = (FrameLayout) findViewById(R.id.layout_vibrant4);

        layoutDarkVibrant1 = (FrameLayout) findViewById(R.id.layout_dark_vibrant1);
        layoutDarkVibrant2 = (FrameLayout) findViewById(R.id.layout_dark_vibrant2);
        layoutDarkVibrant3 = (FrameLayout) findViewById(R.id.layout_dark_vibrant3);
        layoutDarkVibrant4 = (FrameLayout) findViewById(R.id.layout_dark_vibrant4);

        layoutLightMuted1 = (FrameLayout) findViewById(R.id.layout_light_muted1);
        layoutLightMuted2 = (FrameLayout) findViewById(R.id.layout_light_muted2);
        layoutLightMuted3 = (FrameLayout) findViewById(R.id.layout_light_muted3);
        layoutLightMuted4 = (FrameLayout) findViewById(R.id.layout_light_muted4);

        layoutMuted1 = (FrameLayout) findViewById(R.id.layout_muted1);
        layoutMuted2 = (FrameLayout) findViewById(R.id.layout_muted2);
        layoutMuted3 = (FrameLayout) findViewById(R.id.layout_muted3);
        layoutMuted4 = (FrameLayout) findViewById(R.id.layout_muted4);

        layoutDarkMuted1 = (FrameLayout) findViewById(R.id.layout_dark_muted1);
        layoutDarkMuted2 = (FrameLayout) findViewById(R.id.layout_dark_muted2);
        layoutDarkMuted3 = (FrameLayout) findViewById(R.id.layout_dark_muted3);
        layoutDarkMuted4 = (FrameLayout) findViewById(R.id.layout_dark_muted4);

        tvHeader1 = (TextView) findViewById(R.id.tv_header1);
        tvHeader2 = (TextView) findViewById(R.id.tv_header2);
        tvHeader3 = (TextView) findViewById(R.id.tv_header3);
        tvHeader4 = (TextView) findViewById(R.id.tv_header4);
    }

    private void generatePalette() {
        Bitmap bitmap1 = BitmapFactory.decodeResource(getResources(), R.drawable.photo_001);
        Bitmap bitmap2 = BitmapFactory.decodeResource(getResources(), R.drawable.photo_002);
        Bitmap bitmap3 = BitmapFactory.decodeResource(getResources(), R.drawable.photo_003);
        Bitmap bitmap4 = BitmapFactory.decodeResource(getResources(), R.drawable.photo_004);

        Palette.generateAsync(bitmap1, new Palette.PaletteAsyncListener() {
            public void onGenerated(Palette p) {
                layoutLightVibrant1.setBackgroundColor(p.getLightVibrantColor(Color.WHITE));
                layoutVibrant1.setBackgroundColor(p.getVibrantColor(Color.WHITE));
                layoutDarkVibrant1.setBackgroundColor(p.getDarkVibrantColor(Color.WHITE));
                layoutLightMuted1.setBackgroundColor(p.getLightMutedColor(Color.WHITE));
                layoutMuted1.setBackgroundColor(p.getMutedColor(Color.WHITE));
                layoutDarkMuted1.setBackgroundColor(p.getDarkMutedColor(Color.WHITE));
                tvHeader1.setBackgroundColor(p.getDarkVibrantColor(Color.WHITE));

                Palette.Swatch swatch = p.getDarkVibrantSwatch();
                tvHeader1.setTextColor(swatch.getTitleTextColor());
            }
        });

        Palette.generateAsync(bitmap2, new Palette.PaletteAsyncListener() {
            public void onGenerated(Palette p) {
                layoutLightVibrant2.setBackgroundColor(p.getLightVibrantColor(Color.WHITE));
                layoutVibrant2.setBackgroundColor(p.getVibrantColor(Color.WHITE));
                layoutDarkVibrant2.setBackgroundColor(p.getDarkVibrantColor(Color.WHITE));
                layoutLightMuted2.setBackgroundColor(p.getLightMutedColor(Color.WHITE));
                layoutMuted2.setBackgroundColor(p.getMutedColor(Color.WHITE));
                layoutDarkMuted2.setBackgroundColor(p.getDarkMutedColor(Color.WHITE));
                tvHeader2.setBackgroundColor(p.getDarkVibrantColor(Color.WHITE));

                Palette.Swatch swatch = p.getDarkVibrantSwatch();
                tvHeader2.setTextColor(swatch.getTitleTextColor());
            }
        });

        Palette.generateAsync(bitmap3, new Palette.PaletteAsyncListener() {
            public void onGenerated(Palette p) {
                layoutLightVibrant3.setBackgroundColor(p.getLightVibrantColor(Color.WHITE));
                layoutVibrant3.setBackgroundColor(p.getVibrantColor(Color.WHITE));
                layoutDarkVibrant3.setBackgroundColor(p.getDarkVibrantColor(Color.WHITE));
                layoutLightMuted3.setBackgroundColor(p.getLightMutedColor(Color.WHITE));
                layoutMuted3.setBackgroundColor(p.getMutedColor(Color.WHITE));
                layoutDarkMuted3.setBackgroundColor(p.getDarkMutedColor(Color.WHITE));
                tvHeader3.setBackgroundColor(p.getDarkVibrantColor(Color.WHITE));

                Palette.Swatch swatch = p.getDarkVibrantSwatch();
                tvHeader3.setTextColor(swatch.getTitleTextColor());
            }
        });

        Palette.generateAsync(bitmap4, new Palette.PaletteAsyncListener() {
            public void onGenerated(Palette p) {
                layoutLightVibrant4.setBackgroundColor(p.getLightVibrantColor(Color.WHITE));
                layoutVibrant4.setBackgroundColor(p.getVibrantColor(Color.WHITE));
                layoutDarkVibrant4.setBackgroundColor(p.getDarkVibrantColor(Color.WHITE));
                layoutLightMuted4.setBackgroundColor(p.getLightMutedColor(Color.WHITE));
                layoutMuted4.setBackgroundColor(p.getMutedColor(Color.WHITE));
                layoutDarkMuted4.setBackgroundColor(p.getDarkMutedColor(Color.WHITE));
                tvHeader4.setBackgroundColor(p.getDarkVibrantColor(Color.WHITE));

                Palette.Swatch swatch = p.getDarkVibrantSwatch();
                tvHeader4.setTextColor(swatch.getTitleTextColor());
            }
        });
    }
}
