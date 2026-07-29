package java03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;


public class Collections {
    public static void main(String[] args) {
        // Code for Collections class
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.remove(2);

        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

        for(Integer i : list){
            System.out.println(i);
        }

        int i = 0 ; 
        while(i < list.size()){
            System.out.println(list.get(i));
            i++;
        }

        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        
        list.forEach(e -> System.out.println(e));
        list.forEach(System.out::println);

        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer i) {
                System.out.println(i);
            }
        });

    }
}
