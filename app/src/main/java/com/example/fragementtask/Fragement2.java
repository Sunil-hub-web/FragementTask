package com.example.fragementtask;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class Fragement2 extends Fragment {

    Button button;
    LinearLayout linearLayout;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragement2,container,false);

        button=view.findViewById(R.id.button2);
        linearLayout=view.findViewById(R.id.l1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearLayout.setVisibility(LinearLayout.GONE);
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                Fragement3 fragement3 = new Fragement3();
                ft.replace(R.id.f3,fragement3);
                ft.commit();
            }
        });

        return view;
    }
}
