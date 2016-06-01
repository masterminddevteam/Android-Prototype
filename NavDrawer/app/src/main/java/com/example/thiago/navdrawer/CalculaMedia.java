package com.example.thiago.navdrawer;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class CalculaMedia extends Fragment {
    private Button btnOk;
    private EditText txtTexto;
    private TextView txtView;

    private Button btnCalcular;
    private TextView lblMedia;
    private EditText txtNota1;
    private EditText txtNota2;

    private int media;
    private int nota1;
    private int nota2;

    public CalculaMedia() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_calcula_media, container, false);



       /* txtView txtView = (TextView) getView().findViewById(R.id.txtView);

        btnCalcular = (Button)getView().findViewById(R.id.btnCalcular);
        lblMedia = (TextView) getView().findViewById(R.id.lblMedia);
        txtNota1 = (EditText) getView().findViewById(R.id.txtNota1);
        txtNota2 = (EditText) getView().findViewById(R.id.txtNota2);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nota1 = Integer.parseInt(String.valueOf(txtNota1.getText()));
                nota2 = Integer.parseInt(String.valueOf(txtNota2.getText()));
                media = (nota1 + nota2) / 2;

                if(media <= 5){

                    lblMedia.setText("Média: " + media);
                    txtView.setText("Reprovado");
                }
                else{

                    lblMedia.setText("Média: " + media);
                    txtView.setText("Aprovado");
                }


            }
        });*/

    }

}
