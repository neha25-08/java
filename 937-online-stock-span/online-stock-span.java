import java.util.Stack;

class StockSpanner {
    private Stack<Integer> stack;
    private int[] prices;
    private int index;

    public StockSpanner() {
        stack = new Stack<>();
        prices = new int[10000]; // Increased to handle larger test cases
        index = 0;
    }

    public int next(int price) {
        while (!stack.isEmpty() && price >= prices[stack.peek()]) {
            stack.pop();
        }

        int span = stack.isEmpty() ? index + 1 : index - stack.peek();

        prices[index] = price;
        stack.push(index);
        index++;

        return span;
    }
}
