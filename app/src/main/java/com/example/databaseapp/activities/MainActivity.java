package com.example.databaseapp.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import com.example.databaseapp.database.*;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


import com.example.databaseapp.R;
import com.google.android.material.snackbar.Snackbar;

import java.util.List;


public class MainActivity extends AppCompatActivity {



    Snackbar error;
    EditText userName;
    EditText passWord;
    Button submit;

    UserDatabase UDB;

    List<String> users;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Application application = this.getApplication();
        Log.i("OnCreate", "OnCreate ran");
        setContentView(R.layout.activity_main);
       error = Snackbar.make(findViewById(R.id.mainLayout), "This UserName already exists", Snackbar.LENGTH_LONG);
         userName = findViewById(R.id.userView);
       passWord = findViewById(R.id.passview);
         submit = (Button) findViewById(R.id.submitbutton);
       UDB = UserDatabase.getDatabase(application);



        userDao UDAO = UDB.usersDao();
      users = UDAO.getAll();
      Log.i("OnCreate", "UDAO Created");
        createButtons();

    }


    public void createButtons(){

        submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                saveUser();
            }
        });
    }

    private boolean checkNames(String name){
        if(users.contains(name)){
            error.show();
            return true;
        }
        return false;
    }

    private void saveUser(){
        String user = userName.getText().toString();
        String password = passWord.getText().toString();





    }





}