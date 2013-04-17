package org.cloudbeers.basic;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

/**
 * @author stephenc
 * @since 17/04/2013 15:22
 */
public class PairTest {
    @Test
    public void smokes() throws Exception {
        assertThat(new Pair(1,2), is(new Pair(1,2)));
    }
}
