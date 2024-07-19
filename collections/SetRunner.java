package collections;

import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;
import java.util.LinkedHashSet;

public class SetRunner {
  public static void main(String[] args) {
    // Find Unique Characters from Characters List
    List<Character> characters = List.of('A', 'Z', 'A', 'B', 'Z', 'F');

    // Use HashSet, LinkedHashSet, TreeSet
    // HashSet will not maintain the order of insertion
    HashSet<Character> hashSetUniqChartacters = new HashSet<>(characters);
    System.out.println(hashSetUniqChartacters);

    // LinkedHashSet will maintain the order of insertion
    LinkedHashSet<Character> linkedHashSetUniqChartacters = new LinkedHashSet<>(characters);
    System.out.println(linkedHashSetUniqChartacters);

    // TreeSet will sort the characters
    TreeSet<Character> treeSetUniqChartacters = new TreeSet<>(characters);
    System.out.println(treeSetUniqChartacters);

    // TreeSet of random 5 numbers
    TreeSet<Integer> treeSetNumbers = new TreeSet<>(List.of(54, 12, 77, 48, 112));

    // TreeSet useful methods
    System.out.println(treeSetNumbers.first()); // first element in the set
    System.out.println(treeSetNumbers.last()); // last element in the set
    System.out.println(treeSetNumbers.headSet(48)); // elements less than 48
    System.out.println(treeSetNumbers.tailSet(48)); // elements greater than 48
    System.out.println(treeSetNumbers.higher(48)); // element higher than 48
    System.out.println(treeSetNumbers.lower(48)); // element lower than 48
    System.out.println(treeSetNumbers.ceiling(45)); // element greater than or equal to 48
    System.out.println(treeSetNumbers.floor(13)); // element less than or equal to 48
    System.out.println(treeSetNumbers.subSet(12, 77)); // elements between 12 and 77
  }
}
