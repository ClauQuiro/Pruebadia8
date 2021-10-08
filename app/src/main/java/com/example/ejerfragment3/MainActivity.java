package com.example.ejerfragment3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.SurfaceControl;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    FragmentEmpresa fragmentEmpresa;
    FragmentPersona fragmentPersona;
    RadioButton r1,r2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        r1=findViewById(R.id.rb1);
        r2=findViewById(R.id.rb2);
        fragmentEmpresa = new FragmentEmpresa();
        fragmentPersona = new FragmentPersona();
        getSupportFragmentManager().beginTransaction().add(R.id.contenedorFragments,fragmentPersona).commit();


        FragmentTransaction Transaction =getSupportFragmentManager().beginTransaction();

        if (r1.isChecked()== true) {

            Transaction.replace(R.id.contenedorFragments, fragmentPersona);
        }
         else
             if(r2.isChecked()== true){
                 Toast.makeText(this, "estoy en rb2", Toast.LENGTH_SHORT).show();
              Transaction.replace(R.id.contenedorFragments,fragmentEmpresa);
             }
      Transaction.commit();
    }
}