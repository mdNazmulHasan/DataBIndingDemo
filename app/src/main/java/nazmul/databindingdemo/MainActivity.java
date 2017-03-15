package nazmul.databindingdemo;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import nazmul.databindingdemo.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
/*
        binding.textViewName.setText("Elon Musk");
        binding.textViewOccupation.setText("Entrepreneur, Engineer, Inventor, Investor");*/
        PersonVO personVO = new PersonVO("Elon Musk", "Entrepreneur, Engineer, Inventor, Investor");

        binding.setPersonVO(personVO);
    }
}
