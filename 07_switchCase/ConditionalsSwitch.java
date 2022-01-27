public class ConditionalsSwitch {
	
	public static void main(String[] args) {
		
		int dayOfWeek = 4;
		switch (dayOfWeek) {
		case 1: {
			System.out.println("Day One");
			break;
		}
		case 2: {
			System.out.println("Day Two");
			break;
		}
		case 3: {
			System.out.println("Day Three");
			break;
		}
		case 4: {
			System.out.println("Day Four");
			break;
		}
		case 5: {
			System.out.println("Day Five");
			break;
		}
		case 6: {
			System.out.println("Day Six");
			break;
		}
		case 7: {
			System.out.println("Day Seven");
			break;
		}
		default:
			System.out.println("Undefined day");
		}
	}

}
