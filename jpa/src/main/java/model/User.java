package model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public  class User {
    
    @Id
    private long id;

    private String name;

    private String email;

    
    public User(){
        
    }

    public User(String name, String email){
        super();
        this.name = name;
        this.email = email;
    }


    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }


    
}
