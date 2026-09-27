package be.vives.ti;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringProcessorTest {
    @Test
    public void withSuffixSoNothing() {
        StringProcessor stringProcessor = new StringProcessor();
        String result = stringProcessor.appendIfMissing("hello world", "world");
        assertEquals("hello world", result);
    }

    @Test
    public void addSuffix() {
        StringProcessor stringProcessor = new StringProcessor();
        String result = stringProcessor.appendIfMissing("hello world", "world");
        assertEquals("hello world", result);
    }

}