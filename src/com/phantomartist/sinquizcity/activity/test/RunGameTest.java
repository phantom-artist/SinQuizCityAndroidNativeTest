package com.phantomartist.sinquizcity.activity.test;

import java.util.ArrayList;

import android.content.Context;
import android.test.ActivityInstrumentationTestCase2;

import com.phantomartist.sinquizcity.R;
import com.phantomartist.sinquizcity.activities.GameDisplay;
import com.phantomartist.sinquizcity.game.Bar;
import com.phantomartist.sinquizcity.game.QuestionAndAnswers;
import com.phantomartist.sinquizcity.util.Bars;
import com.phantomartist.sinquizcity.util.Questions;

/**
 *
 */
public class RunGameTest extends ActivityInstrumentationTestCase2<GameDisplay> {

	public RunGameTest() {
		super(GameDisplay.class);
	}
	
	@Override
	public void setUp() throws Exception {
		super.setUp();
	}
	
	/**
	 * Test the XML parsing works as expected
	 */
	public void testXMLParser() {
		
		try {
			Context context = getActivity();
			Questions parser = Questions.getInstance();
			ArrayList<QuestionAndAnswers> list = parser.getShuffledQuestions();
			
			assertTrue(list != null && list.size() == 100);
			
			Bars bars = Bars.getInstance();
			ArrayList<Bar> barList = bars.getBars();
			
			assertTrue(barList != null && barList.size() == 20);
			
		} catch (Exception e) {
			fail(e.toString());
		}
	}
}
