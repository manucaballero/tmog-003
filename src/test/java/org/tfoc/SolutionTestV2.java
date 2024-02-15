package org.tfoc;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Slf4j
class SolutionTestV2 {

    @Test
    void testSolutionExample1() {

        Integer[] input = {-2,1,-3,4,-1,2,1,-5,4};
        Integer result = Solution.maxSubArrayV2(input);
        assertEquals(6,result);
    }

    @Test
    void testSolutionExample2() {

        Integer[] input = {1};
        Integer result = Solution.maxSubArrayV2(input);
        assertEquals(1,result);
    }

    @Test
    void testSolutionExample3() {

        Integer[] input = {5,4,-1,7,8};
        Integer result = Solution.maxSubArrayV2(input);
        assertEquals(23,result);
    }

}