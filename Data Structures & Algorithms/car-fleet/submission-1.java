
class Solution {
    public int carFleet(int target, int[] position, int[] speed) {

        int n = position.length;

        // [position, speed]
        int[][] cars = new int[n][2];

        for (int i = 0; i < n; i++) {
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }

        // Sort by position: closest to target first
        Arrays.sort(cars, (a, b) -> b[0] - a[0]);

        int fleets = 0;
        double lastTime = 0;

        for (int i = 0; i < n; i++) {

            int pos = cars[i][0];
            int spd = cars[i][1];

            double time = (double)(target - pos) / spd;

            // This car cannot catch the fleet ahead
            if (time > lastTime) {
                fleets++;
                lastTime = time;
            }
        }

        return fleets;
    }
}