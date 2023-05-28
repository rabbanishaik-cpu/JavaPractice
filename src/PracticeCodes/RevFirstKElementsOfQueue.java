package PracticeCodes;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class RevFirstKElementsOfQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        int k=3;
        reverseFirstKElementsOfQ(queue,k);
        //System.out.println(queue);
    }

    private static void reverseFirstKElementsOfQ(Queue<Integer> queue, int k) {
        Queue<Integer> queue2 = new LinkedList<>();
//        if (queue2.size()<k)
//            return null;
        Stack<Integer> stack = new Stack<>();
        for (int i=0;i<k;i++){
            stack.push(queue.poll());
        }
        while (!stack.isEmpty()){
            queue2.add(stack.pop());
        }
        while (!queue.isEmpty()){
            queue2.add(queue.poll());
        }
        //return queue2;
        System.out.println(queue2);
    }
}
