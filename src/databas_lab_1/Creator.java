/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databas_lab_1;

import javafx.beans.property.SimpleStringProperty;
import org.bson.types.ObjectId;

/**
 *
 * @author Anton
 */
public class Creator {
    private int id;
    private ObjectId mongoId;
    private String name;
    
    public Creator(int id, String name){
        this.id = id;
        this.name = name;
    }
    
    public Creator(ObjectId id, String name){
        this.mongoId = id;
        this.name = name;
    }
    
    public ObjectId getMongoId(){
        return mongoId;
    }
    
    public void setMongoId(ObjectId mid){
        mongoId = mid;
    }
    
    public String getName(){
        return name;
    }
    
    public int getId(){
        return id;
    }
    
    public String toString(){
        return name;
    }
}
