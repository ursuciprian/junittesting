package com.junit.testing.proteinetracker;

import org.junit.*;
import org.junit.experimental.categories.Category;
import static org.junit.Assert.assertEquals;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.*;


public class TrackingServiceTest {
    private TrackingService service;

    @BeforeClass

    public static void before() {

        System.out.println ("before class");
    }


    @AfterClass
    public static void after() {

        System.out.println ("After Class");

    }

    @Before
    public void setUp() {

        System.out.println ("Before |");
        service = new TrackingService ();
    }

    @After
    public void tearDown() {

        System.out.println ("After");
    }

    @Test
    public void NewTrackingServiceTotalIsZero() {

//        TrackingService service = new TrackingService ();
        assertEquals ("Tracking Service total was not zero", 0, service.getTotal ());

    }

    @Test
    @Category(GoodTestsCategory.class)
    public void WhenAddingProteinTotalIncreasesByThatAmount() {

//        TrackingService service = new TrackingService ();
        service.addProtein (10);
        assertEquals ("Protein amount was not correct", 10, service.getTotal ());
        assertThat (service.getTotal (), is (10));
        assertThat (service.getTotal (),allOf(is(10),instanceOf (Integer.class)));
    }

    @Test
    @Category(GoodTestsCategory.class)
    public void WhenRemovingProteinTotalRemainsZero() {

        service.removeProtein (5);
        assertEquals (0, service.getTotal ());

    }

    @Test(expected = InvalidGoalException.class)
    public void WhenGoladIsSetToLessThanZeroExceptionIsThrown() throws InvalidGoalException {

        service.setGoal (-5);

    }

    @Test(timeout = 100)

    public void BadTest() {

        for (int i = 0; i < 1000000; i++) {

            service.addProtein (11);
        }
    }

}
