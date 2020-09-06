package com.philips.util;

import com.philips.beans.ColorPair;
import com.philips.constants.MajorColor;
import com.philips.constants.MinorColor;
import com.philips.service.ColorService;

public class ColorUtil {
	 public final static String MajorColorNames[] = {
		        "White", "Red", "Black", "Yellow", "Violet"
		    };
		    public final static int numberOfMajorColors = MajorColorNames.length;
		    public final static String MinorColorNames[] = {
		        "Blue", "Orange", "Green", "Brown", "Slate"
		    };
		    public final static int numberOfMinorColors = MinorColorNames.length;
		    
		    public static void testNumberToPair(int pairNumber,
		        	MajorColor expectedMajor,
		            MinorColor expectedMinor)
		        {
		            ColorPair colorPair =ColorService.GetColorFromPairNumber(pairNumber);
		            System.out.println("Got pair " + colorPair.ToString());
		            assert(colorPair.getMajor() == expectedMajor);
		            assert(colorPair.getMinor() == expectedMinor);
		        }

		    public static void testPairToNumber(
		            MajorColor major,
		            MinorColor minor,
		            int expectedPairNumber)
		        {
		            int pairNumber = ColorService.GetPairNumberFromColor(major, minor);
		            System.out.println("Got pair number " + pairNumber);
		            assert(pairNumber == expectedPairNumber);
		        }

}

