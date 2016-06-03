package app.z0nen.slidemenu;


import android.app.AlertDialog;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.concurrent.ExecutionException;

import app.z0nen.slidemenu.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Calc_Fragment extends Fragment {

    private Button btnOk;
    private EditText txtTexto;
    private TextView txtView;

    private Button btnCalcular;
    private TextView lblMedia;
    private EditText txtNota1;
    private EditText txtNota2;

    private float media;
    private String nota1;
    private String nota2;

    public Calc_Fragment() {
        // Required empty public constructor
    }
    View rootview;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        rootview = inflater.inflate(R.layout.fragment_calc, container, false);
            txtView = (TextView) rootview.findViewById(R.id.txtView);


            btnCalcular = (Button) rootview.findViewById(R.id.btnCalcular);
            lblMedia = (TextView) rootview.findViewById(R.id.lblMedia);
            txtNota1 = (EditText) rootview.findViewById(R.id.txtNota1);
            txtNota2 = (EditText) rootview.findViewById(R.id.txtNota2);


            btnCalcular.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    nota1 = txtNota1.getText().toString();
                    nota2 = txtNota2.getText().toString();
                    if(nota1.equals("") && nota2.equals("")){
                        txtView.setText("Preencha as duas notas!");
                    }
                    else {

                        media = (Float.parseFloat(nota1) + Float.parseFloat(nota2)) / 2;


                        if (media <= 5) {
                            lblMedia.setText("Media: " + media);
                            txtView.setText("Reprovado");
                        } else {
                            lblMedia.setText("Media: " + media);
                            txtView.setText("Aprovado");
                        }
                    }




                }
            });

        return rootview;
    }

}
