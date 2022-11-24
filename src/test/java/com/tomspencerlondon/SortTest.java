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
  }

  private List<Integer> sort(List<Integer> list) {
    if (list.size() > 1) {
      if (list.get(0) > list.get(1)) {
        int first = list.get(0);
        int second = list.get(1);

        list.set(0, second);
        list.set(1, first);
      }
      return list;
    }

    return list;
  }
}
