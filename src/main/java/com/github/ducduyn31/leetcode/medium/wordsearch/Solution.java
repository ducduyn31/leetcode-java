package com.github.ducduyn31.leetcode.medium.wordsearch;

import java.util.*;

public class Solution {

    private static class CharPosition {
        int row;
        int col;

        CharPosition(int row, int col) {
            this.row = row;
            this.col = col;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CharPosition) {
                return ((CharPosition) obj).col == col && ((CharPosition) obj).row == row;
            }
            return false;
        }

        @Override
        public int hashCode() {
            return Objects.hash(row, col);
        }
    }

    Map<Character, Integer> boardCounter = new HashMap<>();
    Map<Character, Integer> wordCounter = new HashMap<>();
    Map<Character, List<CharPosition>> startPositions = new HashMap<>();

    public boolean exist(char[][] board, String word) {
        var sb = new StringBuilder(word);
        this.countBoard(board, sb);
        this.countWord(sb);

        for (var entry : wordCounter.entrySet()) {
            if (boardCounter.getOrDefault(entry.getKey(), 0) < entry.getValue()) {
                return false;
            }
        }

        if (boardCounter.get(sb.charAt(0)) > boardCounter.get(sb.charAt(sb.length() - 1))) {
            sb.reverse();
        }

        for (var startPosition : startPositions.get(sb.charAt(0))) {
            var matched = this.searchWord(new HashSet<>(), startPosition, board, sb);
            if (matched) return true;
        }

        return false;
    }

    private boolean searchWord(Set<CharPosition> seen, CharPosition position, char[][] board, StringBuilder word) {
        if (seen.size() == word.length()) return true;
        if (seen.contains(position)) return false;

        var row = position.row;
        var col = position.col;

        if (board[row][col] != word.charAt(seen.size())) return false;

        seen.add(position);

        var nextCandidates = new ArrayList<CharPosition>();

        if (row > 0) nextCandidates.add(new CharPosition(row - 1, col));
        if (row < board.length - 1) nextCandidates.add(new CharPosition(row + 1, col));
        if (col > 0) nextCandidates.add(new CharPosition(row, col - 1));
        if (col < board[0].length - 1) nextCandidates.add(new CharPosition(row, col + 1));

        for (var candidate : nextCandidates) {
            if (this.searchWord(seen, candidate, board, word)) return true;
        }

        var matched = seen.size() == word.length();
        seen.remove(position);
        return matched;
    }

    private void countWord(StringBuilder word) {
        for (var i = 0; i < word.length(); i++) {
            var currentChar = Character.valueOf(word.charAt(i));
            this.wordCounter.put(currentChar, this.wordCounter.getOrDefault(currentChar, 0) + 1);
        }
    }

    private void countBoard(char[][] board, StringBuilder word) {
        for (var row = 0; row < board.length; row++) {
            for (var col = 0; col < board[0].length; col++) {
                var currentChar = Character.valueOf(board[row][col]);
                this.boardCounter.put(currentChar, this.boardCounter.getOrDefault(currentChar, 0) + 1);
                if (currentChar == word.charAt(0) || currentChar == word.charAt(word.length() - 1)) {
                    var positions = this.startPositions.getOrDefault(currentChar, new ArrayList<>());
                    positions.add(new CharPosition(row, col));
                    this.startPositions.put(currentChar, positions);
                }
            }
        }
    }
}
