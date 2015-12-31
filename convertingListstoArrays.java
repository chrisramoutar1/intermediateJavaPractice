/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lanceramoutar
 */
import java.util.*;

//public class convertingListstoArrays {
    public static void main (String[] args){
    String[] stuff = {"babies", "watermelon", "melons", "fudge"};
    LinkedList<String> thelist = new LinkedList<String>(Arrays.asList(stuff));
    
    thelist.add("pumpkinf");
    thelist.addFirst("firstthing");
    
    //convert back to an array
    
    stuff = thelist.toArray()(new String[thelist.size()]);
    for(String x: stuff)
        System.out.printf("%s", x);
    
    }
}
