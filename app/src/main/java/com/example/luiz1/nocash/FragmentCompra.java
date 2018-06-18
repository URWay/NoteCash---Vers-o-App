package com.example.luiz1.nocash;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.luiz1.nocash.Adapter.ContaListView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentCompra extends Fragment {


    public FragmentCompra() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_fragment_compra, container, false);



// Definindo o que será passado: nome da promoção, descrição, e imagem nessa ordem:
        String[] nometrans={"Prod1","Prod2", "Prod3", "Prod4"};
        String[] desctrans={"Desc1", "Desc2", "Desc3", "Desc4"};
        Integer[] imgtrans={R.drawable.logomenu, R.drawable.bglogin,R.drawable.bglogin,R.drawable.bglogin};
        String txtdata = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(new Date());
// Listener de cada item da lista
        ListView lista =  v.findViewById(R.id.listatrans);
        ContaListView contaListview = new ContaListView(getActivity(), nometrans, desctrans, imgtrans,txtdata);
        lista.setAdapter(contaListview);


        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                FragmentCompra frag1 = new FragmentCompra();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.corpo, frag1);
                fragmentTransaction.commit();


            }
        });


        return v;
    }

}
