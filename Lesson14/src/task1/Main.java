package task1;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Set<Human> monsters = new HashSet<>();
    monsters.add(new Human("Max", 30));
    monsters.add(new Human("Sophia", 19));
    monsters.add(new Human("Yura", 19));
    monsters.add(new Human("Orest", 35));
    monsters.add(new Human("Valeria", 35));

    System.out.println("Unsorted Set:");
    System.out.println(monsters);

    SortedSet<Human> monsterSortedSet = new TreeSet<>(monsters);

    System.out.println("\nSorted TreeSet:");
    System.out.println(monsterSortedSet);

 
  }
}