package com.philips.beans;

import com.philips.constants.*;
import com.philips.util.ColorUtil;
public class ColorPair {
    private MajorColor majorColor;
    private MinorColor minorColor;
    
    public ColorPair(MajorColor major, MinorColor minor)
    {
        majorColor = major;
        minorColor = minor;
    }
    public MajorColor getMajor() {
        return majorColor;
    }
    public MinorColor getMinor() {
        return minorColor;
    }
    public String ToString() {
        String colorPairStr = ColorUtil.MajorColorNames[majorColor.getIndex()];
        colorPairStr += " ";
        colorPairStr += ColorUtil.MinorColorNames[minorColor.getIndex()];
        return colorPairStr;
    }

}
