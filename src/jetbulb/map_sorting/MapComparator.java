package jetbulb.map_sorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MapComparator {
  public static void main(String[] args) {
    Map<String, Integer> nonSortedMap = Map.of(
            "Two", 2,
            "Three", 3,
            "Five", 5,
            "One", 1,
            "Four", 4
    );

//    Map<String, Integer> sortedMap = sortByValue(nonSortedMap);
//    Map<String, Integer> sortedMap = sortByValue2(nonSortedMap);
//    sortedMap.entrySet().forEach(System.out::println);
    nonSortedMap.entrySet().stream()
            .sorted(Map.Entry.comparingByValue())
            .forEach(System.out::println);
  }

  private static Map<String, Integer> sortByValue2(Map<String, Integer> nonSortedMap) {
    Comparator<String> comparator = new ValueComparator(nonSortedMap);
    TreeMap<String, Integer> sorted = new TreeMap<>(comparator);
    sorted.putAll(nonSortedMap);
    return sorted;
  }

  private static LinkedHashMap<String, Integer> sortByValue(Map<String, Integer> nonSortedMap) {
    List<Map.Entry<String, Integer>> list = new ArrayList<>(nonSortedMap.entrySet());
    list.sort(Map.Entry.comparingByValue());

    LinkedHashMap<String, Integer> sorted = new LinkedHashMap<>();
    for (Map.Entry<String, Integer> entry : list) {
      sorted.put(entry.getKey(), entry.getValue());
    }

    return sorted;
  }

  static class ValueComparator implements Comparator<String> {
    Map<String, Integer> base;

    public ValueComparator(Map<String, Integer> base) {
      this.base = base;
    }

    @Override
    public int compare(String s1, String s2) {
      return base.get(s1) - base.get(s2);
    }
  }

}
