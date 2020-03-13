public class Marks {
    public static void main(String[] args) {
        int marks =35;
// if .. else if ladder
        if(marks>=40 && marks<50 )
        System.out.println("Pass"); // f
        else if(marks>=50 && marks<60 ) // t
            System.out.println("Second class");
        else if(marks>=60 && marks<75 )
            System.out.println("First class");
        else   if(marks>=70  )
            System.out.println("Distinction");
           else
            System.out.println("Fail");


    }
}
