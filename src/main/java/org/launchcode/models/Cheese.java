package org.launchcode.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by LaunchCode and persisted this class able to store data in database outside of application
 */
@Entity //specify this annotation as store cheese class data in database
public class Cheese {
 // Id is unique key/primary key in database
    @Id
    @GeneratedValue //hibernate/data layer should generate this value to manage the value creation
    private int id;

    @NotNull
    @Size(min=3, max=15)
    private String name;

    @NotNull
    @Size(min=1, message = "Description must not be empty")
    private String description;

    private CheeseType type;

   /* private int cheeseId;
    private static int nextId = 1;*/

    public Cheese(String name, String description) {
        //this();
        this.name = name;
        this.description = description;
    }

    public Cheese() {
        /*cheeseId = nextId;
        nextId++;*/
    }

   /* public int getCheeseId() {
        return cheeseId;
    }

    public void setCheeseId(int cheeseId) {
        this.cheeseId = cheeseId;
    }*/
//no need to add setter due to id will change outside of class
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CheeseType getType() {
        return type;
    }

    public void setType(CheeseType type) {
        this.type = type;
    }
}
