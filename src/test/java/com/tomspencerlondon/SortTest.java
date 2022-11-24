package com.tomspencerlondon;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

public class SortTest {

  @Test
  void sortTest() {
    assertThat(sort(List.of())).isSorted();

    assertThat(sort(List.of(1))).isSorted();

    assertThat(sort(List.of(1, 2))).isSorted();

    assertThat(sort(List.of(2, 1))).isSorted();
  }

  private List<Integer> sort(List<Integer> list) {
    return list;
  }
}
