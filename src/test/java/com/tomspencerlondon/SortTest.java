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
  }

  private List<Integer> sort(List<Integer> list) {
    if (list.size() > 1) {
      for (int firstIndex = 0; firstIndex < list.size() - 1; firstIndex++) {

        int secondIndex = firstIndex + 1;
        if (list.get(firstIndex) > list.get(secondIndex)) {
          int first = list.get(firstIndex);
          int second = list.get(secondIndex);

          list.set(firstIndex, second);
          list.set(secondIndex, first);
        }
      }
    }

    return list;
  }
}
