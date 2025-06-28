package lab05.prob1.rulesets;

import lab05.prob1.gui.CDWindow;

import java.awt.Component;

/**
 * Rules:
 *  1. All fields must be nonempty 
 *  2. Price must be a floating point number with two decimal places 
 *  3. Price must be a number greater than 0.49. 
 */

public class CDRuleSet implements RuleSet {

	@Override
	public void applyRules(Component ob) throws RuleException {
		// TODO Auto-generated method stub
		CDWindow cdWin = (CDWindow) ob;
		String artist = cdWin.getArtistValue();
		String title = cdWin.getTitleValue();
		String price = cdWin.getPriceValue();

		// Rule A
		if(isEmpty(artist) || isEmpty(title) || isEmpty(price)) {
			throw new RuleException("All fields must be nonempty");
		}

		// Rule B
		if(!price.matches("\\d+\\.\\d{2}")) {
			throw new RuleException("Price must have two decimal places");
		}

		// Rule C
		double priceVal = Double.parseDouble(price);
		if(priceVal <= 0.49) {
			throw new RuleException("Price must be greater than 0.49");
		}
	}

	private boolean isEmpty(String s) {
		return s == null || s.trim().isEmpty();
	}
	
}
