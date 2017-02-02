/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.scg.util;

import static java.lang.Byte.hashCode;
import static java.lang.Character.hashCode;
import java.util.Objects;

/**
 *
 * @author dixya
 */
public final class Name extends Object{
    private String fname;
    private String lname;
    private String mname;
   public Name(){
         //Creates a new instance of Name
    }
    public Name(String lastName, String firstName){
        this.lname=lastName;
        this.fname=firstName;//Construct a Name.
  }
    public Name(String lastName, String firstName, String middleName){
             this.fname=firstName;
             this.lname=lastName;
             this.mname=middleName;// this.hashcode=calchashcode();        
//Construct a Name.
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + Objects.hashCode(this.fname);
        hash = 73 * hash + Objects.hashCode(this.lname);
        hash = 73 * hash + Objects.hashCode(this.mname);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Name other = (Name) obj;
        if (!Objects.equals(this.fname, other.fname)) {
            return false;
        }
        if (!Objects.equals(this.lname, other.lname)) {
            return false;
        }
        if (!Objects.equals(this.mname, other.mname)) {
            return false;
        }
        return true;
    }

  
    public String getFirstName(){
        return fname;//Getter for property firstName.
    }
    public String getLastName(){
        return lname;//Getter for property lastName.
    }
    public String getMiddleName(){
       return mname; //Getter for property middleName.
    }
    
    public void setFirstName(String firstName){
        this.fname=firstName;
        //Setter for property first.


    }
   public void setLastName(String lastName){
        this.lname=lastName;
//setter for last name.
    }
   public  void setMiddleName(String middleName){
        this.mname=middleName;//Setter for property middleName.
    }
    public String toString(){
            final StringBuilder namepattern=new StringBuilder();
           namepattern.append(lname);
           namepattern.append(",");

           namepattern.append(fname);
           if(mname!=null){
           namepattern.append(",");
           namepattern.append(mname);
           }
           String output=namepattern.toString();
           return output;
        //Create string representation of this object in the format
    //"LastName, FirstName MiddleName".
    }

    
}
