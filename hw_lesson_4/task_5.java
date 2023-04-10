package HW_JAVA.hw_lesson_4;

import java.util.ArrayDeque;
import java.util.Deque;

public class task_5 {
    public static void main(String[] args) {
        Deque<Character> dq = new ArrayDeque<Character>();
        dq.addLast('(');
        dq.addLast(')');
        dq.addLast('[');
        dq.addLast(']');
        dq.addLast('{');
        dq.addLast('}');

    System.out.println(dq);
    int len = dq.size()/2 ;
    boolean flag = false;
    if (dq.getFirst().equals('(') || dq.getFirst().equals('[') || dq.getFirst().equals('{') ){
        for (int i = 0; i < len; i++) {
            if (dq.getFirst().equals('(') & dq.getLast().equals(')')) {
                dq.removeFirst();
                if(dq.getFirst().equals(')')) {
                    dq.removeFirst();
                }
                else 
                    dq.removeLast();
            }
            else if (dq.getFirst().equals('{') & dq.getLast().equals('}')) {
                dq.removeFirst();
                if(dq.getFirst().equals('}')) {
                    dq.removeFirst();
                }
                else 
                    dq.removeLast();
            }
            else if (dq.getFirst().equals('[') & dq.getLast().equals(']')) {
                dq.removeFirst();
                if(dq.getFirst().equals(']')) {
                    dq.removeFirst();
                }
                else 
                    dq.removeLast();
            }
            else if (dq.getFirst().equals('(')){
                dq.removeFirst();
                if (dq.getFirst().equals(')')){
                    dq.removeFirst();
                }
            }
            else if (dq.getFirst().equals('{')){
                dq.removeFirst();
                if (dq.getFirst().equals('}')){
                    dq.removeFirst();
                }
            }
            else if (dq.getFirst().equals('[')){
                dq.removeFirst();
                if (dq.getFirst().equals(']')){
                    dq.removeFirst();
                }
            }
        }
        if (dq.size() == 0) flag = true;            
    }
        System.out.println(flag);    
    }
}
