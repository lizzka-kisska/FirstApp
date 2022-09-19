import Human.Human;
import Human.EnglishSpeakingHuman;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS;

@TestInstance(value = PER_CLASS)
public class HumanTests {

    static ArrayList<Integer> elements = new ArrayList<>();

    @BeforeAll
    public void init()
    {
        elements.add(3);
        System.out.println("Before All");
    }

    @BeforeEach
    public void addDefaultElements()
    {
        System.out.println("Before Test");
        elements.addAll(List.of(5, 10));
    }

    @Test
    public void testHuman() {
        Human human = new EnglishSpeakingHuman();
        assertEquals("Hello!", human.sayHello());
    }

    @Test
    public void testDefaults() {
        assertEquals(elements.size(), 2);
        assertIterableEquals(elements, List.of(5, 10));
    }

    @Test
    public void testUnusualCase() {
        elements.add(75);
        assertEquals(elements.size(), 3);
        assertIterableEquals(elements, List.of(5, 10, 75));
    }

    @AfterEach
    public void clearElements()
    {
        System.out.println("After Test");
        elements.clear();
    }

    @AfterAll
    public void afterAll()
    {
        System.out.println(elements.size() > 0 ? elements.toString() : "[]");
        System.out.println("After All");
    }
}
