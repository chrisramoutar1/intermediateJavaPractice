
public class moreString {
    //public static void main (String args[]){
        String s = "buckyrobertsbuckyroberts";
        System.out.println(s.indexOf('k'));
        //search for the first instance of k, 0 is always the first
        System.out.println(s.indexOf('k',5));
        //search after the first 5 letters
        System.out.println(s.indexOf('x',5));
        // no x so returns negative 1
        System.out.println(s.indexOf('x',5));
        System.out.println(s.indexOf("rob"));
        
        String a = "Bacon ";
        String b = "monster";
        System.out.println(a + b);
        //concat joins the string with another string of your choosing..
        System.out.println(a.concat(b));
        
        System.out.println(a.replace("B", "F"));
        System.out.println(b.toUpperCase());
        //turns all into upper
        
        String c = "   chris   " ;
        System.out.println(c.trim());
        //removes spaces
        
        
        


    }
}
