package barclays;

public class AshwinProblem {

	public static void main(String[] args) {
		String input = "ASHWIN SUFYAN ";
		//rule.replaceA
		String rule="( ( ASHWIN ) AND SUFYAN AND NOT ( SACHIN ) )";
		rule = rule.replaceAll(" AND ", " && ");
		rule = rule.replaceAll(" OR ", " || ");
		rule = rule.replaceAll(" NOT ", " ! ");
		/*rule = rule.replaceAll("\\(", "");
		rule = rule.replaceAll("\\)", "");*/
		System.out.println(rule);
		
		String[] brokenRule = rule.split(" ");
		String newRule = "";
		for(String s : brokenRule){
			if(s.equals("&&") || s.equals("||") || s.equals("!") || s.equals("(") || s.equals(")"))
				newRule += s + " ";
			else {
				if(input.indexOf(s) != -1){
					newRule += "true ";
				}else {
					newRule += "false ";
				}
			}
		}
		System.out.println(newRule);
		System.out.println(Boolean.parseBoolean(rule));
	}
	
}
