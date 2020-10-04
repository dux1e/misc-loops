/**
 * Class to demonstrate some properties of different loops
 *
 * @author (FEN)
 * @version (2019-09-17)
 */
import java.util.ArrayList;
import java.util.Iterator;
public class ListOfStrings{
    private ArrayList<String> strings;

    public ListOfStrings(){
        strings= new ArrayList<>();
    }

    public ListOfStrings(int noOfStrings){
        strings= new ArrayList<>();
        //Some code that puts some strings in the list
        // int i= 0;
        // while(i < noOfStrings){
        // strings.add("Word " + (i+1));
        // i++;
        // }

        //rewrite using a classic for-loop
        for(int i= 0; i<noOfStrings; i++){
            strings.add("Word " + (i+1));
        }
        //and a very long string
        strings.add("and a very long string");
    }

    public void addWord(String newWord){
        strings.add(newWord);
    }

    public void printStrings(){
        for(String s : strings){
            System.out.println(s);
        }
        System.out.println();
        System.out.println("Done printing strings...");
    }

    public void printStrings2(){
        //use a classic for-loop loop           
        //Code here:
        for(int i = 0; i < strings.size(); i++) {
            String s = strings.get(i);
            System.out.println(s);
        }

        System.out.println();
        System.out.println("Done printing strings...");
    }

    public void printStringsIterator(){
        Iterator<String> it= strings.iterator();
        while(it.hasNext()){
            String s= it.next();
            System.out.println(s);
        }

        System.out.println();
        System.out.println("Done printing strings...");
    }

    public void printStrings3(int n){
        //Print only the n first strings
        //use a classic for loop

        //Code here:
        for(int i = 0; (i < strings.size() && i < n); i++) {
            String s = strings.get(i);
            System.out.println(s);
        }

        System.out.println();
        System.out.println("Done printing strings...");
    }

    public void printStrings4(int firstIncl, int lastExcl){
        //Print only the strings between firstIncl and lastExcl
        //use a classic for loop

        //Code here:
        for(int i = firstIncl; i < strings.size() && i < lastExcl; i++) {
            String s = strings.get(i);
            System.out.println(s);
        }

        System.out.println();
        System.out.println("Done printing strings...");
    }

    public void printLongStrings(int len){
        //Print the only strings that are longer than len
        //use while and iterator

        //Code here:
        Iterator<String> it = strings.iterator();
        while(it.hasNext()) {
            String s = it.next();
            if(s.length() > len) {
                System.out.println(s);
            }
        }

        System.out.println();
        System.out.println("Done printing strings...");
    }    

    public void printStringsBeginsWith(char c){
        //Print the only strings that begins with c
        //use while and iterator

        //Code here:
        Iterator<String> it = strings.iterator();
        while(it.hasNext()) {
            String s = it.next();
            if(s.substring(0).equals(c)) {
                System.out.println(s);
            }
        }

        System.out.println();
        System.out.println("Done printing strings...");
    }

    public void searchAndPrint(String key){
        //Print the first string that is equal to key and its position
        //use a search pattern (while)

        //Code here:
        int i = 0;
        boolean found = false;
        while(i < strings.size() && !found) {
            String s = strings.get(i);
            if(s.equalsIgnoreCase(key)) {
                found = true;
            } else {
                i++;
            }
            if(found) {
                System.out.println(s);
            }
        }

        System.out.println();
        System.out.println("Done printing strings...");
    }

    public void printNoOfStringsWithLen(int len){
        //Print the number of strings with length()==len
        //use classic for-loop

        //Code here:
        for(int i = 0; i < strings.size(); i++) {
            String s = strings.get(i);
            if(s.length() == len) {
                System.out.println(s);
            }
        }

        System.out.println();
        System.out.println("Done printing strings...");
    }

    public void printLongestString(){
        //Print the longest string, its length and its position
        //use classic for-loop

        //Code here:
        int maxI = 0;
        String maxLength = strings.get(0);
        for(int i = 0; i < strings.size(); i++) {
            String s = strings.get(i);
            if(maxLength.length() < s.length()) {
                maxLength = s;
                maxI = i;
            }
        }
        String s = strings.get(maxI);

        System.out.println("The longest string is: " + s);
        System.out.println("The length of the string is: " + s.length());
        System.out.println("The string is on index: " + maxI);

        System.out.println();
        System.out.println("Done printing strings...");
    }
}
