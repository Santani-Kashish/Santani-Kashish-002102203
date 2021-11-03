/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/

package business;

/**
 */
public class Person {
    private String personName;
    private int age;
    private Patient patient;
    private String personhouse;
    private String personcommunity;
    private String personcity;

    public String getPersonhouse() {
        return personhouse;
    }

    public void setPersonhouse(String personhouse) {
        this.personhouse = personhouse;
    }

    public String getPersoncommunity() {
        return personcommunity;
    }

    public void setPersoncommunity(String personcommunity) {
        this.personcommunity = personcommunity;
    }

    public String getPersoncity() {
        return personcity;
    }

    public void setPersoncity(String personcity) {
        this.personcity = personcity;
    }
    
    public String getPersonName() {
        return personName;
    }
    
    public void setPersonName(String personName) {
        this.personName = personName;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public Patient getPatient() {
        return patient;
    }
    
    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    
    @Override
    public String toString()
    {
        return this.personName;
    }
}
