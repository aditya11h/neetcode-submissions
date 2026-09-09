
class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        int n = hand.length;
        if (n % groupSize != 0) return false;

        Arrays.sort(hand);
        Map<Integer, Integer> count = new HashMap<>();
        for (int card : hand) {
            count.put(card, count.getOrDefault(card, 0) + 1);
        }

        for (int card : hand) {
            if (count.get(card) == 0) continue; // already used

            // try to form a group starting at card
            for (int i = 0; i < groupSize; i++) {
                int curr = card + i;
                if (count.getOrDefault(curr, 0) == 0) {
                    return false;
                }
                count.put(curr, count.get(curr) - 1);
            }
        }
        return true;
    }
}