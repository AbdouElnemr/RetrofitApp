package com.example.elnemr.firstapp.Model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Elnemr on 4/21/2018.
 */

public class Contact {

    @SerializedName("name") // because var Name != name in the JSON
    private  String Name;

    @SerializedName("email")
    private String Email;

    public String getName() {
        return Name;
    }

    public String getEmail() {
        return Email;
    }
}
