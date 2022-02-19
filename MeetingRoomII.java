//LC: 253
import java.util.*;

public class MeetingRooms{
    
    public static int noOfMeetingRooms(int [][]intervals){
        
        Arrays.sort(intervals,(a,b) -> a[0] - b[0]);
        PriorityQueue<Integer> queue = new PriorityQueue<>(intervals.length);
        int room = 0;
        for(int i=0;i<intervals.length;i++){
            queue.offer(intervals[i][1]);
            if(intervals[i][0] < queue.peek()){
                room++;
            }else{
                queue.poll();
            }
        }
        
        return room;
    }

     public static void main(String []args){
        int[][] intervals = {{7,10},{2,4}};
        System.out.println(noOfMeetingRooms(intervals));
        
    }
}
