public class Parametervaluecopy {
    public static void main(String[] args) {
        int number = 1;

        increment(number);

        System.out.println(number);
    }

    public static void increment(int number) {
        number = number + 3;
    }
}
/*
    একটা বাক্স কল্পনা করো

main()-এর মধ্যে একটা বাক্স আছে:

┌─────────────┐
│   number    │
│      1      │
└─────────────┘

এখন তুমি বললে:

increment(number);

Java ওই বাক্সটা method-এর কাছে দেয় না।

Java বাক্সের ভিতরের 1 নেয় এবং আরেকটা নতুন বাক্স বানায়:

main()                  increment()

┌─────────────┐         ┌─────────────┐
│   number    │         │   number    │
│      1      │         │      1      │
└─────────────┘         └─────────────┘

এখন খুব গুরুত্বপূর্ণ:

দুটো number আছে।

একটা main()-এর:

main number = 1

আরেকটা increment()-এর:

increment number = 1
এবার method-এর ভিতরে ঢুকি

এই code:

number = number + 3;

কোন number?

👉 increment-এর number

তাই:

increment number:

1 + 3
 ↓
4

এখন অবস্থা:

main()                  increment()

┌─────────────┐         ┌─────────────┐
│   number    │         │   number    │
│      1      │         │      4      │
└─────────────┘         └─────────────┘

main-এর number এখনও 1।

তারপর method শেষ
increment(number);

এই কাজ শেষ।

increment()-এর ভিতরের number আর দরকার নেই।

তাই আমরা আবার main()-এ আসি:

System.out.println(number);

এখানে কোন number?

👉 main-এর number

আর সেটা এখনও:

1

তাই output:

1
সবচেয়ে সহজ ভাষায়

এই দুইটা number এক জিনিস না:

main() {
    int number = 1;        // number #1

    increment(number);
}

increment(int number) {   // number #2
    number = number + 3;
}

এভাবে মনে রাখো:

number #1 = 1

       ↓ value দেওয়া হলো

number #2 = 1

       ↓ +3

number #2 = 4

       ↓ method শেষ

number #2 চলে গেল

       ↓

number #1 এখনও 1
তাই output = 1

*/

/*
আগের code-এ number-কে সত্যিই increment করতে চাইলে Java-তে সবচেয়ে সহজ উপায় হলো return করা।

তোমার original code ছিল:

int number = 1;

increment(number);

System.out.println(number);

এটা বদলে করো:

public class Parametervaluecopy {
    public static void main(String[] args) {
        int number = 1;

        number = increment(number);

        System.out.println(number);
    }

    public static int increment(int number) {
        number = number + 3;
        return number;
    }
}

Output:

4
কী হচ্ছে?

প্রথমে:

number = 1

তারপর:

number = increment(number);

মানে:

increment(1)
     ↓
1 + 3
     ↓
4
     ↓
return 4
     ↓
number = 4

তারপর:

System.out.println(number);

তাই:

4
আরও ছোট করে

তুমি চাইলে method-টা এমনও লিখতে পারো:

public static int increment(int number) {
    return number + 3;
}

তারপর:

number = increment(number);

এটাই Java-তে তোমার এই situation-এর সাধারণ সমাধান।
*/
