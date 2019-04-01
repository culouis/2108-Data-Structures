/**
 * Write a description of class Stacks here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.*;


public class ArrayStack<T> 
{
   private final int DEFAULT_CAPACITY = 10;
   private int top;  // indicates the next open slot
   private  T[] stack; 

   //-----------------------------------------------------------------
   //  Creates an empty stack using the default capacity.
   //-----------------------------------------------------------------
   public ArrayStack()
   {
      top = 0;
      stack = (T[])(new Object[DEFAULT_CAPACITY]);
   }

   //-----------------------------------------------------------------
   //  Creates an empty stack using the specified capacity.
   //-----------------------------------------------------------------
   public ArrayStack (int initialCapacity)
   {
      top = 0;
      stack = (T[])(new Object[initialCapacity]);
   }




   //-----------------------------------------------------------------
   //  Adds the specified element to the top of the stack, expanding
   //  the capacity of the stack array if necessary.
   //-----------------------------------------------------------------
   public void push (T element)
   {
      String element = element;
      T.push (element);
      
         
   }



   //-----------------------------------------------------------------
   //  Removes the element at the top of the stack and returns a
   //  reference to it. Throws an EmptyStackException if the stack
   //  is empty.
   //-----------------------------------------------------------------
   public T pop() throws EmptyStackException
   {
      if (isEmpty())
         throw new EmptyStackException();

      top--;
      T result = stack[top];
      stack[top] = null; 
 
      return result;
   }
   
   //-----------------------------------------------------------------
   //  Returns a reference to the element at the top of the stack.
   //  The element is not removed from the stack.  Throws an
   //  EmptyStackException if the stack is empty.  
   //-----------------------------------------------------------------
   public T peek() throws EmptyStackException
   {
       if (isEmpty())
         throw new EmptyStackException();
	

       return stack[top-1];
   }


  //-----------------------------------------------------------------
   //  Returns true if the stack is empty and false otherwise. 
   //-----------------------------------------------------------------
   public boolean isEmpty()
   {
	//write your code here
   if (T.isEmpty())
   {
      return true;
   }
   else{
      return false;
     }
   
   }
 

 
   //-----------------------------------------------------------------
   //  Returns the number of elements in the stack.
   //-----------------------------------------------------------------
   public int size()
   {
	//write your code here
      int length = 0;
      for(int i = 0; i < count; i++) {  
            T.pop());
            length++
      }
      return length;
   }

   //-----------------------------------------------------------------
   //  Returns a string representation of the stack. 
   //-----------------------------------------------------------------
   public String toString()
   {
      String result = "";

      //write your code here
      while(!T.isEmpty())
        {
            result = result + T.pop();
        }

      return result;
   }

   //-----------------------------------------------------------------
   //  Creates a new array to store the contents of the stack with
   //  twice the capacity of the old one.
   //-----------------------------------------------------------------
   private void expandCapacity()
   {
      T[] larger = (T[])(new Object[stack.length*2]);

      for (int index=0; index < stack.length; index++)
         larger[index] = stack[index];

      stack = larger;
   }
   
   public static String reverseWords(String sentence) {
   // write your code here
   push(sentence);

   }

   public static void main (String [] args)
   {
       System.out.print(reverseWords("The quick brown fox jumps over the lazy dog"));
   }

}
