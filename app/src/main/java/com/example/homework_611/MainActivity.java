package com.example.homework_611;

import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private static final String TEXT_VIEW_BUNDLE_KEY = "String from textView: ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        boolean isBundleNull = savedInstanceState == null;
        Log.d("Lifecycle", "onCreate" + "bundle is null = " + isBundleNull);
        if (!isBundleNull) {
            textView.setText(savedInstanceState.getString(TEXT_VIEW_BUNDLE_KEY));
        }
        textView.append("\n" + "onCreate, " + "bundle is null = " + isBundleNull);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Lifecycle", "onStart");
        textView.append("\n" + "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Lifecycle", "onResume");
        textView.append("\n" + "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Lifecycle", "onPause");
        textView.append("\n" + "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Lifecycle", "onStop");
        textView.append("\n" + "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Lifecycle", "onDestroy");
        textView.append("\n" + "onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Lifecycle", "onRestart");
        textView.append("\n" + "onRestart");
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        super.onKeyDown(keyCode, event);
        Log.d("Lifecycle", "onKeyDown");
        textView.append("\n" + "onKeyDown");
        return true;
    }

    @Override
    public boolean onKeyLongPress(int keyCode, KeyEvent event) {
        super.onKeyLongPress(keyCode, event);
        Log.d("Lifecycle", "onKeyLongPress");
        textView.append("\n" + "onKeyLongPress");
        return false;
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Log.d("Lifecycle", "onBackPressed");
        textView.append("\n" + "onBackPressed");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d("Lifecycle", "onSaveInstanceState");
        textView.append("\n" + "onSaveInstanceState");
        outState.putString(TEXT_VIEW_BUNDLE_KEY, textView.getText().toString());
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d("Lifecycle", "onRestoreInstanceState");
        textView.append("\n" + "onRestoreInstanceState");
    }
}