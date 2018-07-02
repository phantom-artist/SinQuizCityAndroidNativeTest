package com.phantomartist.sinquizcity.util.test;

import com.phantomartist.sinquizcity.R;
import com.phantomartist.sinquizcity.util.Icon;

import junit.framework.TestCase;

/**
 * Test the different icons that can appear in the game
 */
public class IconTest extends TestCase {
	
	public void testIcon() {
	
		// Winning
		assertTrue(R.drawable.huh == Icon.getIcon(1, 0));
		assertTrue(R.drawable.huh == Icon.getIcon(4, 0));
		assertTrue(R.drawable.grin == Icon.getIcon(5, 0));
		assertTrue(R.drawable.grin == Icon.getIcon(14, 0));
		assertTrue(R.drawable.want == Icon.getIcon(15, 0));
		assertTrue(R.drawable.want == Icon.getIcon(24, 0));
		assertTrue(R.drawable.serious_business == Icon.getIcon(25, 0));
		assertTrue(R.drawable.serious_business == Icon.getIcon(49, 0));
		assertTrue(R.drawable.on_fire == Icon.getIcon(50, 0));
		assertTrue(R.drawable.on_fire == Icon.getIcon(74, 0));
		assertTrue(R.drawable.arr == Icon.getIcon(75, 0));
		assertTrue(R.drawable.arr == Icon.getIcon(89, 0));
		assertTrue(R.drawable.ninja == Icon.getIcon(90, 0));
		assertTrue(R.drawable.ninja == Icon.getIcon(99, 0));
		assertTrue(R.drawable.evilish == Icon.getIcon(100, 0));
		
		
		// Loosing
		assertTrue(R.drawable.drunk == Icon.getIcon(0, 5));
		assertTrue(R.drawable.xd == Icon.getIcon(0, 10));
		assertTrue(R.drawable.x_x == Icon.getIcon(0, 15));
		assertTrue(R.drawable.sick == Icon.getIcon(0, 20));
		assertTrue(R.drawable.zombie == Icon.getIcon(0, 30));
	}
}
