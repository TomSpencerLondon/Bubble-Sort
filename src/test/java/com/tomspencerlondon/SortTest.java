package com.tomspencerlondon;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

public class SortTest {

  @Test
  void sortTest() {
    assertThat(sort(List.of())
        .equals(List.of()));
  }

  private List<Integer> sort(List<Integer> list) {
    return null;
  }
}
