/**
 * Copyright (c) 2017 committers of YAKINDU and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * 	Andreas Muelder - Itemis AG - initial API and implementation
 * 	Karsten Thoms   - Itemis AG - initial API and implementation
 * 	Florian Antony  - Itemis AG - initial API and implementation
 * 	committers of YAKINDU 
 * 
 */
package com.yakindu.solidity.validation;

/**
 * 
 * @author Karsten Thoms - Initial contribution and API
 * @author Florian Antony
 */
public interface IssueCodes {
	String WARNING_FUNCTION_VISIBILITY = "WARNING_FUNCTION_VISIBILITY";
	String WARNING_FILE_NO_PRAGMA_SOLIDITY = "WARNING_FILE_NO_PRAGMA_SOLIDITY";
	String WARNING_DEPRECATED_SUICIDE = "WARNING_DEPRECATED_SUICIDE";
	String WARNING_VARIABLE_STORAGE_POINTER = "WARNING_VARIABLE_STORAGE_POINTER";
	String WARNING_FUNCTION_UNUSED_PARAMETER = "WARNING_FUNCTION_UNUSED_PARAMETER";
	String WARNING_LOCAL_VARIABLE_UNUSED = "WARNING_LOCAL_VARIABLE_UNUSED";
	String WARNING_MSG_VALUE_IN_NON_PAYABLE = "WARNING_MSG_VALUE_IN_NON_PAYABLE";
	String WARNING_DEPRECATED_THROW = "WARNING_DEPRECATED_THROW";
	String WARNING_DEPRECATED_CALLCODE = "WARNING_DEPRECATED_CALLCODE";
	String WARNING_DEPRECATED_SHA3 = "WARNING_DEPRECATED_SHA3";
	String WARNING_DEPRECATED_NAMED_FUNCTION_RETURN_VALUES = "WARNING_DEPRECATED_NAMED_FUNCTION_RETURN_VALUES";
	String WARNING_USSAGE_OF_SEND = "WARNING_USSAGE_OF_SEND";
	String WARNING_FUNCTION_STATE_MUTABILITY_VIEW = "WARNING_FUNCTION_STATE_MUTABILITY_VIEW";
	String WARNING_FUNCTION_STATE_MUTABILITY_PURE = "WARNING_FUNCTION_STATE_MUTABILITY_PURE";
}
