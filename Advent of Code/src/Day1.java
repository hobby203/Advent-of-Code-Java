/**
 * Code for Day 1 for adventofcode.com
 */
public class Day1 {
    private int current_floor;
    public Day1(){
        current_floor = 0;
    }

    public int final_floor(String directions){
        current_floor = 0;
        for (int i=0; i < directions.length(); i++) {
            get_next_floor(directions.charAt(i));
        }
        return current_floor;
    }

    public int first_basement(String directions){
        current_floor = 0;
        boolean found = false;
        int index = 0;
        while (!found){
            get_next_floor(directions.charAt(index));
            if (current_floor == -1){
                found = true;
            }
            index++;
        }
        return index;
    }

    private void get_next_floor(Character c){
        if (c == ')') {
            current_floor--;
        } else {
            current_floor++;
        }
    }
}
