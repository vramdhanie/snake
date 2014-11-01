package com.vincentramdhanie.snake;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Tests for {@link Segment}.
 *
 * @author vramdhanie@gmail.com (Vincent Ramdhanie)
 */
public class SegmentTest {

    @Test
    public void noArgsConstructor() {
    	Segment s = new Segment();
    	assertEquals(2, 2);
    }

}
