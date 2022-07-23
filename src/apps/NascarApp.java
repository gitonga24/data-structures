package apps;

import ds.BasicQueue;
import ds.BasicStack;
import sdObjects.Nascar;

public class NascarApp {
    BasicQueue<Nascar> laneOne = new BasicQueue<Nascar>();
    BasicStack<Nascar> laneOneStack = new BasicStack<Nascar>();

    public  static void main (String[] args) {
        NascarApp race = new NascarApp();
        race.run();
    }

    public void run (){
        //declare objects of Nascar
        Nascar car1 = new Nascar("Toyota", "David");
        Nascar car2 = new Nascar("Ford", "Tom");
        Nascar car3 = new Nascar("BMW", "Michael");
        Nascar car4 = new Nascar("Honda", "James");

        //add to queue
        laneOne.enQueue(car1);
        laneOne.enQueue(car2);
        laneOne.enQueue(car3);
        laneOne.enQueue(car4);



        System.out.println("Number of cars on LaneOne: " + laneOne.size());

        //Accelerate
        car1.Accelerate(5);
        car2.Accelerate(10);
        car3.Accelerate(15);

        Nascar tempHolder = new Nascar();

        tempHolder = laneOne.deQueue();
        tempHolder = laneOne.deQueue();
        tempHolder = laneOne.deQueue();
        tempHolder = laneOne.deQueue();

        System.out.println("Number of cars on LaneOne: " + laneOne.size());

        //add to stack
        laneOneStack.push(car1);
        laneOneStack.push(car1);
        laneOneStack.push(car1);

        System.out.println("Size of Stack: " + laneOneStack.size());
    }

}
