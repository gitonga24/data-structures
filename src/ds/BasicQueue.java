package ds;

import dsInterfaces.BasiQueueInterface;

public class BasicQueue <X> {
    private X[] data;
    private int front;
    private int end;

    public BasicQueue(){
        this(1000);
    }

    public BasicQueue(int size){
        this.front = -1;
        this.end = -1;
        data = (X[])new Object[size];
    }

    public int size() {
        //if the queue is empty return 0
        if(front == -1 && end == -1) {
            return 0;
        }
        //otherwise we add one to get inclusive subtraction value rather than excluding
        else {
            return end - front +1;
        }
    }


    public void enQueue(X item){
        //test if queue is full.
        if((end + 1) % data.length == front){
            throw new IllegalStateException("The queue is full");
        }
        //otherwise check if queue is empty
        else if (size()==0){
            front++;
            end++;
            data[end] = item;
            System.out.println(item + " Has been onboarded as the 1st item in the queue");
        }
        //otherwise add item to the end of queue
        else {
            end++;
            data[end] = item;
            System.out.println(item + " Has been onboarded");
        }
    }

    public X deQueue(){
        //test is queue is empty
        X temp = null;
        if(size() == 0) {
            throw new IllegalStateException("The queue is empty");
        }
        //check if que has only 1 item.
       else if (front == end) {
        temp = data[front];
        data[front] = null;
        front = -1;
        end = -1;
        }

        else {
            temp = data[front];
            data[front] = null;
            front++;
        }
        System.out.println(temp + "Has been offloaded");
        return temp;
    }





    public X access(int position){
        //check if queue is empty
        if(size()== 0 || position > size()){
            throw new IllegalStateException("The que is empty or position is greater than que size");
        }

        for(int i = front; i<position; i++){
            
        }

        X temp = null;
        return data[position--];

    }

    public boolean contains(X item){
        boolean result = false;
        //test if queue is empty
        if(size() == 0){
            return false;
        }

        for(int i=front; i<end; i++){
            if (data[i].equals(item)) {
                result = true;
                break;
            }
        }

        return result;
    }

  /*  public X accessX (int position){
        X temp = null;
        //test if que is empty
        if(size() == 0 || position > size()){
           throw new IllegalStateException("The queue is empty or position is out of range");
        }


        //iterate through the que
        while(front < position){
            if(front == position){
                return data[position];
            }
            front++;
        }
        throw new IllegalStateException("Could not get queue item at position: " + position);
    }
    */

}
