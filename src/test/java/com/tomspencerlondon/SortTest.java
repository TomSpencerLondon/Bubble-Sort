package com.tomspencerlondon;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

public class SortTest {

  @Test
  void sortTest() {
    assertThat(sort(asList())).isSorted();
    assertThat(sort(asList(1))).isSorted();
    assertThat(sort(asList(1, 2))).isSorted();
    assertThat(sort(asList(2, 1))).isSorted();
    assertThat(sort(asList(1, 2, 3))).isSorted();
    assertThat(sort(asList(2, 1, 3))).isSorted();
    assertThat(sort(asList(1, 3, 2))).isSorted();
    assertThat(sort(asList(3, 2, 1))).isSorted();
    assertThat(sort(asList(3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5, 8, 9, 7, 9, 9, 9))).isSorted();
  }

  private List<Integer> sort(List<Integer> list) {
    if (list.size() > 1) {
      for (int limit = list.size() - 1; limit > 0; limit--) {
        for (int firstIndex = 0; firstIndex < limit; firstIndex++) {
          int secondIndex = firstIndex + 1;
          if (list.get(firstIndex) > list.get(secondIndex)) {
            int first = list.get(firstIndex);
            int second = list.get(secondIndex);

            list.set(firstIndex, second);
            list.set(secondIndex, first);
          }
        }
      }
    }

    return list;
  }
}
