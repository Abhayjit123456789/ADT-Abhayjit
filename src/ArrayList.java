public class ArrayList{
   private int[] nums;
   private int amountNums;
       
   public ArrayList(){
      this.amountNums = 0;
      this.nums = new int[5];
      
   }

   

   
   public void add(int element){

      //if the amount of numbers = the array length double the array
      if(amountNums == nums.length){
         // make a new array twice the size
         int[] bigger = new int[this.nums.length * 2];
         //copy everything across
         for(int i = 0; i < this.nums.length; i++){
             bigger[i] = this.nums[i];
         }
         //make the bigger array the actual item array
         this.nums = bigger;
        }
      //make the element the number for the array spot
      this.nums[this.amountNums] = element;
      //increase the variable that tracks the amount of numbers in the array
      this.amountNums ++;

   }      

   public void add(int index, int element){

      //if the amount of numbers = the array length double it
      if(amountNums == nums.length){
       // make a new array twice the size
       int[] bigger = new int[this.nums.length * 2];
       //copy everything across
       for(int i = 0; i < this.nums.length; i++){
           bigger[i] = this.nums[i];
       }
       //make the bigger array the actual item array
       this.nums = bigger;
      }
      //create another array to be 1 bigger then the original
      int[] tempArray = new int[this.nums.length + 1];
      //move values from the original array to the new array up to the index
      for(int i = 0; i < index; i++){
         tempArray[i] = nums[i];
      }
      //add the number to specific index spot
      tempArray[index] = element;
      //move the rest of the values from the original array to the new array
      for(int i = index + 1; i < tempArray.length; i++){
         tempArray[i] = nums[i-1];
      }
      // make the new array the actual array
      nums = tempArray;

   }

   public int get(int index){
      return nums[index];
   }

   public int remove(int index){
       
      //make a new array
      int[] removeArray = new int[this.nums.length];

      //copy the original array values to the new array up to the index
      for(int i = 0; i < index; i++){
         removeArray[i] = this.nums[i];
      }
      //skip over the index and copy the rest of the values
      for(int i = index; i < this.nums.length - 1; i++){
         removeArray[i] = this.nums[i + 1];
      }
      //make the new array the actuall array
      this.nums = removeArray;

      this.amountNums --;

      return index;
   }

   public int size(){
      return this.amountNums + 1;
   }

   public boolean isEmpty(){
      return this.amountNums == 0;
   }

}