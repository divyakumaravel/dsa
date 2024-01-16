package com.example.practice.problems.arrays;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class GroupValidAnagramTest {

    GroupValidAnagram groupValidAnagram = new GroupValidAnagram();

    @Test
    void shouldReturnListOfEmptyString() {
        List<List<String>> anagrams = groupValidAnagram.groupAnagram(new String[]{""});
        Assertions.assertThatList(anagrams).isEqualTo(List.of(List.of("")));
    }

    @Test
    void shouldReturnListOfSingleString() {
        List<List<String>> anagrams = groupValidAnagram.groupAnagram(new String[]{"a"});
        Assertions.assertThatList(anagrams).isEqualTo(List.of(List.of("a")));
    }

    @Test
    void shouldReturnListOfAnagramGroups() {
        List<List<String>> anagrams = groupValidAnagram.groupAnagram(new
                String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
        Assertions.assertThat(anagrams).containsExactlyInAnyOrder(
                List.of("bat"), List.of("eat", "tea", "ate") , List.of("tan", "nat"));

    }
}