package colorcoder;
import com.philips.beans.ColorPair;
import com.philips.constants.MajorColor;
import com.philips.constants.MinorColor;
import com.philips.service.ColorService;
import com.philips.util.ColorUtil;

public class ReferenceManual {
	public static void printReferenceManual()
	{
		int majorLength=ColorUtil.numberOfMajorColors;
		int minorLength=ColorUtil.numberOfMinorColors;
		String referenceManual=new String("");
		for(int majorIndex=0;majorIndex<majorLength;majorIndex++) {
			for(int minorIndex=0;minorIndex<minorLength;minorIndex++)
			{
				int pairNumber=majorIndex * minorLength + minorIndex +1;
				ColorPair colorPair=ColorService.GetColorFromPairNumber(pairNumber);
				referenceManual = referenceManual + pairNumber +" = "+ colorPair.getMajor().toString()
						+ " " + colorPair.getMinor().toString()+ "\n";  
			}
		}
		System.out.println(referenceManual);
	}
}
