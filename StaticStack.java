

public class StaticStack {
    
    private int sp;
    private int[] stackArray;
    
    public StaticStack(int size){
        sp=0;
        stackArray = new int[size];
        for (int i=0; i<stackArray.length; i++){
            stackArray[i]=-999;
        }
    }
    
    public boolean isEmpty(){
        if (sp==0)
            return true;
        else
            return false;
        
    }
    
    public boolean isFull(){
        if (sp==stackArray.length){
            return true;
        }
        else{
            return false;
        }
    }
    
    public void printStack(){
        for (int i=0; i<sp; i++){
            System.out.print(stackArray[i]+ " ");
        }
      System.out.println();
    }
    
    public void push(int data){
        if (isFull()==false){
            sp=data;
        sp++;
    }
        else{
             System.out.println("Stack is Full");
        } 
    }
    
    public int pop(){
        if (isEmpty()==false){
           sp--;
           return stackArray[sp];
        }
        else{
            System.out.println("The stack is empty");
            return -99999;
        }
    }
            
}
