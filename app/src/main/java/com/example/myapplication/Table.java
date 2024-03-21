package com.example.myapplication;

import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Table extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_table);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        // Obtendo uma referência para o TableLayout no XML
        TableLayout tableLayout = findViewById(R.id.tableLayout);

        // Chame esta função para adicionar uma nova linha com dados à tabela
        adicionarLinhaNaTabela(tableLayout, "Dado 1", "Dado 2", "Dado 3", "Dado 4", "Dado 5");
    }

    // Função para adicionar uma nova linha à tabela com os dados fornecidos
    private void adicionarLinhaNaTabela(TableLayout tableLayout, String dado1, String dado2, String dado3, String dado4, String dado5) {
        // Criando uma nova linha
        TableRow tableRow = new TableRow(this);

        // Adicionando TextViews para cada coluna
        tableRow.addView(criarTextView(dado1));
        tableRow.addView(criarTextView(dado2));
        tableRow.addView(criarTextView(dado3));
        tableRow.addView(criarTextView(dado4));
        tableRow.addView(criarTextView(dado5));

        // Adicionando a linha ao TableLayout
        tableLayout.addView(tableRow);
    }

    // Função auxiliar para criar TextViews com os dados fornecidos
    private TextView criarTextView(String texto) {
        TextView textView = new TextView(this);
        textView.setText(texto);
        return textView;
    }
}