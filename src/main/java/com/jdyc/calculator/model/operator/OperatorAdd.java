/**
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.jdyc.calculator.model.operator;

import com.jdyc.calculator.main.Constants;
import com.jdyc.calculator.model.CalculatorModel;

public class OperatorAdd extends BinaryOperator {

	public OperatorAdd() {
		super(Constants.ADD);
	}

	@Override
	public void execute(CalculatorModel model) {
		String display = String.valueOf(model.getBuffer()
				+ Double.parseDouble(model.getDisplay()));
		model.setDisplay(display);
		model.setInitDisplay(true);
	}

}
