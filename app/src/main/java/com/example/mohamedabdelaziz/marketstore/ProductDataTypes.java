package com.example.mohamedabdelaziz.marketstore;

import java.util.ArrayList;

/**
 * Created by Mohamed Abd Elaziz on 8/8/2017.
 */

public class ProductDataTypes {

    public String image, desc, price, type, ownerid, ownerImage, ownerName, date, time;
    public ArrayList<followers> follower;
    public ArrayList<comments> comment;

    ProductDataTypes() {
    }

    public ProductDataTypes(ArrayList<comments> comment, String date, String desc, ArrayList<followers> follower
            , String image, String ownerImage, String ownerName, String ownerid
            , String price, String time, String type
    ) {
        this.image = image;
        this.desc = desc;
        this.price = price;
        this.type = type;
        this.ownerid = ownerid;
        this.ownerName = ownerName;
        this.date = date;
        this.follower = follower;
        this.comment = comment;
        this.ownerImage = ownerImage;
        this.time = time;
    }

}

class followers {
    public String id, name;

    followers() {
    }

    public followers(String id, String name) {
        this.id = id;
        this.name = name;

    }
}

class comments {
    public String id, name, comment;

    comments() {
    }

    public comments(String id, String name, String comment) {
        this.id = id;
        this.name = name;
        this.comment = comment;
    }

}
