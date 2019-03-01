package cs603.hw3;

import org.junit.jupiter.api.extension.ConditionEvaluationResult;
import org.junit.jupiter.api.extension.ExecutionCondition;
import org.junit.jupiter.api.extension.ExtensionContext;

/**
 * It keeps track of every test that is being executed
 * And also enables or every other test.
 */
public class PeriodicEnabling implements ExecutionCondition {
    static int test_iterator=0;

    /**
     * Based on the value of period it checks whether to enable or disable the test.
     * @param extensionContext
     * @return object of type ConditionEvaluationResult
     */
    @Override
    public ConditionEvaluationResult evaluateExecutionCondition(ExtensionContext extensionContext) {

        test_iterator++;
        TempTest tempTest = new TempTest();
        Class<? extends TempTest> m = tempTest.getClass();
        Periodic periodic = m.getAnnotation(Periodic.class);
        System.out.println("Test = "+test_iterator);

        return test_iterator%periodic.period()!=0?
                ConditionEvaluationResult.disabled("Test disabled"):
                ConditionEvaluationResult.enabled("Test enabled");
    }
}