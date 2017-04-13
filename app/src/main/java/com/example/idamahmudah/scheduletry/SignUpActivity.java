package com.example.idamahmudah.scheduletry;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.idamahmudah.scheduletry.Model.SignUpEmailModel;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

/**
 * Created by lenovo on 13/04/2017.
 */

public class SignUpActivity extends AppCompatActivity{
    private EditText mEmail, mPass;
    private Button mSignUp;

    private FirebaseAuth mAuth;
    private ProgressDialog mDialog;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_email);

        mAuth = FirebaseAuth.getInstance();
        mDialog = new ProgressDialog(this);

        mEmail = (EditText) findViewById(R.id.textEmail);
        mPass = (EditText) findViewById(R.id.textPassword);
        mSignUp = (Button) findViewById(R.id.buttonSignUp);

        mSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = mEmail.getText().toString();
                String pass = mPass.getText().toString();

                SignUpEmailModel signUpEmailModel = new SignUpEmailModel(email, pass);
                registerUser(signUpEmailModel);
            }
        });
    }

    public void registerUser (SignUpEmailModel signUpEmailModel){
        mDialog.setMessage("OK WAIT...");
        mDialog.show();

        mAuth.createUserWithEmailAndPassword(signUpEmailModel.getEmail(), signUpEmailModel.getPassword())
                .addOnCompleteListener(SignUpActivity.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        mDialog.dismiss();
                        if(task.isSuccessful()){
                            Intent intent = new Intent(SignUpActivity.this, SignUpFormActivity.class);
                            startActivity(intent);
                        } else {
                            Toast.makeText(SignUpActivity.this, "Try Again", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
    }
}
