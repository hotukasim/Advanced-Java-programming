import java.util.ArrayList;
public class Arraylist {
    public static void main(String[] args){
        ArrayList<String> bros = new ArrayList<>();

        bros.add("rafi");
        bros.add("kafi");
        bros.add("dafi");
        bros.add("mafi");



        for(int i = 0; i < bros.size(); i++){
            System.out.println(bros.get(i));
        }

        System.out.println(bros.get(1));
    }
}
