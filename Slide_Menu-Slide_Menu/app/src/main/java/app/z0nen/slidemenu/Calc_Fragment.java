package app.z0nen.slidemenu;


import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import app.z0nen.slidemenu.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Calc_Fragment extends Fragment {

   /* private Button btnOk;
    private EditText txtTexto;
    private TextView txtView;

    private Button btnCalcular;
    private TextView lblMedia;
    private EditText txtNota1;
    private EditText txtNota2;

    private int media;
    private int nota1;
    private int nota2;*/

    public Calc_Fragment() {
        // Required empty public constructor
    }
    View rootview;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        /*txtView = (TextView)getView().findViewById(R.id.txtView);

        btnCalcular = (Button)getView().findViewById(R.id.btnCalcular);
        lblMedia = (TextView)getView().findViewById(R.id.lblMedia);
        txtNota1 = (EditText)getView().findViewById(R.id.txtNota1);
        txtNota2 = (EditText)getView().findViewById(R.id.txtNota2);


        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nota1 = Integer.parseInt(String.valueOf(txtNota1.getText()));
                nota2 = Integer.parseInt(String.valueOf(txtNota2.getText()));
                media = (nota1 + nota2) / 2;

                if(media <= 5){

                    lblMedia.setText("Media: " + media);
                    txtView.setText("Reprovado");
                }
                else{

                    lblMedia.setText("Media: " + media);
                    txtView.setText("Aprovado");
                }


            }
        });*/

        rootview = inflater.inflate(R.layout.fragment_calc, container, false);
        return rootview;
    }

}
