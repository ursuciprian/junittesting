package com.junit.testing.proteinetracker;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith (Categories.class)
@Categories.IncludeCategory(value = GoodTestsCategory.class)
@Categories.ExcludeCategory(value = BadTestsCategory.class)
@Suite.SuiteClasses({
        HelloJunitTest.class,
        TrackingServiceTest.class
})

public class GoodTestSuite {
}
