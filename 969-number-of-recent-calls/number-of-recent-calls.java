class RecentCounter {
        Queue<Integer> q;
    public RecentCounter() {
        q=new LinkedList<Integer>();
    }
    
    public int ping(int t) {
        q.add(t);
        while(t-q.peek()>3000)
        {
            q.remove();
        }
        return q.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */