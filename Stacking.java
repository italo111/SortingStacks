/************************************************************** 
            Purpose/Description: <This program has the objective of making 
            programs more efficient, by reducing its time complexity.
	    it uses 2 stacks to make the list in ascending order.
	    the time complexity of this program is O(n)> 
            Author’s Panther ID: <5660995>           
            Certification:  
            I hereby certify that this work is my own and none of it is
            the work of any other person.  
        **************************************************************/
package central;

import java.util.Stack;

public class Stacking {
    Stack <Integer> s1;
    Stack <Integer> s2;
    int min = 0;
    public Stacking(){
        s1 = new Stack<Integer>();
        s2 = new Stack<Integer>();
        
    }
    public void insert(int num){
        s1.push(num);
       
    }
    public void sort(){
        while(!s1.empty()){
            min = s1.pop();
            if(!s1.empty()){
                s2.push(s1.pop());
            }
            if(min > s2.peek()){
                s1.push(s2.pop());
                s2.push(min);
            }
            else{
                s2.push(min);
            }
        }
    }
    public void print(){
        while(!s2.empty()){
            System.out.print(s2.pop() + " ");
        }
    }
}
