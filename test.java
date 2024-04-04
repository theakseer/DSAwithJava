import java.util.ArrayList;
import java.util.Iterator;

// import javax.swing.text.html.HTMLDocument.Iterator;

public class test {
    public static void main(String[] args) {
        DynamicArray<String> arr = new DynamicArray<String>();
        ArrayList<String> fruits = new ArrayList<String>();
        arr.add("HEllo");
        arr.add("two");
        fruits.add("mango");
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("pineapple");
        fruits.add("orange");
        System.err.println(fruits.get(4));
        java.util.Iterator<String> it = fruits.iterator(); //

        /* for list and dynamic array
         while (it.hasNext()) {
            String ele = it.next();
            System.err.println(ele);
        } */
        // for stack
        Stack<String> stack = new Stack<String>();
        stack.push("I");
        stack.push("am");
        stack.push("stack");
        stack.pop();
        Iterator<String> s_it = stack.iterator();
        while (s_it.hasNext()) {
            String s = s_it.next();
            System.out.println(s);
            
        }
    }
}
