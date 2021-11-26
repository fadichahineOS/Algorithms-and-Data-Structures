
import java.util.Arrays;

public class Stack {


    public int[] stack;

    Stack(int size){
        stack = new int[size];
    }

    int add(int number){
        int i = 1;

        if(stack[0] == 0){
            stack[0] = number;
        } else {
            while(i < (stack.length - 1) && stack[i] != 0){
                i++;
            }
            stack[i] = number;
        }

        return 0;
    }

    int remove(){
        int i = stack.length-2;
        if(stack[stack.length-1] != 0){
            stack[stack.length-1] = 0;
        } else {
            while(i > -100 && stack[i] == 0 && i !=0){
                i--;
            }
            stack[i] = 0;
        }

        return i;

    }

    public static void main(String[] args){
        Stack stack = new Stack(100);
        System.out.println(stack.stack.length);

        stack.add(5);
        stack.add(100);
        stack.add(10000);


        System.out.println(Arrays.toString(stack.stack));

        stack.remove();
        stack.remove();
        stack.remove();
        stack.remove();

        System.out.println(Arrays.toString(stack.stack));

    }
}
