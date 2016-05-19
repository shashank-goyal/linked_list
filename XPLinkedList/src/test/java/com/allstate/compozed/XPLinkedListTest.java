package com.allstate.compozed;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.*;

/**
 * Created by localadmin on 5/19/16.
 */
public class XPLinkedListTest {

    @Test
    public void newListIsEmpty(){
        final XPLinkedList xpLinkedList = new XPLinkedList();
        assertThat(xpLinkedList.hasHead(), is(false));
    }

}