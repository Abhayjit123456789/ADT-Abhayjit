public class Stack {
    private int[] items;
    private int numItems;

    public Stack(){
        this.numItems = 0;
        this.items = new int[5];

    }
    
    private void makeArrayBigger(){
        // make a new array twice the size
        int[] bigger = new int[this.items.length * 2];
        //copy everything across
        for(int i = 0; i < this.items.length; i++){
            bigger[i] = this.items[i];
        }
        //make the bigger array the actual item array
        this.items = bigger;
    }

    public void push(int item){
        //do we have room?
        if(this.numItems == this.items.length){
            // run out of room, make it bigger
            this.makeArrayBigger();
        }
        // add in the item
        this.items[this.numItems] = item;
        // increase the item count
        this.numItems ++;    

    }

    public int size(){
        return this.numItems;
    }

    public boolean isEmpty(){
        return this.numItems == 0;
    }

    public int peek(){
        return this.items[this.numItems - 1];
    }

    public int pop(){
        //get the item on top
        int topNum = this.peek();
        //remove it from the last spot
        this.numItems--;
        this.items[this.numItems] = 0;
        //return the top item
        return topNum;
    }
}
//pop() removes top item
//peek() looks at the top item
//push(item) add item to the top
//size() how many items
//isEmpty() is it empty
//Stack() initializes 
//get index, kind of like peek
//add(item) is like push
//add(index,item) is like insert
//
