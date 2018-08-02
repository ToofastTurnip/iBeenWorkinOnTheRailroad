# iBeenWorkinOnTheRailroad


This repo is for tests and notes.

ignore this:  
```java
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;

public class Line {
  public static String WhoIsNext(String[] names, int n) {
    if (n == 1) return names[0];
    List<String> temp = Arrays.asList(names);
    ArrayDeque<String> list = new ArrayDeque<>(temp);
    for (int i = 0; i < n; i++) {
      list.add(list.element());
      list.add(list.remove());
    }
    return list.element();
  }
}
```
