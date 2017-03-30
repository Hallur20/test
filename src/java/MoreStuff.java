/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hvn15
 */
public class MoreStuff {
    private String name;
    private int age;
    private String email;

    public MoreStuff(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    @Override
    public String toString() {
        return "MoreStuff{" + "name=" + name + ", age=" + age + ", email=" + email + '}';
    }
    
    
    
}
