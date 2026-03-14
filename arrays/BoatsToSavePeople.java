package arrays;
import java.util.Arrays;

class BoatsToSavePeople {
    public int numRescueBoats(int[] people, int limit) {

        Arrays.sort(people);

        int left = 0;
        int right = people.length - 1;
        int boats = 0;

        while(left <= right) {

            if(people[left] + people[right] <= limit) {
                left++;   // pair lightest with heaviest
            }

            right--;      // heaviest always gets on a boat
            boats++;
        }

        return boats;
    }
}