public class PracticeProblem {

	public static int min(int num1,int num2,int num3) {
		if (num1 < num2) {
        	if (num1 < num3) {
            	return num1;
        } else {
            return num3;
        }
    } else {
        if (num2 < num3) {
            return num2;
        } else {
            return num3;
        }
    }
}
		
	public static boolean isLeapYear(int year) {
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					return true; 
				} else {
					return false; 
				}
			} else {
				return true;
			}
		} else {
			return false;
		}
	}
	}