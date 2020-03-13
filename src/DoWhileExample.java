public class DoWhileExample {
    public static void main(String[] args) {

        // do while loop

        int i=1;

        // once or first time the statements are
        // getting executed without checking the
        // condition (do while)

        do {
            System.out.println(i);
            i++;
        } while(i<=10);
//-------------------------------------------------
        while(i<=10) // first the condition is checked then the statements are executed
        {
            System.out.println(i);
            i++;
        }


    }
}
