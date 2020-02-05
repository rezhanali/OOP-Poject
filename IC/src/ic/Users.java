/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ic;

/**
 *
 * @author Dell
 */
public class Users {   
protected String Place;
protected int Contact;
protected String BussinessType;
public void ActiveUsers(int contact,String Place){
    System.out.println("This is normal user ");
}
public void ActiveUsers(int contact,String Place,String BussinessType){
    System.out.println("this is a"+BussinessType+"'s Network");
}
}
