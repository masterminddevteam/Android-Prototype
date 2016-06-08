package app.z0nen.slidemenu;


import android.app.AlertDialog;
import android.app.Fragment;
import android.app.FragmentManager;
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
import android.widget.Toast;

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
    private Button btnFragment;
    private TextView lblMedia;
    private EditText txtNota1;
    private EditText txtNota2;
    private EditText txtNota3;
    private EditText txtNota4;

    private float media;
    private String nota1;
    private String nota2;
    private String nota3;
    private String nota4;

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
            btnFragment = (Button) rootview.findViewById(R.id.btnFragment);
            lblMedia = (TextView) rootview.findViewById(R.id.lblMedia);
            txtNota1 = (EditText) rootview.findViewById(R.id.txtNota1);
            txtNota2 = (EditText) rootview.findViewById(R.id.txtNota2);
            txtNota3 = (EditText) rootview.findViewById(R.id.txtNota3);
            txtNota4 = (EditText) rootview.findViewById(R.id.txtNota4);


            btnCalcular.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    nota1 = txtNota1.getText().toString();
                    nota2 = txtNota2.getText().toString();
                    nota3 = txtNota3.getText().toString();
                    nota4 = txtNota4.getText().toString();

                    if(nota1.equals("") || nota2.equals("") || nota3.equals("") || nota4.equals("")){
                        txtView.setText("Preencha todas as notas!");
                        lblMedia.setText("Media: 0");
                    }
                    else {

                        media = (Float.parseFloat(nota1) + Float.parseFloat(nota2) +
                                Float.parseFloat(nota3) + Float.parseFloat(nota4)) / 2;


                        if (media <= 5) {
                            lblMedia.setText("Media: " + media);
                            txtView.setText("Reprovado");
                            String msgAprovadoReprovado = getString(R.string.stringReprovado);
                            Toast toast = Toast.makeText(getActivity(), msgAprovadoReprovado, Toast.LENGTH_LONG);
                            toast.show();
                        } else {
                            lblMedia.setText("Media: " + media);
                            txtView.setText("Aprovado");
                            String msgAprovadoReprovado = getString(R.string.stringAprovado);
                            Toast toast = Toast.makeText(getActivity(), msgAprovadoReprovado, Toast.LENGTH_LONG);
                            toast.show();
                        }
                    }
                }
            });

            btnFragment.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Fragment objFragment = null;
                    objFragment = new Calc_Fragment2();
                    // update the main content by replacing fragments
                    FragmentManager fragmentManager = getFragmentManager();
                    fragmentManager.beginTransaction()
                            .replace(R.id.container, objFragment)
                            .commit();
                }
            });

        return rootview;
    }
}
