class MyCircularQueue {
    int[] arr;
    int front,rear;
    public MyCircularQueue(int k) {
        arr=new int[k];
        front=-1;
        rear=-1;
    }

    public boolean isEmpty() {
         if(front==-1&&rear==-1)
         return true;
         return false;
    }
    
    public boolean isFull() {
        if(front==(rear+1)%arr.length)
        return true;
        return false;
        
    }
    public boolean enQueue(int value) {
        if(isFull())
        {
            return false;
        }
        if(isEmpty())
        {
            front++;
            rear++;
            arr[rear]=value;
            return true;
        }
        rear=(rear+1)%arr.length;
        arr[rear]=value;
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty())
        return false;
        if(front==rear)
        front=rear=-1;
        else
        front=(front+1)%arr.length;
        return true;
    }
    
    public int Front() {
        if(isEmpty())
        return -1;
        return arr[front];
    }
    
    public int Rear() {
        if(isEmpty())
        return -1;
        return arr[rear];
    }
    
    
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */