import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] san = new int[50];
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i <50; i++) {
            san[i] = random.nextInt(0, 2);
            arrayList.add(random.nextInt(0, 2));
            linkedList.add(random.nextInt(0, 2));
        }
        sort1(arrayList);
        sort2(linkedList);
        sort3(san);
    }
   public static void sort1(ArrayList<Integer> arrayList) {
       Collections.sort(arrayList);
       System.out.println(arrayList);
   }
   public static void  sort2(LinkedList<Integer> linkedList){
        Collections.sort(linkedList);
       System.out.println(linkedList);
    }
    public static void sort3(int[] san) {
        Arrays.sort(san);
        System.out.println(Arrays.toString(san));
    }
    }

