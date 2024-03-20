package dsa.upc.edu.listapp.github;

import javax.xml.namespace.QName;

public class Repos {
    public final String name;
    public final String description;
    //public final int id;
    //public final String avatar_url;

    public Repos(String name, String description /*, int id  String avatar_url*/) {
        this.name = name;
        this.description = description;
        //this.id = id;
        //this.avatar_url = avatar_url;
    }

    @Override
    public String toString() {
        return name+" ("+ description +")";
    }

}