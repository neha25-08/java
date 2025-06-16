

class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int totalTime = 0;
        int targetTickets = tickets[k];

        for (int i = 0; i < tickets.length; i++) {
            // If the person is before or at position k
            if (i <= k) {
                totalTime += Math.min(tickets[i], targetTickets);
            } else {
                // If the person is after k, they can only buy at most targetTickets - 1 times
                totalTime += Math.min(tickets[i], targetTickets - 1);
            }
        }

        return totalTime;
    }
}
