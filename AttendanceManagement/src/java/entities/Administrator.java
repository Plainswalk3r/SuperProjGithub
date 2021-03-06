/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author David
 */
@Entity
@Table(name = "ADMINISTRATORS")
@NamedQueries({
    @NamedQuery(name = "getAllAdministrators",
    query = "SELECT c FROM Administrator c ORDER BY c.id"),
    })
public class Administrator extends User implements Serializable {


    protected Administrator() {
    }

    public Administrator(long id, String password, String name, String email) {
        super(id, password, name, email);
    }
    
      @Override
        public String getUserType(){
         return "Admin";
    }
    
}
