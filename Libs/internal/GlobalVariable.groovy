package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object TIKI_RAW_URL
     
    /**
     * <p></p>
     */
    public static Object AMAZON_RAW_URL
     
    /**
     * <p></p>
     */
    public static Object TIKI_CATEGORY_DEVIDE_URL
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters())
    
            TIKI_RAW_URL = selectedVariables['TIKI_RAW_URL']
            AMAZON_RAW_URL = selectedVariables['AMAZON_RAW_URL']
            TIKI_CATEGORY_DEVIDE_URL = selectedVariables['TIKI_CATEGORY_DEVIDE_URL']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
