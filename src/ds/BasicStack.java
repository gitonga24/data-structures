package ds;

import dsInterfaces.cardStackInterface;

//public class BasicStack <X> implements cardStackInterface {
    public class BasicStack <X>  {
        private X [] data;
        private int stackPointer;

        public BasicStack (){
            data = (X[]) new Object[1000];
            stackPointer = 0;
        }

        public void push (X newItem) {
            data[stackPointer++] = newItem;
            System.out.println(newItem + " has been pushed to the Stack");
        }

        public X pop(){
            if(stackPointer == 0) {
                throw new IllegalStateException("No more items on the stack");
            }

            return data[--stackPointer];
        }

        public boolean contains( X item){
            boolean found = false;

            for (int x=0; x<stackPointer; x++) {
                if (data[x].equals(item)) {
                    found = true;
                    break;
                }
            }
            return found;
        }

        public X access(X item){
             while(stackPointer > 0){
                X tempItem = pop();
                if(tempItem.equals(item)){
                    return tempItem;
                }
             }
                //if item is not found
                throw new IllegalStateException("Item " + item + " was not found");
            }

        public int size(){
            return stackPointer;
        }
}
