class StockSpanner {

    int i;
    int x=0;
    static Stack<Integer> sc;
    static int[] arr;
    public StockSpanner() {
        sc=new Stack<>();
        arr=new int[10000];
        i=0;
    }
   
    public int next(int price) {
        
        while(!sc.isEmpty()&&price>=arr[sc.peek()])
        {
            sc.pop();
        }
         if(sc.isEmpty())
        {
             x=i+1;
        }
        else
        x=i-sc.peek();
        arr[i]=price;
        sc.push(i);
        i++;
        return x;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */