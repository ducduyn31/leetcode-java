package com.github.ducduyn31.leetcode.medium.wordbreak;

import java.util.HashMap;
import java.util.List;

public class Solution {

    private static class TrieNode extends HashMap<Character, TrieNode> {
        boolean isWord = false;

        @Override
        public boolean equals(Object o) {
            return super.equals(o);
        }
    }

    public boolean wordBreak(String s, List<String> wordDict) {
        if (s.length() == 0) return true;

        var trie = buildWordDict(wordDict);

        var wordBreakPoints = new boolean[s.length()];

        for (var breakPoint = 0; breakPoint < s.length(); breakPoint++) {
            if (breakPoint == 0 || wordBreakPoints[breakPoint - 1]) {
                var currentNode = trie;

                for (var index = breakPoint; index < s.length(); index++) {
                    if (!currentNode.containsKey(s.charAt(index))) break;

                    if (currentNode.get(s.charAt(index)).isWord) wordBreakPoints[index] = true;

                    currentNode = currentNode.get(s.charAt(index));
                }
            }
        }

        return wordBreakPoints[wordBreakPoints.length - 1];
    }

    private TrieNode buildWordDict(List<String> wordDict) {
        var root = new TrieNode();

        for (var word : wordDict) {
            var currentNode = root;
            for (var c : word.toCharArray()) {
                var nextNode = currentNode.getOrDefault(c, new TrieNode());
                currentNode.put(c, nextNode);
                currentNode = nextNode;
            }
            currentNode.isWord = true;
        }

        return root;
    }
}
