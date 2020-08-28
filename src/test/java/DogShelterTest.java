import org.junit.*;
import org.junit.rules.ExpectedException;

public class DogShelterTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void assertArithmeticForTotalFoodIsCorrectTest() throws Exception {
        DogShelter testShelter = new DogShelter();

        float results = testShelter.dogFoodCalc(10, 10, 10, 3.0f);
        Assert.assertEquals(717.0f, results, 0.0);
    }

    @Test
    public void assertTotalISCorrectWhenNoDogsEnteredTest() throws Exception {
        DogShelter testShelter = new DogShelter();

        float results = testShelter.dogFoodCalc(0, 0, 0, 0);
        Assert.assertEquals(0, results, 0.0);
    }

    @Test
    public void assertTotalISCorrectWhenVariousDogsEnteredTest() throws Exception {
        DogShelter testShelter = new DogShelter();

        float results = testShelter.dogFoodCalc(3, 12, 9, 2.4f);
        Assert.assertEquals(645.59, results, 0.01);
    }

    @Test
    public void assertTotalISCorrectWhenJustSmallDogsEnteredTest() throws Exception {
        DogShelter testShelter = new DogShelter();

        float results = testShelter.dogFoodCalc(14, 0, 0, 0);
        Assert.assertEquals(168, results, 0.0);
    }

    @Test
    public void assertTotalISCorrectWhenJustMedDogsEnteredTest() throws Exception {
        DogShelter testShelter = new DogShelter();

        float results = testShelter.dogFoodCalc(0, 11, 0, 0);
        Assert.assertEquals(264, results, 0.0);
    }

    @Test
    public void assertTotalISCorrectWhenJustLargeDogsEnteredTest() throws Exception {
        DogShelter testShelter = new DogShelter();

        float results = testShelter.dogFoodCalc(0, 0, 7, 0);
        Assert.assertEquals(252, results, 0.0);
    }


    @Test
    public void assertTotalISCorrectWhenNoRemainingFoodTest() throws Exception {
        DogShelter testShelter = new DogShelter();

        float results = testShelter.dogFoodCalc(3, 12, 9, 0);
        Assert.assertEquals(648, results, 0.1);
    }

    @Test
    public void assertTotalISCorrectWhenRemainingFoodHasTwoDecimalsTest() throws Exception {
        DogShelter testShelter = new DogShelter();

        float results = testShelter.dogFoodCalc(3, 12, 9, 8.03f);
        Assert.assertEquals(639.9, results, 0.1);
    }

    @Test
    public void assertTotalISCorrectWhenRemainingFoodHasThreeDecimalsTest() throws Exception {
        DogShelter testShelter = new DogShelter();

        float results = testShelter.dogFoodCalc(3, 12, 9, 8.034f);
        Assert.assertEquals(639.9, results, 0.1);
    }

    @Test
    public void assertExceptionIsThrownWhenDogsOverThirtyTest() throws Exception {

        DogShelter testShelter = new DogShelter();

        thrown.expect(Exception.class);
        thrown.expectMessage("Dogs exceed expected amount of 30 or less");

        testShelter.dogFoodCalc(40, 10, 10, 10.0f);
    }



}
