public class Test {
    public static void main(String[] args) {
        
        ArrayList a = new ArrayList();
        //add numbers to the array
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        a.add(6);
        a.add(7);
        a.add(8);
        a.add(9);
        a.add(1,6);
        a.remove(5);
        
        //print each number in the array
        for(int i = 0; i < a.size()-1; i ++){
            System.out.print(a.get(i));    
        }
        System.out.println(a.get(a.size()-1));
        
        //print the size of the array
        System.out.println(a.size());
        //print if the array is empty
        System.out.println(a.isEmpty());
        


        
    }
}


//make the stack
        //Stack s = new Stack();
        //s.push(1);
        //s.push(5);
        //s.push(-7);
        //s.push(1);
        //s.push(20);
        //s.push(-6);
        //s.push(9);

        //System.out.println(s.peek());
        //s.pop();
        //System.out.println(s.peek());