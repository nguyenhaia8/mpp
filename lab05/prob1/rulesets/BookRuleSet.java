package lab05.prob1.rulesets;

import lab05.prob1.gui.BookWindow;

import java.awt.Component;

//import lesson5.labsolns.prob1.gui.*;


/**
 * Rules:
 * 1. All fields must be nonempty
 * 2. Isbn must be numeric and consist of either 10 or 13 characters
 * 3. If Isbn has length 10, the first digit must be 0 or 1
 * 4. If Isbn has length 13, the first 3 digits must be either 978 or 979
 * 5. Price must be a floating point number with two decimal places 
 * 6. Price must be a number greater than 0.49.
 *
 */
public class BookRuleSet implements RuleSet {

	@Override
	public void applyRules(Component ob) throws RuleException {
		// TODO Auto-generated method stub
		BookWindow bookWindow = (BookWindow) ob;
		String isbn = bookWindow.getIsbnValue();
		String title = bookWindow.getTitleValue();
		String price = bookWindow.getPriceValue();

		// Rule A
		if (isEmpty(isbn) || isEmpty(title) || isEmpty(price)) {
			throw new RuleException("All fields must be nonempty");
		}

		// Rule B
		if(!isbn.matches("\\d+")) {
			throw new RuleException("ISBN must be numeric");
		}
		if(!(isbn.length() == 10 || isbn.length() == 13)) {
			throw new RuleException("ISBN must be 10 or 13 digits long");
		}

		// Rule C
		if(isbn.length() == 10 && !(isbn.startsWith("0") || isbn.startsWith("1"))) {
			throw new RuleException("ISBN of length 10 must start with 0 or 1");
		}

		// Rule D
		if(isbn.length() == 13 && !(isbn.startsWith("978") || isbn.startsWith("979"))) {
			throw new RuleException("ISBN of length 13 must start with 978 or 979");
		}

		// Rule E
		if(!price.matches("\\d+\\.\\d{2}")) {
			throw new RuleException("Price must have two decimal places");
		}

		// Rule F
		double priceVal = Double.parseDouble(price);
		if(priceVal <= 0.49) {
			throw new RuleException("Price must be greater than 0.49");
		}
	}

	private boolean isEmpty(String s) {
		return s == null || s.trim().isEmpty();
	}
}
