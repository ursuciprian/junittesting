package com.junit.testing.proteinetracker;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        HelloJunitTest.class,
        TrackingServiceTest.class
})

public class ProteinTrackerSuite {
}
