package com.programacion.movil.estemanp.androidmvcapplication.Controller;

import com.programacion.movil.estemanp.androidmvcapplication.Domain.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by William on 22/08/16.
 */
public class AppController {
    private static AppController _instance;

    public static AppController get_instance(){
        if (_instance == null){
            _instance = new AppController();

        }
        return _instance;
    }

    private List<User> users;

    public  AppController(){
        users=new ArrayList<User>();
        fillDateBases();
    }

    private void fillDateBases(){
        //Add users
        fillUsers();
    }

    private void fillUsers(){
        User person1=new User("Andres","Perez","estemanp","1234",24);
        users.add(person1);

        User person2=new User("Jessica","Ramirez","jessica","1234",16);
        users.add(person2);
    }

    public boolean isValidUser(String username, String password){
        Boolean resp=false;
        for (User person:users) {
            if(username.equals(person.getUserName())){
                if(password.equals(person.getPassword())){
                    resp=true;
                }
            }
        }
        return resp;
    }
}
