public class ServiceTest {
@BeforeClass
public static void beforeAll() {
System.out.println("This method is execute before all the methods in the test case...");
}
@BeforeAll
public static void testBeforeAll() {
System.out.println("This test will be executed at class level before all tests");
}

 @Test
void test1() {
System.out.println("Inside the junit5-Test1");
}
@Test
void test2() {
System.out.println("Inside the junit5-Test2");
}
@BeforeEach
public void testBefore() {
System.out.println("test is execute before each test method..");
}
@AfterEach
public void testAfter() {
System.out.println("test is execute before each test method..");
}
@AfterAll
public static void testAfterAll() {
System.out.println("This test will be executed at class level after all tests");
}@BeforeAll
public static void testBeforeAll() {
System.out.println("This test will be executed at class level before all tests");
}

 @Test
void test1() {
System.out.println("Inside the junit5-Test1");
}
@Test
void test2() {
System.out.println("Inside the junit5-Test2");
}
@BeforeEach
public void testBefore() {
System.out.println("test is execute before each test method..");
}
@AfterEach
public void testAfter() {
System.out.println("test is execute before each test method..");
}
@AfterAll
public static void testAfterAll() {
System.out.println("This test will be executed at class level after all tests");
}