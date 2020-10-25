package com.example.gamegoroda.UITests;

import com.example.gamegoroda.UITests.Pages.PageGames;
import com.example.gamegoroda.UITests.Pages.PageNewGameCities;
import com.example.gamegoroda.UITests.Pages.PageNewGameCountries;
import com.example.gamegoroda.UITests.Pages.PageNewGameNames;
import com.example.gamegoroda.UITests.Pages.PageStart;
import com.example.gamegoroda.UITests.Pages.PageWinLoss;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({PageStart.class, PageGames.class, PageNewGameCities.class, PageWinLoss.class,
        PageNewGameCountries.class, PageNewGameNames.class})
public class RunAllTests {

}
