package jenkins.plugins.slack.decisions;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class NotificationConditionsTest {

    @Test
    public void shouldMatchIfAnyConditionMatches() {
        NotificationConditions conditions = new NotificationConditions(Arrays.asList(
                p -> false,
                p -> false,
                p -> true
        ));

        boolean actual = conditions.test(null);

        assertTrue(actual);
    }
}
