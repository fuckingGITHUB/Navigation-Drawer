package com.navdrawerwithtabsandrecyclerview;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class Login extends Fragment {
    View view;
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        final EditText user;
        final EditText pass;
        Button login;
        user=(EditText)view.findViewById(R.id.editTextuser);
        pass=(EditText)view.findViewById(R.id.editTextpass);
        login=(Button)view.findViewById(R.id.buttonLogin);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                authenticate(user.getText().toString(),pass.getText().toString());
            }
        });

    }

    public Login() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view=inflater.inflate(R.layout.fragment_login, container, false);
        return view;
    }

    public void authenticate(String user, String pass){
        if(user.equals("admin") && pass.equals("password")){
            Toast toast=Toast.makeText(getContext(),"Logged In",Toast.LENGTH_LONG);
            toast.show();
        }
        else {
            Toast toast=Toast.makeText(getContext(),"Invalid credentials",Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}
