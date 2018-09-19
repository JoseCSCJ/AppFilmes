package com.example.opet.filmes;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {
    private List<Filme> filmes;
    private EditText editNome;
    private Spinner spinnerGenero;
    private Spinner spinnerNota;
    private ListView listRanking;
    private ArrayAdapter<Filme> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        filmes = new ArrayList<>();
        editNome = findViewById(R.id.editNome);
        spinnerGenero = findViewById(R.id.spinnerGenero);
        spinnerNota = findViewById(R.id.spinnerNota);
        listRanking = findViewById(R.id.listRanking);
        atualizarRanking();
    }

    private void atualizarRanking(){
        if(adapter == null) {
            adapter = new FilmeAdapter(getApplicationContext(), R.layout.filme_item, filmes);
            listRanking.setAdapter(adapter);
        }else{
            adapter.notifyDataSetChanged();
        }
    }

    public void salvarFilme(View v){
        String nome = editNome.getText().toString();
        String genero = spinnerGenero.getSelectedItem().toString();
        int nota = spinnerNota.getSelectedItem();

        Filme F = new Filme();
        a.setNome(nome);
        a.setGenero(genero);


        artistas.add(a);
        atualizarArtistas();
    }
}
