package com.philips.service;

import com.philips.beans.ColorPair;
import com.philips.constants.MajorColor;
import com.philips.constants.MinorColor;
import com.philips.util.ColorUtil;

public class ColorService {
	public static ColorPair GetColorFromPairNumber(int pairNumber) {
        int zeroBasedPairNumber = pairNumber - 1;
        MajorColor majorColor = 
            MajorColor.fromIndex(zeroBasedPairNumber / ColorUtil.numberOfMinorColors);
        MinorColor minorColor =
            MinorColor.fromIndex(zeroBasedPairNumber % ColorUtil.numberOfMinorColors);
        return new ColorPair(majorColor, minorColor);
    }
    public static int GetPairNumberFromColor(MajorColor major, MinorColor minor) {
        return major.getIndex() * ColorUtil.numberOfMinorColors + minor.getIndex() + 1;
    }

}
