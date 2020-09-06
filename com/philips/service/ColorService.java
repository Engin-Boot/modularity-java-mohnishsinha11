package com.philips.service;

import com.philips.beans.ColorPair;
import com.philips.constants.MajorColor;
import com.philips.constants.MinorColor;
import com.philips.constants.ColorIndex;
import com.philips.util.ColorUtil;

public class ColorService {
	public static ColorPair GetColorFromPairNumber(int pairNumber) {
        int zeroBasedPairNumber = pairNumber - 1;
        MajorColor majorColor = 
            (MajorColor) ColorIndex.fromIndex(MajorColor.values(),zeroBasedPairNumber / ColorUtil.numberOfMinorColors);
        MinorColor minorColor =
            (MinorColor) ColorIndex.fromIndex(MinorColor.values(),zeroBasedPairNumber % ColorUtil.numberOfMinorColors);
        return new ColorPair(majorColor, minorColor);
    }
    public static int GetPairNumberFromColor(MajorColor major, MinorColor minor) {
        return major.getIndex() * ColorUtil.numberOfMinorColors + minor.getIndex() + 1;
    }
    
}
