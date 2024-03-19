package adobeInterview;


import java.util.*;

/**
 * @Data
 * public class TreeNode {
 *     int data;
 *     TreeNode left;
 *     TreeNode right;
 * }
 */


public class DistanceBetween {

    public int findDistance(TreeNode root, int ele1, int ele2){
        List<Integer> track1 = getTrack(root, ele1);
        List<Integer> track2 = getTrack(root, ele2);
        for(int i=0; i<Math.min(track1.size(), track2.size()); i++){
            // find first disimilar the pic one previous to it
        }


        return 0;
    }

    private List<Integer> getTrack(TreeNode root, int ele) {
        Stack<Integer> track = new Stack<>();
        trackFinder(root, ele, track);
        ArrayList<Integer> finalTrack = new ArrayList<>(track);
        Collections.reverse(finalTrack);
        return finalTrack;
    }

    private boolean trackFinder(TreeNode root, int ele, Stack<Integer> temp) {
        if(Objects.isNull(root)){
            return false;
        }

        temp.push(root.getData());

        if(root.getData() == ele){
            return true;
        }


        if(trackFinder(root.getLeft(), ele, temp)){
            return true;
        }


        if(trackFinder(root.getRight(), ele, temp)){
            return true;
        }

        temp.pop();

        return false;
    }


    public static void main(String[] args) {
        System.out.println("hello");
    }
}
