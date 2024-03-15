import java.util.ArrayList;

public class App {
    public void executar() {
        ArrayList<Integer> l1 = new ArrayList<Integer>();
        l1.add(101);
        l1.add(102);
        l1.add(103);
        l1.add(104);
        l1.add(105);
        
        ArrayList<Integer> l2 = new ArrayList<Integer>();
        l2.add(1);
        l2.add(2);
        l2.add(3);
        l2.add(4);
        l2.add(5);
        l2.add(1);
        l2.add(2);
        l2.add(4);
        l2.add(5);

        ArrayList<Integer> l3 = new ArrayList<Integer>();
        l3.add(1);
        l3.add(2);
        l3.add(3);

        System.out.println("==============================");
        System.out.println("List 1:");
        System.out.println(l1);
        System.out.println("==============================");
        System.out.println("List 2:");
        System.out.println(l2);
        System.out.println("==============================");
        System.out.println("List 3:");
        System.out.println(l3);
        System.out.println("==============================");
        System.out.println("Método listRepeat:");
        System.out.println(listRepeat(l2));
        System.out.println("==============================");
        System.out.println("Método union:");
        System.out.println(union(l1, l2));
        System.out.println("==============================");
        System.out.println("Método intersect:");
        System.out.println(intersect(l1, l3));
        System.out.println("============================== \n");
    }

    ArrayList<Integer> listRepeat(ArrayList< Integer > l) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < l.size(); i++) {
            if (list.contains(l.get(i))) {
                list.add(l.get(i));
            }
        }
        return list;
    }

    ArrayList<Integer> union(ArrayList<Integer> l1, ArrayList<Integer> l2) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < l1.size(); i++) {
            if (!list.contains(l1.get(i))) {
                list.add(l1.get(i));
            }
        }
        for (int i = 0; i < l2.size(); i++) {
            if (!list.contains(l2.get(i))) {
                list.add(l2.get(i));
            }
        }
        return list;
    }

    ArrayList<Integer> intersect(ArrayList<Integer> l1, ArrayList<Integer> l2) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < l1.size(); i++) {
            if (l2.contains(l1.get(i))) {
                list.add(l1.get(i));
            }
        }
        return list;
    }
}
