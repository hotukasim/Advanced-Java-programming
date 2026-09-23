/*
    Method = কোনো কাজ করার জন্য আলাদা করে রাখা named code block।
    একই কাজ বারবার করতে হলে code duplicate না করে method বানাও।
    Method main-এর বাইরে, কিন্তু class-এর ভিতরে থাকবে।
    void = method কিছু return করবে না।
    Method-কে বাইরে থেকে data দিতে চাইলে parameter ব্যবহার করো।


    void → কিছু return করে না

    int → int return করে
    double → double return করে
    String → String return করে

    

*/

public class Custommethod {
    public static void main(String[] args){
        System.out.println("kire ki khobor!??");

        method();

        System.out.println("kire bro ki kbr");
        
        method();
        method();
    }

    public static void method(){
        System.out.println("kasem boddo valo manush");
    }
}
