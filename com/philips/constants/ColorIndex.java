package com.philips.constants;

public interface ColorIndex {
	public int getIndex();
	public static ColorIndex fromIndex(Object[] colors, int index) {
        for(Object obj: colors) {
        	ColorIndex color = (ColorIndex)obj;
            if(color.getIndex() == index) {
                return color;
            }
        }
        return null;
}
}