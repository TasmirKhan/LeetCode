
import java.util.*;

class Solution {
    public int[] assignTasks(int[] servers, int[] tasks) {

        int n = servers.length;
        int m = tasks.length;

        int[] ans = new int[m];

        // Free servers: [weight, index]
        PriorityQueue<int[]> free = new PriorityQueue<>(
            (a, b) -> {
                if (a[0] != b[0])
                    return Integer.compare(a[0], b[0]);

                return Integer.compare(a[1], b[1]);
            }
        );

        // Busy servers: [freeTime, weight, index]
        PriorityQueue<long[]> busy = new PriorityQueue<>(
            (a, b) -> {
                int cmp = Long.compare(a[0], b[0]);

                if (cmp != 0) return cmp;

                cmp = Long.compare(a[1], b[1]);

                if (cmp != 0) return cmp;

                return Long.compare(a[2], b[2]);
            }
        );

        // Initially all servers are free
        for (int i = 0; i < n; i++) {
            free.offer(new int[]{servers[i], i});
        }

        long time = 0;

        for (int j = 0; j < m; j++) {

            // Time cannot move backwards
            time = Math.max(time, j);

            // Release all servers that have finished
            while (!busy.isEmpty() &&
                   busy.peek()[0] <= time) {

                long[] s = busy.poll();

                free.offer(new int[]{
                    (int) s[1],
                    (int) s[2]
                });
            }

            // If no server is free, advance time
            if (free.isEmpty()) {

                time = busy.peek()[0];

                // Release all servers finishing at this time
                while (!busy.isEmpty() &&
                       busy.peek()[0] <= time) {

                    long[] s = busy.poll();

                    free.offer(new int[]{
                        (int) s[1],
                        (int) s[2]
                    });
                }
            }

            // Select the best available server
            int[] server = free.poll();

            int weight = server[0];
            int index = server[1];

            ans[j] = index;

            // Calculate server's next available time
            long freeTime = time + tasks[j];

            // Move server into busy heap
            busy.offer(new long[]{
                freeTime,
                weight,
                index
            });
        }

        return ans;
    }
}
