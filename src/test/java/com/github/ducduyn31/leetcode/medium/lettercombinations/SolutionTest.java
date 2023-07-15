package com.github.ducduyn31.leetcode.medium.lettercombinations;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution;


    @BeforeEach
    void setup() {
        solution = new Solution();
    }

    @ParameterizedTest
    @CsvSource(textBlock = """
            '', ''
            23, 'ad, ae, af, bd, be, bf, cd, ce, cf'
            2, 'a, b, c'
            234, 'adg, adh, adi, aeg, aeh, aei, afg, afh, afi, bdg, bdh, bdi, beg, beh, bei, bfg, bfh, bfi, cdg, cdh, cdi, ceg, ceh, cei, cfg, cfh, cfi'
            2345, 'adgj, adgk, adgl, adhj, adhk, adhl, adij, adik, adil, aegj, aegk, aegl, aehj, aehk, aehl, aeij, aeik, aeil, afgj, afgk, afgl, afhj, afhk, afhl, afij, afik, afil, bdgj, bdgk, bdgl, bdhj, bdhk, bdhl, bdij, bdik, bdil, begj, begk, begl, behj, behk, behl, beij, beik, beil, bfgj, bfgk, bfgl, bfhj, bfhk, bfhl, bfij, bfik, bfil, cdgj, cdgk, cdgl, cdhj, cdhk, cdhl, cdij, cdik, cdil, cegj, cegk, cegl, cehj, cehk, cehl, ceij, ceik, ceil, cfgj, cfgk, cfgl, cfhj, cfhk, cfhl, cfij, cfik, cfil'
            """)
    void letterCombinations_should_return_the_total_combination(String digits, String expected) {
        var expectedList = expected.length() == 0 ? Collections.emptyList() : Arrays.asList(expected.split(", "));
        var actual = solution.letterCombinations(digits);
        assertIterableEquals(expectedList, actual);
    }
}
