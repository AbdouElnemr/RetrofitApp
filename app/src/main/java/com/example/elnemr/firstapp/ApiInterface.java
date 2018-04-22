package com.example.elnemr.firstapp;


import com.example.elnemr.firstapp.Model.Contact;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.POST;

/**
 * Created by Elnemr on 4/21/2018.
 */

public interface ApiInterface {

    @POST("ReadContacts.php")
   Call<List<Contact>> getContacts();

}
