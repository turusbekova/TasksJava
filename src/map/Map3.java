package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;

public class Map3 {
    public static void main(String[] args) {

        HashMap<Integer, String> pointsofstudents = new HashMap<>();
        pointsofstudents.put(100, "Kyial");
        pointsofstudents.put(75, "Kairat");
        pointsofstudents.put(50, "Salamat");
        pointsofstudents.put(35, "Aidos");
        pointsofstudents.put(5, "Bakyt");

        int points2 = 0;

        Iterator<Integer> itr = pointsofstudents.keySet().iterator();
        while (itr.hasNext()){
            int k = itr.next();
            if (points2 < k){
                points2 = k;
            }

//            else if (k <= 79 && k >= 60){
//                System.out.println(pointsofstudents.get(k) + " B");
//            }
//            else if (k <= 59 && k >= 40){
//                System.out.println(pointsofstudents.get(k) + " C");
//            }
//            else if (k <= 39 && k == 0){
//                System.out.println(pointsofstudents.get(k) + " D");
//            }
            }
            System.out.println(pointsofstudents.get(points2));
        }
    }

